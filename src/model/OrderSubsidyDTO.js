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
import OrderSubsidyType from './OrderSubsidyType';

/**
 * The OrderSubsidyDTO model module.
 * @module model/OrderSubsidyDTO
 * @version LATEST
 */
class OrderSubsidyDTO {
    /**
     * Constructs a new <code>OrderSubsidyDTO</code>.
     * Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
     * @alias module:model/OrderSubsidyDTO
     */
    constructor() { 
        
        OrderSubsidyDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrderSubsidyDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrderSubsidyDTO} obj Optional instance to populate.
     * @return {module:model/OrderSubsidyDTO} The populated <code>OrderSubsidyDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrderSubsidyDTO();

            if (data.hasOwnProperty('type')) {
                obj['type'] = OrderSubsidyType.constructFromObject(data['type']);
            }
            if (data.hasOwnProperty('amount')) {
                obj['amount'] = ApiClient.convertToType(data['amount'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OrderSubsidyDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OrderSubsidyDTO</code>.
     */
    static validateJSON(data) {

        return true;
    }


}



/**
 * @member {module:model/OrderSubsidyType} type
 */
OrderSubsidyDTO.prototype['type'] = undefined;

/**
 * Сумма субсидии.
 * @member {Number} amount
 */
OrderSubsidyDTO.prototype['amount'] = undefined;






export default OrderSubsidyDTO;

