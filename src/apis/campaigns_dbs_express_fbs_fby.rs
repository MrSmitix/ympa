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
pub enum GetCampaignResponse {
    /// Информация о магазине.
    Status200
    (models::GetCampaignResponse)
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
pub enum GetCampaignLoginsResponse {
    /// Список логинов, связанных с магазином.
    Status200
    (models::GetCampaignLoginsResponse)
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
pub enum GetCampaignRegionResponse {
    /// Возвращает регион, в котором находится магазин.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
    Status200
    (models::GetCampaignRegionResponse)
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
pub enum GetCampaignSettingsResponse {
    /// Настройки магазина.
    Status200
    (models::GetCampaignSettingsResponse)
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
pub enum GetCampaignsResponse {
    /// Магазины пользователя.
    Status200
    (models::GetCampaignsResponse)
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
pub enum GetCampaignsByLoginResponse {
    /// Информация о магазинах.
    Status200
    (models::GetCampaignsResponse)
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


/// CampaignsDbsExpressFbsFby
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait CampaignsDbsExpressFbsFby {
    /// Информация о магазине.
    ///
    /// GetCampaign - GET /campaigns/{campaignId}
    async fn get_campaign(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetCampaignPathParams,
    ) -> Result<GetCampaignResponse, String>;

    /// Логины, связанные с магазином.
    ///
    /// GetCampaignLogins - GET /campaigns/{campaignId}/logins
    async fn get_campaign_logins(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetCampaignLoginsPathParams,
    ) -> Result<GetCampaignLoginsResponse, String>;

    /// Регион магазина.
    ///
    /// GetCampaignRegion - GET /campaigns/{campaignId}/region
    async fn get_campaign_region(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetCampaignRegionPathParams,
    ) -> Result<GetCampaignRegionResponse, String>;

    /// Настройки магазина.
    ///
    /// GetCampaignSettings - GET /campaigns/{campaignId}/settings
    async fn get_campaign_settings(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetCampaignSettingsPathParams,
    ) -> Result<GetCampaignSettingsResponse, String>;

    /// Список магазинов пользователя.
    ///
    /// GetCampaigns - GET /campaigns
    async fn get_campaigns(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::GetCampaignsQueryParams,
    ) -> Result<GetCampaignsResponse, String>;

    /// Магазины, доступные логину.
    ///
    /// GetCampaignsByLogin - GET /campaigns/by_login/{login}
    async fn get_campaigns_by_login(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetCampaignsByLoginPathParams,
      query_params: models::GetCampaignsByLoginQueryParams,
    ) -> Result<GetCampaignsByLoginResponse, String>;
}
