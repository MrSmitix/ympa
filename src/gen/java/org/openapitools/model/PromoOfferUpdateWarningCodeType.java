package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Предупреждение, которое появилось при добавлении товара:  * `DEEP_DISCOUNT_OFFER` — большая разница с ценой в каталоге. Проверьте, нет ли ошибки.  * `CATALOG_PRICE_IS_LOWER_THAN_PROMO` — [базовая цена](*basic-price) в кабинете ниже цены по акции. У товара в акции будет отображаться базовая цена.  * `SHOP_PRICES_ARE_LOWER_THAN_PROMO` — цена в отдельном магазине ниже цены по акции. У товара в акции будет отображаться цена в магазине. Для остальных магазинов будет действовать цена по акции.  * `PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE` — в отдельном магазине цена с учетом промокода выше максимально возможной цены. Товар не будет участвовать в акции.  * `SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO` — товар в отдельном магазине не подходит под условия акции. 
 */
public enum PromoOfferUpdateWarningCodeType {
  
  DEEP_DISCOUNT_OFFER("DEEP_DISCOUNT_OFFER"),
  
  CATALOG_PRICE_IS_LOWER_THAN_PROMO("CATALOG_PRICE_IS_LOWER_THAN_PROMO"),
  
  SHOP_PRICES_ARE_LOWER_THAN_PROMO("SHOP_PRICES_ARE_LOWER_THAN_PROMO"),
  
  PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE("PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE"),
  
  SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO("SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO");

  private String value;

  PromoOfferUpdateWarningCodeType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PromoOfferUpdateWarningCodeType fromValue(String text) {
    for (PromoOfferUpdateWarningCodeType b : PromoOfferUpdateWarningCodeType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

