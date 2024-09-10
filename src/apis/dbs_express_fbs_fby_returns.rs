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
pub enum GetReturnResponse {
    /// Детали возврата.
    Status200
    (models::GetReturnResponse)
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
pub enum GetReturnPhotoResponse {
    /// Фотография возврата.
    Status200
    (ByteArray)
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
pub enum GetReturnsResponse {
    /// Постраничные возвраты партнера.
    Status200
    (models::GetReturnsResponse)
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


/// DbsExpressFbsFbyReturns
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsExpressFbsFbyReturns {
    /// Информация о невыкупе или возврате.
    ///
    /// GetReturn - GET /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}
    async fn get_return(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetReturnPathParams,
    ) -> Result<GetReturnResponse, String>;

    /// Получение фотографии возврата.
    ///
    /// GetReturnPhoto - GET /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}
    async fn get_return_photo(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetReturnPhotoPathParams,
    ) -> Result<GetReturnPhotoResponse, String>;

    /// Список невыкупов и возвратов.
    ///
    /// GetReturns - GET /campaigns/{campaignId}/returns
    async fn get_returns(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetReturnsPathParams,
      query_params: models::GetReturnsQueryParams,
    ) -> Result<GetReturnsResponse, String>;
}
