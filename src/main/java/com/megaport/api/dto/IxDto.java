package com.megaport.api.dto;

import java.io.Serializable;

/**
 * Created by adam.wells on 27/06/2016.
 */
public class IxDto implements Serializable {

    private IpAddressDto primaryipv6;
    private IpAddressDto secondaryipv6;
    private IpAddressDto primaryipv4;
    private IpAddressDto secondaryipv4;
    private String name;
    private String network_region;
    private String group_metro;
    private String state;
    private Integer asn;

    public String getGroup_metro() {
        return group_metro;
    }

    public void setGroup_metro(String group_metro) {
        this.group_metro = group_metro;
    }

    public IpAddressDto getPrimaryipv6() {
        return primaryipv6;
    }

    public void setPrimaryipv6(IpAddressDto primaryipv6) {
        this.primaryipv6 = primaryipv6;
    }

    public IpAddressDto getSecondaryipv6() {
        return secondaryipv6;
    }

    public void setSecondaryipv6(IpAddressDto secondaryipv6) {
        this.secondaryipv6 = secondaryipv6;
    }

    public IpAddressDto getPrimaryipv4() {
        return primaryipv4;
    }

    public void setPrimaryipv4(IpAddressDto primaryipv4) {
        this.primaryipv4 = primaryipv4;
    }

    public IpAddressDto getSecondaryipv4() {
        return secondaryipv4;
    }

    public void setSecondaryipv4(IpAddressDto secondaryipv4) {
        this.secondaryipv4 = secondaryipv4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNetwork_region() {
        return network_region;
    }

    public void setNetwork_region(String network_region) {
        this.network_region = network_region;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getAsn() {
        return asn;
    }

    public void setAsn(Integer asn) {
        this.asn = asn;
    }
}
