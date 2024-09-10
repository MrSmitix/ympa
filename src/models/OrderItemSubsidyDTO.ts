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

import { exists, mapValues } from '../runtime';
import {
    OrderItemSubsidyType,
    OrderItemSubsidyTypeFromJSON,
    OrderItemSubsidyTypeToJSON,
} from './';

/**
 * Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 
 * @export
 * @interface OrderItemSubsidyDTO
 */
export interface OrderItemSubsidyDTO  {
    /**
     * 
     * @type {OrderItemSubsidyType}
     * @memberof OrderItemSubsidyDTO
     */
    type?: OrderItemSubsidyType;
    /**
     * Сумма субсидии.
     * @type {number}
     * @memberof OrderItemSubsidyDTO
     */
    amount?: number;
}

export function OrderItemSubsidyDTOFromJSON(json: any): OrderItemSubsidyDTO {
    return {
        'type': !exists(json, 'type') ? undefined : OrderItemSubsidyTypeFromJSON(json['type']),
        'amount': !exists(json, 'amount') ? undefined : json['amount'],
    };
}

export function OrderItemSubsidyDTOToJSON(value?: OrderItemSubsidyDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'type': OrderItemSubsidyTypeToJSON(value.type),
        'amount': value.amount,
    };
}



