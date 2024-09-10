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
* Enum class OfferProcessingStatusType.
* @enum {}
* @readonly
*/
export default class OfferProcessingStatusType {
    
        /**
         * value: "UNKNOWN"
         * @const
         */
        "UNKNOWN" = "UNKNOWN";

    
        /**
         * value: "READY"
         * @const
         */
        "READY" = "READY";

    
        /**
         * value: "IN_WORK"
         * @const
         */
        "IN_WORK" = "IN_WORK";

    
        /**
         * value: "NEED_INFO"
         * @const
         */
        "NEED_INFO" = "NEED_INFO";

    
        /**
         * value: "NEED_MAPPING"
         * @const
         */
        "NEED_MAPPING" = "NEED_MAPPING";

    
        /**
         * value: "NEED_CONTENT"
         * @const
         */
        "NEED_CONTENT" = "NEED_CONTENT";

    
        /**
         * value: "CONTENT_PROCESSING"
         * @const
         */
        "CONTENT_PROCESSING" = "CONTENT_PROCESSING";

    
        /**
         * value: "SUSPENDED"
         * @const
         */
        "SUSPENDED" = "SUSPENDED";

    
        /**
         * value: "REJECTED"
         * @const
         */
        "REJECTED" = "REJECTED";

    
        /**
         * value: "REVIEW"
         * @const
         */
        "REVIEW" = "REVIEW";

    
        /**
         * value: "CREATE_ERROR"
         * @const
         */
        "CREATE_ERROR" = "CREATE_ERROR";

    
        /**
         * value: "UPDATE_ERROR"
         * @const
         */
        "UPDATE_ERROR" = "UPDATE_ERROR";

    

    /**
    * Returns a <code>OfferProcessingStatusType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/OfferProcessingStatusType} The enum <code>OfferProcessingStatusType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

