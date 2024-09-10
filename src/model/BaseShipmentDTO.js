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
 *
 */

import ApiClient from '../ApiClient';
import DeliveryServiceDTO from './DeliveryServiceDTO';
import PalletsCountDTO from './PalletsCountDTO';
import PartnerShipmentWarehouseDTO from './PartnerShipmentWarehouseDTO';
import ShipmentType from './ShipmentType';

/**
 * The BaseShipmentDTO model module.
 * @module model/BaseShipmentDTO
 * @version LATEST
 */
class BaseShipmentDTO {
    /**
     * Constructs a new <code>BaseShipmentDTO</code>.
     * Информация об отгрузке.
     * @alias module:model/BaseShipmentDTO
     * @param orderIds {Array.<Number>} Идентификаторы заказов в отгрузке.
     */
    constructor(orderIds) { 
        
        BaseShipmentDTO.initialize(this, orderIds);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, orderIds) { 
        obj['orderIds'] = orderIds;
    }

    /**
     * Constructs a <code>BaseShipmentDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BaseShipmentDTO} obj Optional instance to populate.
     * @return {module:model/BaseShipmentDTO} The populated <code>BaseShipmentDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BaseShipmentDTO();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('planIntervalFrom')) {
                obj['planIntervalFrom'] = ApiClient.convertToType(data['planIntervalFrom'], 'Date');
            }
            if (data.hasOwnProperty('planIntervalTo')) {
                obj['planIntervalTo'] = ApiClient.convertToType(data['planIntervalTo'], 'Date');
            }
            if (data.hasOwnProperty('shipmentType')) {
                obj['shipmentType'] = ShipmentType.constructFromObject(data['shipmentType']);
            }
            if (data.hasOwnProperty('warehouse')) {
                obj['warehouse'] = PartnerShipmentWarehouseDTO.constructFromObject(data['warehouse']);
            }
            if (data.hasOwnProperty('warehouseTo')) {
                obj['warehouseTo'] = PartnerShipmentWarehouseDTO.constructFromObject(data['warehouseTo']);
            }
            if (data.hasOwnProperty('externalId')) {
                obj['externalId'] = ApiClient.convertToType(data['externalId'], 'String');
            }
            if (data.hasOwnProperty('deliveryService')) {
                obj['deliveryService'] = DeliveryServiceDTO.constructFromObject(data['deliveryService']);
            }
            if (data.hasOwnProperty('palletsCount')) {
                obj['palletsCount'] = PalletsCountDTO.constructFromObject(data['palletsCount']);
            }
            if (data.hasOwnProperty('orderIds')) {
                obj['orderIds'] = ApiClient.convertToType(data['orderIds'], ['Number']);
            }
            if (data.hasOwnProperty('draftCount')) {
                obj['draftCount'] = ApiClient.convertToType(data['draftCount'], 'Number');
            }
            if (data.hasOwnProperty('plannedCount')) {
                obj['plannedCount'] = ApiClient.convertToType(data['plannedCount'], 'Number');
            }
            if (data.hasOwnProperty('factCount')) {
                obj['factCount'] = ApiClient.convertToType(data['factCount'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>BaseShipmentDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>BaseShipmentDTO</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of BaseShipmentDTO.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // validate the optional field `warehouse`
        if (data['warehouse']) { // data not null
          PartnerShipmentWarehouseDTO.validateJSON(data['warehouse']);
        }
        // validate the optional field `warehouseTo`
        if (data['warehouseTo']) { // data not null
          PartnerShipmentWarehouseDTO.validateJSON(data['warehouseTo']);
        }
        // ensure the json data is a string
        if (data['externalId'] && !(typeof data['externalId'] === 'string' || data['externalId'] instanceof String)) {
            throw new Error("Expected the field `externalId` to be a primitive type in the JSON string but got " + data['externalId']);
        }
        // validate the optional field `deliveryService`
        if (data['deliveryService']) { // data not null
          DeliveryServiceDTO.validateJSON(data['deliveryService']);
        }
        // validate the optional field `palletsCount`
        if (data['palletsCount']) { // data not null
          PalletsCountDTO.validateJSON(data['palletsCount']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['orderIds'])) {
            throw new Error("Expected the field `orderIds` to be an array in the JSON data but got " + data['orderIds']);
        }

        return true;
    }


}

BaseShipmentDTO.RequiredProperties = ["orderIds"];

/**
 * Идентификатор отгрузки.
 * @member {Number} id
 */
BaseShipmentDTO.prototype['id'] = undefined;

/**
 * Начало планового интервала отгрузки.
 * @member {Date} planIntervalFrom
 */
BaseShipmentDTO.prototype['planIntervalFrom'] = undefined;

/**
 * Конец планового интервала отгрузки.
 * @member {Date} planIntervalTo
 */
BaseShipmentDTO.prototype['planIntervalTo'] = undefined;

/**
 * @member {module:model/ShipmentType} shipmentType
 */
BaseShipmentDTO.prototype['shipmentType'] = undefined;

/**
 * @member {module:model/PartnerShipmentWarehouseDTO} warehouse
 */
BaseShipmentDTO.prototype['warehouse'] = undefined;

/**
 * @member {module:model/PartnerShipmentWarehouseDTO} warehouseTo
 */
BaseShipmentDTO.prototype['warehouseTo'] = undefined;

/**
 * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
 * @member {String} externalId
 */
BaseShipmentDTO.prototype['externalId'] = undefined;

/**
 * @member {module:model/DeliveryServiceDTO} deliveryService
 */
BaseShipmentDTO.prototype['deliveryService'] = undefined;

/**
 * @member {module:model/PalletsCountDTO} palletsCount
 */
BaseShipmentDTO.prototype['palletsCount'] = undefined;

/**
 * Идентификаторы заказов в отгрузке.
 * @member {Array.<Number>} orderIds
 */
BaseShipmentDTO.prototype['orderIds'] = undefined;

/**
 * Количество заказов, которое Маркет запланировал к отгрузке.
 * @member {Number} draftCount
 */
BaseShipmentDTO.prototype['draftCount'] = undefined;

/**
 * Количество заказов, которое Маркет подтвердил к отгрузке.
 * @member {Number} plannedCount
 */
BaseShipmentDTO.prototype['plannedCount'] = undefined;

/**
 * Количество заказов, принятых в сортировочном центре или пункте приема.
 * @member {Number} factCount
 */
BaseShipmentDTO.prototype['factCount'] = undefined;






export default BaseShipmentDTO;

