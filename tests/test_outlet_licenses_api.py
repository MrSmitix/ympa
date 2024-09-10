# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_outlet_licenses_response import GetOutletLicensesResponse  # noqa: F401
from ympa_python_fastapi_server.models.update_outlet_license_request import UpdateOutletLicenseRequest  # noqa: F401


def test_delete_outlet_licenses(client: TestClient):
    """Test case for delete_outlet_licenses

    Удаление лицензий для точек продаж
    """
    params = [("ids", [56])]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/campaigns/{campaignId}/outlets/licenses".format(campaignId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_outlet_licenses(client: TestClient):
    """Test case for get_outlet_licenses

    Информация о лицензиях для точек продаж
    """
    params = [("outlet_ids", [56]),     ("ids", [56])]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/outlets/licenses".format(campaignId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_outlet_licenses(client: TestClient):
    """Test case for update_outlet_licenses

    Создание и изменение лицензий для точек продаж
    """
    update_outlet_license_request = {"licenses":[{"license_type":"ALCOHOL","number":"number","date_of_expiry":"2000-01-23T04:56:07.000+00:00","outlet_id":6,"id":0,"date_of_issue":"2000-01-23T04:56:07.000+00:00"},{"license_type":"ALCOHOL","number":"number","date_of_expiry":"2000-01-23T04:56:07.000+00:00","outlet_id":6,"id":0,"date_of_issue":"2000-01-23T04:56:07.000+00:00"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/outlets/licenses".format(campaignId=56),
    #    headers=headers,
    #    json=update_outlet_license_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

