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
pub enum GenerateOrderLabelResponse {
    /// PDF‑файл с ярлыками для коробки. Файл содержит одну страницу с ярлыком.
    Status200_PDF
    (ByteArray)
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
pub enum GenerateOrderLabelsResponse {
    /// PDF‑файл с ярлыками на все коробки.
    Status200_PDF
    (ByteArray)
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
pub enum GetOrderLabelsDataResponse {
    /// Информация для печати ярлыков.
    Status200
    (models::GetOrderLabelsDataResponse)
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


/// DbsExpressFbsOrderLabels
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsExpressFbsOrderLabels {
    /// Готовый ярлык‑наклейка для коробки в заказе.
    ///
    /// GenerateOrderLabel - GET /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label
    async fn generate_order_label(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GenerateOrderLabelPathParams,
      query_params: models::GenerateOrderLabelQueryParams,
    ) -> Result<GenerateOrderLabelResponse, String>;

    /// Готовые ярлыки‑наклейки на все коробки в одном заказе.
    ///
    /// GenerateOrderLabels - GET /campaigns/{campaignId}/orders/{orderId}/delivery/labels
    async fn generate_order_labels(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GenerateOrderLabelsPathParams,
      query_params: models::GenerateOrderLabelsQueryParams,
    ) -> Result<GenerateOrderLabelsResponse, String>;

    /// Данные для самостоятельного изготовления ярлыков.
    ///
    /// GetOrderLabelsData - GET /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data
    async fn get_order_labels_data(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetOrderLabelsDataPathParams,
    ) -> Result<GetOrderLabelsDataResponse, String>;
}
