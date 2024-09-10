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

/// GetBidsRecommendationsResponse : description.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct GetBidsRecommendationsResponse {
    #[serde(rename = "status", skip_serializing_if = "Option::is_none")]
    pub status: Option<models::ApiResponseStatusType>,
    #[serde(rename = "result", skip_serializing_if = "Option::is_none")]
    pub result: Option<Box<models::GetBidsRecommendationsResponseDto>>,
}

impl GetBidsRecommendationsResponse {
    /// description.
    pub fn new() -> GetBidsRecommendationsResponse {
        GetBidsRecommendationsResponse {
            status: None,
            result: None,
        }
    }
}

