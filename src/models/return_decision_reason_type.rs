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

/// ReturnDecisionReasonType : Причины возврата:  * `BAD_QUALITY` — бракованный товар (есть недостатки).  * `DO_NOT_FIT` — товар не подошел.  * `WRONG_ITEM` — привезли не тот товар.  * `DAMAGE_DELIVERY` — товар поврежден при доставке.  * `LOYALTY_FAIL` — невозможно установить виновного в браке/пересорте.  * `CONTENT_FAIL` — ошибочное описание товара по вине Маркета.  * `UNKNOWN` — причина не известна. 
/// Причины возврата:  * `BAD_QUALITY` — бракованный товар (есть недостатки).  * `DO_NOT_FIT` — товар не подошел.  * `WRONG_ITEM` — привезли не тот товар.  * `DAMAGE_DELIVERY` — товар поврежден при доставке.  * `LOYALTY_FAIL` — невозможно установить виновного в браке/пересорте.  * `CONTENT_FAIL` — ошибочное описание товара по вине Маркета.  * `UNKNOWN` — причина не известна. 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum ReturnDecisionReasonType {
    #[serde(rename = "BAD_QUALITY")]
    BadQuality,
    #[serde(rename = "DOES_NOT_FIT")]
    DoesNotFit,
    #[serde(rename = "WRONG_ITEM")]
    WrongItem,
    #[serde(rename = "DAMAGE_DELIVERY")]
    DamageDelivery,
    #[serde(rename = "LOYALTY_FAIL")]
    LoyaltyFail,
    #[serde(rename = "CONTENT_FAIL")]
    ContentFail,
    #[serde(rename = "UNKNOWN")]
    Unknown,

}

impl std::fmt::Display for ReturnDecisionReasonType {
    fn fmt(&self, f: &mut std::fmt::Formatter) -> std::fmt::Result {
        match self {
            Self::BadQuality => write!(f, "BAD_QUALITY"),
            Self::DoesNotFit => write!(f, "DOES_NOT_FIT"),
            Self::WrongItem => write!(f, "WRONG_ITEM"),
            Self::DamageDelivery => write!(f, "DAMAGE_DELIVERY"),
            Self::LoyaltyFail => write!(f, "LOYALTY_FAIL"),
            Self::ContentFail => write!(f, "CONTENT_FAIL"),
            Self::Unknown => write!(f, "UNKNOWN"),
        }
    }
}

impl Default for ReturnDecisionReasonType {
    fn default() -> ReturnDecisionReasonType {
        Self::BadQuality
    }
}

