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

/// GetCampaignLoginsResponse : Ответ на запрос списка логинов, связанных с магазином.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct GetCampaignLoginsResponse {
    /// Список логинов.
    #[serde(rename = "logins")]
    pub logins: Vec<String>,
}

impl GetCampaignLoginsResponse {
    /// Ответ на запрос списка логинов, связанных с магазином.
    pub fn new(logins: Vec<String>) -> GetCampaignLoginsResponse {
        GetCampaignLoginsResponse {
            logins,
        }
    }
}

