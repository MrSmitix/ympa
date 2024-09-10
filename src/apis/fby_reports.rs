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
pub enum GenerateGoodsMovementReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GenerateGoodsTurnoverReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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


/// FbyReports
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait FbyReports {
    /// Отчет по движению товаров.
    ///
    /// GenerateGoodsMovementReport - POST /reports/goods-movement/generate
    async fn generate_goods_movement_report(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::GenerateGoodsMovementReportQueryParams,
            body: models::GenerateGoodsMovementReportRequest,
    ) -> Result<GenerateGoodsMovementReportResponse, String>;

    /// Отчет по оборачиваемости.
    ///
    /// GenerateGoodsTurnoverReport - POST /reports/goods-turnover/generate
    async fn generate_goods_turnover_report(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::GenerateGoodsTurnoverReportQueryParams,
            body: models::GenerateGoodsTurnoverRequest,
    ) -> Result<GenerateGoodsTurnoverReportResponse, String>;
}
