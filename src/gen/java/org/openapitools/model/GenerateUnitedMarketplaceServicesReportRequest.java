package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlacementType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 **/
@ApiModel(description="Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. ")

public class GenerateUnitedMarketplaceServicesReportRequest  {
  
  @ApiModelProperty(required = true, value = "Идентификатор бизнеса.")
 /**
   * Идентификатор бизнеса.
  **/
  private Long businessId;

  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. ")
 /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
  **/
  private Date dateTimeFrom;

  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. ")
 /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
  **/
  private Date dateTimeTo;

  @ApiModelProperty(value = "Начало периода, включительно.")
 /**
   * Начало периода, включительно.
  **/
  private LocalDate dateFrom;

  @ApiModelProperty(value = "Конец периода, включительно. Максимальный период — 1 год.")
 /**
   * Конец периода, включительно. Максимальный период — 1 год.
  **/
  private LocalDate dateTo;

  @ApiModelProperty(value = "Начальный год формирования акта.")
 /**
   * Начальный год формирования акта.
  **/
  private Integer yearFrom;

  @ApiModelProperty(value = "Начальный номер месяца формирования акта.")
 /**
   * Начальный номер месяца формирования акта.
  **/
  private Integer monthFrom;

  @ApiModelProperty(value = "Конечный год формирования акта.")
 /**
   * Конечный год формирования акта.
  **/
  private Integer yearTo;

  @ApiModelProperty(value = "Конечный номер месяца формирования акта.")
 /**
   * Конечный номер месяца формирования акта.
  **/
  private Integer monthTo;

  @ApiModelProperty(value = "Список моделей, которые нужны в отчете. ")
  @Valid
 /**
   * Список моделей, которые нужны в отчете. 
  **/
  private List<PlacementType> placementPrograms;

  @ApiModelProperty(value = "Список ИНН, которые нужны в отчете.")
 /**
   * Список ИНН, которые нужны в отчете.
  **/
  private List<String> inns;

  @ApiModelProperty(value = "Список магазинов, которые нужны в отчете.")
 /**
   * Список магазинов, которые нужны в отчете.
  **/
  private List<Long> campaignIds;
 /**
   * Идентификатор бизнеса.
   * @return businessId
  **/
  @JsonProperty("businessId")
  @NotNull
  public Long getBusinessId() {
    return businessId;
  }

  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  public GenerateUnitedMarketplaceServicesReportRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

 /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
   * @return dateTimeFrom
  **/
  @JsonProperty("dateTimeFrom")
  public Date getDateTimeFrom() {
    return dateTimeFrom;
  }

  public void setDateTimeFrom(Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
  }

  public GenerateUnitedMarketplaceServicesReportRequest dateTimeFrom(Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
    return this;
  }

 /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
   * @return dateTimeTo
  **/
  @JsonProperty("dateTimeTo")
  public Date getDateTimeTo() {
    return dateTimeTo;
  }

  public void setDateTimeTo(Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
  }

  public GenerateUnitedMarketplaceServicesReportRequest dateTimeTo(Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
    return this;
  }

 /**
   * Начало периода, включительно.
   * @return dateFrom
  **/
  @JsonProperty("dateFrom")
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GenerateUnitedMarketplaceServicesReportRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

 /**
   * Конец периода, включительно. Максимальный период — 1 год.
   * @return dateTo
  **/
  @JsonProperty("dateTo")
  public LocalDate getDateTo() {
    return dateTo;
  }

  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

  public GenerateUnitedMarketplaceServicesReportRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

 /**
   * Начальный год формирования акта.
   * @return yearFrom
  **/
  @JsonProperty("yearFrom")
  public Integer getYearFrom() {
    return yearFrom;
  }

  public void setYearFrom(Integer yearFrom) {
    this.yearFrom = yearFrom;
  }

  public GenerateUnitedMarketplaceServicesReportRequest yearFrom(Integer yearFrom) {
    this.yearFrom = yearFrom;
    return this;
  }

 /**
   * Начальный номер месяца формирования акта.
   * minimum: 1
   * maximum: 12
   * @return monthFrom
  **/
  @JsonProperty("monthFrom")
 @Min(1) @Max(12)  public Integer getMonthFrom() {
    return monthFrom;
  }

