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

package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CalculateTariffsOfferDTO;
import org.openapitools.server.model.CalculatedTariffDTO;
import java.lang.reflect.Type;
import javax.json.bind.annotation.JsonbTypeDeserializer;
import javax.json.bind.annotation.JsonbTypeSerializer;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.bind.annotation.JsonbProperty;

/**
  * Стоимость услуг.
  */

public class CalculateTariffsOfferInfoDTO  {
  
  @JsonbProperty("offer")
  private CalculateTariffsOfferDTO offer;

 /**
  * Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
  */
  @JsonbProperty("tariffs")
  private List<CalculatedTariffDTO> tariffs = new ArrayList<>();

  /**
   * Get offer
   * @return offer
   **/
  public CalculateTariffsOfferDTO getOffer() {
    return offer;
  }

  /**
   * Set offer
   */
  public void setOffer(CalculateTariffsOfferDTO offer) {
    this.offer = offer;
  }

  public CalculateTariffsOfferInfoDTO offer(CalculateTariffsOfferDTO offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
   * @return tariffs
   **/
  public List<CalculatedTariffDTO> getTariffs() {
    return tariffs;
  }

  /**
   * Set tariffs
   */
  public void setTariffs(List<CalculatedTariffDTO> tariffs) {
    this.tariffs = tariffs;
  }

  public CalculateTariffsOfferInfoDTO tariffs(List<CalculatedTariffDTO> tariffs) {
    this.tariffs = tariffs;
    return this;
  }

  public CalculateTariffsOfferInfoDTO addTariffsItem(CalculatedTariffDTO tariffsItem) {
    if (this.tariffs == null) {
      this.tariffs = new ArrayList<>();
    }
    this.tariffs.add(tariffsItem);
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculateTariffsOfferInfoDTO {\n");
    
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    tariffs: ").append(toIndentedString(tariffs)).append("\n");
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

