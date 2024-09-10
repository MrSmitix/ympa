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

/// UpdateOfferMappingEntryRequest : Запрос на обновление товаров.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct UpdateOfferMappingEntryRequest {
    /// Информация о товарах в каталоге.
    #[serde(rename = "offerMappingEntries")]
    pub offer_mapping_entries: Vec<models::UpdateOfferMappingEntryDto>,
}

impl UpdateOfferMappingEntryRequest {
    /// Запрос на обновление товаров.
    pub fn new(offer_mapping_entries: Vec<models::UpdateOfferMappingEntryDto>) -> UpdateOfferMappingEntryRequest {
        UpdateOfferMappingEntryRequest {
            offer_mapping_entries,
        }
    }
}

