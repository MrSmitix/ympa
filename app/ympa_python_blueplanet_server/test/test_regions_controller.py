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
from app.ympa_python_blueplanet_server.models.get_region_with_children_response import GetRegionWithChildrenResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_regions_response import GetRegionsResponse  # noqa: E501
from ympa_python_blueplanet_server.test import BaseTestCase


class TestRegionsController(BaseTestCase):
    """RegionsController integration test stubs"""

    def test_search_region_children(self):
        """Test case for search_region_children

        Информация о дочерних регионах
        """
        query_string = [('page', 1),
                        ('page_size', 56)]
        response = self.client.open(
            '/regions/{region_id}/children'.format(region_id=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_regions_by_id(self):
        """Test case for search_regions_by_id

        Информация о регионе
        """
        response = self.client.open(
            '/regions/{region_id}'.format(region_id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_regions_by_name(self):
        """Test case for search_regions_by_name

        Поиск регионов по их имени
        """
        query_string = [('name', 'name_example'),
                        ('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        response = self.client.open(
            '/regions',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
