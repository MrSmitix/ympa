package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BidRecommendationItemDTO;
import org.openapitools.model.PriceRecommendationItemDTO;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Список товаров с рекомендованными ставками.
 */

@Schema(name = "SkuBidRecommendationItemDTO", description = "Список товаров с рекомендованными ставками.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SkuBidRecommendationItemDTO {

  private String sku;

  private Integer bid;

  @Valid
  private JsonNullable<List<@Valid BidRecommendationItemDTO>> bidRecommendations = JsonNullable.<List<@Valid BidRecommendationItemDTO>>undefined();

  @Valid
  private JsonNullable<List<@Valid PriceRecommendationItemDTO>> priceRecommendations = JsonNullable.<List<@Valid PriceRecommendationItemDTO>>undefined();

  public SkuBidRecommendationItemDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SkuBidRecommendationItemDTO(String sku, Integer bid) {
    this.sku = sku;
    this.bid = bid;
  }

  public SkuBidRecommendationItemDTO sku(String sku) {
    this.sku = sku;
    return this;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return sku
   */
  @NotNull @Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min = 1, max = 255) 
  @Schema(name = "sku", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sku")
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
   */
  @NotNull @Min(0) @Max(9999) 
  @Schema(name = "bid", example = "570", description = "Значение ставки.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bid")
  public Integer getBid() {
    return bid;
  }

  public void setBid(Integer bid) {
    this.bid = bid;
  }

  public SkuBidRecommendationItemDTO bidRecommendations(List<@Valid BidRecommendationItemDTO> bidRecommendations) {
    this.bidRecommendations = JsonNullable.of(bidRecommendations);
    return this;
  }

  public SkuBidRecommendationItemDTO addBidRecommendationsItem(BidRecommendationItemDTO bidRecommendationsItem) {
    if (this.bidRecommendations == null || !this.bidRecommendations.isPresent()) {
      this.bidRecommendations = JsonNullable.of(new ArrayList<>());
    }
    this.bidRecommendations.get().add(bidRecommendationsItem);
    return this;
  }

  /**
   * Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. 
   * @return bidRecommendations
   */
  @Valid 
  @Schema(name = "bidRecommendations", description = "Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bidRecommendations")
  public JsonNullable<List<@Valid BidRecommendationItemDTO>> getBidRecommendations() {
    return bidRecommendations;
  }

  public void setBidRecommendations(JsonNullable<List<@Valid BidRecommendationItemDTO>> bidRecommendations) {
    this.bidRecommendations = bidRecommendations;
  }

  public SkuBidRecommendationItemDTO priceRecommendations(List<@Valid PriceRecommendationItemDTO> priceRecommendations) {
    this.priceRecommendations = JsonNullable.of(priceRecommendations);
    return this;
  }

  public SkuBidRecommendationItemDTO addPriceRecommendationsItem(PriceRecommendationItemDTO priceRecommendationsItem) {
    if (this.priceRecommendations == null || !this.priceRecommendations.isPresent()) {
      this.priceRecommendations = JsonNullable.of(new ArrayList<>());
    }
    this.priceRecommendations.get().add(priceRecommendationsItem);
    return this;
  }

  /**
   * Рекомендованные цены.
   * @return priceRecommendations
   */
  @Valid 
  @Schema(name = "priceRecommendations", description = "Рекомендованные цены.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priceRecommendations")
  public JsonNullable<List<@Valid PriceRecommendationItemDTO>> getPriceRecommendations() {
    return priceRecommendations;
  }

  public void setPriceRecommendations(JsonNullable<List<@Valid PriceRecommendationItemDTO>> priceRecommendations) {
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
    return Objects.equals(this.sku, skuBidRecommendationItemDTO.sku) &&
        Objects.equals(this.bid, skuBidRecommendationItemDTO.bid) &&
        equalsNullable(this.bidRecommendations, skuBidRecommendationItemDTO.bidRecommendations) &&
        equalsNullable(this.priceRecommendations, skuBidRecommendationItemDTO.priceRecommendations);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, bid, hashCodeNullable(bidRecommendations), hashCodeNullable(priceRecommendations));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

