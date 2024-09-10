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

import org.openapitools.client.model.AddOffersToArchiveErrorType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Товар, который не удалось поместить в архив.
 **/
@ApiModel(description = "Товар, который не удалось поместить в архив.")
public class AddOffersToArchiveErrorDTO {
  
  @SerializedName("offerId")
  private String offerId = null;
  @SerializedName("error")
  private AddOffersToArchiveErrorType error = null;

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public AddOffersToArchiveErrorType getError() {
    return error;
  }
  public void setError(AddOffersToArchiveErrorType error) {
    this.error = error;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddOffersToArchiveErrorDTO addOffersToArchiveErrorDTO = (AddOffersToArchiveErrorDTO) o;
    return (this.offerId == null ? addOffersToArchiveErrorDTO.offerId == null : this.offerId.equals(addOffersToArchiveErrorDTO.offerId)) &&
        (this.error == null ? addOffersToArchiveErrorDTO.error == null : this.error.equals(addOffersToArchiveErrorDTO.error));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.offerId == null ? 0: this.offerId.hashCode());
    result = 31 * result + (this.error == null ? 0: this.error.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOffersToArchiveErrorDTO {\n");
    
    sb.append("  offerId: ").append(offerId).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
