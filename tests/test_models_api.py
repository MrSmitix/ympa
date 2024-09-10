# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.currency_type import CurrencyType  # noqa: F401
from ympa_python_fastapi_server.models.get_models_offers_response import GetModelsOffersResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_models_request import GetModelsRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_models_response import GetModelsResponse  # noqa: F401
from ympa_python_fastapi_server.models.search_models_response import SearchModelsResponse  # noqa: F401
from ympa_python_fastapi_server.models.sort_order_type import SortOrderType  # noqa: F401


def test_get_model(client: TestClient):
    """Test case for get_model

    Информация об одной модели
    """
    params = [("region_id", 56),     ("currency", ympa_python_fastapi_server.CurrencyType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/models/{modelId}".format(modelId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_model_offers(client: TestClient):
    """Test case for get_model_offers

    Список предложений для одной модели
    """
    params = [("region_id", 56),     ("currency", ympa_python_fastapi_server.CurrencyType()),     ("order_by_price", ympa_python_fastapi_server.SortOrderType()),     ("count", 10),     ("page", 1)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/models/{modelId}/offers".format(modelId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_models(client: TestClient):
    """Test case for get_models

    Информация о нескольких моделях
    """
    get_models_request = {"models":[0,0]}
    params = [("region_id", 56),     ("currency", ympa_python_fastapi_server.CurrencyType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/models",
    #    headers=headers,
    #    json=get_models_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_models_offers(client: TestClient):
    """Test case for get_models_offers

    Список предложений для нескольких моделей
    """
    get_models_request = {"models":[0,0]}
    params = [("region_id", 56),     ("currency", ympa_python_fastapi_server.CurrencyType()),     ("order_by_price", ympa_python_fastapi_server.SortOrderType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/models/offers",
    #    headers=headers,
    #    json=get_models_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_search_models(client: TestClient):
    """Test case for search_models

    Поиск модели товара
    """
    params = [("query", 'query_example'),     ("region_id", 56),     ("currency", ympa_python_fastapi_server.CurrencyType()),     ("page", 1),     ("page_size", 56)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/models",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

