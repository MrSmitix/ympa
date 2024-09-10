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

/// GetOutletsResponse : Ответ на запрос информации о точках продаж.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct GetOutletsResponse {
    /// Информация о точках продаж.
    #[serde(rename = "outlets")]
    pub outlets: Vec<models::FullOutletDto>,
    #[serde(rename = "paging", skip_serializing_if = "Option::is_none")]
    pub paging: Option<Box<models::ScrollingPagerDto>>,
    #[serde(rename = "pager", skip_serializing_if = "Option::is_none")]
    pub pager: Option<Box<models::FlippingPagerDto>>,
}

impl GetOutletsResponse {
    /// Ответ на запрос информации о точках продаж.
    pub fn new(outlets: Vec<models::FullOutletDto>) -> GetOutletsResponse {
        GetOutletsResponse {
            outlets,
            paging: None,
            pager: None,
        }
    }
}

