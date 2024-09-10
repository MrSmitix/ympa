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
public class GenerateBoostConsolidatedRequest   {
  @JsonProperty("businessId")
  @NotNull

  private Long businessId;

  @JsonProperty("dateFrom")
  @NotNull
@Valid

  private LocalDate dateFrom;

  @JsonProperty("dateTo")
  @NotNull
@Valid

  private LocalDate dateTo;

  public GenerateBoostConsolidatedRequest businessId(Long businessId) {
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

  public GenerateBoostConsolidatedRequest dateFrom(LocalDate dateFrom) {
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

  public GenerateBoostConsolidatedRequest dateTo(LocalDate dateTo) {
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
    GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest = (GenerateBoostConsolidatedRequest) o;
    return Objects.equals(businessId, generateBoostConsolidatedRequest.businessId) &&
        Objects.equals(dateFrom, generateBoostConsolidatedRequest.dateFrom) &&
        Objects.equals(dateTo, generateBoostConsolidatedRequest.dateTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, dateFrom, dateTo);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateBoostConsolidatedRequest {\n");
    
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
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

