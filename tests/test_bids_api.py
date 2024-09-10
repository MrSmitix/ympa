# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_bids_info_request import GetBidsInfoRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_bids_info_response import GetBidsInfoResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_bids_recommendations_request import GetBidsRecommendationsRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_bids_recommendations_response import GetBidsRecommendationsResponse  # noqa: F401
from ympa_python_fastapi_server.models.put_sku_bids_request import PutSkuBidsRequest  # noqa: F401


def test_get_bids_info_for_business(client: TestClient):
    """Test case for get_bids_info_for_business

    Информация об установленных ставках
    """
    get_bids_info_request = {"skus":[null,null,null,null,null]}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/bids/info".format(businessId=56),
    #    headers=headers,
    #    json=get_bids_info_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_bids_recommendations(client: TestClient):
    """Test case for get_bids_recommendations

    Рекомендованные ставки для заданных товаров
    """
    get_bids_recommendations_request = {"skus":[null,null,null,null,null]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/bids/recommendations".format(businessId=56),
    #    headers=headers,
    #    json=get_bids_recommendations_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_put_bids_for_business(client: TestClient):
    """Test case for put_bids_for_business

    Включение буста продаж и установка ставок
    """
    put_sku_bids_request = {"bids":[{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/businesses/{businessId}/bids".format(businessId=56),
    #    headers=headers,
    #    json=put_sku_bids_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_put_bids_for_campaign(client: TestClient):
    """Test case for put_bids_for_campaign

    Включение буста продаж и установка ставок для магазина
    """
    put_sku_bids_request = {"bids":[{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/bids".format(campaignId=56),
    #    headers=headers,
    #    json=put_sku_bids_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

