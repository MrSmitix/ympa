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

/// GetCampaignOffersResultDto : Список товаров в заданном магазине.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct GetCampaignOffersResultDto {
    #[serde(rename = "paging", skip_serializing_if = "Option::is_none")]
    pub paging: Option<Box<models::ScrollingPagerDto>>,
    /// Страница списка товаров.
    #[serde(rename = "offers")]
    pub offers: Vec<models::GetCampaignOfferDto>,
}

impl GetCampaignOffersResultDto {
    /// Список товаров в заданном магазине.
    pub fn new(offers: Vec<models::GetCampaignOfferDto>) -> GetCampaignOffersResultDto {
        GetCampaignOffersResultDto {
            paging: None,
            offers,
        }
    }
}

