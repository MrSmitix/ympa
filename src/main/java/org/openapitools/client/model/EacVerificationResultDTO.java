/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.client.model.EacVerificationStatusType;



/**
  * Результат выполнения запроса.
 **/

public class EacVerificationResultDTO  {
  
  private EacVerificationStatusType verificationResult;

 /**
   * Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. 
  **/
  private Integer attemptsLeft;

 /**
   * Get verificationResult
   * @return verificationResult
  **/
  public EacVerificationStatusType getVerificationResult() {
    return verificationResult;
  }

  /**
    * Set verificationResult
  **/
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
  public Integer getAttemptsLeft() {
    return attemptsLeft;
  }

  /**
    * Set attemptsLeft
  **/
  public void setAttemptsLeft(Integer attemptsLeft) {
    this.attemptsLeft = attemptsLeft;
  }

  public EacVerificationResultDTO attemptsLeft(Integer attemptsLeft) {
    this.attemptsLeft = attemptsLeft;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
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

