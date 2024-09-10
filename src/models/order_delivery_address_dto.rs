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

/// OrderDeliveryAddressDto : Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). 
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct OrderDeliveryAddressDto {
    /// Страна.  Обязательный параметр. 
    #[serde(rename = "country", skip_serializing_if = "Option::is_none")]
    pub country: Option<String>,
    /// Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). 
    #[serde(rename = "postcode", skip_serializing_if = "Option::is_none")]
    pub postcode: Option<String>,
    /// Город или населенный пункт.  Обязательный параметр. 
    #[serde(rename = "city", skip_serializing_if = "Option::is_none")]
    pub city: Option<String>,
    /// Район.
    #[serde(rename = "district", skip_serializing_if = "Option::is_none")]
    pub district: Option<String>,
    /// Станция метро.
    #[serde(rename = "subway", skip_serializing_if = "Option::is_none")]
    pub subway: Option<String>,
    /// Улица.  Обязательный параметр. 
    #[serde(rename = "street", skip_serializing_if = "Option::is_none")]
    pub street: Option<String>,
    /// Дом или владение.  Обязательный параметр. 
    #[serde(rename = "house", skip_serializing_if = "Option::is_none")]
    pub house: Option<String>,
    /// Корпус или строение.
    #[serde(rename = "block", skip_serializing_if = "Option::is_none")]
    pub block: Option<String>,
    /// Подъезд.
    #[serde(rename = "entrance", skip_serializing_if = "Option::is_none")]
    pub entrance: Option<String>,
    /// Код домофона.
    #[serde(rename = "entryphone", skip_serializing_if = "Option::is_none")]
    pub entryphone: Option<String>,
    /// Этаж.
    #[serde(rename = "floor", skip_serializing_if = "Option::is_none")]
    pub floor: Option<String>,
    /// Квартира или офис.
    #[serde(rename = "apartment", skip_serializing_if = "Option::is_none")]
    pub apartment: Option<String>,
    /// Телефон получателя заказа.  Обязательный параметр. 
    #[serde(rename = "phone", skip_serializing_if = "Option::is_none")]
    pub phone: Option<String>,
    /// Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 
    #[serde(rename = "recipient", skip_serializing_if = "Option::is_none")]
    pub recipient: Option<String>,
    #[serde(rename = "gps", skip_serializing_if = "Option::is_none")]
    pub gps: Option<Box<models::GpsDto>>,
}

impl OrderDeliveryAddressDto {
    /// Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). 
    pub fn new() -> OrderDeliveryAddressDto {
        OrderDeliveryAddressDto {
            country: None,
            postcode: None,
            city: None,
            district: None,
            subway: None,
            street: None,
            house: None,
            block: None,
            entrance: None,
            entryphone: None,
            floor: None,
            apartment: None,
            phone: None,
            recipient: None,
            gps: None,
        }
    }
}

