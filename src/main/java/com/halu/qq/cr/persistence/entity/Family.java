package com.halu.qq.cr.persistence.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cr_family")
public class Family extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(length=32)
	private Integer id;
	
	@Column(length=32)
	private String name;
	
	@Column(name="max_user_num",length=3)
	private Integer maxUserNum;
	
	@Column(name="create_time", length=15)
	private Long createTime;
	
	@Column(length=1)
	private Boolean deleted;
	
	@OneToMany(targetEntity=User.class)
	@JoinColumn(name="family_id")
	private Set<User> users = new HashSet<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMaxUserNum() {
		return maxUserNum;
	}

	public void setMaxUserNum(Integer maxUserNum) {
		this.maxUserNum = maxUserNum;
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

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
}
