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
* Enum class OrderTaxSystemType.
* @enum {}
* @readonly
*/
export default class OrderTaxSystemType {
    
        /**
         * value: "OSN"
         * @const
         */
        "OSN" = "OSN";

    
        /**
         * value: "USN"
         * @const
         */
        "USN" = "USN";

    
        /**
         * value: "USN_MINUS_COST"
         * @const
         */
        "USN_MINUS_COST" = "USN_MINUS_COST";

    
        /**
         * value: "ENVD"
         * @const
         */
        "ENVD" = "ENVD";

    
        /**
         * value: "ECHN"
         * @const
         */
        "ECHN" = "ECHN";

    
        /**
         * value: "PSN"
         * @const
         */
        "PSN" = "PSN";

    
        /**
         * value: "NPD"
         * @const
         */
        "NPD" = "NPD";

    
        /**
         * value: "UNKNOWN_VALUE"
         * @const
         */
        "UNKNOWN_VALUE" = "UNKNOWN_VALUE";

    

    /**
    * Returns a <code>OrderTaxSystemType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/OrderTaxSystemType} The enum <code>OrderTaxSystemType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

