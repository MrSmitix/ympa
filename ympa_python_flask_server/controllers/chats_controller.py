import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.create_chat_request import CreateChatRequest  # noqa: E501
from ympa_python_flask_server.models.create_chat_response import CreateChatResponse  # noqa: E501
from ympa_python_flask_server.models.empty_api_response import EmptyApiResponse  # noqa: E501
from ympa_python_flask_server.models.get_chat_history_request import GetChatHistoryRequest  # noqa: E501
from ympa_python_flask_server.models.get_chat_history_response import GetChatHistoryResponse  # noqa: E501
from ympa_python_flask_server.models.get_chats_request import GetChatsRequest  # noqa: E501
from ympa_python_flask_server.models.get_chats_response import GetChatsResponse  # noqa: E501
from ympa_python_flask_server.models.send_message_to_chat_request import SendMessageToChatRequest  # noqa: E501
from ympa_python_flask_server import util


def create_chat(business_id, create_chat_request):  # noqa: E501
    """Создание нового чата с покупателем

    Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param create_chat_request: description
    :type create_chat_request: dict | bytes

    :rtype: Union[CreateChatResponse, Tuple[CreateChatResponse, int], Tuple[CreateChatResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_chat_request = CreateChatRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_chat_history(business_id, chat_id, get_chat_history_request, page_token=None, limit=None):  # noqa: E501
    """Получение истории сообщений в чате

    Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param chat_id: Идентификатор чата.
    :type chat_id: int
    :param get_chat_history_request: description
    :type get_chat_history_request: dict | bytes
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int

    :rtype: Union[GetChatHistoryResponse, Tuple[GetChatHistoryResponse, int], Tuple[GetChatHistoryResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_chat_history_request = GetChatHistoryRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_chats(business_id, get_chats_request, page_token=None, limit=None):  # noqa: E501
    """Получение доступных чатов

    Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param get_chats_request: description
    :type get_chats_request: dict | bytes
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int

    :rtype: Union[GetChatsResponse, Tuple[GetChatsResponse, int], Tuple[GetChatsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_chats_request = GetChatsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def send_file_to_chat(business_id, chat_id, file):  # noqa: E501
    """Отправка файла в чат

    Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param chat_id: Идентификатор чата.
    :type chat_id: int
    :param file: Содержимое файла. Максимальный размер файла — 5 Мбайт.
    :type file: str

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def send_message_to_chat(business_id, chat_id, send_message_to_chat_request):  # noqa: E501
    """Отправка сообщения в чат

    Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param chat_id: Идентификатор чата.
    :type chat_id: int
    :param send_message_to_chat_request: description
    :type send_message_to_chat_request: dict | bytes

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        send_message_to_chat_request = SendMessageToChatRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
