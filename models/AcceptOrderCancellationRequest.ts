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
import type { OrderCancellationReasonType } from './OrderCancellationReasonType';
import {
    OrderCancellationReasonTypeFromJSON,
    OrderCancellationReasonTypeFromJSONTyped,
    OrderCancellationReasonTypeToJSON,
} from './OrderCancellationReasonType';

/**
 * 
 * @export
 * @interface AcceptOrderCancellationRequest
 */
export interface AcceptOrderCancellationRequest {
    /**
     * Решение об отмене заказа:
     * 
     * * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю.
     * * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов.
     * 
     * @type {boolean}
     * @memberof AcceptOrderCancellationRequest
     */
    accepted: boolean;
    /**
     * 
     * @type {OrderCancellationReasonType}
     * @memberof AcceptOrderCancellationRequest
     */
    reason?: OrderCancellationReasonType;
}



/**
 * Check if a given object implements the AcceptOrderCancellationRequest interface.
 */
export function instanceOfAcceptOrderCancellationRequest(value: object): value is AcceptOrderCancellationRequest {
    if (!('accepted' in value) || value['accepted'] === undefined) return false;
    return true;
}

export function AcceptOrderCancellationRequestFromJSON(json: any): AcceptOrderCancellationRequest {
    return AcceptOrderCancellationRequestFromJSONTyped(json, false);
}

export function AcceptOrderCancellationRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): AcceptOrderCancellationRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'accepted': json['accepted'],
        'reason': json['reason'] == null ? undefined : OrderCancellationReasonTypeFromJSON(json['reason']),
    };
}

export function AcceptOrderCancellationRequestToJSON(value?: AcceptOrderCancellationRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'accepted': value['accepted'],
        'reason': OrderCancellationReasonTypeToJSON(value['reason']),
    };
}

