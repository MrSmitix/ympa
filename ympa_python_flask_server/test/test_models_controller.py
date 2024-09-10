import unittest

from flask import json

from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.currency_type import CurrencyType  # noqa: E501
from ympa_python_flask_server.models.get_models_offers_response import GetModelsOffersResponse  # noqa: E501
from ympa_python_flask_server.models.get_models_request import GetModelsRequest  # noqa: E501
from ympa_python_flask_server.models.get_models_response import GetModelsResponse  # noqa: E501
from ympa_python_flask_server.models.search_models_response import SearchModelsResponse  # noqa: E501
from ympa_python_flask_server.models.sort_order_type import SortOrderType  # noqa: E501
from ympa_python_flask_server.test import BaseTestCase


class TestModelsController(BaseTestCase):
    """ModelsController integration test stubs"""

    def test_get_model(self):
        """Test case for get_model

        Информация об одной модели
        """
        query_string = [('regionId', 56),
                        ('currency', ympa_python_flask_server.CurrencyType())]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/models/{model_id}'.format(model_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_model_offers(self):
        """Test case for get_model_offers

        Список предложений для одной модели
        """
        query_string = [('regionId', 56),
                        ('currency', ympa_python_flask_server.CurrencyType()),
                        ('orderByPrice', ympa_python_flask_server.SortOrderType()),
                        ('count', 10),
                        ('page', 1)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/models/{model_id}/offers'.format(model_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_models(self):
        """Test case for get_models

        Информация о нескольких моделях
        """
        get_models_request = {"models":[0,0]}
        query_string = [('regionId', 56),
                        ('currency', ympa_python_flask_server.CurrencyType())]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/models',
            method='POST',
            headers=headers,
            data=json.dumps(get_models_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_models_offers(self):
        """Test case for get_models_offers

        Список предложений для нескольких моделей
        """
        get_models_request = {"models":[0,0]}
        query_string = [('regionId', 56),
                        ('currency', ympa_python_flask_server.CurrencyType()),
                        ('orderByPrice', ympa_python_flask_server.SortOrderType())]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/models/offers',
            method='POST',
            headers=headers,
            data=json.dumps(get_models_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_models(self):
        """Test case for search_models

        Поиск модели товара
        """
        query_string = [('query', 'query_example'),
                        ('regionId', 56),
                        ('currency', ympa_python_flask_server.CurrencyType()),
                        ('page', 1),
                        ('pageSize', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/models',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
