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
import FeedParameterDTO from './FeedParameterDTO';

/**
 * The SetFeedParamsRequest model module.
 * @module model/SetFeedParamsRequest
 * @version LATEST
 */
class SetFeedParamsRequest {
    /**
     * Constructs a new <code>SetFeedParamsRequest</code>.
     * Запрос на обновление изменение параметров прайс-листа.
     * @alias module:model/SetFeedParamsRequest
     * @param parameters {Array.<module:model/FeedParameterDTO>} Параметры прайс-листа.  Обязательный параметр. 
     */
    constructor(parameters) { 
        
        SetFeedParamsRequest.initialize(this, parameters);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, parameters) { 
        obj['parameters'] = parameters;
    }

    /**
     * Constructs a <code>SetFeedParamsRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SetFeedParamsRequest} obj Optional instance to populate.
     * @return {module:model/SetFeedParamsRequest} The populated <code>SetFeedParamsRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SetFeedParamsRequest();

            if (data.hasOwnProperty('parameters')) {
                obj['parameters'] = ApiClient.convertToType(data['parameters'], [FeedParameterDTO]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>SetFeedParamsRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>SetFeedParamsRequest</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of SetFeedParamsRequest.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        if (data['parameters']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['parameters'])) {
                throw new Error("Expected the field `parameters` to be an array in the JSON data but got " + data['parameters']);
            }
            // validate the optional field `parameters` (array)
            for (const item of data['parameters']) {
                FeedParameterDTO.validateJSON(item);
            };
        }

        return true;
    }


}

SetFeedParamsRequest.RequiredProperties = ["parameters"];

/**
 * Параметры прайс-листа.  Обязательный параметр. 
 * @member {Array.<module:model/FeedParameterDTO>} parameters
 */
SetFeedParamsRequest.prototype['parameters'] = undefined;






export default SetFeedParamsRequest;

