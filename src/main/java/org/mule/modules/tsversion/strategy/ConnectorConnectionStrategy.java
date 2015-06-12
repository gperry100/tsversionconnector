/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under the terms of the CPAL v1.0 license,
 * a copy of which has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.tsversion.strategy;

import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;

import com.sky.tsversion.client.TsVersionClient;


/**
 * Configuration type Strategy
 *
 * @author MuleSoft, Inc.
 */
@Configuration(configElementName = "config-type", friendlyName = "Configuration type strategy")
public class ConnectorConnectionStrategy {

	/**
     * Configurable
     */
    
    @Configurable
    private String address;
    
    @Configurable
    @Optional
    private TsVersionClient tsVersionClient;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		
		this.address = address;
	}

	public TsVersionClient getTsVersionClient() {
		return tsVersionClient;
	}

	public void setTsVersionClient(TsVersionClient tsVersionClient) {
		this.tsVersionClient = tsVersionClient;
	}



}