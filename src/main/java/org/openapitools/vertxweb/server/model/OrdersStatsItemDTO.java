package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.OrdersStatsDetailsDTO;
import org.openapitools.vertxweb.server.model.OrdersStatsPriceDTO;
import org.openapitools.vertxweb.server.model.OrdersStatsWarehouseDTO;

/**
 * Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке &#x60;items&#x60; — только в списке &#x60;initialItems&#x60;.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке &#x60;items&#x60; (с уменьшенным количеством единиц &#x60;count&#x60;), и в списке &#x60;initialItems&#x60; (с первоначальным количеством единиц &#x60;initialCount&#x60;). 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrdersStatsItemDTO   {
  
  private String offerName;
  private Long marketSku;
  private String shopSku;
  private Integer count;
  private List<OrdersStatsPriceDTO> prices;
  private OrdersStatsWarehouseDTO warehouse;
  private List<OrdersStatsDetailsDTO> details;
  private List<String> cisList;
  private Integer initialCount;
  private Integer bidFee;
  private BigDecimal cofinanceThreshold;
  private BigDecimal cofinanceValue;

  public OrdersStatsItemDTO () {

  }

  public OrdersStatsItemDTO (String offerName, Long marketSku, String shopSku, Integer count, List<OrdersStatsPriceDTO> prices, OrdersStatsWarehouseDTO warehouse, List<OrdersStatsDetailsDTO> details, List<String> cisList, Integer initialCount, Integer bidFee, BigDecimal cofinanceThreshold, BigDecimal cofinanceValue) {
    this.offerName = offerName;
    this.marketSku = marketSku;
    this.shopSku = shopSku;
    this.count = count;
    this.prices = prices;
    this.warehouse = warehouse;
    this.details = details;
    this.cisList = cisList;
    this.initialCount = initialCount;
    this.bidFee = bidFee;
    this.cofinanceThreshold = cofinanceThreshold;
    this.cofinanceValue = cofinanceValue;
  }

    
  @JsonProperty("offerName")
  public String getOfferName() {
    return offerName;
  }
  public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

    
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }
  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

    
  @JsonProperty("shopSku")
  public String getShopSku() {
    return shopSku;
  }
  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

    
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

    
  @JsonProperty("prices")
  public List<OrdersStatsPriceDTO> getPrices() {
    return prices;
  }
  public void setPrices(List<OrdersStatsPriceDTO> prices) {
    this.prices = prices;
  }

    
  @JsonProperty("warehouse")
  public OrdersStatsWarehouseDTO getWarehouse() {
    return warehouse;
  }
  public void setWarehouse(OrdersStatsWarehouseDTO warehouse) {
    this.warehouse = warehouse;
  }

    
  @JsonProperty("details")
  public List<OrdersStatsDetailsDTO> getDetails() {
    return details;
  }
  public void setDetails(List<OrdersStatsDetailsDTO> details) {
    this.details = details;
  }

    
  @JsonProperty("cisList")
  public List<String> getCisList() {
    return cisList;
  }
  public void setCisList(List<String> cisList) {
    this.cisList = cisList;
  }

    
  @JsonProperty("initialCount")
  public Integer getInitialCount() {
    return initialCount;
  }
  public void setInitialCount(Integer initialCount) {
    this.initialCount = initialCount;
  }

    
  @JsonProperty("bidFee")
  public Integer getBidFee() {
    return bidFee;
  }
  public void setBidFee(Integer bidFee) {
    this.bidFee = bidFee;
  }

    
  @JsonProperty("cofinanceThreshold")
  public BigDecimal getCofinanceThreshold() {
    return cofinanceThreshold;
  }
  public void setCofinanceThreshold(BigDecimal cofinanceThreshold) {
    this.cofinanceThreshold = cofinanceThreshold;
  }

    
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
