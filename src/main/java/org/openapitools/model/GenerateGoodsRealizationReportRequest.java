package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
 */

@Schema(name = "GenerateGoodsRealizationReportRequest", description = "Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateGoodsRealizationReportRequest {

  private Long campaignId;

  private Integer year;

  private Integer month;

  public GenerateGoodsRealizationReportRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GenerateGoodsRealizationReportRequest(Long campaignId, Integer year, Integer month) {
    this.campaignId = campaignId;
    this.year = year;
    this.month = month;
  }

  public GenerateGoodsRealizationReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Идентификатор кампании.
   * @return campaignId
   */
  @NotNull 
  @Schema(name = "campaignId", description = "Идентификатор кампании.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("campaignId")
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
  @NotNull 
  @Schema(name = "year", description = "Год.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("year")
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
  @NotNull @Min(1) @Max(12) 
  @Schema(name = "month", description = "Номер месяца.", requiredMode = Schema.RequiredMode.REQUIRED)
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

