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
pub enum GetOrderResponse {
    /// Информация о заказе.
    Status200
    (models::GetOrderResponse)
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
pub enum GetOrdersResponse {
    /// Информация о заказах.
    Status200
    (models::GetOrdersResponse)
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


/// DbsExpressFbsFbyOrders
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsExpressFbsFbyOrders {
    /// Информация об одном заказе.
    ///
    /// GetOrder - GET /campaigns/{campaignId}/orders/{orderId}
    async fn get_order(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetOrderPathParams,
    ) -> Result<GetOrderResponse, String>;

    /// Информация о нескольких заказах.
    ///
    /// GetOrders - GET /campaigns/{campaignId}/orders
    async fn get_orders(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetOrdersPathParams,
      query_params: models::GetOrdersQueryParams,
    ) -> Result<GetOrdersResponse, String>;
}
