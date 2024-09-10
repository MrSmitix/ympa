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
pub enum GenerateMassOrderLabelsReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый файл.  Если при генерации не удалось найти часть заказов, в ответе на запрос получения готового файла вернется подстатус `RESOURCE_NOT_FOUND`. 
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


/// DbsExpressFbsReports
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsExpressFbsReports {
    /// Готовые ярлыки‑наклейки на все коробки в нескольких заказах.
    ///
    /// GenerateMassOrderLabelsReport - POST /reports/documents/labels/generate
    async fn generate_mass_order_labels_report(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::GenerateMassOrderLabelsReportQueryParams,
            body: models::GenerateMassOrderLabelsRequest,
    ) -> Result<GenerateMassOrderLabelsReportResponse, String>;
}
