package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
 **/

@ApiModel(description = "Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateGoodsRealizationReportRequest   {
  @JsonProperty("campaignId")
  private Long campaignId;

  @JsonProperty("year")
  private Integer year;

  @JsonProperty("month")
  private Integer month;

  /**
   * Идентификатор кампании.
   **/
  public GenerateGoodsRealizationReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор кампании.")
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Год.
   **/
  public GenerateGoodsRealizationReportRequest year(Integer year) {
    this.year = year;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Год.")
  @JsonProperty("year")
  public Integer getYear() {
    return year;
  }
  public void setYear(Integer year) {
    this.year = year;
  }

  /**
   * Номер месяца.
   * minimum: 1
   * maximum: 12
   **/
  public GenerateGoodsRealizationReportRequest month(Integer month) {
    this.month = month;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Номер месяца.")
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

