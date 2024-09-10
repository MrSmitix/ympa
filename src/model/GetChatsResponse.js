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
import GetChatsInfoDTO from './GetChatsInfoDTO';

/**
 * The GetChatsResponse model module.
 * @module model/GetChatsResponse
 * @version LATEST
 */
class GetChatsResponse {
    /**
     * Constructs a new <code>GetChatsResponse</code>.
     * @alias module:model/GetChatsResponse
     * @implements module:model/ApiResponse
     */
    constructor() { 
        ApiResponse.initialize(this);
        GetChatsResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GetChatsResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetChatsResponse} obj Optional instance to populate.
     * @return {module:model/GetChatsResponse} The populated <code>GetChatsResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetChatsResponse();
            ApiResponse.constructFromObject(data, obj);

            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiResponseStatusType.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('result')) {
                obj['result'] = GetChatsInfoDTO.constructFromObject(data['result']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>GetChatsResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>GetChatsResponse</code>.
     */
    static validateJSON(data) {
        // validate the optional field `result`
        if (data['result']) { // data not null
          GetChatsInfoDTO.validateJSON(data['result']);
        }

        return true;
    }


}



/**
 * @member {module:model/ApiResponseStatusType} status
 */
GetChatsResponse.prototype['status'] = undefined;

/**
 * @member {module:model/GetChatsInfoDTO} result
 */
GetChatsResponse.prototype['result'] = undefined;


// Implement ApiResponse interface:
/**
 * @member {module:model/ApiResponseStatusType} status
 */
ApiResponse.prototype['status'] = undefined;




export default GetChatsResponse;

