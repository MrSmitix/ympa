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
pub enum GenerateShipmentListDocumentReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый документ.
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


/// FbsReports
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait FbsReports {
    /// Получение листа сборки.
    ///
    /// GenerateShipmentListDocumentReport - POST /reports/documents/shipment-list/generate
    async fn generate_shipment_list_document_report(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
            body: models::GenerateShipmentListDocumentReportRequest,
    ) -> Result<GenerateShipmentListDocumentReportResponse, String>;
}
