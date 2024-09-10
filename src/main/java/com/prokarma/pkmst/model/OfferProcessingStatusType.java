package com.prokarma.pkmst.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Статус публикации товара:  * `READY` — товар прошел модерацию. Чтобы разместить его на Маркете, установите для него цену. * `IN_WORK` — товар проходит модерацию. Это занимает несколько дней. * `NEED_CONTENT` — для товара без SKU на Маркете `marketSku` нужно найти карточку самостоятельно (через API или кабинет продавца на Маркете) или создать ее, если товар еще не продается на Маркете. * `NEED_INFO` — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. Информация о причинах отклонения возвращается в параметре `notes`. * `REJECTED` — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * `SUSPENDED` — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. 
 */
public enum OfferProcessingStatusType {
  
  UNKNOWN("UNKNOWN"),
  
  READY("READY"),
  
  IN_WORK("IN_WORK"),
  
  NEED_INFO("NEED_INFO"),
  
  NEED_MAPPING("NEED_MAPPING"),
  
  NEED_CONTENT("NEED_CONTENT"),
  
  CONTENT_PROCESSING("CONTENT_PROCESSING"),
  
  SUSPENDED("SUSPENDED"),
  
  REJECTED("REJECTED"),
  
  REVIEW("REVIEW"),
  
  CREATE_ERROR("CREATE_ERROR"),
  
  UPDATE_ERROR("UPDATE_ERROR");

  private String value;

  OfferProcessingStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OfferProcessingStatusType fromValue(String text) {
    for (OfferProcessingStatusType b : OfferProcessingStatusType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

