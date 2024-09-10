package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.EacVerificationStatusType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Результат выполнения запроса.
 **/
@ApiModel(description="Результат выполнения запроса.")

public class EacVerificationResultDTO  {
  
  @ApiModelProperty(value = "")
  private EacVerificationStatusType verificationResult;

  @ApiModelProperty(value = "Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. ")
 /**
   * Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. 
  **/
  private Integer attemptsLeft;
 /**
   * Get verificationResult
   * @return verificationResult
  **/
  @JsonProperty("verificationResult")
  public EacVerificationStatusType getVerificationResult() {
    return verificationResult;
  }

  public void setVerificationResult(EacVerificationStatusType verificationResult) {
    this.verificationResult = verificationResult;
  }

  public EacVerificationResultDTO verificationResult(EacVerificationStatusType verificationResult) {
    this.verificationResult = verificationResult;
    return this;
  }

 /**
   * Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. 
   * @return attemptsLeft
  **/
  @JsonProperty("attemptsLeft")
  public Integer getAttemptsLeft() {
    return attemptsLeft;
  }

  public void setAttemptsLeft(Integer attemptsLeft) {
    this.attemptsLeft = attemptsLeft;
  }

  public EacVerificationResultDTO attemptsLeft(Integer attemptsLeft) {
    this.attemptsLeft = attemptsLeft;
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
    EacVerificationResultDTO eacVerificationResultDTO = (EacVerificationResultDTO) o;
    return Objects.equals(this.verificationResult, eacVerificationResultDTO.verificationResult) &&
        Objects.equals(this.attemptsLeft, eacVerificationResultDTO.attemptsLeft);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationResult, attemptsLeft);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EacVerificationResultDTO {\n");
    
    sb.append("    verificationResult: ").append(toIndentedString(verificationResult)).append("\n");
    sb.append("    attemptsLeft: ").append(toIndentedString(attemptsLeft)).append("\n");
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

