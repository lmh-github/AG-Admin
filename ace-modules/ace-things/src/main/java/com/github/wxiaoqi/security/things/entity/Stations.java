package com.github.wxiaoqi.security.things.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author Mr.LWT
 * @email 463540703@qq.com
 * @date 2019-05-05 13:52:59
 */
@Table(name = "stations")
public class Stations implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //子站(公厕)id
    @Id
    private Long id;
	
	    //对应数据规则id
    @Column(name = "data_rule_id")
    private Long dataRuleId;
	
	    //sim号
    @Column(name = "sim")
    private String sim;
	
	    //是否公开(1公开 0不公开)
    @Column(name = "is_public")
    private Integer isPublic;
	
	    //所在地址
    @Column(name = "area_info")
    private String areaInfo;
	
	    //sn码
    @Column(name = "code_sn")
    private String codeSn;
	
	    //公厕名称
    @Column(name = "totil_name")
    private String totilName;
	
	    //公厕编号
    @Column(name = "totil_id")
    private String totilId;
	
	    //区域位置id
    @Column(name = "area_id")
    private Long areaId;
	
	    //便器数量
    @Column(name = "totil_nums")
    private Integer totilNums;
	
	    //泵站数量
    @Column(name = "bump_nums")
    private Integer bumpNums;
	
	    //所属客户id
    @Column(name = "customer_id")
    private Long customerId;
	
	    //备注
    @Column(name = "remark")
    private String remark;
	
	    //创建时间
    @Column(name = "create_time")
    private Date createTime;
	
	    //创建人id
    @Column(name = "create_man")
    private Long createMan;
	
	    //照片地址
    @Column(name = "totil_pic")
    private String totilPic;
	
	    //公厕类型编号
    @Column(name = "totil_type_id")
    private Long totilTypeId;
	
	    //公厕状态
    @Column(name = "totil_state")
    private Integer totilState;
	
	    //联系人姓名
    @Column(name = "rel_name")
    private String relName;
	
	    //联系人电话
    @Column(name = "rel_phone")
    private String relPhone;
	
	    //联系人邮箱
    @Column(name = "rel_email")
    private String relEmail;
	
	    //经度
    @Column(name = "lng")
    private Double lng;
	
	    //维度
    @Column(name = "lat")
    private Double lat;
	

	/**
	 * 设置：子站(公厕)id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：子站(公厕)id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：对应数据规则id
	 */
	public void setDataRuleId(Long dataRuleId) {
		this.dataRuleId = dataRuleId;
	}
	/**
	 * 获取：对应数据规则id
	 */
	public Long getDataRuleId() {
		return dataRuleId;
	}
	/**
	 * 设置：sim号
	 */
	public void setSim(String sim) {
		this.sim = sim;
	}
	/**
	 * 获取：sim号
	 */
	public String getSim() {
		return sim;
	}
	/**
	 * 设置：是否公开(1公开 0不公开)
	 */
	public void setIsPublic(Integer isPublic) {
		this.isPublic = isPublic;
	}
	/**
	 * 获取：是否公开(1公开 0不公开)
	 */
	public Integer getIsPublic() {
		return isPublic;
	}
	/**
	 * 设置：所在地址
	 */
	public void setAreaInfo(String areaInfo) {
		this.areaInfo = areaInfo;
	}
	/**
	 * 获取：所在地址
	 */
	public String getAreaInfo() {
		return areaInfo;
	}
	/**
	 * 设置：sn码
	 */
	public void setCodeSn(String codeSn) {
		this.codeSn = codeSn;
	}
	/**
	 * 获取：sn码
	 */
	public String getCodeSn() {
		return codeSn;
	}
	/**
	 * 设置：公厕名称
	 */
	public void setTotilName(String totilName) {
		this.totilName = totilName;
	}
	/**
	 * 获取：公厕名称
	 */
	public String getTotilName() {
		return totilName;
	}
	/**
	 * 设置：公厕编号
	 */
	public void setTotilId(String totilId) {
		this.totilId = totilId;
	}
	/**
	 * 获取：公厕编号
	 */
	public String getTotilId() {
		return totilId;
	}
	/**
	 * 设置：区域位置id
	 */
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	/**
	 * 获取：区域位置id
	 */
	public Long getAreaId() {
		return areaId;
	}
	/**
	 * 设置：便器数量
	 */
	public void setTotilNums(Integer totilNums) {
		this.totilNums = totilNums;
	}
	/**
	 * 获取：便器数量
	 */
	public Integer getTotilNums() {
		return totilNums;
	}
	/**
	 * 设置：泵站数量
	 */
	public void setBumpNums(Integer bumpNums) {
		this.bumpNums = bumpNums;
	}
	/**
	 * 获取：泵站数量
	 */
	public Integer getBumpNums() {
		return bumpNums;
	}
	/**
	 * 设置：所属客户id
	 */
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	/**
	 * 获取：所属客户id
	 */
	public Long getCustomerId() {
		return customerId;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：创建人id
	 */
	public void setCreateMan(Long createMan) {
		this.createMan = createMan;
	}
	/**
	 * 获取：创建人id
	 */
	public Long getCreateMan() {
		return createMan;
	}
	/**
	 * 设置：照片地址
	 */
	public void setTotilPic(String totilPic) {
		this.totilPic = totilPic;
	}
	/**
	 * 获取：照片地址
	 */
	public String getTotilPic() {
		return totilPic;
	}
	/**
	 * 设置：公厕类型编号
	 */
	public void setTotilTypeId(Long totilTypeId) {
		this.totilTypeId = totilTypeId;
	}
	/**
	 * 获取：公厕类型编号
	 */
	public Long getTotilTypeId() {
		return totilTypeId;
	}
	/**
	 * 设置：公厕状态
	 */
	public void setTotilState(Integer totilState) {
		this.totilState = totilState;
	}
	/**
	 * 获取：公厕状态
	 */
	public Integer getTotilState() {
		return totilState;
	}
	/**
	 * 设置：联系人姓名
	 */
	public void setRelName(String relName) {
		this.relName = relName;
	}
	/**
	 * 获取：联系人姓名
	 */
	public String getRelName() {
		return relName;
	}
	/**
	 * 设置：联系人电话
	 */
	public void setRelPhone(String relPhone) {
		this.relPhone = relPhone;
	}
	/**
	 * 获取：联系人电话
	 */
	public String getRelPhone() {
		return relPhone;
	}
	/**
	 * 设置：联系人邮箱
	 */
	public void setRelEmail(String relEmail) {
		this.relEmail = relEmail;
	}
	/**
	 * 获取：联系人邮箱
	 */
	public String getRelEmail() {
		return relEmail;
	}
	/**
	 * 设置：经度
	 */
	public void setLng(Double lng) {
		this.lng = lng;
	}
	/**
	 * 获取：经度
	 */
	public Double getLng() {
		return lng;
	}
	/**
	 * 设置：维度
	 */
	public void setLat(Double lat) {
		this.lat = lat;
	}
	/**
	 * 获取：维度
	 */
	public Double getLat() {
		return lat;
	}
}
