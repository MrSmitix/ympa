package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BidRecommendationItemDTO;
import org.openapitools.model.PriceRecommendationItemDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Список товаров с рекомендованными ставками.
 **/
@ApiModel(description = "Список товаров с рекомендованными ставками.")
@JsonTypeName("SkuBidRecommendationItemDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SkuBidRecommendationItemDTO   {
  private String sku;
  private Integer bid;
  private @Valid List<@Valid BidRecommendationItemDTO> bidRecommendations;
  private @Valid List<@Valid PriceRecommendationItemDTO> priceRecommendations;

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  public SkuBidRecommendationItemDTO sku(String sku) {
    this.sku = sku;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("sku")
  @NotNull  @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)public String getSku() {
    return sku;
  }

  @JsonProperty("sku")
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
  @NotNull  @Min(0) @Max(9999)public Integer getBid() {
    return bid;
  }

  @JsonProperty("bid")
  public void setBid(Integer bid) {
    this.bid = bid;
  }

  /**
   * Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. 
   **/
  public SkuBidRecommendationItemDTO bidRecommendations(List<@Valid BidRecommendationItemDTO> bidRecommendations) {
    this.bidRecommendations = bidRecommendations;
    return this;
  }

  
  @ApiModelProperty(value = "Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. ")
  @JsonProperty("bidRecommendations")
  @Valid public List<@Valid BidRecommendationItemDTO> getBidRecommendations() {
    return bidRecommendations;
  }

  @JsonProperty("bidRecommendations")
  public void setBidRecommendations(List<@Valid BidRecommendationItemDTO> bidRecommendations) {
    this.bidRecommendations = bidRecommendations;
  }

  public SkuBidRecommendationItemDTO addBidRecommendationsItem(BidRecommendationItemDTO bidRecommendationsItem) {
    if (this.bidRecommendations == null) {
      this.bidRecommendations = new ArrayList<>();
    }

    this.bidRecommendations.add(bidRecommendationsItem);
    return this;
  }

  public SkuBidRecommendationItemDTO removeBidRecommendationsItem(BidRecommendationItemDTO bidRecommendationsItem) {
    if (bidRecommendationsItem != null && this.bidRecommendations != null) {
      this.bidRecommendations.remove(bidRecommendationsItem);
    }

    return this;
  }
  /**
   * Рекомендованные цены.
   **/
  public SkuBidRecommendationItemDTO priceRecommendations(List<@Valid PriceRecommendationItemDTO> priceRecommendations) {
    this.priceRecommendations = priceRecommendations;
    return this;
  }

  
  @ApiModelProperty(value = "Рекомендованные цены.")
  @JsonProperty("priceRecommendations")
  @Valid public List<@Valid PriceRecommendationItemDTO> getPriceRecommendations() {
    return priceRecommendations;
  }

  @JsonProperty("priceRecommendations")
  public void setPriceRecommendations(List<@Valid PriceRecommendationItemDTO> priceRecommendations) {
    this.priceRecommendations = priceRecommendations;
  }

  public SkuBidRecommendationItemDTO addPriceRecommendationsItem(PriceRecommendationItemDTO priceRecommendationsItem) {
    if (this.priceRecommendations == null) {
      this.priceRecommendations = new ArrayList<>();
    }

    this.priceRecommendations.add(priceRecommendationsItem);
    return this;
  }

  public SkuBidRecommendationItemDTO removePriceRecommendationsItem(PriceRecommendationItemDTO priceRecommendationsItem) {
    if (priceRecommendationsItem != null && this.priceRecommendations != null) {
      this.priceRecommendations.remove(priceRecommendationsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

