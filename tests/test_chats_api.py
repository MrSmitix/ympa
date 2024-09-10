# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.create_chat_request import CreateChatRequest  # noqa: F401
from ympa_python_fastapi_server.models.create_chat_response import CreateChatResponse  # noqa: F401
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_chat_history_request import GetChatHistoryRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_chat_history_response import GetChatHistoryResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_chats_request import GetChatsRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_chats_response import GetChatsResponse  # noqa: F401
from ympa_python_fastapi_server.models.send_message_to_chat_request import SendMessageToChatRequest  # noqa: F401


def test_create_chat(client: TestClient):
    """Test case for create_chat

    Создание нового чата с покупателем
    """
    create_chat_request = {"order_id":0}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/chats/new".format(businessId=56),
    #    headers=headers,
    #    json=create_chat_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_chat_history(client: TestClient):
    """Test case for get_chat_history

    Получение истории сообщений в чате
    """
    get_chat_history_request = {"message_id_from":0}
    params = [("chat_id", 56),     ("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/chats/history".format(businessId=56),
    #    headers=headers,
    #    json=get_chat_history_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_chats(client: TestClient):
    """Test case for get_chats

    Получение доступных чатов
    """
    get_chats_request = {"types":["CHAT","CHAT"],"statuses":["NEW","NEW"],"order_ids":[0,0]}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/chats".format(businessId=56),
    #    headers=headers,
    #    json=get_chats_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_send_file_to_chat(client: TestClient):
    """Test case for send_file_to_chat

    Отправка файла в чат
    """
    params = [("chat_id", 56)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    data = {
        "file": '/path/to/file'
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/chats/file/send".format(businessId=56),
    #    headers=headers,
    #    data=data,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_send_message_to_chat(client: TestClient):
    """Test case for send_message_to_chat

    Отправка сообщения в чат
    """
    send_message_to_chat_request = {"message":"message"}
    params = [("chat_id", 56)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/chats/message".format(businessId=56),
    #    headers=headers,
    #    json=send_message_to_chat_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

