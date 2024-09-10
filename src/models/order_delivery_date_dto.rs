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

/// OrderDeliveryDateDto : Информация о новой дате доставки заказа.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct OrderDeliveryDateDto {
    /// Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
    #[serde(rename = "toDate")]
    pub to_date: String,
}

impl OrderDeliveryDateDto {
    /// Информация о новой дате доставки заказа.
    pub fn new(to_date: String) -> OrderDeliveryDateDto {
        OrderDeliveryDateDto {
            to_date,
        }
    }
}

