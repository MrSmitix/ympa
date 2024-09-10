package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип скидки:  * &#x60;DIRECT_DISCOUNT&#x60; — прямая скидка, которую устанавливает продавец или Маркет.  * &#x60;BLUE_SET&#x60; — комплекты.  * &#x60;BLUE_FLASH&#x60; — флеш-акция.  * &#x60;MARKET_COUPON&#x60; — скидка по промокоду Маркета.  * &#x60;MARKET_PROMOCODE&#x60; — скидка по промокоду магазина.  * &#x60;MARKET_BLUE&#x60; — скидка на Маркете.  * &#x60;YANDEX_PLUS&#x60; — бесплатная доставка с подпиской Яндекс Плюс.  * &#x60;YANDEX_EMPLOYEE&#x60; — бесплатная доставка по определенным адресам.  * &#x60;LIMITED_FREE_DELIVERY_PROMO&#x60; — бесплатная доставка по ограниченному предложению.  * &#x60;FREE_DELIVERY_THRESHOLD&#x60; — бесплатная доставка при достижении определенной суммы заказа.  * &#x60;MULTICART_DISCOUNT&#x60; — скидка за то, что оформлена мультикорзина.  * &#x60;FREE_DELIVERY_FOR_LDI&#x60; — бесплатная доставка за то, что один из товаров крупногабаритный.  * &#x60;FREE_DELIVERY_FOR_LSC&#x60; — бесплатная доставка за то, что одна из корзин в мультикорзине крупногабаритная.  * &#x60;FREE_PICKUP&#x60; — бесплатная доставка в пункт выдачи заказов.  * &#x60;CHEAPEST_AS_GIFT&#x60; — самый дешевый товар в подарок.  * &#x60;CASHBACK&#x60; — кешбэк.  * &#x60;SUPPLIER_MULTICART_DISCOUNT&#x60; — скидка за доставку.  * &#x60;SPREAD_DISCOUNT_COUNT&#x60; — скидка за количество одинаковых товаров.  * &#x60;SPREAD_DISCOUNT_RECEIPT&#x60; — скидка от суммы чека.  * &#x60;ANNOUNCEMENT_PROMO&#x60; — информационная акция, скидка не применяется к товарам.  * &#x60;DISCOUNT_BY_PAYMENT_TYPE&#x60; — прямая скидка при оплате картой Плюса.  * &#x60;PERCENT_DISCOUNT&#x60; — прямая скидка в процентах.  * &#x60;DCO_EXTRA_DISCOUNT&#x60; — дополнительная скидка, необходимая для расчета субсидии от Маркета.  * &#x60;EMPTY_PROMO&#x60; — скрытые промокоды.  * &#x60;BLOCKING_PROMO&#x60; — блокирующее промо.  * &#x60;UNKNOWN&#x60; — неизвестный тип.  Устаревшие типы:  * &#x60;GENERIC_BUNDLE&#x60;.  * &#x60;MARKET_DEAL&#x60;.  * &#x60;MARKET_PRIME&#x60;.  * &#x60;MARKET_COIN&#x60;.  * &#x60;BERU_PLUS&#x60;.  * &#x60;PRICE_DROP_AS_YOU_SHOP&#x60;.  * &#x60;SECRET_SALE&#x60;. 
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static OrderPromoType fromString(String s) {
      for (OrderPromoType b : OrderPromoType.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderPromoType fromValue(String value) {
    for (OrderPromoType b : OrderPromoType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


