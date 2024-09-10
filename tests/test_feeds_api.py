# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_locked_error_response import ApiLockedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse  # noqa: F401
from ympa_python_fastapi_server.models.feed_index_logs_status_type import FeedIndexLogsStatusType  # noqa: F401
from ympa_python_fastapi_server.models.get_feed_index_logs_response import GetFeedIndexLogsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_feed_response import GetFeedResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_feeds_response import GetFeedsResponse  # noqa: F401
from ympa_python_fastapi_server.models.set_feed_params_request import SetFeedParamsRequest  # noqa: F401


def test_get_feed(client: TestClient):
    """Test case for get_feed

    Информация о прайс-листе
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/feeds/{feedId}".format(campaignId=56, feedId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_feed_index_logs(client: TestClient):
    """Test case for get_feed_index_logs

    Отчет по индексации прайс-листа
    """
    params = [("limit", 20),     ("published_time_from", '2013-10-20T19:20:30+01:00'),     ("published_time_to", '2013-10-20T19:20:30+01:00'),     ("status", ympa_python_fastapi_server.FeedIndexLogsStatusType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/feeds/{feedId}/index-logs".format(campaignId=56, feedId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_feeds(client: TestClient):
    """Test case for get_feeds

    Список прайс-листов магазина
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/feeds".format(campaignId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_refresh_feed(client: TestClient):
    """Test case for refresh_feed

    Сообщить, что прайс-лист обновился
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/feeds/{feedId}/refresh".format(campaignId=56, feedId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_set_feed_params(client: TestClient):
    """Test case for set_feed_params

    Изменение параметров прайс-листа
    """
    set_feed_params_request = {"parameters":[{"deleted":1,"values":[0,0],"name":"name"},{"deleted":1,"values":[0,0],"name":"name"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/feeds/{feedId}/params".format(campaignId=56, feedId=56),
    #    headers=headers,
    #    json=set_feed_params_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

