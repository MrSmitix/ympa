package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.joda.time.LocalDate;
import org.openapitools.model.ShowsSalesGroupingType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Данные, необходимые для генерации отчета.
 */
@ApiModel(description="Данные, необходимые для генерации отчета.")

public class GenerateShowsSalesReportRequest  {
  
 /**
  * Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
  */
  @ApiModelProperty(value = "Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. ")
  private Long businessId;

 /**
  * Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
  */
  @ApiModelProperty(value = "Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. ")
  private Long campaignId;

 /**
  * Начало периода, включительно.
  */
  @ApiModelProperty(required = true, value = "Начало периода, включительно.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate dateFrom;

 /**
  * Конец периода, включительно.
  */
  @ApiModelProperty(required = true, value = "Конец периода, включительно.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate dateTo;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ShowsSalesGroupingType grouping;
 /**
  * Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу. 
  * @return businessId
  */
  @JsonProperty("businessId")
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
  public GenerateShowsSalesReportRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

 /**
  * Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу. 
  * @return campaignId
  */
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }

  /**
   * Sets the <code>campaignId</code> property.
   */
 public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Sets the <code>campaignId</code> property.
   */
  public GenerateShowsSalesReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
  * Начало периода, включительно.
  * @return dateFrom
  */
  @JsonProperty("dateFrom")
  @NotNull
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
  public GenerateShowsSalesReportRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

 /**
  * Конец периода, включительно.
  * @return dateTo
  */
  @JsonProperty("dateTo")
  @NotNull
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
  public GenerateShowsSalesReportRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

 /**
  * Get grouping
  * @return grouping
  */
  @JsonProperty("grouping")
  @NotNull
  public ShowsSalesGroupingType getGrouping() {
    return grouping;
  }

  /**
   * Sets the <code>grouping</code> property.
   */
 public void setGrouping(ShowsSalesGroupingType grouping) {
    this.grouping = grouping;
  }

  /**
   * Sets the <code>grouping</code> property.
   */
  public GenerateShowsSalesReportRequest grouping(ShowsSalesGroupingType grouping) {
    this.grouping = grouping;
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
    GenerateShowsSalesReportRequest generateShowsSalesReportRequest = (GenerateShowsSalesReportRequest) o;
    return Objects.equals(this.businessId, generateShowsSalesReportRequest.businessId) &&
        Objects.equals(this.campaignId, generateShowsSalesReportRequest.campaignId) &&
        Objects.equals(this.dateFrom, generateShowsSalesReportRequest.dateFrom) &&
        Objects.equals(this.dateTo, generateShowsSalesReportRequest.dateTo) &&
        Objects.equals(this.grouping, generateShowsSalesReportRequest.grouping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, campaignId, dateFrom, dateTo, grouping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateShowsSalesReportRequest {\n");
    
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    grouping: ").append(toIndentedString(grouping)).append("\n");
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

