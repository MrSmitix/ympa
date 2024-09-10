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
import OrdersStatsPriceType from './OrdersStatsPriceType';

/**
 * The OrdersStatsPriceDTO model module.
 * @module model/OrdersStatsPriceDTO
 * @version LATEST
 */
class OrdersStatsPriceDTO {
    /**
     * Constructs a new <code>OrdersStatsPriceDTO</code>.
     * Цена или скидки на товар.
     * @alias module:model/OrdersStatsPriceDTO
     */
    constructor() { 
        
        OrdersStatsPriceDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrdersStatsPriceDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrdersStatsPriceDTO} obj Optional instance to populate.
     * @return {module:model/OrdersStatsPriceDTO} The populated <code>OrdersStatsPriceDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrdersStatsPriceDTO();

            if (data.hasOwnProperty('type')) {
                obj['type'] = OrdersStatsPriceType.constructFromObject(data['type']);
            }
            if (data.hasOwnProperty('costPerItem')) {
                obj['costPerItem'] = ApiClient.convertToType(data['costPerItem'], 'Number');
            }
            if (data.hasOwnProperty('total')) {
                obj['total'] = ApiClient.convertToType(data['total'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OrdersStatsPriceDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OrdersStatsPriceDTO</code>.
     */
    static validateJSON(data) {

        return true;
    }


}



/**
 * @member {module:model/OrdersStatsPriceType} type
 */
OrdersStatsPriceDTO.prototype['type'] = undefined;

/**
 * Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. 
 * @member {Number} costPerItem
 */
OrdersStatsPriceDTO.prototype['costPerItem'] = undefined;

/**
 * Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. 
 * @member {Number} total
 */
OrdersStatsPriceDTO.prototype['total'] = undefined;






export default OrdersStatsPriceDTO;

