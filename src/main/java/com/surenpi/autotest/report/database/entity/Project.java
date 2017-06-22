package com.surenpi.autotest.report.database.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * @author suren
 */
@Entity
public class Project
{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String id;
    private String name;
    private String description;
    private String osName;
    private String osArch;
    private String osVersion;
    private String country;
    private String language;
    private String timezone;
    private String browserInfo;
    private String addressInfo;
    @Lob
    private String extInfo;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsArch() {
        return osArch;
    }

    public void setOsArch(String osArch) {
        this.osArch = osArch;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getBrowserInfo()
    {
        return browserInfo;
    }

    public void setBrowserInfo(String browserInfo)
    {
        this.browserInfo = browserInfo;
    }

    public String getAddressInfo()
    {
        return addressInfo;
    }

    public void setAddressInfo(String addressInfo)
    {
        this.addressInfo = addressInfo;
    }

    public String getExtInfo()
    {
        return extInfo;
    }

    public void setExtInfo(String extInfo)
    {
        this.extInfo = extInfo;
    }
}
