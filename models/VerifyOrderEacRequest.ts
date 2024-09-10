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
/**
 * 
 * @export
 * @interface VerifyOrderEacRequest
 */
export interface VerifyOrderEacRequest {
    /**
     * Код для подтверждения ЭАПП.
     * @type {string}
     * @memberof VerifyOrderEacRequest
     */
    code?: string;
}

/**
 * Check if a given object implements the VerifyOrderEacRequest interface.
 */
export function instanceOfVerifyOrderEacRequest(value: object): value is VerifyOrderEacRequest {
    return true;
}

export function VerifyOrderEacRequestFromJSON(json: any): VerifyOrderEacRequest {
    return VerifyOrderEacRequestFromJSONTyped(json, false);
}

export function VerifyOrderEacRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): VerifyOrderEacRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'code': json['code'] == null ? undefined : json['code'],
    };
}

export function VerifyOrderEacRequestToJSON(value?: VerifyOrderEacRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'code': value['code'],
    };
}

