# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_order_buyer_info_response import GetOrderBuyerInfoResponse  # noqa: F401
from ympa_python_fastapi_server.models.set_order_delivery_date_request import SetOrderDeliveryDateRequest  # noqa: F401
from ympa_python_fastapi_server.models.set_order_delivery_track_code_request import SetOrderDeliveryTrackCodeRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_order_storage_limit_request import UpdateOrderStorageLimitRequest  # noqa: F401
from ympa_python_fastapi_server.models.verify_order_eac_request import VerifyOrderEacRequest  # noqa: F401
from ympa_python_fastapi_server.models.verify_order_eac_response import VerifyOrderEacResponse  # noqa: F401


def test_get_order_buyer_info(client: TestClient):
    """Test case for get_order_buyer_info

    Информация о покупателе — физическом лице
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/orders/{orderId}/buyer".format(campaignId=56, orderId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_set_order_delivery_date(client: TestClient):
    """Test case for set_order_delivery_date

    Изменение даты доставки заказа
    """
    set_order_delivery_date_request = {"reason":"USER_MOVED_DELIVERY_DATES","dates":{"to_date":"2000-01-23"}}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/orders/{orderId}/delivery/date".format(campaignId=56, orderId=56),
    #    headers=headers,
    #    json=set_order_delivery_date_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_set_order_delivery_track_code(client: TestClient):
    """Test case for set_order_delivery_track_code

    Передача трек‑номера посылки
    """
    set_order_delivery_track_code_request = {"track_code":"trackCode","delivery_service_id":0}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/orders/{orderId}/delivery/track".format(campaignId=56, orderId=56),
    #    headers=headers,
    #    json=set_order_delivery_track_code_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_order_storage_limit(client: TestClient):
    """Test case for update_order_storage_limit

    Продление срока хранения заказа
    """
    update_order_storage_limit_request = {"new_date":"2000-01-23"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit".format(campaignId=56, orderId=56),
    #    headers=headers,
    #    json=update_order_storage_limit_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_verify_order_eac(client: TestClient):
    """Test case for verify_order_eac

    Передача кода подтверждения
    """
    verify_order_eac_request = {"code":"code"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/orders/{orderId}/verifyEac".format(campaignId=56, orderId=56),
    #    headers=headers,
    #    json=verify_order_eac_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

