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
pub enum GetStocksResponse {
    /// Остатки товаров на складах.
    Status200
    (models::GetWarehouseStocksResponse)
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
    /// Превышено ограничение на доступ к ресурсу.
    Status420
    (models::ApiLimitErrorResponse)
    ,
    /// Внутренняя ошибка сервера.
    Status500
    (models::ApiServerErrorResponse)
}


/// DbsExpressFbsFbyStocks
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsExpressFbsFbyStocks {
    /// Информация об остатках и оборачиваемости.
    ///
    /// GetStocks - POST /campaigns/{campaignId}/offers/stocks
    async fn get_stocks(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetStocksPathParams,
      query_params: models::GetStocksQueryParams,
            body: Option<models::GetWarehouseStocksRequest>,
    ) -> Result<GetStocksResponse, String>;
}
