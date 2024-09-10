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

/// TariffDto : Информация о тарифах, по которым нужно заплатить за услуги Маркета.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct TariffDto {
    #[serde(rename = "type")]
    pub r#type: models::TariffType,
    /// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
    #[serde(rename = "percent", skip_serializing_if = "Option::is_none")]
    pub percent: Option<f64>,
    /// Значение тарифа в рублях.
    #[serde(rename = "amount")]
    pub amount: f64,
    /// Параметры расчета тарифа.
    #[serde(rename = "parameters")]
    pub parameters: Vec<models::TariffParameterDto>,
}

impl TariffDto {
    /// Информация о тарифах, по которым нужно заплатить за услуги Маркета.
    pub fn new(r#type: models::TariffType, amount: f64, parameters: Vec<models::TariffParameterDto>) -> TariffDto {
        TariffDto {
            r#type,
            percent: None,
            amount,
            parameters,
        }
    }
}

