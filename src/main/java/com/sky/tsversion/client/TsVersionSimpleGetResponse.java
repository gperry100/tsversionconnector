package com.sky.tsversion.client;


import java.util.List;

import traffic.contract.bss.com.bskyb.ArrayOfMaterialReel;
import traffic.contract.bss.com.bskyb.Material;
import traffic.contract.bss.com.bskyb.MaterialReel;
import traffic.wcf.bss.com.bskyb.tsversion.GetResponse;
import traffic.contract.bss.com.bskyb.Version;

public class TsVersionSimpleGetResponse {

	private Integer seriesId;
	private Integer titleId;
	private String mediaId;
	private Integer genreId;
	private Integer subGenreId;
	
	private String qcConclusion;
	private Integer versionSequenceNumber;
	private String versionName;
	
	private String audio;
	private Boolean audioApproved;
	private Boolean audioEmbedded;
	private Boolean audioRequired;
	
	private Boolean captionApproved;
	private Boolean captionEmbedded;
	private Boolean captionRequired;
	
	private Boolean highDefinition;
	private String txStatus;
	private String materialType;
	private String aspectRatio;

	private TsVersionSimpleGetResponse(){
		
	}
	
	
	public static Material findMaterialfromFormat(List<Material> materials){
		
		for(Material m : materials){
			if(TsVersionSimpleGetResponse.findMaterialReelFromFormat(m.getMaterialReel().getValue()) != null){
				return m;
			}
		}
		return null;
		
	}
	public static MaterialReel findMaterialReelFromFormat(ArrayOfMaterialReel materialReels){
		
		for(MaterialReel m : materialReels.getMaterialReel()){
			if(m.getFormat().getValue().equals("MAMF")){
				return m;
			}
		}
		return null;
		
	}
	public static TsVersionSimpleGetResponse fromGetResponse(
			final GetResponse response) {
		TsVersionSimpleGetResponse getResponse = new TsVersionSimpleGetResponse();
		
		if(response.getSeries().getValue().getSeries().size() > 0){
			getResponse.seriesId = response.getSeries().getValue().getSeries().get(0).getSeriesID();
		} 
		getResponse.titleId = response.getTitle().getValue().getTitle().get(0).getTitleID().getValue();
		
		ArrayOfMaterialReel materialReels = response.getMaterial().getValue().getMaterial().get(0).getMaterialReel().getValue();
		getResponse.mediaId = TsVersionSimpleGetResponse.findMaterialReelFromFormat(materialReels).getMediaID().getValue();
		// TODO: Log warning no media ID present
		
		getResponse.genreId = response.getTitle().getValue().getTitle().get(0).getGenreID().getValue();
		getResponse.subGenreId = response.getTitle().getValue().getTitle().get(0).getSubGenreID().getValue();
		
		Version version = response.getVersion().getValue().getVersion().get(0);
		getResponse.qcConclusion = version.getQualityControl().getValue().getQCConclusion().getValue();
		getResponse.versionSequenceNumber = version.getVersionSeqNo().getValue();
		getResponse.aspectRatio = version.getAspectRatio().getValue();
		getResponse.audio = version.getAudio().getValue();
		getResponse.audioApproved = version.getAudioDescription().getValue().getAudioApproved().getValue();
		getResponse.audioEmbedded = version.getAudioDescription().getValue().getAudioEmbedded().getValue();
		getResponse.audioRequired = version.getAudioDescription().getValue().getAudioRequired().getValue();
		getResponse.captionApproved = version.getClosedCaption().getValue().getCaptionApproved().getValue();
		getResponse.captionEmbedded = version.getClosedCaption().getValue().getCaptionEmbedded().getValue();
		getResponse.captionRequired = version.getClosedCaption().getValue().getCaptionRequired().getValue();
		getResponse.highDefinition = version.getHighDefinition().getValue();
		getResponse.txStatus = version.getTXStatus().getValue();
		
		Material material = findMaterialfromFormat(response.getMaterial().getValue().getMaterial());
		if(material == null){
			// TODO: Log warning no material present
		} else {
			getResponse.materialType = material.getType().getValue();
		}
		
		


//		assertEquals("TM", response.getMaterialType());	
		return getResponse;
	}

	public Integer getSeriesId() {
		return seriesId;
	}


	public Integer getTitleId() {
		return titleId;
	}


	public String getMediaId() {
		return mediaId;
	}


	public Integer getGenreId() {
		return genreId;
	}


	public Integer getSubGenreId() {
		return subGenreId;
	}


	public String getQcConclusion() {
		return qcConclusion;
	}


	public Integer getVersionSequenceNumber() {
		return versionSequenceNumber;
	}


	public String getVersionName() {
		return versionName;
	}


	public Boolean getAudioApproved() {
		return audioApproved;
	}


	public Boolean getAudioEmbedded() {
		return audioEmbedded;
	}


	public Boolean getAudioRequired() {
		return audioRequired;
	}


	public Boolean getCaptionApproved() {
		return captionApproved;
	}


	public Boolean getCaptionEmbedded() {
		return captionEmbedded;
	}


	public Boolean getCaptionRequired() {
		return captionRequired;
	}


	public Boolean getHighDefinition() {
		return highDefinition;
	}


	public String getTxStatus() {
		return txStatus;
	}


	public String getMaterialType() {
		return materialType;
	}


	public String getAspectRatio() {
		return aspectRatio;
	}

	public String getAudio() {
		return audio;
	}

}
