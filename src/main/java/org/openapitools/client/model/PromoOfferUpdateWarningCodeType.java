/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Предупреждение, которое появилось при добавлении товара:  * &#x60;DEEP_DISCOUNT_OFFER&#x60; — большая разница с ценой в каталоге. Проверьте, нет ли ошибки.  * &#x60;CATALOG_PRICE_IS_LOWER_THAN_PROMO&#x60; — [базовая цена](*basic-price) в кабинете ниже цены по акции. У товара в акции будет отображаться базовая цена.  * &#x60;SHOP_PRICES_ARE_LOWER_THAN_PROMO&#x60; — цена в отдельном магазине ниже цены по акции. У товара в акции будет отображаться цена в магазине. Для остальных магазинов будет действовать цена по акции.  * &#x60;PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE&#x60; — в отдельном магазине цена с учетом промокода выше максимально возможной цены. Товар не будет участвовать в акции.  * &#x60;SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO&#x60; — товар в отдельном магазине не подходит под условия акции. 
 */
@JsonAdapter(PromoOfferUpdateWarningCodeType.Adapter.class)
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

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromoOfferUpdateWarningCodeType fromValue(String value) {
    for (PromoOfferUpdateWarningCodeType b : PromoOfferUpdateWarningCodeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PromoOfferUpdateWarningCodeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromoOfferUpdateWarningCodeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromoOfferUpdateWarningCodeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromoOfferUpdateWarningCodeType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    PromoOfferUpdateWarningCodeType.fromValue(value);
  }
}

