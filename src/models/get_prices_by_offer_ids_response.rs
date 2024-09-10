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

/// GetPricesByOfferIdsResponse : Ответ на запрос списка цен.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct GetPricesByOfferIdsResponse {
    #[serde(rename = "status", skip_serializing_if = "Option::is_none")]
    pub status: Option<models::ApiResponseStatusType>,
    #[serde(rename = "result", skip_serializing_if = "Option::is_none")]
    pub result: Option<Box<models::OfferPriceByOfferIdsListResponseDto>>,
}

impl GetPricesByOfferIdsResponse {
    /// Ответ на запрос списка цен.
    pub fn new() -> GetPricesByOfferIdsResponse {
        GetPricesByOfferIdsResponse {
            status: None,
            result: None,
        }
    }
}

