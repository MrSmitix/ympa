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
package ympa_kotlin_server.models

import ympa_kotlin_server.models.BriefOrderItemInstanceDTO

/**
 * Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
 * @param id Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр. 
 * @param count Новое количество товара.
 * @param instances Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/). 
 */
data class OrderItemModificationDTO(
    /* Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр.  */
    val id: kotlin.Long,
    /* Новое количество товара. */
    val count: kotlin.Int,
    /* Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  */
    val instances: kotlin.collections.List<BriefOrderItemInstanceDTO>? = null
) 

