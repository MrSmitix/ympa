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
pub enum CreateOutletResponse {
    /// Информация о созданной точке продаж.
    Status200
    (models::CreateOutletResponse)
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
pub enum DeleteOutletResponse {
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
pub enum GetOutletResponse {
    /// Информация о точке продаж.
    Status200
    (models::GetOutletResponse)
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
pub enum GetOutletsResponse {
    /// Информация о точках продаж.
    Status200
    (models::GetOutletsResponse)
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
pub enum UpdateOutletResponse {
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


/// DbsOutlets
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsOutlets {
    /// Создание точки продаж.
    ///
    /// CreateOutlet - POST /campaigns/{campaignId}/outlets
    async fn create_outlet(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::CreateOutletPathParams,
            body: models::ChangeOutletRequest,
    ) -> Result<CreateOutletResponse, String>;

    /// Удаление точки продаж.
    ///
    /// DeleteOutlet - DELETE /campaigns/{campaignId}/outlets/{outletId}
    async fn delete_outlet(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::DeleteOutletPathParams,
    ) -> Result<DeleteOutletResponse, String>;

    /// Информация об одной точке продаж.
    ///
    /// GetOutlet - GET /campaigns/{campaignId}/outlets/{outletId}
    async fn get_outlet(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetOutletPathParams,
    ) -> Result<GetOutletResponse, String>;

    /// Информация о нескольких точках продаж.
    ///
    /// GetOutlets - GET /campaigns/{campaignId}/outlets
    async fn get_outlets(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetOutletsPathParams,
      query_params: models::GetOutletsQueryParams,
    ) -> Result<GetOutletsResponse, String>;

    /// Изменение информации о точке продаж.
    ///
    /// UpdateOutlet - PUT /campaigns/{campaignId}/outlets/{outletId}
    async fn update_outlet(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::UpdateOutletPathParams,
            body: models::ChangeOutletRequest,
    ) -> Result<UpdateOutletResponse, String>;
}
