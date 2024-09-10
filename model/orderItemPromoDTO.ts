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
import { OrderPromoType } from './orderPromoType';


/**
 * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 */
export interface OrderItemPromoDTO { 
    type: OrderPromoType;
    /**
     * Размер пользовательской скидки в валюте покупателя. 
     */
    discount?: number;
    /**
     * Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
     */
    subsidy?: number;
    /**
     * Идентификатор акции поставщика. 
     */
    shopPromoId?: string;
    /**
     * Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. 
     */
    marketPromoId?: string;
}
export namespace OrderItemPromoDTO {
}
