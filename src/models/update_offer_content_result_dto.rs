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

/// UpdateOfferContentResultDto : Ошибки и предупреждения, которые появились из-за переданных характеристик.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct UpdateOfferContentResultDto {
    /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    #[serde(rename = "offerId")]
    pub offer_id: String,
    /// Ошибки — информация в каталоге не обновится.
    #[serde(rename = "errors", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub errors: Option<Option<Vec<models::OfferContentErrorDto>>>,
    /// Предупреждения — информация в каталоге обновится.
    #[serde(rename = "warnings", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Option<Vec<models::OfferContentErrorDto>>>,
}

impl UpdateOfferContentResultDto {
    /// Ошибки и предупреждения, которые появились из-за переданных характеристик.
    pub fn new(offer_id: String) -> UpdateOfferContentResultDto {
        UpdateOfferContentResultDto {
            offer_id,
            errors: None,
            warnings: None,
        }
    }
}

