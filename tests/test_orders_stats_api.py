# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_orders_stats_request import GetOrdersStatsRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_orders_stats_response import GetOrdersStatsResponse  # noqa: F401


def test_get_orders_stats(client: TestClient):
    """Test case for get_orders_stats

    Детальная информация по заказам
    """
    get_orders_stats_request = {"update_to":"2000-01-23","update_from":"2000-01-23","has_cis":1,"date_to":"2000-01-23","statuses":["CANCELLED_BEFORE_PROCESSING","CANCELLED_BEFORE_PROCESSING"],"orders":[0,0],"date_from":"2000-01-23"}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/stats/orders".format(campaignId=56),
    #    headers=headers,
    #    json=get_orders_stats_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

