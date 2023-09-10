package dev.haroon.blog.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "comments")
@Getter
@Setter
public class Comment {
	
	public Comment() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer commentId;
	
	@NotNull(message="comment must not be empty")
	@Size(min=3, message="comment cannot be less than 3 characters")
	private String content;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Post post;
	
	@Override
	public String toString() {
		return "Comment[commentId=" + commentId + ", content=" + content + "]";
	}

}
