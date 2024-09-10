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
 * Ссылка на следующую страницу.
 * 
 * @export
 * @interface ForwardScrollingPagerDTO
 */
export interface ForwardScrollingPagerDTO {
    /**
     * Идентификатор следующей страницы результатов.
     * @type {string}
     * @memberof ForwardScrollingPagerDTO
     */
    nextPageToken?: string;
}

/**
 * Check if a given object implements the ForwardScrollingPagerDTO interface.
 */
export function instanceOfForwardScrollingPagerDTO(value: object): value is ForwardScrollingPagerDTO {
    return true;
}

export function ForwardScrollingPagerDTOFromJSON(json: any): ForwardScrollingPagerDTO {
    return ForwardScrollingPagerDTOFromJSONTyped(json, false);
}

export function ForwardScrollingPagerDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): ForwardScrollingPagerDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'nextPageToken': json['nextPageToken'] == null ? undefined : json['nextPageToken'],
    };
}

export function ForwardScrollingPagerDTOToJSON(value?: ForwardScrollingPagerDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'nextPageToken': value['nextPageToken'],
    };
}

