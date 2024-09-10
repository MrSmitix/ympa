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

/**
 * The DeliveryServiceDTO model module.
 * @module model/DeliveryServiceDTO
 * @version LATEST
 */
class DeliveryServiceDTO {
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
     * Constructs a new <code>DeliveryServiceDTO</code>.
     * Служба доставки.
     * @alias module:model/DeliveryServiceDTO
     */
    constructor() { 
        
        DeliveryServiceDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DeliveryServiceDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DeliveryServiceDTO} obj Optional instance to populate.
     * @return {module:model/DeliveryServiceDTO} The populated <code>DeliveryServiceDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DeliveryServiceDTO();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }
}



export default DeliveryServiceDTO;

