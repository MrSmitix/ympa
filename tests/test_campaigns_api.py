# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_campaign_logins_response import GetCampaignLoginsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_campaign_region_response import GetCampaignRegionResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_campaign_response import GetCampaignResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_campaign_settings_response import GetCampaignSettingsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_campaigns_response import GetCampaignsResponse  # noqa: F401


def test_get_campaign(client: TestClient):
    """Test case for get_campaign

    Информация о магазине
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}".format(campaignId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_campaign_logins(client: TestClient):
    """Test case for get_campaign_logins

    Логины, связанные с магазином
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/logins".format(campaignId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_campaign_region(client: TestClient):
    """Test case for get_campaign_region

    Регион магазина
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/region".format(campaignId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_campaign_settings(client: TestClient):
    """Test case for get_campaign_settings

    Настройки магазина
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/settings".format(campaignId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_campaigns(client: TestClient):
    """Test case for get_campaigns

    Список магазинов пользователя
    """
    params = [("page", 1),     ("page_size", 56)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_campaigns_by_login(client: TestClient):
    """Test case for get_campaigns_by_login

    Магазины, доступные логину
    """
    params = [("page", 1),     ("page_size", 56)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/by_login/{login}".format(login='login_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

