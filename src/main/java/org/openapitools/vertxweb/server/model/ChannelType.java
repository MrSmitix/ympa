package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Каналы продвижения товаров:  * &#x60;PUSH&#x60; — пуш-уведомление из приложения Яндекс Маркет.  * &#x60;STRETCH_MAIN&#x60; — верхний баннер-растяжка на главной странице Яндекс Маркета.  * &#x60;MAIN_PAGE_CAROUSEL&#x60; — карусель акций на главной странице Яндекс Маркета.  * &#x60;PRODUCT_RETAIL_PAGE&#x60; — товар на странице ритейл-повода.  * &#x60;MAIN_PAGE_CAROUSEL_WEB&#x60; — карусель акций на главной странице веб версии Яндекс Маркета.  * &#x60;PRODUCT_SEPARATE_LANDING&#x60; — товар на лендинге акции.  * &#x60;SUPER_SHELF_CATEGORY&#x60; — полка в категориях.  * &#x60;CAROUSEL_RETAIL_PAGE&#x60; — карусель на лендинге ритейл-повода.  * &#x60;POPUP_APPLICATION&#x60; — всплывающее окно в приложении Яндекс Маркет.  * &#x60;POST_TELEGRAM&#x60; — пост в Телеграм-канале Яндекс Маркета.  * &#x60;CPA&#x60; — реклама в партнерской сети Яндекс Маркета.  * &#x60;WEB_PERFORMANCE_DIRECT&#x60; — реклама в Яндекс Директе.  * &#x60;APP_PERFORMANCE&#x60; — реклама в AppStore и Google Play.  * &#x60;BANNER_PICKUP_POINT&#x60; — баннер в ПВЗ Маркета.  * &#x60;BLOGGER_PERFORMANCE&#x60; — рекламная интеграция у блогеров.  * &#x60;DIGITAL_CHANNEL_BANNER&#x60; — баннер в digital-каналах и социальных сетях VK, Одноклассники.  * &#x60;YANDEX_ECOSYSTEM_CHANNELS&#x60; — реклама в других сервисах Яндекса: GO, Delivery, Еда.  * &#x60;PARTNERS_MAIN_BANNER&#x60; — баннер на главной странице mail.ru, auto.ru, ya.ru.  * &#x60;OTHER&#x60; — прочее. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChannelType   {
  

  public ChannelType () {

  }

  public ChannelType () {
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelType channelType = (ChannelType) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
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
