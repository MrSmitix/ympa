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
pub enum GetQualityRatingDetailsResponse {
    /// Информация о заказах, которые повлияли на индекс качества.
    Status200
    (models::GetQualityRatingDetailsResponse)
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


/// DbsExpressFbsRatings
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsExpressFbsRatings {
    /// Заказы, которые повлияли на индекс качества.
    ///
    /// GetQualityRatingDetails - POST /campaigns/{campaignId}/ratings/quality/details
    async fn get_quality_rating_details(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetQualityRatingDetailsPathParams,
    ) -> Result<GetQualityRatingDetailsResponse, String>;
}
