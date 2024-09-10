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
pub enum ConfirmBusinessPricesResponse {
    /// Ответ 200 обозначает, что цены подтверждены.
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
    /// К ресурсу нельзя применить указанный метод.
    Status423
    (models::ApiLockedErrorResponse)
    ,
    /// Внутренняя ошибка сервера.
    Status500
    (models::ApiServerErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ConfirmCampaignPricesResponse {
    /// Ответ 200 обозначает, что цены подтверждены.
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
    /// К ресурсу нельзя применить указанный метод.
    Status423
    (models::ApiLockedErrorResponse)
    ,
    /// Внутренняя ошибка сервера.
    Status500
    (models::ApiServerErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetBusinessQuarantineOffersResponse {
    /// Список товаров в карантине.
    Status200
    (models::GetQuarantineOffersResponse)
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
pub enum GetCampaignQuarantineOffersResponse {
    /// Список товаров в карантине.
    Status200
    (models::GetQuarantineOffersResponse)
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


/// DbsExpressFbsFbyPriceQuarantine
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsExpressFbsFbyPriceQuarantine {
    /// Удаление товара из карантина по цене в кабинете.
    ///
    /// ConfirmBusinessPrices - POST /businesses/{businessId}/price-quarantine/confirm
    async fn confirm_business_prices(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::ConfirmBusinessPricesPathParams,
            body: models::ConfirmPricesRequest,
    ) -> Result<ConfirmBusinessPricesResponse, String>;

    /// Удаление товара из карантина по цене в магазине.
    ///
    /// ConfirmCampaignPrices - POST /campaigns/{campaignId}/price-quarantine/confirm
    async fn confirm_campaign_prices(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::ConfirmCampaignPricesPathParams,
            body: models::ConfirmPricesRequest,
    ) -> Result<ConfirmCampaignPricesResponse, String>;

    /// Список товаров, находящихся в карантине по цене в кабинете.
    ///
    /// GetBusinessQuarantineOffers - POST /businesses/{businessId}/price-quarantine
    async fn get_business_quarantine_offers(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetBusinessQuarantineOffersPathParams,
      query_params: models::GetBusinessQuarantineOffersQueryParams,
            body: models::GetQuarantineOffersRequest,
    ) -> Result<GetBusinessQuarantineOffersResponse, String>;

    /// Список товаров, находящихся в карантине по цене в магазине.
    ///
    /// GetCampaignQuarantineOffers - POST /campaigns/{campaignId}/price-quarantine
    async fn get_campaign_quarantine_offers(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetCampaignQuarantineOffersPathParams,
      query_params: models::GetCampaignQuarantineOffersQueryParams,
            body: models::GetQuarantineOffersRequest,
    ) -> Result<GetCampaignQuarantineOffersResponse, String>;
}
