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
import type { OrderSubstatusType } from './OrderSubstatusType';
import {
    OrderSubstatusTypeFromJSON,
    OrderSubstatusTypeFromJSONTyped,
    OrderSubstatusTypeToJSON,
} from './OrderSubstatusType';
import type { OrderStatusType } from './OrderStatusType';
import {
    OrderStatusTypeFromJSON,
    OrderStatusTypeFromJSONTyped,
    OrderStatusTypeToJSON,
} from './OrderStatusType';
import type { OrderUpdateStatusType } from './OrderUpdateStatusType';
import {
    OrderUpdateStatusTypeFromJSON,
    OrderUpdateStatusTypeFromJSONTyped,
    OrderUpdateStatusTypeToJSON,
} from './OrderUpdateStatusType';

/**
 * Список заказов.
 * @export
 * @interface UpdateOrderStatusDTO
 */
export interface UpdateOrderStatusDTO {
    /**
     * Идентификатор заказа.
     * @type {number}
     * @memberof UpdateOrderStatusDTO
     */
    id?: number;
    /**
     * 
     * @type {OrderStatusType}
     * @memberof UpdateOrderStatusDTO
     */
    status?: OrderStatusType;
    /**
     * 
     * @type {OrderSubstatusType}
     * @memberof UpdateOrderStatusDTO
     */
    substatus?: OrderSubstatusType;
    /**
     * 
     * @type {OrderUpdateStatusType}
     * @memberof UpdateOrderStatusDTO
     */
    updateStatus?: OrderUpdateStatusType;
    /**
     * Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.
     * 
     * Возвращается, если параметр `updateStatus` принимает значение `ERROR`.
     * 
     * @type {string}
     * @memberof UpdateOrderStatusDTO
     */
    errorDetails?: string;
}



/**
 * Check if a given object implements the UpdateOrderStatusDTO interface.
 */
export function instanceOfUpdateOrderStatusDTO(value: object): value is UpdateOrderStatusDTO {
    return true;
}

export function UpdateOrderStatusDTOFromJSON(json: any): UpdateOrderStatusDTO {
    return UpdateOrderStatusDTOFromJSONTyped(json, false);
}

export function UpdateOrderStatusDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): UpdateOrderStatusDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'] == null ? undefined : json['id'],
        'status': json['status'] == null ? undefined : OrderStatusTypeFromJSON(json['status']),
        'substatus': json['substatus'] == null ? undefined : OrderSubstatusTypeFromJSON(json['substatus']),
        'updateStatus': json['updateStatus'] == null ? undefined : OrderUpdateStatusTypeFromJSON(json['updateStatus']),
        'errorDetails': json['errorDetails'] == null ? undefined : json['errorDetails'],
    };
}

export function UpdateOrderStatusDTOToJSON(value?: UpdateOrderStatusDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'status': OrderStatusTypeToJSON(value['status']),
        'substatus': OrderSubstatusTypeToJSON(value['substatus']),
        'updateStatus': OrderUpdateStatusTypeToJSON(value['updateStatus']),
        'errorDetails': value['errorDetails'],
    };
}
