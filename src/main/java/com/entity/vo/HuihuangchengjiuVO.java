package com.entity.vo;

import com.entity.HuihuangchengjiuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 辉煌成就
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("huihuangchengjiu")
public class HuihuangchengjiuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 成就名称
     */

    @TableField(value = "huihuangchengjiu_name")
    private String huihuangchengjiuName;


    /**
     * 辉煌成就编号
     */

    @TableField(value = "huihuangchengjiu_uuid_number")
    private String huihuangchengjiuUuidNumber;


    /**
     * 成就照片
     */

    @TableField(value = "huihuangchengjiu_photo")
    private String huihuangchengjiuPhoto;


    /**
     * 成就类型
     */

    @TableField(value = "huihuangchengjiu_types")
    private Integer huihuangchengjiuTypes;


    /**
     * 相关文件
     */

    @TableField(value = "huihuangchengjiu_file")
    private String huihuangchengjiuFile;


    /**
     * 成就热度
     */

    @TableField(value = "huihuangchengjiu_clicknum")
    private Integer huihuangchengjiuClicknum;


    /**
     * 辉煌成就详细介绍
     */

    @TableField(value = "huihuangchengjiu_content")
    private String huihuangchengjiuContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "huihuangchengjiu_delete")
    private Integer huihuangchengjiuDelete;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：成就名称
	 */
    public String getHuihuangchengjiuName() {
        return huihuangchengjiuName;
    }


    /**
	 * 获取：成就名称
	 */

    public void setHuihuangchengjiuName(String huihuangchengjiuName) {
        this.huihuangchengjiuName = huihuangchengjiuName;
    }
    /**
	 * 设置：辉煌成就编号
	 */
    public String getHuihuangchengjiuUuidNumber() {
        return huihuangchengjiuUuidNumber;
    }


    /**
	 * 获取：辉煌成就编号
	 */

    public void setHuihuangchengjiuUuidNumber(String huihuangchengjiuUuidNumber) {
        this.huihuangchengjiuUuidNumber = huihuangchengjiuUuidNumber;
    }
    /**
	 * 设置：成就照片
	 */
    public String getHuihuangchengjiuPhoto() {
        return huihuangchengjiuPhoto;
    }


    /**
	 * 获取：成就照片
	 */

    public void setHuihuangchengjiuPhoto(String huihuangchengjiuPhoto) {
        this.huihuangchengjiuPhoto = huihuangchengjiuPhoto;
    }
    /**
	 * 设置：成就类型
	 */
    public Integer getHuihuangchengjiuTypes() {
        return huihuangchengjiuTypes;
    }


    /**
	 * 获取：成就类型
	 */

    public void setHuihuangchengjiuTypes(Integer huihuangchengjiuTypes) {
        this.huihuangchengjiuTypes = huihuangchengjiuTypes;
    }
    /**
	 * 设置：相关文件
	 */
    public String getHuihuangchengjiuFile() {
        return huihuangchengjiuFile;
    }


    /**
	 * 获取：相关文件
	 */

    public void setHuihuangchengjiuFile(String huihuangchengjiuFile) {
        this.huihuangchengjiuFile = huihuangchengjiuFile;
    }
    /**
	 * 设置：成就热度
	 */
    public Integer getHuihuangchengjiuClicknum() {
        return huihuangchengjiuClicknum;
    }


    /**
	 * 获取：成就热度
	 */

    public void setHuihuangchengjiuClicknum(Integer huihuangchengjiuClicknum) {
        this.huihuangchengjiuClicknum = huihuangchengjiuClicknum;
    }
    /**
	 * 设置：辉煌成就详细介绍
	 */
    public String getHuihuangchengjiuContent() {
        return huihuangchengjiuContent;
    }


    /**
	 * 获取：辉煌成就详细介绍
	 */

    public void setHuihuangchengjiuContent(String huihuangchengjiuContent) {
        this.huihuangchengjiuContent = huihuangchengjiuContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getHuihuangchengjiuDelete() {
        return huihuangchengjiuDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setHuihuangchengjiuDelete(Integer huihuangchengjiuDelete) {
        this.huihuangchengjiuDelete = huihuangchengjiuDelete;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
