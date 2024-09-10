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
pub enum GetCategoriesMaxSaleQuantumResponse {
    /// Лимит на установку кванта и минимального количества товаров.
    Status200
    (models::GetCategoriesMaxSaleQuantumResponse)
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
pub enum GetCategoriesTreeResponse {
    /// Категории Маркета.
    Status200
    (models::GetCategoriesResponse)
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


/// CategoriesDbsExpressFbsFby
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait CategoriesDbsExpressFbsFby {
    /// Лимит на установку кванта продажи и минимального количества товаров в заказе.
    ///
    /// GetCategoriesMaxSaleQuantum - POST /categories/max-sale-quantum
    async fn get_categories_max_sale_quantum(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
            body: models::GetCategoriesMaxSaleQuantumRequest,
    ) -> Result<GetCategoriesMaxSaleQuantumResponse, String>;

    /// Дерево категорий.
    ///
    /// GetCategoriesTree - POST /categories/tree
    async fn get_categories_tree(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
            body: Option<models::GetCategoriesRequest>,
    ) -> Result<GetCategoriesTreeResponse, String>;
}
