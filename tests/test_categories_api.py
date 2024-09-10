# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_categories_max_sale_quantum_request import GetCategoriesMaxSaleQuantumRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_categories_max_sale_quantum_response import GetCategoriesMaxSaleQuantumResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_categories_request import GetCategoriesRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_categories_response import GetCategoriesResponse  # noqa: F401


def test_get_categories_max_sale_quantum(client: TestClient):
    """Test case for get_categories_max_sale_quantum

    Лимит на установку кванта продажи и минимального количества товаров в заказе
    """
    get_categories_max_sale_quantum_request = {"market_category_ids":[0,0,0,0,0]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/categories/max-sale-quantum",
    #    headers=headers,
    #    json=get_categories_max_sale_quantum_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_categories_tree(client: TestClient):
    """Test case for get_categories_tree

    Дерево категорий
    """
    get_categories_request = {"language":"RU"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/categories/tree",
    #    headers=headers,
    #    json=get_categories_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

