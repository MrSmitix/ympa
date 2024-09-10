package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
 **/
@ApiModel(description = "Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. ")
@JsonTypeName("GenerateGoodsRealizationReportRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateGoodsRealizationReportRequest   {
  private Long campaignId;
  private Integer year;
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
  @NotNull public Long getCampaignId() {
    return campaignId;
  }

  @JsonProperty("campaignId")
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
  @NotNull public Integer getYear() {
    return year;
  }

  @JsonProperty("year")
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
  @NotNull  @Min(1) @Max(12)public Integer getMonth() {
    return month;
  }

  @JsonProperty("month")
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

