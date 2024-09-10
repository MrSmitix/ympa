# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_quality_rating_details_response import GetQualityRatingDetailsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_quality_rating_request import GetQualityRatingRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_quality_rating_response import GetQualityRatingResponse  # noqa: F401


def test_get_quality_rating_details(client: TestClient):
    """Test case for get_quality_rating_details

    Заказы, которые повлияли на индекс качества
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/ratings/quality/details".format(campaignId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_quality_ratings(client: TestClient):
    """Test case for get_quality_ratings

    Индекс качества магазинов
    """
    get_quality_rating_request = {"date_to":"2000-01-23","campaign_ids":[0,0,0,0,0],"date_from":"2000-01-23"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/ratings/quality".format(businessId=56),
    #    headers=headers,
    #    json=get_quality_rating_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

