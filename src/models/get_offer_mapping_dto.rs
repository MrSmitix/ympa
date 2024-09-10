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

/// GetOfferMappingDto : Информация о товаре.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct GetOfferMappingDto {
    #[serde(rename = "offer", skip_serializing_if = "Option::is_none")]
    pub offer: Option<Box<models::GetOfferDto>>,
    #[serde(rename = "mapping", skip_serializing_if = "Option::is_none")]
    pub mapping: Option<Box<models::GetMappingDto>>,
}

impl GetOfferMappingDto {
    /// Информация о товаре.
    pub fn new() -> GetOfferMappingDto {
        GetOfferMappingDto {
            offer: None,
            mapping: None,
        }
    }
}

