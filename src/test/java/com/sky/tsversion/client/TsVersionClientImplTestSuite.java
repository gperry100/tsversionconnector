package com.sky.tsversion.client;

import static org.junit.Assert.*;

import org.junit.Test;

import traffic.wcf.bss.com.bskyb.tsversion.ITSVersionGetBusinessExceptionFaultFaultMessage;

public class TsVersionClientImplTestSuite {
	
	final String address = "http://localhost:9191/tsversion";
	
	@Test
	public void testGetTsVersionClient(){
		
		TsVersionClientImpl client = new TsVersionClientImpl(address);
		try {
			TsVersionSimpleGetResponse response = client.get(45678);
			
			assertEquals(null, response.getSeriesId());
			assertEquals(893301, response.getTitleId().intValue());
			assertEquals("M0390081", response.getMediaId());
			assertEquals("P", response.getQcConclusion());
			assertEquals(1, response.getVersionSequenceNumber().intValue());
			assertEquals(null, response.getVersionName());
			assertEquals("WZ18", response.getAspectRatio());
			assertEquals(false, response.getAudioApproved());
			assertEquals(false, response.getAudioEmbedded());
			assertEquals(false, response.getAudioRequired());
			
			assertEquals(false, response.getCaptionApproved());
			assertEquals(false, response.getCaptionEmbedded());
			assertEquals(false, response.getCaptionRequired());
			
			assertEquals("S", response.getAudio());

			assertEquals(true, response.getHighDefinition());
			assertEquals("P", response.getTxStatus());
		
			assertEquals(6, response.getGenreId().intValue());
			assertEquals(6, response.getSubGenreId().intValue());
		
			assertEquals("TM", response.getMaterialType());
			

		} catch (ITSVersionGetBusinessExceptionFaultFaultMessage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}




