package com.halu.qq.cr.persistence.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cr_record")
public class Record extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(length=32)
	private Integer id;
	
	@ManyToOne(targetEntity=User.class)
	@JoinColumn(name="user_id")
	private User user;
	
	@Column(length=10)
	private Integer duration;
	
	@Column(name="duration_unit",length=10)
	private String durationUnit;
	
	@Column(name="once_flag",length=1)
	private Boolean onceFlag;
	
	@Column(length=32)
	private double amount;
	
	@Column(name="consumer_type",length=32)
	private String consumerType;
	
	@Column(name="consumer_site",length=100)
	private String consumerSite;
	
	@Column(name="consumer_time",length=14)
	private Long consumerTime;
	
	@Column(length=255)
	private String remark;
	
	@ManyToMany(targetEntity=Category.class)
	@JoinTable(name="category_record", joinColumns=@JoinColumn(name="record_id"), inverseJoinColumns=@JoinColumn(name="category_id"))
	private Set<Category> categories = new HashSet<>();
	
	@Column(name="reimburse_flag",length=1)
	private Boolean reimburseFlag;
	
	@Column(name="create_time", length=15)
	private Long createTime;
	
	@Column(length=1)
	private Boolean deleted;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getDurationUnit() {
		return durationUnit;
	}

	public void setDurationUnit(String durationUnit) {
		this.durationUnit = durationUnit;
	}

	public Boolean getOnceFlag() {
		return onceFlag;
	}

	public void setOnceFlag(Boolean onceFlag) {
		this.onceFlag = onceFlag;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getConsumerType() {
		return consumerType;
	}

	public void setConsumerType(String consumerType) {
		this.consumerType = consumerType;
	}

	public String getConsumerSite() {
		return consumerSite;
	}

	public void setConsumerSite(String consumerSite) {
		this.consumerSite = consumerSite;
	}

	public Long getConsumerTime() {
		return consumerTime;
	}

	public void setConsumerTime(Long consumerTime) {
		this.consumerTime = consumerTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	public Boolean getReimburseFlag() {
		return reimburseFlag;
	}

	public void setReimburseFlag(Boolean reimburseFlag) {
		this.reimburseFlag = reimburseFlag;
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
