#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, unused_attributes, non_camel_case_types)]
#![allow(clippy::derive_partial_eq_without_eq, clippy::disallowed_names)]

use async_trait::async_trait;
use futures::Stream;
use std::error::Error;
use std::collections::BTreeSet;
use std::task::{Poll, Context};
use swagger::{ApiError, ContextWrapper};
use serde::{Serialize, Deserialize};
use crate::server::Authorization;


type ServiceError = Box<dyn Error + Send + Sync + 'static>;

pub const BASE_PATH: &str = "";
pub const API_VERSION: &str = "LATEST";

mod auth;
pub use auth::{AuthenticationApi, Claims};


#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetBidsInfoForBusinessResponse {
    /// Значения ставок для заданных товаров. В ответ попадают только товары, на которые установлены ставки.
    Status200
    (models::GetBidsInfoResponse)
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
pub enum GetBidsRecommendationsResponse {
    /// Рекомендованные ставки для заданных товаров.
    Status200
    (models::GetBidsRecommendationsResponse)
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
pub enum PutBidsForBusinessResponse {
    /// Все получилось: ставки установлены или обновлены. Если нужно, добавлены новые товары и запущена кампания. 
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
pub enum PutBidsForCampaignResponse {
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetBusinessSettingsResponse {
    /// Настройки кабинета.
    Status200
    (models::GetBusinessSettingsResponse)
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
pub enum GetCampaignsResponse {
    /// Магазины пользователя.
    Status200
    (models::GetCampaignsResponse)
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
pub enum GetCampaignResponse {
    /// Информация о магазине.
    Status200
    (models::GetCampaignResponse)
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
pub enum GetCampaignLoginsResponse {
    /// Список логинов, связанных с магазином.
    Status200
    (models::GetCampaignLoginsResponse)
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
pub enum GetCampaignRegionResponse {
    /// Возвращает регион, в котором находится магазин.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
    Status200
    (models::GetCampaignRegionResponse)
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
pub enum GetCampaignSettingsResponse {
    /// Настройки магазина.
    Status200
    (models::GetCampaignSettingsResponse)
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
pub enum GetCampaignsByLoginResponse {
    /// Информация о магазинах.
    Status200
    (models::GetCampaignsResponse)
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CreateChatResponse {
    /// Все получилось: чат создан. 
    Status200
    (models::CreateChatResponse)
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
pub enum GetChatHistoryResponse {
    /// История сообщений успешно получена. 
    Status200
    (models::GetChatHistoryResponse)
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
pub enum GetChatsResponse {
    /// Список чатов. 
    Status200
    (models::GetChatsResponse)
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
pub enum SendFileToChatResponse {
    /// Пустой ответ. Означает, что файл отправлен.
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
pub enum SendMessageToChatResponse {
    /// Пустой ответ. Означает, что сообщение отправлено.
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetDeliveryServicesResponse {
    /// Информация о службах доставки.
    Status200
    (models::GetDeliveryServicesResponse)
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
pub enum GetFeedbackAndCommentUpdatesResponse {
    /// Список отзывов для магазина.
    Status200
    (models::GetFeedbackListResponse)
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
pub enum GetFeedsResponse {
    /// Список прайс-листов.
    Status200
    (models::GetFeedsResponse)
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
pub enum GetFeedResponse {
    /// Информация о прайс-листе.
    Status200
    (models::GetFeedResponse)
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
pub enum GetFeedIndexLogsResponse {
    /// Отчет по индексации прайс-листа.
    Status200
    (models::GetFeedIndexLogsResponse)
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
pub enum RefreshFeedResponse {
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
pub enum SetFeedParamsResponse {
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetGoodsStatsResponse {
    /// Отчет по товарам.
    Status200
    (models::GetGoodsStatsResponse)
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
pub enum AddHiddenOffersResponse {
    /// Настройки скрытия получены и скоро вступят в силу.
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
pub enum DeleteHiddenOffersResponse {
    /// Показ товаров возобновлен.
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetHiddenOffersResponse {
    /// Информация о скрытых вами товарах.
    Status200
    (models::GetHiddenOffersResponse)
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum DeleteCampaignOffersResponse {
    /// Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине.
    Status200
    (models::DeleteCampaignOffersResponse)
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
pub enum GetAllOffersResponse {
    /// Предложения магазина.
    Status200
    (models::GetAllOffersResponse)
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
pub enum GetCampaignOffersResponse {
    /// Список товаров, размещенных в заданном магазине.
    Status200
    (models::GetCampaignOffersResponse)
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
pub enum GetOfferRecommendationsResponse {
    /// Список товаров с рекомендациями.
    Status200
    (models::GetOfferRecommendationsResponse)
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
pub enum GetOffersResponse {
    /// Предложения магазина.
    Status200
    (models::GetOffersResponse)
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
pub enum UpdateCampaignOffersResponse {
    /// Ответ 200 обозначает, что новые параметры получены Маркетом и скоро вступят в силу.
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetOrderBusinessBuyerInfoResponse {
    /// Информация о покупателе.
    Status200
    (models::GetBusinessBuyerInfoResponse)
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
pub enum GetOrderBusinessDocumentsInfoResponse {
    /// Информация о документах.
    Status200
    (models::GetBusinessDocumentsInfoResponse)
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
pub enum GetOrderBuyerInfoResponse {
    /// Информация о покупателе.
    Status200
    (models::GetOrderBuyerInfoResponse)
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
pub enum SetOrderDeliveryDateResponse {
    /// Успешное изменение даты доставки.
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
pub enum SetOrderDeliveryTrackCodeResponse {
    /// Трек‑номер посылки и идентификатор службы доставки были успешно переданы.
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
pub enum UpdateOrderStorageLimitResponse {
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
pub enum VerifyOrderEacResponse {
    /// Проверка кода выполнена успешно.
    Status200
    (models::VerifyOrderEacResponse)
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
pub enum GenerateOrderLabelsResponse {
    /// PDF‑файл с ярлыками на все коробки.
    PDF
    (swagger::ByteArray)
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
pub enum GetOrderLabelsDataResponse {
    /// Информация для печати ярлыков.
    Status200
    (models::GetOrderLabelsDataResponse)
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
pub enum GenerateOrderLabelResponse {
    /// PDF‑файл с ярлыками для коробки. Файл содержит одну страницу с ярлыком.
    PDF
    (swagger::ByteArray)
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
pub enum GetOrdersResponse {
    /// Информация о заказах.
    Status200
    (models::GetOrdersResponse)
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
pub enum UpdateOrderStatusesResponse {
    /// Возвращается информация об обновленных статусах заказов.
    Status200
    (models::UpdateOrderStatusesResponse)
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
pub enum AcceptOrderCancellationResponse {
    /// Ответ на отмену заказа был успешно передан.
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
pub enum GetOrderResponse {
    /// Информация о заказе.
    Status200
    (models::GetOrderResponse)
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
pub enum ProvideOrderDigitalCodesResponse {
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
pub enum ProvideOrderItemIdentifiersResponse {
    /// Ответ 200 обозначает, что коды успешно записались. Ответ содержит краткие сведения о промаркированных товарах.
    Status200
    (models::ProvideOrderItemIdentifiersResponse)
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
pub enum SetOrderBoxLayoutResponse {
    /// В ответ придет переданная раскладка с идентификаторами коробок — они понадобятся для запроса ярлыков. 
    Status200
    (models::SetOrderBoxLayoutResponse)
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
pub enum UpdateOrderItemsResponse {
    /// Маркет успешно обработал ваш запрос. Выходные данные не ожидаются.
    Status200
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
pub enum UpdateOrderStatusResponse {
    /// В случае успешного изменения статуса заказа возвращается обновленная информация о заказе.
    Status200
    (models::UpdateOrderStatusResponse)
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
pub enum SetOrderShipmentBoxesResponse {
    /// Имеет значение только тип ответа. Если ответ `ОК`, количество грузомест записано.
    Status200
    (models::SetOrderShipmentBoxesResponse)
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
pub enum GetOrdersStatsResponse {
    /// Информация по заказам.
    Status200
    (models::GetOrdersStatsResponse)
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
pub enum DeleteOutletLicensesResponse {
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
pub enum GetOutletLicensesResponse {
    /// Найденные лицензии собственных точек продаж.
    Status200
    (models::GetOutletLicensesResponse)
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
pub enum UpdateOutletLicensesResponse {
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
pub enum CreateOutletResponse {
    /// Информация о созданной точке продаж.
    Status200
    (models::CreateOutletResponse)
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
pub enum GetOutletsResponse {
    /// Информация о точках продаж.
    Status200
    (models::GetOutletsResponse)
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
pub enum DeleteOutletResponse {
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
pub enum GetOutletResponse {
    /// Информация о точке продаж.
    Status200
    (models::GetOutletResponse)
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
pub enum UpdateOutletResponse {
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
pub enum ConfirmBusinessPricesResponse {
    /// Ответ 200 обозначает, что цены подтверждены.
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ConfirmCampaignPricesResponse {
    /// Ответ 200 обозначает, что цены подтверждены.
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetBusinessQuarantineOffersResponse {
    /// Список товаров в карантине.
    Status200
    (models::GetQuarantineOffersResponse)
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
pub enum GetCampaignQuarantineOffersResponse {
    /// Список товаров в карантине.
    Status200
    (models::GetQuarantineOffersResponse)
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
pub enum GetPricesResponse {
    /// Список всех товаров с установленными ценами.
    Status200
    (models::GetPricesResponse)
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
pub enum GetPricesByOfferIdsResponse {
    /// Список товаров с установленными для заданного магазина ценами.
    Status200
    (models::GetPricesByOfferIdsResponse)
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
pub enum GetSuggestedPricesResponse {
    /// Список цен для продвижения на Маркете.
    Status200
    (models::SuggestPricesResponse)
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
pub enum UpdateBusinessPricesResponse {
    /// Маркет принял информацию о новых ценах.
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UpdatePricesResponse {
    /// Маркет принял информацию о новых ценах.
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetQualityRatingsResponse {
    /// Значение индекса качества магазинов и его составляющие.
    Status200
    (models::GetQualityRatingResponse)
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
pub enum SearchRegionsByNameResponse {
    /// Список найденных регионов.
    Status200
    (models::GetRegionsResponse)
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SearchRegionChildrenResponse {
    /// Регионы, являющиеся дочерними к указанному в запросе.
    Status200
    (models::GetRegionWithChildrenResponse)
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
pub enum SearchRegionsByIdResponse {
    /// Найденный регион.
    Status200
    (models::GetRegionsResponse)
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
pub enum GenerateBoostConsolidatedReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GenerateCompetitorsPositionReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GenerateGoodsFeedbackReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GenerateGoodsMovementReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GenerateGoodsRealizationReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GenerateGoodsTurnoverReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GenerateMassOrderLabelsReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый файл.  Если при генерации не удалось найти часть заказов, в ответе на запрос получения готового файла вернется подстатус `RESOURCE_NOT_FOUND`. 
    Status200
    (models::GenerateReportResponse)
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GeneratePricesReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GenerateShelfsStatisticsReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GenerateShipmentListDocumentReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый документ.
    Status200
    (models::GenerateReportResponse)
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GenerateShowsSalesReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GenerateStocksOnWarehousesReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GenerateUnitedMarketplaceServicesReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GenerateUnitedNettingReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GenerateUnitedOrdersReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetReportInfoResponse {
    /// Статус генерации отчета и ссылка, если она уже есть.  {% note tip %}  Если статус генерации отчета — `FAILED` или `NO_DATA`, проверьте корректность запроса на генерацию. Например, верно ли указан идентификатор магазина, период или номер платежного поручения.  {% endnote %}    
    Status200
    (models::GetReportInfoResponse)
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
pub enum GetReturnsResponse {
    /// Постраничные возвраты партнера.
    Status200
    (models::GetReturnsResponse)
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
pub enum GetReturnResponse {
    /// Детали возврата.
    Status200
    (models::GetReturnResponse)
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
pub enum GetReturnApplicationResponse {
    /// Заявление на возврат.
    Status200
    (swagger::ByteArray)
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
pub enum SetReturnDecisionResponse {
    /// Детали возврата.
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
pub enum SubmitReturnDecisionResponse {
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
    /// Внутренняя ошибка сервера.
    Status500
    (models::ApiServerErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetReturnPhotoResponse {
    /// Фотография возврата.
    Status200
    (swagger::ByteArray)
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
pub enum DownloadShipmentReceptionTransferActResponse {
    /// Акт приема-передачи в формате PDF.
    Status200
    (swagger::ByteArray)
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
pub enum SearchShipmentsResponse {
    /// Найденные отгрузки.
    Status200
    (models::SearchShipmentsResponse)
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
pub enum ConfirmShipmentResponse {
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
pub enum DownloadShipmentActResponse {
    /// Акт приема-передачи для отгрузки в формате PDF.
    Status200
    (swagger::ByteArray)
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
pub enum DownloadShipmentDiscrepancyActResponse {
    /// Акт расхождений в формате XLSX.
    Status200
    (swagger::ByteArray)
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
pub enum DownloadShipmentInboundActResponse {
    /// Акт в формате PDF.
    Status200
    (swagger::ByteArray)
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
pub enum DownloadShipmentPalletLabelsResponse {
    /// PDF‑файл с ярлыками на все упаковки в отгрузке.
    PDF
    (swagger::ByteArray)
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
pub enum DownloadShipmentTransportationWaybillResponse {
    /// Транспортная накладная в формате XLSX.
    Status200
    (swagger::ByteArray)
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
pub enum GetShipmentResponse {
    /// Найденная отгрузка.
    Status200
    (models::GetShipmentResponse)
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
pub enum GetShipmentOrdersInfoResponse {
    /// Информация по годным/негодным для печати ярлыков заказам в отгрузке.
    Status200
    (models::GetShipmentOrdersInfoResponse)
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
pub enum SetShipmentPalletsCountResponse {
    /// Имеет значение только тип ответа. Если ответ `ОК`, количество упаковок записано.
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
pub enum TransferOrdersFromShipmentResponse {
    /// Запрос на перенос заказов проверен и принят, и они будут перенесены спустя несколько минут.
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UpdateStocksResponse {
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
pub enum CalculateTariffsResponse {
    /// Стоимость услуг.
    Status200
    (models::CalculateTariffsResponse)
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
pub enum GetFulfillmentWarehousesResponse {
    /// Список складов.
    Status200
    (models::GetFulfillmentWarehousesResponse)
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
pub enum GetWarehousesResponse {
    /// Список складов и групп складов.
    Status200
    (models::GetWarehousesResponse)
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

/// API
#[async_trait]
#[allow(clippy::too_many_arguments, clippy::ptr_arg)]
pub trait Api<C: Send + Sync> {
    fn poll_ready(&self, _cx: &mut Context) -> Poll<Result<(), Box<dyn Error + Send + Sync + 'static>>> {
        Poll::Ready(Ok(()))
    }

    /// Информация об установленных ставках
    async fn get_bids_info_for_business(
        &self,
        business_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_bids_info_request: Option<models::GetBidsInfoRequest>,
        context: &C) -> Result<GetBidsInfoForBusinessResponse, ApiError>;

    /// Рекомендованные ставки для заданных товаров
    async fn get_bids_recommendations(
        &self,
        business_id: i64,
        get_bids_recommendations_request: models::GetBidsRecommendationsRequest,
        context: &C) -> Result<GetBidsRecommendationsResponse, ApiError>;

    /// Включение буста продаж и установка ставок
    async fn put_bids_for_business(
        &self,
        business_id: i64,
        put_sku_bids_request: models::PutSkuBidsRequest,
        context: &C) -> Result<PutBidsForBusinessResponse, ApiError>;

    /// Включение буста продаж и установка ставок для магазина
    async fn put_bids_for_campaign(
        &self,
        campaign_id: i64,
        put_sku_bids_request: models::PutSkuBidsRequest,
        context: &C) -> Result<PutBidsForCampaignResponse, ApiError>;

    /// Добавление товаров в архив
    async fn add_offers_to_archive(
        &self,
        business_id: i64,
        add_offers_to_archive_request: models::AddOffersToArchiveRequest,
        context: &C) -> Result<AddOffersToArchiveResponse, ApiError>;

    /// Удаление товаров из каталога
    async fn delete_offers(
        &self,
        business_id: i64,
        delete_offers_request: models::DeleteOffersRequest,
        context: &C) -> Result<DeleteOffersResponse, ApiError>;

    /// Удаление товаров из архива
    async fn delete_offers_from_archive(
        &self,
        business_id: i64,
        delete_offers_from_archive_request: models::DeleteOffersFromArchiveRequest,
        context: &C) -> Result<DeleteOffersFromArchiveResponse, ApiError>;

    /// Информация о товарах в каталоге
    async fn get_offer_mappings(
        &self,
        business_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_offer_mappings_request: Option<models::GetOfferMappingsRequest>,
        context: &C) -> Result<GetOfferMappingsResponse, ApiError>;

    /// Просмотр карточек на Маркете, которые подходят вашим товарам
    async fn get_suggested_offer_mappings(
        &self,
        business_id: i64,
        get_suggested_offer_mappings_request: Option<models::GetSuggestedOfferMappingsRequest>,
        context: &C) -> Result<GetSuggestedOfferMappingsResponse, ApiError>;

    /// Добавление товаров в каталог и изменение информации о них
    async fn update_offer_mappings(
        &self,
        business_id: i64,
        update_offer_mappings_request: models::UpdateOfferMappingsRequest,
        context: &C) -> Result<UpdateOfferMappingsResponse, ApiError>;

    /// Настройки кабинета
    async fn get_business_settings(
        &self,
        business_id: i64,
        context: &C) -> Result<GetBusinessSettingsResponse, ApiError>;

    /// Список магазинов пользователя
    async fn get_campaigns(
        &self,
        page: Option<i32>,
        page_size: Option<i32>,
        context: &C) -> Result<GetCampaignsResponse, ApiError>;

    /// Информация о магазине
    async fn get_campaign(
        &self,
        campaign_id: i64,
        context: &C) -> Result<GetCampaignResponse, ApiError>;

    /// Логины, связанные с магазином
    async fn get_campaign_logins(
        &self,
        campaign_id: i64,
        context: &C) -> Result<GetCampaignLoginsResponse, ApiError>;

    /// Регион магазина
    async fn get_campaign_region(
        &self,
        campaign_id: i64,
        context: &C) -> Result<GetCampaignRegionResponse, ApiError>;

    /// Настройки магазина
    async fn get_campaign_settings(
        &self,
        campaign_id: i64,
        context: &C) -> Result<GetCampaignSettingsResponse, ApiError>;

    /// Магазины, доступные логину
    async fn get_campaigns_by_login(
        &self,
        login: String,
        page: Option<i32>,
        page_size: Option<i32>,
        context: &C) -> Result<GetCampaignsByLoginResponse, ApiError>;

    /// Лимит на установку кванта продажи и минимального количества товаров в заказе
    async fn get_categories_max_sale_quantum(
        &self,
        get_categories_max_sale_quantum_request: models::GetCategoriesMaxSaleQuantumRequest,
        context: &C) -> Result<GetCategoriesMaxSaleQuantumResponse, ApiError>;

    /// Дерево категорий
    async fn get_categories_tree(
        &self,
        get_categories_request: Option<models::GetCategoriesRequest>,
        context: &C) -> Result<GetCategoriesTreeResponse, ApiError>;

    /// Создание нового чата с покупателем
    async fn create_chat(
        &self,
        business_id: i64,
        create_chat_request: models::CreateChatRequest,
        context: &C) -> Result<CreateChatResponse, ApiError>;

    /// Получение истории сообщений в чате
    async fn get_chat_history(
        &self,
        business_id: i64,
        chat_id: i64,
        get_chat_history_request: models::GetChatHistoryRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<GetChatHistoryResponse, ApiError>;

    /// Получение доступных чатов
    async fn get_chats(
        &self,
        business_id: i64,
        get_chats_request: models::GetChatsRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<GetChatsResponse, ApiError>;

    /// Отправка файла в чат
    async fn send_file_to_chat(
        &self,
        business_id: i64,
        chat_id: i64,
        file: swagger::ByteArray,
        context: &C) -> Result<SendFileToChatResponse, ApiError>;

    /// Отправка сообщения в чат
    async fn send_message_to_chat(
        &self,
        business_id: i64,
        chat_id: i64,
        send_message_to_chat_request: models::SendMessageToChatRequest,
        context: &C) -> Result<SendMessageToChatResponse, ApiError>;

    /// Списки характеристик товаров по категориям
    async fn get_category_content_parameters(
        &self,
        category_id: i64,
        context: &C) -> Result<GetCategoryContentParametersResponse, ApiError>;

    /// Получение информации о заполненности карточек магазина
    async fn get_offer_cards_content_status(
        &self,
        business_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_offer_cards_content_status_request: Option<models::GetOfferCardsContentStatusRequest>,
        context: &C) -> Result<GetOfferCardsContentStatusResponse, ApiError>;

    /// Редактирование категорийных характеристик товара
    async fn update_offer_content(
        &self,
        business_id: i64,
        update_offer_content_request: models::UpdateOfferContentRequest,
        context: &C) -> Result<UpdateOfferContentResponse, ApiError>;

    /// Справочник служб доставки
    async fn get_delivery_services(
        &self,
        context: &C) -> Result<GetDeliveryServicesResponse, ApiError>;

    /// Новые и обновленные отзывы о магазине
    async fn get_feedback_and_comment_updates(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        from_date: Option<chrono::naive::NaiveDate>,
        context: &C) -> Result<GetFeedbackAndCommentUpdatesResponse, ApiError>;

    /// Список прайс-листов магазина
    async fn get_feeds(
        &self,
        campaign_id: i64,
        context: &C) -> Result<GetFeedsResponse, ApiError>;

    /// Информация о прайс-листе
    async fn get_feed(
        &self,
        campaign_id: i64,
        feed_id: i64,
        context: &C) -> Result<GetFeedResponse, ApiError>;

    /// Отчет по индексации прайс-листа
    async fn get_feed_index_logs(
        &self,
        campaign_id: i64,
        feed_id: i64,
        limit: Option<i32>,
        published_time_from: Option<chrono::DateTime::<chrono::Utc>>,
        published_time_to: Option<chrono::DateTime::<chrono::Utc>>,
        status: Option<models::FeedIndexLogsStatusType>,
        context: &C) -> Result<GetFeedIndexLogsResponse, ApiError>;

    /// Сообщить, что прайс-лист обновился
    async fn refresh_feed(
        &self,
        campaign_id: i64,
        feed_id: i64,
        context: &C) -> Result<RefreshFeedResponse, ApiError>;

    /// Изменение параметров прайс-листа
    async fn set_feed_params(
        &self,
        campaign_id: i64,
        feed_id: i64,
        set_feed_params_request: models::SetFeedParamsRequest,
        context: &C) -> Result<SetFeedParamsResponse, ApiError>;

    /// Удаление комментария к отзыву
    async fn delete_goods_feedback_comment(
        &self,
        business_id: i64,
        delete_goods_feedback_comment_request: models::DeleteGoodsFeedbackCommentRequest,
        context: &C) -> Result<DeleteGoodsFeedbackCommentResponse, ApiError>;

    /// Получение комментариев к отзыву
    async fn get_goods_feedback_comments(
        &self,
        business_id: i64,
        get_goods_feedback_comments_request: models::GetGoodsFeedbackCommentsRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<GetGoodsFeedbackCommentsResponse, ApiError>;

    /// Получение отзывов о товарах продавца
    async fn get_goods_feedbacks(
        &self,
        business_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_goods_feedback_request: Option<models::GetGoodsFeedbackRequest>,
        context: &C) -> Result<GetGoodsFeedbacksResponse, ApiError>;

    /// Отказ от ответа на отзывы
    async fn skip_goods_feedbacks_reaction(
        &self,
        business_id: i64,
        skip_goods_feedback_reaction_request: models::SkipGoodsFeedbackReactionRequest,
        context: &C) -> Result<SkipGoodsFeedbacksReactionResponse, ApiError>;

    /// Добавление нового или изменение созданного комментария
    async fn update_goods_feedback_comment(
        &self,
        business_id: i64,
        update_goods_feedback_comment_request: models::UpdateGoodsFeedbackCommentRequest,
        context: &C) -> Result<UpdateGoodsFeedbackCommentResponse, ApiError>;

    /// Отчет по товарам
    async fn get_goods_stats(
        &self,
        campaign_id: i64,
        get_goods_stats_request: models::GetGoodsStatsRequest,
        context: &C) -> Result<GetGoodsStatsResponse, ApiError>;

    /// Скрытие товаров и настройки скрытия
    async fn add_hidden_offers(
        &self,
        campaign_id: i64,
        add_hidden_offers_request: models::AddHiddenOffersRequest,
        context: &C) -> Result<AddHiddenOffersResponse, ApiError>;

    /// Возобновление показа товаров
    async fn delete_hidden_offers(
        &self,
        campaign_id: i64,
        delete_hidden_offers_request: models::DeleteHiddenOffersRequest,
        context: &C) -> Result<DeleteHiddenOffersResponse, ApiError>;

    /// Информация о скрытых вами товарах
    async fn get_hidden_offers(
        &self,
        campaign_id: i64,
        offer_id: Option<&Vec<models::ShopSku>>,
        page_token: Option<String>,
        limit: Option<i32>,
        offset: Option<i32>,
        page: Option<i32>,
        page_size: Option<i32>,
        context: &C) -> Result<GetHiddenOffersResponse, ApiError>;

    /// Информация о нескольких моделях
    async fn get_models(
        &self,
        region_id: i64,
        get_models_request: models::GetModelsRequest,
        currency: Option<models::CurrencyType>,
        context: &C) -> Result<GetModelsResponse, ApiError>;

    /// Список предложений для нескольких моделей
    async fn get_models_offers(
        &self,
        region_id: i64,
        get_models_request: models::GetModelsRequest,
        currency: Option<models::CurrencyType>,
        order_by_price: Option<models::SortOrderType>,
        context: &C) -> Result<GetModelsOffersResponse, ApiError>;

    /// Поиск модели товара
    async fn search_models(
        &self,
        query: String,
        region_id: i64,
        currency: Option<models::CurrencyType>,
        page: Option<i32>,
        page_size: Option<i32>,
        context: &C) -> Result<SearchModelsResponse, ApiError>;

    /// Информация об одной модели
    async fn get_model(
        &self,
        model_id: i64,
        region_id: i64,
        currency: Option<models::CurrencyType>,
        context: &C) -> Result<GetModelResponse, ApiError>;

    /// Список предложений для одной модели
    async fn get_model_offers(
        &self,
        model_id: i64,
        region_id: i64,
        currency: Option<models::CurrencyType>,
        order_by_price: Option<models::SortOrderType>,
        count: Option<i32>,
        page: Option<i32>,
        context: &C) -> Result<GetModelOffersResponse, ApiError>;

    /// Список товаров в каталоге
    async fn get_offer_mapping_entries(
        &self,
        campaign_id: i64,
        offer_id: Option<&Vec<String>>,
        shop_sku: Option<&Vec<models::ShopSku>>,
        mapping_kind: Option<models::OfferMappingKindType>,
        status: Option<&Vec<models::OfferProcessingStatusType>>,
        availability: Option<&Vec<models::OfferAvailabilityStatusType>>,
        category_id: Option<&Vec<i32>>,
        vendor: Option<&Vec<String>>,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<GetOfferMappingEntriesResponse, ApiError>;

    /// Рекомендованные карточки для товаров
    async fn get_suggested_offer_mapping_entries(
        &self,
        campaign_id: i64,
        get_suggested_offer_mapping_entries_request: models::GetSuggestedOfferMappingEntriesRequest,
        context: &C) -> Result<GetSuggestedOfferMappingEntriesResponse, ApiError>;

    /// Добавление и редактирование товаров в каталоге
    async fn update_offer_mapping_entries(
        &self,
        campaign_id: i64,
        update_offer_mapping_entry_request: models::UpdateOfferMappingEntryRequest,
        context: &C) -> Result<UpdateOfferMappingEntriesResponse, ApiError>;

    /// Удаление товаров из ассортимента магазина
    async fn delete_campaign_offers(
        &self,
        campaign_id: i64,
        delete_campaign_offers_request: models::DeleteCampaignOffersRequest,
        context: &C) -> Result<DeleteCampaignOffersResponse, ApiError>;

    /// Все предложения магазина
    async fn get_all_offers(
        &self,
        campaign_id: i64,
        feed_id: Option<i64>,
        chunk: Option<i32>,
        context: &C) -> Result<GetAllOffersResponse, ApiError>;

    /// Информация о товарах, которые размещены в заданном магазине
    async fn get_campaign_offers(
        &self,
        campaign_id: i64,
        get_campaign_offers_request: models::GetCampaignOffersRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<GetCampaignOffersResponse, ApiError>;

    /// Рекомендации Маркета, касающиеся цен
    async fn get_offer_recommendations(
        &self,
        business_id: i64,
        get_offer_recommendations_request: models::GetOfferRecommendationsRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<GetOfferRecommendationsResponse, ApiError>;

    /// Предложения магазина
    async fn get_offers(
        &self,
        campaign_id: i64,
        query: Option<String>,
        feed_id: Option<i64>,
        shop_category_id: Option<String>,
        currency: Option<models::CurrencyType>,
        matched: Option<bool>,
        page: Option<i32>,
        page_size: Option<i32>,
        context: &C) -> Result<GetOffersResponse, ApiError>;

    /// Изменение условий продажи товаров в магазине
    async fn update_campaign_offers(
        &self,
        campaign_id: i64,
        update_campaign_offers_request: models::UpdateCampaignOffersRequest,
        context: &C) -> Result<UpdateCampaignOffersResponse, ApiError>;

    /// Информация о покупателе — юридическом лице
    async fn get_order_business_buyer_info(
        &self,
        campaign_id: i64,
        order_id: i64,
        context: &C) -> Result<GetOrderBusinessBuyerInfoResponse, ApiError>;

    /// Информация о документах
    async fn get_order_business_documents_info(
        &self,
        campaign_id: i64,
        order_id: i64,
        context: &C) -> Result<GetOrderBusinessDocumentsInfoResponse, ApiError>;

    /// Информация о покупателе — физическом лице
    async fn get_order_buyer_info(
        &self,
        campaign_id: i64,
        order_id: i64,
        context: &C) -> Result<GetOrderBuyerInfoResponse, ApiError>;

    /// Изменение даты доставки заказа
    async fn set_order_delivery_date(
        &self,
        campaign_id: i64,
        order_id: i64,
        set_order_delivery_date_request: models::SetOrderDeliveryDateRequest,
        context: &C) -> Result<SetOrderDeliveryDateResponse, ApiError>;

    /// Передача трек‑номера посылки
    async fn set_order_delivery_track_code(
        &self,
        campaign_id: i64,
        order_id: i64,
        set_order_delivery_track_code_request: models::SetOrderDeliveryTrackCodeRequest,
        context: &C) -> Result<SetOrderDeliveryTrackCodeResponse, ApiError>;

    /// Продление срока хранения заказа
    async fn update_order_storage_limit(
        &self,
        campaign_id: i64,
        order_id: i64,
        update_order_storage_limit_request: models::UpdateOrderStorageLimitRequest,
        context: &C) -> Result<UpdateOrderStorageLimitResponse, ApiError>;

    /// Передача кода подтверждения
    async fn verify_order_eac(
        &self,
        campaign_id: i64,
        order_id: i64,
        verify_order_eac_request: models::VerifyOrderEacRequest,
        context: &C) -> Result<VerifyOrderEacResponse, ApiError>;

    /// Готовые ярлыки‑наклейки на все коробки в одном заказе
    async fn generate_order_labels(
        &self,
        campaign_id: i64,
        order_id: i64,
        format: Option<models::PageFormatType>,
        context: &C) -> Result<GenerateOrderLabelsResponse, ApiError>;

    /// Данные для самостоятельного изготовления ярлыков
    async fn get_order_labels_data(
        &self,
        campaign_id: i64,
        order_id: i64,
        context: &C) -> Result<GetOrderLabelsDataResponse, ApiError>;

    /// Готовый ярлык‑наклейка для коробки в заказе
    async fn generate_order_label(
        &self,
        campaign_id: i64,
        order_id: i64,
        shipment_id: i64,
        box_id: i64,
        format: Option<models::PageFormatType>,
        context: &C) -> Result<GenerateOrderLabelResponse, ApiError>;

    /// Информация о нескольких заказах
    async fn get_orders(
        &self,
        campaign_id: i64,
        order_ids: Option<&Vec<i64>>,
        status: Option<&Vec<models::OrderStatusType>>,
        substatus: Option<&Vec<models::OrderSubstatusType>>,
        from_date: Option<chrono::naive::NaiveDate>,
        to_date: Option<chrono::naive::NaiveDate>,
        supplier_shipment_date_from: Option<chrono::naive::NaiveDate>,
        supplier_shipment_date_to: Option<chrono::naive::NaiveDate>,
        updated_at_from: Option<chrono::DateTime::<chrono::Utc>>,
        updated_at_to: Option<chrono::DateTime::<chrono::Utc>>,
        dispatch_type: Option<models::OrderDeliveryDispatchType>,
        fake: Option<bool>,
        has_cis: Option<bool>,
        only_waiting_for_cancellation_approve: Option<bool>,
        only_estimated_delivery: Option<bool>,
        buyer_type: Option<models::OrderBuyerType>,
        page: Option<i32>,
        page_size: Option<i32>,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<GetOrdersResponse, ApiError>;

    /// Изменение статусов нескольких заказов
    async fn update_order_statuses(
        &self,
        campaign_id: i64,
        update_order_statuses_request: models::UpdateOrderStatusesRequest,
        context: &C) -> Result<UpdateOrderStatusesResponse, ApiError>;

    /// Отмена заказа покупателем
    async fn accept_order_cancellation(
        &self,
        campaign_id: i64,
        order_id: i64,
        accept_order_cancellation_request: models::AcceptOrderCancellationRequest,
        context: &C) -> Result<AcceptOrderCancellationResponse, ApiError>;

    /// Информация об одном заказе
    async fn get_order(
        &self,
        campaign_id: i64,
        order_id: i64,
        context: &C) -> Result<GetOrderResponse, ApiError>;

    /// Передача ключей цифровых товаров
    async fn provide_order_digital_codes(
        &self,
        campaign_id: i64,
        order_id: i64,
        provide_order_digital_codes_request: models::ProvideOrderDigitalCodesRequest,
        context: &C) -> Result<ProvideOrderDigitalCodesResponse, ApiError>;

    /// Передача кодов маркировки единиц товара
    async fn provide_order_item_identifiers(
        &self,
        campaign_id: i64,
        order_id: i64,
        provide_order_item_identifiers_request: models::ProvideOrderItemIdentifiersRequest,
        context: &C) -> Result<ProvideOrderItemIdentifiersResponse, ApiError>;

    /// Подготовка заказа
    async fn set_order_box_layout(
        &self,
        campaign_id: i64,
        order_id: i64,
        set_order_box_layout_request: models::SetOrderBoxLayoutRequest,
        context: &C) -> Result<SetOrderBoxLayoutResponse, ApiError>;

    /// Удаление товара из заказа или уменьшение числа единиц
    async fn update_order_items(
        &self,
        campaign_id: i64,
        order_id: i64,
        update_order_item_request: models::UpdateOrderItemRequest,
        context: &C) -> Result<UpdateOrderItemsResponse, ApiError>;

    /// Изменение статуса одного заказа
    async fn update_order_status(
        &self,
        campaign_id: i64,
        order_id: i64,
        update_order_status_request: models::UpdateOrderStatusRequest,
        context: &C) -> Result<UpdateOrderStatusResponse, ApiError>;

    /// Передача количества грузовых мест в заказе
    async fn set_order_shipment_boxes(
        &self,
        campaign_id: i64,
        order_id: i64,
        shipment_id: i64,
        set_order_shipment_boxes_request: models::SetOrderShipmentBoxesRequest,
        context: &C) -> Result<SetOrderShipmentBoxesResponse, ApiError>;

    /// Детальная информация по заказам
    async fn get_orders_stats(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_orders_stats_request: Option<models::GetOrdersStatsRequest>,
        context: &C) -> Result<GetOrdersStatsResponse, ApiError>;

    /// Удаление лицензий для точек продаж
    async fn delete_outlet_licenses(
        &self,
        campaign_id: i64,
        ids: Option<&Vec<i64>>,
        context: &C) -> Result<DeleteOutletLicensesResponse, ApiError>;

    /// Информация о лицензиях для точек продаж
    async fn get_outlet_licenses(
        &self,
        campaign_id: i64,
        outlet_ids: Option<&Vec<i64>>,
        ids: Option<&Vec<i64>>,
        context: &C) -> Result<GetOutletLicensesResponse, ApiError>;

    /// Создание и изменение лицензий для точек продаж
    async fn update_outlet_licenses(
        &self,
        campaign_id: i64,
        update_outlet_license_request: models::UpdateOutletLicenseRequest,
        context: &C) -> Result<UpdateOutletLicensesResponse, ApiError>;

    /// Создание точки продаж
    async fn create_outlet(
        &self,
        campaign_id: i64,
        change_outlet_request: models::ChangeOutletRequest,
        context: &C) -> Result<CreateOutletResponse, ApiError>;

    /// Информация о нескольких точках продаж
    async fn get_outlets(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        region_id: Option<i64>,
        shop_outlet_code: Option<String>,
        region_id2: Option<i64>,
        context: &C) -> Result<GetOutletsResponse, ApiError>;

    /// Удаление точки продаж
    async fn delete_outlet(
        &self,
        campaign_id: i64,
        outlet_id: i64,
        context: &C) -> Result<DeleteOutletResponse, ApiError>;

    /// Информация об одной точке продаж
    async fn get_outlet(
        &self,
        campaign_id: i64,
        outlet_id: i64,
        context: &C) -> Result<GetOutletResponse, ApiError>;

    /// Изменение информации о точке продаж
    async fn update_outlet(
        &self,
        campaign_id: i64,
        outlet_id: i64,
        change_outlet_request: models::ChangeOutletRequest,
        context: &C) -> Result<UpdateOutletResponse, ApiError>;

    /// Удаление товара из карантина по цене в кабинете
    async fn confirm_business_prices(
        &self,
        business_id: i64,
        confirm_prices_request: models::ConfirmPricesRequest,
        context: &C) -> Result<ConfirmBusinessPricesResponse, ApiError>;

    /// Удаление товара из карантина по цене в магазине
    async fn confirm_campaign_prices(
        &self,
        campaign_id: i64,
        confirm_prices_request: models::ConfirmPricesRequest,
        context: &C) -> Result<ConfirmCampaignPricesResponse, ApiError>;

    /// Список товаров, находящихся в карантине по цене в кабинете
    async fn get_business_quarantine_offers(
        &self,
        business_id: i64,
        get_quarantine_offers_request: models::GetQuarantineOffersRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<GetBusinessQuarantineOffersResponse, ApiError>;

    /// Список товаров, находящихся в карантине по цене в магазине
    async fn get_campaign_quarantine_offers(
        &self,
        campaign_id: i64,
        get_quarantine_offers_request: models::GetQuarantineOffersRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<GetCampaignQuarantineOffersResponse, ApiError>;

    /// Список цен
    async fn get_prices(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        archived: Option<bool>,
        context: &C) -> Result<GetPricesResponse, ApiError>;

    /// Просмотр цен на указанные товары в магазине
    async fn get_prices_by_offer_ids(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_prices_by_offer_ids_request: Option<models::GetPricesByOfferIdsRequest>,
        context: &C) -> Result<GetPricesByOfferIdsResponse, ApiError>;

    /// Цены для продвижения товаров
    async fn get_suggested_prices(
        &self,
        campaign_id: i64,
        suggest_prices_request: models::SuggestPricesRequest,
        context: &C) -> Result<GetSuggestedPricesResponse, ApiError>;

    /// Установка цен на товары во всех магазинах
    async fn update_business_prices(
        &self,
        business_id: i64,
        update_business_prices_request: models::UpdateBusinessPricesRequest,
        context: &C) -> Result<UpdateBusinessPricesResponse, ApiError>;

    /// Установка цен на товары в конкретном магазине
    async fn update_prices(
        &self,
        campaign_id: i64,
        update_prices_request: models::UpdatePricesRequest,
        context: &C) -> Result<UpdatePricesResponse, ApiError>;

    /// Удаление товаров из акции
    async fn delete_promo_offers(
        &self,
        business_id: i64,
        delete_promo_offers_request: models::DeletePromoOffersRequest,
        context: &C) -> Result<DeletePromoOffersResponse, ApiError>;

    /// Получение списка товаров, которые участвуют или могут участвовать в акции
    async fn get_promo_offers(
        &self,
        business_id: i64,
        get_promo_offers_request: models::GetPromoOffersRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<GetPromoOffersResponse, ApiError>;

    /// Получение списка акций
    async fn get_promos(
        &self,
        business_id: i64,
        get_promos_request: Option<models::GetPromosRequest>,
        context: &C) -> Result<GetPromosResponse, ApiError>;

    /// Добавление товаров в акцию или изменение их цен
    async fn update_promo_offers(
        &self,
        business_id: i64,
        update_promo_offers_request: models::UpdatePromoOffersRequest,
        context: &C) -> Result<UpdatePromoOffersResponse, ApiError>;

    /// Заказы, которые повлияли на индекс качества
    async fn get_quality_rating_details(
        &self,
        campaign_id: i64,
        context: &C) -> Result<GetQualityRatingDetailsResponse, ApiError>;

    /// Индекс качества магазинов
    async fn get_quality_ratings(
        &self,
        business_id: i64,
        get_quality_rating_request: models::GetQualityRatingRequest,
        context: &C) -> Result<GetQualityRatingsResponse, ApiError>;

    /// Поиск регионов по их имени
    async fn search_regions_by_name(
        &self,
        name: String,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<SearchRegionsByNameResponse, ApiError>;

    /// Информация о дочерних регионах
    async fn search_region_children(
        &self,
        region_id: i64,
        page: Option<i32>,
        page_size: Option<i32>,
        context: &C) -> Result<SearchRegionChildrenResponse, ApiError>;

    /// Информация о регионе
    async fn search_regions_by_id(
        &self,
        region_id: i64,
        context: &C) -> Result<SearchRegionsByIdResponse, ApiError>;

    /// Отчет по бусту продаж
    async fn generate_boost_consolidated_report(
        &self,
        generate_boost_consolidated_request: models::GenerateBoostConsolidatedRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateBoostConsolidatedReportResponse, ApiError>;

    /// Отчет «Конкурентная позиция»
    async fn generate_competitors_position_report(
        &self,
        generate_competitors_position_report_request: models::GenerateCompetitorsPositionReportRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateCompetitorsPositionReportResponse, ApiError>;

    /// Отчет по отзывам о товарах
    async fn generate_goods_feedback_report(
        &self,
        generate_goods_feedback_request: models::GenerateGoodsFeedbackRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateGoodsFeedbackReportResponse, ApiError>;

    /// Отчет по движению товаров
    async fn generate_goods_movement_report(
        &self,
        generate_goods_movement_report_request: models::GenerateGoodsMovementReportRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateGoodsMovementReportResponse, ApiError>;

    /// Отчет по реализации
    async fn generate_goods_realization_report(
        &self,
        generate_goods_realization_report_request: models::GenerateGoodsRealizationReportRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateGoodsRealizationReportResponse, ApiError>;

    /// Отчет по оборачиваемости
    async fn generate_goods_turnover_report(
        &self,
        generate_goods_turnover_request: models::GenerateGoodsTurnoverRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateGoodsTurnoverReportResponse, ApiError>;

    /// Готовые ярлыки‑наклейки на все коробки в нескольких заказах
    async fn generate_mass_order_labels_report(
        &self,
        generate_mass_order_labels_request: models::GenerateMassOrderLabelsRequest,
        format: Option<models::PageFormatType>,
        context: &C) -> Result<GenerateMassOrderLabelsReportResponse, ApiError>;

    /// Отчет «Цены на рынке»
    async fn generate_prices_report(
        &self,
        generate_prices_report_request: models::GeneratePricesReportRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GeneratePricesReportResponse, ApiError>;

    /// Отчет по полкам
    async fn generate_shelfs_statistics_report(
        &self,
        generate_shelfs_statistics_request: models::GenerateShelfsStatisticsRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateShelfsStatisticsReportResponse, ApiError>;

    /// Получение листа сборки
    async fn generate_shipment_list_document_report(
        &self,
        generate_shipment_list_document_report_request: models::GenerateShipmentListDocumentReportRequest,
        context: &C) -> Result<GenerateShipmentListDocumentReportResponse, ApiError>;

    /// Отчет «Аналитика продаж»
    async fn generate_shows_sales_report(
        &self,
        generate_shows_sales_report_request: models::GenerateShowsSalesReportRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateShowsSalesReportResponse, ApiError>;

    /// Отчет по остаткам на складах
    async fn generate_stocks_on_warehouses_report(
        &self,
        generate_stocks_on_warehouses_report_request: models::GenerateStocksOnWarehousesReportRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateStocksOnWarehousesReportResponse, ApiError>;

    /// Отчет по стоимости услуг
    async fn generate_united_marketplace_services_report(
        &self,
        generate_united_marketplace_services_report_request: models::GenerateUnitedMarketplaceServicesReportRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateUnitedMarketplaceServicesReportResponse, ApiError>;

    /// Отчет по платежам
    async fn generate_united_netting_report(
        &self,
        generate_united_netting_report_request: models::GenerateUnitedNettingReportRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateUnitedNettingReportResponse, ApiError>;

    /// Отчет по заказам
    async fn generate_united_orders_report(
        &self,
        generate_united_orders_request: models::GenerateUnitedOrdersRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateUnitedOrdersReportResponse, ApiError>;

    /// Получение заданного отчета
    async fn get_report_info(
        &self,
        report_id: String,
        context: &C) -> Result<GetReportInfoResponse, ApiError>;

    /// Список невыкупов и возвратов
    async fn get_returns(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        order_ids: Option<&Vec<i64>>,
        statuses: Option<&Vec<models::RefundStatusType>>,
        r#type: Option<models::ReturnType>,
        from_date: Option<chrono::naive::NaiveDate>,
        to_date: Option<chrono::naive::NaiveDate>,
        from_date2: Option<chrono::naive::NaiveDate>,
        to_date2: Option<chrono::naive::NaiveDate>,
        context: &C) -> Result<GetReturnsResponse, ApiError>;

    /// Информация о невыкупе или возврате
    async fn get_return(
        &self,
        campaign_id: i64,
        order_id: i64,
        return_id: i64,
        context: &C) -> Result<GetReturnResponse, ApiError>;

    /// Получение заявления на возврат
    async fn get_return_application(
        &self,
        campaign_id: i64,
        order_id: i64,
        return_id: i64,
        context: &C) -> Result<GetReturnApplicationResponse, ApiError>;

    /// Принятие или изменение решения по возврату
    async fn set_return_decision(
        &self,
        campaign_id: i64,
        order_id: i64,
        return_id: i64,
        set_return_decision_request: models::SetReturnDecisionRequest,
        context: &C) -> Result<SetReturnDecisionResponse, ApiError>;

    /// Подтверждение решения по возврату
    async fn submit_return_decision(
        &self,
        campaign_id: i64,
        order_id: i64,
        return_id: i64,
        context: &C) -> Result<SubmitReturnDecisionResponse, ApiError>;

    /// Получение фотографии возврата
    async fn get_return_photo(
        &self,
        campaign_id: i64,
        order_id: i64,
        return_id: i64,
        item_id: i64,
        image_hash: String,
        context: &C) -> Result<GetReturnPhotoResponse, ApiError>;

    /// Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
    async fn download_shipment_reception_transfer_act(
        &self,
        campaign_id: i64,
        warehouse_id: Option<i32>,
        context: &C) -> Result<DownloadShipmentReceptionTransferActResponse, ApiError>;

    /// Получение информации о нескольких отгрузках
    async fn search_shipments(
        &self,
        campaign_id: i64,
        search_shipments_request: models::SearchShipmentsRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<SearchShipmentsResponse, ApiError>;

    /// Подтверждение отгрузки
    async fn confirm_shipment(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        confirm_shipment_request: Option<models::ConfirmShipmentRequest>,
        context: &C) -> Result<ConfirmShipmentResponse, ApiError>;

    /// Получение акта приема-передачи
    async fn download_shipment_act(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        context: &C) -> Result<DownloadShipmentActResponse, ApiError>;

    /// Получение акта расхождений
    async fn download_shipment_discrepancy_act(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        context: &C) -> Result<DownloadShipmentDiscrepancyActResponse, ApiError>;

    /// Получение фактического акта приема-передачи
    async fn download_shipment_inbound_act(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        context: &C) -> Result<DownloadShipmentInboundActResponse, ApiError>;

    /// Ярлыки для доверительной приемки (FBS)
    async fn download_shipment_pallet_labels(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        format: Option<models::ShipmentPalletLabelPageFormatType>,
        context: &C) -> Result<DownloadShipmentPalletLabelsResponse, ApiError>;

    /// Получение транспортной накладной
    async fn download_shipment_transportation_waybill(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        context: &C) -> Result<DownloadShipmentTransportationWaybillResponse, ApiError>;

    /// Получение информации об одной отгрузке
    async fn get_shipment(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        cancelled_orders: Option<bool>,
        context: &C) -> Result<GetShipmentResponse, ApiError>;

    /// Получение информации о возможности печати ярлыков (FBS)
    async fn get_shipment_orders_info(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        context: &C) -> Result<GetShipmentOrdersInfoResponse, ApiError>;

    /// Передача количества упаковок в отгрузке
    async fn set_shipment_pallets_count(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        set_shipment_pallets_count_request: models::SetShipmentPalletsCountRequest,
        context: &C) -> Result<SetShipmentPalletsCountResponse, ApiError>;

    /// Перенос заказов в следующую отгрузку
    async fn transfer_orders_from_shipment(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        transfer_orders_from_shipment_request: models::TransferOrdersFromShipmentRequest,
        context: &C) -> Result<TransferOrdersFromShipmentResponse, ApiError>;

    /// Информация об остатках и оборачиваемости
    async fn get_stocks(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_warehouse_stocks_request: Option<models::GetWarehouseStocksRequest>,
        context: &C) -> Result<GetStocksResponse, ApiError>;

    /// Передача информации об остатках
    async fn update_stocks(
        &self,
        campaign_id: i64,
        update_stocks_request: models::UpdateStocksRequest,
        context: &C) -> Result<UpdateStocksResponse, ApiError>;

    /// Калькулятор стоимости услуг
    async fn calculate_tariffs(
        &self,
        calculate_tariffs_request: models::CalculateTariffsRequest,
        context: &C) -> Result<CalculateTariffsResponse, ApiError>;

    /// Идентификаторы складов Маркета (FBY)
    async fn get_fulfillment_warehouses(
        &self,
        context: &C) -> Result<GetFulfillmentWarehousesResponse, ApiError>;

    /// Список складов и групп складов
    async fn get_warehouses(
        &self,
        business_id: i64,
        context: &C) -> Result<GetWarehousesResponse, ApiError>;

}

/// API where `Context` isn't passed on every API call
#[async_trait]
#[allow(clippy::too_many_arguments, clippy::ptr_arg)]
pub trait ApiNoContext<C: Send + Sync> {

    fn poll_ready(&self, _cx: &mut Context) -> Poll<Result<(), Box<dyn Error + Send + Sync + 'static>>>;

    fn context(&self) -> &C;

    /// Информация об установленных ставках
    async fn get_bids_info_for_business(
        &self,
        business_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_bids_info_request: Option<models::GetBidsInfoRequest>,
        ) -> Result<GetBidsInfoForBusinessResponse, ApiError>;

    /// Рекомендованные ставки для заданных товаров
    async fn get_bids_recommendations(
        &self,
        business_id: i64,
        get_bids_recommendations_request: models::GetBidsRecommendationsRequest,
        ) -> Result<GetBidsRecommendationsResponse, ApiError>;

    /// Включение буста продаж и установка ставок
    async fn put_bids_for_business(
        &self,
        business_id: i64,
        put_sku_bids_request: models::PutSkuBidsRequest,
        ) -> Result<PutBidsForBusinessResponse, ApiError>;

    /// Включение буста продаж и установка ставок для магазина
    async fn put_bids_for_campaign(
        &self,
        campaign_id: i64,
        put_sku_bids_request: models::PutSkuBidsRequest,
        ) -> Result<PutBidsForCampaignResponse, ApiError>;

    /// Добавление товаров в архив
    async fn add_offers_to_archive(
        &self,
        business_id: i64,
        add_offers_to_archive_request: models::AddOffersToArchiveRequest,
        ) -> Result<AddOffersToArchiveResponse, ApiError>;

    /// Удаление товаров из каталога
    async fn delete_offers(
        &self,
        business_id: i64,
        delete_offers_request: models::DeleteOffersRequest,
        ) -> Result<DeleteOffersResponse, ApiError>;

    /// Удаление товаров из архива
    async fn delete_offers_from_archive(
        &self,
        business_id: i64,
        delete_offers_from_archive_request: models::DeleteOffersFromArchiveRequest,
        ) -> Result<DeleteOffersFromArchiveResponse, ApiError>;

    /// Информация о товарах в каталоге
    async fn get_offer_mappings(
        &self,
        business_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_offer_mappings_request: Option<models::GetOfferMappingsRequest>,
        ) -> Result<GetOfferMappingsResponse, ApiError>;

    /// Просмотр карточек на Маркете, которые подходят вашим товарам
    async fn get_suggested_offer_mappings(
        &self,
        business_id: i64,
        get_suggested_offer_mappings_request: Option<models::GetSuggestedOfferMappingsRequest>,
        ) -> Result<GetSuggestedOfferMappingsResponse, ApiError>;

    /// Добавление товаров в каталог и изменение информации о них
    async fn update_offer_mappings(
        &self,
        business_id: i64,
        update_offer_mappings_request: models::UpdateOfferMappingsRequest,
        ) -> Result<UpdateOfferMappingsResponse, ApiError>;

    /// Настройки кабинета
    async fn get_business_settings(
        &self,
        business_id: i64,
        ) -> Result<GetBusinessSettingsResponse, ApiError>;

    /// Список магазинов пользователя
    async fn get_campaigns(
        &self,
        page: Option<i32>,
        page_size: Option<i32>,
        ) -> Result<GetCampaignsResponse, ApiError>;

    /// Информация о магазине
    async fn get_campaign(
        &self,
        campaign_id: i64,
        ) -> Result<GetCampaignResponse, ApiError>;

    /// Логины, связанные с магазином
    async fn get_campaign_logins(
        &self,
        campaign_id: i64,
        ) -> Result<GetCampaignLoginsResponse, ApiError>;

    /// Регион магазина
    async fn get_campaign_region(
        &self,
        campaign_id: i64,
        ) -> Result<GetCampaignRegionResponse, ApiError>;

    /// Настройки магазина
    async fn get_campaign_settings(
        &self,
        campaign_id: i64,
        ) -> Result<GetCampaignSettingsResponse, ApiError>;

    /// Магазины, доступные логину
    async fn get_campaigns_by_login(
        &self,
        login: String,
        page: Option<i32>,
        page_size: Option<i32>,
        ) -> Result<GetCampaignsByLoginResponse, ApiError>;

    /// Лимит на установку кванта продажи и минимального количества товаров в заказе
    async fn get_categories_max_sale_quantum(
        &self,
        get_categories_max_sale_quantum_request: models::GetCategoriesMaxSaleQuantumRequest,
        ) -> Result<GetCategoriesMaxSaleQuantumResponse, ApiError>;

    /// Дерево категорий
    async fn get_categories_tree(
        &self,
        get_categories_request: Option<models::GetCategoriesRequest>,
        ) -> Result<GetCategoriesTreeResponse, ApiError>;

    /// Создание нового чата с покупателем
    async fn create_chat(
        &self,
        business_id: i64,
        create_chat_request: models::CreateChatRequest,
        ) -> Result<CreateChatResponse, ApiError>;

    /// Получение истории сообщений в чате
    async fn get_chat_history(
        &self,
        business_id: i64,
        chat_id: i64,
        get_chat_history_request: models::GetChatHistoryRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<GetChatHistoryResponse, ApiError>;

    /// Получение доступных чатов
    async fn get_chats(
        &self,
        business_id: i64,
        get_chats_request: models::GetChatsRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<GetChatsResponse, ApiError>;

    /// Отправка файла в чат
    async fn send_file_to_chat(
        &self,
        business_id: i64,
        chat_id: i64,
        file: swagger::ByteArray,
        ) -> Result<SendFileToChatResponse, ApiError>;

    /// Отправка сообщения в чат
    async fn send_message_to_chat(
        &self,
        business_id: i64,
        chat_id: i64,
        send_message_to_chat_request: models::SendMessageToChatRequest,
        ) -> Result<SendMessageToChatResponse, ApiError>;

    /// Списки характеристик товаров по категориям
    async fn get_category_content_parameters(
        &self,
        category_id: i64,
        ) -> Result<GetCategoryContentParametersResponse, ApiError>;

    /// Получение информации о заполненности карточек магазина
    async fn get_offer_cards_content_status(
        &self,
        business_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_offer_cards_content_status_request: Option<models::GetOfferCardsContentStatusRequest>,
        ) -> Result<GetOfferCardsContentStatusResponse, ApiError>;

    /// Редактирование категорийных характеристик товара
    async fn update_offer_content(
        &self,
        business_id: i64,
        update_offer_content_request: models::UpdateOfferContentRequest,
        ) -> Result<UpdateOfferContentResponse, ApiError>;

    /// Справочник служб доставки
    async fn get_delivery_services(
        &self,
        ) -> Result<GetDeliveryServicesResponse, ApiError>;

    /// Новые и обновленные отзывы о магазине
    async fn get_feedback_and_comment_updates(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        from_date: Option<chrono::naive::NaiveDate>,
        ) -> Result<GetFeedbackAndCommentUpdatesResponse, ApiError>;

    /// Список прайс-листов магазина
    async fn get_feeds(
        &self,
        campaign_id: i64,
        ) -> Result<GetFeedsResponse, ApiError>;

    /// Информация о прайс-листе
    async fn get_feed(
        &self,
        campaign_id: i64,
        feed_id: i64,
        ) -> Result<GetFeedResponse, ApiError>;

    /// Отчет по индексации прайс-листа
    async fn get_feed_index_logs(
        &self,
        campaign_id: i64,
        feed_id: i64,
        limit: Option<i32>,
        published_time_from: Option<chrono::DateTime::<chrono::Utc>>,
        published_time_to: Option<chrono::DateTime::<chrono::Utc>>,
        status: Option<models::FeedIndexLogsStatusType>,
        ) -> Result<GetFeedIndexLogsResponse, ApiError>;

    /// Сообщить, что прайс-лист обновился
    async fn refresh_feed(
        &self,
        campaign_id: i64,
        feed_id: i64,
        ) -> Result<RefreshFeedResponse, ApiError>;

    /// Изменение параметров прайс-листа
    async fn set_feed_params(
        &self,
        campaign_id: i64,
        feed_id: i64,
        set_feed_params_request: models::SetFeedParamsRequest,
        ) -> Result<SetFeedParamsResponse, ApiError>;

    /// Удаление комментария к отзыву
    async fn delete_goods_feedback_comment(
        &self,
        business_id: i64,
        delete_goods_feedback_comment_request: models::DeleteGoodsFeedbackCommentRequest,
        ) -> Result<DeleteGoodsFeedbackCommentResponse, ApiError>;

    /// Получение комментариев к отзыву
    async fn get_goods_feedback_comments(
        &self,
        business_id: i64,
        get_goods_feedback_comments_request: models::GetGoodsFeedbackCommentsRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<GetGoodsFeedbackCommentsResponse, ApiError>;

    /// Получение отзывов о товарах продавца
    async fn get_goods_feedbacks(
        &self,
        business_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_goods_feedback_request: Option<models::GetGoodsFeedbackRequest>,
        ) -> Result<GetGoodsFeedbacksResponse, ApiError>;

    /// Отказ от ответа на отзывы
    async fn skip_goods_feedbacks_reaction(
        &self,
        business_id: i64,
        skip_goods_feedback_reaction_request: models::SkipGoodsFeedbackReactionRequest,
        ) -> Result<SkipGoodsFeedbacksReactionResponse, ApiError>;

    /// Добавление нового или изменение созданного комментария
    async fn update_goods_feedback_comment(
        &self,
        business_id: i64,
        update_goods_feedback_comment_request: models::UpdateGoodsFeedbackCommentRequest,
        ) -> Result<UpdateGoodsFeedbackCommentResponse, ApiError>;

    /// Отчет по товарам
    async fn get_goods_stats(
        &self,
        campaign_id: i64,
        get_goods_stats_request: models::GetGoodsStatsRequest,
        ) -> Result<GetGoodsStatsResponse, ApiError>;

    /// Скрытие товаров и настройки скрытия
    async fn add_hidden_offers(
        &self,
        campaign_id: i64,
        add_hidden_offers_request: models::AddHiddenOffersRequest,
        ) -> Result<AddHiddenOffersResponse, ApiError>;

    /// Возобновление показа товаров
    async fn delete_hidden_offers(
        &self,
        campaign_id: i64,
        delete_hidden_offers_request: models::DeleteHiddenOffersRequest,
        ) -> Result<DeleteHiddenOffersResponse, ApiError>;

    /// Информация о скрытых вами товарах
    async fn get_hidden_offers(
        &self,
        campaign_id: i64,
        offer_id: Option<&Vec<models::ShopSku>>,
        page_token: Option<String>,
        limit: Option<i32>,
        offset: Option<i32>,
        page: Option<i32>,
        page_size: Option<i32>,
        ) -> Result<GetHiddenOffersResponse, ApiError>;

    /// Информация о нескольких моделях
    async fn get_models(
        &self,
        region_id: i64,
        get_models_request: models::GetModelsRequest,
        currency: Option<models::CurrencyType>,
        ) -> Result<GetModelsResponse, ApiError>;

    /// Список предложений для нескольких моделей
    async fn get_models_offers(
        &self,
        region_id: i64,
        get_models_request: models::GetModelsRequest,
        currency: Option<models::CurrencyType>,
        order_by_price: Option<models::SortOrderType>,
        ) -> Result<GetModelsOffersResponse, ApiError>;

    /// Поиск модели товара
    async fn search_models(
        &self,
        query: String,
        region_id: i64,
        currency: Option<models::CurrencyType>,
        page: Option<i32>,
        page_size: Option<i32>,
        ) -> Result<SearchModelsResponse, ApiError>;

    /// Информация об одной модели
    async fn get_model(
        &self,
        model_id: i64,
        region_id: i64,
        currency: Option<models::CurrencyType>,
        ) -> Result<GetModelResponse, ApiError>;

    /// Список предложений для одной модели
    async fn get_model_offers(
        &self,
        model_id: i64,
        region_id: i64,
        currency: Option<models::CurrencyType>,
        order_by_price: Option<models::SortOrderType>,
        count: Option<i32>,
        page: Option<i32>,
        ) -> Result<GetModelOffersResponse, ApiError>;

    /// Список товаров в каталоге
    async fn get_offer_mapping_entries(
        &self,
        campaign_id: i64,
        offer_id: Option<&Vec<String>>,
        shop_sku: Option<&Vec<models::ShopSku>>,
        mapping_kind: Option<models::OfferMappingKindType>,
        status: Option<&Vec<models::OfferProcessingStatusType>>,
        availability: Option<&Vec<models::OfferAvailabilityStatusType>>,
        category_id: Option<&Vec<i32>>,
        vendor: Option<&Vec<String>>,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<GetOfferMappingEntriesResponse, ApiError>;

    /// Рекомендованные карточки для товаров
    async fn get_suggested_offer_mapping_entries(
        &self,
        campaign_id: i64,
        get_suggested_offer_mapping_entries_request: models::GetSuggestedOfferMappingEntriesRequest,
        ) -> Result<GetSuggestedOfferMappingEntriesResponse, ApiError>;

    /// Добавление и редактирование товаров в каталоге
    async fn update_offer_mapping_entries(
        &self,
        campaign_id: i64,
        update_offer_mapping_entry_request: models::UpdateOfferMappingEntryRequest,
        ) -> Result<UpdateOfferMappingEntriesResponse, ApiError>;

    /// Удаление товаров из ассортимента магазина
    async fn delete_campaign_offers(
        &self,
        campaign_id: i64,
        delete_campaign_offers_request: models::DeleteCampaignOffersRequest,
        ) -> Result<DeleteCampaignOffersResponse, ApiError>;

    /// Все предложения магазина
    async fn get_all_offers(
        &self,
        campaign_id: i64,
        feed_id: Option<i64>,
        chunk: Option<i32>,
        ) -> Result<GetAllOffersResponse, ApiError>;

    /// Информация о товарах, которые размещены в заданном магазине
    async fn get_campaign_offers(
        &self,
        campaign_id: i64,
        get_campaign_offers_request: models::GetCampaignOffersRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<GetCampaignOffersResponse, ApiError>;

    /// Рекомендации Маркета, касающиеся цен
    async fn get_offer_recommendations(
        &self,
        business_id: i64,
        get_offer_recommendations_request: models::GetOfferRecommendationsRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<GetOfferRecommendationsResponse, ApiError>;

    /// Предложения магазина
    async fn get_offers(
        &self,
        campaign_id: i64,
        query: Option<String>,
        feed_id: Option<i64>,
        shop_category_id: Option<String>,
        currency: Option<models::CurrencyType>,
        matched: Option<bool>,
        page: Option<i32>,
        page_size: Option<i32>,
        ) -> Result<GetOffersResponse, ApiError>;

    /// Изменение условий продажи товаров в магазине
    async fn update_campaign_offers(
        &self,
        campaign_id: i64,
        update_campaign_offers_request: models::UpdateCampaignOffersRequest,
        ) -> Result<UpdateCampaignOffersResponse, ApiError>;

    /// Информация о покупателе — юридическом лице
    async fn get_order_business_buyer_info(
        &self,
        campaign_id: i64,
        order_id: i64,
        ) -> Result<GetOrderBusinessBuyerInfoResponse, ApiError>;

    /// Информация о документах
    async fn get_order_business_documents_info(
        &self,
        campaign_id: i64,
        order_id: i64,
        ) -> Result<GetOrderBusinessDocumentsInfoResponse, ApiError>;

    /// Информация о покупателе — физическом лице
    async fn get_order_buyer_info(
        &self,
        campaign_id: i64,
        order_id: i64,
        ) -> Result<GetOrderBuyerInfoResponse, ApiError>;

    /// Изменение даты доставки заказа
    async fn set_order_delivery_date(
        &self,
        campaign_id: i64,
        order_id: i64,
        set_order_delivery_date_request: models::SetOrderDeliveryDateRequest,
        ) -> Result<SetOrderDeliveryDateResponse, ApiError>;

    /// Передача трек‑номера посылки
    async fn set_order_delivery_track_code(
        &self,
        campaign_id: i64,
        order_id: i64,
        set_order_delivery_track_code_request: models::SetOrderDeliveryTrackCodeRequest,
        ) -> Result<SetOrderDeliveryTrackCodeResponse, ApiError>;

    /// Продление срока хранения заказа
    async fn update_order_storage_limit(
        &self,
        campaign_id: i64,
        order_id: i64,
        update_order_storage_limit_request: models::UpdateOrderStorageLimitRequest,
        ) -> Result<UpdateOrderStorageLimitResponse, ApiError>;

    /// Передача кода подтверждения
    async fn verify_order_eac(
        &self,
        campaign_id: i64,
        order_id: i64,
        verify_order_eac_request: models::VerifyOrderEacRequest,
        ) -> Result<VerifyOrderEacResponse, ApiError>;

    /// Готовые ярлыки‑наклейки на все коробки в одном заказе
    async fn generate_order_labels(
        &self,
        campaign_id: i64,
        order_id: i64,
        format: Option<models::PageFormatType>,
        ) -> Result<GenerateOrderLabelsResponse, ApiError>;

    /// Данные для самостоятельного изготовления ярлыков
    async fn get_order_labels_data(
        &self,
        campaign_id: i64,
        order_id: i64,
        ) -> Result<GetOrderLabelsDataResponse, ApiError>;

    /// Готовый ярлык‑наклейка для коробки в заказе
    async fn generate_order_label(
        &self,
        campaign_id: i64,
        order_id: i64,
        shipment_id: i64,
        box_id: i64,
        format: Option<models::PageFormatType>,
        ) -> Result<GenerateOrderLabelResponse, ApiError>;

    /// Информация о нескольких заказах
    async fn get_orders(
        &self,
        campaign_id: i64,
        order_ids: Option<&Vec<i64>>,
        status: Option<&Vec<models::OrderStatusType>>,
        substatus: Option<&Vec<models::OrderSubstatusType>>,
        from_date: Option<chrono::naive::NaiveDate>,
        to_date: Option<chrono::naive::NaiveDate>,
        supplier_shipment_date_from: Option<chrono::naive::NaiveDate>,
        supplier_shipment_date_to: Option<chrono::naive::NaiveDate>,
        updated_at_from: Option<chrono::DateTime::<chrono::Utc>>,
        updated_at_to: Option<chrono::DateTime::<chrono::Utc>>,
        dispatch_type: Option<models::OrderDeliveryDispatchType>,
        fake: Option<bool>,
        has_cis: Option<bool>,
        only_waiting_for_cancellation_approve: Option<bool>,
        only_estimated_delivery: Option<bool>,
        buyer_type: Option<models::OrderBuyerType>,
        page: Option<i32>,
        page_size: Option<i32>,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<GetOrdersResponse, ApiError>;

    /// Изменение статусов нескольких заказов
    async fn update_order_statuses(
        &self,
        campaign_id: i64,
        update_order_statuses_request: models::UpdateOrderStatusesRequest,
        ) -> Result<UpdateOrderStatusesResponse, ApiError>;

    /// Отмена заказа покупателем
    async fn accept_order_cancellation(
        &self,
        campaign_id: i64,
        order_id: i64,
        accept_order_cancellation_request: models::AcceptOrderCancellationRequest,
        ) -> Result<AcceptOrderCancellationResponse, ApiError>;

    /// Информация об одном заказе
    async fn get_order(
        &self,
        campaign_id: i64,
        order_id: i64,
        ) -> Result<GetOrderResponse, ApiError>;

    /// Передача ключей цифровых товаров
    async fn provide_order_digital_codes(
        &self,
        campaign_id: i64,
        order_id: i64,
        provide_order_digital_codes_request: models::ProvideOrderDigitalCodesRequest,
        ) -> Result<ProvideOrderDigitalCodesResponse, ApiError>;

    /// Передача кодов маркировки единиц товара
    async fn provide_order_item_identifiers(
        &self,
        campaign_id: i64,
        order_id: i64,
        provide_order_item_identifiers_request: models::ProvideOrderItemIdentifiersRequest,
        ) -> Result<ProvideOrderItemIdentifiersResponse, ApiError>;

    /// Подготовка заказа
    async fn set_order_box_layout(
        &self,
        campaign_id: i64,
        order_id: i64,
        set_order_box_layout_request: models::SetOrderBoxLayoutRequest,
        ) -> Result<SetOrderBoxLayoutResponse, ApiError>;

    /// Удаление товара из заказа или уменьшение числа единиц
    async fn update_order_items(
        &self,
        campaign_id: i64,
        order_id: i64,
        update_order_item_request: models::UpdateOrderItemRequest,
        ) -> Result<UpdateOrderItemsResponse, ApiError>;

    /// Изменение статуса одного заказа
    async fn update_order_status(
        &self,
        campaign_id: i64,
        order_id: i64,
        update_order_status_request: models::UpdateOrderStatusRequest,
        ) -> Result<UpdateOrderStatusResponse, ApiError>;

    /// Передача количества грузовых мест в заказе
    async fn set_order_shipment_boxes(
        &self,
        campaign_id: i64,
        order_id: i64,
        shipment_id: i64,
        set_order_shipment_boxes_request: models::SetOrderShipmentBoxesRequest,
        ) -> Result<SetOrderShipmentBoxesResponse, ApiError>;

    /// Детальная информация по заказам
    async fn get_orders_stats(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_orders_stats_request: Option<models::GetOrdersStatsRequest>,
        ) -> Result<GetOrdersStatsResponse, ApiError>;

    /// Удаление лицензий для точек продаж
    async fn delete_outlet_licenses(
        &self,
        campaign_id: i64,
        ids: Option<&Vec<i64>>,
        ) -> Result<DeleteOutletLicensesResponse, ApiError>;

    /// Информация о лицензиях для точек продаж
    async fn get_outlet_licenses(
        &self,
        campaign_id: i64,
        outlet_ids: Option<&Vec<i64>>,
        ids: Option<&Vec<i64>>,
        ) -> Result<GetOutletLicensesResponse, ApiError>;

    /// Создание и изменение лицензий для точек продаж
    async fn update_outlet_licenses(
        &self,
        campaign_id: i64,
        update_outlet_license_request: models::UpdateOutletLicenseRequest,
        ) -> Result<UpdateOutletLicensesResponse, ApiError>;

    /// Создание точки продаж
    async fn create_outlet(
        &self,
        campaign_id: i64,
        change_outlet_request: models::ChangeOutletRequest,
        ) -> Result<CreateOutletResponse, ApiError>;

    /// Информация о нескольких точках продаж
    async fn get_outlets(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        region_id: Option<i64>,
        shop_outlet_code: Option<String>,
        region_id2: Option<i64>,
        ) -> Result<GetOutletsResponse, ApiError>;

    /// Удаление точки продаж
    async fn delete_outlet(
        &self,
        campaign_id: i64,
        outlet_id: i64,
        ) -> Result<DeleteOutletResponse, ApiError>;

    /// Информация об одной точке продаж
    async fn get_outlet(
        &self,
        campaign_id: i64,
        outlet_id: i64,
        ) -> Result<GetOutletResponse, ApiError>;

    /// Изменение информации о точке продаж
    async fn update_outlet(
        &self,
        campaign_id: i64,
        outlet_id: i64,
        change_outlet_request: models::ChangeOutletRequest,
        ) -> Result<UpdateOutletResponse, ApiError>;

    /// Удаление товара из карантина по цене в кабинете
    async fn confirm_business_prices(
        &self,
        business_id: i64,
        confirm_prices_request: models::ConfirmPricesRequest,
        ) -> Result<ConfirmBusinessPricesResponse, ApiError>;

    /// Удаление товара из карантина по цене в магазине
    async fn confirm_campaign_prices(
        &self,
        campaign_id: i64,
        confirm_prices_request: models::ConfirmPricesRequest,
        ) -> Result<ConfirmCampaignPricesResponse, ApiError>;

    /// Список товаров, находящихся в карантине по цене в кабинете
    async fn get_business_quarantine_offers(
        &self,
        business_id: i64,
        get_quarantine_offers_request: models::GetQuarantineOffersRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<GetBusinessQuarantineOffersResponse, ApiError>;

    /// Список товаров, находящихся в карантине по цене в магазине
    async fn get_campaign_quarantine_offers(
        &self,
        campaign_id: i64,
        get_quarantine_offers_request: models::GetQuarantineOffersRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<GetCampaignQuarantineOffersResponse, ApiError>;

    /// Список цен
    async fn get_prices(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        archived: Option<bool>,
        ) -> Result<GetPricesResponse, ApiError>;

    /// Просмотр цен на указанные товары в магазине
    async fn get_prices_by_offer_ids(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_prices_by_offer_ids_request: Option<models::GetPricesByOfferIdsRequest>,
        ) -> Result<GetPricesByOfferIdsResponse, ApiError>;

    /// Цены для продвижения товаров
    async fn get_suggested_prices(
        &self,
        campaign_id: i64,
        suggest_prices_request: models::SuggestPricesRequest,
        ) -> Result<GetSuggestedPricesResponse, ApiError>;

    /// Установка цен на товары во всех магазинах
    async fn update_business_prices(
        &self,
        business_id: i64,
        update_business_prices_request: models::UpdateBusinessPricesRequest,
        ) -> Result<UpdateBusinessPricesResponse, ApiError>;

    /// Установка цен на товары в конкретном магазине
    async fn update_prices(
        &self,
        campaign_id: i64,
        update_prices_request: models::UpdatePricesRequest,
        ) -> Result<UpdatePricesResponse, ApiError>;

    /// Удаление товаров из акции
    async fn delete_promo_offers(
        &self,
        business_id: i64,
        delete_promo_offers_request: models::DeletePromoOffersRequest,
        ) -> Result<DeletePromoOffersResponse, ApiError>;

    /// Получение списка товаров, которые участвуют или могут участвовать в акции
    async fn get_promo_offers(
        &self,
        business_id: i64,
        get_promo_offers_request: models::GetPromoOffersRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<GetPromoOffersResponse, ApiError>;

    /// Получение списка акций
    async fn get_promos(
        &self,
        business_id: i64,
        get_promos_request: Option<models::GetPromosRequest>,
        ) -> Result<GetPromosResponse, ApiError>;

    /// Добавление товаров в акцию или изменение их цен
    async fn update_promo_offers(
        &self,
        business_id: i64,
        update_promo_offers_request: models::UpdatePromoOffersRequest,
        ) -> Result<UpdatePromoOffersResponse, ApiError>;

    /// Заказы, которые повлияли на индекс качества
    async fn get_quality_rating_details(
        &self,
        campaign_id: i64,
        ) -> Result<GetQualityRatingDetailsResponse, ApiError>;

    /// Индекс качества магазинов
    async fn get_quality_ratings(
        &self,
        business_id: i64,
        get_quality_rating_request: models::GetQualityRatingRequest,
        ) -> Result<GetQualityRatingsResponse, ApiError>;

    /// Поиск регионов по их имени
    async fn search_regions_by_name(
        &self,
        name: String,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<SearchRegionsByNameResponse, ApiError>;

    /// Информация о дочерних регионах
    async fn search_region_children(
        &self,
        region_id: i64,
        page: Option<i32>,
        page_size: Option<i32>,
        ) -> Result<SearchRegionChildrenResponse, ApiError>;

    /// Информация о регионе
    async fn search_regions_by_id(
        &self,
        region_id: i64,
        ) -> Result<SearchRegionsByIdResponse, ApiError>;

    /// Отчет по бусту продаж
    async fn generate_boost_consolidated_report(
        &self,
        generate_boost_consolidated_request: models::GenerateBoostConsolidatedRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateBoostConsolidatedReportResponse, ApiError>;

    /// Отчет «Конкурентная позиция»
    async fn generate_competitors_position_report(
        &self,
        generate_competitors_position_report_request: models::GenerateCompetitorsPositionReportRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateCompetitorsPositionReportResponse, ApiError>;

    /// Отчет по отзывам о товарах
    async fn generate_goods_feedback_report(
        &self,
        generate_goods_feedback_request: models::GenerateGoodsFeedbackRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateGoodsFeedbackReportResponse, ApiError>;

    /// Отчет по движению товаров
    async fn generate_goods_movement_report(
        &self,
        generate_goods_movement_report_request: models::GenerateGoodsMovementReportRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateGoodsMovementReportResponse, ApiError>;

    /// Отчет по реализации
    async fn generate_goods_realization_report(
        &self,
        generate_goods_realization_report_request: models::GenerateGoodsRealizationReportRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateGoodsRealizationReportResponse, ApiError>;

    /// Отчет по оборачиваемости
    async fn generate_goods_turnover_report(
        &self,
        generate_goods_turnover_request: models::GenerateGoodsTurnoverRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateGoodsTurnoverReportResponse, ApiError>;

    /// Готовые ярлыки‑наклейки на все коробки в нескольких заказах
    async fn generate_mass_order_labels_report(
        &self,
        generate_mass_order_labels_request: models::GenerateMassOrderLabelsRequest,
        format: Option<models::PageFormatType>,
        ) -> Result<GenerateMassOrderLabelsReportResponse, ApiError>;

    /// Отчет «Цены на рынке»
    async fn generate_prices_report(
        &self,
        generate_prices_report_request: models::GeneratePricesReportRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GeneratePricesReportResponse, ApiError>;

    /// Отчет по полкам
    async fn generate_shelfs_statistics_report(
        &self,
        generate_shelfs_statistics_request: models::GenerateShelfsStatisticsRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateShelfsStatisticsReportResponse, ApiError>;

    /// Получение листа сборки
    async fn generate_shipment_list_document_report(
        &self,
        generate_shipment_list_document_report_request: models::GenerateShipmentListDocumentReportRequest,
        ) -> Result<GenerateShipmentListDocumentReportResponse, ApiError>;

    /// Отчет «Аналитика продаж»
    async fn generate_shows_sales_report(
        &self,
        generate_shows_sales_report_request: models::GenerateShowsSalesReportRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateShowsSalesReportResponse, ApiError>;

    /// Отчет по остаткам на складах
    async fn generate_stocks_on_warehouses_report(
        &self,
        generate_stocks_on_warehouses_report_request: models::GenerateStocksOnWarehousesReportRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateStocksOnWarehousesReportResponse, ApiError>;

    /// Отчет по стоимости услуг
    async fn generate_united_marketplace_services_report(
        &self,
        generate_united_marketplace_services_report_request: models::GenerateUnitedMarketplaceServicesReportRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateUnitedMarketplaceServicesReportResponse, ApiError>;

    /// Отчет по платежам
    async fn generate_united_netting_report(
        &self,
        generate_united_netting_report_request: models::GenerateUnitedNettingReportRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateUnitedNettingReportResponse, ApiError>;

    /// Отчет по заказам
    async fn generate_united_orders_report(
        &self,
        generate_united_orders_request: models::GenerateUnitedOrdersRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateUnitedOrdersReportResponse, ApiError>;

    /// Получение заданного отчета
    async fn get_report_info(
        &self,
        report_id: String,
        ) -> Result<GetReportInfoResponse, ApiError>;

    /// Список невыкупов и возвратов
    async fn get_returns(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        order_ids: Option<&Vec<i64>>,
        statuses: Option<&Vec<models::RefundStatusType>>,
        r#type: Option<models::ReturnType>,
        from_date: Option<chrono::naive::NaiveDate>,
        to_date: Option<chrono::naive::NaiveDate>,
        from_date2: Option<chrono::naive::NaiveDate>,
        to_date2: Option<chrono::naive::NaiveDate>,
        ) -> Result<GetReturnsResponse, ApiError>;

    /// Информация о невыкупе или возврате
    async fn get_return(
        &self,
        campaign_id: i64,
        order_id: i64,
        return_id: i64,
        ) -> Result<GetReturnResponse, ApiError>;

    /// Получение заявления на возврат
    async fn get_return_application(
        &self,
        campaign_id: i64,
        order_id: i64,
        return_id: i64,
        ) -> Result<GetReturnApplicationResponse, ApiError>;

    /// Принятие или изменение решения по возврату
    async fn set_return_decision(
        &self,
        campaign_id: i64,
        order_id: i64,
        return_id: i64,
        set_return_decision_request: models::SetReturnDecisionRequest,
        ) -> Result<SetReturnDecisionResponse, ApiError>;

    /// Подтверждение решения по возврату
    async fn submit_return_decision(
        &self,
        campaign_id: i64,
        order_id: i64,
        return_id: i64,
        ) -> Result<SubmitReturnDecisionResponse, ApiError>;

    /// Получение фотографии возврата
    async fn get_return_photo(
        &self,
        campaign_id: i64,
        order_id: i64,
        return_id: i64,
        item_id: i64,
        image_hash: String,
        ) -> Result<GetReturnPhotoResponse, ApiError>;

    /// Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
    async fn download_shipment_reception_transfer_act(
        &self,
        campaign_id: i64,
        warehouse_id: Option<i32>,
        ) -> Result<DownloadShipmentReceptionTransferActResponse, ApiError>;

    /// Получение информации о нескольких отгрузках
    async fn search_shipments(
        &self,
        campaign_id: i64,
        search_shipments_request: models::SearchShipmentsRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<SearchShipmentsResponse, ApiError>;

    /// Подтверждение отгрузки
    async fn confirm_shipment(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        confirm_shipment_request: Option<models::ConfirmShipmentRequest>,
        ) -> Result<ConfirmShipmentResponse, ApiError>;

    /// Получение акта приема-передачи
    async fn download_shipment_act(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        ) -> Result<DownloadShipmentActResponse, ApiError>;

    /// Получение акта расхождений
    async fn download_shipment_discrepancy_act(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        ) -> Result<DownloadShipmentDiscrepancyActResponse, ApiError>;

    /// Получение фактического акта приема-передачи
    async fn download_shipment_inbound_act(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        ) -> Result<DownloadShipmentInboundActResponse, ApiError>;

    /// Ярлыки для доверительной приемки (FBS)
    async fn download_shipment_pallet_labels(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        format: Option<models::ShipmentPalletLabelPageFormatType>,
        ) -> Result<DownloadShipmentPalletLabelsResponse, ApiError>;

    /// Получение транспортной накладной
    async fn download_shipment_transportation_waybill(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        ) -> Result<DownloadShipmentTransportationWaybillResponse, ApiError>;

    /// Получение информации об одной отгрузке
    async fn get_shipment(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        cancelled_orders: Option<bool>,
        ) -> Result<GetShipmentResponse, ApiError>;

    /// Получение информации о возможности печати ярлыков (FBS)
    async fn get_shipment_orders_info(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        ) -> Result<GetShipmentOrdersInfoResponse, ApiError>;

    /// Передача количества упаковок в отгрузке
    async fn set_shipment_pallets_count(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        set_shipment_pallets_count_request: models::SetShipmentPalletsCountRequest,
        ) -> Result<SetShipmentPalletsCountResponse, ApiError>;

    /// Перенос заказов в следующую отгрузку
    async fn transfer_orders_from_shipment(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        transfer_orders_from_shipment_request: models::TransferOrdersFromShipmentRequest,
        ) -> Result<TransferOrdersFromShipmentResponse, ApiError>;

    /// Информация об остатках и оборачиваемости
    async fn get_stocks(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_warehouse_stocks_request: Option<models::GetWarehouseStocksRequest>,
        ) -> Result<GetStocksResponse, ApiError>;

    /// Передача информации об остатках
    async fn update_stocks(
        &self,
        campaign_id: i64,
        update_stocks_request: models::UpdateStocksRequest,
        ) -> Result<UpdateStocksResponse, ApiError>;

    /// Калькулятор стоимости услуг
    async fn calculate_tariffs(
        &self,
        calculate_tariffs_request: models::CalculateTariffsRequest,
        ) -> Result<CalculateTariffsResponse, ApiError>;

    /// Идентификаторы складов Маркета (FBY)
    async fn get_fulfillment_warehouses(
        &self,
        ) -> Result<GetFulfillmentWarehousesResponse, ApiError>;

    /// Список складов и групп складов
    async fn get_warehouses(
        &self,
        business_id: i64,
        ) -> Result<GetWarehousesResponse, ApiError>;

}

/// Trait to extend an API to make it easy to bind it to a context.
pub trait ContextWrapperExt<C: Send + Sync> where Self: Sized
{
    /// Binds this API to a context.
    fn with_context(self, context: C) -> ContextWrapper<Self, C>;
}

impl<T: Api<C> + Send + Sync, C: Clone + Send + Sync> ContextWrapperExt<C> for T {
    fn with_context(self: T, context: C) -> ContextWrapper<T, C> {
         ContextWrapper::<T, C>::new(self, context)
    }
}

#[async_trait]
impl<T: Api<C> + Send + Sync, C: Clone + Send + Sync> ApiNoContext<C> for ContextWrapper<T, C> {
    fn poll_ready(&self, cx: &mut Context) -> Poll<Result<(), ServiceError>> {
        self.api().poll_ready(cx)
    }

    fn context(&self) -> &C {
        ContextWrapper::context(self)
    }

    /// Информация об установленных ставках
    async fn get_bids_info_for_business(
        &self,
        business_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_bids_info_request: Option<models::GetBidsInfoRequest>,
        ) -> Result<GetBidsInfoForBusinessResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_bids_info_for_business(business_id, page_token, limit, get_bids_info_request, &context).await
    }

    /// Рекомендованные ставки для заданных товаров
    async fn get_bids_recommendations(
        &self,
        business_id: i64,
        get_bids_recommendations_request: models::GetBidsRecommendationsRequest,
        ) -> Result<GetBidsRecommendationsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_bids_recommendations(business_id, get_bids_recommendations_request, &context).await
    }

    /// Включение буста продаж и установка ставок
    async fn put_bids_for_business(
        &self,
        business_id: i64,
        put_sku_bids_request: models::PutSkuBidsRequest,
        ) -> Result<PutBidsForBusinessResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().put_bids_for_business(business_id, put_sku_bids_request, &context).await
    }

    /// Включение буста продаж и установка ставок для магазина
    async fn put_bids_for_campaign(
        &self,
        campaign_id: i64,
        put_sku_bids_request: models::PutSkuBidsRequest,
        ) -> Result<PutBidsForCampaignResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().put_bids_for_campaign(campaign_id, put_sku_bids_request, &context).await
    }

    /// Добавление товаров в архив
    async fn add_offers_to_archive(
        &self,
        business_id: i64,
        add_offers_to_archive_request: models::AddOffersToArchiveRequest,
        ) -> Result<AddOffersToArchiveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().add_offers_to_archive(business_id, add_offers_to_archive_request, &context).await
    }

    /// Удаление товаров из каталога
    async fn delete_offers(
        &self,
        business_id: i64,
        delete_offers_request: models::DeleteOffersRequest,
        ) -> Result<DeleteOffersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_offers(business_id, delete_offers_request, &context).await
    }

    /// Удаление товаров из архива
    async fn delete_offers_from_archive(
        &self,
        business_id: i64,
        delete_offers_from_archive_request: models::DeleteOffersFromArchiveRequest,
        ) -> Result<DeleteOffersFromArchiveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_offers_from_archive(business_id, delete_offers_from_archive_request, &context).await
    }

    /// Информация о товарах в каталоге
    async fn get_offer_mappings(
        &self,
        business_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_offer_mappings_request: Option<models::GetOfferMappingsRequest>,
        ) -> Result<GetOfferMappingsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_offer_mappings(business_id, page_token, limit, get_offer_mappings_request, &context).await
    }

    /// Просмотр карточек на Маркете, которые подходят вашим товарам
    async fn get_suggested_offer_mappings(
        &self,
        business_id: i64,
        get_suggested_offer_mappings_request: Option<models::GetSuggestedOfferMappingsRequest>,
        ) -> Result<GetSuggestedOfferMappingsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_suggested_offer_mappings(business_id, get_suggested_offer_mappings_request, &context).await
    }

    /// Добавление товаров в каталог и изменение информации о них
    async fn update_offer_mappings(
        &self,
        business_id: i64,
        update_offer_mappings_request: models::UpdateOfferMappingsRequest,
        ) -> Result<UpdateOfferMappingsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_offer_mappings(business_id, update_offer_mappings_request, &context).await
    }

    /// Настройки кабинета
    async fn get_business_settings(
        &self,
        business_id: i64,
        ) -> Result<GetBusinessSettingsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_business_settings(business_id, &context).await
    }

    /// Список магазинов пользователя
    async fn get_campaigns(
        &self,
        page: Option<i32>,
        page_size: Option<i32>,
        ) -> Result<GetCampaignsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_campaigns(page, page_size, &context).await
    }

    /// Информация о магазине
    async fn get_campaign(
        &self,
        campaign_id: i64,
        ) -> Result<GetCampaignResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_campaign(campaign_id, &context).await
    }

    /// Логины, связанные с магазином
    async fn get_campaign_logins(
        &self,
        campaign_id: i64,
        ) -> Result<GetCampaignLoginsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_campaign_logins(campaign_id, &context).await
    }

    /// Регион магазина
    async fn get_campaign_region(
        &self,
        campaign_id: i64,
        ) -> Result<GetCampaignRegionResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_campaign_region(campaign_id, &context).await
    }

    /// Настройки магазина
    async fn get_campaign_settings(
        &self,
        campaign_id: i64,
        ) -> Result<GetCampaignSettingsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_campaign_settings(campaign_id, &context).await
    }

    /// Магазины, доступные логину
    async fn get_campaigns_by_login(
        &self,
        login: String,
        page: Option<i32>,
        page_size: Option<i32>,
        ) -> Result<GetCampaignsByLoginResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_campaigns_by_login(login, page, page_size, &context).await
    }

    /// Лимит на установку кванта продажи и минимального количества товаров в заказе
    async fn get_categories_max_sale_quantum(
        &self,
        get_categories_max_sale_quantum_request: models::GetCategoriesMaxSaleQuantumRequest,
        ) -> Result<GetCategoriesMaxSaleQuantumResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_categories_max_sale_quantum(get_categories_max_sale_quantum_request, &context).await
    }

    /// Дерево категорий
    async fn get_categories_tree(
        &self,
        get_categories_request: Option<models::GetCategoriesRequest>,
        ) -> Result<GetCategoriesTreeResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_categories_tree(get_categories_request, &context).await
    }

    /// Создание нового чата с покупателем
    async fn create_chat(
        &self,
        business_id: i64,
        create_chat_request: models::CreateChatRequest,
        ) -> Result<CreateChatResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_chat(business_id, create_chat_request, &context).await
    }

    /// Получение истории сообщений в чате
    async fn get_chat_history(
        &self,
        business_id: i64,
        chat_id: i64,
        get_chat_history_request: models::GetChatHistoryRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<GetChatHistoryResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_chat_history(business_id, chat_id, get_chat_history_request, page_token, limit, &context).await
    }

    /// Получение доступных чатов
    async fn get_chats(
        &self,
        business_id: i64,
        get_chats_request: models::GetChatsRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<GetChatsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_chats(business_id, get_chats_request, page_token, limit, &context).await
    }

    /// Отправка файла в чат
    async fn send_file_to_chat(
        &self,
        business_id: i64,
        chat_id: i64,
        file: swagger::ByteArray,
        ) -> Result<SendFileToChatResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().send_file_to_chat(business_id, chat_id, file, &context).await
    }

    /// Отправка сообщения в чат
    async fn send_message_to_chat(
        &self,
        business_id: i64,
        chat_id: i64,
        send_message_to_chat_request: models::SendMessageToChatRequest,
        ) -> Result<SendMessageToChatResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().send_message_to_chat(business_id, chat_id, send_message_to_chat_request, &context).await
    }

    /// Списки характеристик товаров по категориям
    async fn get_category_content_parameters(
        &self,
        category_id: i64,
        ) -> Result<GetCategoryContentParametersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_category_content_parameters(category_id, &context).await
    }

    /// Получение информации о заполненности карточек магазина
    async fn get_offer_cards_content_status(
        &self,
        business_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_offer_cards_content_status_request: Option<models::GetOfferCardsContentStatusRequest>,
        ) -> Result<GetOfferCardsContentStatusResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_offer_cards_content_status(business_id, page_token, limit, get_offer_cards_content_status_request, &context).await
    }

    /// Редактирование категорийных характеристик товара
    async fn update_offer_content(
        &self,
        business_id: i64,
        update_offer_content_request: models::UpdateOfferContentRequest,
        ) -> Result<UpdateOfferContentResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_offer_content(business_id, update_offer_content_request, &context).await
    }

    /// Справочник служб доставки
    async fn get_delivery_services(
        &self,
        ) -> Result<GetDeliveryServicesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_delivery_services(&context).await
    }

    /// Новые и обновленные отзывы о магазине
    async fn get_feedback_and_comment_updates(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        from_date: Option<chrono::naive::NaiveDate>,
        ) -> Result<GetFeedbackAndCommentUpdatesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_feedback_and_comment_updates(campaign_id, page_token, limit, from_date, &context).await
    }

    /// Список прайс-листов магазина
    async fn get_feeds(
        &self,
        campaign_id: i64,
        ) -> Result<GetFeedsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_feeds(campaign_id, &context).await
    }

    /// Информация о прайс-листе
    async fn get_feed(
        &self,
        campaign_id: i64,
        feed_id: i64,
        ) -> Result<GetFeedResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_feed(campaign_id, feed_id, &context).await
    }

    /// Отчет по индексации прайс-листа
    async fn get_feed_index_logs(
        &self,
        campaign_id: i64,
        feed_id: i64,
        limit: Option<i32>,
        published_time_from: Option<chrono::DateTime::<chrono::Utc>>,
        published_time_to: Option<chrono::DateTime::<chrono::Utc>>,
        status: Option<models::FeedIndexLogsStatusType>,
        ) -> Result<GetFeedIndexLogsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_feed_index_logs(campaign_id, feed_id, limit, published_time_from, published_time_to, status, &context).await
    }

    /// Сообщить, что прайс-лист обновился
    async fn refresh_feed(
        &self,
        campaign_id: i64,
        feed_id: i64,
        ) -> Result<RefreshFeedResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().refresh_feed(campaign_id, feed_id, &context).await
    }

    /// Изменение параметров прайс-листа
    async fn set_feed_params(
        &self,
        campaign_id: i64,
        feed_id: i64,
        set_feed_params_request: models::SetFeedParamsRequest,
        ) -> Result<SetFeedParamsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().set_feed_params(campaign_id, feed_id, set_feed_params_request, &context).await
    }

    /// Удаление комментария к отзыву
    async fn delete_goods_feedback_comment(
        &self,
        business_id: i64,
        delete_goods_feedback_comment_request: models::DeleteGoodsFeedbackCommentRequest,
        ) -> Result<DeleteGoodsFeedbackCommentResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_goods_feedback_comment(business_id, delete_goods_feedback_comment_request, &context).await
    }

    /// Получение комментариев к отзыву
    async fn get_goods_feedback_comments(
        &self,
        business_id: i64,
        get_goods_feedback_comments_request: models::GetGoodsFeedbackCommentsRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<GetGoodsFeedbackCommentsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_goods_feedback_comments(business_id, get_goods_feedback_comments_request, page_token, limit, &context).await
    }

    /// Получение отзывов о товарах продавца
    async fn get_goods_feedbacks(
        &self,
        business_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_goods_feedback_request: Option<models::GetGoodsFeedbackRequest>,
        ) -> Result<GetGoodsFeedbacksResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_goods_feedbacks(business_id, page_token, limit, get_goods_feedback_request, &context).await
    }

    /// Отказ от ответа на отзывы
    async fn skip_goods_feedbacks_reaction(
        &self,
        business_id: i64,
        skip_goods_feedback_reaction_request: models::SkipGoodsFeedbackReactionRequest,
        ) -> Result<SkipGoodsFeedbacksReactionResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().skip_goods_feedbacks_reaction(business_id, skip_goods_feedback_reaction_request, &context).await
    }

    /// Добавление нового или изменение созданного комментария
    async fn update_goods_feedback_comment(
        &self,
        business_id: i64,
        update_goods_feedback_comment_request: models::UpdateGoodsFeedbackCommentRequest,
        ) -> Result<UpdateGoodsFeedbackCommentResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_goods_feedback_comment(business_id, update_goods_feedback_comment_request, &context).await
    }

    /// Отчет по товарам
    async fn get_goods_stats(
        &self,
        campaign_id: i64,
        get_goods_stats_request: models::GetGoodsStatsRequest,
        ) -> Result<GetGoodsStatsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_goods_stats(campaign_id, get_goods_stats_request, &context).await
    }

    /// Скрытие товаров и настройки скрытия
    async fn add_hidden_offers(
        &self,
        campaign_id: i64,
        add_hidden_offers_request: models::AddHiddenOffersRequest,
        ) -> Result<AddHiddenOffersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().add_hidden_offers(campaign_id, add_hidden_offers_request, &context).await
    }

    /// Возобновление показа товаров
    async fn delete_hidden_offers(
        &self,
        campaign_id: i64,
        delete_hidden_offers_request: models::DeleteHiddenOffersRequest,
        ) -> Result<DeleteHiddenOffersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_hidden_offers(campaign_id, delete_hidden_offers_request, &context).await
    }

    /// Информация о скрытых вами товарах
    async fn get_hidden_offers(
        &self,
        campaign_id: i64,
        offer_id: Option<&Vec<models::ShopSku>>,
        page_token: Option<String>,
        limit: Option<i32>,
        offset: Option<i32>,
        page: Option<i32>,
        page_size: Option<i32>,
        ) -> Result<GetHiddenOffersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_hidden_offers(campaign_id, offer_id, page_token, limit, offset, page, page_size, &context).await
    }

    /// Информация о нескольких моделях
    async fn get_models(
        &self,
        region_id: i64,
        get_models_request: models::GetModelsRequest,
        currency: Option<models::CurrencyType>,
        ) -> Result<GetModelsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_models(region_id, get_models_request, currency, &context).await
    }

    /// Список предложений для нескольких моделей
    async fn get_models_offers(
        &self,
        region_id: i64,
        get_models_request: models::GetModelsRequest,
        currency: Option<models::CurrencyType>,
        order_by_price: Option<models::SortOrderType>,
        ) -> Result<GetModelsOffersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_models_offers(region_id, get_models_request, currency, order_by_price, &context).await
    }

    /// Поиск модели товара
    async fn search_models(
        &self,
        query: String,
        region_id: i64,
        currency: Option<models::CurrencyType>,
        page: Option<i32>,
        page_size: Option<i32>,
        ) -> Result<SearchModelsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().search_models(query, region_id, currency, page, page_size, &context).await
    }

    /// Информация об одной модели
    async fn get_model(
        &self,
        model_id: i64,
        region_id: i64,
        currency: Option<models::CurrencyType>,
        ) -> Result<GetModelResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_model(model_id, region_id, currency, &context).await
    }

    /// Список предложений для одной модели
    async fn get_model_offers(
        &self,
        model_id: i64,
        region_id: i64,
        currency: Option<models::CurrencyType>,
        order_by_price: Option<models::SortOrderType>,
        count: Option<i32>,
        page: Option<i32>,
        ) -> Result<GetModelOffersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_model_offers(model_id, region_id, currency, order_by_price, count, page, &context).await
    }

    /// Список товаров в каталоге
    async fn get_offer_mapping_entries(
        &self,
        campaign_id: i64,
        offer_id: Option<&Vec<String>>,
        shop_sku: Option<&Vec<models::ShopSku>>,
        mapping_kind: Option<models::OfferMappingKindType>,
        status: Option<&Vec<models::OfferProcessingStatusType>>,
        availability: Option<&Vec<models::OfferAvailabilityStatusType>>,
        category_id: Option<&Vec<i32>>,
        vendor: Option<&Vec<String>>,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<GetOfferMappingEntriesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_offer_mapping_entries(campaign_id, offer_id, shop_sku, mapping_kind, status, availability, category_id, vendor, page_token, limit, &context).await
    }

    /// Рекомендованные карточки для товаров
    async fn get_suggested_offer_mapping_entries(
        &self,
        campaign_id: i64,
        get_suggested_offer_mapping_entries_request: models::GetSuggestedOfferMappingEntriesRequest,
        ) -> Result<GetSuggestedOfferMappingEntriesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_suggested_offer_mapping_entries(campaign_id, get_suggested_offer_mapping_entries_request, &context).await
    }

    /// Добавление и редактирование товаров в каталоге
    async fn update_offer_mapping_entries(
        &self,
        campaign_id: i64,
        update_offer_mapping_entry_request: models::UpdateOfferMappingEntryRequest,
        ) -> Result<UpdateOfferMappingEntriesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_offer_mapping_entries(campaign_id, update_offer_mapping_entry_request, &context).await
    }

    /// Удаление товаров из ассортимента магазина
    async fn delete_campaign_offers(
        &self,
        campaign_id: i64,
        delete_campaign_offers_request: models::DeleteCampaignOffersRequest,
        ) -> Result<DeleteCampaignOffersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_campaign_offers(campaign_id, delete_campaign_offers_request, &context).await
    }

    /// Все предложения магазина
    async fn get_all_offers(
        &self,
        campaign_id: i64,
        feed_id: Option<i64>,
        chunk: Option<i32>,
        ) -> Result<GetAllOffersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_all_offers(campaign_id, feed_id, chunk, &context).await
    }

    /// Информация о товарах, которые размещены в заданном магазине
    async fn get_campaign_offers(
        &self,
        campaign_id: i64,
        get_campaign_offers_request: models::GetCampaignOffersRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<GetCampaignOffersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_campaign_offers(campaign_id, get_campaign_offers_request, page_token, limit, &context).await
    }

    /// Рекомендации Маркета, касающиеся цен
    async fn get_offer_recommendations(
        &self,
        business_id: i64,
        get_offer_recommendations_request: models::GetOfferRecommendationsRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<GetOfferRecommendationsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_offer_recommendations(business_id, get_offer_recommendations_request, page_token, limit, &context).await
    }

    /// Предложения магазина
    async fn get_offers(
        &self,
        campaign_id: i64,
        query: Option<String>,
        feed_id: Option<i64>,
        shop_category_id: Option<String>,
        currency: Option<models::CurrencyType>,
        matched: Option<bool>,
        page: Option<i32>,
        page_size: Option<i32>,
        ) -> Result<GetOffersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_offers(campaign_id, query, feed_id, shop_category_id, currency, matched, page, page_size, &context).await
    }

    /// Изменение условий продажи товаров в магазине
    async fn update_campaign_offers(
        &self,
        campaign_id: i64,
        update_campaign_offers_request: models::UpdateCampaignOffersRequest,
        ) -> Result<UpdateCampaignOffersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_campaign_offers(campaign_id, update_campaign_offers_request, &context).await
    }

    /// Информация о покупателе — юридическом лице
    async fn get_order_business_buyer_info(
        &self,
        campaign_id: i64,
        order_id: i64,
        ) -> Result<GetOrderBusinessBuyerInfoResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_order_business_buyer_info(campaign_id, order_id, &context).await
    }

    /// Информация о документах
    async fn get_order_business_documents_info(
        &self,
        campaign_id: i64,
        order_id: i64,
        ) -> Result<GetOrderBusinessDocumentsInfoResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_order_business_documents_info(campaign_id, order_id, &context).await
    }

    /// Информация о покупателе — физическом лице
    async fn get_order_buyer_info(
        &self,
        campaign_id: i64,
        order_id: i64,
        ) -> Result<GetOrderBuyerInfoResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_order_buyer_info(campaign_id, order_id, &context).await
    }

    /// Изменение даты доставки заказа
    async fn set_order_delivery_date(
        &self,
        campaign_id: i64,
        order_id: i64,
        set_order_delivery_date_request: models::SetOrderDeliveryDateRequest,
        ) -> Result<SetOrderDeliveryDateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().set_order_delivery_date(campaign_id, order_id, set_order_delivery_date_request, &context).await
    }

    /// Передача трек‑номера посылки
    async fn set_order_delivery_track_code(
        &self,
        campaign_id: i64,
        order_id: i64,
        set_order_delivery_track_code_request: models::SetOrderDeliveryTrackCodeRequest,
        ) -> Result<SetOrderDeliveryTrackCodeResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().set_order_delivery_track_code(campaign_id, order_id, set_order_delivery_track_code_request, &context).await
    }

    /// Продление срока хранения заказа
    async fn update_order_storage_limit(
        &self,
        campaign_id: i64,
        order_id: i64,
        update_order_storage_limit_request: models::UpdateOrderStorageLimitRequest,
        ) -> Result<UpdateOrderStorageLimitResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_order_storage_limit(campaign_id, order_id, update_order_storage_limit_request, &context).await
    }

    /// Передача кода подтверждения
    async fn verify_order_eac(
        &self,
        campaign_id: i64,
        order_id: i64,
        verify_order_eac_request: models::VerifyOrderEacRequest,
        ) -> Result<VerifyOrderEacResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().verify_order_eac(campaign_id, order_id, verify_order_eac_request, &context).await
    }

    /// Готовые ярлыки‑наклейки на все коробки в одном заказе
    async fn generate_order_labels(
        &self,
        campaign_id: i64,
        order_id: i64,
        format: Option<models::PageFormatType>,
        ) -> Result<GenerateOrderLabelsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().generate_order_labels(campaign_id, order_id, format, &context).await
    }

    /// Данные для самостоятельного изготовления ярлыков
    async fn get_order_labels_data(
        &self,
        campaign_id: i64,
        order_id: i64,
        ) -> Result<GetOrderLabelsDataResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_order_labels_data(campaign_id, order_id, &context).await
    }

    /// Готовый ярлык‑наклейка для коробки в заказе
    async fn generate_order_label(
        &self,
        campaign_id: i64,
        order_id: i64,
        shipment_id: i64,
        box_id: i64,
        format: Option<models::PageFormatType>,
        ) -> Result<GenerateOrderLabelResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().generate_order_label(campaign_id, order_id, shipment_id, box_id, format, &context).await
    }

    /// Информация о нескольких заказах
    async fn get_orders(
        &self,
        campaign_id: i64,
        order_ids: Option<&Vec<i64>>,
        status: Option<&Vec<models::OrderStatusType>>,
        substatus: Option<&Vec<models::OrderSubstatusType>>,
        from_date: Option<chrono::naive::NaiveDate>,
        to_date: Option<chrono::naive::NaiveDate>,
        supplier_shipment_date_from: Option<chrono::naive::NaiveDate>,
        supplier_shipment_date_to: Option<chrono::naive::NaiveDate>,
        updated_at_from: Option<chrono::DateTime::<chrono::Utc>>,
        updated_at_to: Option<chrono::DateTime::<chrono::Utc>>,
        dispatch_type: Option<models::OrderDeliveryDispatchType>,
        fake: Option<bool>,
        has_cis: Option<bool>,
        only_waiting_for_cancellation_approve: Option<bool>,
        only_estimated_delivery: Option<bool>,
        buyer_type: Option<models::OrderBuyerType>,
        page: Option<i32>,
        page_size: Option<i32>,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<GetOrdersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_orders(campaign_id, order_ids, status, substatus, from_date, to_date, supplier_shipment_date_from, supplier_shipment_date_to, updated_at_from, updated_at_to, dispatch_type, fake, has_cis, only_waiting_for_cancellation_approve, only_estimated_delivery, buyer_type, page, page_size, page_token, limit, &context).await
    }

    /// Изменение статусов нескольких заказов
    async fn update_order_statuses(
        &self,
        campaign_id: i64,
        update_order_statuses_request: models::UpdateOrderStatusesRequest,
        ) -> Result<UpdateOrderStatusesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_order_statuses(campaign_id, update_order_statuses_request, &context).await
    }

    /// Отмена заказа покупателем
    async fn accept_order_cancellation(
        &self,
        campaign_id: i64,
        order_id: i64,
        accept_order_cancellation_request: models::AcceptOrderCancellationRequest,
        ) -> Result<AcceptOrderCancellationResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().accept_order_cancellation(campaign_id, order_id, accept_order_cancellation_request, &context).await
    }

    /// Информация об одном заказе
    async fn get_order(
        &self,
        campaign_id: i64,
        order_id: i64,
        ) -> Result<GetOrderResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_order(campaign_id, order_id, &context).await
    }

    /// Передача ключей цифровых товаров
    async fn provide_order_digital_codes(
        &self,
        campaign_id: i64,
        order_id: i64,
        provide_order_digital_codes_request: models::ProvideOrderDigitalCodesRequest,
        ) -> Result<ProvideOrderDigitalCodesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().provide_order_digital_codes(campaign_id, order_id, provide_order_digital_codes_request, &context).await
    }

    /// Передача кодов маркировки единиц товара
    async fn provide_order_item_identifiers(
        &self,
        campaign_id: i64,
        order_id: i64,
        provide_order_item_identifiers_request: models::ProvideOrderItemIdentifiersRequest,
        ) -> Result<ProvideOrderItemIdentifiersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().provide_order_item_identifiers(campaign_id, order_id, provide_order_item_identifiers_request, &context).await
    }

    /// Подготовка заказа
    async fn set_order_box_layout(
        &self,
        campaign_id: i64,
        order_id: i64,
        set_order_box_layout_request: models::SetOrderBoxLayoutRequest,
        ) -> Result<SetOrderBoxLayoutResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().set_order_box_layout(campaign_id, order_id, set_order_box_layout_request, &context).await
    }

    /// Удаление товара из заказа или уменьшение числа единиц
    async fn update_order_items(
        &self,
        campaign_id: i64,
        order_id: i64,
        update_order_item_request: models::UpdateOrderItemRequest,
        ) -> Result<UpdateOrderItemsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_order_items(campaign_id, order_id, update_order_item_request, &context).await
    }

    /// Изменение статуса одного заказа
    async fn update_order_status(
        &self,
        campaign_id: i64,
        order_id: i64,
        update_order_status_request: models::UpdateOrderStatusRequest,
        ) -> Result<UpdateOrderStatusResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_order_status(campaign_id, order_id, update_order_status_request, &context).await
    }

    /// Передача количества грузовых мест в заказе
    async fn set_order_shipment_boxes(
        &self,
        campaign_id: i64,
        order_id: i64,
        shipment_id: i64,
        set_order_shipment_boxes_request: models::SetOrderShipmentBoxesRequest,
        ) -> Result<SetOrderShipmentBoxesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().set_order_shipment_boxes(campaign_id, order_id, shipment_id, set_order_shipment_boxes_request, &context).await
    }

    /// Детальная информация по заказам
    async fn get_orders_stats(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_orders_stats_request: Option<models::GetOrdersStatsRequest>,
        ) -> Result<GetOrdersStatsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_orders_stats(campaign_id, page_token, limit, get_orders_stats_request, &context).await
    }

    /// Удаление лицензий для точек продаж
    async fn delete_outlet_licenses(
        &self,
        campaign_id: i64,
        ids: Option<&Vec<i64>>,
        ) -> Result<DeleteOutletLicensesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_outlet_licenses(campaign_id, ids, &context).await
    }

    /// Информация о лицензиях для точек продаж
    async fn get_outlet_licenses(
        &self,
        campaign_id: i64,
        outlet_ids: Option<&Vec<i64>>,
        ids: Option<&Vec<i64>>,
        ) -> Result<GetOutletLicensesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_outlet_licenses(campaign_id, outlet_ids, ids, &context).await
    }

    /// Создание и изменение лицензий для точек продаж
    async fn update_outlet_licenses(
        &self,
        campaign_id: i64,
        update_outlet_license_request: models::UpdateOutletLicenseRequest,
        ) -> Result<UpdateOutletLicensesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_outlet_licenses(campaign_id, update_outlet_license_request, &context).await
    }

    /// Создание точки продаж
    async fn create_outlet(
        &self,
        campaign_id: i64,
        change_outlet_request: models::ChangeOutletRequest,
        ) -> Result<CreateOutletResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_outlet(campaign_id, change_outlet_request, &context).await
    }

    /// Информация о нескольких точках продаж
    async fn get_outlets(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        region_id: Option<i64>,
        shop_outlet_code: Option<String>,
        region_id2: Option<i64>,
        ) -> Result<GetOutletsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_outlets(campaign_id, page_token, region_id, shop_outlet_code, region_id2, &context).await
    }

    /// Удаление точки продаж
    async fn delete_outlet(
        &self,
        campaign_id: i64,
        outlet_id: i64,
        ) -> Result<DeleteOutletResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_outlet(campaign_id, outlet_id, &context).await
    }

    /// Информация об одной точке продаж
    async fn get_outlet(
        &self,
        campaign_id: i64,
        outlet_id: i64,
        ) -> Result<GetOutletResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_outlet(campaign_id, outlet_id, &context).await
    }

    /// Изменение информации о точке продаж
    async fn update_outlet(
        &self,
        campaign_id: i64,
        outlet_id: i64,
        change_outlet_request: models::ChangeOutletRequest,
        ) -> Result<UpdateOutletResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_outlet(campaign_id, outlet_id, change_outlet_request, &context).await
    }

    /// Удаление товара из карантина по цене в кабинете
    async fn confirm_business_prices(
        &self,
        business_id: i64,
        confirm_prices_request: models::ConfirmPricesRequest,
        ) -> Result<ConfirmBusinessPricesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().confirm_business_prices(business_id, confirm_prices_request, &context).await
    }

    /// Удаление товара из карантина по цене в магазине
    async fn confirm_campaign_prices(
        &self,
        campaign_id: i64,
        confirm_prices_request: models::ConfirmPricesRequest,
        ) -> Result<ConfirmCampaignPricesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().confirm_campaign_prices(campaign_id, confirm_prices_request, &context).await
    }

    /// Список товаров, находящихся в карантине по цене в кабинете
    async fn get_business_quarantine_offers(
        &self,
        business_id: i64,
        get_quarantine_offers_request: models::GetQuarantineOffersRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<GetBusinessQuarantineOffersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_business_quarantine_offers(business_id, get_quarantine_offers_request, page_token, limit, &context).await
    }

    /// Список товаров, находящихся в карантине по цене в магазине
    async fn get_campaign_quarantine_offers(
        &self,
        campaign_id: i64,
        get_quarantine_offers_request: models::GetQuarantineOffersRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<GetCampaignQuarantineOffersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_campaign_quarantine_offers(campaign_id, get_quarantine_offers_request, page_token, limit, &context).await
    }

    /// Список цен
    async fn get_prices(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        archived: Option<bool>,
        ) -> Result<GetPricesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_prices(campaign_id, page_token, limit, archived, &context).await
    }

    /// Просмотр цен на указанные товары в магазине
    async fn get_prices_by_offer_ids(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_prices_by_offer_ids_request: Option<models::GetPricesByOfferIdsRequest>,
        ) -> Result<GetPricesByOfferIdsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_prices_by_offer_ids(campaign_id, page_token, limit, get_prices_by_offer_ids_request, &context).await
    }

    /// Цены для продвижения товаров
    async fn get_suggested_prices(
        &self,
        campaign_id: i64,
        suggest_prices_request: models::SuggestPricesRequest,
        ) -> Result<GetSuggestedPricesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_suggested_prices(campaign_id, suggest_prices_request, &context).await
    }

    /// Установка цен на товары во всех магазинах
    async fn update_business_prices(
        &self,
        business_id: i64,
        update_business_prices_request: models::UpdateBusinessPricesRequest,
        ) -> Result<UpdateBusinessPricesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_business_prices(business_id, update_business_prices_request, &context).await
    }

    /// Установка цен на товары в конкретном магазине
    async fn update_prices(
        &self,
        campaign_id: i64,
        update_prices_request: models::UpdatePricesRequest,
        ) -> Result<UpdatePricesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_prices(campaign_id, update_prices_request, &context).await
    }

    /// Удаление товаров из акции
    async fn delete_promo_offers(
        &self,
        business_id: i64,
        delete_promo_offers_request: models::DeletePromoOffersRequest,
        ) -> Result<DeletePromoOffersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_promo_offers(business_id, delete_promo_offers_request, &context).await
    }

    /// Получение списка товаров, которые участвуют или могут участвовать в акции
    async fn get_promo_offers(
        &self,
        business_id: i64,
        get_promo_offers_request: models::GetPromoOffersRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<GetPromoOffersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_promo_offers(business_id, get_promo_offers_request, page_token, limit, &context).await
    }

    /// Получение списка акций
    async fn get_promos(
        &self,
        business_id: i64,
        get_promos_request: Option<models::GetPromosRequest>,
        ) -> Result<GetPromosResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_promos(business_id, get_promos_request, &context).await
    }

    /// Добавление товаров в акцию или изменение их цен
    async fn update_promo_offers(
        &self,
        business_id: i64,
        update_promo_offers_request: models::UpdatePromoOffersRequest,
        ) -> Result<UpdatePromoOffersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_promo_offers(business_id, update_promo_offers_request, &context).await
    }

    /// Заказы, которые повлияли на индекс качества
    async fn get_quality_rating_details(
        &self,
        campaign_id: i64,
        ) -> Result<GetQualityRatingDetailsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_quality_rating_details(campaign_id, &context).await
    }

    /// Индекс качества магазинов
    async fn get_quality_ratings(
        &self,
        business_id: i64,
        get_quality_rating_request: models::GetQualityRatingRequest,
        ) -> Result<GetQualityRatingsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_quality_ratings(business_id, get_quality_rating_request, &context).await
    }

    /// Поиск регионов по их имени
    async fn search_regions_by_name(
        &self,
        name: String,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<SearchRegionsByNameResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().search_regions_by_name(name, page_token, limit, &context).await
    }

    /// Информация о дочерних регионах
    async fn search_region_children(
        &self,
        region_id: i64,
        page: Option<i32>,
        page_size: Option<i32>,
        ) -> Result<SearchRegionChildrenResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().search_region_children(region_id, page, page_size, &context).await
    }

    /// Информация о регионе
    async fn search_regions_by_id(
        &self,
        region_id: i64,
        ) -> Result<SearchRegionsByIdResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().search_regions_by_id(region_id, &context).await
    }

    /// Отчет по бусту продаж
    async fn generate_boost_consolidated_report(
        &self,
        generate_boost_consolidated_request: models::GenerateBoostConsolidatedRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateBoostConsolidatedReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().generate_boost_consolidated_report(generate_boost_consolidated_request, format, &context).await
    }

    /// Отчет «Конкурентная позиция»
    async fn generate_competitors_position_report(
        &self,
        generate_competitors_position_report_request: models::GenerateCompetitorsPositionReportRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateCompetitorsPositionReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().generate_competitors_position_report(generate_competitors_position_report_request, format, &context).await
    }

    /// Отчет по отзывам о товарах
    async fn generate_goods_feedback_report(
        &self,
        generate_goods_feedback_request: models::GenerateGoodsFeedbackRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateGoodsFeedbackReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().generate_goods_feedback_report(generate_goods_feedback_request, format, &context).await
    }

    /// Отчет по движению товаров
    async fn generate_goods_movement_report(
        &self,
        generate_goods_movement_report_request: models::GenerateGoodsMovementReportRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateGoodsMovementReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().generate_goods_movement_report(generate_goods_movement_report_request, format, &context).await
    }

    /// Отчет по реализации
    async fn generate_goods_realization_report(
        &self,
        generate_goods_realization_report_request: models::GenerateGoodsRealizationReportRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateGoodsRealizationReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().generate_goods_realization_report(generate_goods_realization_report_request, format, &context).await
    }

    /// Отчет по оборачиваемости
    async fn generate_goods_turnover_report(
        &self,
        generate_goods_turnover_request: models::GenerateGoodsTurnoverRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateGoodsTurnoverReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().generate_goods_turnover_report(generate_goods_turnover_request, format, &context).await
    }

    /// Готовые ярлыки‑наклейки на все коробки в нескольких заказах
    async fn generate_mass_order_labels_report(
        &self,
        generate_mass_order_labels_request: models::GenerateMassOrderLabelsRequest,
        format: Option<models::PageFormatType>,
        ) -> Result<GenerateMassOrderLabelsReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().generate_mass_order_labels_report(generate_mass_order_labels_request, format, &context).await
    }

    /// Отчет «Цены на рынке»
    async fn generate_prices_report(
        &self,
        generate_prices_report_request: models::GeneratePricesReportRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GeneratePricesReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().generate_prices_report(generate_prices_report_request, format, &context).await
    }

    /// Отчет по полкам
    async fn generate_shelfs_statistics_report(
        &self,
        generate_shelfs_statistics_request: models::GenerateShelfsStatisticsRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateShelfsStatisticsReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().generate_shelfs_statistics_report(generate_shelfs_statistics_request, format, &context).await
    }

    /// Получение листа сборки
    async fn generate_shipment_list_document_report(
        &self,
        generate_shipment_list_document_report_request: models::GenerateShipmentListDocumentReportRequest,
        ) -> Result<GenerateShipmentListDocumentReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().generate_shipment_list_document_report(generate_shipment_list_document_report_request, &context).await
    }

    /// Отчет «Аналитика продаж»
    async fn generate_shows_sales_report(
        &self,
        generate_shows_sales_report_request: models::GenerateShowsSalesReportRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateShowsSalesReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().generate_shows_sales_report(generate_shows_sales_report_request, format, &context).await
    }

    /// Отчет по остаткам на складах
    async fn generate_stocks_on_warehouses_report(
        &self,
        generate_stocks_on_warehouses_report_request: models::GenerateStocksOnWarehousesReportRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateStocksOnWarehousesReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().generate_stocks_on_warehouses_report(generate_stocks_on_warehouses_report_request, format, &context).await
    }

    /// Отчет по стоимости услуг
    async fn generate_united_marketplace_services_report(
        &self,
        generate_united_marketplace_services_report_request: models::GenerateUnitedMarketplaceServicesReportRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateUnitedMarketplaceServicesReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().generate_united_marketplace_services_report(generate_united_marketplace_services_report_request, format, &context).await
    }

    /// Отчет по платежам
    async fn generate_united_netting_report(
        &self,
        generate_united_netting_report_request: models::GenerateUnitedNettingReportRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateUnitedNettingReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().generate_united_netting_report(generate_united_netting_report_request, format, &context).await
    }

    /// Отчет по заказам
    async fn generate_united_orders_report(
        &self,
        generate_united_orders_request: models::GenerateUnitedOrdersRequest,
        format: Option<models::ReportFormatType>,
        ) -> Result<GenerateUnitedOrdersReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().generate_united_orders_report(generate_united_orders_request, format, &context).await
    }

    /// Получение заданного отчета
    async fn get_report_info(
        &self,
        report_id: String,
        ) -> Result<GetReportInfoResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_report_info(report_id, &context).await
    }

    /// Список невыкупов и возвратов
    async fn get_returns(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        order_ids: Option<&Vec<i64>>,
        statuses: Option<&Vec<models::RefundStatusType>>,
        r#type: Option<models::ReturnType>,
        from_date: Option<chrono::naive::NaiveDate>,
        to_date: Option<chrono::naive::NaiveDate>,
        from_date2: Option<chrono::naive::NaiveDate>,
        to_date2: Option<chrono::naive::NaiveDate>,
        ) -> Result<GetReturnsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_returns(campaign_id, page_token, limit, order_ids, statuses, r#type, from_date, to_date, from_date2, to_date2, &context).await
    }

    /// Информация о невыкупе или возврате
    async fn get_return(
        &self,
        campaign_id: i64,
        order_id: i64,
        return_id: i64,
        ) -> Result<GetReturnResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_return(campaign_id, order_id, return_id, &context).await
    }

    /// Получение заявления на возврат
    async fn get_return_application(
        &self,
        campaign_id: i64,
        order_id: i64,
        return_id: i64,
        ) -> Result<GetReturnApplicationResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_return_application(campaign_id, order_id, return_id, &context).await
    }

    /// Принятие или изменение решения по возврату
    async fn set_return_decision(
        &self,
        campaign_id: i64,
        order_id: i64,
        return_id: i64,
        set_return_decision_request: models::SetReturnDecisionRequest,
        ) -> Result<SetReturnDecisionResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().set_return_decision(campaign_id, order_id, return_id, set_return_decision_request, &context).await
    }

    /// Подтверждение решения по возврату
    async fn submit_return_decision(
        &self,
        campaign_id: i64,
        order_id: i64,
        return_id: i64,
        ) -> Result<SubmitReturnDecisionResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().submit_return_decision(campaign_id, order_id, return_id, &context).await
    }

    /// Получение фотографии возврата
    async fn get_return_photo(
        &self,
        campaign_id: i64,
        order_id: i64,
        return_id: i64,
        item_id: i64,
        image_hash: String,
        ) -> Result<GetReturnPhotoResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_return_photo(campaign_id, order_id, return_id, item_id, image_hash, &context).await
    }

    /// Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
    async fn download_shipment_reception_transfer_act(
        &self,
        campaign_id: i64,
        warehouse_id: Option<i32>,
        ) -> Result<DownloadShipmentReceptionTransferActResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().download_shipment_reception_transfer_act(campaign_id, warehouse_id, &context).await
    }

    /// Получение информации о нескольких отгрузках
    async fn search_shipments(
        &self,
        campaign_id: i64,
        search_shipments_request: models::SearchShipmentsRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        ) -> Result<SearchShipmentsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().search_shipments(campaign_id, search_shipments_request, page_token, limit, &context).await
    }

    /// Подтверждение отгрузки
    async fn confirm_shipment(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        confirm_shipment_request: Option<models::ConfirmShipmentRequest>,
        ) -> Result<ConfirmShipmentResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().confirm_shipment(campaign_id, shipment_id, confirm_shipment_request, &context).await
    }

    /// Получение акта приема-передачи
    async fn download_shipment_act(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        ) -> Result<DownloadShipmentActResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().download_shipment_act(campaign_id, shipment_id, &context).await
    }

    /// Получение акта расхождений
    async fn download_shipment_discrepancy_act(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        ) -> Result<DownloadShipmentDiscrepancyActResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().download_shipment_discrepancy_act(campaign_id, shipment_id, &context).await
    }

    /// Получение фактического акта приема-передачи
    async fn download_shipment_inbound_act(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        ) -> Result<DownloadShipmentInboundActResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().download_shipment_inbound_act(campaign_id, shipment_id, &context).await
    }

    /// Ярлыки для доверительной приемки (FBS)
    async fn download_shipment_pallet_labels(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        format: Option<models::ShipmentPalletLabelPageFormatType>,
        ) -> Result<DownloadShipmentPalletLabelsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().download_shipment_pallet_labels(campaign_id, shipment_id, format, &context).await
    }

    /// Получение транспортной накладной
    async fn download_shipment_transportation_waybill(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        ) -> Result<DownloadShipmentTransportationWaybillResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().download_shipment_transportation_waybill(campaign_id, shipment_id, &context).await
    }

    /// Получение информации об одной отгрузке
    async fn get_shipment(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        cancelled_orders: Option<bool>,
        ) -> Result<GetShipmentResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_shipment(campaign_id, shipment_id, cancelled_orders, &context).await
    }

    /// Получение информации о возможности печати ярлыков (FBS)
    async fn get_shipment_orders_info(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        ) -> Result<GetShipmentOrdersInfoResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_shipment_orders_info(campaign_id, shipment_id, &context).await
    }

    /// Передача количества упаковок в отгрузке
    async fn set_shipment_pallets_count(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        set_shipment_pallets_count_request: models::SetShipmentPalletsCountRequest,
        ) -> Result<SetShipmentPalletsCountResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().set_shipment_pallets_count(campaign_id, shipment_id, set_shipment_pallets_count_request, &context).await
    }

    /// Перенос заказов в следующую отгрузку
    async fn transfer_orders_from_shipment(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        transfer_orders_from_shipment_request: models::TransferOrdersFromShipmentRequest,
        ) -> Result<TransferOrdersFromShipmentResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().transfer_orders_from_shipment(campaign_id, shipment_id, transfer_orders_from_shipment_request, &context).await
    }

    /// Информация об остатках и оборачиваемости
    async fn get_stocks(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_warehouse_stocks_request: Option<models::GetWarehouseStocksRequest>,
        ) -> Result<GetStocksResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_stocks(campaign_id, page_token, limit, get_warehouse_stocks_request, &context).await
    }

    /// Передача информации об остатках
    async fn update_stocks(
        &self,
        campaign_id: i64,
        update_stocks_request: models::UpdateStocksRequest,
        ) -> Result<UpdateStocksResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_stocks(campaign_id, update_stocks_request, &context).await
    }

    /// Калькулятор стоимости услуг
    async fn calculate_tariffs(
        &self,
        calculate_tariffs_request: models::CalculateTariffsRequest,
        ) -> Result<CalculateTariffsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().calculate_tariffs(calculate_tariffs_request, &context).await
    }

    /// Идентификаторы складов Маркета (FBY)
    async fn get_fulfillment_warehouses(
        &self,
        ) -> Result<GetFulfillmentWarehousesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_fulfillment_warehouses(&context).await
    }

    /// Список складов и групп складов
    async fn get_warehouses(
        &self,
        business_id: i64,
        ) -> Result<GetWarehousesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_warehouses(business_id, &context).await
    }

}


#[cfg(feature = "client")]
pub mod client;

// Re-export Client as a top-level name
#[cfg(feature = "client")]
pub use client::Client;

#[cfg(feature = "server")]
pub mod server;

// Re-export router() as a top-level name
#[cfg(feature = "server")]
pub use self::server::Service;

#[cfg(feature = "server")]
pub mod context;

pub mod models;

#[cfg(any(feature = "client", feature = "server"))]
pub(crate) mod header;
