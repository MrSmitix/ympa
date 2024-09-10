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
 * The GoodsFeedbackDescriptionDTO model module.
 * @module model/GoodsFeedbackDescriptionDTO
 * @version LATEST
 */
class GoodsFeedbackDescriptionDTO {
    /**
     * @member {String} advantages
     * @type {String}
     */
    advantages;
    /**
     * @member {String} disadvantages
     * @type {String}
     */
    disadvantages;
    /**
     * @member {String} comment
     * @type {String}
     */
    comment;

    

    /**
     * Constructs a new <code>GoodsFeedbackDescriptionDTO</code>.
     * Текстовая часть отзыва.
     * @alias module:model/GoodsFeedbackDescriptionDTO
     */
    constructor() { 
        
        GoodsFeedbackDescriptionDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GoodsFeedbackDescriptionDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GoodsFeedbackDescriptionDTO} obj Optional instance to populate.
     * @return {module:model/GoodsFeedbackDescriptionDTO} The populated <code>GoodsFeedbackDescriptionDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GoodsFeedbackDescriptionDTO();

            if (data.hasOwnProperty('advantages')) {
                obj['advantages'] = ApiClient.convertToType(data['advantages'], 'String');
            }
            if (data.hasOwnProperty('disadvantages')) {
                obj['disadvantages'] = ApiClient.convertToType(data['disadvantages'], 'String');
            }
            if (data.hasOwnProperty('comment')) {
                obj['comment'] = ApiClient.convertToType(data['comment'], 'String');
            }
        }
        return obj;
    }
}



export default GoodsFeedbackDescriptionDTO;

