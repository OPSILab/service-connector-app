
package it.eng.opsi.service.connector.service.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "firstname",
    "lastname",
    "addressStreet",
    "addressHouseNumber",
    "addressZipCode",
    "addressCity",
    "addressState",
    "addressCountry",
    "consentPrivacy",
    "consentPersonalData",
    "consentAllowContact",
    "semester",
    "institution",
    "course"
})
@Generated("jsonschema2pojo")
public class ApplicationPostRequest implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("firstname")
    private String firstname;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lastname")
    private String lastname;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressStreet")
    private String addressStreet;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressHouseNumber")
    private String addressHouseNumber;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressZipCode")
    private String addressZipCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressCity")
    private String addressCity;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressState")
    private String addressState;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressCountry")
    private String addressCountry;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("consentPrivacy")
    private Boolean consentPrivacy;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("consentPersonalData")
    private Boolean consentPersonalData;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("consentAllowContact")
    private Boolean consentAllowContact;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("semester")
    private String semester;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("institution")
    private String institution;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("course")
    private String course;
    private final static long serialVersionUID = -6656747728226398542L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("firstname")
    public String getFirstname() {
        return firstname;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("firstname")
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lastname")
    public String getLastname() {
        return lastname;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lastname")
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressStreet")
    public String getAddressStreet() {
        return addressStreet;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressStreet")
    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressHouseNumber")
    public String getAddressHouseNumber() {
        return addressHouseNumber;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressHouseNumber")
    public void setAddressHouseNumber(String addressHouseNumber) {
        this.addressHouseNumber = addressHouseNumber;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressZipCode")
    public String getAddressZipCode() {
        return addressZipCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressZipCode")
    public void setAddressZipCode(String addressZipCode) {
        this.addressZipCode = addressZipCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressCity")
    public String getAddressCity() {
        return addressCity;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressCity")
    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressState")
    public String getAddressState() {
        return addressState;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressState")
    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressCountry")
    public String getAddressCountry() {
        return addressCountry;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressCountry")
    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("consentPrivacy")
    public Boolean getConsentPrivacy() {
        return consentPrivacy;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("consentPrivacy")
    public void setConsentPrivacy(Boolean consentPrivacy) {
        this.consentPrivacy = consentPrivacy;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("consentPersonalData")
    public Boolean getConsentPersonalData() {
        return consentPersonalData;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("consentPersonalData")
    public void setConsentPersonalData(Boolean consentPersonalData) {
        this.consentPersonalData = consentPersonalData;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("consentAllowContact")
    public Boolean getConsentAllowContact() {
        return consentAllowContact;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("consentAllowContact")
    public void setConsentAllowContact(Boolean consentAllowContact) {
        this.consentAllowContact = consentAllowContact;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("semester")
    public String getSemester() {
        return semester;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("semester")
    public void setSemester(String semester) {
        this.semester = semester;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("institution")
    public String getInstitution() {
        return institution;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("institution")
    public void setInstitution(String institution) {
        this.institution = institution;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("course")
    public String getCourse() {
        return course;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("course")
    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicationPostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("firstname");
        sb.append('=');
        sb.append(((this.firstname == null)?"<null>":this.firstname));
        sb.append(',');
        sb.append("lastname");
        sb.append('=');
        sb.append(((this.lastname == null)?"<null>":this.lastname));
        sb.append(',');
        sb.append("addressStreet");
        sb.append('=');
        sb.append(((this.addressStreet == null)?"<null>":this.addressStreet));
        sb.append(',');
        sb.append("addressHouseNumber");
        sb.append('=');
        sb.append(((this.addressHouseNumber == null)?"<null>":this.addressHouseNumber));
        sb.append(',');
        sb.append("addressZipCode");
        sb.append('=');
        sb.append(((this.addressZipCode == null)?"<null>":this.addressZipCode));
        sb.append(',');
        sb.append("addressCity");
        sb.append('=');
        sb.append(((this.addressCity == null)?"<null>":this.addressCity));
        sb.append(',');
        sb.append("addressState");
        sb.append('=');
        sb.append(((this.addressState == null)?"<null>":this.addressState));
        sb.append(',');
        sb.append("addressCountry");
        sb.append('=');
        sb.append(((this.addressCountry == null)?"<null>":this.addressCountry));
        sb.append(',');
        sb.append("consentPrivacy");
        sb.append('=');
        sb.append(((this.consentPrivacy == null)?"<null>":this.consentPrivacy));
        sb.append(',');
        sb.append("consentPersonalData");
        sb.append('=');
        sb.append(((this.consentPersonalData == null)?"<null>":this.consentPersonalData));
        sb.append(',');
        sb.append("consentAllowContact");
        sb.append('=');
        sb.append(((this.consentAllowContact == null)?"<null>":this.consentAllowContact));
        sb.append(',');
        sb.append("semester");
        sb.append('=');
        sb.append(((this.semester == null)?"<null>":this.semester));
        sb.append(',');
        sb.append("institution");
        sb.append('=');
        sb.append(((this.institution == null)?"<null>":this.institution));
        sb.append(',');
        sb.append("course");
        sb.append('=');
        sb.append(((this.course == null)?"<null>":this.course));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.addressZipCode == null)? 0 :this.addressZipCode.hashCode()));
        result = ((result* 31)+((this.addressCountry == null)? 0 :this.addressCountry.hashCode()));
        result = ((result* 31)+((this.firstname == null)? 0 :this.firstname.hashCode()));
        result = ((result* 31)+((this.consentPrivacy == null)? 0 :this.consentPrivacy.hashCode()));
        result = ((result* 31)+((this.addressState == null)? 0 :this.addressState.hashCode()));
        result = ((result* 31)+((this.consentAllowContact == null)? 0 :this.consentAllowContact.hashCode()));
        result = ((result* 31)+((this.lastname == null)? 0 :this.lastname.hashCode()));
        result = ((result* 31)+((this.institution == null)? 0 :this.institution.hashCode()));
        result = ((result* 31)+((this.addressHouseNumber == null)? 0 :this.addressHouseNumber.hashCode()));
        result = ((result* 31)+((this.addressStreet == null)? 0 :this.addressStreet.hashCode()));
        result = ((result* 31)+((this.course == null)? 0 :this.course.hashCode()));
        result = ((result* 31)+((this.consentPersonalData == null)? 0 :this.consentPersonalData.hashCode()));
        result = ((result* 31)+((this.semester == null)? 0 :this.semester.hashCode()));
        result = ((result* 31)+((this.addressCity == null)? 0 :this.addressCity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationPostRequest) == false) {
            return false;
        }
        ApplicationPostRequest rhs = ((ApplicationPostRequest) other);
        return (((((((((((((((this.addressZipCode == rhs.addressZipCode)||((this.addressZipCode!= null)&&this.addressZipCode.equals(rhs.addressZipCode)))&&((this.addressCountry == rhs.addressCountry)||((this.addressCountry!= null)&&this.addressCountry.equals(rhs.addressCountry))))&&((this.firstname == rhs.firstname)||((this.firstname!= null)&&this.firstname.equals(rhs.firstname))))&&((this.consentPrivacy == rhs.consentPrivacy)||((this.consentPrivacy!= null)&&this.consentPrivacy.equals(rhs.consentPrivacy))))&&((this.addressState == rhs.addressState)||((this.addressState!= null)&&this.addressState.equals(rhs.addressState))))&&((this.consentAllowContact == rhs.consentAllowContact)||((this.consentAllowContact!= null)&&this.consentAllowContact.equals(rhs.consentAllowContact))))&&((this.lastname == rhs.lastname)||((this.lastname!= null)&&this.lastname.equals(rhs.lastname))))&&((this.institution == rhs.institution)||((this.institution!= null)&&this.institution.equals(rhs.institution))))&&((this.addressHouseNumber == rhs.addressHouseNumber)||((this.addressHouseNumber!= null)&&this.addressHouseNumber.equals(rhs.addressHouseNumber))))&&((this.addressStreet == rhs.addressStreet)||((this.addressStreet!= null)&&this.addressStreet.equals(rhs.addressStreet))))&&((this.course == rhs.course)||((this.course!= null)&&this.course.equals(rhs.course))))&&((this.consentPersonalData == rhs.consentPersonalData)||((this.consentPersonalData!= null)&&this.consentPersonalData.equals(rhs.consentPersonalData))))&&((this.semester == rhs.semester)||((this.semester!= null)&&this.semester.equals(rhs.semester))))&&((this.addressCity == rhs.addressCity)||((this.addressCity!= null)&&this.addressCity.equals(rhs.addressCity))));
    }

}
