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
* Enum class OrdersStatsStockType.
* @enum {}
* @readonly
*/
export default class OrdersStatsStockType {
    
        /**
         * value: "FIT"
         * @const
         */
        "FIT" = "FIT";

    
        /**
         * value: "FREEZE"
         * @const
         */
        "FREEZE" = "FREEZE";

    
        /**
         * value: "AVAILABLE"
         * @const
         */
        "AVAILABLE" = "AVAILABLE";

    
        /**
         * value: "QUARANTINE"
         * @const
         */
        "QUARANTINE" = "QUARANTINE";

    
        /**
         * value: "UTILIZATION"
         * @const
         */
        "UTILIZATION" = "UTILIZATION";

    
        /**
         * value: "DEFECT"
         * @const
         */
        "DEFECT" = "DEFECT";

    
        /**
         * value: "EXPIRED"
         * @const
         */
        "EXPIRED" = "EXPIRED";

    

    /**
    * Returns a <code>OrdersStatsStockType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/OrdersStatsStockType} The enum <code>OrdersStatsStockType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

