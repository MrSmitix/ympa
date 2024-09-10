import unittest

from flask import json

from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.get_categories_max_sale_quantum_request import GetCategoriesMaxSaleQuantumRequest  # noqa: E501
from ympa_python_flask_server.models.get_categories_max_sale_quantum_response import GetCategoriesMaxSaleQuantumResponse  # noqa: E501
from ympa_python_flask_server.models.get_categories_request import GetCategoriesRequest  # noqa: E501
from ympa_python_flask_server.models.get_categories_response import GetCategoriesResponse  # noqa: E501
from ympa_python_flask_server.test import BaseTestCase


class TestCategoriesController(BaseTestCase):
    """CategoriesController integration test stubs"""

    def test_get_categories_max_sale_quantum(self):
        """Test case for get_categories_max_sale_quantum

        Лимит на установку кванта продажи и минимального количества товаров в заказе
        """
        get_categories_max_sale_quantum_request = {"marketCategoryIds":[0,0,0,0,0]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/categories/max-sale-quantum',
            method='POST',
            headers=headers,
            data=json.dumps(get_categories_max_sale_quantum_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_categories_tree(self):
        """Test case for get_categories_tree

        Дерево категорий
        """
        get_categories_request = {"language":"RU"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/categories/tree',
            method='POST',
            headers=headers,
            data=json.dumps(get_categories_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
