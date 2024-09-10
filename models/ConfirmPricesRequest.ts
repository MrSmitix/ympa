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
 * Запрос на подтверждение цены.
 * 
 * @export
 * @interface ConfirmPricesRequest
 */
export interface ConfirmPricesRequest {
    /**
     * Идентификаторы товаров, у которых подтверждается цена.
     * @type {Array<string>}
     * @memberof ConfirmPricesRequest
     */
    offerIds: Array<string>;
}

/**
 * Check if a given object implements the ConfirmPricesRequest interface.
 */
export function instanceOfConfirmPricesRequest(value: object): value is ConfirmPricesRequest {
    if (!('offerIds' in value) || value['offerIds'] === undefined) return false;
    return true;
}

export function ConfirmPricesRequestFromJSON(json: any): ConfirmPricesRequest {
    return ConfirmPricesRequestFromJSONTyped(json, false);
}

export function ConfirmPricesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ConfirmPricesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'offerIds': json['offerIds'],
    };
}

export function ConfirmPricesRequestToJSON(value?: ConfirmPricesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'offerIds': value['offerIds'],
    };
}
