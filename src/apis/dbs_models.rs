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
pub enum GetModelResponse {
    /// Информация о модели.
    Status200
    (models::GetModelsResponse)
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
pub enum GetModelOffersResponse {
    /// Список предложений для модели.
    Status200
    (models::GetModelsOffersResponse)
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
pub enum GetModelsResponse {
    /// Информация о моделях.
    Status200
    (models::GetModelsResponse)
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
pub enum GetModelsOffersResponse {
    /// Список предложений для моделей.
    Status200
    (models::GetModelsOffersResponse)
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
pub enum SearchModelsResponse {
    /// Информация о моделях.
    Status200
    (models::SearchModelsResponse)
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


/// DbsModels
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsModels {
    /// Информация об одной модели.
    ///
    /// GetModel - GET /models/{modelId}
    async fn get_model(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetModelPathParams,
      query_params: models::GetModelQueryParams,
    ) -> Result<GetModelResponse, String>;

    /// Список предложений для одной модели.
    ///
    /// GetModelOffers - GET /models/{modelId}/offers
    async fn get_model_offers(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetModelOffersPathParams,
      query_params: models::GetModelOffersQueryParams,
    ) -> Result<GetModelOffersResponse, String>;

    /// Информация о нескольких моделях.
    ///
    /// GetModels - POST /models
    async fn get_models(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::GetModelsQueryParams,
            body: models::GetModelsRequest,
    ) -> Result<GetModelsResponse, String>;

    /// Список предложений для нескольких моделей.
    ///
    /// GetModelsOffers - POST /models/offers
    async fn get_models_offers(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::GetModelsOffersQueryParams,
            body: models::GetModelsRequest,
    ) -> Result<GetModelsOffersResponse, String>;

    /// Поиск модели товара.
    ///
    /// SearchModels - GET /models
    async fn search_models(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::SearchModelsQueryParams,
    ) -> Result<SearchModelsResponse, String>;
}
