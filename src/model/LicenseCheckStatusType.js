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
* Enum class LicenseCheckStatusType.
* @enum {}
* @readonly
*/
export default class LicenseCheckStatusType {
    
        /**
         * value: "NEW"
         * @const
         */
        "NEW" = "NEW";

    
        /**
         * value: "SUCCESS"
         * @const
         */
        "SUCCESS" = "SUCCESS";

    
        /**
         * value: "FAIL"
         * @const
         */
        "FAIL" = "FAIL";

    
        /**
         * value: "REVOKE"
         * @const
         */
        "REVOKE" = "REVOKE";

    
        /**
         * value: "DONT_WANT"
         * @const
         */
        "DONT_WANT" = "DONT_WANT";

    
        /**
         * value: "FAIL_MANUAL"
         * @const
         */
        "FAIL_MANUAL" = "FAIL_MANUAL";

    

    /**
    * Returns a <code>LicenseCheckStatusType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/LicenseCheckStatusType} The enum <code>LicenseCheckStatusType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