  public void setMonthFrom(Integer monthFrom) {
    this.monthFrom = monthFrom;
  }

  public GenerateUnitedMarketplaceServicesReportRequest monthFrom(Integer monthFrom) {
    this.monthFrom = monthFrom;
    return this;
  }

 /**
   * Конечный год формирования акта.
   * @return yearTo
  **/
  @JsonProperty("yearTo")
  public Integer getYearTo() {
    return yearTo;
  }

  public void setYearTo(Integer yearTo) {
    this.yearTo = yearTo;
  }

  public GenerateUnitedMarketplaceServicesReportRequest yearTo(Integer yearTo) {
    this.yearTo = yearTo;
    return this;
  }

 /**
   * Конечный номер месяца формирования акта.
   * minimum: 1
   * maximum: 12
   * @return monthTo
  **/
  @JsonProperty("monthTo")
 @Min(1) @Max(12)  public Integer getMonthTo() {
    return monthTo;
  }

  public void setMonthTo(Integer monthTo) {
    this.monthTo = monthTo;
  }

  public GenerateUnitedMarketplaceServicesReportRequest monthTo(Integer monthTo) {
    this.monthTo = monthTo;
    return this;
  }

 /**
   * Список моделей, которые нужны в отчете. 
   * @return placementPrograms
  **/
  @JsonProperty("placementPrograms")
  public List<PlacementType> getPlacementPrograms() {
    return placementPrograms;
  }

  public void setPlacementPrograms(List<PlacementType> placementPrograms) {
    this.placementPrograms = placementPrograms;
  }

  public GenerateUnitedMarketplaceServicesReportRequest placementPrograms(List<PlacementType> placementPrograms) {
    this.placementPrograms = placementPrograms;
    return this;
  }

  public GenerateUnitedMarketplaceServicesReportRequest addPlacementProgramsItem(PlacementType placementProgramsItem) {
    this.placementPrograms.add(placementProgramsItem);
    return this;
  }

 /**
   * Список ИНН, которые нужны в отчете.
   * @return inns
  **/
  @JsonProperty("inns")
  public List<String> getInns() {
    return inns;
  }

  public void setInns(List<String> inns) {
    this.inns = inns;
  }

  public GenerateUnitedMarketplaceServicesReportRequest inns(List<String> inns) {
    this.inns = inns;
    return this;
  }

  public GenerateUnitedMarketplaceServicesReportRequest addInnsItem(String innsItem) {
    this.inns.add(innsItem);
    return this;
  }

 /**
   * Список магазинов, которые нужны в отчете.
   * @return campaignIds
  **/
  @JsonProperty("campaignIds")
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public GenerateUnitedMarketplaceServicesReportRequest campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public GenerateUnitedMarketplaceServicesReportRequest addCampaignIdsItem(Long campaignIdsItem) {
    this.campaignIds.add(campaignIdsItem);
    return this;
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
    return Objects.equals(this.businessId, generateUnitedMarketplaceServicesReportRequest.businessId) &&
        Objects.equals(this.dateTimeFrom, generateUnitedMarketplaceServicesReportRequest.dateTimeFrom) &&
        Objects.equals(this.dateTimeTo, generateUnitedMarketplaceServicesReportRequest.dateTimeTo) &&
        Objects.equals(this.dateFrom, generateUnitedMarketplaceServicesReportRequest.dateFrom) &&
        Objects.equals(this.dateTo, generateUnitedMarketplaceServicesReportRequest.dateTo) &&
        Objects.equals(this.yearFrom, generateUnitedMarketplaceServicesReportRequest.yearFrom) &&
        Objects.equals(this.monthFrom, generateUnitedMarketplaceServicesReportRequest.monthFrom) &&
        Objects.equals(this.yearTo, generateUnitedMarketplaceServicesReportRequest.yearTo) &&
        Objects.equals(this.monthTo, generateUnitedMarketplaceServicesReportRequest.monthTo) &&
        Objects.equals(this.placementPrograms, generateUnitedMarketplaceServicesReportRequest.placementPrograms) &&
        Objects.equals(this.inns, generateUnitedMarketplaceServicesReportRequest.inns) &&
        Objects.equals(this.campaignIds, generateUnitedMarketplaceServicesReportRequest.campaignIds);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

