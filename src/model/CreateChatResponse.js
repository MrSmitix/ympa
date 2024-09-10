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
import ApiResponse from './ApiResponse';
import ApiResponseStatusType from './ApiResponseStatusType';
import CreateChatResultDTO from './CreateChatResultDTO';

/**
 * The CreateChatResponse model module.
 * @module model/CreateChatResponse
 * @version LATEST
 */
class CreateChatResponse {
    /**
     * Constructs a new <code>CreateChatResponse</code>.
     * Результат создания чата.
     * @alias module:model/CreateChatResponse
     * @implements module:model/ApiResponse
     */
    constructor() { 
        ApiResponse.initialize(this);
        CreateChatResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CreateChatResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateChatResponse} obj Optional instance to populate.
     * @return {module:model/CreateChatResponse} The populated <code>CreateChatResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateChatResponse();
            ApiResponse.constructFromObject(data, obj);

            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiResponseStatusType.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('result')) {
                obj['result'] = CreateChatResultDTO.constructFromObject(data['result']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CreateChatResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CreateChatResponse</code>.
     */
    static validateJSON(data) {
        // validate the optional field `result`
        if (data['result']) { // data not null
          CreateChatResultDTO.validateJSON(data['result']);
        }

        return true;
    }


}



/**
 * @member {module:model/ApiResponseStatusType} status
 */
CreateChatResponse.prototype['status'] = undefined;

/**
 * @member {module:model/CreateChatResultDTO} result
 */
CreateChatResponse.prototype['result'] = undefined;


// Implement ApiResponse interface:
/**
 * @member {module:model/ApiResponseStatusType} status
 */
ApiResponse.prototype['status'] = undefined;




export default CreateChatResponse;

