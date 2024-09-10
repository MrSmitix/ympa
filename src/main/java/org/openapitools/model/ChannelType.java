/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;



/**
 * Каналы продвижения товаров:  * `PUSH` — пуш-уведомление из приложения Яндекс Маркет.  * `STRETCH_MAIN` — верхний баннер-растяжка на главной странице Яндекс Маркета.  * `MAIN_PAGE_CAROUSEL` — карусель акций на главной странице Яндекс Маркета.  * `PRODUCT_RETAIL_PAGE` — товар на странице ритейл-повода.  * `MAIN_PAGE_CAROUSEL_WEB` — карусель акций на главной странице веб версии Яндекс Маркета.  * `PRODUCT_SEPARATE_LANDING` — товар на лендинге акции.  * `SUPER_SHELF_CATEGORY` — полка в категориях.  * `CAROUSEL_RETAIL_PAGE` — карусель на лендинге ритейл-повода.  * `POPUP_APPLICATION` — всплывающее окно в приложении Яндекс Маркет.  * `POST_TELEGRAM` — пост в Телеграм-канале Яндекс Маркета.  * `CPA` — реклама в партнерской сети Яндекс Маркета.  * `WEB_PERFORMANCE_DIRECT` — реклама в Яндекс Директе.  * `APP_PERFORMANCE` — реклама в AppStore и Google Play.  * `BANNER_PICKUP_POINT` — баннер в ПВЗ Маркета.  * `BLOGGER_PERFORMANCE` — рекламная интеграция у блогеров.  * `DIGITAL_CHANNEL_BANNER` — баннер в digital-каналах и социальных сетях VK, Одноклассники.  * `YANDEX_ECOSYSTEM_CHANNELS` — реклама в других сервисах Яндекса: GO, Delivery, Еда.  * `PARTNERS_MAIN_BANNER` — баннер на главной странице mail.ru, auto.ru, ya.ru.  * `OTHER` — прочее. 
 */

@ApiModel(description = "Каналы продвижения товаров:  * `PUSH` — пуш-уведомление из приложения Яндекс Маркет.  * `STRETCH_MAIN` — верхний баннер-растяжка на главной странице Яндекс Маркета.  * `MAIN_PAGE_CAROUSEL` — карусель акций на главной странице Яндекс Маркета.  * `PRODUCT_RETAIL_PAGE` — товар на странице ритейл-повода.  * `MAIN_PAGE_CAROUSEL_WEB` — карусель акций на главной странице веб версии Яндекс Маркета.  * `PRODUCT_SEPARATE_LANDING` — товар на лендинге акции.  * `SUPER_SHELF_CATEGORY` — полка в категориях.  * `CAROUSEL_RETAIL_PAGE` — карусель на лендинге ритейл-повода.  * `POPUP_APPLICATION` — всплывающее окно в приложении Яндекс Маркет.  * `POST_TELEGRAM` — пост в Телеграм-канале Яндекс Маркета.  * `CPA` — реклама в партнерской сети Яндекс Маркета.  * `WEB_PERFORMANCE_DIRECT` — реклама в Яндекс Директе.  * `APP_PERFORMANCE` — реклама в AppStore и Google Play.  * `BANNER_PICKUP_POINT` — баннер в ПВЗ Маркета.  * `BLOGGER_PERFORMANCE` — рекламная интеграция у блогеров.  * `DIGITAL_CHANNEL_BANNER` — баннер в digital-каналах и социальных сетях VK, Одноклассники.  * `YANDEX_ECOSYSTEM_CHANNELS` — реклама в других сервисах Яндекса: GO, Delivery, Еда.  * `PARTNERS_MAIN_BANNER` — баннер на главной странице mail.ru, auto.ru, ya.ru.  * `OTHER` — прочее. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ChannelType   {
  


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelType channelType = (ChannelType) o;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelType {\n");
    
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

