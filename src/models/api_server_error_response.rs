/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

/// ApiServerErrorResponse : Внутренняя ошибка сервера.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ApiServerErrorResponse {
    #[serde(rename = "status", skip_serializing_if = "Option::is_none")]
    pub status: Option<models::ApiResponseStatusType>,
    /// Список ошибок.
    #[serde(rename = "errors", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub errors: Option<Option<Vec<models::ApiErrorDto>>>,
}

impl ApiServerErrorResponse {
    /// Внутренняя ошибка сервера.
    pub fn new() -> ApiServerErrorResponse {
        ApiServerErrorResponse {
            status: None,
            errors: None,
        }
    }
}

