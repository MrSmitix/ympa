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
import org.openapitools.server.model.GetCampaignOfferDTO;
import org.openapitools.server.model.ScrollingPagerDTO;
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
  * Список товаров в заданном магазине.
  */

public class GetCampaignOffersResultDTO  {
  
  @JsonbProperty("paging")
  private ScrollingPagerDTO paging;

 /**
  * Страница списка товаров.
  */
  @JsonbProperty("offers")
  private List<GetCampaignOfferDTO> offers = new ArrayList<>();

  /**
   * Get paging
   * @return paging
   **/
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  /**
   * Set paging
   */
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public GetCampaignOffersResultDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Страница списка товаров.
   * @return offers
   **/
  public List<GetCampaignOfferDTO> getOffers() {
    return offers;
  }

  /**
   * Set offers
   */
  public void setOffers(List<GetCampaignOfferDTO> offers) {
    this.offers = offers;
  }

  public GetCampaignOffersResultDTO offers(List<GetCampaignOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public GetCampaignOffersResultDTO addOffersItem(GetCampaignOfferDTO offersItem) {
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
    sb.append("class GetCampaignOffersResultDTO {\n");
    
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

