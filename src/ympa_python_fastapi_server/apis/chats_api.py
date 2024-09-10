# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from ympa_python_fastapi_server.apis.chats_api_base import BaseChatsApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from ympa_python_fastapi_server.models.extra_models import TokenModel  # noqa: F401
from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_fastapi_server.models.create_chat_request import CreateChatRequest
from ympa_python_fastapi_server.models.create_chat_response import CreateChatResponse
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse
from ympa_python_fastapi_server.models.get_chat_history_request import GetChatHistoryRequest
from ympa_python_fastapi_server.models.get_chat_history_response import GetChatHistoryResponse
from ympa_python_fastapi_server.models.get_chats_request import GetChatsRequest
from ympa_python_fastapi_server.models.get_chats_response import GetChatsResponse
from ympa_python_fastapi_server.models.send_message_to_chat_request import SendMessageToChatRequest
from ympa_python_fastapi_server.security_api import get_token_OAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/businesses/{businessId}/chats/new",
    responses={
        200: {"model": CreateChatResponse, "description": "Все получилось: чат создан. "},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["chats","dbs","fbs","fby","express"],
    summary="Создание нового чата с покупателем",
    response_model_by_alias=True,
)
async def create_chat(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    create_chat_request: CreateChatRequest = Body(None, description="description"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> CreateChatResponse:
    """Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| """
    if not BaseChatsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseChatsApi.subclasses[0]().create_chat(businessId, create_chat_request)


@router.post(
    "/businesses/{businessId}/chats/history",
    responses={
        200: {"model": GetChatHistoryResponse, "description": "История сообщений успешно получена. "},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["chats","dbs","fbs","fby","express"],
    summary="Получение истории сообщений в чате",
    response_model_by_alias=True,
)
async def get_chat_history(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    chat_id: int = Query(None, description="Идентификатор чата.", alias="chatId"),
    get_chat_history_request: GetChatHistoryRequest = Body(None, description="description"),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetChatHistoryResponse:
    """Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| """
    if not BaseChatsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseChatsApi.subclasses[0]().get_chat_history(businessId, chat_id, get_chat_history_request, page_token, limit)


@router.post(
    "/businesses/{businessId}/chats",
    responses={
        200: {"model": GetChatsResponse, "description": "Список чатов. "},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["chats","dbs","fbs","fby","express"],
    summary="Получение доступных чатов",
    response_model_by_alias=True,
)
async def get_chats(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    get_chats_request: GetChatsRequest = Body(None, description="description"),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetChatsResponse:
    """Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| """
    if not BaseChatsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseChatsApi.subclasses[0]().get_chats(businessId, get_chats_request, page_token, limit)


@router.post(
    "/businesses/{businessId}/chats/file/send",
    responses={
        200: {"model": EmptyApiResponse, "description": "Пустой ответ. Означает, что файл отправлен."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["chats","dbs","fbs","fby","express"],
    summary="Отправка файла в чат",
    response_model_by_alias=True,
)
async def send_file_to_chat(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    chat_id: int = Query(None, description="Идентификатор чата.", alias="chatId"),
    file: str = Form(None, description="Содержимое файла. Максимальный размер файла — 5 Мбайт."),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| """
    if not BaseChatsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseChatsApi.subclasses[0]().send_file_to_chat(businessId, chat_id, file)


@router.post(
    "/businesses/{businessId}/chats/message",
    responses={
        200: {"model": EmptyApiResponse, "description": "Пустой ответ. Означает, что сообщение отправлено."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["chats","dbs","fbs","fby","express"],
    summary="Отправка сообщения в чат",
    response_model_by_alias=True,
)
async def send_message_to_chat(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    chat_id: int = Query(None, description="Идентификатор чата.", alias="chatId"),
    send_message_to_chat_request: SendMessageToChatRequest = Body(None, description="description"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| """
    if not BaseChatsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseChatsApi.subclasses[0]().send_message_to_chat(businessId, chat_id, send_message_to_chat_request)
