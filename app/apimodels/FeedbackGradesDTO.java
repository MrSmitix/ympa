package apimodels;

import apimodels.FeedbackFactorDTO;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FeedbackGradesDTO   {
  @JsonProperty("average")
  @Valid

  private BigDecimal average;

  @JsonProperty("agreeCount")
  
  private Long agreeCount;

  @JsonProperty("rejectCount")
  
  private Long rejectCount;

  @JsonProperty("factors")
  @NotNull
@Valid

  private List<@Valid FeedbackFactorDTO> factors = new ArrayList<>();

  public FeedbackGradesDTO average(BigDecimal average) {
    this.average = average;
    return this;
  }

   /**
   * Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).
   * @return average
  **/
  public BigDecimal getAverage() {
    return average;
  }

  public void setAverage(BigDecimal average) {
    this.average = average;
  }

  public FeedbackGradesDTO agreeCount(Long agreeCount) {
    this.agreeCount = agreeCount;
    return this;
  }

   /**
   * Количество пользователей, считающих отзыв полезным.
   * @return agreeCount
  **/
  public Long getAgreeCount() {
    return agreeCount;
  }

  public void setAgreeCount(Long agreeCount) {
    this.agreeCount = agreeCount;
  }

  public FeedbackGradesDTO rejectCount(Long rejectCount) {
    this.rejectCount = rejectCount;
    return this;
  }

   /**
   * Количество пользователей, считающих отзыв бесполезным.
   * @return rejectCount
  **/
  public Long getRejectCount() {
    return rejectCount;
  }

  public void setRejectCount(Long rejectCount) {
    this.rejectCount = rejectCount;
  }

  public FeedbackGradesDTO factors(List<@Valid FeedbackFactorDTO> factors) {
    this.factors = factors;
    return this;
  }

  public FeedbackGradesDTO addFactorsItem(FeedbackFactorDTO factorsItem) {
    if (this.factors == null) {
      this.factors = new ArrayList<>();
    }
    this.factors.add(factorsItem);
    return this;
  }

   /**
   * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
   * @return factors
  **/
  public List<@Valid FeedbackFactorDTO> getFactors() {
    return factors;
  }

  public void setFactors(List<@Valid FeedbackFactorDTO> factors) {
    this.factors = factors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedbackGradesDTO feedbackGradesDTO = (FeedbackGradesDTO) o;
    return Objects.equals(average, feedbackGradesDTO.average) &&
        Objects.equals(agreeCount, feedbackGradesDTO.agreeCount) &&
        Objects.equals(rejectCount, feedbackGradesDTO.rejectCount) &&
        Objects.equals(factors, feedbackGradesDTO.factors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(average, agreeCount, rejectCount, factors);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackGradesDTO {\n");
    
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    agreeCount: ").append(toIndentedString(agreeCount)).append("\n");
    sb.append("    rejectCount: ").append(toIndentedString(rejectCount)).append("\n");
    sb.append("    factors: ").append(toIndentedString(factors)).append("\n");
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

