package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.vertxweb.server.model.LicenseType;

/**
 * Информация о лицензии.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OutletLicenseDTO   {
  
  private Long id;
  private Long outletId;
  private LicenseType licenseType;
  private String number;
  private OffsetDateTime dateOfIssue;
  private OffsetDateTime dateOfExpiry;

  public OutletLicenseDTO () {

  }

  public OutletLicenseDTO (Long id, Long outletId, LicenseType licenseType, String number, OffsetDateTime dateOfIssue, OffsetDateTime dateOfExpiry) {
    this.id = id;
    this.outletId = outletId;
    this.licenseType = licenseType;
    this.number = number;
    this.dateOfIssue = dateOfIssue;
    this.dateOfExpiry = dateOfExpiry;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutletLicenseDTO outletLicenseDTO = (OutletLicenseDTO) o;
    return Objects.equals(id, outletLicenseDTO.id) &&
        Objects.equals(outletId, outletLicenseDTO.outletId) &&
        Objects.equals(licenseType, outletLicenseDTO.licenseType) &&
        Objects.equals(number, outletLicenseDTO.number) &&
        Objects.equals(dateOfIssue, outletLicenseDTO.dateOfIssue) &&
        Objects.equals(dateOfExpiry, outletLicenseDTO.dateOfExpiry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, outletId, licenseType, number, dateOfIssue, dateOfExpiry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutletLicenseDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    outletId: ").append(toIndentedString(outletId)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    dateOfIssue: ").append(toIndentedString(dateOfIssue)).append("\n");
    sb.append("    dateOfExpiry: ").append(toIndentedString(dateOfExpiry)).append("\n");
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
