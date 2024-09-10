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
import org.openapitools.client.model.BidRecommendationItemDTO;
import org.openapitools.client.model.PriceRecommendationItemDTO;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Список товаров с рекомендованными ставками.
 **/
@ApiModel(description = "Список товаров с рекомендованными ставками.")
public class SkuBidRecommendationItemDTO {
  
  @SerializedName("sku")
  private String sku = null;
  @SerializedName("bid")
  private Integer bid = null;
  @SerializedName("bidRecommendations")
  private List<BidRecommendationItemDTO> bidRecommendations = null;
  @SerializedName("priceRecommendations")
  private List<PriceRecommendationItemDTO> priceRecommendations = null;

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * Значение ставки.
   * minimum: 0
   * maximum: 9999
   **/
  @ApiModelProperty(required = true, value = "Значение ставки.")
  public Integer getBid() {
    return bid;
  }
  public void setBid(Integer bid) {
    this.bid = bid;
  }

  /**
   * Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. 
   **/
  @ApiModelProperty(value = "Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. ")
  public List<BidRecommendationItemDTO> getBidRecommendations() {
    return bidRecommendations;
  }
  public void setBidRecommendations(List<BidRecommendationItemDTO> bidRecommendations) {
    this.bidRecommendations = bidRecommendations;
  }

  /**
   * Рекомендованные цены.
   **/
  @ApiModelProperty(value = "Рекомендованные цены.")
  public List<PriceRecommendationItemDTO> getPriceRecommendations() {
    return priceRecommendations;
  }
  public void setPriceRecommendations(List<PriceRecommendationItemDTO> priceRecommendations) {
    this.priceRecommendations = priceRecommendations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkuBidRecommendationItemDTO skuBidRecommendationItemDTO = (SkuBidRecommendationItemDTO) o;
    return (this.sku == null ? skuBidRecommendationItemDTO.sku == null : this.sku.equals(skuBidRecommendationItemDTO.sku)) &&
        (this.bid == null ? skuBidRecommendationItemDTO.bid == null : this.bid.equals(skuBidRecommendationItemDTO.bid)) &&
        (this.bidRecommendations == null ? skuBidRecommendationItemDTO.bidRecommendations == null : this.bidRecommendations.equals(skuBidRecommendationItemDTO.bidRecommendations)) &&
        (this.priceRecommendations == null ? skuBidRecommendationItemDTO.priceRecommendations == null : this.priceRecommendations.equals(skuBidRecommendationItemDTO.priceRecommendations));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sku == null ? 0: this.sku.hashCode());
    result = 31 * result + (this.bid == null ? 0: this.bid.hashCode());
    result = 31 * result + (this.bidRecommendations == null ? 0: this.bidRecommendations.hashCode());
    result = 31 * result + (this.priceRecommendations == null ? 0: this.priceRecommendations.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkuBidRecommendationItemDTO {\n");
    
    sb.append("  sku: ").append(sku).append("\n");
    sb.append("  bid: ").append(bid).append("\n");
    sb.append("  bidRecommendations: ").append(bidRecommendations).append("\n");
    sb.append("  priceRecommendations: ").append(priceRecommendations).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
