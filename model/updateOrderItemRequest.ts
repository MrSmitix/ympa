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
import { OrderItemModificationDTO } from './orderItemModificationDTO';
import { OrderItemsModificationRequestReasonType } from './orderItemsModificationRequestReasonType';


/**
 * Запрос на обновление состава заказа.
 */
export interface UpdateOrderItemRequest { 
    /**
     * Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
     */
    items: Array<OrderItemModificationDTO>;
    reason?: OrderItemsModificationRequestReasonType;
}
export namespace UpdateOrderItemRequest {
}


