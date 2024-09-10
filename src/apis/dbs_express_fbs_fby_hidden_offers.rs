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
pub enum AddHiddenOffersResponse {
    /// Настройки скрытия получены и скоро вступят в силу.
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
pub enum DeleteHiddenOffersResponse {
    /// Показ товаров возобновлен.
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
pub enum GetHiddenOffersResponse {
    /// Информация о скрытых вами товарах.
    Status200
    (models::GetHiddenOffersResponse)
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
    /// Превышено ограничение на доступ к ресурсу.
    Status420
    (models::ApiLimitErrorResponse)
    ,
    /// Внутренняя ошибка сервера.
    Status500
    (models::ApiServerErrorResponse)
}


/// DbsExpressFbsFbyHiddenOffers
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsExpressFbsFbyHiddenOffers {
    /// Скрытие товаров и настройки скрытия.
    ///
    /// AddHiddenOffers - POST /campaigns/{campaignId}/hidden-offers
    async fn add_hidden_offers(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AddHiddenOffersPathParams,
            body: models::AddHiddenOffersRequest,
    ) -> Result<AddHiddenOffersResponse, String>;

    /// Возобновление показа товаров.
    ///
    /// DeleteHiddenOffers - POST /campaigns/{campaignId}/hidden-offers/delete
    async fn delete_hidden_offers(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::DeleteHiddenOffersPathParams,
            body: models::DeleteHiddenOffersRequest,
    ) -> Result<DeleteHiddenOffersResponse, String>;

    /// Информация о скрытых вами товарах.
    ///
    /// GetHiddenOffers - GET /campaigns/{campaignId}/hidden-offers
    async fn get_hidden_offers(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetHiddenOffersPathParams,
      query_params: models::GetHiddenOffersQueryParams,
    ) -> Result<GetHiddenOffersResponse, String>;
}
