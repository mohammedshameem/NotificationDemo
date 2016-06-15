
package com.compay.xm.notificationdemo.holder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ShippingAddress {

    @SerializedName("shippingfullname")
    @Expose
    private String shippingfullname;
    @SerializedName("shippingstreetaddress")
    @Expose
    private String shippingstreetaddress;
    @SerializedName("shippingunit")
    @Expose
    private String shippingunit;
    @SerializedName("shippingcountry")
    @Expose
    private String shippingcountry;
    @SerializedName("shippingstate")
    @Expose
    private String shippingstate;
    @SerializedName("shippingcity")
    @Expose
    private String shippingcity;
    @SerializedName("shippingpostalcode")
    @Expose
    private String shippingpostalcode;
    @SerializedName("shippingphone")
    @Expose
    private String shippingphone;

    /**
     * 
     * @return
     *     The shippingfullname
     */
    public String getShippingfullname() {
        return shippingfullname;
    }

    /**
     * 
     * @param shippingfullname
     *     The shippingfullname
     */
    public void setShippingfullname(String shippingfullname) {
        this.shippingfullname = shippingfullname;
    }

    /**
     * 
     * @return
     *     The shippingstreetaddress
     */
    public String getShippingstreetaddress() {
        return shippingstreetaddress;
    }

    /**
     * 
     * @param shippingstreetaddress
     *     The shippingstreetaddress
     */
    public void setShippingstreetaddress(String shippingstreetaddress) {
        this.shippingstreetaddress = shippingstreetaddress;
    }

    /**
     * 
     * @return
     *     The shippingunit
     */
    public String getShippingunit() {
        return shippingunit;
    }

    /**
     * 
     * @param shippingunit
     *     The shippingunit
     */
    public void setShippingunit(String shippingunit) {
        this.shippingunit = shippingunit;
    }

    /**
     * 
     * @return
     *     The shippingcountry
     */
    public String getShippingcountry() {
        return shippingcountry;
    }

    /**
     * 
     * @param shippingcountry
     *     The shippingcountry
     */
    public void setShippingcountry(String shippingcountry) {
        this.shippingcountry = shippingcountry;
    }

    /**
     * 
     * @return
     *     The shippingstate
     */
    public String getShippingstate() {
        return shippingstate;
    }

    /**
     * 
     * @param shippingstate
     *     The shippingstate
     */
    public void setShippingstate(String shippingstate) {
        this.shippingstate = shippingstate;
    }

    /**
     * 
     * @return
     *     The shippingcity
     */
    public String getShippingcity() {
        return shippingcity;
    }

    /**
     * 
     * @param shippingcity
     *     The shippingcity
     */
    public void setShippingcity(String shippingcity) {
        this.shippingcity = shippingcity;
    }

    /**
     * 
     * @return
     *     The shippingpostalcode
     */
    public String getShippingpostalcode() {
        return shippingpostalcode;
    }

    /**
     * 
     * @param shippingpostalcode
     *     The shippingpostalcode
     */
    public void setShippingpostalcode(String shippingpostalcode) {
        this.shippingpostalcode = shippingpostalcode;
    }

    /**
     * 
     * @return
     *     The shippingphone
     */
    public String getShippingphone() {
        return shippingphone;
    }

    /**
     * 
     * @param shippingphone
     *     The shippingphone
     */
    public void setShippingphone(String shippingphone) {
        this.shippingphone = shippingphone;
    }

}
