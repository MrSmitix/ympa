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

/// UpdateStockItemDto : Информация об остатках товара. 
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct UpdateStockItemDto {
    /// Количество доступного товара. 
    #[serde(rename = "count")]
    pub count: i64,
    /// Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
    #[serde(rename = "updatedAt", skip_serializing_if = "Option::is_none")]
    pub updated_at: Option<String>,
}

impl UpdateStockItemDto {
    /// Информация об остатках товара. 
    pub fn new(count: i64) -> UpdateStockItemDto {
        UpdateStockItemDto {
            count,
            updated_at: None,
        }
    }
}

