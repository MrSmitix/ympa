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
import org.openapitools.server.model.UpdatePromoOfferDTO;
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
  * Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. 
  */

public class UpdatePromoOffersRequest  {
  
 /**
  * Идентификатор акции.
  */
  @JsonbProperty("promoId")
  private String promoId;

 /**
  * Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
  */
  @JsonbProperty("offers")
  private List<UpdatePromoOfferDTO> offers = new ArrayList<>();

  /**
   * Идентификатор акции.
   * @return promoId
   **/
  public String getPromoId() {
    return promoId;
  }

  /**
   * Set promoId
   */
  public void setPromoId(String promoId) {
    this.promoId = promoId;
  }

  public UpdatePromoOffersRequest promoId(String promoId) {
    this.promoId = promoId;
    return this;
  }

  /**
   * Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
   * @return offers
   **/
  public List<UpdatePromoOfferDTO> getOffers() {
    return offers;
  }

  /**
   * Set offers
   */
  public void setOffers(List<UpdatePromoOfferDTO> offers) {
    this.offers = offers;
  }

  public UpdatePromoOffersRequest offers(List<UpdatePromoOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public UpdatePromoOffersRequest addOffersItem(UpdatePromoOfferDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePromoOffersRequest {\n");
    
    sb.append("    promoId: ").append(toIndentedString(promoId)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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

