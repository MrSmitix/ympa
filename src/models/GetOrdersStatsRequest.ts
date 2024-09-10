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
    OrderStatsStatusType,
    OrderStatsStatusTypeFromJSON,
    OrderStatsStatusTypeToJSON,
} from './';

/**
 * Запрос информации по заказам.
 * @export
 * @interface GetOrdersStatsRequest
 */
export interface GetOrdersStatsRequest  {
    /**
     * Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
     * @type {Date}
     * @memberof GetOrdersStatsRequest
     */
    dateFrom?: Date;
    /**
     * Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
     * @type {Date}
     * @memberof GetOrdersStatsRequest
     */
    dateTo?: Date;
    /**
     * Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
     * @type {Date}
     * @memberof GetOrdersStatsRequest
     */
    updateFrom?: Date;
    /**
     * Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
     * @type {Date}
     * @memberof GetOrdersStatsRequest
     */
    updateTo?: Date;
    /**
     * Список идентификаторов заказов.
     * @type {Array<number>}
     * @memberof GetOrdersStatsRequest
     */
    orders?: Array<number>;
    /**
     * Список статусов заказов.
     * @type {Array<OrderStatsStatusType>}
     * @memberof GetOrdersStatsRequest
     */
    statuses?: Array<OrderStatsStatusType>;
    /**
     * Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
     * @type {boolean}
     * @memberof GetOrdersStatsRequest
     */
    hasCis?: boolean;
}

export function GetOrdersStatsRequestFromJSON(json: any): GetOrdersStatsRequest {
    return {
        'dateFrom': !exists(json, 'dateFrom') ? undefined : new Date(json['dateFrom']),
        'dateTo': !exists(json, 'dateTo') ? undefined : new Date(json['dateTo']),
        'updateFrom': !exists(json, 'updateFrom') ? undefined : new Date(json['updateFrom']),
        'updateTo': !exists(json, 'updateTo') ? undefined : new Date(json['updateTo']),
        'orders': !exists(json, 'orders') ? undefined : json['orders'],
        'statuses': !exists(json, 'statuses') ? undefined : (json['statuses'] as Array<any>).map(OrderStatsStatusTypeFromJSON),
        'hasCis': !exists(json, 'hasCis') ? undefined : json['hasCis'],
    };
}

export function GetOrdersStatsRequestToJSON(value?: GetOrdersStatsRequest): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'dateFrom': value.dateFrom === undefined ? undefined : value.dateFrom.toISOString().substring(0,10),
        'dateTo': value.dateTo === undefined ? undefined : value.dateTo.toISOString().substring(0,10),
        'updateFrom': value.updateFrom === undefined ? undefined : value.updateFrom.toISOString().substring(0,10),
        'updateTo': value.updateTo === undefined ? undefined : value.updateTo.toISOString().substring(0,10),
        'orders': value.orders,
        'statuses': value.statuses === undefined ? undefined : (value.statuses as Array<any>).map(OrderStatsStatusTypeToJSON),
        'hasCis': value.hasCis,
    };
}


