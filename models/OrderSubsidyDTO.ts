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
import type { OrderSubsidyType } from './OrderSubsidyType';
import {
    OrderSubsidyTypeFromJSON,
    OrderSubsidyTypeFromJSONTyped,
    OrderSubsidyTypeToJSON,
} from './OrderSubsidyType';

/**
 * Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:
 * 
 * * по промокодам, купонам и акциям;
 * * по баллам Плюса;
 * * по доставке (DBS).
 * 
 * Передается в валюте заказа.
 * 
 * @export
 * @interface OrderSubsidyDTO
 */
export interface OrderSubsidyDTO {
    /**
     * 
     * @type {OrderSubsidyType}
     * @memberof OrderSubsidyDTO
     */
    type?: OrderSubsidyType;
    /**
     * Сумма субсидии.
     * @type {number}
     * @memberof OrderSubsidyDTO
     */
    amount?: number;
}



/**
 * Check if a given object implements the OrderSubsidyDTO interface.
 */
export function instanceOfOrderSubsidyDTO(value: object): value is OrderSubsidyDTO {
    return true;
}

export function OrderSubsidyDTOFromJSON(json: any): OrderSubsidyDTO {
    return OrderSubsidyDTOFromJSONTyped(json, false);
}

export function OrderSubsidyDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): OrderSubsidyDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'type': json['type'] == null ? undefined : OrderSubsidyTypeFromJSON(json['type']),
        'amount': json['amount'] == null ? undefined : json['amount'],
    };
}

export function OrderSubsidyDTOToJSON(value?: OrderSubsidyDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'type': OrderSubsidyTypeToJSON(value['type']),
        'amount': value['amount'],
    };
}

