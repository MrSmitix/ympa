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
import ForwardScrollingPagerDTO from './ForwardScrollingPagerDTO';
import GoodsFeedbackCommentDTO from './GoodsFeedbackCommentDTO';

/**
 * The GoodsFeedbackCommentListDTO model module.
 * @module model/GoodsFeedbackCommentListDTO
 * @version LATEST
 */
class GoodsFeedbackCommentListDTO {
    /**
     * Constructs a new <code>GoodsFeedbackCommentListDTO</code>.
     * Комментарии к отзыву.
     * @alias module:model/GoodsFeedbackCommentListDTO
     * @param comments {Array.<module:model/GoodsFeedbackCommentDTO>} Список комментариев.
     */
    constructor(comments) { 
        
        GoodsFeedbackCommentListDTO.initialize(this, comments);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, comments) { 
        obj['comments'] = comments;
    }

    /**
     * Constructs a <code>GoodsFeedbackCommentListDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GoodsFeedbackCommentListDTO} obj Optional instance to populate.
     * @return {module:model/GoodsFeedbackCommentListDTO} The populated <code>GoodsFeedbackCommentListDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GoodsFeedbackCommentListDTO();

            if (data.hasOwnProperty('comments')) {
                obj['comments'] = ApiClient.convertToType(data['comments'], [GoodsFeedbackCommentDTO]);
            }
            if (data.hasOwnProperty('paging')) {
                obj['paging'] = ForwardScrollingPagerDTO.constructFromObject(data['paging']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>GoodsFeedbackCommentListDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>GoodsFeedbackCommentListDTO</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of GoodsFeedbackCommentListDTO.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        if (data['comments']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['comments'])) {
                throw new Error("Expected the field `comments` to be an array in the JSON data but got " + data['comments']);
            }
            // validate the optional field `comments` (array)
            for (const item of data['comments']) {
                GoodsFeedbackCommentDTO.validateJSON(item);
            };
        }
        // validate the optional field `paging`
        if (data['paging']) { // data not null
          ForwardScrollingPagerDTO.validateJSON(data['paging']);
        }

        return true;
    }


}

GoodsFeedbackCommentListDTO.RequiredProperties = ["comments"];

/**
 * Список комментариев.
 * @member {Array.<module:model/GoodsFeedbackCommentDTO>} comments
 */
GoodsFeedbackCommentListDTO.prototype['comments'] = undefined;

/**
 * @member {module:model/ForwardScrollingPagerDTO} paging
 */
GoodsFeedbackCommentListDTO.prototype['paging'] = undefined;






export default GoodsFeedbackCommentListDTO;

