package com.social.pixogram.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "media")
@SequenceGenerator(name = "seq2", initialValue = 1, allocationSize = 100)
public class Media {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq2")
	private long id;

	@Column(name = "user_id")
	 @NotNull
	private long userId;

	@Column
	 @NotNull
	private String url;

	@Column
	 @NotNull
	private long likeCount;

	@Column
	 @NotNull
	private long unlikeCount;

	@Column
	 @NotNull
	private long commentCount;

	@Column
	 @NotNull
	private String title;

	@Column
	 @NotNull
	private String description;

	@Column
	 @NotNull
	private String tags;

	public Media() {

	}

	public Media(long userId, String url) {
		this.userId = userId;
		this.url = url;
		this.likeCount = 0;
		this.unlikeCount = 0;
		this.commentCount = 0;
		this.title = "Title  of the image";
		this.description = "Decribe about your image";
		this.tags = "Enter your tags";
	}

	public Media(long userId, String url, long likeCount, long unlikeCount, long commentCount) {
		this.userId = userId;
		this.url = url;
		this.likeCount = likeCount;
		this.unlikeCount = unlikeCount;
		this.commentCount = commentCount;
		this.title = "Title  of the image";
		this.description = "Decribe about your image";
		this.tags = "Enter your tags";
	}

	public Media(long userId, String url, String title, String description, String tags) {
		this.userId = userId;
		this.url = url;
		this.likeCount = 0;
		this.unlikeCount = 0;
		this.commentCount = 0;
		this.title = title;
		this.description = description;
		this.tags = tags;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public long getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(long likeCount) {
		this.likeCount = likeCount;
	}

	public long getUnlikeCount() {
		return unlikeCount;
	}

	public void setUnlikeCount(long unlikeCount) {
		this.unlikeCount = unlikeCount;
	}

	public long getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(long commentCount) {
		this.commentCount = commentCount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Media [id=" + id + ", userId=" + userId + ", url=" + url + ", likeCount=" + likeCount + ", unlikeCount="
				+ unlikeCount + ", commentCount=" + commentCount + ", title=" + title + ", description=" + description
				+ ", tags=" + tags + "]";
	}

}
