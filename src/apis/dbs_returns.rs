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
pub enum SetReturnDecisionResponse {
    /// Детали возврата.
    Status200
    (models::EmptyApiResponse)
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
pub enum SubmitReturnDecisionResponse {
    /// Статус выполнения операции.
    Status200
    (models::EmptyApiResponse)
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


/// DbsReturns
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsReturns {
    /// Принятие или изменение решения по возврату.
    ///
    /// SetReturnDecision - POST /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision
    async fn set_return_decision(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SetReturnDecisionPathParams,
            body: models::SetReturnDecisionRequest,
    ) -> Result<SetReturnDecisionResponse, String>;

    /// Подтверждение решения по возврату.
    ///
    /// SubmitReturnDecision - POST /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit
    async fn submit_return_decision(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SubmitReturnDecisionPathParams,
    ) -> Result<SubmitReturnDecisionResponse, String>;
}
