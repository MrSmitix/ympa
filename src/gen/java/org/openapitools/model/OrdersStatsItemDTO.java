package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrdersStatsDetailsDTO;
import org.openapitools.model.OrdersStatsPriceDTO;
import org.openapitools.model.OrdersStatsWarehouseDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке `items` — только в списке `initialItems`.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке `items` (с уменьшенным количеством единиц `count`), и в списке `initialItems` (с первоначальным количеством единиц `initialCount`). 
 */
@ApiModel(description="Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке `items` — только в списке `initialItems`.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке `items` (с уменьшенным количеством единиц `count`), и в списке `initialItems` (с первоначальным количеством единиц `initialCount`). ")

public class OrdersStatsItemDTO  {
  
 /**
  * Название товара.
  */
  @ApiModelProperty(value = "Название товара.")
  private String offerName;

 /**
  * SKU на Маркете.
  */
  @ApiModelProperty(value = "SKU на Маркете.")
  private Long marketSku;

 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  */
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  private String shopSku;

 /**
  * Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`. 
  */
  @ApiModelProperty(value = "Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`. ")
  private Integer count;

 /**
  * Цена или скидки на товар.
  */
  @ApiModelProperty(value = "Цена или скидки на товар.")
  @Valid
  private List<@Valid OrdersStatsPriceDTO> prices;

  @ApiModelProperty(value = "")
  @Valid
  private OrdersStatsWarehouseDTO warehouse;

 /**
  * Информация об удалении товара из заказа.
  */
  @ApiModelProperty(value = "Информация об удалении товара из заказа.")
  @Valid
  private List<@Valid OrdersStatsDetailsDTO> details;

 /**
  * Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
  */
  @ApiModelProperty(value = "Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).")
  private List<String> cisList;

 /**
  * Первоначальное количество единиц товара.
  */
  @ApiModelProperty(value = "Первоначальное количество единиц товара.")
  private Integer initialCount;

 /**
  * Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. 
  */
  @ApiModelProperty(example = "570", value = "Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. ")
  private Integer bidFee;

 /**
  * Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. 
  */
  @ApiModelProperty(value = "Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. ")
  @Valid
  private BigDecimal cofinanceThreshold;

 /**
  * Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. 
  */
  @ApiModelProperty(value = "Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. ")
  @Valid
  private BigDecimal cofinanceValue;
 /**
  * Название товара.
  * @return offerName
  */
  @JsonProperty("offerName")
  public String getOfferName() {
    return offerName;
  }

  /**
   * Sets the <code>offerName</code> property.
   */
 public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

  /**
   * Sets the <code>offerName</code> property.
   */
  public OrdersStatsItemDTO offerName(String offerName) {
    this.offerName = offerName;
    return this;
  }

