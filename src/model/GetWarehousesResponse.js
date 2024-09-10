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
import WarehousesDTO from './WarehousesDTO';

/**
 * The GetWarehousesResponse model module.
 * @module model/GetWarehousesResponse
 * @version LATEST
 */
class GetWarehousesResponse {
    /**
     * @member {module:model/ApiResponseStatusType} status
     * @type {module:model/ApiResponseStatusType}
     */
    status;
    /**
     * @member {module:model/WarehousesDTO} result
     * @type {module:model/WarehousesDTO}
     */
    result;

    /**
     * @member {module:model/ApiResponseStatusType} status
     * @type {module:model/ApiResponseStatusType}
     */
    #status;
    

    /**
     * Constructs a new <code>GetWarehousesResponse</code>.
     * @alias module:model/GetWarehousesResponse
     * @implements module:model/ApiResponse
     */
    constructor() { 
        ApiResponse.initialize(this);
        GetWarehousesResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GetWarehousesResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetWarehousesResponse} obj Optional instance to populate.
     * @return {module:model/GetWarehousesResponse} The populated <code>GetWarehousesResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetWarehousesResponse();
            ApiResponse.constructFromObject(data, obj);

            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiResponseStatusType.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('result')) {
                obj['result'] = WarehousesDTO.constructFromObject(data['result']);
            }
        }
        return obj;
    }
}



export default GetWarehousesResponse;

