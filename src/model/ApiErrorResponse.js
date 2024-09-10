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
import ApiErrorDTO from './ApiErrorDTO';
import ApiResponse from './ApiResponse';
import ApiResponseStatusType from './ApiResponseStatusType';

/**
 * The ApiErrorResponse model module.
 * @module model/ApiErrorResponse
 * @version LATEST
 */
class ApiErrorResponse {
    /**
     * @member {module:model/ApiResponseStatusType} status
     * @type {module:model/ApiResponseStatusType}
     */
    status;
    /**
     * @member {Array.<module:model/ApiErrorDTO>} errors
     * @type {Array.<module:model/ApiErrorDTO>}
     */
    errors;

    /**
     * @member {module:model/ApiResponseStatusType} status
     * @type {module:model/ApiResponseStatusType}
     */
    #status;
    

    /**
     * Constructs a new <code>ApiErrorResponse</code>.
     * Стандартная обертка для ошибок сервера.
     * @alias module:model/ApiErrorResponse
     * @implements module:model/ApiResponse
     */
    constructor() { 
        ApiResponse.initialize(this);
        ApiErrorResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ApiErrorResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ApiErrorResponse} obj Optional instance to populate.
     * @return {module:model/ApiErrorResponse} The populated <code>ApiErrorResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ApiErrorResponse();
            ApiResponse.constructFromObject(data, obj);

            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiResponseStatusType.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('errors')) {
                obj['errors'] = ApiClient.convertToType(data['errors'], [ApiErrorDTO]);
            }
        }
        return obj;
    }
}



export default ApiErrorResponse;

