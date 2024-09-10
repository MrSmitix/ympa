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
    OrderStatsStatusType,
    OrdersStatsCommissionDTO,
    OrdersStatsDeliveryRegionDTO,
    OrdersStatsItemDTO,
    OrdersStatsOrderPaymentType,
    OrdersStatsPaymentDTO,
} from './';

/**
 * Информация о заказе.
 * @export
 * @interface OrdersStatsOrderDTO
 */
export interface OrdersStatsOrderDTO {
    /**
     * Идентификатор заказа.
     * @type {number}
     * @memberof OrdersStatsOrderDTO
     */
    id?: number;
    /**
     * Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
     * @type {string}
     * @memberof OrdersStatsOrderDTO
     */
    creationDate?: string;
    /**
     * Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). 
     * @type {string}
     * @memberof OrdersStatsOrderDTO
     */
    statusUpdateDate?: string;
    /**
     * @type {OrderStatsStatusType}
     * @memberof OrdersStatsOrderDTO
     */
    status?: OrderStatsStatusType;
    /**
     * Идентификатор заказа в информационной системе магазина.
     * @type {string}
     * @memberof OrdersStatsOrderDTO
     */
    partnerOrderId?: string;
    /**
     * @type {OrdersStatsOrderPaymentType}
     * @memberof OrdersStatsOrderDTO
     */
    paymentType?: OrdersStatsOrderPaymentType;
    /**
     * Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
     * @type {boolean}
     * @memberof OrdersStatsOrderDTO
     */
    fake?: boolean;
    /**
     * @type {OrdersStatsDeliveryRegionDTO}
     * @memberof OrdersStatsOrderDTO
     */
    deliveryRegion?: OrdersStatsDeliveryRegionDTO;
    /**
     * Список товаров в заказе после возможных изменений.
     * @type {Array<OrdersStatsItemDTO>}
     * @memberof OrdersStatsOrderDTO
     */
    items: Array<OrdersStatsItemDTO>;
    /**
     * Список товаров в заказе до изменений.
     * @type {Array<OrdersStatsItemDTO>}
     * @memberof OrdersStatsOrderDTO
     */
    initialItems?: Array<OrdersStatsItemDTO> | null;
    /**
     * Информация о денежных переводах по заказу.
     * @type {Array<OrdersStatsPaymentDTO>}
     * @memberof OrdersStatsOrderDTO
     */
    payments: Array<OrdersStatsPaymentDTO>;
    /**
     * Информация о комиссиях за заказ.
     * @type {Array<OrdersStatsCommissionDTO>}
     * @memberof OrdersStatsOrderDTO
     */
    commissions: Array<OrdersStatsCommissionDTO>;
}


