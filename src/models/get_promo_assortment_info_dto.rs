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

/// GetPromoAssortmentInfoDto : Информация о товарах в акции.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct GetPromoAssortmentInfoDto {
    /// Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
    #[serde(rename = "activeOffers")]
    pub active_offers: i32,
    /// Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. 
    #[serde(rename = "potentialOffers", skip_serializing_if = "Option::is_none")]
    pub potential_offers: Option<i32>,
    /// Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. 
    #[serde(rename = "processing", skip_serializing_if = "Option::is_none")]
    pub processing: Option<bool>,
}

impl GetPromoAssortmentInfoDto {
    /// Информация о товарах в акции.
    pub fn new(active_offers: i32) -> GetPromoAssortmentInfoDto {
        GetPromoAssortmentInfoDto {
            active_offers,
            potential_offers: None,
            processing: None,
        }
    }
}

