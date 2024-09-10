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
    CampaignDTO,
    CampaignDTOFromJSON,
    CampaignDTOToJSON,
    FlippingPagerDTO,
    FlippingPagerDTOFromJSON,
    FlippingPagerDTOToJSON,
} from './';

/**
 * Результаты поиска магазинов.
 * @export
 * @interface GetCampaignsResponse
 */
export interface GetCampaignsResponse  {
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

export function GetCampaignsResponseFromJSON(json: any): GetCampaignsResponse {
    return {
        'campaigns': (json['campaigns'] as Array<any>).map(CampaignDTOFromJSON),
        'pager': !exists(json, 'pager') ? undefined : FlippingPagerDTOFromJSON(json['pager']),
    };
}

export function GetCampaignsResponseToJSON(value?: GetCampaignsResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'campaigns': (value.campaigns as Array<any>).map(CampaignDTOToJSON),
        'pager': FlippingPagerDTOToJSON(value.pager),
    };
}


