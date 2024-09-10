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
 * Информация о трек-номере посылки (DBS).
 * @export
 * @interface OrderTrackDTO
 */
export interface OrderTrackDTO  {
    /**
     * Трек‑номер посылки.
     * @type {string}
     * @memberof OrderTrackDTO
     */
    trackCode?: string;
    /**
     * Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
     * @type {number}
     * @memberof OrderTrackDTO
     */
    deliveryServiceId?: number;
}

export function OrderTrackDTOFromJSON(json: any): OrderTrackDTO {
    return {
        'trackCode': !exists(json, 'trackCode') ? undefined : json['trackCode'],
        'deliveryServiceId': !exists(json, 'deliveryServiceId') ? undefined : json['deliveryServiceId'],
    };
}

export function OrderTrackDTOToJSON(value?: OrderTrackDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'trackCode': value.trackCode,
        'deliveryServiceId': value.deliveryServiceId,
    };
}


