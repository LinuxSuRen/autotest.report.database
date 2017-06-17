package com.surenpi.autotest.report.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
    private String osInfo;
    private String browserInfo;
    private String addressInfo;
    private String extInfo;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getOsInfo()
    {
        return osInfo;
    }

    public void setOsInfo(String osInfo)
    {
        this.osInfo = osInfo;
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
