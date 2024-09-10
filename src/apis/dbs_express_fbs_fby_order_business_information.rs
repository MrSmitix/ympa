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
pub enum GetOrderBusinessBuyerInfoResponse {
    /// Информация о покупателе.
    Status200
    (models::GetBusinessBuyerInfoResponse)
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
pub enum GetOrderBusinessDocumentsInfoResponse {
    /// Информация о документах.
    Status200
    (models::GetBusinessDocumentsInfoResponse)
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


/// DbsExpressFbsFbyOrderBusinessInformation
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsExpressFbsFbyOrderBusinessInformation {
    /// Информация о покупателе — юридическом лице.
    ///
    /// GetOrderBusinessBuyerInfo - POST /campaigns/{campaignId}/orders/{orderId}/business-buyer
    async fn get_order_business_buyer_info(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetOrderBusinessBuyerInfoPathParams,
    ) -> Result<GetOrderBusinessBuyerInfoResponse, String>;

    /// Информация о документах.
    ///
    /// GetOrderBusinessDocumentsInfo - POST /campaigns/{campaignId}/orders/{orderId}/documents
    async fn get_order_business_documents_info(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetOrderBusinessDocumentsInfoPathParams,
    ) -> Result<GetOrderBusinessDocumentsInfoResponse, String>;
}
