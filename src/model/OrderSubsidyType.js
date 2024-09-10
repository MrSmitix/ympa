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
* Enum class OrderSubsidyType.
* @enum {}
* @readonly
*/
export default class OrderSubsidyType {
    
        /**
         * value: "YANDEX_CASHBACK"
         * @const
         */
        "YANDEX_CASHBACK" = "YANDEX_CASHBACK";

    
        /**
         * value: "SUBSIDY"
         * @const
         */
        "SUBSIDY" = "SUBSIDY";

    
        /**
         * value: "DELIVERY"
         * @const
         */
        "DELIVERY" = "DELIVERY";

    

    /**
    * Returns a <code>OrderSubsidyType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/OrderSubsidyType} The enum <code>OrderSubsidyType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

