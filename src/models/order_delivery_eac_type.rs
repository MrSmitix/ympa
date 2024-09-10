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

/// OrderDeliveryEacType : Тип кода подтверждения ЭАПП:  * `MERCHANT_TO_COURIER` — продавец передает код курьеру.  * `COURIER_TO_MERCHANT` — курьер передает код продавцу.  * `CHECKING_BY_MERCHANT` — продавец проверяет код на своей стороне. 
/// Тип кода подтверждения ЭАПП:  * `MERCHANT_TO_COURIER` — продавец передает код курьеру.  * `COURIER_TO_MERCHANT` — курьер передает код продавцу.  * `CHECKING_BY_MERCHANT` — продавец проверяет код на своей стороне. 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum OrderDeliveryEacType {
    #[serde(rename = "MERCHANT_TO_COURIER")]
    MerchantToCourier,
    #[serde(rename = "COURIER_TO_MERCHANT")]
    CourierToMerchant,
    #[serde(rename = "CHECKING_BY_MERCHANT")]
    CheckingByMerchant,

}

impl std::fmt::Display for OrderDeliveryEacType {
    fn fmt(&self, f: &mut std::fmt::Formatter) -> std::fmt::Result {
        match self {
            Self::MerchantToCourier => write!(f, "MERCHANT_TO_COURIER"),
            Self::CourierToMerchant => write!(f, "COURIER_TO_MERCHANT"),
            Self::CheckingByMerchant => write!(f, "CHECKING_BY_MERCHANT"),
        }
    }
}

impl Default for OrderDeliveryEacType {
    fn default() -> OrderDeliveryEacType {
        Self::MerchantToCourier
    }
}

