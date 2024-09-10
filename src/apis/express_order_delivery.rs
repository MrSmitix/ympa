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
pub enum VerifyOrderEacResponse {
    /// Проверка кода выполнена успешно.
    Status200
    (models::VerifyOrderEacResponse)
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


/// ExpressOrderDelivery
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait ExpressOrderDelivery {
    /// Передача кода подтверждения.
    ///
    /// VerifyOrderEac - PUT /campaigns/{campaignId}/orders/{orderId}/verifyEac
    async fn verify_order_eac(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::VerifyOrderEacPathParams,
            body: models::VerifyOrderEacRequest,
    ) -> Result<VerifyOrderEacResponse, String>;
}
