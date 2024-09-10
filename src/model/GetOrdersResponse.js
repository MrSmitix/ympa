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
import FlippingPagerDTO from './FlippingPagerDTO';
import ForwardScrollingPagerDTO from './ForwardScrollingPagerDTO';
import OrderDTO from './OrderDTO';

/**
 * The GetOrdersResponse model module.
 * @module model/GetOrdersResponse
 * @version LATEST
 */
class GetOrdersResponse {
    /**
     * @member {module:model/FlippingPagerDTO} pager
     * @type {module:model/FlippingPagerDTO}
     */
    pager;
    /**
     * @member {Array.<module:model/OrderDTO>} orders
     * @type {Array.<module:model/OrderDTO>}
     */
    orders;
    /**
     * @member {module:model/ForwardScrollingPagerDTO} paging
     * @type {module:model/ForwardScrollingPagerDTO}
     */
    paging;

    

    /**
     * Constructs a new <code>GetOrdersResponse</code>.
     * Модель для ответа API списка информации по заказам.
     * @alias module:model/GetOrdersResponse
     * @param orders {Array.<module:model/OrderDTO>} Модель заказа. 
     */
    constructor(orders) { 
        
        GetOrdersResponse.initialize(this, orders);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, orders) { 
        obj['orders'] = orders;
    }

    /**
     * Constructs a <code>GetOrdersResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetOrdersResponse} obj Optional instance to populate.
     * @return {module:model/GetOrdersResponse} The populated <code>GetOrdersResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetOrdersResponse();

            if (data.hasOwnProperty('pager')) {
                obj['pager'] = FlippingPagerDTO.constructFromObject(data['pager']);
            }
            if (data.hasOwnProperty('orders')) {
                obj['orders'] = ApiClient.convertToType(data['orders'], [OrderDTO]);
            }
            if (data.hasOwnProperty('paging')) {
                obj['paging'] = ForwardScrollingPagerDTO.constructFromObject(data['paging']);
            }
        }
        return obj;
    }
}



export default GetOrdersResponse;

