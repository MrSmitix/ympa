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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 */
@ApiModel(description="Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. ")

public class GenerateUnitedMarketplaceServicesReportRequest  {
  
 /**
  * Идентификатор бизнеса.
  */
  @ApiModelProperty(required = true, value = "Идентификатор бизнеса.")
  private Long businessId;

 /**
  * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
  */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date dateTimeFrom;

 /**
  * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
  */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date dateTimeTo;

 /**
  * Начало периода, включительно.
  */
  @ApiModelProperty(value = "Начало периода, включительно.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate dateFrom;

 /**
  * Конец периода, включительно. Максимальный период — 1 год.
  */
  @ApiModelProperty(value = "Конец периода, включительно. Максимальный период — 1 год.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate dateTo;

 /**
  * Начальный год формирования акта.
  */
  @ApiModelProperty(value = "Начальный год формирования акта.")
  private Integer yearFrom;

 /**
  * Начальный номер месяца формирования акта.
  */
  @ApiModelProperty(value = "Начальный номер месяца формирования акта.")
  private Integer monthFrom;

 /**
  * Конечный год формирования акта.
  */
  @ApiModelProperty(value = "Конечный год формирования акта.")
  private Integer yearTo;

 /**
  * Конечный номер месяца формирования акта.
  */
  @ApiModelProperty(value = "Конечный номер месяца формирования акта.")
  private Integer monthTo;

 /**
  * Список моделей, которые нужны в отчете. 
  */
  @ApiModelProperty(value = "Список моделей, которые нужны в отчете. ")
  @Valid
  private List<PlacementType> placementPrograms;

 /**
  * Список ИНН, которые нужны в отчете.
  */
  @ApiModelProperty(value = "Список ИНН, которые нужны в отчете.")
  private List<String> inns;

 /**
  * Список магазинов, которые нужны в отчете.
  */
  @ApiModelProperty(value = "Список магазинов, которые нужны в отчете.")
  private List<Long> campaignIds;
 /**
  * Идентификатор бизнеса.
  * @return businessId
  */
  @JsonProperty("businessId")
  @NotNull
  public Long getBusinessId() {
    return businessId;
  }

  /**
   * Sets the <code>businessId</code> property.
   */
 public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  /**
   * Sets the <code>businessId</code> property.
   */
  public GenerateUnitedMarketplaceServicesReportRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

 /**
  * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
  * @return dateTimeFrom
  */
  @JsonProperty("dateTimeFrom")
  public Date getDateTimeFrom() {
    return dateTimeFrom;
  }

  /**
   * Sets the <code>dateTimeFrom</code> property.
   */
 public void setDateTimeFrom(Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
  }

  /**
   * Sets the <code>dateTimeFrom</code> property.
   */
  public GenerateUnitedMarketplaceServicesReportRequest dateTimeFrom(Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
    return this;
  }

 /**
  * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
  * @return dateTimeTo
  */
  @JsonProperty("dateTimeTo")
  public Date getDateTimeTo() {
    return dateTimeTo;
  }

  /**
   * Sets the <code>dateTimeTo</code> property.
   */
 public void setDateTimeTo(Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
  }

  /**
   * Sets the <code>dateTimeTo</code> property.
   */
  public GenerateUnitedMarketplaceServicesReportRequest dateTimeTo(Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
    return this;
  }

 /**
  * Начало периода, включительно.
  * @return dateFrom
  */
  @JsonProperty("dateFrom")
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  /**
   * Sets the <code>dateFrom</code> property.
   */
 public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  /**
   * Sets the <code>dateFrom</code> property.
   */
  public GenerateUnitedMarketplaceServicesReportRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

 /**
  * Конец периода, включительно. Максимальный период — 1 год.
  * @return dateTo
  */
  @JsonProperty("dateTo")
  public LocalDate getDateTo() {
    return dateTo;
  }

  /**
   * Sets the <code>dateTo</code> property.
   */
 public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

  /**
   * Sets the <code>dateTo</code> property.
   */
  public GenerateUnitedMarketplaceServicesReportRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

 /**
  * Начальный год формирования акта.
  * @return yearFrom
  */
  @JsonProperty("yearFrom")
  public Integer getYearFrom() {
    return yearFrom;
  }

  /**
   * Sets the <code>yearFrom</code> property.
   */
 public void setYearFrom(Integer yearFrom) {
    this.yearFrom = yearFrom;
  }

  /**
   * Sets the <code>yearFrom</code> property.
   */
  public GenerateUnitedMarketplaceServicesReportRequest yearFrom(Integer yearFrom) {
    this.yearFrom = yearFrom;
    return this;
  }

 /**
  * Начальный номер месяца формирования акта.
  * minimum: 1
  * maximum: 12
  * @return monthFrom
  */
  @JsonProperty("monthFrom")
 @Min(1) @Max(12)  public Integer getMonthFrom() {
    return monthFrom;
  }

  /**
   * Sets the <code>monthFrom</code> property.
   */
 public void setMonthFrom(Integer monthFrom) {
    this.monthFrom = monthFrom;
  }

  /**
   * Sets the <code>monthFrom</code> property.
   */
  public GenerateUnitedMarketplaceServicesReportRequest monthFrom(Integer monthFrom) {
    this.monthFrom = monthFrom;
    return this;
  }

 /**
  * Конечный год формирования акта.
  * @return yearTo
  */
  @JsonProperty("yearTo")
  public Integer getYearTo() {
    return yearTo;
  }

  /**
   * Sets the <code>yearTo</code> property.
   */
 public void setYearTo(Integer yearTo) {
    this.yearTo = yearTo;
  }

  /**
   * Sets the <code>yearTo</code> property.
   */
  public GenerateUnitedMarketplaceServicesReportRequest yearTo(Integer yearTo) {
    this.yearTo = yearTo;
    return this;
  }

 /**
  * Конечный номер месяца формирования акта.
  * minimum: 1
  * maximum: 12
  * @return monthTo
  */
  @JsonProperty("monthTo")
 @Min(1) @Max(12)  public Integer getMonthTo() {
    return monthTo;
  }

  /**
   * Sets the <code>monthTo</code> property.
   */
 public void setMonthTo(Integer monthTo) {
    this.monthTo = monthTo;
  }

  /**
   * Sets the <code>monthTo</code> property.
   */
  public GenerateUnitedMarketplaceServicesReportRequest monthTo(Integer monthTo) {
    this.monthTo = monthTo;
    return this;
  }

 /**
  * Список моделей, которые нужны в отчете. 
  * @return placementPrograms
  */
  @JsonProperty("placementPrograms")
  public List<PlacementType> getPlacementPrograms() {
    return placementPrograms;
  }

  /**
   * Sets the <code>placementPrograms</code> property.
   */
 public void setPlacementPrograms(List<PlacementType> placementPrograms) {
    this.placementPrograms = placementPrograms;
  }

  /**
   * Sets the <code>placementPrograms</code> property.
   */
  public GenerateUnitedMarketplaceServicesReportRequest placementPrograms(List<PlacementType> placementPrograms) {
    this.placementPrograms = placementPrograms;
    return this;
  }

  /**
   * Adds a new item to the <code>placementPrograms</code> list.
   */
  public GenerateUnitedMarketplaceServicesReportRequest addPlacementProgramsItem(PlacementType placementProgramsItem) {
    this.placementPrograms.add(placementProgramsItem);
    return this;
  }

 /**
  * Список ИНН, которые нужны в отчете.
  * @return inns
  */
  @JsonProperty("inns")
  public List<String> getInns() {
    return inns;
  }

  /**
   * Sets the <code>inns</code> property.
   */
 public void setInns(List<String> inns) {
    this.inns = inns;
  }

  /**
   * Sets the <code>inns</code> property.
   */
  public GenerateUnitedMarketplaceServicesReportRequest inns(List<String> inns) {
    this.inns = inns;
    return this;
  }

  /**
   * Adds a new item to the <code>inns</code> list.
   */
  public GenerateUnitedMarketplaceServicesReportRequest addInnsItem(String innsItem) {
    this.inns.add(innsItem);
    return this;
  }

 /**
  * Список магазинов, которые нужны в отчете.
  * @return campaignIds
  */
  @JsonProperty("campaignIds")
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  /**
   * Sets the <code>campaignIds</code> property.
   */
 public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  /**
   * Sets the <code>campaignIds</code> property.
   */
  public GenerateUnitedMarketplaceServicesReportRequest campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  /**
   * Adds a new item to the <code>campaignIds</code> list.
   */
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

