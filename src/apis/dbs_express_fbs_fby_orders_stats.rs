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
pub enum GetOrdersStatsResponse {
    /// Информация по заказам.
    Status200
    (models::GetOrdersStatsResponse)
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


/// DbsExpressFbsFbyOrdersStats
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsExpressFbsFbyOrdersStats {
    /// Детальная информация по заказам.
    ///
    /// GetOrdersStats - POST /campaigns/{campaignId}/stats/orders
    async fn get_orders_stats(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetOrdersStatsPathParams,
      query_params: models::GetOrdersStatsQueryParams,
            body: Option<models::GetOrdersStatsRequest>,
    ) -> Result<GetOrdersStatsResponse, String>;
}
