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
* Enum class TurnoverType.
* @enum {}
* @readonly
*/
export default class TurnoverType {
    
        /**
         * value: "LOW"
         * @const
         */
        "LOW" = "LOW";

    
        /**
         * value: "ALMOST_LOW"
         * @const
         */
        "ALMOST_LOW" = "ALMOST_LOW";

    
        /**
         * value: "HIGH"
         * @const
         */
        "HIGH" = "HIGH";

    
        /**
         * value: "VERY_HIGH"
         * @const
         */
        "VERY_HIGH" = "VERY_HIGH";

    
        /**
         * value: "NO_SALES"
         * @const
         */
        "NO_SALES" = "NO_SALES";

    
        /**
         * value: "FREE_STORE"
         * @const
         */
        "FREE_STORE" = "FREE_STORE";

    

    /**
    * Returns a <code>TurnoverType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/TurnoverType} The enum <code>TurnoverType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

