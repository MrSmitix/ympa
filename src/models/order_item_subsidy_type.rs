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

/// OrderItemSubsidyType : Тип субсидии:  * `YANDEX_CASHBACK` — скидка по подписке Яндекс Плюс.  * `SUBSIDY` — скидка Маркета (по акциям, промокодам, купонам и т. д.). 
/// Тип субсидии:  * `YANDEX_CASHBACK` — скидка по подписке Яндекс Плюс.  * `SUBSIDY` — скидка Маркета (по акциям, промокодам, купонам и т. д.). 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum OrderItemSubsidyType {
    #[serde(rename = "YANDEX_CASHBACK")]
    YandexCashback,
    #[serde(rename = "SUBSIDY")]
    Subsidy,

}

impl std::fmt::Display for OrderItemSubsidyType {
    fn fmt(&self, f: &mut std::fmt::Formatter) -> std::fmt::Result {
        match self {
            Self::YandexCashback => write!(f, "YANDEX_CASHBACK"),
            Self::Subsidy => write!(f, "SUBSIDY"),
        }
    }
}

impl Default for OrderItemSubsidyType {
    fn default() -> OrderItemSubsidyType {
        Self::YandexCashback
    }
}

