# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.ympa_python_blueplanet_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.create_chat_request import CreateChatRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.create_chat_response import CreateChatResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.empty_api_response import EmptyApiResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_chat_history_request import GetChatHistoryRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_chat_history_response import GetChatHistoryResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_chats_request import GetChatsRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_chats_response import GetChatsResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.send_message_to_chat_request import SendMessageToChatRequest  # noqa: E501
from ympa_python_blueplanet_server.test import BaseTestCase


class TestChatsController(BaseTestCase):
    """ChatsController integration test stubs"""

    def test_create_chat(self):
        """Test case for create_chat

        Создание нового чата с покупателем
        """
        body = {"orderId":0}
        response = self.client.open(
            '/businesses/{business_id}/chats/new'.format(business_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_chat_history(self):
        """Test case for get_chat_history

        Получение истории сообщений в чате
        """
        body = {"messageIdFrom":0}
        query_string = [('chat_id', 56),
                        ('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        response = self.client.open(
            '/businesses/{business_id}/chats/history'.format(business_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_chats(self):
        """Test case for get_chats

        Получение доступных чатов
        """
        body = {"types":["CHAT","CHAT"],"statuses":["NEW","NEW"],"orderIds":[0,0]}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        response = self.client.open(
            '/businesses/{business_id}/chats'.format(business_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_send_file_to_chat(self):
        """Test case for send_file_to_chat

        Отправка файла в чат
        """
        query_string = [('chat_id', 56)]
        data = dict(file='/path/to/file')
        response = self.client.open(
            '/businesses/{business_id}/chats/file/send'.format(business_id=56),
            method='POST',
            data=data,
            content_type='multipart/form-data',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_send_message_to_chat(self):
        """Test case for send_message_to_chat

        Отправка сообщения в чат
        """
        body = {"message":"message"}
        query_string = [('chat_id', 56)]
        response = self.client.open(
            '/businesses/{business_id}/chats/message'.format(business_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
