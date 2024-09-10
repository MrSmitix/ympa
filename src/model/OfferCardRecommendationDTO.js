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
import OfferCardRecommendationType from './OfferCardRecommendationType';

/**
 * The OfferCardRecommendationDTO model module.
 * @module model/OfferCardRecommendationDTO
 * @version LATEST
 */
class OfferCardRecommendationDTO {
    /**
     * Constructs a new <code>OfferCardRecommendationDTO</code>.
     * Рекомендация по заполнению карточки товара.
     * @alias module:model/OfferCardRecommendationDTO
     * @param type {module:model/OfferCardRecommendationType} 
     */
    constructor(type) { 
        
        OfferCardRecommendationDTO.initialize(this, type);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, type) { 
        obj['type'] = type;
    }

    /**
     * Constructs a <code>OfferCardRecommendationDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OfferCardRecommendationDTO} obj Optional instance to populate.
     * @return {module:model/OfferCardRecommendationDTO} The populated <code>OfferCardRecommendationDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OfferCardRecommendationDTO();

            if (data.hasOwnProperty('type')) {
                obj['type'] = OfferCardRecommendationType.constructFromObject(data['type']);
            }
            if (data.hasOwnProperty('percent')) {
                obj['percent'] = ApiClient.convertToType(data['percent'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OfferCardRecommendationDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OfferCardRecommendationDTO</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of OfferCardRecommendationDTO.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }

        return true;
    }


}

OfferCardRecommendationDTO.RequiredProperties = ["type"];

/**
 * @member {module:model/OfferCardRecommendationType} type
 */
OfferCardRecommendationDTO.prototype['type'] = undefined;

/**
 * Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
 * @member {Number} percent
 */
OfferCardRecommendationDTO.prototype['percent'] = undefined;






export default OfferCardRecommendationDTO;

