package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
 */
@ApiModel(description="Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. ")

public class GenerateGoodsRealizationReportRequest  {
  
 /**
  * Идентификатор кампании.
  */
  @ApiModelProperty(required = true, value = "Идентификатор кампании.")
  private Long campaignId;

 /**
  * Год.
  */
  @ApiModelProperty(required = true, value = "Год.")
  private Integer year;

 /**
  * Номер месяца.
  */
  @ApiModelProperty(required = true, value = "Номер месяца.")
  private Integer month;
 /**
  * Идентификатор кампании.
  * @return campaignId
  */
  @JsonProperty("campaignId")
  @NotNull
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
  public GenerateGoodsRealizationReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
  * Год.
  * @return year
  */
  @JsonProperty("year")
  @NotNull
  public Integer getYear() {
    return year;
  }

  /**
   * Sets the <code>year</code> property.
   */
 public void setYear(Integer year) {
    this.year = year;
  }

  /**
   * Sets the <code>year</code> property.
   */
  public GenerateGoodsRealizationReportRequest year(Integer year) {
    this.year = year;
    return this;
  }

 /**
  * Номер месяца.
  * minimum: 1
  * maximum: 12
  * @return month
  */
  @JsonProperty("month")
  @NotNull
 @Min(1) @Max(12)  public Integer getMonth() {
    return month;
  }

  /**
   * Sets the <code>month</code> property.
   */
 public void setMonth(Integer month) {
    this.month = month;
  }

  /**
   * Sets the <code>month</code> property.
   */
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

