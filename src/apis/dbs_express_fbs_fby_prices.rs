use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Multipart};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetPricesResponse {
    /// Список всех товаров с установленными ценами.
    Status200
    (models::GetPricesResponse)
    ,
    /// Запрос содержит неправильные данные.
    Status400
    (models::ApiClientDataErrorResponse)
    ,
    /// В запросе не указаны данные для авторизации.
    Status401
    (models::ApiUnauthorizedErrorResponse)
    ,
    /// Данные для авторизации неверны или доступ к ресурсу запрещен.
    Status403
    (models::ApiForbiddenErrorResponse)
    ,
    /// Запрашиваемый ресурс не найден.
    Status404
    (models::ApiNotFoundErrorResponse)
    ,
    /// Превышено ограничение на доступ к ресурсу.
    Status420
    (models::ApiLimitErrorResponse)
    ,
    /// Внутренняя ошибка сервера.
    Status500
    (models::ApiServerErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetPricesByOfferIdsResponse {
    /// Список товаров с установленными для заданного магазина ценами.
    Status200
    (models::GetPricesByOfferIdsResponse)
    ,
    /// Запрос содержит неправильные данные.
    Status400
    (models::ApiClientDataErrorResponse)
    ,
    /// В запросе не указаны данные для авторизации.
    Status401
    (models::ApiUnauthorizedErrorResponse)
    ,
    /// Данные для авторизации неверны или доступ к ресурсу запрещен.
    Status403
    (models::ApiForbiddenErrorResponse)
    ,
    /// Запрашиваемый ресурс не найден.
    Status404
    (models::ApiNotFoundErrorResponse)
    ,
    /// Превышено ограничение на доступ к ресурсу.
    Status420
    (models::ApiLimitErrorResponse)
    ,
    /// Внутренняя ошибка сервера.
    Status500
    (models::ApiServerErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetSuggestedPricesResponse {
    /// Список цен для продвижения на Маркете.
    Status200
    (models::SuggestPricesResponse)
    ,
    /// Запрос содержит неправильные данные.
    Status400
    (models::ApiClientDataErrorResponse)
    ,
    /// В запросе не указаны данные для авторизации.
    Status401
    (models::ApiUnauthorizedErrorResponse)
    ,
    /// Данные для авторизации неверны или доступ к ресурсу запрещен.
    Status403
    (models::ApiForbiddenErrorResponse)
    ,
    /// Запрашиваемый ресурс не найден.
    Status404
    (models::ApiNotFoundErrorResponse)
    ,
    /// Превышено ограничение на доступ к ресурсу.
    Status420
    (models::ApiLimitErrorResponse)
    ,
    /// Внутренняя ошибка сервера.
    Status500
    (models::ApiServerErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UpdateBusinessPricesResponse {
    /// Маркет принял информацию о новых ценах.
    Status200
    (models::EmptyApiResponse)
    ,
    /// Запрос содержит неправильные данные.
    Status400
    (models::ApiClientDataErrorResponse)
    ,
    /// В запросе не указаны данные для авторизации.
    Status401
    (models::ApiUnauthorizedErrorResponse)
    ,
    /// Данные для авторизации неверны или доступ к ресурсу запрещен.
    Status403
    (models::ApiForbiddenErrorResponse)
    ,
    /// Запрашиваемый ресурс не найден.
    Status404
    (models::ApiNotFoundErrorResponse)
    ,
    /// Превышено ограничение на доступ к ресурсу.
    Status420
    (models::ApiLimitErrorResponse)
    ,
    /// К ресурсу нельзя применить указанный метод.
    Status423
    (models::ApiLockedErrorResponse)
    ,
    /// Внутренняя ошибка сервера.
    Status500
    (models::ApiServerErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UpdatePricesResponse {
    /// Маркет принял информацию о новых ценах.
    Status200
    (models::EmptyApiResponse)
    ,
    /// Запрос содержит неправильные данные.
    Status400
    (models::ApiClientDataErrorResponse)
    ,
    /// В запросе не указаны данные для авторизации.
    Status401
    (models::ApiUnauthorizedErrorResponse)
    ,
    /// Данные для авторизации неверны или доступ к ресурсу запрещен.
    Status403
    (models::ApiForbiddenErrorResponse)
    ,
    /// Запрашиваемый ресурс не найден.
    Status404
    (models::ApiNotFoundErrorResponse)
    ,
    /// Превышено ограничение на доступ к ресурсу.
    Status420
    (models::ApiLimitErrorResponse)
    ,
    /// К ресурсу нельзя применить указанный метод.
    Status423
    (models::ApiLockedErrorResponse)
    ,
    /// Внутренняя ошибка сервера.
    Status500
    (models::ApiServerErrorResponse)
}


/// DbsExpressFbsFbyPrices
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsExpressFbsFbyPrices {
    /// Список цен.
    ///
    /// GetPrices - GET /campaigns/{campaignId}/offer-prices
    async fn get_prices(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetPricesPathParams,
      query_params: models::GetPricesQueryParams,
    ) -> Result<GetPricesResponse, String>;

    /// Просмотр цен на указанные товары в магазине.
    ///
    /// GetPricesByOfferIds - POST /campaigns/{campaignId}/offer-prices
    async fn get_prices_by_offer_ids(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetPricesByOfferIdsPathParams,
      query_params: models::GetPricesByOfferIdsQueryParams,
            body: Option<models::GetPricesByOfferIdsRequest>,
    ) -> Result<GetPricesByOfferIdsResponse, String>;

    /// Цены для продвижения товаров.
    ///
    /// GetSuggestedPrices - POST /campaigns/{campaignId}/offer-prices/suggestions
    async fn get_suggested_prices(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetSuggestedPricesPathParams,
            body: models::SuggestPricesRequest,
    ) -> Result<GetSuggestedPricesResponse, String>;

    /// Установка цен на товары во всех магазинах.
    ///
    /// UpdateBusinessPrices - POST /businesses/{businessId}/offer-prices/updates
    async fn update_business_prices(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::UpdateBusinessPricesPathParams,
            body: models::UpdateBusinessPricesRequest,
    ) -> Result<UpdateBusinessPricesResponse, String>;

    /// Установка цен на товары в конкретном магазине.
    ///
    /// UpdatePrices - POST /campaigns/{campaignId}/offer-prices/updates
    async fn update_prices(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::UpdatePricesPathParams,
            body: models::UpdatePricesRequest,
    ) -> Result<UpdatePricesResponse, String>;
}
