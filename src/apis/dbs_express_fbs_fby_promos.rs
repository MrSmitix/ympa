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
pub enum DeletePromoOffersResponse {
    /// Результат удаления товаров из акции.
    Status200
    (models::DeletePromoOffersResponse)
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
pub enum GetPromoOffersResponse {
    /// Список товаров, которые участвуют или могут участвовать в акции.
    Status200
    (models::GetPromoOffersResponse)
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
pub enum GetPromosResponse {
    /// Список акций Маркета.
    Status200
    (models::GetPromosResponse)
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
pub enum UpdatePromoOffersResponse {
    /// Результат добавления товаров в акцию или обновления их цен.
    Status200
    (models::UpdatePromoOffersResponse)
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


/// DbsExpressFbsFbyPromos
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsExpressFbsFbyPromos {
    /// Удаление товаров из акции.
    ///
    /// DeletePromoOffers - POST /businesses/{businessId}/promos/offers/delete
    async fn delete_promo_offers(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::DeletePromoOffersPathParams,
            body: models::DeletePromoOffersRequest,
    ) -> Result<DeletePromoOffersResponse, String>;

    /// Получение списка товаров, которые участвуют или могут участвовать в акции.
    ///
    /// GetPromoOffers - POST /businesses/{businessId}/promos/offers
    async fn get_promo_offers(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetPromoOffersPathParams,
      query_params: models::GetPromoOffersQueryParams,
            body: models::GetPromoOffersRequest,
    ) -> Result<GetPromoOffersResponse, String>;

    /// Получение списка акций.
    ///
    /// GetPromos - POST /businesses/{businessId}/promos
    async fn get_promos(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetPromosPathParams,
            body: Option<models::GetPromosRequest>,
    ) -> Result<GetPromosResponse, String>;

    /// Добавление товаров в акцию или изменение их цен.
    ///
    /// UpdatePromoOffers - POST /businesses/{businessId}/promos/offers/update
    async fn update_promo_offers(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::UpdatePromoOffersPathParams,
            body: models::UpdatePromoOffersRequest,
    ) -> Result<UpdatePromoOffersResponse, String>;
}
