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
from app.ympa_python_blueplanet_server.models.get_fulfillment_warehouses_response import GetFulfillmentWarehousesResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_warehouses_response import GetWarehousesResponse  # noqa: E501
from ympa_python_blueplanet_server.test import BaseTestCase


class TestWarehousesController(BaseTestCase):
    """WarehousesController integration test stubs"""

    def test_get_fulfillment_warehouses(self):
        """Test case for get_fulfillment_warehouses

        Идентификаторы складов Маркета (FBY)
        """
        response = self.client.open(
            '/warehouses',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_warehouses(self):
        """Test case for get_warehouses

        Список складов и групп складов
        """
        response = self.client.open(
            '/businesses/{business_id}/warehouses'.format(business_id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
