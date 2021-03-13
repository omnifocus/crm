package com.shilei.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:codeType.properties")
public class CodeTypeBean {
    @Value("${base_dict_fromType}")
    private String base_dict_fromType;
    @Value("${base_dict_industryType}")
    private String base_dict_industryType;
    @Value("${base_dict_levelType}")
    private String base_dict_levelType;


    public String getBase_dict_fromType() {
        return base_dict_fromType;
    }

    public void setBase_dict_fromType(String base_dict_fromType) {
        this.base_dict_fromType = base_dict_fromType;
    }

    public String getBase_dict_industryType() {
        return base_dict_industryType;
    }

    public void setBase_dict_industryType(String base_dict_industryType) {
        this.base_dict_industryType = base_dict_industryType;
    }

    public String getBase_dict_levelType() {
        return base_dict_levelType;
    }

    public void setBase_dict_levelType(String base_dict_levelType) {
        this.base_dict_levelType = base_dict_levelType;
    }
}
