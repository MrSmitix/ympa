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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.OfferContentErrorDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.NoSuchElementException;



/**
  * Ошибки и предупреждения, которые появились из-за переданных характеристик.
 **/

public class UpdateOfferContentResultDTO  {
  
 /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  **/
  private String offerId;

 /**
   * Ошибки — информация в каталоге не обновится.
  **/
  private List<OfferContentErrorDTO> errors = null;

 /**
   * Предупреждения — информация в каталоге обновится.
  **/
  private List<OfferContentErrorDTO> warnings = null;

 /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
  **/
  public String getOfferId() {
    return offerId;
  }

  /**
    * Set offerId
  **/
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public UpdateOfferContentResultDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

 /**
   * Ошибки — информация в каталоге не обновится.
   * @return errors
  **/
  public List<OfferContentErrorDTO> getErrors() {
    return errors;
  }

  /**
    * Set errors
  **/
  public void setErrors(List<OfferContentErrorDTO> errors) {
    this.errors = errors;
  }

  public UpdateOfferContentResultDTO errors(List<OfferContentErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  public UpdateOfferContentResultDTO addErrorsItem(OfferContentErrorDTO errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
   * Предупреждения — информация в каталоге обновится.
   * @return warnings
  **/
  public List<OfferContentErrorDTO> getWarnings() {
    return warnings;
  }

  /**
    * Set warnings
  **/
  public void setWarnings(List<OfferContentErrorDTO> warnings) {
    this.warnings = warnings;
  }

  public UpdateOfferContentResultDTO warnings(List<OfferContentErrorDTO> warnings) {
    this.warnings = warnings;
    return this;
  }

  public UpdateOfferContentResultDTO addWarningsItem(OfferContentErrorDTO warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferContentResultDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

