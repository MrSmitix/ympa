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

    /**
     * Validates the JSON data with respect to <code>OrderDeliveryDateDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OrderDeliveryDateDTO</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of OrderDeliveryDateDTO.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }

        return true;
    }


}

OrderDeliveryDateDTO.RequiredProperties = ["toDate"];

/**
 * Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
 * @member {Date} toDate
 */
OrderDeliveryDateDTO.prototype['toDate'] = undefined;






export default OrderDeliveryDateDTO;

