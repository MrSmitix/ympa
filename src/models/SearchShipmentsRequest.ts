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
    ShipmentStatusType,
    ShipmentStatusTypeFromJSON,
    ShipmentStatusTypeToJSON,
} from './';

/**
 * Запрос информации об отгрузках.
 * @export
 * @interface SearchShipmentsRequest
 */
export interface SearchShipmentsRequest  {
    /**
     * Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
     * @type {Date}
     * @memberof SearchShipmentsRequest
     */
    dateFrom: Date;
    /**
     * Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
     * @type {Date}
     * @memberof SearchShipmentsRequest
     */
    dateTo: Date;
    /**
     * Список статусов отгрузок.
     * @type {Set<ShipmentStatusType>}
     * @memberof SearchShipmentsRequest
     */
    statuses?: Set<ShipmentStatusType>;
    /**
     * Список идентификаторов заказов из отгрузок.
     * @type {Set<number>}
     * @memberof SearchShipmentsRequest
     */
    orderIds?: Set<number>;
    /**
     * Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. 
     * @type {boolean}
     * @memberof SearchShipmentsRequest
     */
    cancelledOrders?: boolean;
}

export function SearchShipmentsRequestFromJSON(json: any): SearchShipmentsRequest {
    return {
        'dateFrom': new Date(json['dateFrom']),
        'dateTo': new Date(json['dateTo']),
        'statuses': !exists(json, 'statuses') ? undefined : (json['statuses'] as Array<any>).map(ShipmentStatusTypeFromJSON),
        'orderIds': !exists(json, 'orderIds') ? undefined : json['orderIds'],
        'cancelledOrders': !exists(json, 'cancelledOrders') ? undefined : json['cancelledOrders'],
    };
}

export function SearchShipmentsRequestToJSON(value?: SearchShipmentsRequest): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'dateFrom': value.dateFrom.toISOString().substring(0,10),
        'dateTo': value.dateTo.toISOString().substring(0,10),
        'statuses': value.statuses === undefined ? undefined : (value.statuses as Array<any>).map(ShipmentStatusTypeToJSON),
        'orderIds': value.orderIds,
        'cancelledOrders': value.cancelledOrders,
    };
}


