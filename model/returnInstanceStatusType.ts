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


/**
 * Логистический статус конкретного товара.
 */
export type ReturnInstanceStatusType = 'CREATED' | 'RECEIVED' | 'IN_TRANSIT' | 'READY_FOR_PICKUP' | 'PICKED' | 'RECEIVED_ON_FULFILLMENT' | 'CANCELLED' | 'LOST' | 'UTILIZED' | 'PREPARED_FOR_UTILIZATION' | 'EXPROPRIATED' | 'NOT_IN_DEMAND';

export const ReturnInstanceStatusType = {
    Created: 'CREATED' as ReturnInstanceStatusType,
    Received: 'RECEIVED' as ReturnInstanceStatusType,
    InTransit: 'IN_TRANSIT' as ReturnInstanceStatusType,
    ReadyForPickup: 'READY_FOR_PICKUP' as ReturnInstanceStatusType,
    Picked: 'PICKED' as ReturnInstanceStatusType,
    ReceivedOnFulfillment: 'RECEIVED_ON_FULFILLMENT' as ReturnInstanceStatusType,
    Cancelled: 'CANCELLED' as ReturnInstanceStatusType,
    Lost: 'LOST' as ReturnInstanceStatusType,
    Utilized: 'UTILIZED' as ReturnInstanceStatusType,
    PreparedForUtilization: 'PREPARED_FOR_UTILIZATION' as ReturnInstanceStatusType,
    Expropriated: 'EXPROPRIATED' as ReturnInstanceStatusType,
    NotInDemand: 'NOT_IN_DEMAND' as ReturnInstanceStatusType
};
