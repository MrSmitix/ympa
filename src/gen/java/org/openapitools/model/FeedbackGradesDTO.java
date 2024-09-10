package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FeedbackFactorDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
 */
@ApiModel(description="Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.")

public class FeedbackGradesDTO  {
  
 /**
  * Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).
  */
  @ApiModelProperty(value = "Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).")
  @Valid
  private BigDecimal average;

 /**
  * Количество пользователей, считающих отзыв полезным.
  */
  @ApiModelProperty(value = "Количество пользователей, считающих отзыв полезным.")
  private Long agreeCount;

 /**
  * Количество пользователей, считающих отзыв бесполезным.
  */
  @ApiModelProperty(value = "Количество пользователей, считающих отзыв бесполезным.")
  private Long rejectCount;

 /**
  * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
  */
  @ApiModelProperty(required = true, value = "Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. ")
  @Valid
  private List<@Valid FeedbackFactorDTO> factors = new ArrayList<>();
 /**
  * Общая оценка, указанная в отзыве: от &#x60;1&#x60; («Ужасный магазин») до &#x60;5&#x60; («Отличный магазин»).
  * @return average
  */
  @JsonProperty("average")
  public BigDecimal getAverage() {
    return average;
  }

  /**
   * Sets the <code>average</code> property.
   */
 public void setAverage(BigDecimal average) {
    this.average = average;
  }

  /**
   * Sets the <code>average</code> property.
   */
  public FeedbackGradesDTO average(BigDecimal average) {
    this.average = average;
    return this;
  }

 /**
  * Количество пользователей, считающих отзыв полезным.
  * @return agreeCount
  */
  @JsonProperty("agreeCount")
  public Long getAgreeCount() {
    return agreeCount;
  }

  /**
   * Sets the <code>agreeCount</code> property.
   */
 public void setAgreeCount(Long agreeCount) {
    this.agreeCount = agreeCount;
  }

  /**
   * Sets the <code>agreeCount</code> property.
   */
  public FeedbackGradesDTO agreeCount(Long agreeCount) {
    this.agreeCount = agreeCount;
    return this;
  }

 /**
  * Количество пользователей, считающих отзыв бесполезным.
  * @return rejectCount
  */
  @JsonProperty("rejectCount")
  public Long getRejectCount() {
    return rejectCount;
  }

  /**
   * Sets the <code>rejectCount</code> property.
   */
 public void setRejectCount(Long rejectCount) {
    this.rejectCount = rejectCount;
  }

  /**
   * Sets the <code>rejectCount</code> property.
   */
  public FeedbackGradesDTO rejectCount(Long rejectCount) {
    this.rejectCount = rejectCount;
    return this;
  }

 /**
  * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор. 
  * @return factors
  */
  @JsonProperty("factors")
  @NotNull
  public List<@Valid FeedbackFactorDTO> getFactors() {
    return factors;
  }

  /**
   * Sets the <code>factors</code> property.
   */
 public void setFactors(List<@Valid FeedbackFactorDTO> factors) {
    this.factors = factors;
  }

  /**
   * Sets the <code>factors</code> property.
   */
  public FeedbackGradesDTO factors(List<@Valid FeedbackFactorDTO> factors) {
    this.factors = factors;
    return this;
  }

  /**
   * Adds a new item to the <code>factors</code> list.
   */
  public FeedbackGradesDTO addFactorsItem(FeedbackFactorDTO factorsItem) {
    this.factors.add(factorsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

