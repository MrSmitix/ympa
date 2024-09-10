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

/// OfferProcessingNoteDto : Причины, по которым товар не прошел модерацию.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct OfferProcessingNoteDto {
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub r#type: Option<models::OfferProcessingNoteType>,
    /// Дополнительная информация о причине отклонения товара. 
    #[serde(rename = "payload", skip_serializing_if = "Option::is_none")]
    pub payload: Option<String>,
}

impl OfferProcessingNoteDto {
    /// Причины, по которым товар не прошел модерацию.
    pub fn new() -> OfferProcessingNoteDto {
        OfferProcessingNoteDto {
            r#type: None,
            payload: None,
        }
    }
}

