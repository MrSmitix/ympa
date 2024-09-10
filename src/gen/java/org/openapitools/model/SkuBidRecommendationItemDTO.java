package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BidRecommendationItemDTO;
import org.openapitools.model.PriceRecommendationItemDTO;



/**
 * Список товаров с рекомендованными ставками.
 **/

@ApiModel(description = "Список товаров с рекомендованными ставками.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SkuBidRecommendationItemDTO   {
  @JsonProperty("sku")
  private String sku;

  @JsonProperty("bid")
  private Integer bid;

  @JsonProperty("bidRecommendations")
  private List<BidRecommendationItemDTO> bidRecommendations = null;

  @JsonProperty("priceRecommendations")
  private List<PriceRecommendationItemDTO> priceRecommendations = null;

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  public SkuBidRecommendationItemDTO sku(String sku) {
    this.sku = sku;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("sku")
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
  public SkuBidRecommendationItemDTO bid(Integer bid) {
    this.bid = bid;
    return this;
  }

  
  @ApiModelProperty(example = "570", required = true, value = "Значение ставки.")
  @JsonProperty("bid")
  public Integer getBid() {
    return bid;
  }
  public void setBid(Integer bid) {
    this.bid = bid;
  }

  /**
   * Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. 
   **/
  public SkuBidRecommendationItemDTO bidRecommendations(List<BidRecommendationItemDTO> bidRecommendations) {
    this.bidRecommendations = bidRecommendations;
    return this;
  }

  
  @ApiModelProperty(value = "Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. ")
  @JsonProperty("bidRecommendations")
  public List<BidRecommendationItemDTO> getBidRecommendations() {
    return bidRecommendations;
  }
  public void setBidRecommendations(List<BidRecommendationItemDTO> bidRecommendations) {
    this.bidRecommendations = bidRecommendations;
  }

  /**
   * Рекомендованные цены.
   **/
  public SkuBidRecommendationItemDTO priceRecommendations(List<PriceRecommendationItemDTO> priceRecommendations) {
    this.priceRecommendations = priceRecommendations;
    return this;
  }

  
  @ApiModelProperty(value = "Рекомендованные цены.")
  @JsonProperty("priceRecommendations")
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
    return Objects.equals(sku, skuBidRecommendationItemDTO.sku) &&
        Objects.equals(bid, skuBidRecommendationItemDTO.bid) &&
        Objects.equals(bidRecommendations, skuBidRecommendationItemDTO.bidRecommendations) &&
        Objects.equals(priceRecommendations, skuBidRecommendationItemDTO.priceRecommendations);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

