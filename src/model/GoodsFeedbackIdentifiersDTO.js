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
 * The GoodsFeedbackIdentifiersDTO model module.
 * @module model/GoodsFeedbackIdentifiersDTO
 * @version LATEST
 */
class GoodsFeedbackIdentifiersDTO {
    /**
     * @member {Number} orderId
     * @type {Number}
     */
    orderId;
    /**
     * @member {Number} modelId
     * @type {Number}
     */
    modelId;

    

    /**
     * Constructs a new <code>GoodsFeedbackIdentifiersDTO</code>.
     * Идентификаторы, которые связаны с отзывом.
     * @alias module:model/GoodsFeedbackIdentifiersDTO
     * @param orderId {Number} Идентификатор заказа на Маркете.
     * @param modelId {Number} Идентификатор модели товара.
     */
    constructor(orderId, modelId) { 
        
        GoodsFeedbackIdentifiersDTO.initialize(this, orderId, modelId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, orderId, modelId) { 
        obj['orderId'] = orderId;
        obj['modelId'] = modelId;
    }

    /**
     * Constructs a <code>GoodsFeedbackIdentifiersDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GoodsFeedbackIdentifiersDTO} obj Optional instance to populate.
     * @return {module:model/GoodsFeedbackIdentifiersDTO} The populated <code>GoodsFeedbackIdentifiersDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GoodsFeedbackIdentifiersDTO();

            if (data.hasOwnProperty('orderId')) {
                obj['orderId'] = ApiClient.convertToType(data['orderId'], 'Number');
            }
            if (data.hasOwnProperty('modelId')) {
                obj['modelId'] = ApiClient.convertToType(data['modelId'], 'Number');
            }
        }
        return obj;
    }
}



export default GoodsFeedbackIdentifiersDTO;

