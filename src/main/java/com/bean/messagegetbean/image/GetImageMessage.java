package com.bean.messagegetbean.image;

import com.bean.messagegetbean.BaseGetMessage;

public class GetImageMessage extends BaseGetMessage{
	private String PicUrl;
	private String MediaId;
	public String getPicUrl() {
		return PicUrl;
	}
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	
}
