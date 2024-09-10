package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlacementType;



/**
 * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 **/

@ApiModel(description = "Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateUnitedNettingReportRequest   {
  @JsonProperty("businessId")
  private Long businessId;

  @JsonProperty("dateTimeFrom")
  private Date dateTimeFrom;

  @JsonProperty("dateTimeTo")
  private Date dateTimeTo;

  @JsonProperty("dateFrom")
  private Date dateFrom;

  @JsonProperty("dateTo")
  private Date dateTo;

  @JsonProperty("bankOrderId")
  private Long bankOrderId;

  @JsonProperty("bankOrderDateTime")
  private Date bankOrderDateTime;

  @JsonProperty("placementPrograms")
  private List<PlacementType> placementPrograms = null;

  @JsonProperty("inns")
  private List<String> inns = null;

  @JsonProperty("campaignIds")
  private List<Long> campaignIds = null;

  /**
   * Идентификатор бизнеса.
   **/
  public GenerateUnitedNettingReportRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор бизнеса.")
  @JsonProperty("businessId")
  public Long getBusinessId() {
    return businessId;
  }
  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
   **/
  public GenerateUnitedNettingReportRequest dateTimeFrom(Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
    return this;
  }

  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. ")
  @JsonProperty("dateTimeFrom")
  public Date getDateTimeFrom() {
    return dateTimeFrom;
  }
  public void setDateTimeFrom(Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
   **/
  public GenerateUnitedNettingReportRequest dateTimeTo(Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
    return this;
  }

  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. ")
  @JsonProperty("dateTimeTo")
  public Date getDateTimeTo() {
    return dateTimeTo;
  }
  public void setDateTimeTo(Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
  }

  /**
   * Начало периода, включительно.
   **/
  public GenerateUnitedNettingReportRequest dateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  
  @ApiModelProperty(value = "Начало периода, включительно.")
  @JsonProperty("dateFrom")
  public Date getDateFrom() {
    return dateFrom;
  }
  public void setDateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
  }

  /**
   * Конец периода, включительно. Максимальный период — 1 год.
   **/
  public GenerateUnitedNettingReportRequest dateTo(Date dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  
  @ApiModelProperty(value = "Конец периода, включительно. Максимальный период — 1 год.")
  @JsonProperty("dateTo")
  public Date getDateTo() {
    return dateTo;
  }
  public void setDateTo(Date dateTo) {
    this.dateTo = dateTo;
  }

  /**
   * Номер платежного поручения.
   **/
  public GenerateUnitedNettingReportRequest bankOrderId(Long bankOrderId) {
    this.bankOrderId = bankOrderId;
    return this;
  }

  
  @ApiModelProperty(value = "Номер платежного поручения.")
  @JsonProperty("bankOrderId")
  public Long getBankOrderId() {
    return bankOrderId;
  }
  public void setBankOrderId(Long bankOrderId) {
    this.bankOrderId = bankOrderId;
  }

  /**
   * Дата платежного поручения.
   **/
  public GenerateUnitedNettingReportRequest bankOrderDateTime(Date bankOrderDateTime) {
    this.bankOrderDateTime = bankOrderDateTime;
    return this;
  }

  
  @ApiModelProperty(value = "Дата платежного поручения.")
  @JsonProperty("bankOrderDateTime")
  public Date getBankOrderDateTime() {
    return bankOrderDateTime;
  }
  public void setBankOrderDateTime(Date bankOrderDateTime) {
    this.bankOrderDateTime = bankOrderDateTime;
  }

  /**
   * Список моделей, которые нужны в отчете. 
   **/
  public GenerateUnitedNettingReportRequest placementPrograms(List<PlacementType> placementPrograms) {
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

  /**
   * Список ИНН, которые нужны в отчете.
   **/
  public GenerateUnitedNettingReportRequest inns(List<String> inns) {
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

  /**
   * Список магазинов, которые нужны в отчете.
   **/
  public GenerateUnitedNettingReportRequest campaignIds(List<Long> campaignIds) {
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

