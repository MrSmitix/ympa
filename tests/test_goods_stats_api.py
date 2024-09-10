# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_goods_stats_request import GetGoodsStatsRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_goods_stats_response import GetGoodsStatsResponse  # noqa: F401


def test_get_goods_stats(client: TestClient):
    """Test case for get_goods_stats

    Отчет по товарам
    """
    get_goods_stats_request = {"shop_skus":[null,null,null,null,null]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/stats/skus".format(campaignId=56),
    #    headers=headers,
    #    json=get_goods_stats_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

