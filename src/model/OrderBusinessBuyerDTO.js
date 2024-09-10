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
 * The OrderBusinessBuyerDTO model module.
 * @module model/OrderBusinessBuyerDTO
 * @version LATEST
 */
class OrderBusinessBuyerDTO {
    /**
     * Constructs a new <code>OrderBusinessBuyerDTO</code>.
     * Информация о покупателе. 
     * @alias module:model/OrderBusinessBuyerDTO
     */
    constructor() { 
        
        OrderBusinessBuyerDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrderBusinessBuyerDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrderBusinessBuyerDTO} obj Optional instance to populate.
     * @return {module:model/OrderBusinessBuyerDTO} The populated <code>OrderBusinessBuyerDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrderBusinessBuyerDTO();

            if (data.hasOwnProperty('inn')) {
                obj['inn'] = ApiClient.convertToType(data['inn'], 'String');
            }
            if (data.hasOwnProperty('kpp')) {
                obj['kpp'] = ApiClient.convertToType(data['kpp'], 'String');
            }
            if (data.hasOwnProperty('organizationName')) {
                obj['organizationName'] = ApiClient.convertToType(data['organizationName'], 'String');
            }
            if (data.hasOwnProperty('organizationJurAddress')) {
                obj['organizationJurAddress'] = ApiClient.convertToType(data['organizationJurAddress'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OrderBusinessBuyerDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OrderBusinessBuyerDTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['inn'] && !(typeof data['inn'] === 'string' || data['inn'] instanceof String)) {
            throw new Error("Expected the field `inn` to be a primitive type in the JSON string but got " + data['inn']);
        }
        // ensure the json data is a string
        if (data['kpp'] && !(typeof data['kpp'] === 'string' || data['kpp'] instanceof String)) {
            throw new Error("Expected the field `kpp` to be a primitive type in the JSON string but got " + data['kpp']);
        }
        // ensure the json data is a string
        if (data['organizationName'] && !(typeof data['organizationName'] === 'string' || data['organizationName'] instanceof String)) {
            throw new Error("Expected the field `organizationName` to be a primitive type in the JSON string but got " + data['organizationName']);
        }
        // ensure the json data is a string
        if (data['organizationJurAddress'] && !(typeof data['organizationJurAddress'] === 'string' || data['organizationJurAddress'] instanceof String)) {
            throw new Error("Expected the field `organizationJurAddress` to be a primitive type in the JSON string but got " + data['organizationJurAddress']);
        }

        return true;
    }


}



/**
 * ИНН.
 * @member {String} inn
 */
OrderBusinessBuyerDTO.prototype['inn'] = undefined;

/**
 * КПП.
 * @member {String} kpp
 */
OrderBusinessBuyerDTO.prototype['kpp'] = undefined;

/**
 * Наименование юридического лица.
 * @member {String} organizationName
 */
OrderBusinessBuyerDTO.prototype['organizationName'] = undefined;

/**
 * Юридический адрес.
 * @member {String} organizationJurAddress
 */
OrderBusinessBuyerDTO.prototype['organizationJurAddress'] = undefined;






export default OrderBusinessBuyerDTO;

