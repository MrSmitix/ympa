package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BidRecommendationItemDTO;
import org.openapitools.model.PriceRecommendationItemDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Список товаров с рекомендованными ставками.
 **/
@ApiModel(description="Список товаров с рекомендованными ставками.")

public class SkuBidRecommendationItemDTO  {
  
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
 /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  **/
  private String sku;

  @ApiModelProperty(example = "570", required = true, value = "Значение ставки.")
 /**
   * Значение ставки.
  **/
  private Integer bid;

  @ApiModelProperty(value = "Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. ")
 /**
   * Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. 
  **/
  private List<BidRecommendationItemDTO> bidRecommendations;

  @ApiModelProperty(value = "Рекомендованные цены.")
 /**
   * Рекомендованные цены.
  **/
  private List<PriceRecommendationItemDTO> priceRecommendations;
 /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return sku
  **/
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }

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
  @JsonProperty("bid")
  public Integer getBid() {
    return bid;
  }

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
  @JsonProperty("bidRecommendations")
  public List<BidRecommendationItemDTO> getBidRecommendations() {
    return bidRecommendations;
  }

  public void setBidRecommendations(List<BidRecommendationItemDTO> bidRecommendations) {
    this.bidRecommendations = bidRecommendations;
  }

  public SkuBidRecommendationItemDTO bidRecommendations(List<BidRecommendationItemDTO> bidRecommendations) {
    this.bidRecommendations = bidRecommendations;
    return this;
  }

  public SkuBidRecommendationItemDTO addBidRecommendationsItem(BidRecommendationItemDTO bidRecommendationsItem) {
    this.bidRecommendations.add(bidRecommendationsItem);
    return this;
  }

 /**
   * Рекомендованные цены.
   * @return priceRecommendations
  **/
  @JsonProperty("priceRecommendations")
  public List<PriceRecommendationItemDTO> getPriceRecommendations() {
    return priceRecommendations;
  }

  public void setPriceRecommendations(List<PriceRecommendationItemDTO> priceRecommendations) {
    this.priceRecommendations = priceRecommendations;
  }

  public SkuBidRecommendationItemDTO priceRecommendations(List<PriceRecommendationItemDTO> priceRecommendations) {
    this.priceRecommendations = priceRecommendations;
    return this;
  }

  public SkuBidRecommendationItemDTO addPriceRecommendationsItem(PriceRecommendationItemDTO priceRecommendationsItem) {
    this.priceRecommendations.add(priceRecommendationsItem);
    return this;
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
    return Objects.equals(this.sku, skuBidRecommendationItemDTO.sku) &&
        Objects.equals(this.bid, skuBidRecommendationItemDTO.bid) &&
        Objects.equals(this.bidRecommendations, skuBidRecommendationItemDTO.bidRecommendations) &&
        Objects.equals(this.priceRecommendations, skuBidRecommendationItemDTO.priceRecommendations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, bid, bidRecommendations, priceRecommendations);
  }

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

