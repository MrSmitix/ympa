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
pub enum GetCategoryContentParametersResponse {
    /// Список характеристик товаров из заданной категории.
    Status200
    (models::GetCategoryContentParametersResponse)
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
pub enum GetOfferCardsContentStatusResponse {
    /// Информация о карточках указанных товаров.
    Status200
    (models::GetOfferCardsContentStatusResponse)
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
pub enum UpdateOfferContentResponse {
    /// Запрос выполнен корректно, данные обработаны.  {% note warning \"Ответ 200 сам по себе не значит, что переданные значения корректны\" %}  Обязательно посмотрите детали ответа: `status` и перечень ошибок, если он есть.  Даже если ошибка допущена в характеристиках всего одного товара, никакие изменения из запроса в каталог не попадут.  {% endnote %}  Если в `status` вернулось `ERROR`, убедитесь, что:  * все обязательные характеристики заполнены; * характеристики действительно существуют в указанных категориях; * значения соответствуют характеристикам; * ваши собственные значения имеют нужный тип данных.  Найти проблемы помогут поля `errors` и `warnings`. 
    Status200
    (models::UpdateOfferContentResponse)
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


/// ContentDbsExpressFbsFby
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait ContentDbsExpressFbsFby {
    /// Списки характеристик товаров по категориям.
    ///
    /// GetCategoryContentParameters - POST /category/{categoryId}/parameters
    async fn get_category_content_parameters(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetCategoryContentParametersPathParams,
    ) -> Result<GetCategoryContentParametersResponse, String>;

    /// Получение информации о заполненности карточек магазина.
    ///
    /// GetOfferCardsContentStatus - POST /businesses/{businessId}/offer-cards
    async fn get_offer_cards_content_status(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetOfferCardsContentStatusPathParams,
      query_params: models::GetOfferCardsContentStatusQueryParams,
            body: Option<models::GetOfferCardsContentStatusRequest>,
    ) -> Result<GetOfferCardsContentStatusResponse, String>;

    /// Редактирование категорийных характеристик товара.
    ///
    /// UpdateOfferContent - POST /businesses/{businessId}/offer-cards/update
    async fn update_offer_content(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::UpdateOfferContentPathParams,
            body: models::UpdateOfferContentRequest,
    ) -> Result<UpdateOfferContentResponse, String>;
}
