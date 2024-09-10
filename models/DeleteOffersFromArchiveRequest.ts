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
 * Товары, которые нужно восстановить из архива.
 * 
 * @export
 * @interface DeleteOffersFromArchiveRequest
 */
export interface DeleteOffersFromArchiveRequest {
    /**
     * Список товаров, которые нужно восстановить из архива.
     * @type {Array<string>}
     * @memberof DeleteOffersFromArchiveRequest
     */
    offerIds: Array<string>;
}

/**
 * Check if a given object implements the DeleteOffersFromArchiveRequest interface.
 */
export function instanceOfDeleteOffersFromArchiveRequest(value: object): value is DeleteOffersFromArchiveRequest {
    if (!('offerIds' in value) || value['offerIds'] === undefined) return false;
    return true;
}

export function DeleteOffersFromArchiveRequestFromJSON(json: any): DeleteOffersFromArchiveRequest {
    return DeleteOffersFromArchiveRequestFromJSONTyped(json, false);
}

export function DeleteOffersFromArchiveRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): DeleteOffersFromArchiveRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'offerIds': json['offerIds'],
    };
}

export function DeleteOffersFromArchiveRequestToJSON(value?: DeleteOffersFromArchiveRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'offerIds': value['offerIds'],
    };
}
