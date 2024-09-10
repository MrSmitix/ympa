package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlacementType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 **/
@ApiModel(description="Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. ")

public class GenerateUnitedNettingReportRequest  {
  
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

  @ApiModelProperty(value = "Номер платежного поручения.")
 /**
   * Номер платежного поручения.
  **/
  private Long bankOrderId;

  @ApiModelProperty(value = "Дата платежного поручения.")
 /**
   * Дата платежного поручения.
  **/
  private Date bankOrderDateTime;

  @ApiModelProperty(value = "Список моделей, которые нужны в отчете. ")
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
  public Long getBusinessId() {
    return businessId;
  }

  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  public GenerateUnitedNettingReportRequest businessId(Long businessId) {
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

  public GenerateUnitedNettingReportRequest dateTimeFrom(Date dateTimeFrom) {
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

  public GenerateUnitedNettingReportRequest dateTimeTo(Date dateTimeTo) {
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

  public GenerateUnitedNettingReportRequest dateFrom(LocalDate dateFrom) {
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

  public GenerateUnitedNettingReportRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

 /**
   * Номер платежного поручения.
   * @return bankOrderId
  **/
  @JsonProperty("bankOrderId")
  public Long getBankOrderId() {
    return bankOrderId;
  }

  public void setBankOrderId(Long bankOrderId) {
    this.bankOrderId = bankOrderId;
  }

  public GenerateUnitedNettingReportRequest bankOrderId(Long bankOrderId) {
    this.bankOrderId = bankOrderId;
    return this;
  }

 /**
   * Дата платежного поручения.
   * @return bankOrderDateTime
  **/
  @JsonProperty("bankOrderDateTime")
  public Date getBankOrderDateTime() {
    return bankOrderDateTime;
  }

  public void setBankOrderDateTime(Date bankOrderDateTime) {
    this.bankOrderDateTime = bankOrderDateTime;
  }

  public GenerateUnitedNettingReportRequest bankOrderDateTime(Date bankOrderDateTime) {
    this.bankOrderDateTime = bankOrderDateTime;
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

  public GenerateUnitedNettingReportRequest placementPrograms(List<PlacementType> placementPrograms) {
    this.placementPrograms = placementPrograms;
    return this;
  }

  public GenerateUnitedNettingReportRequest addPlacementProgramsItem(PlacementType placementProgramsItem) {
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

  public GenerateUnitedNettingReportRequest inns(List<String> inns) {
    this.inns = inns;
    return this;
  }

  public GenerateUnitedNettingReportRequest addInnsItem(String innsItem) {
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

  public GenerateUnitedNettingReportRequest campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public GenerateUnitedNettingReportRequest addCampaignIdsItem(Long campaignIdsItem) {
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
    GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest = (GenerateUnitedNettingReportRequest) o;
    return Objects.equals(this.businessId, generateUnitedNettingReportRequest.businessId) &&
        Objects.equals(this.dateTimeFrom, generateUnitedNettingReportRequest.dateTimeFrom) &&
        Objects.equals(this.dateTimeTo, generateUnitedNettingReportRequest.dateTimeTo) &&
        Objects.equals(this.dateFrom, generateUnitedNettingReportRequest.dateFrom) &&
        Objects.equals(this.dateTo, generateUnitedNettingReportRequest.dateTo) &&
        Objects.equals(this.bankOrderId, generateUnitedNettingReportRequest.bankOrderId) &&
        Objects.equals(this.bankOrderDateTime, generateUnitedNettingReportRequest.bankOrderDateTime) &&
        Objects.equals(this.placementPrograms, generateUnitedNettingReportRequest.placementPrograms) &&
        Objects.equals(this.inns, generateUnitedNettingReportRequest.inns) &&
        Objects.equals(this.campaignIds, generateUnitedNettingReportRequest.campaignIds);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

