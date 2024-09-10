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
* Enum class OutletStatusType.
* @enum {}
* @readonly
*/
export default class OutletStatusType {
    
        /**
         * value: "AT_MODERATION"
         * @const
         */
        "AT_MODERATION" = "AT_MODERATION";

    
        /**
         * value: "FAILED"
         * @const
         */
        "FAILED" = "FAILED";

    
        /**
         * value: "MODERATED"
         * @const
         */
        "MODERATED" = "MODERATED";

    
        /**
         * value: "NONMODERATED"
         * @const
         */
        "NONMODERATED" = "NONMODERATED";

    
        /**
         * value: "UNKNOWN"
         * @const
         */
        "UNKNOWN" = "UNKNOWN";

    

    /**
    * Returns a <code>OutletStatusType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/OutletStatusType} The enum <code>OutletStatusType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

