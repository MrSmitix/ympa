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

/// OfferDto : Предложение.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct OfferDto {
    /// Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. 
    #[serde(rename = "price", skip_serializing_if = "Option::is_none")]
    pub price: Option<f64>,
    /// Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. 
    #[serde(rename = "feedId", skip_serializing_if = "Option::is_none")]
    pub feed_id: Option<i64>,
    /// Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. 
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<String>,
    /// Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
    #[serde(rename = "shopCategoryId", skip_serializing_if = "Option::is_none")]
    pub shop_category_id: Option<String>,
    /// Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. 
    #[serde(rename = "marketCategoryId", skip_serializing_if = "Option::is_none")]
    pub market_category_id: Option<i32>,
    /// Цена предложения без скидки.
    #[serde(rename = "preDiscountPrice", skip_serializing_if = "Option::is_none")]
    pub pre_discount_price: Option<f64>,
    /// Скидка на предложение в процентах.
    #[serde(rename = "discount", skip_serializing_if = "Option::is_none")]
    pub discount: Option<i32>,
    /// Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. 
    #[serde(rename = "cutPrice", skip_serializing_if = "Option::is_none")]
    pub cut_price: Option<bool>,
    /// URL-адрес предложения на сайте магазина.
    #[serde(rename = "url", skip_serializing_if = "Option::is_none")]
    pub url: Option<String>,
    /// Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} 
    #[serde(rename = "modelId")]
    pub model_id: i64,
    /// Наименование предложения.
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    #[serde(rename = "currency", skip_serializing_if = "Option::is_none")]
    pub currency: Option<models::CurrencyType>,
    /// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
    #[serde(rename = "bid", skip_serializing_if = "Option::is_none")]
    pub bid: Option<f64>,
    /// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
    #[serde(rename = "cbid", skip_serializing_if = "Option::is_none")]
    pub cbid: Option<f64>,
    /// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. 
    #[serde(rename = "fee", skip_serializing_if = "Option::is_none")]
    pub fee: Option<f64>,
    /// Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. 
    #[serde(rename = "blocked", skip_serializing_if = "Option::is_none")]
    pub blocked: Option<bool>,
}

impl OfferDto {
    /// Предложение.
    pub fn new(model_id: i64) -> OfferDto {
        OfferDto {
            price: None,
            feed_id: None,
            id: None,
            shop_category_id: None,
            market_category_id: None,
            pre_discount_price: None,
            discount: None,
            cut_price: None,
            url: None,
            model_id,
            name: None,
            currency: None,
            bid: None,
            cbid: None,
            fee: None,
            blocked: None,
        }
    }
}

