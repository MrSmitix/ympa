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
pub enum AcceptOrderCancellationResponse {
    /// Ответ на отмену заказа был успешно передан.
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
pub enum ProvideOrderDigitalCodesResponse {
    /// Пустой ответ.
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


/// DbsOrders
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsOrders {
    /// Отмена заказа покупателем.
    ///
    /// AcceptOrderCancellation - PUT /campaigns/{campaignId}/orders/{orderId}/cancellation/accept
    async fn accept_order_cancellation(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AcceptOrderCancellationPathParams,
            body: models::AcceptOrderCancellationRequest,
    ) -> Result<AcceptOrderCancellationResponse, String>;

    /// Передача ключей цифровых товаров.
    ///
    /// ProvideOrderDigitalCodes - POST /campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods
    async fn provide_order_digital_codes(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::ProvideOrderDigitalCodesPathParams,
            body: models::ProvideOrderDigitalCodesRequest,
    ) -> Result<ProvideOrderDigitalCodesResponse, String>;
}
