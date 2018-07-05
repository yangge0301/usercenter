package com.bean.messagebean.article;

import com.bean.messagebean.BaseMessage;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.List;

/**
 * 列表文本消息
 */
public class ArticlesMessage extends BaseMessage {
	/**
	 * 图文消息个数，限制为10条以内
	 */
	private int ArticleCount;
	/**
	 * 多条图文消息信息，默认第一个item为大图
	 */
	@XStreamAlias("items")
	private List<Articles> Articles;

	public int getArticleCount() {
		return ArticleCount;
	}

	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}

	public List<Articles> getArticles() {
		return Articles;
	}

	public void setArticles(List<Articles> articles) {
		Articles = articles;
	}


}