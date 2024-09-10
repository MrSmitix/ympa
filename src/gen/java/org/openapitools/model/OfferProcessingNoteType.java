package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип причины, по которой товар не прошел модерацию:  * &#x60;ASSORTMENT&#x60; — товар производится в разных вариантах. Каждый из них нужно описать как отдельный товар (входной параметр &#x60;offer-mapping-entry&#x60; запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md) или строка в каталоге, если вы загружаете товары через кабинет продавца на Маркете). * &#x60;CANCELLED&#x60; — товар отозван с модерации по вашей инициативе. * &#x60;CONFLICTING_INFORMATION&#x60; _(ранее ошибочно &#x60;CONFLICTING&#x60;)_ — вы предоставили противоречивую информацию о товаре. Параметры, которые нужно исправить, указаны в параметре &#x60;payload&#x60;. * &#x60;DEPARTMENT_FROZEN&#x60; — правила размещения товаров в данной категории перерабатываются, поэтому товар пока не может пройти модерацию. * &#x60;INCORRECT_INFORMATION&#x60; — информация о товаре, которую вы предоставили, противоречит описанию от производителя. Параметры, которые нужно исправить, указаны в параметре &#x60;payload&#x60;. * &#x60;LEGAL_CONFLICT&#x60; — товар не прошел модерацию по юридическим причинам. Например, он официально не продается в России или у вас нет разрешения на его продажу. * &#x60;NEED_CLASSIFICATION_INFORMATION&#x60; — информации о товаре, которую вы предоставили, не хватает, чтобы отнести его к категории. Проверьте, что правильно указали название, категорию, производителя и страны производства товара, а также URL изображений или страниц с описанием, по которым можно идентифицировать товар. * &#x60;NEED_INFORMATION&#x60; — товар раньше не продавался в России и пока не размещается на Маркете. Для него можно создать карточку. Подробнее см. в разделе [Работа с карточкой товара](https://yandex.ru/support/marketplace/assortment/content/index.html) Справки Маркета для продавцов. * &#x60;NEED_PICTURES&#x60; — для идентификации товара нужны его изображения. Отправьте URL изображений товара в запросе [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md) или загрузите обновленный каталог через кабинет продавца на Маркете. * &#x60;NEED_VENDOR&#x60; — неверно указан производитель товара. * &#x60;NO_CATEGORY&#x60;, &#x60;NO_KNOWLEDGE&#x60; — товары из указанной категории пока не размещаются на Маркете. Если категория появится, товар будет снова отправлен на модерацию. * &#x60;NO_PARAMETERS_IN_SHOP_TITLE&#x60; — товар производится в разных вариантах, и из указанного названия непонятно, о каком идет речь. Параметры, которые нужно добавить в название товара, указаны в параметре &#x60;payload&#x60;. * &#x60;NO_SIZE_MEASURE&#x60; — для этого товара нужна размерная сетка. Отправьте ее в службу поддержки или вашему менеджеру. Требования к размерной сетке указаны в параметре &#x60;payload&#x60;. * &#x60;UNKNOWN&#x60; — товар не прошел модерацию по другой причине. Обратитесь в службу поддержки или к вашему менеджеру. 
 */
public enum OfferProcessingNoteType {
  
  ASSORTMENT("ASSORTMENT"),
  
  CANCELLED("CANCELLED"),
  
  CONFLICTING_INFORMATION("CONFLICTING_INFORMATION"),
  
  OTHER("OTHER"),
  
  DEPARTMENT_FROZEN("DEPARTMENT_FROZEN"),
  
  INCORRECT_INFORMATION("INCORRECT_INFORMATION"),
  
  LEGAL_CONFLICT("LEGAL_CONFLICT"),
  
  NEED_CLASSIFICATION_INFORMATION("NEED_CLASSIFICATION_INFORMATION"),
  
  NEED_INFORMATION("NEED_INFORMATION"),
  
  NEED_PICTURES("NEED_PICTURES"),
  
  NEED_VENDOR("NEED_VENDOR"),
  
  NO_CATEGORY("NO_CATEGORY"),
  
  NO_KNOWLEDGE("NO_KNOWLEDGE"),
  
  NO_PARAMETERS_IN_SHOP_TITLE("NO_PARAMETERS_IN_SHOP_TITLE"),
  
  NO_SIZE_MEASURE("NO_SIZE_MEASURE"),
  
  SAMPLE_LINE("SAMPLE_LINE");

  private String value;

  OfferProcessingNoteType(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static OfferProcessingNoteType fromString(String s) {
      for (OfferProcessingNoteType b : OfferProcessingNoteType.values()) {
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
  public static OfferProcessingNoteType fromValue(String value) {
    for (OfferProcessingNoteType b : OfferProcessingNoteType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


