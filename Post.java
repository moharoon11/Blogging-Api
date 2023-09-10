package dev.haroon.blog.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

import lombok.Data;

@Entity
@Table(name="post")
@Data
public class Post {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer postId;
	
	@Column(name="post_title", length=100, nullable=false)
	private String title;
	
	private String content;
	
	private String imageName;
	
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;
	
	@ManyToOne
	private User user;
	
	@OneToMany(mappedBy="post", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Comment> comment;
	
	@Override
	public int hashCode() {
	    return Objects.hash(postId); // Use the fields that uniquely identify the category
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Post post = (Post) obj;
	    return Objects.equals(this.postId, post.postId); // Use the fields that uniquely identify the category
	}


}
