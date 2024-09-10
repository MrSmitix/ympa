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
import FieldStateType from './FieldStateType';
import PriceCompetitivenessType from './PriceCompetitivenessType';

/**
 * The GetOfferRecommendationsRequest model module.
 * @module model/GetOfferRecommendationsRequest
 * @version LATEST
 */
class GetOfferRecommendationsRequest {
    /**
     * Constructs a new <code>GetOfferRecommendationsRequest</code>.
     * @alias module:model/GetOfferRecommendationsRequest
     */
    constructor() { 
        
        GetOfferRecommendationsRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GetOfferRecommendationsRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetOfferRecommendationsRequest} obj Optional instance to populate.
     * @return {module:model/GetOfferRecommendationsRequest} The populated <code>GetOfferRecommendationsRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetOfferRecommendationsRequest();

            if (data.hasOwnProperty('offerIds')) {
                obj['offerIds'] = ApiClient.convertToType(data['offerIds'], ['String']);
            }
            if (data.hasOwnProperty('cofinancePriceFilter')) {
                obj['cofinancePriceFilter'] = FieldStateType.constructFromObject(data['cofinancePriceFilter']);
            }
            if (data.hasOwnProperty('recommendedCofinancePriceFilter')) {
                obj['recommendedCofinancePriceFilter'] = FieldStateType.constructFromObject(data['recommendedCofinancePriceFilter']);
            }
            if (data.hasOwnProperty('competitivenessFilter')) {
                obj['competitivenessFilter'] = PriceCompetitivenessType.constructFromObject(data['competitivenessFilter']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>GetOfferRecommendationsRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>GetOfferRecommendationsRequest</code>.
     */
    static validateJSON(data) {
        // ensure the json data is an array
        if (!Array.isArray(data['offerIds'])) {
            throw new Error("Expected the field `offerIds` to be an array in the JSON data but got " + data['offerIds']);
        }

        return true;
    }


}



/**
 * Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
 * @member {Array.<String>} offerIds
 */
GetOfferRecommendationsRequest.prototype['offerIds'] = undefined;

/**
 * @member {module:model/FieldStateType} cofinancePriceFilter
 */
GetOfferRecommendationsRequest.prototype['cofinancePriceFilter'] = undefined;

/**
 * @member {module:model/FieldStateType} recommendedCofinancePriceFilter
 */
GetOfferRecommendationsRequest.prototype['recommendedCofinancePriceFilter'] = undefined;

/**
 * @member {module:model/PriceCompetitivenessType} competitivenessFilter
 */
GetOfferRecommendationsRequest.prototype['competitivenessFilter'] = undefined;






export default GetOfferRecommendationsRequest;

