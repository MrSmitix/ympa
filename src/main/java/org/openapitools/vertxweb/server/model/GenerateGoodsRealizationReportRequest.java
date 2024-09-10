package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenerateGoodsRealizationReportRequest   {
  
  private Long campaignId;
  private Integer year;
  private Integer month;

  public GenerateGoodsRealizationReportRequest () {

  }

  public GenerateGoodsRealizationReportRequest (Long campaignId, Integer year, Integer month) {
    this.campaignId = campaignId;
    this.year = year;
    this.month = month;
  }

    
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

    
  @JsonProperty("year")
  public Integer getYear() {
    return year;
  }
  public void setYear(Integer year) {
    this.year = year;
  }

    
  @JsonProperty("month")
  public Integer getMonth() {
    return month;
  }
  public void setMonth(Integer month) {
    this.month = month;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest = (GenerateGoodsRealizationReportRequest) o;
    return Objects.equals(campaignId, generateGoodsRealizationReportRequest.campaignId) &&
        Objects.equals(year, generateGoodsRealizationReportRequest.year) &&
        Objects.equals(month, generateGoodsRealizationReportRequest.month);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, year, month);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateGoodsRealizationReportRequest {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
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
