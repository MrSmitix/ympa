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
import type { OrdersStatsDeliveryRegionDTO } from './OrdersStatsDeliveryRegionDTO';
import {
    OrdersStatsDeliveryRegionDTOFromJSON,
    OrdersStatsDeliveryRegionDTOFromJSONTyped,
    OrdersStatsDeliveryRegionDTOToJSON,
} from './OrdersStatsDeliveryRegionDTO';
import type { OrdersStatsItemDTO } from './OrdersStatsItemDTO';
import {
    OrdersStatsItemDTOFromJSON,
    OrdersStatsItemDTOFromJSONTyped,
    OrdersStatsItemDTOToJSON,
} from './OrdersStatsItemDTO';
import type { OrdersStatsPaymentDTO } from './OrdersStatsPaymentDTO';
import {
    OrdersStatsPaymentDTOFromJSON,
    OrdersStatsPaymentDTOFromJSONTyped,
    OrdersStatsPaymentDTOToJSON,
} from './OrdersStatsPaymentDTO';
import type { OrdersStatsCommissionDTO } from './OrdersStatsCommissionDTO';
import {
    OrdersStatsCommissionDTOFromJSON,
    OrdersStatsCommissionDTOFromJSONTyped,
    OrdersStatsCommissionDTOToJSON,
} from './OrdersStatsCommissionDTO';
import type { OrderStatsStatusType } from './OrderStatsStatusType';
import {
    OrderStatsStatusTypeFromJSON,
    OrderStatsStatusTypeFromJSONTyped,
    OrderStatsStatusTypeToJSON,
} from './OrderStatsStatusType';
import type { OrdersStatsOrderPaymentType } from './OrdersStatsOrderPaymentType';
import {
    OrdersStatsOrderPaymentTypeFromJSON,
    OrdersStatsOrderPaymentTypeFromJSONTyped,
    OrdersStatsOrderPaymentTypeToJSON,
} from './OrdersStatsOrderPaymentType';

/**
 * Информация о заказе.
 * @export
 * @interface OrdersStatsOrderDTO
 */
export interface OrdersStatsOrderDTO {
    /**
     * Идентификатор заказа.
     * @type {number}
     * @memberof OrdersStatsOrderDTO
     */
    id?: number;
    /**
     * Дата создания заказа.
     * 
     * Формат даты: `ГГГГ-ММ-ДД`.
     * 
     * @type {Date}
     * @memberof OrdersStatsOrderDTO
     */
    creationDate?: Date;
    /**
     * Дата и время, когда статус заказа был изменен в последний раз.
     * 
     * Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва).
     * 
     * @type {Date}
     * @memberof OrdersStatsOrderDTO
     */
    statusUpdateDate?: Date;
    /**
     * 
     * @type {OrderStatsStatusType}
     * @memberof OrdersStatsOrderDTO
     */
    status?: OrderStatsStatusType;
    /**
     * Идентификатор заказа в информационной системе магазина.
     * @type {string}
     * @memberof OrdersStatsOrderDTO
     */
    partnerOrderId?: string;
    /**
     * 
     * @type {OrdersStatsOrderPaymentType}
     * @memberof OrdersStatsOrderDTO
     */
    paymentType?: OrdersStatsOrderPaymentType;
    /**
     * Тип заказа:
     * 
     * * `false` — настоящий заказ покупателя.
     * 
     * * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.
     * 
     * @type {boolean}
     * @memberof OrdersStatsOrderDTO
     */
    fake?: boolean;
    /**
     * 
     * @type {OrdersStatsDeliveryRegionDTO}
     * @memberof OrdersStatsOrderDTO
     */
    deliveryRegion?: OrdersStatsDeliveryRegionDTO;
    /**
     * Список товаров в заказе после возможных изменений.
     * @type {Array<OrdersStatsItemDTO>}
     * @memberof OrdersStatsOrderDTO
     */
    items: Array<OrdersStatsItemDTO>;
    /**
     * Список товаров в заказе до изменений.
     * @type {Array<OrdersStatsItemDTO>}
     * @memberof OrdersStatsOrderDTO
     */
    initialItems?: Array<OrdersStatsItemDTO> | null;
    /**
     * Информация о денежных переводах по заказу.
     * @type {Array<OrdersStatsPaymentDTO>}
     * @memberof OrdersStatsOrderDTO
     */
    payments: Array<OrdersStatsPaymentDTO>;
    /**
     * Информация о комиссиях за заказ.
     * @type {Array<OrdersStatsCommissionDTO>}
     * @memberof OrdersStatsOrderDTO
     */
    commissions: Array<OrdersStatsCommissionDTO>;
}



