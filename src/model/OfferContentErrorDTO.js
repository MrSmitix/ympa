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
import OfferContentErrorType from './OfferContentErrorType';

/**
 * The OfferContentErrorDTO model module.
 * @module model/OfferContentErrorDTO
 * @version LATEST
 */
class OfferContentErrorDTO {
    /**
     * Constructs a new <code>OfferContentErrorDTO</code>.
     * Текст ошибки.
     * @alias module:model/OfferContentErrorDTO
     * @param type {module:model/OfferContentErrorType} 
     * @param message {String} Текст ошибки.
     */
    constructor(type, message) { 
        
        OfferContentErrorDTO.initialize(this, type, message);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, type, message) { 
        obj['type'] = type;
        obj['message'] = message;
    }

    /**
     * Constructs a <code>OfferContentErrorDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OfferContentErrorDTO} obj Optional instance to populate.
     * @return {module:model/OfferContentErrorDTO} The populated <code>OfferContentErrorDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OfferContentErrorDTO();

            if (data.hasOwnProperty('type')) {
                obj['type'] = OfferContentErrorType.constructFromObject(data['type']);
            }
            if (data.hasOwnProperty('parameterId')) {
                obj['parameterId'] = ApiClient.convertToType(data['parameterId'], 'Number');
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = ApiClient.convertToType(data['message'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OfferContentErrorDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OfferContentErrorDTO</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of OfferContentErrorDTO.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['message'] && !(typeof data['message'] === 'string' || data['message'] instanceof String)) {
            throw new Error("Expected the field `message` to be a primitive type in the JSON string but got " + data['message']);
        }

        return true;
    }


}

OfferContentErrorDTO.RequiredProperties = ["type", "message"];

/**
 * @member {module:model/OfferContentErrorType} type
 */
OfferContentErrorDTO.prototype['type'] = undefined;

/**
 * Идентификатор характеристики, с которой связана ошибка.
 * @member {Number} parameterId
 */
OfferContentErrorDTO.prototype['parameterId'] = undefined;

/**
 * Текст ошибки.
 * @member {String} message
 */
OfferContentErrorDTO.prototype['message'] = undefined;






export default OfferContentErrorDTO;

