package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип скидки:  * &#x60;DIRECT_DISCOUNT&#x60; — прямая скидка, которую устанавливает продавец или Маркет.  * &#x60;BLUE_SET&#x60; — комплекты.  * &#x60;BLUE_FLASH&#x60; — флеш-акция.  * &#x60;MARKET_COUPON&#x60; — скидка по промокоду Маркета.  * &#x60;MARKET_PROMOCODE&#x60; — скидка по промокоду магазина.  * &#x60;MARKET_BLUE&#x60; — скидка на Маркете.  * &#x60;YANDEX_PLUS&#x60; — бесплатная доставка с подпиской Яндекс Плюс.  * &#x60;YANDEX_EMPLOYEE&#x60; — бесплатная доставка по определенным адресам.  * &#x60;LIMITED_FREE_DELIVERY_PROMO&#x60; — бесплатная доставка по ограниченному предложению.  * &#x60;FREE_DELIVERY_THRESHOLD&#x60; — бесплатная доставка при достижении определенной суммы заказа.  * &#x60;MULTICART_DISCOUNT&#x60; — скидка за то, что оформлена мультикорзина.  * &#x60;FREE_DELIVERY_FOR_LDI&#x60; — бесплатная доставка за то, что один из товаров крупногабаритный.  * &#x60;FREE_DELIVERY_FOR_LSC&#x60; — бесплатная доставка за то, что одна из корзин в мультикорзине крупногабаритная.  * &#x60;FREE_PICKUP&#x60; — бесплатная доставка в пункт выдачи заказов.  * &#x60;CHEAPEST_AS_GIFT&#x60; — самый дешевый товар в подарок.  * &#x60;CASHBACK&#x60; — кешбэк.  * &#x60;SUPPLIER_MULTICART_DISCOUNT&#x60; — скидка за доставку.  * &#x60;SPREAD_DISCOUNT_COUNT&#x60; — скидка за количество одинаковых товаров.  * &#x60;SPREAD_DISCOUNT_RECEIPT&#x60; — скидка от суммы чека.  * &#x60;ANNOUNCEMENT_PROMO&#x60; — информационная акция, скидка не применяется к товарам.  * &#x60;DISCOUNT_BY_PAYMENT_TYPE&#x60; — прямая скидка при оплате картой Плюса.  * &#x60;PERCENT_DISCOUNT&#x60; — прямая скидка в процентах.  * &#x60;DCO_EXTRA_DISCOUNT&#x60; — дополнительная скидка, необходимая для расчета субсидии от Маркета.  * &#x60;EMPTY_PROMO&#x60; — скрытые промокоды.  * &#x60;BLOCKING_PROMO&#x60; — блокирующее промо.  * &#x60;UNKNOWN&#x60; — неизвестный тип.  Устаревшие типы:  * &#x60;GENERIC_BUNDLE&#x60;.  * &#x60;MARKET_DEAL&#x60;.  * &#x60;MARKET_PRIME&#x60;.  * &#x60;MARKET_COIN&#x60;.  * &#x60;BERU_PLUS&#x60;.  * &#x60;PRICE_DROP_AS_YOU_SHOP&#x60;.  * &#x60;SECRET_SALE&#x60;. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrderPromoType {

    @JsonProperty("DIRECT_DISCOUNT") DIRECT_DISCOUNT(String.valueOf("DIRECT_DISCOUNT")), @JsonProperty("BLUE_SET") BLUE_SET(String.valueOf("BLUE_SET")), @JsonProperty("BLUE_FLASH") BLUE_FLASH(String.valueOf("BLUE_FLASH")), @JsonProperty("GENERIC_BUNDLE") GENERIC_BUNDLE(String.valueOf("GENERIC_BUNDLE")), @JsonProperty("MARKET_COUPON") MARKET_COUPON(String.valueOf("MARKET_COUPON")), @JsonProperty("MARKET_PROMOCODE") MARKET_PROMOCODE(String.valueOf("MARKET_PROMOCODE")), @JsonProperty("MARKET_DEAL") MARKET_DEAL(String.valueOf("MARKET_DEAL")), @JsonProperty("MARKET_BLUE") MARKET_BLUE(String.valueOf("MARKET_BLUE")), @JsonProperty("MARKET_PRIME") MARKET_PRIME(String.valueOf("MARKET_PRIME")), @JsonProperty("YANDEX_PLUS") YANDEX_PLUS(String.valueOf("YANDEX_PLUS")), @JsonProperty("BERU_PLUS") BERU_PLUS(String.valueOf("BERU_PLUS")), @JsonProperty("MARKET_COIN") MARKET_COIN(String.valueOf("MARKET_COIN")), @JsonProperty("YANDEX_EMPLOYEE") YANDEX_EMPLOYEE(String.valueOf("YANDEX_EMPLOYEE")), @JsonProperty("LIMITED_FREE_DELIVERY_PROMO") LIMITED_FREE_DELIVERY_PROMO(String.valueOf("LIMITED_FREE_DELIVERY_PROMO")), @JsonProperty("FREE_DELIVERY_THRESHOLD") FREE_DELIVERY_THRESHOLD(String.valueOf("FREE_DELIVERY_THRESHOLD")), @JsonProperty("MULTICART_DISCOUNT") MULTICART_DISCOUNT(String.valueOf("MULTICART_DISCOUNT")), @JsonProperty("PRICE_DROP_AS_YOU_SHOP") PRICE_DROP_AS_YOU_SHOP(String.valueOf("PRICE_DROP_AS_YOU_SHOP")), @JsonProperty("FREE_DELIVERY_FOR_LDI") FREE_DELIVERY_FOR_LDI(String.valueOf("FREE_DELIVERY_FOR_LDI")), @JsonProperty("FREE_DELIVERY_FOR_LSC") FREE_DELIVERY_FOR_LSC(String.valueOf("FREE_DELIVERY_FOR_LSC")), @JsonProperty("SECRET_SALE") SECRET_SALE(String.valueOf("SECRET_SALE")), @JsonProperty("FREE_PICKUP") FREE_PICKUP(String.valueOf("FREE_PICKUP")), @JsonProperty("CHEAPEST_AS_GIFT") CHEAPEST_AS_GIFT(String.valueOf("CHEAPEST_AS_GIFT")), @JsonProperty("CASHBACK") CASHBACK(String.valueOf("CASHBACK")), @JsonProperty("SUPPLIER_MULTICART_DISCOUNT") SUPPLIER_MULTICART_DISCOUNT(String.valueOf("SUPPLIER_MULTICART_DISCOUNT")), @JsonProperty("SPREAD_DISCOUNT_COUNT") SPREAD_DISCOUNT_COUNT(String.valueOf("SPREAD_DISCOUNT_COUNT")), @JsonProperty("SPREAD_DISCOUNT_RECEIPT") SPREAD_DISCOUNT_RECEIPT(String.valueOf("SPREAD_DISCOUNT_RECEIPT")), @JsonProperty("ANNOUNCEMENT_PROMO") ANNOUNCEMENT_PROMO(String.valueOf("ANNOUNCEMENT_PROMO")), @JsonProperty("DISCOUNT_BY_PAYMENT_TYPE") DISCOUNT_BY_PAYMENT_TYPE(String.valueOf("DISCOUNT_BY_PAYMENT_TYPE")), @JsonProperty("PERCENT_DISCOUNT") PERCENT_DISCOUNT(String.valueOf("PERCENT_DISCOUNT")), @JsonProperty("DCO_EXTRA_DISCOUNT") DCO_EXTRA_DISCOUNT(String.valueOf("DCO_EXTRA_DISCOUNT")), @JsonProperty("EMPTY_PROMO") EMPTY_PROMO(String.valueOf("EMPTY_PROMO")), @JsonProperty("BLOCKING_PROMO") BLOCKING_PROMO(String.valueOf("BLOCKING_PROMO")), @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN"));


    private String value;

    OrderPromoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrderPromoType fromValue(String value) {
        for (OrderPromoType b : OrderPromoType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



