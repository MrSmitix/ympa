/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

/// TariffType : Услуга Маркета или дополнительный тариф к услуге размещения:  * `AGENCY_COMMISSION` — прием платежа покупателя.  * `PAYMENT_TRANSFER` — перевод платежа покупателя.  * `STORAGE` — хранение товара на складе Маркета в течение суток.  * `SURPLUS` — хранение излишков на складе Маркета.  * `WITHDRAW` — вывоз товара со склада Маркета.  * `FEE` — размещение товара на Маркете.  * `DELIVERY_TO_CUSTOMER` — доставка покупателю.  * `CROSSREGIONAL_DELIVERY` — доставка в федеральный округ, город или населенный пункт.  * `CROSSREGIONAL_DELIVERY_RETURN` — доставка невыкупов и возвратов.  * `DISPOSAL` — утилизация.  * `SORTING_CENTER_STORAGE` — хранение невыкупов и возвратов.  * `EXPRESS_DELIVERY` — экспресс-доставка покупателю.  * `FF_XDOC_SUPPLY_BOX` — поставка товара через транзитный склад (за короб).  * `FF_XDOC_SUPPLY_PALLET` — поставка товара через транзитный склад (за палету).  * `SORTING` — обработка заказа.  * `MIDDLE_MILE` — средняя миля.  * `RETURN_PROCESSING` — обработка невыкупов и возвратов.  * `EXPRESS_CANCELLED_BY_PARTNER` — отмена заказа с экспресс-доставкой.  * `DELIVERY_TO_CUSTOMER_RETURN` — возврат доставляемого товара на склад.  * `CROSSBORDER_DELIVERY` — доставка из-за рубежа.  * `INTAKE_SORTING_BULKY_CARGO` — сортировка заказов с крупногабаритными товарами, которые Маркет забрал со склада продавца.  * `INTAKE_SORTING_SMALL_GOODS` — сортировка заказов с малогабаритными товарами, которые Маркет забрал со склада продавца.  * `INTAKE_SORTING_DAILY` — организация забора заказов со склада продавца.  * `FF_STORAGE_BILLING` — хранения товаров на складе.  * `CANCELLED_ORDER_FEE_QI` — отмена заказа по вине продавца.  * `LATE_ORDER_EXECUTION_FEE_QI` — несвоевременная отгрузка или доставка.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
/// Услуга Маркета или дополнительный тариф к услуге размещения:  * `AGENCY_COMMISSION` — прием платежа покупателя.  * `PAYMENT_TRANSFER` — перевод платежа покупателя.  * `STORAGE` — хранение товара на складе Маркета в течение суток.  * `SURPLUS` — хранение излишков на складе Маркета.  * `WITHDRAW` — вывоз товара со склада Маркета.  * `FEE` — размещение товара на Маркете.  * `DELIVERY_TO_CUSTOMER` — доставка покупателю.  * `CROSSREGIONAL_DELIVERY` — доставка в федеральный округ, город или населенный пункт.  * `CROSSREGIONAL_DELIVERY_RETURN` — доставка невыкупов и возвратов.  * `DISPOSAL` — утилизация.  * `SORTING_CENTER_STORAGE` — хранение невыкупов и возвратов.  * `EXPRESS_DELIVERY` — экспресс-доставка покупателю.  * `FF_XDOC_SUPPLY_BOX` — поставка товара через транзитный склад (за короб).  * `FF_XDOC_SUPPLY_PALLET` — поставка товара через транзитный склад (за палету).  * `SORTING` — обработка заказа.  * `MIDDLE_MILE` — средняя миля.  * `RETURN_PROCESSING` — обработка невыкупов и возвратов.  * `EXPRESS_CANCELLED_BY_PARTNER` — отмена заказа с экспресс-доставкой.  * `DELIVERY_TO_CUSTOMER_RETURN` — возврат доставляемого товара на склад.  * `CROSSBORDER_DELIVERY` — доставка из-за рубежа.  * `INTAKE_SORTING_BULKY_CARGO` — сортировка заказов с крупногабаритными товарами, которые Маркет забрал со склада продавца.  * `INTAKE_SORTING_SMALL_GOODS` — сортировка заказов с малогабаритными товарами, которые Маркет забрал со склада продавца.  * `INTAKE_SORTING_DAILY` — организация забора заказов со склада продавца.  * `FF_STORAGE_BILLING` — хранения товаров на складе.  * `CANCELLED_ORDER_FEE_QI` — отмена заказа по вине продавца.  * `LATE_ORDER_EXECUTION_FEE_QI` — несвоевременная отгрузка или доставка.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum TariffType {
    #[serde(rename = "AGENCY_COMMISSION")]
    AgencyCommission,
    #[serde(rename = "PAYMENT_TRANSFER")]
    PaymentTransfer,
    #[serde(rename = "STORAGE")]
    Storage,
    #[serde(rename = "WITHDRAW")]
    Withdraw,
    #[serde(rename = "SURPLUS")]
    Surplus,
    #[serde(rename = "FEE")]
    Fee,
    #[serde(rename = "DELIVERY_TO_CUSTOMER")]
    DeliveryToCustomer,
    #[serde(rename = "CROSSREGIONAL_DELIVERY")]
    CrossregionalDelivery,
    #[serde(rename = "CROSSREGIONAL_DELIVERY_RETURN")]
    CrossregionalDeliveryReturn,
    #[serde(rename = "DISPOSAL")]
    Disposal,
    #[serde(rename = "SORTING_CENTER_STORAGE")]
    SortingCenterStorage,
    #[serde(rename = "EXPRESS_DELIVERY")]
    ExpressDelivery,
    #[serde(rename = "FF_XDOC_SUPPLY_BOX")]
    FfXdocSupplyBox,
    #[serde(rename = "FF_XDOC_SUPPLY_PALLET")]
    FfXdocSupplyPallet,
    #[serde(rename = "SORTING")]
    Sorting,
    #[serde(rename = "MIDDLE_MILE")]
    MiddleMile,
    #[serde(rename = "RETURN_PROCESSING")]
    ReturnProcessing,
    #[serde(rename = "EXPRESS_CANCELLED_BY_PARTNER")]
    ExpressCancelledByPartner,
    #[serde(rename = "DELIVERY_TO_CUSTOMER_RETURN")]
    DeliveryToCustomerReturn,
    #[serde(rename = "CROSSBORDER_DELIVERY")]
    CrossborderDelivery,
    #[serde(rename = "INTAKE_SORTING_BULKY_CARGO")]
    IntakeSortingBulkyCargo,
    #[serde(rename = "INTAKE_SORTING_SMALL_GOODS")]
    IntakeSortingSmallGoods,
    #[serde(rename = "INTAKE_SORTING_DAILY")]
    IntakeSortingDaily,
    #[serde(rename = "FF_STORAGE_BILLING")]
    FfStorageBilling,
    #[serde(rename = "CANCELLED_ORDER_FEE_QI")]
    CancelledOrderFeeQi,
    #[serde(rename = "LATE_ORDER_EXECUTION_FEE_QI")]
    LateOrderExecutionFeeQi,

}

