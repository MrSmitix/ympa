package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlacementType;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. ")
public class GenerateUnitedMarketplaceServicesReportRequest   {
  
  private Long businessId;

  private java.util.Date dateTimeFrom;

  private java.util.Date dateTimeTo;

  private LocalDate dateFrom;

  private LocalDate dateTo;

  private Integer yearFrom;

  private Integer monthFrom;

  private Integer yearTo;

  private Integer monthTo;

  private List<PlacementType> placementPrograms;

  private List<String> inns;

  private List<Long> campaignIds;

  /**
   * Идентификатор бизнеса.
   **/
  public GenerateUnitedMarketplaceServicesReportRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор бизнеса.")
  @JsonProperty("businessId")
  @NotNull
  public Long getBusinessId() {
    return businessId;
  }
  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }


  /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
   **/
  public GenerateUnitedMarketplaceServicesReportRequest dateTimeFrom(java.util.Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
    return this;
  }

  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. ")
  @JsonProperty("dateTimeFrom")
  public java.util.Date getDateTimeFrom() {
    return dateTimeFrom;
  }
  public void setDateTimeFrom(java.util.Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
  }


  /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
   **/
  public GenerateUnitedMarketplaceServicesReportRequest dateTimeTo(java.util.Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
    return this;
  }

  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. ")
  @JsonProperty("dateTimeTo")
  public java.util.Date getDateTimeTo() {
    return dateTimeTo;
  }
  public void setDateTimeTo(java.util.Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
  }


  /**
   * Начало периода, включительно.
   **/
  public GenerateUnitedMarketplaceServicesReportRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  
  @ApiModelProperty(value = "Начало периода, включительно.")
  @JsonProperty("dateFrom")
  public LocalDate getDateFrom() {
    return dateFrom;
  }
  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }


  /**
   * Конец периода, включительно. Максимальный период — 1 год.
   **/
  public GenerateUnitedMarketplaceServicesReportRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  
  @ApiModelProperty(value = "Конец периода, включительно. Максимальный период — 1 год.")
  @JsonProperty("dateTo")
  public LocalDate getDateTo() {
    return dateTo;
  }
  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }


  /**
   * Начальный год формирования акта.
   **/
  public GenerateUnitedMarketplaceServicesReportRequest yearFrom(Integer yearFrom) {
    this.yearFrom = yearFrom;
    return this;
  }

  
  @ApiModelProperty(value = "Начальный год формирования акта.")
  @JsonProperty("yearFrom")
  public Integer getYearFrom() {
    return yearFrom;
  }
  public void setYearFrom(Integer yearFrom) {
    this.yearFrom = yearFrom;
  }


  /**
   * Начальный номер месяца формирования акта.
   * minimum: 1
   * maximum: 12
   **/
  public GenerateUnitedMarketplaceServicesReportRequest monthFrom(Integer monthFrom) {
    this.monthFrom = monthFrom;
    return this;
  }

  
  @ApiModelProperty(value = "Начальный номер месяца формирования акта.")
  @JsonProperty("monthFrom")
 @Min(1) @Max(12)  public Integer getMonthFrom() {
    return monthFrom;
  }
  public void setMonthFrom(Integer monthFrom) {
    this.monthFrom = monthFrom;
  }


  /**
   * Конечный год формирования акта.
   **/
  public GenerateUnitedMarketplaceServicesReportRequest yearTo(Integer yearTo) {
    this.yearTo = yearTo;
    return this;
  }

  
  @ApiModelProperty(value = "Конечный год формирования акта.")
  @JsonProperty("yearTo")
  public Integer getYearTo() {
    return yearTo;
  }
  public void setYearTo(Integer yearTo) {
    this.yearTo = yearTo;
  }


  /**
   * Конечный номер месяца формирования акта.
   * minimum: 1
   * maximum: 12
   **/
  public GenerateUnitedMarketplaceServicesReportRequest monthTo(Integer monthTo) {
    this.monthTo = monthTo;
    return this;
  }

  
  @ApiModelProperty(value = "Конечный номер месяца формирования акта.")
  @JsonProperty("monthTo")
 @Min(1) @Max(12)  public Integer getMonthTo() {
    return monthTo;
  }
  public void setMonthTo(Integer monthTo) {
    this.monthTo = monthTo;
  }


  /**
   * Список моделей, которые нужны в отчете. 
   **/
  public GenerateUnitedMarketplaceServicesReportRequest placementPrograms(List<PlacementType> placementPrograms) {
    this.placementPrograms = placementPrograms;
    return this;
  }

  
  @ApiModelProperty(value = "Список моделей, которые нужны в отчете. ")
  @JsonProperty("placementPrograms")
  public List<PlacementType> getPlacementPrograms() {
    return placementPrograms;
  }
  public void setPlacementPrograms(List<PlacementType> placementPrograms) {
    this.placementPrograms = placementPrograms;
  }

  public GenerateUnitedMarketplaceServicesReportRequest addPlacementProgramsItem(PlacementType placementProgramsItem) {
    if (this.placementPrograms == null) {
      this.placementPrograms = new ArrayList<>();
    }
    this.placementPrograms.add(placementProgramsItem);
    return this;
  }


  /**
   * Список ИНН, которые нужны в отчете.
   **/
  public GenerateUnitedMarketplaceServicesReportRequest inns(List<String> inns) {
    this.inns = inns;
    return this;
  }

  
  @ApiModelProperty(value = "Список ИНН, которые нужны в отчете.")
  @JsonProperty("inns")
  public List<String> getInns() {
    return inns;
  }
  public void setInns(List<String> inns) {
    this.inns = inns;
  }

  public GenerateUnitedMarketplaceServicesReportRequest addInnsItem(String innsItem) {
    if (this.inns == null) {
      this.inns = new ArrayList<>();
    }
    this.inns.add(innsItem);
    return this;
  }


  /**
   * Список магазинов, которые нужны в отчете.
   **/
  public GenerateUnitedMarketplaceServicesReportRequest campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  
  @ApiModelProperty(value = "Список магазинов, которые нужны в отчете.")
  @JsonProperty("campaignIds")
  public List<Long> getCampaignIds() {
    return campaignIds;
  }
  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public GenerateUnitedMarketplaceServicesReportRequest addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

