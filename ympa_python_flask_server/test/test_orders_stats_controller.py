import unittest

from flask import json

from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.get_orders_stats_request import GetOrdersStatsRequest  # noqa: E501
from ympa_python_flask_server.models.get_orders_stats_response import GetOrdersStatsResponse  # noqa: E501
from ympa_python_flask_server.test import BaseTestCase


class TestOrdersStatsController(BaseTestCase):
    """OrdersStatsController integration test stubs"""

    def test_get_orders_stats(self):
        """Test case for get_orders_stats

        Детальная информация по заказам
        """
        get_orders_stats_request = {"updateTo":"2000-01-23","updateFrom":"2000-01-23","hasCis":True,"dateTo":"2000-01-23","statuses":["CANCELLED_BEFORE_PROCESSING","CANCELLED_BEFORE_PROCESSING"],"orders":[0,0],"dateFrom":"2000-01-23"}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/stats/orders'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_orders_stats_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
