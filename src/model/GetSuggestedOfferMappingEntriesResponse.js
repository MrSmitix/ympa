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
import OfferMappingSuggestionsListDTO from './OfferMappingSuggestionsListDTO';

/**
 * The GetSuggestedOfferMappingEntriesResponse model module.
 * @module model/GetSuggestedOfferMappingEntriesResponse
 * @version LATEST
 */
class GetSuggestedOfferMappingEntriesResponse {
    /**
     * @member {module:model/ApiResponseStatusType} status
     * @type {module:model/ApiResponseStatusType}
     */
    status;
    /**
     * @member {module:model/OfferMappingSuggestionsListDTO} result
     * @type {module:model/OfferMappingSuggestionsListDTO}
     */
    result;

    /**
     * @member {module:model/ApiResponseStatusType} status
     * @type {module:model/ApiResponseStatusType}
     */
    #status;
    

    /**
     * Constructs a new <code>GetSuggestedOfferMappingEntriesResponse</code>.
     * Ответ со списком рекомендованных карточек товара.
     * @alias module:model/GetSuggestedOfferMappingEntriesResponse
     * @implements module:model/ApiResponse
     */
    constructor() { 
        ApiResponse.initialize(this);
        GetSuggestedOfferMappingEntriesResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GetSuggestedOfferMappingEntriesResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetSuggestedOfferMappingEntriesResponse} obj Optional instance to populate.
     * @return {module:model/GetSuggestedOfferMappingEntriesResponse} The populated <code>GetSuggestedOfferMappingEntriesResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetSuggestedOfferMappingEntriesResponse();
            ApiResponse.constructFromObject(data, obj);

            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiResponseStatusType.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('result')) {
                obj['result'] = OfferMappingSuggestionsListDTO.constructFromObject(data['result']);
            }
        }
        return obj;
    }
}



export default GetSuggestedOfferMappingEntriesResponse;

