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

/// SetShipmentPalletsCountRequest : Запрос на передачу количества упаковок в отгрузке.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct SetShipmentPalletsCountRequest {
    /// Количество упаковок в отгрузке.
    #[serde(rename = "placesCount")]
    pub places_count: i32,
}

impl SetShipmentPalletsCountRequest {
    /// Запрос на передачу количества упаковок в отгрузке.
    pub fn new(places_count: i32) -> SetShipmentPalletsCountRequest {
        SetShipmentPalletsCountRequest {
            places_count,
        }
    }
}

