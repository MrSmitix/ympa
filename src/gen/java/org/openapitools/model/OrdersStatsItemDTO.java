package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@ApiModel(description="Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке `items` — только в списке `initialItems`.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке `items` (с уменьшенным количеством единиц `count`), и в списке `initialItems` (с первоначальным количеством единиц `initialCount`). ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersStatsItemDTO   {
  
  private String offerName;
  private Long marketSku;
  private String shopSku;
  private Integer count;
  private List<@Valid OrdersStatsPriceDTO> prices;
  private OrdersStatsWarehouseDTO warehouse;
  private List<@Valid OrdersStatsDetailsDTO> details;
  private List<String> cisList;
  private Integer initialCount;
  private Integer bidFee;
  private BigDecimal cofinanceThreshold;
  private BigDecimal cofinanceValue;

  /**
   * Название товара.
   **/
  
  @ApiModelProperty(value = "Название товара.")
  @JsonProperty("offerName")
  public String getOfferName() {
    return offerName;
  }
  public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

  /**
   * SKU на Маркете.
   **/
  
  @ApiModelProperty(value = "SKU на Маркете.")
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }
  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("shopSku")
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getShopSku() {
    return shopSku;
  }
  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  /**
   * Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список &#x60;initialItems&#x60;. 
   **/
  
  @ApiModelProperty(value = "Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`. ")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * Цена или скидки на товар.
   **/
  
  @ApiModelProperty(value = "Цена или скидки на товар.")
  @JsonProperty("prices")
  @Valid
  public List<@Valid OrdersStatsPriceDTO> getPrices() {
    return prices;
  }
  public void setPrices(List<@Valid OrdersStatsPriceDTO> prices) {
    this.prices = prices;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("warehouse")
  @Valid
  public OrdersStatsWarehouseDTO getWarehouse() {
    return warehouse;
  }
  public void setWarehouse(OrdersStatsWarehouseDTO warehouse) {
    this.warehouse = warehouse;
  }

  /**
   * Информация об удалении товара из заказа.
   **/
  
  @ApiModelProperty(value = "Информация об удалении товара из заказа.")
  @JsonProperty("details")
  @Valid
  public List<@Valid OrdersStatsDetailsDTO> getDetails() {
    return details;
  }
  public void setDetails(List<@Valid OrdersStatsDetailsDTO> details) {
    this.details = details;
  }

  /**
   * Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
   **/
  
  @ApiModelProperty(value = "Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).")
  @JsonProperty("cisList")
  public List<String> getCisList() {
    return cisList;
  }
  public void setCisList(List<String> cisList) {
    this.cisList = cisList;
  }

  /**
   * Первоначальное количество единиц товара.
   **/
  
  @ApiModelProperty(value = "Первоначальное количество единиц товара.")
  @JsonProperty("initialCount")
  public Integer getInitialCount() {
    return initialCount;
  }
  public void setInitialCount(Integer initialCount) {
    this.initialCount = initialCount;
  }

  /**
   * Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. 
   * minimum: 0
   * maximum: 10000
   **/
  
  @ApiModelProperty(example = "570", value = "Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. ")
  @JsonProperty("bidFee")
 @Min(0) @Max(10000)  public Integer getBidFee() {
    return bidFee;
  }
  public void setBidFee(Integer bidFee) {
    this.bidFee = bidFee;
  }

  /**
   * Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. 
   **/
  
  @ApiModelProperty(value = "Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. ")
  @JsonProperty("cofinanceThreshold")
  @Valid
  public BigDecimal getCofinanceThreshold() {
    return cofinanceThreshold;
  }
  public void setCofinanceThreshold(BigDecimal cofinanceThreshold) {
    this.cofinanceThreshold = cofinanceThreshold;
  }

  /**
   * Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. 
   **/
  
  @ApiModelProperty(value = "Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. ")
  @JsonProperty("cofinanceValue")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

