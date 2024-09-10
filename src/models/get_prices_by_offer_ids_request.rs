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

/// GetPricesByOfferIdsRequest : Запрос списка цен.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct GetPricesByOfferIdsRequest {
    /// Список SKU.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
    #[serde(rename = "offerIds", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub offer_ids: Option<Option<Vec<String>>>,
}

impl GetPricesByOfferIdsRequest {
    /// Запрос списка цен.
    pub fn new() -> GetPricesByOfferIdsRequest {
        GetPricesByOfferIdsRequest {
            offer_ids: None,
        }
    }
}

