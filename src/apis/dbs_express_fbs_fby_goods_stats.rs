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
pub enum GetGoodsStatsResponse {
    /// Отчет по товарам.
    Status200
    (models::GetGoodsStatsResponse)
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


/// DbsExpressFbsFbyGoodsStats
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsExpressFbsFbyGoodsStats {
    /// Отчет по товарам.
    ///
    /// GetGoodsStats - POST /campaigns/{campaignId}/stats/skus
    async fn get_goods_stats(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetGoodsStatsPathParams,
            body: models::GetGoodsStatsRequest,
    ) -> Result<GetGoodsStatsResponse, String>;
}
