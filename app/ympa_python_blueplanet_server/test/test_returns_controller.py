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
from app.ympa_python_blueplanet_server.models.empty_api_response import EmptyApiResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_return_response import GetReturnResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_returns_response import GetReturnsResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.refund_status_type import RefundStatusType  # noqa: E501
from app.ympa_python_blueplanet_server.models.return_type import ReturnType  # noqa: E501
from app.ympa_python_blueplanet_server.models.set_return_decision_request import SetReturnDecisionRequest  # noqa: E501
from ympa_python_blueplanet_server.test import BaseTestCase


class TestReturnsController(BaseTestCase):
    """ReturnsController integration test stubs"""

    def test_get_return(self):
        """Test case for get_return

        Информация о невыкупе или возврате
        """
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}'.format(campaign_id=56, order_id=56, return_id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_return_application(self):
        """Test case for get_return_application

        Получение заявления на возврат
        """
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}/application'.format(campaign_id=56, order_id=56, return_id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_return_photo(self):
        """Test case for get_return_photo

        Получение фотографии возврата
        """
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}/decision/{item_id}/image/{image_hash}'.format(campaign_id=56, order_id=56, return_id=56, item_id=56, image_hash='image_hash_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_returns(self):
        """Test case for get_returns

        Список невыкупов и возвратов
        """
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20),
                        ('order_ids', [56]),
                        ('statuses', [ympa_python_blueplanet_server.RefundStatusType()]),
                        ('type', ympa_python_blueplanet_server.ReturnType()),
                        ('from_date', '2022-10-31'),
                        ('to_date', '2022-11-30'),
                        ('from_date2', '2022-10-31'),
                        ('to_date2', '2022-11-30')]
        response = self.client.open(
            '/campaigns/{campaign_id}/returns'.format(campaign_id=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_return_decision(self):
        """Test case for set_return_decision

        Принятие или изменение решения по возврату
        """
        body = {"returnItemId":1,"decisionType":"REFUND_MONEY_INCLUDING_SHIPMENT","comment":"Вернуть 149 рублей за пересылку"}
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}/decision'.format(campaign_id=56, order_id=56, return_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_submit_return_decision(self):
        """Test case for submit_return_decision

        Подтверждение решения по возврату
        """
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}/decision/submit'.format(campaign_id=56, order_id=56, return_id=56),
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
