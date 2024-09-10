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


/**
 * Услуга Маркета:  * `AGENCY_COMMISSION` — прием платежа покупателя.  * `PAYMENT_TRANSFER` — перевод платежа покупателя.  * `FEE` — размещение товара на Маркете.  * `DELIVERY_TO_CUSTOMER` — доставка покупателю.  * `CROSSREGIONAL_DELIVERY` — доставка в федеральный округ, город или населенный пункт.  * `EXPRESS_DELIVERY` — экспресс-доставка покупателю.  * `SORTING` — обработка заказа.  * `MIDDLE_MILE` — средняя миля.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
 */
export type CalculatedTariffType = 'AGENCY_COMMISSION' | 'PAYMENT_TRANSFER' | 'FEE' | 'DELIVERY_TO_CUSTOMER' | 'CROSSREGIONAL_DELIVERY' | 'EXPRESS_DELIVERY' | 'SORTING' | 'MIDDLE_MILE';

export const CalculatedTariffType = {
    AgencyCommission: 'AGENCY_COMMISSION' as CalculatedTariffType,
    PaymentTransfer: 'PAYMENT_TRANSFER' as CalculatedTariffType,
    Fee: 'FEE' as CalculatedTariffType,
    DeliveryToCustomer: 'DELIVERY_TO_CUSTOMER' as CalculatedTariffType,
    CrossregionalDelivery: 'CROSSREGIONAL_DELIVERY' as CalculatedTariffType,
    ExpressDelivery: 'EXPRESS_DELIVERY' as CalculatedTariffType,
    Sorting: 'SORTING' as CalculatedTariffType,
    MiddleMile: 'MIDDLE_MILE' as CalculatedTariffType
}
