/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.EacVerificationStatusType;



/**
 * Результат выполнения запроса.
 */

@ApiModel(description = "Результат выполнения запроса.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class EacVerificationResultDTO   {
  
  private EacVerificationStatusType verificationResult;
  private Integer attemptsLeft;

  /**
   */
  public EacVerificationResultDTO verificationResult(EacVerificationStatusType verificationResult) {
    this.verificationResult = verificationResult;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("verificationResult")
  public EacVerificationStatusType getVerificationResult() {
    return verificationResult;
  }
  public void setVerificationResult(EacVerificationStatusType verificationResult) {
    this.verificationResult = verificationResult;
  }

  /**
   * Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. 
   */
  public EacVerificationResultDTO attemptsLeft(Integer attemptsLeft) {
    this.attemptsLeft = attemptsLeft;
    return this;
  }

  
  @ApiModelProperty(value = "Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. ")
  @JsonProperty("attemptsLeft")
  public Integer getAttemptsLeft() {
    return attemptsLeft;
  }
  public void setAttemptsLeft(Integer attemptsLeft) {
    this.attemptsLeft = attemptsLeft;
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
    return Objects.equals(verificationResult, eacVerificationResultDTO.verificationResult) &&
        Objects.equals(attemptsLeft, eacVerificationResultDTO.attemptsLeft);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

