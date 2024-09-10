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
import QualityRatingComponentDTO from './QualityRatingComponentDTO';

/**
 * The QualityRatingDTO model module.
 * @module model/QualityRatingDTO
 * @version LATEST
 */
class QualityRatingDTO {
    /**
     * Constructs a new <code>QualityRatingDTO</code>.
     * Информация об индексе качества.
     * @alias module:model/QualityRatingDTO
     * @param rating {Number} Значение индекса качества.
     * @param calculationDate {Date} Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
     * @param components {Array.<module:model/QualityRatingComponentDTO>} Составляющие индекса качества.
     */
    constructor(rating, calculationDate, components) { 
        
        QualityRatingDTO.initialize(this, rating, calculationDate, components);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, rating, calculationDate, components) { 
        obj['rating'] = rating;
        obj['calculationDate'] = calculationDate;
        obj['components'] = components;
    }

    /**
     * Constructs a <code>QualityRatingDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/QualityRatingDTO} obj Optional instance to populate.
     * @return {module:model/QualityRatingDTO} The populated <code>QualityRatingDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QualityRatingDTO();

            if (data.hasOwnProperty('rating')) {
                obj['rating'] = ApiClient.convertToType(data['rating'], 'Number');
            }
            if (data.hasOwnProperty('calculationDate')) {
                obj['calculationDate'] = ApiClient.convertToType(data['calculationDate'], 'Date');
            }
            if (data.hasOwnProperty('components')) {
                obj['components'] = ApiClient.convertToType(data['components'], [QualityRatingComponentDTO]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>QualityRatingDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>QualityRatingDTO</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of QualityRatingDTO.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        if (data['components']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['components'])) {
                throw new Error("Expected the field `components` to be an array in the JSON data but got " + data['components']);
            }
            // validate the optional field `components` (array)
            for (const item of data['components']) {
                QualityRatingComponentDTO.validateJSON(item);
            };
        }

        return true;
    }


}

QualityRatingDTO.RequiredProperties = ["rating", "calculationDate", "components"];

/**
 * Значение индекса качества.
 * @member {Number} rating
 */
QualityRatingDTO.prototype['rating'] = undefined;

/**
 * Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
 * @member {Date} calculationDate
 */
QualityRatingDTO.prototype['calculationDate'] = undefined;

/**
 * Составляющие индекса качества.
 * @member {Array.<module:model/QualityRatingComponentDTO>} components
 */
QualityRatingDTO.prototype['components'] = undefined;






export default QualityRatingDTO;

