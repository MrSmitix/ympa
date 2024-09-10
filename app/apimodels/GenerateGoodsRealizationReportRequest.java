package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GenerateGoodsRealizationReportRequest   {
  @JsonProperty("campaignId")
  @NotNull

  private Long campaignId;

  @JsonProperty("year")
  @NotNull

  private Integer year;

  @JsonProperty("month")
  @NotNull
@Min(1)
@Max(12)

  private Integer month;

  public GenerateGoodsRealizationReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Идентификатор кампании.
   * @return campaignId
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

