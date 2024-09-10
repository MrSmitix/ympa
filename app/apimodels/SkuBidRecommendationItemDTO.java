package apimodels;

import apimodels.BidRecommendationItemDTO;
import apimodels.PriceRecommendationItemDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Список товаров с рекомендованными ставками.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SkuBidRecommendationItemDTO   {
  @JsonProperty("sku")
  @NotNull
@Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
@Size(min=1,max=255)

  private String sku;

  @JsonProperty("bid")
  @NotNull
@Min(0)
@Max(9999)

  private Integer bid;

  @JsonProperty("bidRecommendations")
  @Valid

  private List<@Valid BidRecommendationItemDTO> bidRecommendations = null;

  @JsonProperty("priceRecommendations")
  @Valid

  private List<@Valid PriceRecommendationItemDTO> priceRecommendations = null;

  public SkuBidRecommendationItemDTO sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return sku
  **/
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public SkuBidRecommendationItemDTO bid(Integer bid) {
    this.bid = bid;
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

  public void setBid(Integer bid) {
    this.bid = bid;
  }

  public SkuBidRecommendationItemDTO bidRecommendations(List<@Valid BidRecommendationItemDTO> bidRecommendations) {
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
   * Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. 
   * @return bidRecommendations
  **/
  public List<@Valid BidRecommendationItemDTO> getBidRecommendations() {
    return bidRecommendations;
  }

  public void setBidRecommendations(List<@Valid BidRecommendationItemDTO> bidRecommendations) {
    this.bidRecommendations = bidRecommendations;
  }

  public SkuBidRecommendationItemDTO priceRecommendations(List<@Valid PriceRecommendationItemDTO> priceRecommendations) {
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
   * Рекомендованные цены.
   * @return priceRecommendations
  **/
  public List<@Valid PriceRecommendationItemDTO> getPriceRecommendations() {
    return priceRecommendations;
  }

  public void setPriceRecommendations(List<@Valid PriceRecommendationItemDTO> priceRecommendations) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