impl std::fmt::Display for TariffType {
    fn fmt(&self, f: &mut std::fmt::Formatter) -> std::fmt::Result {
        match self {
            Self::AgencyCommission => write!(f, "AGENCY_COMMISSION"),
            Self::PaymentTransfer => write!(f, "PAYMENT_TRANSFER"),
            Self::Storage => write!(f, "STORAGE"),
            Self::Withdraw => write!(f, "WITHDRAW"),
            Self::Surplus => write!(f, "SURPLUS"),
            Self::Fee => write!(f, "FEE"),
            Self::DeliveryToCustomer => write!(f, "DELIVERY_TO_CUSTOMER"),
            Self::CrossregionalDelivery => write!(f, "CROSSREGIONAL_DELIVERY"),
            Self::CrossregionalDeliveryReturn => write!(f, "CROSSREGIONAL_DELIVERY_RETURN"),
            Self::Disposal => write!(f, "DISPOSAL"),
            Self::SortingCenterStorage => write!(f, "SORTING_CENTER_STORAGE"),
            Self::ExpressDelivery => write!(f, "EXPRESS_DELIVERY"),
            Self::FfXdocSupplyBox => write!(f, "FF_XDOC_SUPPLY_BOX"),
            Self::FfXdocSupplyPallet => write!(f, "FF_XDOC_SUPPLY_PALLET"),
            Self::Sorting => write!(f, "SORTING"),
            Self::MiddleMile => write!(f, "MIDDLE_MILE"),
            Self::ReturnProcessing => write!(f, "RETURN_PROCESSING"),
            Self::ExpressCancelledByPartner => write!(f, "EXPRESS_CANCELLED_BY_PARTNER"),
            Self::DeliveryToCustomerReturn => write!(f, "DELIVERY_TO_CUSTOMER_RETURN"),
            Self::CrossborderDelivery => write!(f, "CROSSBORDER_DELIVERY"),
            Self::IntakeSortingBulkyCargo => write!(f, "INTAKE_SORTING_BULKY_CARGO"),
            Self::IntakeSortingSmallGoods => write!(f, "INTAKE_SORTING_SMALL_GOODS"),
            Self::IntakeSortingDaily => write!(f, "INTAKE_SORTING_DAILY"),
            Self::FfStorageBilling => write!(f, "FF_STORAGE_BILLING"),
            Self::CancelledOrderFeeQi => write!(f, "CANCELLED_ORDER_FEE_QI"),
            Self::LateOrderExecutionFeeQi => write!(f, "LATE_ORDER_EXECUTION_FEE_QI"),
        }
    }
}

impl Default for TariffType {
    fn default() -> TariffType {
        Self::AgencyCommission
    }
}

