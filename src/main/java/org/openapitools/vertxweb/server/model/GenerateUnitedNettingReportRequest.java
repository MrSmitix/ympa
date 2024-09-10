package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.PlacementType;

/**
 * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenerateUnitedNettingReportRequest   {
  
  private Long businessId;
  private OffsetDateTime dateTimeFrom;
  private OffsetDateTime dateTimeTo;
  private LocalDate dateFrom;
  private LocalDate dateTo;
  private Long bankOrderId;
  private OffsetDateTime bankOrderDateTime;
  private List<PlacementType> placementPrograms;
  private List<String> inns;
  private List<Long> campaignIds;

  public GenerateUnitedNettingReportRequest () {

  }

  public GenerateUnitedNettingReportRequest (Long businessId, OffsetDateTime dateTimeFrom, OffsetDateTime dateTimeTo, LocalDate dateFrom, LocalDate dateTo, Long bankOrderId, OffsetDateTime bankOrderDateTime, List<PlacementType> placementPrograms, List<String> inns, List<Long> campaignIds) {
    this.businessId = businessId;
    this.dateTimeFrom = dateTimeFrom;
    this.dateTimeTo = dateTimeTo;
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
    this.bankOrderId = bankOrderId;
    this.bankOrderDateTime = bankOrderDateTime;
    this.placementPrograms = placementPrograms;
    this.inns = inns;
    this.campaignIds = campaignIds;
  }

    
  @JsonProperty("businessId")
  public Long getBusinessId() {
    return businessId;
  }
  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

    
  @JsonProperty("dateTimeFrom")
  public OffsetDateTime getDateTimeFrom() {
    return dateTimeFrom;
  }
  public void setDateTimeFrom(OffsetDateTime dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
  }

    
  @JsonProperty("dateTimeTo")
  public OffsetDateTime getDateTimeTo() {
    return dateTimeTo;
  }
  public void setDateTimeTo(OffsetDateTime dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
  }

    
  @JsonProperty("dateFrom")
  public LocalDate getDateFrom() {
    return dateFrom;
  }
  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

    
  @JsonProperty("dateTo")
  public LocalDate getDateTo() {
    return dateTo;
  }
  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

    
  @JsonProperty("bankOrderId")
  public Long getBankOrderId() {
    return bankOrderId;
  }
  public void setBankOrderId(Long bankOrderId) {
    this.bankOrderId = bankOrderId;
  }

    
  @JsonProperty("bankOrderDateTime")
  public OffsetDateTime getBankOrderDateTime() {
    return bankOrderDateTime;
  }
  public void setBankOrderDateTime(OffsetDateTime bankOrderDateTime) {
    this.bankOrderDateTime = bankOrderDateTime;
  }

    
  @JsonProperty("placementPrograms")
  public List<PlacementType> getPlacementPrograms() {
    return placementPrograms;
  }
  public void setPlacementPrograms(List<PlacementType> placementPrograms) {
    this.placementPrograms = placementPrograms;
  }

    
  @JsonProperty("inns")
  public List<String> getInns() {
    return inns;
  }
  public void setInns(List<String> inns) {
    this.inns = inns;
  }

    
  @JsonProperty("campaignIds")
  public List<Long> getCampaignIds() {
    return campaignIds;
  }
  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest = (GenerateUnitedNettingReportRequest) o;
    return Objects.equals(businessId, generateUnitedNettingReportRequest.businessId) &&
        Objects.equals(dateTimeFrom, generateUnitedNettingReportRequest.dateTimeFrom) &&
        Objects.equals(dateTimeTo, generateUnitedNettingReportRequest.dateTimeTo) &&
        Objects.equals(dateFrom, generateUnitedNettingReportRequest.dateFrom) &&
        Objects.equals(dateTo, generateUnitedNettingReportRequest.dateTo) &&
        Objects.equals(bankOrderId, generateUnitedNettingReportRequest.bankOrderId) &&
        Objects.equals(bankOrderDateTime, generateUnitedNettingReportRequest.bankOrderDateTime) &&
        Objects.equals(placementPrograms, generateUnitedNettingReportRequest.placementPrograms) &&
        Objects.equals(inns, generateUnitedNettingReportRequest.inns) &&
        Objects.equals(campaignIds, generateUnitedNettingReportRequest.campaignIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, dateTimeFrom, dateTimeTo, dateFrom, dateTo, bankOrderId, bankOrderDateTime, placementPrograms, inns, campaignIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateUnitedNettingReportRequest {\n");
    
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    dateTimeFrom: ").append(toIndentedString(dateTimeFrom)).append("\n");
    sb.append("    dateTimeTo: ").append(toIndentedString(dateTimeTo)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    bankOrderId: ").append(toIndentedString(bankOrderId)).append("\n");
    sb.append("    bankOrderDateTime: ").append(toIndentedString(bankOrderDateTime)).append("\n");
    sb.append("    placementPrograms: ").append(toIndentedString(placementPrograms)).append("\n");
    sb.append("    inns: ").append(toIndentedString(inns)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
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
