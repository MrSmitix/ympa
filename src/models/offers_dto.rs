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

/// OffersDto : Найденные предложения магазина.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct OffersDto {
    /// Список предложений магазина.
    #[serde(rename = "offers")]
    pub offers: Vec<models::OfferDto>,
}

impl OffersDto {
    /// Найденные предложения магазина.
    pub fn new(offers: Vec<models::OfferDto>) -> OffersDto {
        OffersDto {
            offers,
        }
    }
}

