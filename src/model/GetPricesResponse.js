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
import OfferPriceListResponseDTO from './OfferPriceListResponseDTO';

/**
 * The GetPricesResponse model module.
 * @module model/GetPricesResponse
 * @version LATEST
 */
class GetPricesResponse {
    /**
     * Constructs a new <code>GetPricesResponse</code>.
     * Ответ на запрос списка цен.
     * @alias module:model/GetPricesResponse
     * @implements module:model/ApiResponse
     */
    constructor() { 
        ApiResponse.initialize(this);
        GetPricesResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GetPricesResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetPricesResponse} obj Optional instance to populate.
     * @return {module:model/GetPricesResponse} The populated <code>GetPricesResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetPricesResponse();
            ApiResponse.constructFromObject(data, obj);

            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiResponseStatusType.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('result')) {
                obj['result'] = OfferPriceListResponseDTO.constructFromObject(data['result']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>GetPricesResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>GetPricesResponse</code>.
     */
    static validateJSON(data) {
        // validate the optional field `result`
        if (data['result']) { // data not null
          OfferPriceListResponseDTO.validateJSON(data['result']);
        }

        return true;
    }


}



/**
 * @member {module:model/ApiResponseStatusType} status
 */
GetPricesResponse.prototype['status'] = undefined;

/**
 * @member {module:model/OfferPriceListResponseDTO} result
 */
GetPricesResponse.prototype['result'] = undefined;


// Implement ApiResponse interface:
/**
 * @member {module:model/ApiResponseStatusType} status
 */
ApiResponse.prototype['status'] = undefined;




export default GetPricesResponse;

