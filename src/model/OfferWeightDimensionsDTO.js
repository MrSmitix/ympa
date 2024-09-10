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

/**
 * The OfferWeightDimensionsDTO model module.
 * @module model/OfferWeightDimensionsDTO
 * @version LATEST
 */
class OfferWeightDimensionsDTO {
    /**
     * Constructs a new <code>OfferWeightDimensionsDTO</code>.
     * Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
     * @alias module:model/OfferWeightDimensionsDTO
     * @param length {Number} Длина упаковки в см. 
     * @param width {Number} Ширина упаковки в см. 
     * @param height {Number} Высота упаковки в см. 
     * @param weight {Number} Вес товара в кг с учетом упаковки (брутто). 
     */
    constructor(length, width, height, weight) { 
        
        OfferWeightDimensionsDTO.initialize(this, length, width, height, weight);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, length, width, height, weight) { 
        obj['length'] = length;
        obj['width'] = width;
        obj['height'] = height;
        obj['weight'] = weight;
    }

    /**
     * Constructs a <code>OfferWeightDimensionsDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OfferWeightDimensionsDTO} obj Optional instance to populate.
     * @return {module:model/OfferWeightDimensionsDTO} The populated <code>OfferWeightDimensionsDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OfferWeightDimensionsDTO();

            if (data.hasOwnProperty('length')) {
                obj['length'] = ApiClient.convertToType(data['length'], 'Number');
            }
            if (data.hasOwnProperty('width')) {
                obj['width'] = ApiClient.convertToType(data['width'], 'Number');
            }
            if (data.hasOwnProperty('height')) {
                obj['height'] = ApiClient.convertToType(data['height'], 'Number');
            }
            if (data.hasOwnProperty('weight')) {
                obj['weight'] = ApiClient.convertToType(data['weight'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OfferWeightDimensionsDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OfferWeightDimensionsDTO</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of OfferWeightDimensionsDTO.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }

        return true;
    }


}

OfferWeightDimensionsDTO.RequiredProperties = ["length", "width", "height", "weight"];

/**
 * Длина упаковки в см. 
 * @member {Number} length
 */
OfferWeightDimensionsDTO.prototype['length'] = undefined;

/**
 * Ширина упаковки в см. 
 * @member {Number} width
 */
OfferWeightDimensionsDTO.prototype['width'] = undefined;

/**
 * Высота упаковки в см. 
 * @member {Number} height
 */
OfferWeightDimensionsDTO.prototype['height'] = undefined;

/**
 * Вес товара в кг с учетом упаковки (брутто). 
 * @member {Number} weight
 */
OfferWeightDimensionsDTO.prototype['weight'] = undefined;






export default OfferWeightDimensionsDTO;

