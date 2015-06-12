package com.sky.tsversion.client;

import javax.xml.bind.JAXBElement;
import javax.xml.ws.BindingProvider;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import traffic.wcf.bss.com.bskyb.tsversion.GetResponse;
import traffic.wcf.bss.com.bskyb.tsversion.ITSVersionGetBusinessExceptionFaultFaultMessage;
import traffic.wcf.bss.com.bskyb.tsversion.ObjectFactory;
import traffic.wcf.bss.com.bskyb.tsversion.Get;
import traffic.wcf.bss.com.bskyb.tsversion.ITSVersion;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;

public class TsVersionClientImpl implements TsVersionClient {

	private static final Logger logger = LoggerFactory.getLogger(TsVersionClientImpl.class);
	private ITSVersion port;
	ObjectFactory factory;
	
	
	public TsVersionClientImpl(final String address){
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
    	factory.setServiceClass(ITSVersion.class);
    	
    	this.factory = new ObjectFactory();
    	this.port = (ITSVersion) factory.create();
    
    	((BindingProvider) port).getRequestContext().put(
              (BindingProvider.ENDPOINT_ADDRESS_PROPERTY), address);	
	}
	
	@Override
	public TsVersionSimpleGetResponse get(Integer versionId) throws ITSVersionGetBusinessExceptionFaultFaultMessage {
		
		ArrayOfint arrayOfint = new com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory().createArrayOfint();
		arrayOfint.getInt().add(versionId);
		
    	Get get = factory.createGet();	
    	GetResponse response = port.get(get);
    	
    	return TsVersionSimpleGetResponse.fromGetResponse(response);
	}

	@Override
	public TsVersionSimpleGetResponse get(Integer versionId, Integer purchaseId) {
		// TODO Auto-generated method stub
		return null;
	}

}
