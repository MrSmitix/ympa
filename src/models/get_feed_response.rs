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

/// GetFeedResponse : Ответ на запрос информации о прайс-листе.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct GetFeedResponse {
    #[serde(rename = "feed", skip_serializing_if = "Option::is_none")]
    pub feed: Option<Box<models::FeedDto>>,
}

impl GetFeedResponse {
    /// Ответ на запрос информации о прайс-листе.
    pub fn new() -> GetFeedResponse {
        GetFeedResponse {
            feed: None,
        }
    }
}

