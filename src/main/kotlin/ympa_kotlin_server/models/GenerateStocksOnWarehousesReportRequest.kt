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


/**
 * Данные, необходимые для генерации отчета. 
 * @param campaignId Идентификатор магазина.
 * @param warehouseIds Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
 * @param reportDate Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
 * @param categoryIds Фильтр по категориям на Маркете (кроме модели FBY).
 * @param hasStocks Фильтр по наличию остатков (кроме модели FBY).
 */
data class GenerateStocksOnWarehousesReportRequest(
    /* Идентификатор магазина. */
    val campaignId: kotlin.Long,
    /* Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). */
    val warehouseIds: kotlin.collections.List<kotlin.Long>? = null,
    /* Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. */
    val reportDate: java.time.LocalDate? = null,
    /* Фильтр по категориям на Маркете (кроме модели FBY). */
    val categoryIds: kotlin.collections.List<kotlin.Long>? = null,
    /* Фильтр по наличию остатков (кроме модели FBY). */
    val hasStocks: kotlin.Boolean? = null
) 

