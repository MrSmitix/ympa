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

/// LanguageType : Язык:  * `RU` — русский.  * `EN` — английский. 
/// Язык:  * `RU` — русский.  * `EN` — английский. 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum LanguageType {
    #[serde(rename = "RU")]
    Ru,
    #[serde(rename = "EN")]
    En,

}

impl std::fmt::Display for LanguageType {
    fn fmt(&self, f: &mut std::fmt::Formatter) -> std::fmt::Result {
        match self {
            Self::Ru => write!(f, "RU"),
            Self::En => write!(f, "EN"),
        }
    }
}

impl Default for LanguageType {
    fn default() -> LanguageType {
        Self::Ru
    }
}

