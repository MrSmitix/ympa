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

import java.util.*;
import org.openapitools.client.model.BasePriceDTO;
import org.openapitools.client.model.PriceQuarantineVerdictDTO;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Товар в карантине.
 **/
@ApiModel(description = "Товар в карантине.")
public class QuarantineOfferDTO {
  
  @SerializedName("offerId")
  private String offerId = null;
  @SerializedName("currentPrice")
  private BasePriceDTO currentPrice = null;
  @SerializedName("lastValidPrice")
  private BasePriceDTO lastValidPrice = null;
  @SerializedName("verdicts")
  private List<PriceQuarantineVerdictDTO> verdicts = null;

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BasePriceDTO getCurrentPrice() {
    return currentPrice;
  }
  public void setCurrentPrice(BasePriceDTO currentPrice) {
    this.currentPrice = currentPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BasePriceDTO getLastValidPrice() {
    return lastValidPrice;
  }
  public void setLastValidPrice(BasePriceDTO lastValidPrice) {
    this.lastValidPrice = lastValidPrice;
  }

  /**
   * Причины попадания товара в карантин.
   **/
  @ApiModelProperty(value = "Причины попадания товара в карантин.")
  public List<PriceQuarantineVerdictDTO> getVerdicts() {
    return verdicts;
  }
  public void setVerdicts(List<PriceQuarantineVerdictDTO> verdicts) {
    this.verdicts = verdicts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuarantineOfferDTO quarantineOfferDTO = (QuarantineOfferDTO) o;
    return (this.offerId == null ? quarantineOfferDTO.offerId == null : this.offerId.equals(quarantineOfferDTO.offerId)) &&
        (this.currentPrice == null ? quarantineOfferDTO.currentPrice == null : this.currentPrice.equals(quarantineOfferDTO.currentPrice)) &&
        (this.lastValidPrice == null ? quarantineOfferDTO.lastValidPrice == null : this.lastValidPrice.equals(quarantineOfferDTO.lastValidPrice)) &&
        (this.verdicts == null ? quarantineOfferDTO.verdicts == null : this.verdicts.equals(quarantineOfferDTO.verdicts));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.offerId == null ? 0: this.offerId.hashCode());
    result = 31 * result + (this.currentPrice == null ? 0: this.currentPrice.hashCode());
    result = 31 * result + (this.lastValidPrice == null ? 0: this.lastValidPrice.hashCode());
    result = 31 * result + (this.verdicts == null ? 0: this.verdicts.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuarantineOfferDTO {\n");
    
    sb.append("  offerId: ").append(offerId).append("\n");
    sb.append("  currentPrice: ").append(currentPrice).append("\n");
    sb.append("  lastValidPrice: ").append(lastValidPrice).append("\n");
    sb.append("  verdicts: ").append(verdicts).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
