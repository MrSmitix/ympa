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
pub enum GetOrderBuyerInfoResponse {
    /// Информация о покупателе.
    Status200
    (models::GetOrderBuyerInfoResponse)
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
pub enum SetOrderDeliveryDateResponse {
    /// Успешное изменение даты доставки.
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
pub enum SetOrderDeliveryTrackCodeResponse {
    /// Трек‑номер посылки и идентификатор службы доставки были успешно переданы.
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
pub enum UpdateOrderStorageLimitResponse {
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


/// DbsOrderDelivery
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsOrderDelivery {
    /// Информация о покупателе — физическом лице.
    ///
    /// GetOrderBuyerInfo - GET /campaigns/{campaignId}/orders/{orderId}/buyer
    async fn get_order_buyer_info(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetOrderBuyerInfoPathParams,
    ) -> Result<GetOrderBuyerInfoResponse, String>;

    /// Изменение даты доставки заказа.
    ///
    /// SetOrderDeliveryDate - PUT /campaigns/{campaignId}/orders/{orderId}/delivery/date
    async fn set_order_delivery_date(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SetOrderDeliveryDatePathParams,
            body: models::SetOrderDeliveryDateRequest,
    ) -> Result<SetOrderDeliveryDateResponse, String>;

    /// Передача трек‑номера посылки.
    ///
    /// SetOrderDeliveryTrackCode - POST /campaigns/{campaignId}/orders/{orderId}/delivery/track
    async fn set_order_delivery_track_code(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SetOrderDeliveryTrackCodePathParams,
            body: models::SetOrderDeliveryTrackCodeRequest,
    ) -> Result<SetOrderDeliveryTrackCodeResponse, String>;

    /// Продление срока хранения заказа.
    ///
    /// UpdateOrderStorageLimit - PUT /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit
    async fn update_order_storage_limit(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::UpdateOrderStorageLimitPathParams,
            body: models::UpdateOrderStorageLimitRequest,
    ) -> Result<UpdateOrderStorageLimitResponse, String>;
}
