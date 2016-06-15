
package com.compay.xm.notificationdemo.holder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class User {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("facebookId")
    @Expose
    private String facebookId;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("telephone")
    @Expose
    private String telephone;
    @SerializedName("addressLine1")
    @Expose
    private String addressLine1;
    @SerializedName("addressLine2")
    @Expose
    private String addressLine2;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("pin")
    @Expose
    private String pin;
    @SerializedName("uniqueDeviceId")
    @Expose
    private String uniqueDeviceId;
    @SerializedName("profilePic")
    @Expose
    private String profilePic;
    @SerializedName("isAdmin")
    @Expose
    private int isAdmin;
    @SerializedName("isDeleted")
    @Expose
    private int isDeleted;
    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("createdDate")
    @Expose
    private String createdDate;
    @SerializedName("cea")
    @Expose
    private String cea;
    @SerializedName("mobilenumber")
    @Expose
    private String mobilenumber;
    @SerializedName("bank")
    @Expose
    private String bank;
    @SerializedName("estateagency")
    @Expose
    private String estateagency;
    @SerializedName("bankaccount")
    @Expose
    private String bankaccount;
    @SerializedName("referrerId")
    @Expose
    private String referrerId;
    @SerializedName("umeId")
    @Expose
    private String umeId;
    @SerializedName("paymentStatus")
    @Expose
    private String paymentStatus;
    @SerializedName("is_recentpurchase")
    @Expose
    private String isRecentpurchase;
    @SerializedName("is_member")
    @Expose
    private boolean isMember;
    @SerializedName("membershipId")
    @Expose
    private int membershipId;
    @SerializedName("membershipType")
    @Expose
    private String membershipType;
    @SerializedName("membershipPrice")
    @Expose
    private String membershipPrice;
    @SerializedName("session_id")
    @Expose
    private String sessionId;
    @SerializedName("shipping_address")
    @Expose
    private ShippingAddress shippingAddress;

    /**
     * 
     * @return
     *     The id
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName
     *     The firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return
     *     The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName
     *     The lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return
     *     The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The facebookId
     */
    public String getFacebookId() {
        return facebookId;
    }

    /**
     * 
     * @param facebookId
     *     The facebookId
     */
    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    /**
     * 
     * @return
     *     The password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 
     * @param password
     *     The password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 
     * @return
     *     The telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 
     * @param telephone
     *     The telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 
     * @return
     *     The addressLine1
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * 
     * @param addressLine1
     *     The addressLine1
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * 
     * @return
     *     The addressLine2
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * 
     * @param addressLine2
     *     The addressLine2
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * 
     * @return
     *     The city
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The state
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The pin
     */
    public String getPin() {
        return pin;
    }

    /**
     * 
     * @param pin
     *     The pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * 
     * @return
     *     The uniqueDeviceId
     */
    public String getUniqueDeviceId() {
        return uniqueDeviceId;
    }

    /**
     * 
     * @param uniqueDeviceId
     *     The uniqueDeviceId
     */
    public void setUniqueDeviceId(String uniqueDeviceId) {
        this.uniqueDeviceId = uniqueDeviceId;
    }

    /**
     * 
     * @return
     *     The profilePic
     */
    public String getProfilePic() {
        return profilePic;
    }

    /**
     * 
     * @param profilePic
     *     The profilePic
     */
    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    /**
     * 
     * @return
     *     The isAdmin
     */
    public int getIsAdmin() {
        return isAdmin;
    }

    /**
     * 
     * @param isAdmin
     *     The isAdmin
     */
    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * 
     * @return
     *     The isDeleted
     */
    public int getIsDeleted() {
        return isDeleted;
    }

    /**
     * 
     * @param isDeleted
     *     The isDeleted
     */
    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 
     * @return
     *     The status
     */
    public int getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * 
     * @param createdDate
     *     The createdDate
     */
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * 
     * @return
     *     The cea
     */
    public String getCea() {
        return cea;
    }

    /**
     * 
     * @param cea
     *     The cea
     */
    public void setCea(String cea) {
        this.cea = cea;
    }

    /**
     * 
     * @return
     *     The mobilenumber
     */
    public String getMobilenumber() {
        return mobilenumber;
    }

    /**
     * 
     * @param mobilenumber
     *     The mobilenumber
     */
    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    /**
     * 
     * @return
     *     The bank
     */
    public String getBank() {
        return bank;
    }

    /**
     * 
     * @param bank
     *     The bank
     */
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * 
     * @return
     *     The estateagency
     */
    public String getEstateagency() {
        return estateagency;
    }

    /**
     * 
     * @param estateagency
     *     The estateagency
     */
    public void setEstateagency(String estateagency) {
        this.estateagency = estateagency;
    }

    /**
     * 
     * @return
     *     The bankaccount
     */
    public String getBankaccount() {
        return bankaccount;
    }

    /**
     * 
     * @param bankaccount
     *     The bankaccount
     */
    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    /**
     * 
     * @return
     *     The referrerId
     */
    public String getReferrerId() {
        return referrerId;
    }

    /**
     * 
     * @param referrerId
     *     The referrerId
     */
    public void setReferrerId(String referrerId) {
        this.referrerId = referrerId;
    }

    /**
     * 
     * @return
     *     The umeId
     */
    public String getUmeId() {
        return umeId;
    }

    /**
     * 
     * @param umeId
     *     The umeId
     */
    public void setUmeId(String umeId) {
        this.umeId = umeId;
    }

    /**
     * 
     * @return
     *     The paymentStatus
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * 
     * @param paymentStatus
     *     The paymentStatus
     */
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    /**
     * 
     * @return
     *     The isRecentpurchase
     */
    public String getIsRecentpurchase() {
        return isRecentpurchase;
    }

    /**
     * 
     * @param isRecentpurchase
     *     The is_recentpurchase
     */
    public void setIsRecentpurchase(String isRecentpurchase) {
        this.isRecentpurchase = isRecentpurchase;
    }

    /**
     * 
     * @return
     *     The isMember
     */
    public boolean isIsMember() {
        return isMember;
    }

    /**
     * 
     * @param isMember
     *     The is_member
     */
    public void setIsMember(boolean isMember) {
        this.isMember = isMember;
    }

    /**
     * 
     * @return
     *     The membershipId
     */
    public int getMembershipId() {
        return membershipId;
    }

    /**
     * 
     * @param membershipId
     *     The membershipId
     */
    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }

    /**
     * 
     * @return
     *     The membershipType
     */
    public String getMembershipType() {
        return membershipType;
    }

    /**
     * 
     * @param membershipType
     *     The membershipType
     */
    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    /**
     * 
     * @return
     *     The membershipPrice
     */
    public String getMembershipPrice() {
        return membershipPrice;
    }

    /**
     * 
     * @param membershipPrice
     *     The membershipPrice
     */
    public void setMembershipPrice(String membershipPrice) {
        this.membershipPrice = membershipPrice;
    }

    /**
     * 
     * @return
     *     The sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * 
     * @param sessionId
     *     The session_id
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * 
     * @return
     *     The shippingAddress
     */
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * 
     * @param shippingAddress
     *     The shipping_address
     */
    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

}
