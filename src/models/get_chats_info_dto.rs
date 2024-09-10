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

/// GetChatsInfoDto : Список чатов.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct GetChatsInfoDto {
    /// Информация о чатах.
    #[serde(rename = "chats")]
    pub chats: Vec<models::GetChatInfoDto>,
    #[serde(rename = "paging", skip_serializing_if = "Option::is_none")]
    pub paging: Option<Box<models::ForwardScrollingPagerDto>>,
}

impl GetChatsInfoDto {
    /// Список чатов.
    pub fn new(chats: Vec<models::GetChatInfoDto>) -> GetChatsInfoDto {
        GetChatsInfoDto {
            chats,
            paging: None,
        }
    }
}

