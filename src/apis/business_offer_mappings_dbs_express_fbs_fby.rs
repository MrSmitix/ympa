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
pub enum AddOffersToArchiveResponse {
    /// Если некоторые товары добавить в архив не удалось, в ответе 200 будет их список.  Список успешно добавленных товаров не возвращается. 
    Status200
    (models::AddOffersToArchiveResponse)
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
pub enum DeleteOffersResponse {
    /// Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине.
    Status200
    (models::DeleteOffersResponse)
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
pub enum DeleteOffersFromArchiveResponse {
    /// Если некоторые товары восстановить из архива не удалось, в ответе 200 будет их список.  Список успешно восстановленных товаров не возвращается. 
    Status200
    (models::DeleteOffersFromArchiveResponse)
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
pub enum GetOfferMappingsResponse {
    /// Информация о товарах в каталоге.
    Status200
    (models::GetOfferMappingsResponse)
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
pub enum GetSuggestedOfferMappingsResponse {
    /// Подобранные карточки на Маркете.  По результатам проверки товара полученная через этот запрос карточка может быть заменена на другую. 
    Status200
    (models::GetSuggestedOfferMappingsResponse)
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
pub enum UpdateOfferMappingsResponse {
    /// Все обязательные поля товаров заполнены, поэтому новые товары и внесенные изменения сохранены в каталоге. 
    Status200
    (models::UpdateOfferMappingsResponse)
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


/// BusinessOfferMappingsDbsExpressFbsFby
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait BusinessOfferMappingsDbsExpressFbsFby {
    /// Добавление товаров в архив.
    ///
    /// AddOffersToArchive - POST /businesses/{businessId}/offer-mappings/archive
    async fn add_offers_to_archive(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AddOffersToArchivePathParams,
            body: models::AddOffersToArchiveRequest,
    ) -> Result<AddOffersToArchiveResponse, String>;

    /// Удаление товаров из каталога.
    ///
    /// DeleteOffers - POST /businesses/{businessId}/offer-mappings/delete
    async fn delete_offers(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::DeleteOffersPathParams,
            body: models::DeleteOffersRequest,
    ) -> Result<DeleteOffersResponse, String>;

    /// Удаление товаров из архива.
    ///
    /// DeleteOffersFromArchive - POST /businesses/{businessId}/offer-mappings/unarchive
    async fn delete_offers_from_archive(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::DeleteOffersFromArchivePathParams,
            body: models::DeleteOffersFromArchiveRequest,
    ) -> Result<DeleteOffersFromArchiveResponse, String>;

    /// Информация о товарах в каталоге.
    ///
    /// GetOfferMappings - POST /businesses/{businessId}/offer-mappings
    async fn get_offer_mappings(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetOfferMappingsPathParams,
      query_params: models::GetOfferMappingsQueryParams,
            body: Option<models::GetOfferMappingsRequest>,
    ) -> Result<GetOfferMappingsResponse, String>;

    /// Просмотр карточек на Маркете, которые подходят вашим товарам.
    ///
    /// GetSuggestedOfferMappings - POST /businesses/{businessId}/offer-mappings/suggestions
    async fn get_suggested_offer_mappings(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetSuggestedOfferMappingsPathParams,
            body: Option<models::GetSuggestedOfferMappingsRequest>,
    ) -> Result<GetSuggestedOfferMappingsResponse, String>;

    /// Добавление товаров в каталог и изменение информации о них.
    ///
    /// UpdateOfferMappings - POST /businesses/{businessId}/offer-mappings/update
    async fn update_offer_mappings(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::UpdateOfferMappingsPathParams,
            body: models::UpdateOfferMappingsRequest,
    ) -> Result<UpdateOfferMappingsResponse, String>;
}
