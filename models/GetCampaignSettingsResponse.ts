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
import type { CampaignSettingsDTO } from './CampaignSettingsDTO';
import {
    CampaignSettingsDTOFromJSON,
    CampaignSettingsDTOFromJSONTyped,
    CampaignSettingsDTOToJSON,
} from './CampaignSettingsDTO';

/**
 * Ответ на запрос настроек магазина.
 * @export
 * @interface GetCampaignSettingsResponse
 */
export interface GetCampaignSettingsResponse {
    /**
     * 
     * @type {CampaignSettingsDTO}
     * @memberof GetCampaignSettingsResponse
     */
    settings?: CampaignSettingsDTO;
}

/**
 * Check if a given object implements the GetCampaignSettingsResponse interface.
 */
export function instanceOfGetCampaignSettingsResponse(value: object): value is GetCampaignSettingsResponse {
    return true;
}

export function GetCampaignSettingsResponseFromJSON(json: any): GetCampaignSettingsResponse {
    return GetCampaignSettingsResponseFromJSONTyped(json, false);
}

export function GetCampaignSettingsResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetCampaignSettingsResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'settings': json['settings'] == null ? undefined : CampaignSettingsDTOFromJSON(json['settings']),
    };
}

export function GetCampaignSettingsResponseToJSON(value?: GetCampaignSettingsResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'settings': CampaignSettingsDTOToJSON(value['settings']),
    };
}

