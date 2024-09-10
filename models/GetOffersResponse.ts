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
import type { FlippingPagerDTO } from './FlippingPagerDTO';
import {
    FlippingPagerDTOFromJSON,
    FlippingPagerDTOFromJSONTyped,
    FlippingPagerDTOToJSON,
} from './FlippingPagerDTO';
import type { OfferDTO } from './OfferDTO';
import {
    OfferDTOFromJSON,
    OfferDTOFromJSONTyped,
    OfferDTOToJSON,
} from './OfferDTO';

/**
 * Список предложений с пагинатором.
 * @export
 * @interface GetOffersResponse
 */
export interface GetOffersResponse {
    /**
     * Список предложений магазина.
     * @type {Array<OfferDTO>}
     * @memberof GetOffersResponse
     */
    offers: Array<OfferDTO>;
    /**
     * 
     * @type {FlippingPagerDTO}
     * @memberof GetOffersResponse
     */
    pager?: FlippingPagerDTO;
}

/**
 * Check if a given object implements the GetOffersResponse interface.
 */
export function instanceOfGetOffersResponse(value: object): value is GetOffersResponse {
    if (!('offers' in value) || value['offers'] === undefined) return false;
    return true;
}

export function GetOffersResponseFromJSON(json: any): GetOffersResponse {
    return GetOffersResponseFromJSONTyped(json, false);
}

export function GetOffersResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetOffersResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'offers': ((json['offers'] as Array<any>).map(OfferDTOFromJSON)),
        'pager': json['pager'] == null ? undefined : FlippingPagerDTOFromJSON(json['pager']),
    };
}

export function GetOffersResponseToJSON(value?: GetOffersResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'offers': ((value['offers'] as Array<any>).map(OfferDTOToJSON)),
        'pager': FlippingPagerDTOToJSON(value['pager']),
    };
}
