package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Рекомендация по дополнению или замене контента. Не возвращается для карточек, которые заполнены Маркетом или содержат бывшие в употреблении товары.  Часть рекомендаций относятся к **основным параметрам**, которые есть у товаров любых категорий. Другие — к тем **характеристикам**, которые есть у товара потому, что он относится к определенной категории.  **1. Рекомендации, относящиеся к основным параметрам**  Каждая такая рекомендация относится к **единственному параметру**. Чтобы заполнить этот параметр, пользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  Рекомендации по заполнению параметров в `updateOfferMappings`:  * `RECOGNIZED_VENDOR` — напишите название производителя так, как его пишет сам производитель (параметр `vendor`). * `PICTURE_COUNT` — добавьте изображения (параметр `pictures`). * `FIRST_PICTURE_SIZE` — замените первое изображение более крупным (параметр `pictures`). * `TITLE_LENGTH` — измените название (параметр `name`). Составьте название по схеме: тип + бренд или производитель + модель + особенности, если есть (размер, вес, цвет). * `DESCRIPTION_LENGTH` — добавьте описание рекомендуемого размера (параметр `description`). * `AVERAGE_PICTURE_SIZE` — замените все изображения на изображения высокого качества (параметр `pictures`). * `FIRST_VIDEO_LENGTH` — добавьте первое видео рекомендуемой длины (параметр `videos`). * `AVERAGE_VIDEO_SIZE` — замените все видео на видео высокого качества (параметр `videos`). * `VIDEO_COUNT` — добавьте больше видео (параметр `videos`).  Рекомендуемые значения параметров описаны в [Справке Яндекс Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/add/).  **2. Рекомендации, относящиеся к характеристикам по категориям**  Каждая такая рекомендация предполагает заполнение **одной или нескольких характеристик**. Чтобы узнать, какие именно характеристики нужно заполнить, воспользуйтесь запросом [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md). Например, если вы получили рекомендацию `MAIN`, нужно заполнить характеристики, имеющие `MAIN` в массиве `recommendationTypes`.  Рекомендации:  * `MAIN` — заполните ключевые характеристики товара, которые используются в поиске и фильтрах. * `ADDITIONAL` — заполните дополнительные характеристики товара. * `DISTINCTIVE` — заполните характеристики, которыми отличаются друг от друга варианты товара.  **3. Устаревшие рекомендации**  * `HAS_VIDEO`. * `FILTERABLE`. * `HAS_DESCRIPTION`. * `HAS_BARCODE`. 
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum OfferCardRecommendationType {
  
  HAS_VIDEO("HAS_VIDEO"),
  
  RECOGNIZED_VENDOR("RECOGNIZED_VENDOR"),
  
  MAIN("MAIN"),
  
  ADDITIONAL("ADDITIONAL"),
  
  DISTINCTIVE("DISTINCTIVE"),
  
  FILTERABLE("FILTERABLE"),
  
  PICTURE_COUNT("PICTURE_COUNT"),
  
  HAS_DESCRIPTION("HAS_DESCRIPTION"),
  
  HAS_BARCODE("HAS_BARCODE"),
  
  FIRST_PICTURE_SIZE("FIRST_PICTURE_SIZE"),
  
  TITLE_LENGTH("TITLE_LENGTH"),
  
  DESCRIPTION_LENGTH("DESCRIPTION_LENGTH"),
  
  AVERAGE_PICTURE_SIZE("AVERAGE_PICTURE_SIZE"),
  
  FIRST_VIDEO_SIZE("FIRST_VIDEO_SIZE"),
  
  FIRST_VIDEO_LENGTH("FIRST_VIDEO_LENGTH"),
  
  AVERAGE_VIDEO_SIZE("AVERAGE_VIDEO_SIZE"),
  
  VIDEO_COUNT("VIDEO_COUNT");

  private String value;

  OfferCardRecommendationType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OfferCardRecommendationType fromValue(String value) {
    for (OfferCardRecommendationType b : OfferCardRecommendationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

