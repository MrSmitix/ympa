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

/// RegionalModelInfoDto : Региональная информация.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct RegionalModelInfoDto {
    #[serde(rename = "currency", skip_serializing_if = "Option::is_none")]
    pub currency: Option<models::CurrencyType>,
    /// Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
    #[serde(rename = "regionId", skip_serializing_if = "Option::is_none")]
    pub region_id: Option<i64>,
}

impl RegionalModelInfoDto {
    /// Региональная информация.
    pub fn new() -> RegionalModelInfoDto {
        RegionalModelInfoDto {
            currency: None,
            region_id: None,
        }
    }
}

