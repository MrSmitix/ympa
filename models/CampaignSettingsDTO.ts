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
import type { CampaignSettingsLocalRegionDTO } from './CampaignSettingsLocalRegionDTO';
import {
    CampaignSettingsLocalRegionDTOFromJSON,
    CampaignSettingsLocalRegionDTOFromJSONTyped,
    CampaignSettingsLocalRegionDTOToJSON,
} from './CampaignSettingsLocalRegionDTO';

/**
 * Настройки магазина.
 * @export
 * @interface CampaignSettingsDTO
 */
export interface CampaignSettingsDTO {
    /**
     * Идентификатор региона, в котором находится магазин.
     * @type {number}
     * @memberof CampaignSettingsDTO
     */
    countryRegion?: number;
    /**
     * Наименование магазина на Яндекс Маркете.
     * Если наименование отсутствует, значение параметра выводится — `null`.
     * 
     * @type {string}
     * @memberof CampaignSettingsDTO
     */
    shopName?: string;
    /**
     * Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции.
     * Возможные значения:
     * * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции.
     * * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции.
     * 
     * @type {boolean}
     * @memberof CampaignSettingsDTO
     */
    showInContext?: boolean;
    /**
     * Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение).
     * Возможные значения:
     * * `false` — предложения не показываются в блоке cпецразмещения.
     * * `true` — предложения показываются в блоке cпецразмещения.
     * 
     * @type {boolean}
     * @memberof CampaignSettingsDTO
     */
    showInPremium?: boolean;
    /**
     * Признак использования внешней интернет-статистики.
     * Возможные значения:
     * * `false` — внешняя интернет-статистика не используется.
     * * `true` — внешняя интернет-статистика используется.
     * 
     * @type {boolean}
     * @memberof CampaignSettingsDTO
     */
    useOpenStat?: boolean;
    /**
     * 
     * @type {CampaignSettingsLocalRegionDTO}
     * @memberof CampaignSettingsDTO
     */
    localRegion?: CampaignSettingsLocalRegionDTO;
}

/**
 * Check if a given object implements the CampaignSettingsDTO interface.
 */
export function instanceOfCampaignSettingsDTO(value: object): value is CampaignSettingsDTO {
    return true;
}

export function CampaignSettingsDTOFromJSON(json: any): CampaignSettingsDTO {
    return CampaignSettingsDTOFromJSONTyped(json, false);
}

export function CampaignSettingsDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): CampaignSettingsDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'countryRegion': json['countryRegion'] == null ? undefined : json['countryRegion'],
        'shopName': json['shopName'] == null ? undefined : json['shopName'],
        'showInContext': json['showInContext'] == null ? undefined : json['showInContext'],
        'showInPremium': json['showInPremium'] == null ? undefined : json['showInPremium'],
        'useOpenStat': json['useOpenStat'] == null ? undefined : json['useOpenStat'],
        'localRegion': json['localRegion'] == null ? undefined : CampaignSettingsLocalRegionDTOFromJSON(json['localRegion']),
    };
}

export function CampaignSettingsDTOToJSON(value?: CampaignSettingsDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'countryRegion': value['countryRegion'],
        'shopName': value['shopName'],
        'showInContext': value['showInContext'],
        'showInPremium': value['showInPremium'],
        'useOpenStat': value['useOpenStat'],
        'localRegion': CampaignSettingsLocalRegionDTOToJSON(value['localRegion']),
    };
}

