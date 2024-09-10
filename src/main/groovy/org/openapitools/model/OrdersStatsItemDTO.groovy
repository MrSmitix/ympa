package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrdersStatsDetailsDTO;
import org.openapitools.model.OrdersStatsPriceDTO;
import org.openapitools.model.OrdersStatsWarehouseDTO;

@Canonical
class OrdersStatsItemDTO {
    /* Название товара. */
    String offerName
    /* SKU на Маркете. */
    Long marketSku
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    String shopSku
    /* Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`.  */
    Integer count
    /* Цена или скидки на товар. */
    List<OrdersStatsPriceDTO> prices
    
    OrdersStatsWarehouseDTO warehouse
    /* Информация об удалении товара из заказа. */
    List<OrdersStatsDetailsDTO> details
    /* Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). */
    List<String> cisList
    /* Первоначальное количество единиц товара. */
    Integer initialCount
    /* Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500.  */
    Integer bidFee
    /* Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой.  */
    BigDecimal cofinanceThreshold
    /* Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой.  */
    BigDecimal cofinanceValue
}
