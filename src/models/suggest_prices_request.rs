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

/// SuggestPricesRequest : Запрос на получение списка цен для продвижения.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct SuggestPricesRequest {
    /// Список товаров.
    #[serde(rename = "offers")]
    pub offers: Vec<models::SuggestOfferPriceDto>,
}

impl SuggestPricesRequest {
    /// Запрос на получение списка цен для продвижения.
    pub fn new(offers: Vec<models::SuggestOfferPriceDto>) -> SuggestPricesRequest {
        SuggestPricesRequest {
            offers,
        }
    }
}

