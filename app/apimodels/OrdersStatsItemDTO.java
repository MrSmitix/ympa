package apimodels;

import apimodels.OrdersStatsDetailsDTO;
import apimodels.OrdersStatsPriceDTO;
import apimodels.OrdersStatsWarehouseDTO;
import java.math.BigDecimal;
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
 * Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке &#x60;items&#x60; — только в списке &#x60;initialItems&#x60;.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке &#x60;items&#x60; (с уменьшенным количеством единиц &#x60;count&#x60;), и в списке &#x60;initialItems&#x60; (с первоначальным количеством единиц &#x60;initialCount&#x60;). 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrdersStatsItemDTO   {
  @JsonProperty("offerName")
  
  private String offerName;

  @JsonProperty("marketSku")
  
  private Long marketSku;

  @JsonProperty("shopSku")
  @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
@Size(min=1,max=255)

  private String shopSku;

  @JsonProperty("count")
  
  private Integer count;

  @JsonProperty("prices")
  @Valid

  private List<@Valid OrdersStatsPriceDTO> prices = null;

  @JsonProperty("warehouse")
  @Valid

  private OrdersStatsWarehouseDTO warehouse;

  @JsonProperty("details")
  @Valid

  private List<@Valid OrdersStatsDetailsDTO> details = null;

  @JsonProperty("cisList")
  
  private List<String> cisList = null;

  @JsonProperty("initialCount")
  
  private Integer initialCount;

  @JsonProperty("bidFee")
  @Min(0)
@Max(10000)

  private Integer bidFee;

  @JsonProperty("cofinanceThreshold")
  @Valid

  private BigDecimal cofinanceThreshold;

  @JsonProperty("cofinanceValue")
  @Valid

  private BigDecimal cofinanceValue;

  public OrdersStatsItemDTO offerName(String offerName) {
    this.offerName = offerName;
    return this;
  }

   /**
   * Название товара.
   * @return offerName
  **/
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
  **/
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
  **/
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
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public OrdersStatsItemDTO prices(List<@Valid OrdersStatsPriceDTO> prices) {
    this.prices = prices;
    return this;
  }

  public OrdersStatsItemDTO addPricesItem(OrdersStatsPriceDTO pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

   /**
   * Цена или скидки на товар.
   * @return prices
  **/
  public List<@Valid OrdersStatsPriceDTO> getPrices() {
    return prices;
  }

  public void setPrices(List<@Valid OrdersStatsPriceDTO> prices) {
    this.prices = prices;
  }

  public OrdersStatsItemDTO warehouse(OrdersStatsWarehouseDTO warehouse) {
    this.warehouse = warehouse;
    return this;
  }

   /**
   * Get warehouse
   * @return warehouse
  **/
  public OrdersStatsWarehouseDTO getWarehouse() {
    return warehouse;
  }

  public void setWarehouse(OrdersStatsWarehouseDTO warehouse) {
    this.warehouse = warehouse;
  }

  public OrdersStatsItemDTO details(List<@Valid OrdersStatsDetailsDTO> details) {
    this.details = details;
    return this;
  }

  public OrdersStatsItemDTO addDetailsItem(OrdersStatsDetailsDTO detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Информация об удалении товара из заказа.
   * @return details
  **/
  public List<@Valid OrdersStatsDetailsDTO> getDetails() {
    return details;
  }

  public void setDetails(List<@Valid OrdersStatsDetailsDTO> details) {
    this.details = details;
  }

  public OrdersStatsItemDTO cisList(List<String> cisList) {
    this.cisList = cisList;
    return this;
  }

  public OrdersStatsItemDTO addCisListItem(String cisListItem) {
    if (this.cisList == null) {
      this.cisList = new ArrayList<>();
    }
    this.cisList.add(cisListItem);
    return this;
  }

   /**
   * Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
   * @return cisList
  **/
  public List<String> getCisList() {
    return cisList;
  }

  public void setCisList(List<String> cisList) {
    this.cisList = cisList;
  }

  public OrdersStatsItemDTO initialCount(Integer initialCount) {
    this.initialCount = initialCount;
    return this;
  }

   /**
   * Первоначальное количество единиц товара.
   * @return initialCount
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(offerName, ordersStatsItemDTO.offerName) &&
        Objects.equals(marketSku, ordersStatsItemDTO.marketSku) &&
        Objects.equals(shopSku, ordersStatsItemDTO.shopSku) &&
        Objects.equals(count, ordersStatsItemDTO.count) &&
        Objects.equals(prices, ordersStatsItemDTO.prices) &&
        Objects.equals(warehouse, ordersStatsItemDTO.warehouse) &&
        Objects.equals(details, ordersStatsItemDTO.details) &&
        Objects.equals(cisList, ordersStatsItemDTO.cisList) &&
        Objects.equals(initialCount, ordersStatsItemDTO.initialCount) &&
        Objects.equals(bidFee, ordersStatsItemDTO.bidFee) &&
        Objects.equals(cofinanceThreshold, ordersStatsItemDTO.cofinanceThreshold) &&
        Objects.equals(cofinanceValue, ordersStatsItemDTO.cofinanceValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerName, marketSku, shopSku, count, prices, warehouse, details, cisList, initialCount, bidFee, cofinanceThreshold, cofinanceValue);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

