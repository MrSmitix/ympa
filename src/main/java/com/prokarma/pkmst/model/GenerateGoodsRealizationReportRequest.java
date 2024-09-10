package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
 */
@ApiModel(description = "Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateGoodsRealizationReportRequest   {
  @JsonProperty("campaignId")
  private Long campaignId;

  @JsonProperty("year")
  private Integer year;

  @JsonProperty("month")
  private Integer month;

  public GenerateGoodsRealizationReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Идентификатор кампании.
   * @return campaignId
   */
  @ApiModelProperty(required = true, value = "Идентификатор кампании.")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public GenerateGoodsRealizationReportRequest year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Год.
   * @return year
   */
  @ApiModelProperty(required = true, value = "Год.")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public GenerateGoodsRealizationReportRequest month(Integer month) {
    this.month = month;
    return this;
  }

  /**
   * Номер месяца.
   * minimum: 1
   * maximum: 12
   * @return month
   */
  @ApiModelProperty(required = true, value = "Номер месяца.")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

