/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
import type { OrderItemSubsidyType } from './OrderItemSubsidyType';
import {
    OrderItemSubsidyTypeFromJSON,
    OrderItemSubsidyTypeFromJSONTyped,
    OrderItemSubsidyTypeToJSON,
} from './OrderItemSubsidyType';

/**
 * Общее вознаграждение партнеру за все скидки на товар:
 * 
 * * по промокодам, купонам и акциям;
 * * по баллам Плюса.
 * 
 * Передается в валюте заказа.
 * 
 * @export
 * @interface OrderItemSubsidyDTO
 */
export interface OrderItemSubsidyDTO {
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



/**
 * Check if a given object implements the OrderItemSubsidyDTO interface.
 */
export function instanceOfOrderItemSubsidyDTO(value: object): value is OrderItemSubsidyDTO {
    return true;
}

export function OrderItemSubsidyDTOFromJSON(json: any): OrderItemSubsidyDTO {
    return OrderItemSubsidyDTOFromJSONTyped(json, false);
}

export function OrderItemSubsidyDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): OrderItemSubsidyDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'type': json['type'] == null ? undefined : OrderItemSubsidyTypeFromJSON(json['type']),
        'amount': json['amount'] == null ? undefined : json['amount'],
    };
}

export function OrderItemSubsidyDTOToJSON(value?: OrderItemSubsidyDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'type': OrderItemSubsidyTypeToJSON(value['type']),
        'amount': value['amount'],
    };
}

