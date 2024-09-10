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
* Enum class OfferAvailabilityStatusType.
* @enum {}
* @readonly
*/
export default class OfferAvailabilityStatusType {
    
        /**
         * value: "ACTIVE"
         * @const
         */
        "ACTIVE" = "ACTIVE";

    
        /**
         * value: "INACTIVE"
         * @const
         */
        "INACTIVE" = "INACTIVE";

    
        /**
         * value: "DELISTED"
         * @const
         */
        "DELISTED" = "DELISTED";

    

    /**
    * Returns a <code>OfferAvailabilityStatusType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/OfferAvailabilityStatusType} The enum <code>OfferAvailabilityStatusType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

