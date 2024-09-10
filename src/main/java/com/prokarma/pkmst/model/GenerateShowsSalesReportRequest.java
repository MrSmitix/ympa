package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.ShowsSalesGroupingType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Данные, необходимые для генерации отчета.
 */
@ApiModel(description = "Данные, необходимые для генерации отчета.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateShowsSalesReportRequest   {
  @JsonProperty("businessId")
  private Long businessId;

  @JsonProperty("campaignId")
  private Long campaignId;

  @JsonProperty("dateFrom")
  private LocalDate dateFrom;

  @JsonProperty("dateTo")
  private LocalDate dateTo;

  @JsonProperty("grouping")
  private ShowsSalesGroupingType grouping;

  public GenerateShowsSalesReportRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

  /**
   * Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
   * @return businessId
   */
  @ApiModelProperty(value = "Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. ")
  public Long getBusinessId() {
    return businessId;
  }

  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  public GenerateShowsSalesReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
   * @return campaignId
   */
  @ApiModelProperty(value = "Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. ")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public GenerateShowsSalesReportRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Начало периода, включительно.
   * @return dateFrom
   */
  @ApiModelProperty(required = true, value = "Начало периода, включительно.")
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GenerateShowsSalesReportRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * Конец периода, включительно.
   * @return dateTo
   */
  @ApiModelProperty(required = true, value = "Конец периода, включительно.")
  public LocalDate getDateTo() {
    return dateTo;
  }

  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

  public GenerateShowsSalesReportRequest grouping(ShowsSalesGroupingType grouping) {
    this.grouping = grouping;
    return this;
  }

  /**
   * Get grouping
   * @return grouping
   */
  @ApiModelProperty(required = true, value = "")
  public ShowsSalesGroupingType getGrouping() {
    return grouping;
  }

  public void setGrouping(ShowsSalesGroupingType grouping) {
    this.grouping = grouping;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

