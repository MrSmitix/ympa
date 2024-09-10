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
    CurrencyType,
    CurrencyTypeFromJSON,
    CurrencyTypeToJSON,
} from './';

/**
 * Региональная информация.
 * @export
 * @interface RegionalModelInfoDTO
 */
export interface RegionalModelInfoDTO  {
    /**
     * 
     * @type {CurrencyType}
     * @memberof RegionalModelInfoDTO
     */
    currency?: CurrencyType;
    /**
     * Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
     * @type {number}
     * @memberof RegionalModelInfoDTO
     */
    regionId?: number;
}

export function RegionalModelInfoDTOFromJSON(json: any): RegionalModelInfoDTO {
    return {
        'currency': !exists(json, 'currency') ? undefined : CurrencyTypeFromJSON(json['currency']),
        'regionId': !exists(json, 'regionId') ? undefined : json['regionId'],
    };
}

export function RegionalModelInfoDTOToJSON(value?: RegionalModelInfoDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'currency': CurrencyTypeToJSON(value.currency),
        'regionId': value.regionId,
    };
}



