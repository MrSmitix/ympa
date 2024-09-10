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
import type { ShipmentStatusType } from './ShipmentStatusType';
import {
    ShipmentStatusTypeFromJSON,
    ShipmentStatusTypeFromJSONTyped,
    ShipmentStatusTypeToJSON,
} from './ShipmentStatusType';

/**
 * Статус отгрузки.
 * @export
 * @interface ShipmentStatusChangeDTO
 */
export interface ShipmentStatusChangeDTO {
    /**
     * 
     * @type {ShipmentStatusType}
     * @memberof ShipmentStatusChangeDTO
     */
    status?: ShipmentStatusType;
    /**
     * Описание статуса отгрузки.
     * @type {string}
     * @memberof ShipmentStatusChangeDTO
     */
    description?: string;
    /**
     * Время последнего изменения статуса отгрузки.
     * @type {Date}
     * @memberof ShipmentStatusChangeDTO
     */
    updateTime?: Date;
}



/**
 * Check if a given object implements the ShipmentStatusChangeDTO interface.
 */
export function instanceOfShipmentStatusChangeDTO(value: object): value is ShipmentStatusChangeDTO {
    return true;
}

export function ShipmentStatusChangeDTOFromJSON(json: any): ShipmentStatusChangeDTO {
    return ShipmentStatusChangeDTOFromJSONTyped(json, false);
}

export function ShipmentStatusChangeDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): ShipmentStatusChangeDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'status': json['status'] == null ? undefined : ShipmentStatusTypeFromJSON(json['status']),
        'description': json['description'] == null ? undefined : json['description'],
        'updateTime': json['updateTime'] == null ? undefined : (new Date(json['updateTime'])),
    };
}

export function ShipmentStatusChangeDTOToJSON(value?: ShipmentStatusChangeDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': ShipmentStatusTypeToJSON(value['status']),
        'description': value['description'],
        'updateTime': value['updateTime'] == null ? undefined : ((value['updateTime']).toISOString()),
    };
}
