package com.halu.qq.cr.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cr_user")
public class User extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(length=10)
	private Integer id;
	
	@ManyToOne(targetEntity=Family.class)
	@JoinColumn(name="family_id")
	private Family family;
	
	@Column(length=32)
	private String name;
	
	@Column(length=32)
	private String email;
	
	@Column(name="oauth_key",length=32)
	private String oauthKey;
	
	@Column(name="oauth_status",length=1)
	private Boolean oauthStatus;
	
	@Column(length=32)
	private String username;
	
	@Column(length=32)
	private String password;
	
	@Column(length=32)
	private String address;
	
	@Column(length=32)
	private String job;
	
	@Column(length=3)
	private Integer age;
	
	@Column(name="create_time",length=15)
	private Long createTime;
	
	@Column(length=1)
	private Boolean deleted;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Family getFamily() {
		return family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOauthKey() {
		return oauthKey;
	}

	public void setOauthKey(String oauthKey) {
		this.oauthKey = oauthKey;
	}

	public Boolean getOauthStatus() {
		return oauthStatus;
	}

	public void setOauthStatus(Boolean oauthStatus) {
		this.oauthStatus = oauthStatus;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	
	
}
