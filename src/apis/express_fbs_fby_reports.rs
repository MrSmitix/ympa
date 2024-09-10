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
pub enum GenerateGoodsRealizationReportResponse {
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


/// ExpressFbsFbyReports
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait ExpressFbsFbyReports {
    /// Отчет по реализации.
    ///
    /// GenerateGoodsRealizationReport - POST /reports/goods-realization/generate
    async fn generate_goods_realization_report(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::GenerateGoodsRealizationReportQueryParams,
            body: models::GenerateGoodsRealizationReportRequest,
    ) -> Result<GenerateGoodsRealizationReportResponse, String>;
}
