import unittest

from flask import json

from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.empty_api_response import EmptyApiResponse  # noqa: E501
from ympa_python_flask_server.models.get_return_response import GetReturnResponse  # noqa: E501
from ympa_python_flask_server.models.get_returns_response import GetReturnsResponse  # noqa: E501
from ympa_python_flask_server.models.refund_status_type import RefundStatusType  # noqa: E501
from ympa_python_flask_server.models.return_type import ReturnType  # noqa: E501
from ympa_python_flask_server.models.set_return_decision_request import SetReturnDecisionRequest  # noqa: E501
from ympa_python_flask_server.test import BaseTestCase


class TestReturnsController(BaseTestCase):
    """ReturnsController integration test stubs"""

    def test_get_return(self):
        """Test case for get_return

        Информация о невыкупе или возврате
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}'.format(campaign_id=56, order_id=56, return_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_return_application(self):
        """Test case for get_return_application

        Получение заявления на возврат
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}/application'.format(campaign_id=56, order_id=56, return_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_return_photo(self):
        """Test case for get_return_photo

        Получение фотографии возврата
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}/decision/{item_id}/image/{image_hash}'.format(campaign_id=56, order_id=56, return_id=56, item_id=56, image_hash='image_hash_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_returns(self):
        """Test case for get_returns

        Список невыкупов и возвратов
        """
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20),
                        ('orderIds', [56]),
                        ('statuses', [ympa_python_flask_server.RefundStatusType()]),
                        ('type', ympa_python_flask_server.ReturnType()),
                        ('fromDate', '2022-10-31'),
                        ('toDate', '2022-11-30'),
                        ('from_date2', '2022-10-31'),
                        ('to_date2', '2022-11-30')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/returns'.format(campaign_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_return_decision(self):
        """Test case for set_return_decision

        Принятие или изменение решения по возврату
        """
        set_return_decision_request = {"returnItemId":1,"decisionType":"REFUND_MONEY_INCLUDING_SHIPMENT","comment":"Вернуть 149 рублей за пересылку"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}/decision'.format(campaign_id=56, order_id=56, return_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(set_return_decision_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_submit_return_decision(self):
        """Test case for submit_return_decision

        Подтверждение решения по возврату
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}/decision/submit'.format(campaign_id=56, order_id=56, return_id=56),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
