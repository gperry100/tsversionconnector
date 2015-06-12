/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under the terms of the CPAL v1.0 license,
 * a copy of which has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.tsversion;

import org.mule.api.annotations.ConnectionStrategy;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Configurable;

import org.mule.api.annotations.display.FriendlyName;
import org.mule.api.annotations.display.Placement;
import org.mule.api.annotations.lifecycle.Start;
import org.mule.api.annotations.MetaDataScope;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.param.Default;
import org.mule.modules.tsversion.strategy.ConnectorConnectionStrategy;

import traffic.wcf.bss.com.bskyb.tsversion.ITSVersionGetBusinessExceptionFaultFaultMessage;

import com.sky.tsversion.client.TsVersionClientImpl;
import com.sky.tsversion.client.TsVersionSimpleGetResponse;

/**
 * Anypoint Connector
 *
 * @author MuleSoft, Inc.
 */
@Connector(name="ts-version", friendlyName="TSVersion")
@MetaDataScope( DataSenseResolver.class )
public class TSVersionConnector {
    
  

    @ConnectionStrategy
    ConnectorConnectionStrategy connectionStrategy;
    
    @Start
    public void initialize(){
    	if(connectionStrategy.getTsVersionClient() == null){
    		connectionStrategy.setTsVersionClient(new TsVersionClientImpl(connectionStrategy.getAddress()));
    	} else {
    		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>> CLIENT ALREADT CREATED");

    	}
    }


    
    /**
    * Custom processor
    *
    * {@sample.xml ../../../doc/ts-version-connector.xml.sample ts-version:getVersion}
    *
    * @param versionId BSS Version ID to sue
    * @return Simple version response POJO
    */
    @Processor(friendlyName = "Get BSS Version Information")
	public TsVersionSimpleGetResponse getVersion(
			@Placement(group = "Parameters") @FriendlyName("The BSS version ID") Integer versionId) {
		try {

			return getConnectionStrategy().getTsVersionClient().get(versionId);
			
		} catch ( ITSVersionGetBusinessExceptionFaultFaultMessage e) {
			e.printStackTrace();
		} 
		return null;
	}



    public ConnectorConnectionStrategy getConnectionStrategy() {
        return connectionStrategy;
    }

    public void setConnectionStrategy(ConnectorConnectionStrategy connectionStrategy) {
        this.connectionStrategy = connectionStrategy;
    }

}