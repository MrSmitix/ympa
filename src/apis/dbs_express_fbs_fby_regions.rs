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
pub enum SearchRegionChildrenResponse {
    /// Регионы, являющиеся дочерними к указанному в запросе.
    Status200
    (models::GetRegionWithChildrenResponse)
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
pub enum SearchRegionsByIdResponse {
    /// Найденный регион.
    Status200
    (models::GetRegionsResponse)
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
pub enum SearchRegionsByNameResponse {
    /// Список найденных регионов.
    Status200
    (models::GetRegionsResponse)
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


/// DbsExpressFbsFbyRegions
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsExpressFbsFbyRegions {
    /// Информация о дочерних регионах.
    ///
    /// SearchRegionChildren - GET /regions/{regionId}/children
    async fn search_region_children(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SearchRegionChildrenPathParams,
      query_params: models::SearchRegionChildrenQueryParams,
    ) -> Result<SearchRegionChildrenResponse, String>;

    /// Информация о регионе.
    ///
    /// SearchRegionsById - GET /regions/{regionId}
    async fn search_regions_by_id(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SearchRegionsByIdPathParams,
    ) -> Result<SearchRegionsByIdResponse, String>;

    /// Поиск регионов по их имени.
    ///
    /// SearchRegionsByName - GET /regions
    async fn search_regions_by_name(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::SearchRegionsByNameQueryParams,
    ) -> Result<SearchRegionsByNameResponse, String>;
}
