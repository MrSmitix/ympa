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
 * The GoodsFeedbackStatisticsDTO model module.
 * @module model/GoodsFeedbackStatisticsDTO
 * @version LATEST
 */
class GoodsFeedbackStatisticsDTO {
    /**
     * @member {Number} rating
     * @type {Number}
     */
    rating;
    /**
     * @member {Number} commentsCount
     * @type {Number}
     */
    commentsCount;
    /**
     * @member {Boolean} recommended
     * @type {Boolean}
     */
    recommended;
    /**
     * @member {Number} paidAmount
     * @type {Number}
     */
    paidAmount;

    

    /**
     * Constructs a new <code>GoodsFeedbackStatisticsDTO</code>.
     * Статистическая информация по отзыву.
     * @alias module:model/GoodsFeedbackStatisticsDTO
     * @param rating {Number} Оценка товара.
     * @param commentsCount {Number} Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. 
     */
    constructor(rating, commentsCount) { 
        
        GoodsFeedbackStatisticsDTO.initialize(this, rating, commentsCount);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, rating, commentsCount) { 
        obj['rating'] = rating;
        obj['commentsCount'] = commentsCount;
    }

    /**
     * Constructs a <code>GoodsFeedbackStatisticsDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GoodsFeedbackStatisticsDTO} obj Optional instance to populate.
     * @return {module:model/GoodsFeedbackStatisticsDTO} The populated <code>GoodsFeedbackStatisticsDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GoodsFeedbackStatisticsDTO();

            if (data.hasOwnProperty('rating')) {
                obj['rating'] = ApiClient.convertToType(data['rating'], 'Number');
            }
            if (data.hasOwnProperty('commentsCount')) {
                obj['commentsCount'] = ApiClient.convertToType(data['commentsCount'], 'Number');
            }
            if (data.hasOwnProperty('recommended')) {
                obj['recommended'] = ApiClient.convertToType(data['recommended'], 'Boolean');
            }
            if (data.hasOwnProperty('paidAmount')) {
                obj['paidAmount'] = ApiClient.convertToType(data['paidAmount'], 'Number');
            }
        }
        return obj;
    }
}



export default GoodsFeedbackStatisticsDTO;

