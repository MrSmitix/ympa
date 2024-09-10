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
#[allow(clippy::large_enum_variant)]
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
#[allow(clippy::large_enum_variant)]
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
#[allow(clippy::large_enum_variant)]
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
#[allow(clippy::large_enum_variant)]
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


/// ChatsDbsExpressFbsFby
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait ChatsDbsExpressFbsFby {
    /// Создание нового чата с покупателем.
    ///
    /// CreateChat - POST /businesses/{businessId}/chats/new
    async fn create_chat(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::CreateChatPathParams,
            body: models::CreateChatRequest,
    ) -> Result<CreateChatResponse, String>;

    /// Получение истории сообщений в чате.
    ///
    /// GetChatHistory - POST /businesses/{businessId}/chats/history
    async fn get_chat_history(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetChatHistoryPathParams,
      query_params: models::GetChatHistoryQueryParams,
            body: models::GetChatHistoryRequest,
    ) -> Result<GetChatHistoryResponse, String>;

    /// Получение доступных чатов.
    ///
    /// GetChats - POST /businesses/{businessId}/chats
    async fn get_chats(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetChatsPathParams,
      query_params: models::GetChatsQueryParams,
            body: models::GetChatsRequest,
    ) -> Result<GetChatsResponse, String>;

    /// Отправка файла в чат.
    ///
    /// SendFileToChat - POST /businesses/{businessId}/chats/file/send
    async fn send_file_to_chat(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SendFileToChatPathParams,
      query_params: models::SendFileToChatQueryParams,
        body: Multipart,
    ) -> Result<SendFileToChatResponse, String>;

    /// Отправка сообщения в чат.
    ///
    /// SendMessageToChat - POST /businesses/{businessId}/chats/message
    async fn send_message_to_chat(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SendMessageToChatPathParams,
      query_params: models::SendMessageToChatQueryParams,
            body: models::SendMessageToChatRequest,
    ) -> Result<SendMessageToChatResponse, String>;
}
