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

/// GetBidsInfoResponseDto : Список товаров с указанными ставками.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct GetBidsInfoResponseDto {
    /// Страница списка товаров.
    #[serde(rename = "bids")]
    pub bids: Vec<models::SkuBidItemDto>,
    #[serde(rename = "paging", skip_serializing_if = "Option::is_none")]
    pub paging: Option<Box<models::ForwardScrollingPagerDto>>,
}

impl GetBidsInfoResponseDto {
    /// Список товаров с указанными ставками.
    pub fn new(bids: Vec<models::SkuBidItemDto>) -> GetBidsInfoResponseDto {
        GetBidsInfoResponseDto {
            bids,
            paging: None,
        }
    }
}

