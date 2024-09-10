from typing import List, Dict
from aiohttp import web

from ympa_python_aiohttp_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_aiohttp_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_aiohttp_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_aiohttp_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_aiohttp_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_aiohttp_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_aiohttp_server.models.create_chat_request import CreateChatRequest
from ympa_python_aiohttp_server.models.create_chat_response import CreateChatResponse
from ympa_python_aiohttp_server.models.empty_api_response import EmptyApiResponse
from ympa_python_aiohttp_server.models.get_chat_history_request import GetChatHistoryRequest
from ympa_python_aiohttp_server.models.get_chat_history_response import GetChatHistoryResponse
from ympa_python_aiohttp_server.models.get_chats_request import GetChatsRequest
from ympa_python_aiohttp_server.models.get_chats_response import GetChatsResponse
from ympa_python_aiohttp_server.models.send_message_to_chat_request import SendMessageToChatRequest
from ympa_python_aiohttp_server import util


async def create_chat(request: web.Request, business_id, body) -> web.Response:
    """Создание нового чата с покупателем

    Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param body: description
    :type body: dict | bytes

    """
    body = CreateChatRequest.from_dict(body)
    return web.Response(status=200)


async def get_chat_history(request: web.Request, business_id, chat_id, body, page_token=None, limit=None) -> web.Response:
    """Получение истории сообщений в чате

    Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param chat_id: Идентификатор чата.
    :type chat_id: int
    :param body: description
    :type body: dict | bytes
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int

    """
    body = GetChatHistoryRequest.from_dict(body)
    return web.Response(status=200)


async def get_chats(request: web.Request, business_id, body, page_token=None, limit=None) -> web.Response:
    """Получение доступных чатов

    Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param body: description
    :type body: dict | bytes
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int

    """
    body = GetChatsRequest.from_dict(body)
    return web.Response(status=200)


async def send_file_to_chat(request: web.Request, business_id, chat_id, file) -> web.Response:
    """Отправка файла в чат

    Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param chat_id: Идентификатор чата.
    :type chat_id: int
    :param file: Содержимое файла. Максимальный размер файла — 5 Мбайт.
    :type file: str

    """
    return web.Response(status=200)


async def send_message_to_chat(request: web.Request, business_id, chat_id, body) -> web.Response:
    """Отправка сообщения в чат

    Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param chat_id: Идентификатор чата.
    :type chat_id: int
    :param body: description
    :type body: dict | bytes

    """
    body = SendMessageToChatRequest.from_dict(body)
    return web.Response(status=200)
