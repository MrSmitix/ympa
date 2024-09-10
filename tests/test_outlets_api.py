# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.change_outlet_request import ChangeOutletRequest  # noqa: F401
from ympa_python_fastapi_server.models.create_outlet_response import CreateOutletResponse  # noqa: F401
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_outlet_response import GetOutletResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_outlets_response import GetOutletsResponse  # noqa: F401


def test_create_outlet(client: TestClient):
    """Test case for create_outlet

    Создание точки продаж
    """
    change_outlet_request = {"storage_period":0,"address":{"number":"number","km":6,"region_id":0,"city":"city","street":"street","additional":"additional","estate":"estate","block":"block","building":"building"},"visibility":"HIDDEN","is_main":1,"shop_outlet_code":"shopOutletCode","name":"name","phones":["phones","phones"],"type":"DEPOT","coords":"coords","working_schedule":{"schedule_items":[{"start_day":"MONDAY","start_time":"startTime","end_time":"endTime"},{"start_day":"MONDAY","start_time":"startTime","end_time":"endTime"}],"work_in_holiday":1},"delivery_rules":[{"price_free_pickup":7.061401241503109,"delivery_service_id":5,"max_delivery_days":5,"min_delivery_days":1,"order_before":5,"unspecified_delivery_interval":1},{"price_free_pickup":7.061401241503109,"delivery_service_id":5,"max_delivery_days":5,"min_delivery_days":1,"order_before":5,"unspecified_delivery_interval":1}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/outlets".format(campaignId=56),
    #    headers=headers,
    #    json=change_outlet_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_outlet(client: TestClient):
    """Test case for delete_outlet

    Удаление точки продаж
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/campaigns/{campaignId}/outlets/{outletId}".format(campaignId=56, outletId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_outlet(client: TestClient):
    """Test case for get_outlet

    Информация об одной точке продаж
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/outlets/{outletId}".format(campaignId=56, outletId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_outlets(client: TestClient):
    """Test case for get_outlets

    Информация о нескольких точках продаж
    """
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("region_id", 56),     ("shop_outlet_code", 'shop_outlet_code_example'),     ("region_id2", 56)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/outlets".format(campaignId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_outlet(client: TestClient):
    """Test case for update_outlet

    Изменение информации о точке продаж
    """
    change_outlet_request = {"storage_period":0,"address":{"number":"number","km":6,"region_id":0,"city":"city","street":"street","additional":"additional","estate":"estate","block":"block","building":"building"},"visibility":"HIDDEN","is_main":1,"shop_outlet_code":"shopOutletCode","name":"name","phones":["phones","phones"],"type":"DEPOT","coords":"coords","working_schedule":{"schedule_items":[{"start_day":"MONDAY","start_time":"startTime","end_time":"endTime"},{"start_day":"MONDAY","start_time":"startTime","end_time":"endTime"}],"work_in_holiday":1},"delivery_rules":[{"price_free_pickup":7.061401241503109,"delivery_service_id":5,"max_delivery_days":5,"min_delivery_days":1,"order_before":5,"unspecified_delivery_interval":1},{"price_free_pickup":7.061401241503109,"delivery_service_id":5,"max_delivery_days":5,"min_delivery_days":1,"order_before":5,"unspecified_delivery_interval":1}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/outlets/{outletId}".format(campaignId=56, outletId=56),
    #    headers=headers,
    #    json=change_outlet_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

