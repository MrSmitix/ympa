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
 * Ключ цифрового товара.
 * @export
 * @interface OrderDigitalItemDTO
 */
export interface OrderDigitalItemDTO {
    /**
     * Идентификатор товара в заказе.
     * 
     * Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.
     * 
     * @type {number}
     * @memberof OrderDigitalItemDTO
     */
    id: number;
    /**
     * Сам ключ.
     * @type {string}
     * @memberof OrderDigitalItemDTO
     */
    code: string;
    /**
     * Инструкция по активации.
     * @type {string}
     * @memberof OrderDigitalItemDTO
     */
    slip: string;
    /**
     * Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.
     * 
     * Формат даты: `ГГГГ-ММ-ДД`.
     * 
     * @type {Date}
     * @memberof OrderDigitalItemDTO
     */
    activateTill: Date;
}

/**
 * Check if a given object implements the OrderDigitalItemDTO interface.
 */
export function instanceOfOrderDigitalItemDTO(value: object): value is OrderDigitalItemDTO {
    if (!('id' in value) || value['id'] === undefined) return false;
    if (!('code' in value) || value['code'] === undefined) return false;
    if (!('slip' in value) || value['slip'] === undefined) return false;
    if (!('activateTill' in value) || value['activateTill'] === undefined) return false;
    return true;
}

export function OrderDigitalItemDTOFromJSON(json: any): OrderDigitalItemDTO {
    return OrderDigitalItemDTOFromJSONTyped(json, false);
}

export function OrderDigitalItemDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): OrderDigitalItemDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
        'code': json['code'],
        'slip': json['slip'],
        'activateTill': (new Date(json['activate_till'])),
    };
}

export function OrderDigitalItemDTOToJSON(value?: OrderDigitalItemDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'code': value['code'],
        'slip': value['slip'],
        'activate_till': ((value['activateTill']).toISOString().substring(0,10)),
    };
}
