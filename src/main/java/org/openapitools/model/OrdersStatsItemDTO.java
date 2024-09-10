package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrdersStatsDetailsDTO;
import org.openapitools.model.OrdersStatsPriceDTO;
import org.openapitools.model.OrdersStatsWarehouseDTO;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке &#x60;items&#x60; — только в списке &#x60;initialItems&#x60;.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке &#x60;items&#x60; (с уменьшенным количеством единиц &#x60;count&#x60;), и в списке &#x60;initialItems&#x60; (с первоначальным количеством единиц &#x60;initialCount&#x60;). 
 */

@Schema(name = "OrdersStatsItemDTO", description = "Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке `items` — только в списке `initialItems`.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке `items` (с уменьшенным количеством единиц `count`), и в списке `initialItems` (с первоначальным количеством единиц `initialCount`). ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersStatsItemDTO {

  private String offerName;

  private Long marketSku;

  private String shopSku;

  private Integer count;

  @Valid
  private JsonNullable<List<@Valid OrdersStatsPriceDTO>> prices = JsonNullable.<List<@Valid OrdersStatsPriceDTO>>undefined();

  private OrdersStatsWarehouseDTO warehouse;

  @Valid
  private JsonNullable<List<@Valid OrdersStatsDetailsDTO>> details = JsonNullable.<List<@Valid OrdersStatsDetailsDTO>>undefined();

  @Valid
  private JsonNullable<List<String>> cisList = JsonNullable.<List<String>>undefined();

  private Integer initialCount;

  private Integer bidFee;

  private BigDecimal cofinanceThreshold;

  private BigDecimal cofinanceValue;

  public OrdersStatsItemDTO offerName(String offerName) {
    this.offerName = offerName;
    return this;
  }

  /**
   * Название товара.
   * @return offerName
   */
  
  @Schema(name = "offerName", description = "Название товара.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerName")
  public String getOfferName() {
    return offerName;
  }

  public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

  public OrdersStatsItemDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

  /**
   * SKU на Маркете.
   * @return marketSku
   */
  
  @Schema(name = "marketSku", description = "SKU на Маркете.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }

  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

  public OrdersStatsItemDTO shopSku(String shopSku) {
    this.shopSku = shopSku;
    return this;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return shopSku
   */
  @Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min = 1, max = 255) 
  @Schema(name = "shopSku", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shopSku")
  public String getShopSku() {
    return shopSku;
  }

  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  public OrdersStatsItemDTO count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`. 
   * @return count
   */
  
  @Schema(name = "count", description = "Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public OrdersStatsItemDTO prices(List<@Valid OrdersStatsPriceDTO> prices) {
    this.prices = JsonNullable.of(prices);
    return this;
  }

  public OrdersStatsItemDTO addPricesItem(OrdersStatsPriceDTO pricesItem) {
    if (this.prices == null || !this.prices.isPresent()) {
      this.prices = JsonNullable.of(new ArrayList<>());
    }
    this.prices.get().add(pricesItem);
    return this;
  }

  /**
   * Цена или скидки на товар.
   * @return prices
   */
  @Valid 
  @Schema(name = "prices", description = "Цена или скидки на товар.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prices")
  public JsonNullable<List<@Valid OrdersStatsPriceDTO>> getPrices() {
    return prices;
  }

  public void setPrices(JsonNullable<List<@Valid OrdersStatsPriceDTO>> prices) {
    this.prices = prices;
  }

  public OrdersStatsItemDTO warehouse(OrdersStatsWarehouseDTO warehouse) {
    this.warehouse = warehouse;
    return this;
  }

  /**
   * Get warehouse
   * @return warehouse
   */
  @Valid 
  @Schema(name = "warehouse", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warehouse")
  public OrdersStatsWarehouseDTO getWarehouse() {
    return warehouse;
  }

  public void setWarehouse(OrdersStatsWarehouseDTO warehouse) {
    this.warehouse = warehouse;
  }

  public OrdersStatsItemDTO details(List<@Valid OrdersStatsDetailsDTO> details) {
    this.details = JsonNullable.of(details);
    return this;
  }

  public OrdersStatsItemDTO addDetailsItem(OrdersStatsDetailsDTO detailsItem) {
    if (this.details == null || !this.details.isPresent()) {
      this.details = JsonNullable.of(new ArrayList<>());
    }
    this.details.get().add(detailsItem);
    return this;
  }

  /**
   * Информация об удалении товара из заказа.
   * @return details
   */
  @Valid 
  @Schema(name = "details", description = "Информация об удалении товара из заказа.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public JsonNullable<List<@Valid OrdersStatsDetailsDTO>> getDetails() {
    return details;
  }

  public void setDetails(JsonNullable<List<@Valid OrdersStatsDetailsDTO>> details) {
    this.details = details;
  }

  public OrdersStatsItemDTO cisList(List<String> cisList) {
    this.cisList = JsonNullable.of(cisList);
    return this;
  }

  public OrdersStatsItemDTO addCisListItem(String cisListItem) {
    if (this.cisList == null || !this.cisList.isPresent()) {
      this.cisList = JsonNullable.of(new ArrayList<>());
    }
    this.cisList.get().add(cisListItem);
    return this;
  }

  /**
   * Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
   * @return cisList
   */
  
  @Schema(name = "cisList", description = "Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cisList")
  public JsonNullable<List<String>> getCisList() {
    return cisList;
  }

  public void setCisList(JsonNullable<List<String>> cisList) {
    this.cisList = cisList;
  }

  public OrdersStatsItemDTO initialCount(Integer initialCount) {
    this.initialCount = initialCount;
    return this;
  }

  /**
   * Первоначальное количество единиц товара.
   * @return initialCount
   */
  
  @Schema(name = "initialCount", description = "Первоначальное количество единиц товара.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("initialCount")
  public Integer getInitialCount() {
    return initialCount;
  }

  public void setInitialCount(Integer initialCount) {
    this.initialCount = initialCount;
  }

  public OrdersStatsItemDTO bidFee(Integer bidFee) {
    this.bidFee = bidFee;
    return this;
  }

  /**
   * Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. 
   * minimum: 0
   * maximum: 10000
   * @return bidFee
   */
  @Min(0) @Max(10000) 
  @Schema(name = "bidFee", example = "570", description = "Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bidFee")
  public Integer getBidFee() {
    return bidFee;
  }

  public void setBidFee(Integer bidFee) {
    this.bidFee = bidFee;
  }

  public OrdersStatsItemDTO cofinanceThreshold(BigDecimal cofinanceThreshold) {
    this.cofinanceThreshold = cofinanceThreshold;
    return this;
  }

  /**
   * Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. 
   * @return cofinanceThreshold
   */
  @Valid 
  @Schema(name = "cofinanceThreshold", description = "Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cofinanceThreshold")
  public BigDecimal getCofinanceThreshold() {
    return cofinanceThreshold;
  }

  public void setCofinanceThreshold(BigDecimal cofinanceThreshold) {
    this.cofinanceThreshold = cofinanceThreshold;
  }

  public OrdersStatsItemDTO cofinanceValue(BigDecimal cofinanceValue) {
    this.cofinanceValue = cofinanceValue;
    return this;
  }

  /**
   * Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. 
   * @return cofinanceValue
   */
  @Valid 
  @Schema(name = "cofinanceValue", description = "Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cofinanceValue")
  public BigDecimal getCofinanceValue() {
    return cofinanceValue;
  }

  public void setCofinanceValue(BigDecimal cofinanceValue) {
    this.cofinanceValue = cofinanceValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdersStatsItemDTO ordersStatsItemDTO = (OrdersStatsItemDTO) o;
    return Objects.equals(this.offerName, ordersStatsItemDTO.offerName) &&
        Objects.equals(this.marketSku, ordersStatsItemDTO.marketSku) &&
        Objects.equals(this.shopSku, ordersStatsItemDTO.shopSku) &&
        Objects.equals(this.count, ordersStatsItemDTO.count) &&
        equalsNullable(this.prices, ordersStatsItemDTO.prices) &&
        Objects.equals(this.warehouse, ordersStatsItemDTO.warehouse) &&
        equalsNullable(this.details, ordersStatsItemDTO.details) &&
        equalsNullable(this.cisList, ordersStatsItemDTO.cisList) &&
        Objects.equals(this.initialCount, ordersStatsItemDTO.initialCount) &&
        Objects.equals(this.bidFee, ordersStatsItemDTO.bidFee) &&
        Objects.equals(this.cofinanceThreshold, ordersStatsItemDTO.cofinanceThreshold) &&
        Objects.equals(this.cofinanceValue, ordersStatsItemDTO.cofinanceValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerName, marketSku, shopSku, count, hashCodeNullable(prices), warehouse, hashCodeNullable(details), hashCodeNullable(cisList), initialCount, bidFee, cofinanceThreshold, cofinanceValue);
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
    sb.append("class OrdersStatsItemDTO {\n");
    sb.append("    offerName: ").append(toIndentedString(offerName)).append("\n");
    sb.append("    marketSku: ").append(toIndentedString(marketSku)).append("\n");
    sb.append("    shopSku: ").append(toIndentedString(shopSku)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    warehouse: ").append(toIndentedString(warehouse)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    cisList: ").append(toIndentedString(cisList)).append("\n");
    sb.append("    initialCount: ").append(toIndentedString(initialCount)).append("\n");
    sb.append("    bidFee: ").append(toIndentedString(bidFee)).append("\n");
    sb.append("    cofinanceThreshold: ").append(toIndentedString(cofinanceThreshold)).append("\n");
    sb.append("    cofinanceValue: ").append(toIndentedString(cofinanceValue)).append("\n");
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

