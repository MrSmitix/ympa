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
pub enum DeleteCampaignOffersResponse {
    /// Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине.
    Status200
    (models::DeleteCampaignOffersResponse)
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
pub enum GetAllOffersResponse {
    /// Предложения магазина.
    Status200
    (models::GetAllOffersResponse)
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
pub enum GetCampaignOffersResponse {
    /// Список товаров, размещенных в заданном магазине.
    Status200
    (models::GetCampaignOffersResponse)
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
pub enum GetOfferRecommendationsResponse {
    /// Список товаров с рекомендациями.
    Status200
    (models::GetOfferRecommendationsResponse)
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
pub enum GetOffersResponse {
    /// Предложения магазина.
    Status200
    (models::GetOffersResponse)
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
pub enum UpdateCampaignOffersResponse {
    /// Ответ 200 обозначает, что новые параметры получены Маркетом и скоро вступят в силу.
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


/// DbsExpressFbsFbyOffers
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsExpressFbsFbyOffers {
    /// Удаление товаров из ассортимента магазина.
    ///
    /// DeleteCampaignOffers - POST /campaigns/{campaignId}/offers/delete
    async fn delete_campaign_offers(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::DeleteCampaignOffersPathParams,
            body: models::DeleteCampaignOffersRequest,
    ) -> Result<DeleteCampaignOffersResponse, String>;

    /// Все предложения магазина.
    ///
    /// GetAllOffers - GET /campaigns/{campaignId}/offers/all
    async fn get_all_offers(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetAllOffersPathParams,
      query_params: models::GetAllOffersQueryParams,
    ) -> Result<GetAllOffersResponse, String>;

    /// Информация о товарах, которые размещены в заданном магазине.
    ///
    /// GetCampaignOffers - POST /campaigns/{campaignId}/offers
    async fn get_campaign_offers(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetCampaignOffersPathParams,
      query_params: models::GetCampaignOffersQueryParams,
            body: models::GetCampaignOffersRequest,
    ) -> Result<GetCampaignOffersResponse, String>;

    /// Рекомендации Маркета, касающиеся цен.
    ///
    /// GetOfferRecommendations - POST /businesses/{businessId}/offers/recommendations
    async fn get_offer_recommendations(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetOfferRecommendationsPathParams,
      query_params: models::GetOfferRecommendationsQueryParams,
            body: models::GetOfferRecommendationsRequest,
    ) -> Result<GetOfferRecommendationsResponse, String>;

    /// Предложения магазина.
    ///
    /// GetOffers - GET /campaigns/{campaignId}/offers
    async fn get_offers(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetOffersPathParams,
      query_params: models::GetOffersQueryParams,
    ) -> Result<GetOffersResponse, String>;

    /// Изменение условий продажи товаров в магазине.
    ///
    /// UpdateCampaignOffers - POST /campaigns/{campaignId}/offers/update
    async fn update_campaign_offers(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::UpdateCampaignOffersPathParams,
            body: models::UpdateCampaignOffersRequest,
    ) -> Result<UpdateCampaignOffersResponse, String>;
}
