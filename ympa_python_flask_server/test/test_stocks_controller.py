import unittest

from flask import json

from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.empty_api_response import EmptyApiResponse  # noqa: E501
from ympa_python_flask_server.models.get_warehouse_stocks_request import GetWarehouseStocksRequest  # noqa: E501
from ympa_python_flask_server.models.get_warehouse_stocks_response import GetWarehouseStocksResponse  # noqa: E501
from ympa_python_flask_server.models.update_stocks_request import UpdateStocksRequest  # noqa: E501
from ympa_python_flask_server.test import BaseTestCase


class TestStocksController(BaseTestCase):
    """StocksController integration test stubs"""

    def test_get_stocks(self):
        """Test case for get_stocks

        Информация об остатках и оборачиваемости
        """
        get_warehouse_stocks_request = {"archived":True,"withTurnover":False,"offerIds":[null,null,null,null,null]}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offers/stocks'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_warehouse_stocks_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_stocks(self):
        """Test case for update_stocks

        Передача информации об остатках
        """
        update_stocks_request = {"skus":[{"sku":"sku","items":[{"count":160165638,"updatedAt":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updatedAt":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updatedAt":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updatedAt":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updatedAt":"2000-01-23T04:56:07.000+00:00"}]}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offers/stocks'.format(campaign_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(update_stocks_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
