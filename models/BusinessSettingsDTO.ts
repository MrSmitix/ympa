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
import type { CurrencyType } from './CurrencyType';
import {
    CurrencyTypeFromJSON,
    CurrencyTypeFromJSONTyped,
    CurrencyTypeToJSON,
} from './CurrencyType';

/**
 * Настройки кабинета.
 * @export
 * @interface BusinessSettingsDTO
 */
export interface BusinessSettingsDTO {
    /**
     * Можно ли установить только [базовую цену](*rule):
     * * `false` — можно задать и базовую цену, и цены в конкретных магазинах.
     * * `true` — можно задать только базовую цену.
     * 
     * @type {boolean}
     * @memberof BusinessSettingsDTO
     */
    onlyDefaultPrice?: boolean;
    /**
     * 
     * @type {CurrencyType}
     * @memberof BusinessSettingsDTO
     */
    currency?: CurrencyType;
}



/**
 * Check if a given object implements the BusinessSettingsDTO interface.
 */
export function instanceOfBusinessSettingsDTO(value: object): value is BusinessSettingsDTO {
    return true;
}

export function BusinessSettingsDTOFromJSON(json: any): BusinessSettingsDTO {
    return BusinessSettingsDTOFromJSONTyped(json, false);
}

export function BusinessSettingsDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): BusinessSettingsDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'onlyDefaultPrice': json['onlyDefaultPrice'] == null ? undefined : json['onlyDefaultPrice'],
        'currency': json['currency'] == null ? undefined : CurrencyTypeFromJSON(json['currency']),
    };
}

export function BusinessSettingsDTOToJSON(value?: BusinessSettingsDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'onlyDefaultPrice': value['onlyDefaultPrice'],
        'currency': CurrencyTypeToJSON(value['currency']),
    };
}

