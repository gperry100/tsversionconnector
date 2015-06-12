package com.sky.tsversion.client;

import traffic.wcf.bss.com.bskyb.tsversion.ITSVersionGetBusinessExceptionFaultFaultMessage;



public interface TsVersionClient {
	
	TsVersionSimpleGetResponse get(Integer versionId) throws ITSVersionGetBusinessExceptionFaultFaultMessage;
	
	TsVersionSimpleGetResponse get(Integer versionId, Integer purchaseId);

}
