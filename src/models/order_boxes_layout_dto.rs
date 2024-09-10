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

/// OrderBoxesLayoutDto : Распределение товаров по коробкам.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct OrderBoxesLayoutDto {
    /// Список коробок.
    #[serde(rename = "boxes")]
    pub boxes: Vec<models::EnrichedOrderBoxLayoutDto>,
}

impl OrderBoxesLayoutDto {
    /// Распределение товаров по коробкам.
    pub fn new(boxes: Vec<models::EnrichedOrderBoxLayoutDto>) -> OrderBoxesLayoutDto {
        OrderBoxesLayoutDto {
            boxes,
        }
    }
}

