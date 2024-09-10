package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
 **/
@ApiModel(description="Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. ")

public class GenerateGoodsRealizationReportRequest  {
  
  @ApiModelProperty(required = true, value = "Идентификатор кампании.")
 /**
   * Идентификатор кампании.
  **/
  private Long campaignId;

  @ApiModelProperty(required = true, value = "Год.")
 /**
   * Год.
  **/
  private Integer year;

  @ApiModelProperty(required = true, value = "Номер месяца.")
 /**
   * Номер месяца.
  **/
  private Integer month;
 /**
   * Идентификатор кампании.
   * @return campaignId
  **/
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public GenerateGoodsRealizationReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
   * Год.
   * @return year
  **/
  @JsonProperty("year")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public GenerateGoodsRealizationReportRequest year(Integer year) {
    this.year = year;
    return this;
  }

 /**
   * Номер месяца.
   * minimum: 1
   * maximum: 12
   * @return month
  **/
  @JsonProperty("month")
  public Integer getMonth() {
    return month;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }

  public GenerateGoodsRealizationReportRequest month(Integer month) {
    this.month = month;
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
    GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest = (GenerateGoodsRealizationReportRequest) o;
    return Objects.equals(this.campaignId, generateGoodsRealizationReportRequest.campaignId) &&
        Objects.equals(this.year, generateGoodsRealizationReportRequest.year) &&
        Objects.equals(this.month, generateGoodsRealizationReportRequest.month);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

