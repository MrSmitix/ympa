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
 * The OrderDeliveryDateDTO model module.
 * @module model/OrderDeliveryDateDTO
 * @version LATEST
 */
class OrderDeliveryDateDTO {
    /**
     * @member {Date} toDate
     * @type {Date}
     */
    toDate;

    

    /**
     * Constructs a new <code>OrderDeliveryDateDTO</code>.
     * Информация о новой дате доставки заказа.
     * @alias module:model/OrderDeliveryDateDTO
     * @param toDate {Date} Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
     */
    constructor(toDate) { 
        
        OrderDeliveryDateDTO.initialize(this, toDate);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, toDate) { 
        obj['toDate'] = toDate;
    }

    /**
     * Constructs a <code>OrderDeliveryDateDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrderDeliveryDateDTO} obj Optional instance to populate.
     * @return {module:model/OrderDeliveryDateDTO} The populated <code>OrderDeliveryDateDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrderDeliveryDateDTO();

            if (data.hasOwnProperty('toDate')) {
                obj['toDate'] = ApiClient.convertToType(data['toDate'], 'Date');
            }
        }
        return obj;
    }
}



export default OrderDeliveryDateDTO;

