package org.wecancodeit.Reviewsitefullstack;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	@ManyToMany(mappedBy = "tags")
	private Collection<Review> reviews;
	
	protected Tag() {}

	public Tag(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}

	
}
