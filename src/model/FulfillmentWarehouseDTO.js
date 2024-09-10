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
import WarehouseAddressDTO from './WarehouseAddressDTO';

/**
 * The FulfillmentWarehouseDTO model module.
 * @module model/FulfillmentWarehouseDTO
 * @version LATEST
 */
class FulfillmentWarehouseDTO {
    /**
     * Constructs a new <code>FulfillmentWarehouseDTO</code>.
     * Склад Маркета (FBY).
     * @alias module:model/FulfillmentWarehouseDTO
     * @param id {Number} Идентификатор склада.
     * @param name {String} Название склада.
     */
    constructor(id, name) { 
        
        FulfillmentWarehouseDTO.initialize(this, id, name);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, name) { 
        obj['id'] = id;
        obj['name'] = name;
    }

    /**
     * Constructs a <code>FulfillmentWarehouseDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FulfillmentWarehouseDTO} obj Optional instance to populate.
     * @return {module:model/FulfillmentWarehouseDTO} The populated <code>FulfillmentWarehouseDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FulfillmentWarehouseDTO();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('address')) {
                obj['address'] = WarehouseAddressDTO.constructFromObject(data['address']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>FulfillmentWarehouseDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>FulfillmentWarehouseDTO</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of FulfillmentWarehouseDTO.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // validate the optional field `address`
        if (data['address']) { // data not null
          WarehouseAddressDTO.validateJSON(data['address']);
        }

        return true;
    }


}

FulfillmentWarehouseDTO.RequiredProperties = ["id", "name"];

/**
 * Идентификатор склада.
 * @member {Number} id
 */
FulfillmentWarehouseDTO.prototype['id'] = undefined;

/**
 * Название склада.
 * @member {String} name
 */
FulfillmentWarehouseDTO.prototype['name'] = undefined;

/**
 * @member {module:model/WarehouseAddressDTO} address
 */
FulfillmentWarehouseDTO.prototype['address'] = undefined;






export default FulfillmentWarehouseDTO;

