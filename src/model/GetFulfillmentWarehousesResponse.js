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
import FulfillmentWarehousesDTO from './FulfillmentWarehousesDTO';

/**
 * The GetFulfillmentWarehousesResponse model module.
 * @module model/GetFulfillmentWarehousesResponse
 * @version LATEST
 */
class GetFulfillmentWarehousesResponse {
    /**
     * @member {module:model/ApiResponseStatusType} status
     * @type {module:model/ApiResponseStatusType}
     */
    status;
    /**
     * @member {module:model/FulfillmentWarehousesDTO} result
     * @type {module:model/FulfillmentWarehousesDTO}
     */
    result;

    /**
     * @member {module:model/ApiResponseStatusType} status
     * @type {module:model/ApiResponseStatusType}
     */
    #status;
    

    /**
     * Constructs a new <code>GetFulfillmentWarehousesResponse</code>.
     * @alias module:model/GetFulfillmentWarehousesResponse
     * @implements module:model/ApiResponse
     */
    constructor() { 
        ApiResponse.initialize(this);
        GetFulfillmentWarehousesResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GetFulfillmentWarehousesResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetFulfillmentWarehousesResponse} obj Optional instance to populate.
     * @return {module:model/GetFulfillmentWarehousesResponse} The populated <code>GetFulfillmentWarehousesResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetFulfillmentWarehousesResponse();
            ApiResponse.constructFromObject(data, obj);

            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiResponseStatusType.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('result')) {
                obj['result'] = FulfillmentWarehousesDTO.constructFromObject(data['result']);
            }
        }
        return obj;
    }
}



export default GetFulfillmentWarehousesResponse;

