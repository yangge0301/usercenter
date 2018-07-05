package com.bean.pagebean;

public class ListContentBean {

	public static String J_RIGHT_LABEL=">";
	//DIV���
	public static String DIV_LEFT_LABEL="<div";
	public static String DIV_RIGHT_LABEL="</div>";
	public static String DL_LEFT_LABEL="<dl";
	public static String DL_RIGHT_LABEL="</dl>";
	public static String DT_LEFT_LABEL="<dt";
	public static String DT_RIGHT_LABEL="</dt>";
	public static String DD_LEFT_LABEL="<dd";
	public static String DD_RIGHT_LABEL="</dd>";
	
	public static String A_LEFT_LABEL="<a href='javascript:void(0)' ";
	public static String A_RIGHT_LABEL="</a>";
	public static String SPAN_LEFT_LABEL="<span";
	public static String SPAN_RIGHT_LABEL="</span>";
	public static String UL_LEFT_LABEL="<ul";
	public static String ul_RIGHT_label="</ul>";
	public static String LI_left_label="<li";
	public static String LI_RIGHT_label="</li>";
	public static String IMAGE_LEFT_LABEL="<img";
	public static String IMAGE_RIGHT_LABEL="</img>";
	public static String TEXT_LEFT_LABEL="<text";
	public static String TEXT_RIGHT_LABEL="</text>";
	public static String INPUT_LEFT_LABEL="<input";
	public static String INPUT_RIGHT_LABEL="</input>";


	
	public static String getContent(String leftLabel,String css,String con,String rightLabel){
		String content="";
		content=leftLabel+css+J_RIGHT_LABEL+con+rightLabel;
		return content;
	}
	
	@Override
	public String toString() {
		return "ListContentBean [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