/**
 * Check if a given object implements the OrdersStatsOrderDTO interface.
 */
export function instanceOfOrdersStatsOrderDTO(value: object): value is OrdersStatsOrderDTO {
    if (!('items' in value) || value['items'] === undefined) return false;
    if (!('payments' in value) || value['payments'] === undefined) return false;
    if (!('commissions' in value) || value['commissions'] === undefined) return false;
    return true;
}

export function OrdersStatsOrderDTOFromJSON(json: any): OrdersStatsOrderDTO {
    return OrdersStatsOrderDTOFromJSONTyped(json, false);
}

export function OrdersStatsOrderDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): OrdersStatsOrderDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'] == null ? undefined : json['id'],
        'creationDate': json['creationDate'] == null ? undefined : (new Date(json['creationDate'])),
        'statusUpdateDate': json['statusUpdateDate'] == null ? undefined : (new Date(json['statusUpdateDate'])),
        'status': json['status'] == null ? undefined : OrderStatsStatusTypeFromJSON(json['status']),
        'partnerOrderId': json['partnerOrderId'] == null ? undefined : json['partnerOrderId'],
        'paymentType': json['paymentType'] == null ? undefined : OrdersStatsOrderPaymentTypeFromJSON(json['paymentType']),
        'fake': json['fake'] == null ? undefined : json['fake'],
        'deliveryRegion': json['deliveryRegion'] == null ? undefined : OrdersStatsDeliveryRegionDTOFromJSON(json['deliveryRegion']),
        'items': ((json['items'] as Array<any>).map(OrdersStatsItemDTOFromJSON)),
        'initialItems': json['initialItems'] == null ? undefined : ((json['initialItems'] as Array<any>).map(OrdersStatsItemDTOFromJSON)),
        'payments': ((json['payments'] as Array<any>).map(OrdersStatsPaymentDTOFromJSON)),
        'commissions': ((json['commissions'] as Array<any>).map(OrdersStatsCommissionDTOFromJSON)),
    };
}

export function OrdersStatsOrderDTOToJSON(value?: OrdersStatsOrderDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'creationDate': value['creationDate'] == null ? undefined : ((value['creationDate']).toISOString().substring(0,10)),
        'statusUpdateDate': value['statusUpdateDate'] == null ? undefined : ((value['statusUpdateDate']).toISOString()),
        'status': OrderStatsStatusTypeToJSON(value['status']),
        'partnerOrderId': value['partnerOrderId'],
        'paymentType': OrdersStatsOrderPaymentTypeToJSON(value['paymentType']),
        'fake': value['fake'],
        'deliveryRegion': OrdersStatsDeliveryRegionDTOToJSON(value['deliveryRegion']),
        'items': ((value['items'] as Array<any>).map(OrdersStatsItemDTOToJSON)),
        'initialItems': value['initialItems'] == null ? undefined : ((value['initialItems'] as Array<any>).map(OrdersStatsItemDTOToJSON)),
        'payments': ((value['payments'] as Array<any>).map(OrdersStatsPaymentDTOToJSON)),
        'commissions': ((value['commissions'] as Array<any>).map(OrdersStatsCommissionDTOToJSON)),
    };
}
