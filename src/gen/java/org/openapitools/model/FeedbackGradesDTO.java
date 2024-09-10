package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FeedbackFactorDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.")
public class FeedbackGradesDTO   {
  
  private BigDecimal average;

  private Long agreeCount;

  private Long rejectCount;

  private List<@Valid FeedbackFactorDTO> factors = new ArrayList<>();

  /**
   * Общая оценка, указанная в отзыве: от &#x60;1&#x60; («Ужасный магазин») до &#x60;5&#x60; («Отличный магазин»).
   **/
  public FeedbackGradesDTO average(BigDecimal average) {
    this.average = average;
    return this;
  }

  
  @ApiModelProperty(value = "Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).")
  @JsonProperty("average")
  public BigDecimal getAverage() {
    return average;
  }
  public void setAverage(BigDecimal average) {
    this.average = average;
  }


  /**
   * Количество пользователей, считающих отзыв полезным.
   **/
  public FeedbackGradesDTO agreeCount(Long agreeCount) {
    this.agreeCount = agreeCount;
    return this;
  }

  
  @ApiModelProperty(value = "Количество пользователей, считающих отзыв полезным.")
  @JsonProperty("agreeCount")
  public Long getAgreeCount() {
    return agreeCount;
  }
  public void setAgreeCount(Long agreeCount) {
    this.agreeCount = agreeCount;
  }


  /**
   * Количество пользователей, считающих отзыв бесполезным.
   **/
  public FeedbackGradesDTO rejectCount(Long rejectCount) {
    this.rejectCount = rejectCount;
    return this;
  }

  
  @ApiModelProperty(value = "Количество пользователей, считающих отзыв бесполезным.")
  @JsonProperty("rejectCount")
  public Long getRejectCount() {
    return rejectCount;
  }
  public void setRejectCount(Long rejectCount) {
    this.rejectCount = rejectCount;
  }


  /**
   * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор. 
   **/
  public FeedbackGradesDTO factors(List<@Valid FeedbackFactorDTO> factors) {
    this.factors = factors;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. ")
  @JsonProperty("factors")
  @NotNull
  public List<@Valid FeedbackFactorDTO> getFactors() {
    return factors;
  }
  public void setFactors(List<@Valid FeedbackFactorDTO> factors) {
    this.factors = factors;
  }

  public FeedbackGradesDTO addFactorsItem(FeedbackFactorDTO factorsItem) {
    if (this.factors == null) {
      this.factors = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

