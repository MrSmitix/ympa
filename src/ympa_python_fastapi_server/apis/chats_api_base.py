# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

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

class BaseChatsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseChatsApi.subclasses = BaseChatsApi.subclasses + (cls,)
    async def create_chat(
        self,
        businessId: int,
        create_chat_request: CreateChatRequest,
    ) -> CreateChatResponse:
        """Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| """
        ...


    async def get_chat_history(
        self,
        businessId: int,
        chat_id: int,
        get_chat_history_request: GetChatHistoryRequest,
        page_token: str,
        limit: int,
    ) -> GetChatHistoryResponse:
        """Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| """
        ...


    async def get_chats(
        self,
        businessId: int,
        get_chats_request: GetChatsRequest,
        page_token: str,
        limit: int,
    ) -> GetChatsResponse:
        """Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| """
        ...


    async def send_file_to_chat(
        self,
        businessId: int,
        chat_id: int,
        file: str,
    ) -> EmptyApiResponse:
        """Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| """
        ...


    async def send_message_to_chat(
        self,
        businessId: int,
        chat_id: int,
        send_message_to_chat_request: SendMessageToChatRequest,
    ) -> EmptyApiResponse:
        """Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| """
        ...
