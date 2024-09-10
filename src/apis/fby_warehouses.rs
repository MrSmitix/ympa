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
pub enum GetFulfillmentWarehousesResponse {
    /// Список складов.
    Status200
    (models::GetFulfillmentWarehousesResponse)
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


/// FbyWarehouses
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait FbyWarehouses {
    /// Идентификаторы складов Маркета (FBY).
    ///
    /// GetFulfillmentWarehouses - GET /warehouses
    async fn get_fulfillment_warehouses(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
    ) -> Result<GetFulfillmentWarehousesResponse, String>;
}
