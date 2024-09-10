package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BidRecommendationItemDTO;
import org.openapitools.model.PriceRecommendationItemDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список товаров с рекомендованными ставками.
 */
@ApiModel(description="Список товаров с рекомендованными ставками.")

public class SkuBidRecommendationItemDTO  {
  
 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  */
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  private String sku;

 /**
  * Значение ставки.
  */
  @ApiModelProperty(example = "570", required = true, value = "Значение ставки.")
  private Integer bid;

 /**
  * Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. 
  */
  @ApiModelProperty(value = "Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. ")
  @Valid
  private List<@Valid BidRecommendationItemDTO> bidRecommendations;

 /**
  * Рекомендованные цены.
  */
  @ApiModelProperty(value = "Рекомендованные цены.")
  @Valid
  private List<@Valid PriceRecommendationItemDTO> priceRecommendations;
 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  * @return sku
  */
  @JsonProperty("sku")
  @NotNull
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getSku() {
    return sku;
  }

  /**
   * Sets the <code>sku</code> property.
   */
 public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * Sets the <code>sku</code> property.
   */
  public SkuBidRecommendationItemDTO sku(String sku) {
    this.sku = sku;
    return this;
  }

 /**
  * Значение ставки.
  * minimum: 0
  * maximum: 9999
  * @return bid
  */
  @JsonProperty("bid")
  @NotNull
 @Min(0) @Max(9999)  public Integer getBid() {
    return bid;
  }

  /**
   * Sets the <code>bid</code> property.
   */
 public void setBid(Integer bid) {
    this.bid = bid;
  }

  /**
   * Sets the <code>bid</code> property.
   */
  public SkuBidRecommendationItemDTO bid(Integer bid) {
    this.bid = bid;
    return this;
  }

 /**
  * Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. 
  * @return bidRecommendations
  */
  @JsonProperty("bidRecommendations")
  public List<@Valid BidRecommendationItemDTO> getBidRecommendations() {
    return bidRecommendations;
  }

  /**
   * Sets the <code>bidRecommendations</code> property.
   */
 public void setBidRecommendations(List<@Valid BidRecommendationItemDTO> bidRecommendations) {
    this.bidRecommendations = bidRecommendations;
  }

  /**
   * Sets the <code>bidRecommendations</code> property.
   */
  public SkuBidRecommendationItemDTO bidRecommendations(List<@Valid BidRecommendationItemDTO> bidRecommendations) {
    this.bidRecommendations = bidRecommendations;
    return this;
  }

  /**
   * Adds a new item to the <code>bidRecommendations</code> list.
   */
  public SkuBidRecommendationItemDTO addBidRecommendationsItem(BidRecommendationItemDTO bidRecommendationsItem) {
    this.bidRecommendations.add(bidRecommendationsItem);
    return this;
  }

 /**
  * Рекомендованные цены.
  * @return priceRecommendations
  */
  @JsonProperty("priceRecommendations")
  public List<@Valid PriceRecommendationItemDTO> getPriceRecommendations() {
    return priceRecommendations;
  }

  /**
   * Sets the <code>priceRecommendations</code> property.
   */
 public void setPriceRecommendations(List<@Valid PriceRecommendationItemDTO> priceRecommendations) {
    this.priceRecommendations = priceRecommendations;
  }

  /**
   * Sets the <code>priceRecommendations</code> property.
   */
  public SkuBidRecommendationItemDTO priceRecommendations(List<@Valid PriceRecommendationItemDTO> priceRecommendations) {
    this.priceRecommendations = priceRecommendations;
    return this;
  }

  /**
   * Adds a new item to the <code>priceRecommendations</code> list.
   */
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

