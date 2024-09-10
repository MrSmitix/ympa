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
import FeedbackCommentAuthorDTO from './FeedbackCommentAuthorDTO';

/**
 * The FeedbackCommentDTO model module.
 * @module model/FeedbackCommentDTO
 * @version LATEST
 */
class FeedbackCommentDTO {
    /**
     * @member {Number} id
     * @type {Number}
     */
    id;
    /**
     * @member {Number} parentId
     * @type {Number}
     */
    parentId;
    /**
     * @member {String} body
     * @type {String}
     */
    body;
    /**
     * @member {Date} createdAt
     * @type {Date}
     */
    createdAt;
    /**
     * @member {Date} updatedAt
     * @type {Date}
     */
    updatedAt;
    /**
     * @member {module:model/FeedbackCommentAuthorDTO} author
     * @type {module:model/FeedbackCommentAuthorDTO}
     */
    author;
    /**
     * @member {Array.<module:model/FeedbackCommentDTO>} children
     * @type {Array.<module:model/FeedbackCommentDTO>}
     */
    children;

    

    /**
     * Constructs a new <code>FeedbackCommentDTO</code>.
     * Комментарий к отзыву на магазин.
     * @alias module:model/FeedbackCommentDTO
     */
    constructor() { 
        
        FeedbackCommentDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FeedbackCommentDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FeedbackCommentDTO} obj Optional instance to populate.
     * @return {module:model/FeedbackCommentDTO} The populated <code>FeedbackCommentDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FeedbackCommentDTO();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('parentId')) {
                obj['parentId'] = ApiClient.convertToType(data['parentId'], 'Number');
            }
            if (data.hasOwnProperty('body')) {
                obj['body'] = ApiClient.convertToType(data['body'], 'String');
            }
            if (data.hasOwnProperty('createdAt')) {
                obj['createdAt'] = ApiClient.convertToType(data['createdAt'], 'Date');
            }
            if (data.hasOwnProperty('updatedAt')) {
                obj['updatedAt'] = ApiClient.convertToType(data['updatedAt'], 'Date');
            }
            if (data.hasOwnProperty('author')) {
                obj['author'] = FeedbackCommentAuthorDTO.constructFromObject(data['author']);
            }
            if (data.hasOwnProperty('children')) {
                obj['children'] = ApiClient.convertToType(data['children'], [FeedbackCommentDTO]);
            }
        }
        return obj;
    }
}



export default FeedbackCommentDTO;

