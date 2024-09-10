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
pub enum GetOfferMappingEntriesResponse {
    /// Информация о товарах в каталоге.
    Status200
    (models::GetOfferMappingEntriesResponse)
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
pub enum GetSuggestedOfferMappingEntriesResponse {
    /// Информация о товарах в каталоге.
    Status200
    (models::GetSuggestedOfferMappingEntriesResponse)
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
pub enum UpdateOfferMappingEntriesResponse {
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
    /// К ресурсу нельзя применить указанный метод.
    Status423
    (models::ApiLockedErrorResponse)
    ,
    /// Внутренняя ошибка сервера.
    Status500
    (models::ApiServerErrorResponse)
}


/// DbsExpressFbsFbyOfferMappings
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsExpressFbsFbyOfferMappings {
    /// Список товаров в каталоге.
    ///
    /// GetOfferMappingEntries - GET /campaigns/{campaignId}/offer-mapping-entries
    async fn get_offer_mapping_entries(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetOfferMappingEntriesPathParams,
      query_params: models::GetOfferMappingEntriesQueryParams,
    ) -> Result<GetOfferMappingEntriesResponse, String>;

    /// Рекомендованные карточки для товаров.
    ///
    /// GetSuggestedOfferMappingEntries - POST /campaigns/{campaignId}/offer-mapping-entries/suggestions
    async fn get_suggested_offer_mapping_entries(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetSuggestedOfferMappingEntriesPathParams,
            body: models::GetSuggestedOfferMappingEntriesRequest,
    ) -> Result<GetSuggestedOfferMappingEntriesResponse, String>;

    /// Добавление и редактирование товаров в каталоге.
    ///
    /// UpdateOfferMappingEntries - POST /campaigns/{campaignId}/offer-mapping-entries/updates
    async fn update_offer_mapping_entries(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::UpdateOfferMappingEntriesPathParams,
            body: models::UpdateOfferMappingEntryRequest,
    ) -> Result<UpdateOfferMappingEntriesResponse, String>;
}
