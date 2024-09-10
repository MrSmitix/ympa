# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_warehouse_stocks_request import GetWarehouseStocksRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_warehouse_stocks_response import GetWarehouseStocksResponse  # noqa: F401
from ympa_python_fastapi_server.models.update_stocks_request import UpdateStocksRequest  # noqa: F401


def test_get_stocks(client: TestClient):
    """Test case for get_stocks

    Информация об остатках и оборачиваемости
    """
    get_warehouse_stocks_request = {"archived":1,"with_turnover":0,"offer_ids":[null,null,null,null,null]}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/offers/stocks".format(campaignId=56),
    #    headers=headers,
    #    json=get_warehouse_stocks_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_stocks(client: TestClient):
    """Test case for update_stocks

    Передача информации об остатках
    """
    update_stocks_request = {"skus":[{"sku":"sku","items":[{"count":160165638,"updated_at":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updated_at":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updated_at":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updated_at":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updated_at":"2000-01-23T04:56:07.000+00:00"}]}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/offers/stocks".format(campaignId=56),
    #    headers=headers,
    #    json=update_stocks_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

