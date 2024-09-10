package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FeedbackFactorDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
 */

@Schema(name = "FeedbackGradesDTO", description = "Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedbackGradesDTO {

  private BigDecimal average;

  private Long agreeCount;

  private Long rejectCount;

  @Valid
  private List<@Valid FeedbackFactorDTO> factors = new ArrayList<>();

  public FeedbackGradesDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FeedbackGradesDTO(List<@Valid FeedbackFactorDTO> factors) {
    this.factors = factors;
  }

  public FeedbackGradesDTO average(BigDecimal average) {
    this.average = average;
    return this;
  }

  /**
   * Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).
   * @return average
   */
  @Valid 
  @Schema(name = "average", description = "Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("average")
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
   */
  
  @Schema(name = "agreeCount", description = "Количество пользователей, считающих отзыв полезным.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("agreeCount")
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
   */
  
  @Schema(name = "rejectCount", description = "Количество пользователей, считающих отзыв бесполезным.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rejectCount")
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
   */
  @NotNull @Valid 
  @Schema(name = "factors", description = "Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("factors")
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
    return Objects.equals(this.average, feedbackGradesDTO.average) &&
        Objects.equals(this.agreeCount, feedbackGradesDTO.agreeCount) &&
        Objects.equals(this.rejectCount, feedbackGradesDTO.rejectCount) &&
        Objects.equals(this.factors, feedbackGradesDTO.factors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(average, agreeCount, rejectCount, factors);
  }

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
