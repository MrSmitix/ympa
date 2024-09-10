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
import type { CampaignDTO } from './CampaignDTO';
import {
    CampaignDTOFromJSON,
    CampaignDTOFromJSONTyped,
    CampaignDTOToJSON,
} from './CampaignDTO';
import type { FlippingPagerDTO } from './FlippingPagerDTO';
import {
    FlippingPagerDTOFromJSON,
    FlippingPagerDTOFromJSONTyped,
    FlippingPagerDTOToJSON,
} from './FlippingPagerDTO';

/**
 * Результаты поиска магазинов.
 * @export
 * @interface GetCampaignsResponse
 */
export interface GetCampaignsResponse {
    /**
     * Список с информацией по каждому магазину.
     * @type {Array<CampaignDTO>}
     * @memberof GetCampaignsResponse
     */
    campaigns: Array<CampaignDTO>;
    /**
     * 
     * @type {FlippingPagerDTO}
     * @memberof GetCampaignsResponse
     */
    pager?: FlippingPagerDTO;
}

/**
 * Check if a given object implements the GetCampaignsResponse interface.
 */
export function instanceOfGetCampaignsResponse(value: object): value is GetCampaignsResponse {
    if (!('campaigns' in value) || value['campaigns'] === undefined) return false;
    return true;
}

export function GetCampaignsResponseFromJSON(json: any): GetCampaignsResponse {
    return GetCampaignsResponseFromJSONTyped(json, false);
}

export function GetCampaignsResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetCampaignsResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'campaigns': ((json['campaigns'] as Array<any>).map(CampaignDTOFromJSON)),
        'pager': json['pager'] == null ? undefined : FlippingPagerDTOFromJSON(json['pager']),
    };
}

export function GetCampaignsResponseToJSON(value?: GetCampaignsResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'campaigns': ((value['campaigns'] as Array<any>).map(CampaignDTOToJSON)),
        'pager': FlippingPagerDTOToJSON(value['pager']),
    };
}
