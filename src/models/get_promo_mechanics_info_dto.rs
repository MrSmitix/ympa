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

/// GetPromoMechanicsInfoDto : Информация о типе акции.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct GetPromoMechanicsInfoDto {
    #[serde(rename = "type")]
    pub r#type: models::MechanicsType,
    #[serde(rename = "promocodeInfo", skip_serializing_if = "Option::is_none")]
    pub promocode_info: Option<Box<models::GetPromoPromocodeInfoDto>>,
}

impl GetPromoMechanicsInfoDto {
    /// Информация о типе акции.
    pub fn new(r#type: models::MechanicsType) -> GetPromoMechanicsInfoDto {
        GetPromoMechanicsInfoDto {
            r#type,
            promocode_info: None,
        }
    }
}

