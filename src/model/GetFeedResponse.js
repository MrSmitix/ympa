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
import FeedDTO from './FeedDTO';

/**
 * The GetFeedResponse model module.
 * @module model/GetFeedResponse
 * @version LATEST
 */
class GetFeedResponse {
    /**
     * @member {module:model/FeedDTO} feed
     * @type {module:model/FeedDTO}
     */
    feed;

    

    /**
     * Constructs a new <code>GetFeedResponse</code>.
     * Ответ на запрос информации о прайс-листе.
     * @alias module:model/GetFeedResponse
     */
    constructor() { 
        
        GetFeedResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GetFeedResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetFeedResponse} obj Optional instance to populate.
     * @return {module:model/GetFeedResponse} The populated <code>GetFeedResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetFeedResponse();

            if (data.hasOwnProperty('feed')) {
                obj['feed'] = FeedDTO.constructFromObject(data['feed']);
            }
        }
        return obj;
    }
}



export default GetFeedResponse;

