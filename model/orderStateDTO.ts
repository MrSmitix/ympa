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
import { OrderSubstatusType } from './orderSubstatusType';
import { OrderStatusType } from './orderStatusType';


/**
 * Информация по заказу.
 */
export interface OrderStateDTO { 
    /**
     * Идентификатор заказа.
     */
    id: number;
    status: OrderStatusType;
    substatus?: OrderSubstatusType;
}
export namespace OrderStateDTO {
}


