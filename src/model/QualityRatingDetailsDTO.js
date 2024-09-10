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
import QualityRatingAffectedOrderDTO from './QualityRatingAffectedOrderDTO';

/**
 * The QualityRatingDetailsDTO model module.
 * @module model/QualityRatingDetailsDTO
 * @version LATEST
 */
class QualityRatingDetailsDTO {
    /**
     * Constructs a new <code>QualityRatingDetailsDTO</code>.
     * Информация о заказах, которые повлияли на индекс качества.
     * @alias module:model/QualityRatingDetailsDTO
     * @param affectedOrders {Array.<module:model/QualityRatingAffectedOrderDTO>} Список заказов, которые повлияли на индекс качества.
     */
    constructor(affectedOrders) { 
        
        QualityRatingDetailsDTO.initialize(this, affectedOrders);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, affectedOrders) { 
        obj['affectedOrders'] = affectedOrders;
    }

    /**
     * Constructs a <code>QualityRatingDetailsDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/QualityRatingDetailsDTO} obj Optional instance to populate.
     * @return {module:model/QualityRatingDetailsDTO} The populated <code>QualityRatingDetailsDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QualityRatingDetailsDTO();

            if (data.hasOwnProperty('affectedOrders')) {
                obj['affectedOrders'] = ApiClient.convertToType(data['affectedOrders'], [QualityRatingAffectedOrderDTO]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>QualityRatingDetailsDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>QualityRatingDetailsDTO</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of QualityRatingDetailsDTO.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        if (data['affectedOrders']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['affectedOrders'])) {
                throw new Error("Expected the field `affectedOrders` to be an array in the JSON data but got " + data['affectedOrders']);
            }
            // validate the optional field `affectedOrders` (array)
            for (const item of data['affectedOrders']) {
                QualityRatingAffectedOrderDTO.validateJSON(item);
            };
        }

        return true;
    }


}

QualityRatingDetailsDTO.RequiredProperties = ["affectedOrders"];

/**
 * Список заказов, которые повлияли на индекс качества.
 * @member {Array.<module:model/QualityRatingAffectedOrderDTO>} affectedOrders
 */
QualityRatingDetailsDTO.prototype['affectedOrders'] = undefined;






export default QualityRatingDetailsDTO;

