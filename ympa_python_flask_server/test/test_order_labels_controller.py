import unittest

from flask import json

from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.get_order_labels_data_response import GetOrderLabelsDataResponse  # noqa: E501
from ympa_python_flask_server.models.page_format_type import PageFormatType  # noqa: E501
from ympa_python_flask_server.test import BaseTestCase


class TestOrderLabelsController(BaseTestCase):
    """OrderLabelsController integration test stubs"""

    def test_generate_order_label(self):
        """Test case for generate_order_label

        Готовый ярлык‑наклейка для коробки в заказе
        """
        query_string = [('format', ympa_python_flask_server.PageFormatType())]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/delivery/shipments/{shipment_id}/boxes/{box_id}/label'.format(campaign_id=56, order_id=56, shipment_id=56, box_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_order_labels(self):
        """Test case for generate_order_labels

        Готовые ярлыки‑наклейки на все коробки в одном заказе
        """
        query_string = [('format', ympa_python_flask_server.PageFormatType())]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/delivery/labels'.format(campaign_id=56, order_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_order_labels_data(self):
        """Test case for get_order_labels_data

        Данные для самостоятельного изготовления ярлыков
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/delivery/labels/data'.format(campaign_id=56, order_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
