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
    DeliveryServiceDTO,
    DeliveryServiceDTOFromJSON,
    DeliveryServiceDTOToJSON,
    PalletsCountDTO,
    PalletsCountDTOFromJSON,
    PalletsCountDTOToJSON,
    PartnerShipmentWarehouseDTO,
    PartnerShipmentWarehouseDTOFromJSON,
    PartnerShipmentWarehouseDTOToJSON,
    ShipmentType,
    ShipmentTypeFromJSON,
    ShipmentTypeToJSON,
} from './';

/**
 * Информация об отгрузке.
 * @export
 * @interface BaseShipmentDTO
 */
export interface BaseShipmentDTO  {
    /**
     * Идентификатор отгрузки.
     * @type {number}
     * @memberof BaseShipmentDTO
     */
    id?: number;
    /**
     * Начало планового интервала отгрузки.
     * @type {Date}
     * @memberof BaseShipmentDTO
     */
    planIntervalFrom?: Date;
    /**
     * Конец планового интервала отгрузки.
     * @type {Date}
     * @memberof BaseShipmentDTO
     */
    planIntervalTo?: Date;
    /**
     * 
     * @type {ShipmentType}
     * @memberof BaseShipmentDTO
     */
    shipmentType?: ShipmentType;
    /**
     * 
     * @type {PartnerShipmentWarehouseDTO}
     * @memberof BaseShipmentDTO
     */
    warehouse?: PartnerShipmentWarehouseDTO;
    /**
     * 
     * @type {PartnerShipmentWarehouseDTO}
     * @memberof BaseShipmentDTO
     */
    warehouseTo?: PartnerShipmentWarehouseDTO;
    /**
     * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
     * @type {string}
     * @memberof BaseShipmentDTO
     */
    externalId?: string;
    /**
     * 
     * @type {DeliveryServiceDTO}
     * @memberof BaseShipmentDTO
     */
    deliveryService?: DeliveryServiceDTO;
    /**
     * 
     * @type {PalletsCountDTO}
     * @memberof BaseShipmentDTO
     */
    palletsCount?: PalletsCountDTO;
    /**
     * Идентификаторы заказов в отгрузке.
     * @type {Set<number>}
     * @memberof BaseShipmentDTO
     */
    orderIds: Set<number>;
    /**
     * Количество заказов, которое Маркет запланировал к отгрузке.
     * @type {number}
     * @memberof BaseShipmentDTO
     */
    draftCount?: number;
    /**
     * Количество заказов, которое Маркет подтвердил к отгрузке.
     * @type {number}
     * @memberof BaseShipmentDTO
     */
    plannedCount?: number;
    /**
     * Количество заказов, принятых в сортировочном центре или пункте приема.
     * @type {number}
     * @memberof BaseShipmentDTO
     */
    factCount?: number;
}

export function BaseShipmentDTOFromJSON(json: any): BaseShipmentDTO {
    return {
        'id': !exists(json, 'id') ? undefined : json['id'],
        'planIntervalFrom': !exists(json, 'planIntervalFrom') ? undefined : new Date(json['planIntervalFrom']),
        'planIntervalTo': !exists(json, 'planIntervalTo') ? undefined : new Date(json['planIntervalTo']),
        'shipmentType': !exists(json, 'shipmentType') ? undefined : ShipmentTypeFromJSON(json['shipmentType']),
        'warehouse': !exists(json, 'warehouse') ? undefined : PartnerShipmentWarehouseDTOFromJSON(json['warehouse']),
        'warehouseTo': !exists(json, 'warehouseTo') ? undefined : PartnerShipmentWarehouseDTOFromJSON(json['warehouseTo']),
        'externalId': !exists(json, 'externalId') ? undefined : json['externalId'],
        'deliveryService': !exists(json, 'deliveryService') ? undefined : DeliveryServiceDTOFromJSON(json['deliveryService']),
        'palletsCount': !exists(json, 'palletsCount') ? undefined : PalletsCountDTOFromJSON(json['palletsCount']),
        'orderIds': json['orderIds'],
        'draftCount': !exists(json, 'draftCount') ? undefined : json['draftCount'],
        'plannedCount': !exists(json, 'plannedCount') ? undefined : json['plannedCount'],
        'factCount': !exists(json, 'factCount') ? undefined : json['factCount'],
    };
}

export function BaseShipmentDTOToJSON(value?: BaseShipmentDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'id': value.id,
        'planIntervalFrom': value.planIntervalFrom === undefined ? undefined : value.planIntervalFrom.toISOString(),
        'planIntervalTo': value.planIntervalTo === undefined ? undefined : value.planIntervalTo.toISOString(),
        'shipmentType': ShipmentTypeToJSON(value.shipmentType),
        'warehouse': PartnerShipmentWarehouseDTOToJSON(value.warehouse),
        'warehouseTo': PartnerShipmentWarehouseDTOToJSON(value.warehouseTo),
        'externalId': value.externalId,
        'deliveryService': DeliveryServiceDTOToJSON(value.deliveryService),
        'palletsCount': PalletsCountDTOToJSON(value.palletsCount),
        'orderIds': value.orderIds,
        'draftCount': value.draftCount,
        'plannedCount': value.plannedCount,
        'factCount': value.factCount,
    };
}



