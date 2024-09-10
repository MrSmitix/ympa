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
import GpsDTO from './GpsDTO';

/**
 * The WarehouseAddressDTO model module.
 * @module model/WarehouseAddressDTO
 * @version LATEST
 */
class WarehouseAddressDTO {
    /**
     * @member {String} city
     * @type {String}
     */
    city;
    /**
     * @member {String} street
     * @type {String}
     */
    street;
    /**
     * @member {String} number
     * @type {String}
     */
    number;
    /**
     * @member {String} building
     * @type {String}
     */
    building;
    /**
     * @member {String} block
     * @type {String}
     */
    block;
    /**
     * @member {module:model/GpsDTO} gps
     * @type {module:model/GpsDTO}
     */
    gps;

    

    /**
     * Constructs a new <code>WarehouseAddressDTO</code>.
     * Адрес склада.
     * @alias module:model/WarehouseAddressDTO
     * @param city {String} Город.
     * @param gps {module:model/GpsDTO} 
     */
    constructor(city, gps) { 
        
        WarehouseAddressDTO.initialize(this, city, gps);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, city, gps) { 
        obj['city'] = city;
        obj['gps'] = gps;
    }

    /**
     * Constructs a <code>WarehouseAddressDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/WarehouseAddressDTO} obj Optional instance to populate.
     * @return {module:model/WarehouseAddressDTO} The populated <code>WarehouseAddressDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new WarehouseAddressDTO();

            if (data.hasOwnProperty('city')) {
                obj['city'] = ApiClient.convertToType(data['city'], 'String');
            }
            if (data.hasOwnProperty('street')) {
                obj['street'] = ApiClient.convertToType(data['street'], 'String');
            }
            if (data.hasOwnProperty('number')) {
                obj['number'] = ApiClient.convertToType(data['number'], 'String');
            }
            if (data.hasOwnProperty('building')) {
                obj['building'] = ApiClient.convertToType(data['building'], 'String');
            }
            if (data.hasOwnProperty('block')) {
                obj['block'] = ApiClient.convertToType(data['block'], 'String');
            }
            if (data.hasOwnProperty('gps')) {
                obj['gps'] = GpsDTO.constructFromObject(data['gps']);
            }
        }
        return obj;
    }
}



export default WarehouseAddressDTO;

