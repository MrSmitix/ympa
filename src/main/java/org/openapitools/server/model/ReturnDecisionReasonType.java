/**
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

package org.openapitools.server.model;

import java.lang.reflect.Type;
import javax.json.bind.annotation.JsonbTypeDeserializer;
import javax.json.bind.annotation.JsonbTypeSerializer;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.bind.annotation.JsonbProperty;


/**
 * Причины возврата:  * &#x60;BAD_QUALITY&#x60; — бракованный товар (есть недостатки).  * &#x60;DO_NOT_FIT&#x60; — товар не подошел.  * &#x60;WRONG_ITEM&#x60; — привезли не тот товар.  * &#x60;DAMAGE_DELIVERY&#x60; — товар поврежден при доставке.  * &#x60;LOYALTY_FAIL&#x60; — невозможно установить виновного в браке/пересорте.  * &#x60;CONTENT_FAIL&#x60; — ошибочное описание товара по вине Маркета.  * &#x60;UNKNOWN&#x60; — причина не известна. 
 */
@JsonbTypeSerializer(ReturnDecisionReasonType.Serializer.class)
@JsonbTypeDeserializer(ReturnDecisionReasonType.Deserializer.class)
public enum ReturnDecisionReasonType {
  
  BAD_QUALITY("BAD_QUALITY"),
  
  DOES_NOT_FIT("DOES_NOT_FIT"),
  
  WRONG_ITEM("WRONG_ITEM"),
  
  DAMAGE_DELIVERY("DAMAGE_DELIVERY"),
  
  LOYALTY_FAIL("LOYALTY_FAIL"),
  
  CONTENT_FAIL("CONTENT_FAIL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReturnDecisionReasonType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static final class Deserializer implements JsonbDeserializer<ReturnDecisionReasonType> {
    @Override
    public ReturnDecisionReasonType deserialize(JsonParser parser, DeserializationContext ctx, Type rtType) {
      return fromValue(parser.getString());
    }
  }

  public static final class Serializer implements JsonbSerializer<ReturnDecisionReasonType> {
    @Override
    public void serialize(ReturnDecisionReasonType obj, JsonGenerator generator, SerializationContext ctx) {
      generator.write(obj.value);
    }
  }

  public static ReturnDecisionReasonType fromValue(String text) {
    for (ReturnDecisionReasonType b : ReturnDecisionReasonType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

