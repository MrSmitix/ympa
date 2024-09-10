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
     * @member {Number} id
     * @type {Number}
     */
    id;
    /**
     * @member {String} name
     * @type {String}
     */
    name;
    /**
     * @member {module:model/WarehouseAddressDTO} address
     * @type {module:model/WarehouseAddressDTO}
     */
    address;

    

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
}



export default FulfillmentWarehouseDTO;

