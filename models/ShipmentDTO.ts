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
import type { ShipmentActionType } from './ShipmentActionType';
import {
    ShipmentActionTypeFromJSON,
    ShipmentActionTypeFromJSONTyped,
    ShipmentActionTypeToJSON,
} from './ShipmentActionType';
import type { ShipmentType } from './ShipmentType';
import {
    ShipmentTypeFromJSON,
    ShipmentTypeFromJSONTyped,
    ShipmentTypeToJSON,
} from './ShipmentType';
import type { PalletsCountDTO } from './PalletsCountDTO';
import {
    PalletsCountDTOFromJSON,
    PalletsCountDTOFromJSONTyped,
    PalletsCountDTOToJSON,
} from './PalletsCountDTO';
import type { PartnerShipmentWarehouseDTO } from './PartnerShipmentWarehouseDTO';
import {
    PartnerShipmentWarehouseDTOFromJSON,
    PartnerShipmentWarehouseDTOFromJSONTyped,
    PartnerShipmentWarehouseDTOToJSON,
} from './PartnerShipmentWarehouseDTO';
import type { DeliveryServiceDTO } from './DeliveryServiceDTO';
import {
    DeliveryServiceDTOFromJSON,
    DeliveryServiceDTOFromJSONTyped,
    DeliveryServiceDTOToJSON,
} from './DeliveryServiceDTO';
import type { ShipmentStatusChangeDTO } from './ShipmentStatusChangeDTO';
import {
    ShipmentStatusChangeDTOFromJSON,
    ShipmentStatusChangeDTOFromJSONTyped,
    ShipmentStatusChangeDTOToJSON,
} from './ShipmentStatusChangeDTO';

/**
 * Информация об отгрузке.
 * @export
 * @interface ShipmentDTO
 */
export interface ShipmentDTO {
    /**
     * Идентификатор отгрузки.
     * @type {number}
     * @memberof ShipmentDTO
     */
    id?: number;
    /**
     * Начало планового интервала отгрузки.
     * @type {Date}
     * @memberof ShipmentDTO
     */
    planIntervalFrom?: Date;
    /**
     * Конец планового интервала отгрузки.
     * @type {Date}
     * @memberof ShipmentDTO
     */
    planIntervalTo?: Date;
    /**
     * 
     * @type {ShipmentType}
     * @memberof ShipmentDTO
     */
    shipmentType?: ShipmentType;
    /**
     * 
     * @type {PartnerShipmentWarehouseDTO}
     * @memberof ShipmentDTO
     */
    warehouse?: PartnerShipmentWarehouseDTO;
    /**
     * 
     * @type {PartnerShipmentWarehouseDTO}
     * @memberof ShipmentDTO
     */
    warehouseTo?: PartnerShipmentWarehouseDTO;
    /**
     * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
     * @type {string}
     * @memberof ShipmentDTO
     */
    externalId?: string;
    /**
     * 
     * @type {DeliveryServiceDTO}
     * @memberof ShipmentDTO
     */
    deliveryService?: DeliveryServiceDTO;
    /**
     * 
     * @type {PalletsCountDTO}
     * @memberof ShipmentDTO
     */
    palletsCount?: PalletsCountDTO;
    /**
     * Идентификаторы заказов в отгрузке.
     * @type {Set<number>}
     * @memberof ShipmentDTO
     */
    orderIds: Set<number>;
    /**
     * Количество заказов, которое Маркет запланировал к отгрузке.
     * @type {number}
     * @memberof ShipmentDTO
     */
    draftCount?: number;
    /**
     * Количество заказов, которое Маркет подтвердил к отгрузке.
     * @type {number}
     * @memberof ShipmentDTO
     */
    plannedCount?: number;
    /**
     * Количество заказов, принятых в сортировочном центре или пункте приема.
     * @type {number}
     * @memberof ShipmentDTO
     */
    factCount?: number;
    /**
     * 
     * @type {ShipmentStatusChangeDTO}
     * @memberof ShipmentDTO
     */
    currentStatus?: ShipmentStatusChangeDTO;
    /**
     * Доступные действия над отгрузкой.
     * @type {Set<ShipmentActionType>}
     * @memberof ShipmentDTO
     */
    availableActions: Set<ShipmentActionType>;
}



/**
 * Check if a given object implements the ShipmentDTO interface.
 */
export function instanceOfShipmentDTO(value: object): value is ShipmentDTO {
    if (!('orderIds' in value) || value['orderIds'] === undefined) return false;
    if (!('availableActions' in value) || value['availableActions'] === undefined) return false;
    return true;
}

export function ShipmentDTOFromJSON(json: any): ShipmentDTO {
    return ShipmentDTOFromJSONTyped(json, false);
}

export function ShipmentDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): ShipmentDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'] == null ? undefined : json['id'],
        'planIntervalFrom': json['planIntervalFrom'] == null ? undefined : (new Date(json['planIntervalFrom'])),
        'planIntervalTo': json['planIntervalTo'] == null ? undefined : (new Date(json['planIntervalTo'])),
        'shipmentType': json['shipmentType'] == null ? undefined : ShipmentTypeFromJSON(json['shipmentType']),
        'warehouse': json['warehouse'] == null ? undefined : PartnerShipmentWarehouseDTOFromJSON(json['warehouse']),
        'warehouseTo': json['warehouseTo'] == null ? undefined : PartnerShipmentWarehouseDTOFromJSON(json['warehouseTo']),
        'externalId': json['externalId'] == null ? undefined : json['externalId'],
        'deliveryService': json['deliveryService'] == null ? undefined : DeliveryServiceDTOFromJSON(json['deliveryService']),
        'palletsCount': json['palletsCount'] == null ? undefined : PalletsCountDTOFromJSON(json['palletsCount']),
        'orderIds': json['orderIds'],
        'draftCount': json['draftCount'] == null ? undefined : json['draftCount'],
        'plannedCount': json['plannedCount'] == null ? undefined : json['plannedCount'],
        'factCount': json['factCount'] == null ? undefined : json['factCount'],
        'currentStatus': json['currentStatus'] == null ? undefined : ShipmentStatusChangeDTOFromJSON(json['currentStatus']),
        'availableActions': (new Set((json['availableActions'] as Array<any>).map(ShipmentActionTypeFromJSON))),
    };
}

export function ShipmentDTOToJSON(value?: ShipmentDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'planIntervalFrom': value['planIntervalFrom'] == null ? undefined : ((value['planIntervalFrom']).toISOString()),
        'planIntervalTo': value['planIntervalTo'] == null ? undefined : ((value['planIntervalTo']).toISOString()),
        'shipmentType': ShipmentTypeToJSON(value['shipmentType']),
        'warehouse': PartnerShipmentWarehouseDTOToJSON(value['warehouse']),
        'warehouseTo': PartnerShipmentWarehouseDTOToJSON(value['warehouseTo']),
        'externalId': value['externalId'],
        'deliveryService': DeliveryServiceDTOToJSON(value['deliveryService']),
        'palletsCount': PalletsCountDTOToJSON(value['palletsCount']),
        'orderIds': Array.from(value['orderIds'] as Set<any>),
        'draftCount': value['draftCount'],
        'plannedCount': value['plannedCount'],
        'factCount': value['factCount'],
        'currentStatus': ShipmentStatusChangeDTOToJSON(value['currentStatus']),
        'availableActions': (Array.from(value['availableActions'] as Set<any>).map(ShipmentActionTypeToJSON)),
    };
}

