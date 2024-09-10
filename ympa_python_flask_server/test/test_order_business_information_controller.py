import unittest

from flask import json

from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.get_business_buyer_info_response import GetBusinessBuyerInfoResponse  # noqa: E501
from ympa_python_flask_server.models.get_business_documents_info_response import GetBusinessDocumentsInfoResponse  # noqa: E501
from ympa_python_flask_server.test import BaseTestCase


class TestOrderBusinessInformationController(BaseTestCase):
    """OrderBusinessInformationController integration test stubs"""

    def test_get_order_business_buyer_info(self):
        """Test case for get_order_business_buyer_info

        Информация о покупателе — юридическом лице
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/business-buyer'.format(campaign_id=56, order_id=56),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_order_business_documents_info(self):
        """Test case for get_order_business_documents_info

        Информация о документах
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/documents'.format(campaign_id=56, order_id=56),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
