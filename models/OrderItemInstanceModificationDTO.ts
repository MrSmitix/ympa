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
import type { BriefOrderItemInstanceDTO } from './BriefOrderItemInstanceDTO';
import {
    BriefOrderItemInstanceDTOFromJSON,
    BriefOrderItemInstanceDTOFromJSONTyped,
    BriefOrderItemInstanceDTOToJSON,
} from './BriefOrderItemInstanceDTO';

/**
 * Позиция в корзине, требующая маркировки.
 * @export
 * @interface OrderItemInstanceModificationDTO
 */
export interface OrderItemInstanceModificationDTO {
    /**
     * Идентификатор товара в заказе.
     * 
     * Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.
     * 
     * @type {number}
     * @memberof OrderItemInstanceModificationDTO
     */
    id: number;
    /**
     * Список кодов маркировки единиц товара.
     * 
     * @type {Array<BriefOrderItemInstanceDTO>}
     * @memberof OrderItemInstanceModificationDTO
     */
    instances: Array<BriefOrderItemInstanceDTO>;
}

/**
 * Check if a given object implements the OrderItemInstanceModificationDTO interface.
 */
export function instanceOfOrderItemInstanceModificationDTO(value: object): value is OrderItemInstanceModificationDTO {
    if (!('id' in value) || value['id'] === undefined) return false;
    if (!('instances' in value) || value['instances'] === undefined) return false;
    return true;
}

export function OrderItemInstanceModificationDTOFromJSON(json: any): OrderItemInstanceModificationDTO {
    return OrderItemInstanceModificationDTOFromJSONTyped(json, false);
}

export function OrderItemInstanceModificationDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): OrderItemInstanceModificationDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
        'instances': ((json['instances'] as Array<any>).map(BriefOrderItemInstanceDTOFromJSON)),
    };
}

export function OrderItemInstanceModificationDTOToJSON(value?: OrderItemInstanceModificationDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'instances': ((value['instances'] as Array<any>).map(BriefOrderItemInstanceDTOToJSON)),
    };
}
