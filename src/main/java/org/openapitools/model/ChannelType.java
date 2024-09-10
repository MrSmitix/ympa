package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Каналы продвижения товаров:  * &#x60;PUSH&#x60; — пуш-уведомление из приложения Яндекс Маркет.  * &#x60;STRETCH_MAIN&#x60; — верхний баннер-растяжка на главной странице Яндекс Маркета.  * &#x60;MAIN_PAGE_CAROUSEL&#x60; — карусель акций на главной странице Яндекс Маркета.  * &#x60;PRODUCT_RETAIL_PAGE&#x60; — товар на странице ритейл-повода.  * &#x60;MAIN_PAGE_CAROUSEL_WEB&#x60; — карусель акций на главной странице веб версии Яндекс Маркета.  * &#x60;PRODUCT_SEPARATE_LANDING&#x60; — товар на лендинге акции.  * &#x60;SUPER_SHELF_CATEGORY&#x60; — полка в категориях.  * &#x60;CAROUSEL_RETAIL_PAGE&#x60; — карусель на лендинге ритейл-повода.  * &#x60;POPUP_APPLICATION&#x60; — всплывающее окно в приложении Яндекс Маркет.  * &#x60;POST_TELEGRAM&#x60; — пост в Телеграм-канале Яндекс Маркета.  * &#x60;CPA&#x60; — реклама в партнерской сети Яндекс Маркета.  * &#x60;WEB_PERFORMANCE_DIRECT&#x60; — реклама в Яндекс Директе.  * &#x60;APP_PERFORMANCE&#x60; — реклама в AppStore и Google Play.  * &#x60;BANNER_PICKUP_POINT&#x60; — баннер в ПВЗ Маркета.  * &#x60;BLOGGER_PERFORMANCE&#x60; — рекламная интеграция у блогеров.  * &#x60;DIGITAL_CHANNEL_BANNER&#x60; — баннер в digital-каналах и социальных сетях VK, Одноклассники.  * &#x60;YANDEX_ECOSYSTEM_CHANNELS&#x60; — реклама в других сервисах Яндекса: GO, Delivery, Еда.  * &#x60;PARTNERS_MAIN_BANNER&#x60; — баннер на главной странице mail.ru, auto.ru, ya.ru.  * &#x60;OTHER&#x60; — прочее. 
 */

@Schema(name = "ChannelType", description = "Каналы продвижения товаров:  * `PUSH` — пуш-уведомление из приложения Яндекс Маркет.  * `STRETCH_MAIN` — верхний баннер-растяжка на главной странице Яндекс Маркета.  * `MAIN_PAGE_CAROUSEL` — карусель акций на главной странице Яндекс Маркета.  * `PRODUCT_RETAIL_PAGE` — товар на странице ритейл-повода.  * `MAIN_PAGE_CAROUSEL_WEB` — карусель акций на главной странице веб версии Яндекс Маркета.  * `PRODUCT_SEPARATE_LANDING` — товар на лендинге акции.  * `SUPER_SHELF_CATEGORY` — полка в категориях.  * `CAROUSEL_RETAIL_PAGE` — карусель на лендинге ритейл-повода.  * `POPUP_APPLICATION` — всплывающее окно в приложении Яндекс Маркет.  * `POST_TELEGRAM` — пост в Телеграм-канале Яндекс Маркета.  * `CPA` — реклама в партнерской сети Яндекс Маркета.  * `WEB_PERFORMANCE_DIRECT` — реклама в Яндекс Директе.  * `APP_PERFORMANCE` — реклама в AppStore и Google Play.  * `BANNER_PICKUP_POINT` — баннер в ПВЗ Маркета.  * `BLOGGER_PERFORMANCE` — рекламная интеграция у блогеров.  * `DIGITAL_CHANNEL_BANNER` — баннер в digital-каналах и социальных сетях VK, Одноклассники.  * `YANDEX_ECOSYSTEM_CHANNELS` — реклама в других сервисах Яндекса: GO, Delivery, Еда.  * `PARTNERS_MAIN_BANNER` — баннер на главной странице mail.ru, auto.ru, ya.ru.  * `OTHER` — прочее. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ChannelType {

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
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

