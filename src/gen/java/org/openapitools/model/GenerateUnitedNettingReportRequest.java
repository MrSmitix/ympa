package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateUnitedNettingReportRequest   {
  
  private Long businessId;
  private Date dateTimeFrom;
  private Date dateTimeTo;
  private Date dateFrom;
  private Date dateTo;
  private Long bankOrderId;
  private Date bankOrderDateTime;
  private List<PlacementType> placementPrograms;
  private List<String> inns;
  private List<Long> campaignIds;

  /**
   * Идентификатор бизнеса.
   **/
  
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
  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. ")
  @JsonProperty("dateTimeFrom")
  public Date getDateTimeFrom() {
    return dateTimeFrom;
  }
  public void setDateTimeFrom(Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
  }

  /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
   **/
  
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
  
  @ApiModelProperty(value = "Список моделей, которые нужны в отчете. ")
  @JsonProperty("placementPrograms")
  @Valid
  public List<PlacementType> getPlacementPrograms() {
    return placementPrograms;
  }
  public void setPlacementPrograms(List<PlacementType> placementPrograms) {
    this.placementPrograms = placementPrograms;
  }

  /**
   * Список ИНН, которые нужны в отчете.
   **/
  
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

