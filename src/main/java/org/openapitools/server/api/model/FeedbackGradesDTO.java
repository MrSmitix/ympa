package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.FeedbackFactorDTO;

/**
 * Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedbackGradesDTO   {
  
  private BigDecimal average;
  private Long agreeCount;
  private Long rejectCount;
  private List<FeedbackFactorDTO> factors = new ArrayList<>();

  public FeedbackGradesDTO () {

  }

  public FeedbackGradesDTO (BigDecimal average, Long agreeCount, Long rejectCount, List<FeedbackFactorDTO> factors) {
    this.average = average;
    this.agreeCount = agreeCount;
    this.rejectCount = rejectCount;
    this.factors = factors;
  }

    
  @JsonProperty("average")
  public BigDecimal getAverage() {
    return average;
  }
  public void setAverage(BigDecimal average) {
    this.average = average;
  }

    
  @JsonProperty("agreeCount")
  public Long getAgreeCount() {
    return agreeCount;
  }
  public void setAgreeCount(Long agreeCount) {
    this.agreeCount = agreeCount;
  }

    
  @JsonProperty("rejectCount")
  public Long getRejectCount() {
    return rejectCount;
  }
  public void setRejectCount(Long rejectCount) {
    this.rejectCount = rejectCount;
  }

    
  @JsonProperty("factors")
  public List<FeedbackFactorDTO> getFactors() {
    return factors;
  }
  public void setFactors(List<FeedbackFactorDTO> factors) {
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
