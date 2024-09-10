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
 * Запрос списка цен.
 * @export
 * @interface GetPricesByOfferIdsRequest
 */
export interface GetPricesByOfferIdsRequest {
    /**
     * Список SKU.
     * 
     * {% note warning "Такой список возвращается только целиком" %}
     * 
     * Если вы запрашиваете информацию по конкретным SKU, не заполняйте:
     * 
     * * `page_token`
     * * `limit`
     * 
     * {% endnote %}
     * 
     *  
     * 
     * @type {Array<string>}
     * @memberof GetPricesByOfferIdsRequest
     */
    offerIds?: Array<string> | null;
}

/**
 * Check if a given object implements the GetPricesByOfferIdsRequest interface.
 */
export function instanceOfGetPricesByOfferIdsRequest(value: object): value is GetPricesByOfferIdsRequest {
    return true;
}

export function GetPricesByOfferIdsRequestFromJSON(json: any): GetPricesByOfferIdsRequest {
    return GetPricesByOfferIdsRequestFromJSONTyped(json, false);
}

export function GetPricesByOfferIdsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetPricesByOfferIdsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'offerIds': json['offerIds'] == null ? undefined : json['offerIds'],
    };
}

export function GetPricesByOfferIdsRequestToJSON(value?: GetPricesByOfferIdsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'offerIds': value['offerIds'],
    };
}
