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
pub enum GetBidsInfoForBusinessResponse {
    /// Значения ставок для заданных товаров. В ответ попадают только товары, на которые установлены ставки.
    Status200
    (models::GetBidsInfoResponse)
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
pub enum GetBidsRecommendationsResponse {
    /// Рекомендованные ставки для заданных товаров.
    Status200
    (models::GetBidsRecommendationsResponse)
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
pub enum PutBidsForBusinessResponse {
    /// Все получилось: ставки установлены или обновлены. Если нужно, добавлены новые товары и запущена кампания. 
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
pub enum PutBidsForCampaignResponse {
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


/// BidsDbsExpressFbsFby
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait BidsDbsExpressFbsFby {
    /// Информация об установленных ставках.
    ///
    /// GetBidsInfoForBusiness - POST /businesses/{businessId}/bids/info
    async fn get_bids_info_for_business(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetBidsInfoForBusinessPathParams,
      query_params: models::GetBidsInfoForBusinessQueryParams,
            body: Option<models::GetBidsInfoRequest>,
    ) -> Result<GetBidsInfoForBusinessResponse, String>;

    /// Рекомендованные ставки для заданных товаров.
    ///
    /// GetBidsRecommendations - POST /businesses/{businessId}/bids/recommendations
    async fn get_bids_recommendations(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetBidsRecommendationsPathParams,
            body: models::GetBidsRecommendationsRequest,
    ) -> Result<GetBidsRecommendationsResponse, String>;

    /// Включение буста продаж и установка ставок.
    ///
    /// PutBidsForBusiness - PUT /businesses/{businessId}/bids
    async fn put_bids_for_business(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::PutBidsForBusinessPathParams,
            body: models::PutSkuBidsRequest,
    ) -> Result<PutBidsForBusinessResponse, String>;

    /// Включение буста продаж и установка ставок для магазина.
    ///
    /// PutBidsForCampaign - PUT /campaigns/{campaignId}/bids
    async fn put_bids_for_campaign(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::PutBidsForCampaignPathParams,
            body: models::PutSkuBidsRequest,
    ) -> Result<PutBidsForCampaignResponse, String>;
}
