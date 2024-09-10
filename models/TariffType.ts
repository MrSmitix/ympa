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

/**
 * Услуга Маркета или дополнительный тариф к услуге размещения:  * `AGENCY_COMMISSION` — прием платежа покупателя.  * `PAYMENT_TRANSFER` — перевод платежа покупателя.  * `STORAGE` — хранение товара на складе Маркета в течение суток.  * `SURPLUS` — хранение излишков на складе Маркета.  * `WITHDRAW` — вывоз товара со склада Маркета.  * `FEE` — размещение товара на Маркете.  * `DELIVERY_TO_CUSTOMER` — доставка покупателю.  * `CROSSREGIONAL_DELIVERY` — доставка в федеральный округ, город или населенный пункт.  * `CROSSREGIONAL_DELIVERY_RETURN` — доставка невыкупов и возвратов.  * `DISPOSAL` — утилизация.  * `SORTING_CENTER_STORAGE` — хранение невыкупов и возвратов.  * `EXPRESS_DELIVERY` — экспресс-доставка покупателю.  * `FF_XDOC_SUPPLY_BOX` — поставка товара через транзитный склад (за короб).  * `FF_XDOC_SUPPLY_PALLET` — поставка товара через транзитный склад (за палету).  * `SORTING` — обработка заказа.  * `MIDDLE_MILE` — средняя миля.  * `RETURN_PROCESSING` — обработка невыкупов и возвратов.  * `EXPRESS_CANCELLED_BY_PARTNER` — отмена заказа с экспресс-доставкой.  * `DELIVERY_TO_CUSTOMER_RETURN` — возврат доставляемого товара на склад.  * `CROSSBORDER_DELIVERY` — доставка из-за рубежа.  * `INTAKE_SORTING_BULKY_CARGO` — сортировка заказов с крупногабаритными товарами, которые Маркет забрал со склада продавца.  * `INTAKE_SORTING_SMALL_GOODS` — сортировка заказов с малогабаритными товарами, которые Маркет забрал со склада продавца.  * `INTAKE_SORTING_DAILY` — организация забора заказов со склада продавца.  * `FF_STORAGE_BILLING` — хранения товаров на складе.  * `CANCELLED_ORDER_FEE_QI` — отмена заказа по вине продавца.  * `LATE_ORDER_EXECUTION_FEE_QI` — несвоевременная отгрузка или доставка.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
 * @export
 * @enum {string}
 */
export enum TariffType {
    AgencyCommission = 'AGENCY_COMMISSION',
    PaymentTransfer = 'PAYMENT_TRANSFER',
    Storage = 'STORAGE',
    Withdraw = 'WITHDRAW',
    Surplus = 'SURPLUS',
    Fee = 'FEE',
    DeliveryToCustomer = 'DELIVERY_TO_CUSTOMER',
    CrossregionalDelivery = 'CROSSREGIONAL_DELIVERY',
    CrossregionalDeliveryReturn = 'CROSSREGIONAL_DELIVERY_RETURN',
    Disposal = 'DISPOSAL',
    SortingCenterStorage = 'SORTING_CENTER_STORAGE',
    ExpressDelivery = 'EXPRESS_DELIVERY',
    FfXdocSupplyBox = 'FF_XDOC_SUPPLY_BOX',
    FfXdocSupplyPallet = 'FF_XDOC_SUPPLY_PALLET',
    Sorting = 'SORTING',
    MiddleMile = 'MIDDLE_MILE',
    ReturnProcessing = 'RETURN_PROCESSING',
    ExpressCancelledByPartner = 'EXPRESS_CANCELLED_BY_PARTNER',
    DeliveryToCustomerReturn = 'DELIVERY_TO_CUSTOMER_RETURN',
    CrossborderDelivery = 'CROSSBORDER_DELIVERY',
    IntakeSortingBulkyCargo = 'INTAKE_SORTING_BULKY_CARGO',
    IntakeSortingSmallGoods = 'INTAKE_SORTING_SMALL_GOODS',
    IntakeSortingDaily = 'INTAKE_SORTING_DAILY',
    FfStorageBilling = 'FF_STORAGE_BILLING',
    CancelledOrderFeeQi = 'CANCELLED_ORDER_FEE_QI',
    LateOrderExecutionFeeQi = 'LATE_ORDER_EXECUTION_FEE_QI'
}

