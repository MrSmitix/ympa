<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Каналы продвижения товаров:  * &#x60;PUSH&#x60; — пуш-уведомление из приложения Яндекс Маркет.  * &#x60;STRETCH_MAIN&#x60; — верхний баннер-растяжка на главной странице Яндекс Маркета.  * &#x60;MAIN_PAGE_CAROUSEL&#x60; — карусель акций на главной странице Яндекс Маркета.  * &#x60;PRODUCT_RETAIL_PAGE&#x60; — товар на странице ритейл-повода.  * &#x60;MAIN_PAGE_CAROUSEL_WEB&#x60; — карусель акций на главной странице веб версии Яндекс Маркета.  * &#x60;PRODUCT_SEPARATE_LANDING&#x60; — товар на лендинге акции.  * &#x60;SUPER_SHELF_CATEGORY&#x60; — полка в категориях.  * &#x60;CAROUSEL_RETAIL_PAGE&#x60; — карусель на лендинге ритейл-повода.  * &#x60;POPUP_APPLICATION&#x60; — всплывающее окно в приложении Яндекс Маркет.  * &#x60;POST_TELEGRAM&#x60; — пост в Телеграм-канале Яндекс Маркета.  * &#x60;CPA&#x60; — реклама в партнерской сети Яндекс Маркета.  * &#x60;WEB_PERFORMANCE_DIRECT&#x60; — реклама в Яндекс Директе.  * &#x60;APP_PERFORMANCE&#x60; — реклама в AppStore и Google Play.  * &#x60;BANNER_PICKUP_POINT&#x60; — баннер в ПВЗ Маркета.  * &#x60;BLOGGER_PERFORMANCE&#x60; — рекламная интеграция у блогеров.  * &#x60;DIGITAL_CHANNEL_BANNER&#x60; — баннер в digital-каналах и социальных сетях VK, Одноклассники.  * &#x60;YANDEX_ECOSYSTEM_CHANNELS&#x60; — реклама в других сервисах Яндекса: GO, Delivery, Еда.  * &#x60;PARTNERS_MAIN_BANNER&#x60; — баннер на главной странице mail.ru, auto.ru, ya.ru.  * &#x60;OTHER&#x60; — прочее.
 */
class ChannelType
{
}
