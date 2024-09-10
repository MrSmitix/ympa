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
* Enum class OrderDeliveryType.
* @enum {}
* @readonly
*/
export default class OrderDeliveryType {
    
        /**
         * value: "DELIVERY"
         * @const
         */
        "DELIVERY" = "DELIVERY";

    
        /**
         * value: "PICKUP"
         * @const
         */
        "PICKUP" = "PICKUP";

    
        /**
         * value: "POST"
         * @const
         */
        "POST" = "POST";

    
        /**
         * value: "DIGITAL"
         * @const
         */
        "DIGITAL" = "DIGITAL";

    
        /**
         * value: "UNKNOWN"
         * @const
         */
        "UNKNOWN" = "UNKNOWN";

    

    /**
    * Returns a <code>OrderDeliveryType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/OrderDeliveryType} The enum <code>OrderDeliveryType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

