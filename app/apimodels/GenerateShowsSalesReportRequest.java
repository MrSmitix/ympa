package apimodels;

import apimodels.ShowsSalesGroupingType;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Данные, необходимые для генерации отчета.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GenerateShowsSalesReportRequest   {
  @JsonProperty("businessId")
  
  private Long businessId;

  @JsonProperty("campaignId")
  
  private Long campaignId;

  @JsonProperty("dateFrom")
  @NotNull
@Valid

  private LocalDate dateFrom;

  @JsonProperty("dateTo")
  @NotNull
@Valid

  private LocalDate dateTo;

  @JsonProperty("grouping")
  @NotNull
@Valid

  private ShowsSalesGroupingType grouping;

  public GenerateShowsSalesReportRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

   /**
   * Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
   * @return businessId
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(businessId, generateShowsSalesReportRequest.businessId) &&
        Objects.equals(campaignId, generateShowsSalesReportRequest.campaignId) &&
        Objects.equals(dateFrom, generateShowsSalesReportRequest.dateFrom) &&
        Objects.equals(dateTo, generateShowsSalesReportRequest.dateTo) &&
        Objects.equals(grouping, generateShowsSalesReportRequest.grouping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, campaignId, dateFrom, dateTo, grouping);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

