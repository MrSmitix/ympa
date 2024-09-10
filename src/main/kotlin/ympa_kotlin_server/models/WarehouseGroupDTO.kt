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

import ympa_kotlin_server.models.WarehouseDTO

/**
 * Информация о группе складов.
 * @param name Название группы складов.
 * @param mainWarehouse 
 * @param warehouses Список складов, входящих в группу.
 */
data class WarehouseGroupDTO(
    /* Название группы складов. */
    val name: kotlin.String,
    val mainWarehouse: WarehouseDTO,
    /* Список складов, входящих в группу. */
    val warehouses: kotlin.collections.List<WarehouseDTO>
) 

