/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * Годные/негодные ярлыки по заказам в отгрузке.
 */
export interface OrdersShipmentInfoDTO { 
    /**
     * Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
     */
    orderIdsWithLabels: Set<number>;
    /**
     * Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
     */
    orderIdsWithoutLabels: Set<number>;
}

