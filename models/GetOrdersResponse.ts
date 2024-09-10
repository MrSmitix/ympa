// tslint:disable
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
 */

import type {
    FlippingPagerDTO,
    ForwardScrollingPagerDTO,
    OrderDTO,
} from './';

/**
 * Модель для ответа API списка информации по заказам.
 * @export
 * @interface GetOrdersResponse
 */
export interface GetOrdersResponse {
    /**
     * @type {FlippingPagerDTO}
     * @memberof GetOrdersResponse
     */
    pager?: FlippingPagerDTO;
    /**
     * Модель заказа. 
     * @type {Array<OrderDTO>}
     * @memberof GetOrdersResponse
     */
    orders: Array<OrderDTO>;
    /**
     * @type {ForwardScrollingPagerDTO}
     * @memberof GetOrdersResponse
     */
    paging?: ForwardScrollingPagerDTO;
}
