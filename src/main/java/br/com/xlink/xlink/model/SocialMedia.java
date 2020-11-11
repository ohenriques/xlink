package br.com.xlink.xlink.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SocialMedia {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	String nameSocialMidia;
	String urlSocialMidia;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameSocialMidia() {
		return nameSocialMidia;
	}

	public void setNameSocialMidia(String nameSocialMidia) {
		this.nameSocialMidia = nameSocialMidia;
	}

	public String getUrlSocialMidia() {
		return urlSocialMidia;
	}

	public void setUrlSocialMidia(String urlSocialMidia) {
		this.urlSocialMidia = urlSocialMidia;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
