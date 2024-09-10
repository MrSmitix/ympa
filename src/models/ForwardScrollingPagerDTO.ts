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
/**
 * Ссылка на следующую страницу. 
 * @export
 * @interface ForwardScrollingPagerDTO
 */
export interface ForwardScrollingPagerDTO  {
    /**
     * Идентификатор следующей страницы результатов.
     * @type {string}
     * @memberof ForwardScrollingPagerDTO
     */
    nextPageToken?: string;
}

export function ForwardScrollingPagerDTOFromJSON(json: any): ForwardScrollingPagerDTO {
    return {
        'nextPageToken': !exists(json, 'nextPageToken') ? undefined : json['nextPageToken'],
    };
}

export function ForwardScrollingPagerDTOToJSON(value?: ForwardScrollingPagerDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'nextPageToken': value.nextPageToken,
    };
}


