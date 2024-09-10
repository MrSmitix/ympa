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

/// UpdatePriceWithDiscountDto : Цена с указанием скидки.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct UpdatePriceWithDiscountDto {
    /// Значение.
    #[serde(rename = "value")]
    pub value: f64,
    #[serde(rename = "currencyId")]
    pub currency_id: models::CurrencyType,
    /// Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
    #[serde(rename = "discountBase", skip_serializing_if = "Option::is_none")]
    pub discount_base: Option<f64>,
}

impl UpdatePriceWithDiscountDto {
    /// Цена с указанием скидки.
    pub fn new(value: f64, currency_id: models::CurrencyType) -> UpdatePriceWithDiscountDto {
        UpdatePriceWithDiscountDto {
            value,
            currency_id,
            discount_base: None,
        }
    }
}

