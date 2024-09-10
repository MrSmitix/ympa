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
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.BidRecommendationItemDTO;
import org.openapitools.server.model.PriceRecommendationItemDTO;
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
  * Список товаров с рекомендованными ставками.
  */

public class SkuBidRecommendationItemDTO  {
  
 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  */
  @JsonbProperty("sku")
  private String sku;

 /**
  * Значение ставки.
  */
  @JsonbProperty("bid")
  private Integer bid;

 /**
  * Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. 
  */
  @JsonbProperty("bidRecommendations")
  private List<BidRecommendationItemDTO> bidRecommendations = null;

 /**
  * Рекомендованные цены.
  */
  @JsonbProperty("priceRecommendations")
  private List<PriceRecommendationItemDTO> priceRecommendations = null;

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return sku
   **/
  public String getSku() {
    return sku;
  }

  /**
   * Set sku
   */
  public void setSku(String sku) {
    this.sku = sku;
  }

  public SkuBidRecommendationItemDTO sku(String sku) {
    this.sku = sku;
    return this;
  }

  /**
   * Значение ставки.
   * minimum: 0
   * maximum: 9999
   * @return bid
   **/
  public Integer getBid() {
    return bid;
  }

  /**
   * Set bid
   */
  public void setBid(Integer bid) {
    this.bid = bid;
  }

  public SkuBidRecommendationItemDTO bid(Integer bid) {
    this.bid = bid;
    return this;
  }

  /**
   * Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. 
   * @return bidRecommendations
   **/
  public List<BidRecommendationItemDTO> getBidRecommendations() {
    return bidRecommendations;
  }

  /**
   * Set bidRecommendations
   */
  public void setBidRecommendations(List<BidRecommendationItemDTO> bidRecommendations) {
    this.bidRecommendations = bidRecommendations;
  }

  public SkuBidRecommendationItemDTO bidRecommendations(List<BidRecommendationItemDTO> bidRecommendations) {
    this.bidRecommendations = bidRecommendations;
    return this;
  }

  public SkuBidRecommendationItemDTO addBidRecommendationsItem(BidRecommendationItemDTO bidRecommendationsItem) {
    if (this.bidRecommendations == null) {
      this.bidRecommendations = new ArrayList<>();
    }
    this.bidRecommendations.add(bidRecommendationsItem);
    return this;
  }

  /**
   * Рекомендованные цены.
   * @return priceRecommendations
   **/
  public List<PriceRecommendationItemDTO> getPriceRecommendations() {
    return priceRecommendations;
  }

  /**
   * Set priceRecommendations
   */
  public void setPriceRecommendations(List<PriceRecommendationItemDTO> priceRecommendations) {
    this.priceRecommendations = priceRecommendations;
  }

  public SkuBidRecommendationItemDTO priceRecommendations(List<PriceRecommendationItemDTO> priceRecommendations) {
    this.priceRecommendations = priceRecommendations;
    return this;
  }

  public SkuBidRecommendationItemDTO addPriceRecommendationsItem(PriceRecommendationItemDTO priceRecommendationsItem) {
    if (this.priceRecommendations == null) {
      this.priceRecommendations = new ArrayList<>();
    }
    this.priceRecommendations.add(priceRecommendationsItem);
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkuBidRecommendationItemDTO {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    bidRecommendations: ").append(toIndentedString(bidRecommendations)).append("\n");
    sb.append("    priceRecommendations: ").append(toIndentedString(priceRecommendations)).append("\n");
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

