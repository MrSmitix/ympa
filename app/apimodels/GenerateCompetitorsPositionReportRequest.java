package apimodels;

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
public class GenerateCompetitorsPositionReportRequest   {
  @JsonProperty("businessId")
  @NotNull

  private Long businessId;

  @JsonProperty("categoryId")
  @NotNull

  private Long categoryId;

  @JsonProperty("dateFrom")
  @NotNull
@Valid

  private LocalDate dateFrom;

  @JsonProperty("dateTo")
  @NotNull
@Valid

  private LocalDate dateTo;

  public GenerateCompetitorsPositionReportRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

   /**
   * Идентификатор бизнеса.
   * @return businessId
  **/
  public Long getBusinessId() {
    return businessId;
  }

  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  public GenerateCompetitorsPositionReportRequest categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Идентификатор категории.
   * @return categoryId
  **/
  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public GenerateCompetitorsPositionReportRequest dateFrom(LocalDate dateFrom) {
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

  public GenerateCompetitorsPositionReportRequest dateTo(LocalDate dateTo) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest = (GenerateCompetitorsPositionReportRequest) o;
    return Objects.equals(businessId, generateCompetitorsPositionReportRequest.businessId) &&
        Objects.equals(categoryId, generateCompetitorsPositionReportRequest.categoryId) &&
        Objects.equals(dateFrom, generateCompetitorsPositionReportRequest.dateFrom) &&
        Objects.equals(dateTo, generateCompetitorsPositionReportRequest.dateTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, categoryId, dateFrom, dateTo);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateCompetitorsPositionReportRequest {\n");
    
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
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

