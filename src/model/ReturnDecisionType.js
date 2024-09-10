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
* Enum class ReturnDecisionType.
* @enum {}
* @readonly
*/
export default class ReturnDecisionType {
    
        /**
         * value: "REFUND_MONEY"
         * @const
         */
        "REFUND_MONEY" = "REFUND_MONEY";

    
        /**
         * value: "REFUND_MONEY_INCLUDING_SHIPMENT"
         * @const
         */
        "REFUND_MONEY_INCLUDING_SHIPMENT" = "REFUND_MONEY_INCLUDING_SHIPMENT";

    
        /**
         * value: "REPAIR"
         * @const
         */
        "REPAIR" = "REPAIR";

    
        /**
         * value: "REPLACE"
         * @const
         */
        "REPLACE" = "REPLACE";

    
        /**
         * value: "SEND_TO_EXAMINATION"
         * @const
         */
        "SEND_TO_EXAMINATION" = "SEND_TO_EXAMINATION";

    
        /**
         * value: "DECLINE_REFUND"
         * @const
         */
        "DECLINE_REFUND" = "DECLINE_REFUND";

    
        /**
         * value: "OTHER_DECISION"
         * @const
         */
        "OTHER_DECISION" = "OTHER_DECISION";

    
        /**
         * value: "UNKNOWN"
         * @const
         */
        "UNKNOWN" = "UNKNOWN";

    

    /**
    * Returns a <code>ReturnDecisionType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ReturnDecisionType} The enum <code>ReturnDecisionType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

