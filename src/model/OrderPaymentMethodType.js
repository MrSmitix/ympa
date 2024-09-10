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
* Enum class OrderPaymentMethodType.
* @enum {}
* @readonly
*/
export default class OrderPaymentMethodType {
    
        /**
         * value: "CASH_ON_DELIVERY"
         * @const
         */
        "CASH_ON_DELIVERY" = "CASH_ON_DELIVERY";

    
        /**
         * value: "CARD_ON_DELIVERY"
         * @const
         */
        "CARD_ON_DELIVERY" = "CARD_ON_DELIVERY";

    
        /**
         * value: "BOUND_CARD_ON_DELIVERY"
         * @const
         */
        "BOUND_CARD_ON_DELIVERY" = "BOUND_CARD_ON_DELIVERY";

    
        /**
         * value: "YANDEX"
         * @const
         */
        "YANDEX" = "YANDEX";

    
        /**
         * value: "APPLE_PAY"
         * @const
         */
        "APPLE_PAY" = "APPLE_PAY";

    
        /**
         * value: "EXTERNAL_CERTIFICATE"
         * @const
         */
        "EXTERNAL_CERTIFICATE" = "EXTERNAL_CERTIFICATE";

    
        /**
         * value: "CREDIT"
         * @const
         */
        "CREDIT" = "CREDIT";

    
        /**
         * value: "GOOGLE_PAY"
         * @const
         */
        "GOOGLE_PAY" = "GOOGLE_PAY";

    
        /**
         * value: "TINKOFF_CREDIT"
         * @const
         */
        "TINKOFF_CREDIT" = "TINKOFF_CREDIT";

    
        /**
         * value: "SBP"
         * @const
         */
        "SBP" = "SBP";

    
        /**
         * value: "TINKOFF_INSTALLMENTS"
         * @const
         */
        "TINKOFF_INSTALLMENTS" = "TINKOFF_INSTALLMENTS";

    
        /**
         * value: "B2B_ACCOUNT_PREPAYMENT"
         * @const
         */
        "B2B_ACCOUNT_PREPAYMENT" = "B2B_ACCOUNT_PREPAYMENT";

    
        /**
         * value: "B2B_ACCOUNT_POSTPAYMENT"
         * @const
         */
        "B2B_ACCOUNT_POSTPAYMENT" = "B2B_ACCOUNT_POSTPAYMENT";

    
        /**
         * value: "UNKNOWN"
         * @const
         */
        "UNKNOWN" = "UNKNOWN";

    

    /**
    * Returns a <code>OrderPaymentMethodType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/OrderPaymentMethodType} The enum <code>OrderPaymentMethodType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

