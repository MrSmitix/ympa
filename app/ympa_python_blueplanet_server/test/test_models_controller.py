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
from app.ympa_python_blueplanet_server.models.currency_type import CurrencyType  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_models_offers_response import GetModelsOffersResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_models_request import GetModelsRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_models_response import GetModelsResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.search_models_response import SearchModelsResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.sort_order_type import SortOrderType  # noqa: E501
from ympa_python_blueplanet_server.test import BaseTestCase


class TestModelsController(BaseTestCase):
    """ModelsController integration test stubs"""

    def test_get_model(self):
        """Test case for get_model

        Информация об одной модели
        """
        query_string = [('region_id', 56),
                        ('currency', ympa_python_blueplanet_server.CurrencyType())]
        response = self.client.open(
            '/models/{model_id}'.format(model_id=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_model_offers(self):
        """Test case for get_model_offers

        Список предложений для одной модели
        """
        query_string = [('region_id', 56),
                        ('currency', ympa_python_blueplanet_server.CurrencyType()),
                        ('order_by_price', ympa_python_blueplanet_server.SortOrderType()),
                        ('count', 10),
                        ('page', 1)]
        response = self.client.open(
            '/models/{model_id}/offers'.format(model_id=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_models(self):
        """Test case for get_models

        Информация о нескольких моделях
        """
        body = {"models":[0,0]}
        query_string = [('region_id', 56),
                        ('currency', ympa_python_blueplanet_server.CurrencyType())]
        response = self.client.open(
            '/models',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_models_offers(self):
        """Test case for get_models_offers

        Список предложений для нескольких моделей
        """
        body = {"models":[0,0]}
        query_string = [('region_id', 56),
                        ('currency', ympa_python_blueplanet_server.CurrencyType()),
                        ('order_by_price', ympa_python_blueplanet_server.SortOrderType())]
        response = self.client.open(
            '/models/offers',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_models(self):
        """Test case for search_models

        Поиск модели товара
        """
        query_string = [('query', 'query_example'),
                        ('region_id', 56),
                        ('currency', ympa_python_blueplanet_server.CurrencyType()),
                        ('page', 1),
                        ('page_size', 56)]
        response = self.client.open(
            '/models',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
