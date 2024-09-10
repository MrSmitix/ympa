package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.server.api.model.LicenseCheckStatusType;
import org.openapitools.server.api.model.LicenseType;

/**
 * Информация о лицензии.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FullOutletLicenseDTO   {
  
  private Long id;
  private Long outletId;
  private LicenseType licenseType;
  private String number;
  private OffsetDateTime dateOfIssue;
  private OffsetDateTime dateOfExpiry;
  private LicenseCheckStatusType checkStatus;
  private String checkComment;

  public FullOutletLicenseDTO () {

  }

  public FullOutletLicenseDTO (Long id, Long outletId, LicenseType licenseType, String number, OffsetDateTime dateOfIssue, OffsetDateTime dateOfExpiry, LicenseCheckStatusType checkStatus, String checkComment) {
    this.id = id;
    this.outletId = outletId;
    this.licenseType = licenseType;
    this.number = number;
    this.dateOfIssue = dateOfIssue;
    this.dateOfExpiry = dateOfExpiry;
    this.checkStatus = checkStatus;
    this.checkComment = checkComment;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("outletId")
  public Long getOutletId() {
    return outletId;
  }
  public void setOutletId(Long outletId) {
    this.outletId = outletId;
  }

    
  @JsonProperty("licenseType")
  public LicenseType getLicenseType() {
    return licenseType;
  }
  public void setLicenseType(LicenseType licenseType) {
    this.licenseType = licenseType;
  }

    
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

    
  @JsonProperty("dateOfIssue")
  public OffsetDateTime getDateOfIssue() {
    return dateOfIssue;
  }
  public void setDateOfIssue(OffsetDateTime dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
  }

    
  @JsonProperty("dateOfExpiry")
  public OffsetDateTime getDateOfExpiry() {
    return dateOfExpiry;
  }
  public void setDateOfExpiry(OffsetDateTime dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
  }

    
  @JsonProperty("checkStatus")
  public LicenseCheckStatusType getCheckStatus() {
    return checkStatus;
  }
  public void setCheckStatus(LicenseCheckStatusType checkStatus) {
    this.checkStatus = checkStatus;
  }

    
  @JsonProperty("checkComment")
  public String getCheckComment() {
    return checkComment;
  }
  public void setCheckComment(String checkComment) {
    this.checkComment = checkComment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullOutletLicenseDTO fullOutletLicenseDTO = (FullOutletLicenseDTO) o;
    return Objects.equals(id, fullOutletLicenseDTO.id) &&
        Objects.equals(outletId, fullOutletLicenseDTO.outletId) &&
        Objects.equals(licenseType, fullOutletLicenseDTO.licenseType) &&
        Objects.equals(number, fullOutletLicenseDTO.number) &&
        Objects.equals(dateOfIssue, fullOutletLicenseDTO.dateOfIssue) &&
        Objects.equals(dateOfExpiry, fullOutletLicenseDTO.dateOfExpiry) &&
        Objects.equals(checkStatus, fullOutletLicenseDTO.checkStatus) &&
        Objects.equals(checkComment, fullOutletLicenseDTO.checkComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, outletId, licenseType, number, dateOfIssue, dateOfExpiry, checkStatus, checkComment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullOutletLicenseDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    outletId: ").append(toIndentedString(outletId)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    dateOfIssue: ").append(toIndentedString(dateOfIssue)).append("\n");
    sb.append("    dateOfExpiry: ").append(toIndentedString(dateOfExpiry)).append("\n");
    sb.append("    checkStatus: ").append(toIndentedString(checkStatus)).append("\n");
    sb.append("    checkComment: ").append(toIndentedString(checkComment)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
