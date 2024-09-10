# coding: utf-8

import pytest
import json
from aiohttp import web
from aiohttp import FormData

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


pytestmark = pytest.mark.asyncio

async def test_create_chat(client):
    """Test case for create_chat

    Создание нового чата с покупателем
    """
    body = {"orderId":0}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/chats/new'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_chat_history(client):
    """Test case for get_chat_history

    Получение истории сообщений в чате
    """
    body = {"messageIdFrom":0}
    params = [('chatId', 56),
                    ('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/chats/history'.format(business_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_chats(client):
    """Test case for get_chats

    Получение доступных чатов
    """
    body = {"types":["CHAT","CHAT"],"statuses":["NEW","NEW"],"orderIds":[0,0]}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/chats'.format(business_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

@pytest.mark.skip("multipart/form-data not supported by Connexion")
async def test_send_file_to_chat(client):
    """Test case for send_file_to_chat

    Отправка файла в чат
    """
    params = [('chatId', 56)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'multipart/form-data',
        'Authorization': 'Bearer special-key',
    }
    data = FormData()
    data.add_field('file', '/path/to/file')
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/chats/file/send'.format(business_id=56),
        headers=headers,
        data=data,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_send_message_to_chat(client):
    """Test case for send_message_to_chat

    Отправка сообщения в чат
    """
    body = {"message":"message"}
    params = [('chatId', 56)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/chats/message'.format(business_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

