package com.shilei.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lei
 * @since 2021-03-13
 */
public class BaseDict implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 数据字典id(主键)
     */
    @TableId(value = "dict_id", type = IdType.AUTO)
    private String dictId;

    /**
     * 数据字典类别代码
     */
    private String dictTypeCode;

    /**
     * 数据字典类别名称
     */
    private String dictTypeName;

    /**
     * 数据字典项目名称
     */
    private String dictItemName;

    /**
     * 数据字典项目代码(可为空)
     */
    private String dictItemCode;

    /**
     * 排序字段
     */
    private Integer dictSort;

    /**
     * 1:使用 0:停用
     */
    private String dictEnable;

    /**
     * 备注
     */
    private String dictMemo;


    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    public String getDictTypeCode() {
        return dictTypeCode;
    }

    public void setDictTypeCode(String dictTypeCode) {
        this.dictTypeCode = dictTypeCode;
    }

    public String getDictTypeName() {
        return dictTypeName;
    }

    public void setDictTypeName(String dictTypeName) {
        this.dictTypeName = dictTypeName;
    }

    public String getDictItemName() {
        return dictItemName;
    }

    public void setDictItemName(String dictItemName) {
        this.dictItemName = dictItemName;
    }

    public String getDictItemCode() {
        return dictItemCode;
    }

    public void setDictItemCode(String dictItemCode) {
        this.dictItemCode = dictItemCode;
    }

    public Integer getDictSort() {
        return dictSort;
    }

    public void setDictSort(Integer dictSort) {
        this.dictSort = dictSort;
    }

    public String getDictEnable() {
        return dictEnable;
    }

    public void setDictEnable(String dictEnable) {
        this.dictEnable = dictEnable;
    }

    public String getDictMemo() {
        return dictMemo;
    }

    public void setDictMemo(String dictMemo) {
        this.dictMemo = dictMemo;
    }

    @Override
    public String toString() {
        return "BaseDict{" +
        "dictId=" + dictId +
        ", dictTypeCode=" + dictTypeCode +
        ", dictTypeName=" + dictTypeName +
        ", dictItemName=" + dictItemName +
        ", dictItemCode=" + dictItemCode +
        ", dictSort=" + dictSort +
        ", dictEnable=" + dictEnable +
        ", dictMemo=" + dictMemo +
        "}";
    }
}
