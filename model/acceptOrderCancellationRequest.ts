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
import { OrderCancellationReasonType } from './orderCancellationReasonType';


export interface AcceptOrderCancellationRequest { 
    /**
     * Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов. 
     */
    accepted: boolean;
    reason?: OrderCancellationReasonType;
}
export namespace AcceptOrderCancellationRequest {
}


