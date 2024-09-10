package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.PlacementType;

/**
 * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenerateUnitedMarketplaceServicesReportRequest   {
  
  private Long businessId;
  private OffsetDateTime dateTimeFrom;
  private OffsetDateTime dateTimeTo;
  private LocalDate dateFrom;
  private LocalDate dateTo;
  private Integer yearFrom;
  private Integer monthFrom;
  private Integer yearTo;
  private Integer monthTo;
  private List<PlacementType> placementPrograms;
  private List<String> inns;
  private List<Long> campaignIds;

  public GenerateUnitedMarketplaceServicesReportRequest () {

  }

  public GenerateUnitedMarketplaceServicesReportRequest (Long businessId, OffsetDateTime dateTimeFrom, OffsetDateTime dateTimeTo, LocalDate dateFrom, LocalDate dateTo, Integer yearFrom, Integer monthFrom, Integer yearTo, Integer monthTo, List<PlacementType> placementPrograms, List<String> inns, List<Long> campaignIds) {
    this.businessId = businessId;
    this.dateTimeFrom = dateTimeFrom;
    this.dateTimeTo = dateTimeTo;
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
    this.yearFrom = yearFrom;
    this.monthFrom = monthFrom;
    this.yearTo = yearTo;
    this.monthTo = monthTo;
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

    
  @JsonProperty("yearFrom")
  public Integer getYearFrom() {
    return yearFrom;
  }
  public void setYearFrom(Integer yearFrom) {
    this.yearFrom = yearFrom;
  }

    
  @JsonProperty("monthFrom")
  public Integer getMonthFrom() {
    return monthFrom;
  }
  public void setMonthFrom(Integer monthFrom) {
    this.monthFrom = monthFrom;
  }

    
  @JsonProperty("yearTo")
  public Integer getYearTo() {
    return yearTo;
  }
  public void setYearTo(Integer yearTo) {
    this.yearTo = yearTo;
  }

    
  @JsonProperty("monthTo")
  public Integer getMonthTo() {
    return monthTo;
  }
  public void setMonthTo(Integer monthTo) {
    this.monthTo = monthTo;
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
    GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest = (GenerateUnitedMarketplaceServicesReportRequest) o;
    return Objects.equals(businessId, generateUnitedMarketplaceServicesReportRequest.businessId) &&
        Objects.equals(dateTimeFrom, generateUnitedMarketplaceServicesReportRequest.dateTimeFrom) &&
        Objects.equals(dateTimeTo, generateUnitedMarketplaceServicesReportRequest.dateTimeTo) &&
        Objects.equals(dateFrom, generateUnitedMarketplaceServicesReportRequest.dateFrom) &&
        Objects.equals(dateTo, generateUnitedMarketplaceServicesReportRequest.dateTo) &&
        Objects.equals(yearFrom, generateUnitedMarketplaceServicesReportRequest.yearFrom) &&
        Objects.equals(monthFrom, generateUnitedMarketplaceServicesReportRequest.monthFrom) &&
        Objects.equals(yearTo, generateUnitedMarketplaceServicesReportRequest.yearTo) &&
        Objects.equals(monthTo, generateUnitedMarketplaceServicesReportRequest.monthTo) &&
        Objects.equals(placementPrograms, generateUnitedMarketplaceServicesReportRequest.placementPrograms) &&
        Objects.equals(inns, generateUnitedMarketplaceServicesReportRequest.inns) &&
        Objects.equals(campaignIds, generateUnitedMarketplaceServicesReportRequest.campaignIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, dateTimeFrom, dateTimeTo, dateFrom, dateTo, yearFrom, monthFrom, yearTo, monthTo, placementPrograms, inns, campaignIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateUnitedMarketplaceServicesReportRequest {\n");
    
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    dateTimeFrom: ").append(toIndentedString(dateTimeFrom)).append("\n");
    sb.append("    dateTimeTo: ").append(toIndentedString(dateTimeTo)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    yearFrom: ").append(toIndentedString(yearFrom)).append("\n");
    sb.append("    monthFrom: ").append(toIndentedString(monthFrom)).append("\n");
    sb.append("    yearTo: ").append(toIndentedString(yearTo)).append("\n");
    sb.append("    monthTo: ").append(toIndentedString(monthTo)).append("\n");
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
