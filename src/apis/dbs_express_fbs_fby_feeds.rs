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
pub enum GetFeedResponse {
    /// Информация о прайс-листе.
    Status200
    (models::GetFeedResponse)
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
pub enum GetFeedIndexLogsResponse {
    /// Отчет по индексации прайс-листа.
    Status200
    (models::GetFeedIndexLogsResponse)
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
pub enum GetFeedsResponse {
    /// Список прайс-листов.
    Status200
    (models::GetFeedsResponse)
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
pub enum RefreshFeedResponse {
    /// Пустой ответ.
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
    /// Внутренняя ошибка сервера.
    Status500
    (models::ApiServerErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SetFeedParamsResponse {
    /// Статус выполнения операции.
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


/// DbsExpressFbsFbyFeeds
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsExpressFbsFbyFeeds {
    /// Информация о прайс-листе.
    ///
    /// GetFeed - GET /campaigns/{campaignId}/feeds/{feedId}
    async fn get_feed(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetFeedPathParams,
    ) -> Result<GetFeedResponse, String>;

    /// Отчет по индексации прайс-листа.
    ///
    /// GetFeedIndexLogs - GET /campaigns/{campaignId}/feeds/{feedId}/index-logs
    async fn get_feed_index_logs(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetFeedIndexLogsPathParams,
      query_params: models::GetFeedIndexLogsQueryParams,
    ) -> Result<GetFeedIndexLogsResponse, String>;

    /// Список прайс-листов магазина.
    ///
    /// GetFeeds - GET /campaigns/{campaignId}/feeds
    async fn get_feeds(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetFeedsPathParams,
    ) -> Result<GetFeedsResponse, String>;

    /// Сообщить, что прайс-лист обновился.
    ///
    /// RefreshFeed - POST /campaigns/{campaignId}/feeds/{feedId}/refresh
    async fn refresh_feed(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::RefreshFeedPathParams,
    ) -> Result<RefreshFeedResponse, String>;

    /// Изменение параметров прайс-листа.
    ///
    /// SetFeedParams - POST /campaigns/{campaignId}/feeds/{feedId}/params
    async fn set_feed_params(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SetFeedParamsPathParams,
            body: models::SetFeedParamsRequest,
    ) -> Result<SetFeedParamsResponse, String>;
}
