// tslint:disable
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

import type {
    OrderStatusType,
    OrderSubstatusType,
} from './';

/**
 * Информация по заказу.
 * @export
 * @interface OrderStateDTO
 */
export interface OrderStateDTO {
    /**
     * Идентификатор заказа.
     * @type {number}
     * @memberof OrderStateDTO
     */
    id: number;
    /**
     * @type {OrderStatusType}
     * @memberof OrderStateDTO
     */
    status: OrderStatusType;
    /**
     * @type {OrderSubstatusType}
     * @memberof OrderStateDTO
     */
    substatus?: OrderSubstatusType;
}


