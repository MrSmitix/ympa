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
pub enum DeleteGoodsFeedbackCommentResponse {
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetGoodsFeedbackCommentsResponse {
    /// Дерево комментариев к отзыву.
    Status200
    (models::GetGoodsFeedbackCommentsResponse)
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
pub enum GetGoodsFeedbacksResponse {
    /// Список отзывов.
    Status200
    (models::GetGoodsFeedbackResponse)
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
pub enum SkipGoodsFeedbacksReactionResponse {
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UpdateGoodsFeedbackCommentResponse {
    /// Информация о добавленном или измененном комментарии.
    Status200
    (models::UpdateGoodsFeedbackCommentResponse)
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


/// DbsExpressFbsFbyGoodsFeedback
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsExpressFbsFbyGoodsFeedback {
    /// Удаление комментария к отзыву.
    ///
    /// DeleteGoodsFeedbackComment - POST /businesses/{businessId}/goods-feedback/comments/delete
    async fn delete_goods_feedback_comment(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::DeleteGoodsFeedbackCommentPathParams,
            body: models::DeleteGoodsFeedbackCommentRequest,
    ) -> Result<DeleteGoodsFeedbackCommentResponse, String>;

    /// Получение комментариев к отзыву.
    ///
    /// GetGoodsFeedbackComments - POST /businesses/{businessId}/goods-feedback/comments
    async fn get_goods_feedback_comments(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetGoodsFeedbackCommentsPathParams,
      query_params: models::GetGoodsFeedbackCommentsQueryParams,
            body: models::GetGoodsFeedbackCommentsRequest,
    ) -> Result<GetGoodsFeedbackCommentsResponse, String>;

    /// Получение отзывов о товарах продавца.
    ///
    /// GetGoodsFeedbacks - POST /businesses/{businessId}/goods-feedback
    async fn get_goods_feedbacks(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetGoodsFeedbacksPathParams,
      query_params: models::GetGoodsFeedbacksQueryParams,
            body: Option<models::GetGoodsFeedbackRequest>,
    ) -> Result<GetGoodsFeedbacksResponse, String>;

    /// Отказ от ответа на отзывы.
    ///
    /// SkipGoodsFeedbacksReaction - POST /businesses/{businessId}/goods-feedback/skip-reaction
    async fn skip_goods_feedbacks_reaction(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SkipGoodsFeedbacksReactionPathParams,
            body: models::SkipGoodsFeedbackReactionRequest,
    ) -> Result<SkipGoodsFeedbacksReactionResponse, String>;

    /// Добавление нового или изменение созданного комментария.
    ///
    /// UpdateGoodsFeedbackComment - POST /businesses/{businessId}/goods-feedback/comments/update
    async fn update_goods_feedback_comment(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::UpdateGoodsFeedbackCommentPathParams,
            body: models::UpdateGoodsFeedbackCommentRequest,
    ) -> Result<UpdateGoodsFeedbackCommentResponse, String>;
}
