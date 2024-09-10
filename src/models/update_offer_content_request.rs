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

/// UpdateOfferContentRequest : Запрос на установку новых значений для параметров.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct UpdateOfferContentRequest {
    /// Список товаров с указанными характеристиками.
    #[serde(rename = "offersContent")]
    pub offers_content: Vec<models::OfferContentDto>,
}

impl UpdateOfferContentRequest {
    /// Запрос на установку новых значений для параметров.
    pub fn new(offers_content: Vec<models::OfferContentDto>) -> UpdateOfferContentRequest {
        UpdateOfferContentRequest {
            offers_content,
        }
    }
}

