package org.openapitools.server.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.OrdersStatsDetailsDTO;
import org.openapitools.server.model.OrdersStatsPriceDTO;
import org.openapitools.server.model.OrdersStatsWarehouseDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке `items` — только в списке `initialItems`.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке `items` (с уменьшенным количеством единиц `count`), и в списке `initialItems` (с первоначальным количеством единиц `initialCount`). 
 */
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
     * Default constructor.
     */
    public OrdersStatsItemDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrdersStatsItemDTO.
     *
     * @param offerName Название товара.
     * @param marketSku SKU на Маркете.
     * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param count Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список &#x60;initialItems&#x60;. 
     * @param prices Цена или скидки на товар.
     * @param warehouse warehouse
     * @param details Информация об удалении товара из заказа.
     * @param cisList Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
     * @param initialCount Первоначальное количество единиц товара.
     * @param bidFee Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. 
     * @param cofinanceThreshold Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. 
     * @param cofinanceValue Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. 
     */
    public OrdersStatsItemDTO(
        String offerName, 
        Long marketSku, 
        String shopSku, 
        Integer count, 
        List<@Valid OrdersStatsPriceDTO> prices, 
        OrdersStatsWarehouseDTO warehouse, 
        List<@Valid OrdersStatsDetailsDTO> details, 
        List<String> cisList, 
        Integer initialCount, 
        Integer bidFee, 
        BigDecimal cofinanceThreshold, 
        BigDecimal cofinanceValue
    ) {
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



    /**
     * Название товара.
     * @return offerName
     */
    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    /**
     * SKU на Маркете.
     * @return marketSku
     */
    public Long getMarketSku() {
        return marketSku;
    }

    public void setMarketSku(Long marketSku) {
        this.marketSku = marketSku;
    }

    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @return shopSku
     */
    public String getShopSku() {
        return shopSku;
    }

    public void setShopSku(String shopSku) {
        this.shopSku = shopSku;
    }

    /**
     * Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`. 
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Цена или скидки на товар.
     * @return prices
     */
    public List<@Valid OrdersStatsPriceDTO> getPrices() {
        return prices;
    }

    public void setPrices(List<@Valid OrdersStatsPriceDTO> prices) {
        this.prices = prices;
    }

    /**
     * Get warehouse
     * @return warehouse
     */
    public OrdersStatsWarehouseDTO getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(OrdersStatsWarehouseDTO warehouse) {
        this.warehouse = warehouse;
    }

    /**
     * Информация об удалении товара из заказа.
     * @return details
     */
    public List<@Valid OrdersStatsDetailsDTO> getDetails() {
        return details;
    }

    public void setDetails(List<@Valid OrdersStatsDetailsDTO> details) {
        this.details = details;
    }

    /**
     * Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
     * @return cisList
     */
    public List<String> getCisList() {
        return cisList;
    }

    public void setCisList(List<String> cisList) {
        this.cisList = cisList;
    }

    /**
     * Первоначальное количество единиц товара.
     * @return initialCount
     */
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
     * @return bidFee
     */
    public Integer getBidFee() {
        return bidFee;
    }

    public void setBidFee(Integer bidFee) {
        this.bidFee = bidFee;
    }

    /**
     * Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. 
     * @return cofinanceThreshold
     */
    public BigDecimal getCofinanceThreshold() {
        return cofinanceThreshold;
    }

    public void setCofinanceThreshold(BigDecimal cofinanceThreshold) {
        this.cofinanceThreshold = cofinanceThreshold;
    }

    /**
     * Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. 
     * @return cofinanceValue
     */
    public BigDecimal getCofinanceValue() {
        return cofinanceValue;
    }

    public void setCofinanceValue(BigDecimal cofinanceValue) {
        this.cofinanceValue = cofinanceValue;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

