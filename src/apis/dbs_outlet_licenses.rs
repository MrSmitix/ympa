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
pub enum DeleteOutletLicensesResponse {
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
pub enum GetOutletLicensesResponse {
    /// Найденные лицензии собственных точек продаж.
    Status200
    (models::GetOutletLicensesResponse)
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
pub enum UpdateOutletLicensesResponse {
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


/// DbsOutletLicenses
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsOutletLicenses {
    /// Удаление лицензий для точек продаж.
    ///
    /// DeleteOutletLicenses - DELETE /campaigns/{campaignId}/outlets/licenses
    async fn delete_outlet_licenses(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::DeleteOutletLicensesPathParams,
      query_params: models::DeleteOutletLicensesQueryParams,
    ) -> Result<DeleteOutletLicensesResponse, String>;

    /// Информация о лицензиях для точек продаж.
    ///
    /// GetOutletLicenses - GET /campaigns/{campaignId}/outlets/licenses
    async fn get_outlet_licenses(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetOutletLicensesPathParams,
      query_params: models::GetOutletLicensesQueryParams,
    ) -> Result<GetOutletLicensesResponse, String>;

    /// Создание и изменение лицензий для точек продаж.
    ///
    /// UpdateOutletLicenses - POST /campaigns/{campaignId}/outlets/licenses
    async fn update_outlet_licenses(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::UpdateOutletLicensesPathParams,
            body: models::UpdateOutletLicenseRequest,
    ) -> Result<UpdateOutletLicensesResponse, String>;
}
