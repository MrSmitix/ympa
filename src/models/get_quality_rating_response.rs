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

/// GetQualityRatingResponse : Информация об индексе качества магазинов.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct GetQualityRatingResponse {
    #[serde(rename = "status", skip_serializing_if = "Option::is_none")]
    pub status: Option<models::ApiResponseStatusType>,
    #[serde(rename = "result", skip_serializing_if = "Option::is_none")]
    pub result: Option<Box<models::CampaignsQualityRatingDto>>,
}

impl GetQualityRatingResponse {
    /// Информация об индексе качества магазинов.
    pub fn new() -> GetQualityRatingResponse {
        GetQualityRatingResponse {
            status: None,
            result: None,
        }
    }
}

