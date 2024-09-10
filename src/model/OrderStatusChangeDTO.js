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
import OrderStatusChangeDeliveryDTO from './OrderStatusChangeDeliveryDTO';
import OrderStatusType from './OrderStatusType';
import OrderSubstatusType from './OrderSubstatusType';

/**
 * The OrderStatusChangeDTO model module.
 * @module model/OrderStatusChangeDTO
 * @version LATEST
 */
class OrderStatusChangeDTO {
    /**
     * @member {module:model/OrderStatusType} status
     * @type {module:model/OrderStatusType}
     */
    status;
    /**
     * @member {module:model/OrderSubstatusType} substatus
     * @type {module:model/OrderSubstatusType}
     */
    substatus;
    /**
     * @member {module:model/OrderStatusChangeDeliveryDTO} delivery
     * @type {module:model/OrderStatusChangeDeliveryDTO}
     */
    delivery;

    

    /**
     * Constructs a new <code>OrderStatusChangeDTO</code>.
     * Заказ.
     * @alias module:model/OrderStatusChangeDTO
     * @param status {module:model/OrderStatusType} 
     */
    constructor(status) { 
        
        OrderStatusChangeDTO.initialize(this, status);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, status) { 
        obj['status'] = status;
    }

    /**
     * Constructs a <code>OrderStatusChangeDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrderStatusChangeDTO} obj Optional instance to populate.
     * @return {module:model/OrderStatusChangeDTO} The populated <code>OrderStatusChangeDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrderStatusChangeDTO();

            if (data.hasOwnProperty('status')) {
                obj['status'] = OrderStatusType.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('substatus')) {
                obj['substatus'] = OrderSubstatusType.constructFromObject(data['substatus']);
            }
            if (data.hasOwnProperty('delivery')) {
                obj['delivery'] = OrderStatusChangeDeliveryDTO.constructFromObject(data['delivery']);
            }
        }
        return obj;
    }
}



export default OrderStatusChangeDTO;

