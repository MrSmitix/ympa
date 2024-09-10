package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Тип скидки:  * `DIRECT_DISCOUNT` — прямая скидка, которую устанавливает продавец или Маркет.  * `BLUE_SET` — комплекты.  * `BLUE_FLASH` — флеш-акция.  * `MARKET_COUPON` — скидка по промокоду Маркета.  * `MARKET_PROMOCODE` — скидка по промокоду магазина.  * `MARKET_BLUE` — скидка на Маркете.  * `YANDEX_PLUS` — бесплатная доставка с подпиской Яндекс Плюс.  * `YANDEX_EMPLOYEE` — бесплатная доставка по определенным адресам.  * `LIMITED_FREE_DELIVERY_PROMO` — бесплатная доставка по ограниченному предложению.  * `FREE_DELIVERY_THRESHOLD` — бесплатная доставка при достижении определенной суммы заказа.  * `MULTICART_DISCOUNT` — скидка за то, что оформлена мультикорзина.  * `FREE_DELIVERY_FOR_LDI` — бесплатная доставка за то, что один из товаров крупногабаритный.  * `FREE_DELIVERY_FOR_LSC` — бесплатная доставка за то, что одна из корзин в мультикорзине крупногабаритная.  * `FREE_PICKUP` — бесплатная доставка в пункт выдачи заказов.  * `CHEAPEST_AS_GIFT` — самый дешевый товар в подарок.  * `CASHBACK` — кешбэк.  * `SUPPLIER_MULTICART_DISCOUNT` — скидка за доставку.  * `SPREAD_DISCOUNT_COUNT` — скидка за количество одинаковых товаров.  * `SPREAD_DISCOUNT_RECEIPT` — скидка от суммы чека.  * `ANNOUNCEMENT_PROMO` — информационная акция, скидка не применяется к товарам.  * `DISCOUNT_BY_PAYMENT_TYPE` — прямая скидка при оплате картой Плюса.  * `PERCENT_DISCOUNT` — прямая скидка в процентах.  * `DCO_EXTRA_DISCOUNT` — дополнительная скидка, необходимая для расчета субсидии от Маркета.  * `EMPTY_PROMO` — скрытые промокоды.  * `BLOCKING_PROMO` — блокирующее промо.  * `UNKNOWN` — неизвестный тип.  Устаревшие типы:  * `GENERIC_BUNDLE`.  * `MARKET_DEAL`.  * `MARKET_PRIME`.  * `MARKET_COIN`.  * `BERU_PLUS`.  * `PRICE_DROP_AS_YOU_SHOP`.  * `SECRET_SALE`. 
 */
public enum OrderPromoType {
  
  DIRECT_DISCOUNT("DIRECT_DISCOUNT"),
  
  BLUE_SET("BLUE_SET"),
  
  BLUE_FLASH("BLUE_FLASH"),
  
  GENERIC_BUNDLE("GENERIC_BUNDLE"),
  
  MARKET_COUPON("MARKET_COUPON"),
  
  MARKET_PROMOCODE("MARKET_PROMOCODE"),
  
  MARKET_DEAL("MARKET_DEAL"),
  
  MARKET_BLUE("MARKET_BLUE"),
  
  MARKET_PRIME("MARKET_PRIME"),
  
  YANDEX_PLUS("YANDEX_PLUS"),
  
  BERU_PLUS("BERU_PLUS"),
  
  MARKET_COIN("MARKET_COIN"),
  
  YANDEX_EMPLOYEE("YANDEX_EMPLOYEE"),
  
  LIMITED_FREE_DELIVERY_PROMO("LIMITED_FREE_DELIVERY_PROMO"),
  
  FREE_DELIVERY_THRESHOLD("FREE_DELIVERY_THRESHOLD"),
  
  MULTICART_DISCOUNT("MULTICART_DISCOUNT"),
  
  PRICE_DROP_AS_YOU_SHOP("PRICE_DROP_AS_YOU_SHOP"),
  
  FREE_DELIVERY_FOR_LDI("FREE_DELIVERY_FOR_LDI"),
  
  FREE_DELIVERY_FOR_LSC("FREE_DELIVERY_FOR_LSC"),
  
  SECRET_SALE("SECRET_SALE"),
  
  FREE_PICKUP("FREE_PICKUP"),
  
  CHEAPEST_AS_GIFT("CHEAPEST_AS_GIFT"),
  
  CASHBACK("CASHBACK"),
  
  SUPPLIER_MULTICART_DISCOUNT("SUPPLIER_MULTICART_DISCOUNT"),
  
  SPREAD_DISCOUNT_COUNT("SPREAD_DISCOUNT_COUNT"),
  
  SPREAD_DISCOUNT_RECEIPT("SPREAD_DISCOUNT_RECEIPT"),
  
  ANNOUNCEMENT_PROMO("ANNOUNCEMENT_PROMO"),
  
  DISCOUNT_BY_PAYMENT_TYPE("DISCOUNT_BY_PAYMENT_TYPE"),
  
  PERCENT_DISCOUNT("PERCENT_DISCOUNT"),
  
  DCO_EXTRA_DISCOUNT("DCO_EXTRA_DISCOUNT"),
  
  EMPTY_PROMO("EMPTY_PROMO"),
  
  BLOCKING_PROMO("BLOCKING_PROMO"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  OrderPromoType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderPromoType fromValue(String text) {
    for (OrderPromoType b : OrderPromoType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

