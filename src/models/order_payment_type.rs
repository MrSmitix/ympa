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

/// OrderPaymentType : Тип оплаты заказа:  * `PREPAID` — оплата при оформлении заказа.  * `POSTPAID` — оплата при получении заказа.  * `UNKNOWN` — неизвестный тип.  Если параметр отсутствует, заказ будет оплачен при получении. 
/// Тип оплаты заказа:  * `PREPAID` — оплата при оформлении заказа.  * `POSTPAID` — оплата при получении заказа.  * `UNKNOWN` — неизвестный тип.  Если параметр отсутствует, заказ будет оплачен при получении. 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum OrderPaymentType {
    #[serde(rename = "PREPAID")]
    Prepaid,
    #[serde(rename = "POSTPAID")]
    Postpaid,
    #[serde(rename = "UNKNOWN")]
    Unknown,

}

impl std::fmt::Display for OrderPaymentType {
    fn fmt(&self, f: &mut std::fmt::Formatter) -> std::fmt::Result {
        match self {
            Self::Prepaid => write!(f, "PREPAID"),
            Self::Postpaid => write!(f, "POSTPAID"),
            Self::Unknown => write!(f, "UNKNOWN"),
        }
    }
}

impl Default for OrderPaymentType {
    fn default() -> OrderPaymentType {
        Self::Prepaid
    }
}

