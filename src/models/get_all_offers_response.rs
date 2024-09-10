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

/// GetAllOffersResponse : Список предложений.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct GetAllOffersResponse {
    /// Список предложений магазина.
    #[serde(rename = "offers")]
    pub offers: Vec<models::OfferDto>,
}

impl GetAllOffersResponse {
    /// Список предложений.
    pub fn new(offers: Vec<models::OfferDto>) -> GetAllOffersResponse {
        GetAllOffersResponse {
            offers,
        }
    }
}