 /**
  * SKU на Маркете.
  * @return marketSku
  */
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }

  /**
   * Sets the <code>marketSku</code> property.
   */
 public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

  /**
   * Sets the <code>marketSku</code> property.
   */
  public OrdersStatsItemDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  * @return shopSku
  */
  @JsonProperty("shopSku")
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getShopSku() {
    return shopSku;
  }

  /**
   * Sets the <code>shopSku</code> property.
   */
 public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  /**
   * Sets the <code>shopSku</code> property.
   */
  public OrdersStatsItemDTO shopSku(String shopSku) {
    this.shopSku = shopSku;
    return this;
  }

 /**
  * Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список &#x60;initialItems&#x60;. 
  * @return count
  */
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  /**
   * Sets the <code>count</code> property.
   */
 public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * Sets the <code>count</code> property.
   */
  public OrdersStatsItemDTO count(Integer count) {
    this.count = count;
    return this;
  }

 /**
  * Цена или скидки на товар.
  * @return prices
  */
  @JsonProperty("prices")
  public List<@Valid OrdersStatsPriceDTO> getPrices() {
    return prices;
  }

  /**
   * Sets the <code>prices</code> property.
   */
 public void setPrices(List<@Valid OrdersStatsPriceDTO> prices) {
    this.prices = prices;
  }

  /**
   * Sets the <code>prices</code> property.
   */
  public OrdersStatsItemDTO prices(List<@Valid OrdersStatsPriceDTO> prices) {
    this.prices = prices;
    return this;
  }

  /**
   * Adds a new item to the <code>prices</code> list.
   */
  public OrdersStatsItemDTO addPricesItem(OrdersStatsPriceDTO pricesItem) {
    this.prices.add(pricesItem);
    return this;
  }

 /**
  * Get warehouse
  * @return warehouse
  */
  @JsonProperty("warehouse")
  public OrdersStatsWarehouseDTO getWarehouse() {
    return warehouse;
  }

  /**
   * Sets the <code>warehouse</code> property.
   */
 public void setWarehouse(OrdersStatsWarehouseDTO warehouse) {
    this.warehouse = warehouse;
  }

  /**
   * Sets the <code>warehouse</code> property.
   */
  public OrdersStatsItemDTO warehouse(OrdersStatsWarehouseDTO warehouse) {
    this.warehouse = warehouse;
    return this;
  }

 /**
  * Информация об удалении товара из заказа.
  * @return details
  */
  @JsonProperty("details")
  public List<@Valid OrdersStatsDetailsDTO> getDetails() {
    return details;
  }

  /**
   * Sets the <code>details</code> property.
   */
 public void setDetails(List<@Valid OrdersStatsDetailsDTO> details) {
    this.details = details;
  }

  /**
   * Sets the <code>details</code> property.
   */
  public OrdersStatsItemDTO details(List<@Valid OrdersStatsDetailsDTO> details) {
    this.details = details;
    return this;
  }

  /**
   * Adds a new item to the <code>details</code> list.
   */
  public OrdersStatsItemDTO addDetailsItem(OrdersStatsDetailsDTO detailsItem) {
    this.details.add(detailsItem);
    return this;
  }

 /**
  * Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
  * @return cisList
  */
  @JsonProperty("cisList")
  public List<String> getCisList() {
    return cisList;
  }

  /**
   * Sets the <code>cisList</code> property.
   */
 public void setCisList(List<String> cisList) {
    this.cisList = cisList;
  }

  /**
   * Sets the <code>cisList</code> property.
   */
  public OrdersStatsItemDTO cisList(List<String> cisList) {
    this.cisList = cisList;
    return this;
  }

  /**
   * Adds a new item to the <code>cisList</code> list.
   */
  public OrdersStatsItemDTO addCisListItem(String cisListItem) {
    this.cisList.add(cisListItem);
    return this;
  }

 /**
  * Первоначальное количество единиц товара.
  * @return initialCount
  */
  @JsonProperty("initialCount")
  public Integer getInitialCount() {
    return initialCount;
  }

  /**
   * Sets the <code>initialCount</code> property.
   */
 public void setInitialCount(Integer initialCount) {
    this.initialCount = initialCount;
  }

  /**
   * Sets the <code>initialCount</code> property.
   */
  public OrdersStatsItemDTO initialCount(Integer initialCount) {
    this.initialCount = initialCount;
    return this;
  }

 /**
  * Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. 
  * minimum: 0
  * maximum: 10000
  * @return bidFee
  */
  @JsonProperty("bidFee")
 @Min(0) @Max(10000)  public Integer getBidFee() {
    return bidFee;
  }

  /**
   * Sets the <code>bidFee</code> property.
   */
 public void setBidFee(Integer bidFee) {
    this.bidFee = bidFee;
  }

  /**
   * Sets the <code>bidFee</code> property.
   */
  public OrdersStatsItemDTO bidFee(Integer bidFee) {
    this.bidFee = bidFee;
    return this;
  }

 /**
  * Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. 
  * @return cofinanceThreshold
  */
  @JsonProperty("cofinanceThreshold")
  public BigDecimal getCofinanceThreshold() {
    return cofinanceThreshold;
  }

  /**
   * Sets the <code>cofinanceThreshold</code> property.
   */
 public void setCofinanceThreshold(BigDecimal cofinanceThreshold) {
    this.cofinanceThreshold = cofinanceThreshold;
  }

  /**
   * Sets the <code>cofinanceThreshold</code> property.
   */
  public OrdersStatsItemDTO cofinanceThreshold(BigDecimal cofinanceThreshold) {
    this.cofinanceThreshold = cofinanceThreshold;
    return this;
  }

 /**
  * Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. 
  * @return cofinanceValue
  */
  @JsonProperty("cofinanceValue")
  public BigDecimal getCofinanceValue() {
    return cofinanceValue;
  }

  /**
   * Sets the <code>cofinanceValue</code> property.
   */
 public void setCofinanceValue(BigDecimal cofinanceValue) {
    this.cofinanceValue = cofinanceValue;
  }

  /**
   * Sets the <code>cofinanceValue</code> property.
   */
  public OrdersStatsItemDTO cofinanceValue(BigDecimal cofinanceValue) {
    this.cofinanceValue = cofinanceValue;
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
    OrdersStatsItemDTO ordersStatsItemDTO = (OrdersStatsItemDTO) o;
    return Objects.equals(this.offerName, ordersStatsItemDTO.offerName) &&
        Objects.equals(this.marketSku, ordersStatsItemDTO.marketSku) &&
        Objects.equals(this.shopSku, ordersStatsItemDTO.shopSku) &&
        Objects.equals(this.count, ordersStatsItemDTO.count) &&
        Objects.equals(this.prices, ordersStatsItemDTO.prices) &&
        Objects.equals(this.warehouse, ordersStatsItemDTO.warehouse) &&
        Objects.equals(this.details, ordersStatsItemDTO.details) &&
        Objects.equals(this.cisList, ordersStatsItemDTO.cisList) &&
        Objects.equals(this.initialCount, ordersStatsItemDTO.initialCount) &&
        Objects.equals(this.bidFee, ordersStatsItemDTO.bidFee) &&
        Objects.equals(this.cofinanceThreshold, ordersStatsItemDTO.cofinanceThreshold) &&
        Objects.equals(this.cofinanceValue, ordersStatsItemDTO.cofinanceValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerName, marketSku, shopSku, count, prices, warehouse, details, cisList, initialCount, bidFee, cofinanceThreshold, cofinanceValue);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

