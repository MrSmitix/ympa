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
 * The ForwardScrollingPagerDTO model module.
 * @module model/ForwardScrollingPagerDTO
 * @version LATEST
 */
class ForwardScrollingPagerDTO {
    /**
     * Constructs a new <code>ForwardScrollingPagerDTO</code>.
     * Ссылка на следующую страницу. 
     * @alias module:model/ForwardScrollingPagerDTO
     */
    constructor() { 
        
        ForwardScrollingPagerDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ForwardScrollingPagerDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ForwardScrollingPagerDTO} obj Optional instance to populate.
     * @return {module:model/ForwardScrollingPagerDTO} The populated <code>ForwardScrollingPagerDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ForwardScrollingPagerDTO();

            if (data.hasOwnProperty('nextPageToken')) {
                obj['nextPageToken'] = ApiClient.convertToType(data['nextPageToken'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ForwardScrollingPagerDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ForwardScrollingPagerDTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['nextPageToken'] && !(typeof data['nextPageToken'] === 'string' || data['nextPageToken'] instanceof String)) {
            throw new Error("Expected the field `nextPageToken` to be a primitive type in the JSON string but got " + data['nextPageToken']);
        }

        return true;
    }


}



/**
 * Идентификатор следующей страницы результатов.
 * @member {String} nextPageToken
 */
ForwardScrollingPagerDTO.prototype['nextPageToken'] = undefined;






export default ForwardScrollingPagerDTO;

