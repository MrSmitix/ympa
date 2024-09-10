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
import BaseShipmentDTO from './BaseShipmentDTO';
import DeliveryServiceDTO from './DeliveryServiceDTO';
import ExtensionShipmentDTO from './ExtensionShipmentDTO';
import PalletsCountDTO from './PalletsCountDTO';
import PartnerShipmentWarehouseDTO from './PartnerShipmentWarehouseDTO';
import ShipmentActionType from './ShipmentActionType';
import ShipmentStatusChangeDTO from './ShipmentStatusChangeDTO';
import ShipmentType from './ShipmentType';

/**
 * The ShipmentDTO model module.
 * @module model/ShipmentDTO
 * @version LATEST
 */
class ShipmentDTO {
    /**
     * Constructs a new <code>ShipmentDTO</code>.
     * Информация об отгрузке.
     * @alias module:model/ShipmentDTO
     * @implements module:model/BaseShipmentDTO
     * @implements module:model/ExtensionShipmentDTO
     * @param orderIds {Array.<Number>} Идентификаторы заказов в отгрузке.
     * @param availableActions {Array.<module:model/ShipmentActionType>} Доступные действия над отгрузкой.
     */
    constructor(orderIds, availableActions) { 
        BaseShipmentDTO.initialize(this, orderIds);ExtensionShipmentDTO.initialize(this, availableActions);
        ShipmentDTO.initialize(this, orderIds, availableActions);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, orderIds, availableActions) { 
        obj['orderIds'] = orderIds;
        obj['availableActions'] = availableActions;
    }

    /**
     * Constructs a <code>ShipmentDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ShipmentDTO} obj Optional instance to populate.
     * @return {module:model/ShipmentDTO} The populated <code>ShipmentDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ShipmentDTO();
            BaseShipmentDTO.constructFromObject(data, obj);
            ExtensionShipmentDTO.constructFromObject(data, obj);

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
            if (data.hasOwnProperty('currentStatus')) {
                obj['currentStatus'] = ShipmentStatusChangeDTO.constructFromObject(data['currentStatus']);
            }
            if (data.hasOwnProperty('availableActions')) {
                obj['availableActions'] = ApiClient.convertToType(data['availableActions'], [ShipmentActionType]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ShipmentDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ShipmentDTO</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ShipmentDTO.RequiredProperties) {
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
        // validate the optional field `currentStatus`
        if (data['currentStatus']) { // data not null
          ShipmentStatusChangeDTO.validateJSON(data['currentStatus']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['availableActions'])) {
            throw new Error("Expected the field `availableActions` to be an array in the JSON data but got " + data['availableActions']);
        }

        return true;
    }


}

ShipmentDTO.RequiredProperties = ["orderIds", "availableActions"];

/**
 * Идентификатор отгрузки.
 * @member {Number} id
 */
ShipmentDTO.prototype['id'] = undefined;

/**
 * Начало планового интервала отгрузки.
 * @member {Date} planIntervalFrom
 */
ShipmentDTO.prototype['planIntervalFrom'] = undefined;

/**
 * Конец планового интервала отгрузки.
 * @member {Date} planIntervalTo
 */
ShipmentDTO.prototype['planIntervalTo'] = undefined;

/**
 * @member {module:model/ShipmentType} shipmentType
 */
ShipmentDTO.prototype['shipmentType'] = undefined;

/**
 * @member {module:model/PartnerShipmentWarehouseDTO} warehouse
 */
ShipmentDTO.prototype['warehouse'] = undefined;

/**
 * @member {module:model/PartnerShipmentWarehouseDTO} warehouseTo
 */
ShipmentDTO.prototype['warehouseTo'] = undefined;

/**
 * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
 * @member {String} externalId
 */
ShipmentDTO.prototype['externalId'] = undefined;

/**
 * @member {module:model/DeliveryServiceDTO} deliveryService
 */
ShipmentDTO.prototype['deliveryService'] = undefined;

/**
 * @member {module:model/PalletsCountDTO} palletsCount
 */
ShipmentDTO.prototype['palletsCount'] = undefined;

/**
 * Идентификаторы заказов в отгрузке.
 * @member {Array.<Number>} orderIds
 */
ShipmentDTO.prototype['orderIds'] = undefined;

/**
 * Количество заказов, которое Маркет запланировал к отгрузке.
 * @member {Number} draftCount
 */
ShipmentDTO.prototype['draftCount'] = undefined;

/**
 * Количество заказов, которое Маркет подтвердил к отгрузке.
 * @member {Number} plannedCount
 */
ShipmentDTO.prototype['plannedCount'] = undefined;

/**
 * Количество заказов, принятых в сортировочном центре или пункте приема.
 * @member {Number} factCount
 */
ShipmentDTO.prototype['factCount'] = undefined;

/**
 * @member {module:model/ShipmentStatusChangeDTO} currentStatus
 */
ShipmentDTO.prototype['currentStatus'] = undefined;

/**
 * Доступные действия над отгрузкой.
 * @member {Array.<module:model/ShipmentActionType>} availableActions
 */
ShipmentDTO.prototype['availableActions'] = undefined;


// Implement BaseShipmentDTO interface:
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
// Implement ExtensionShipmentDTO interface:
/**
 * @member {module:model/ShipmentStatusChangeDTO} currentStatus
 */
ExtensionShipmentDTO.prototype['currentStatus'] = undefined;
/**
 * Доступные действия над отгрузкой.
 * @member {Array.<module:model/ShipmentActionType>} availableActions
 */
ExtensionShipmentDTO.prototype['availableActions'] = undefined;




export default ShipmentDTO;

