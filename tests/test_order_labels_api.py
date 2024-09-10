# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_order_labels_data_response import GetOrderLabelsDataResponse  # noqa: F401
from ympa_python_fastapi_server.models.page_format_type import PageFormatType  # noqa: F401


def test_generate_order_label(client: TestClient):
    """Test case for generate_order_label

    Готовый ярлык‑наклейка для коробки в заказе
    """
    params = [("format", ympa_python_fastapi_server.PageFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label".format(campaignId=56, orderId=56, shipmentId=56, boxId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_order_labels(client: TestClient):
    """Test case for generate_order_labels

    Готовые ярлыки‑наклейки на все коробки в одном заказе
    """
    params = [("format", ympa_python_fastapi_server.PageFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/orders/{orderId}/delivery/labels".format(campaignId=56, orderId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_order_labels_data(client: TestClient):
    """Test case for get_order_labels_data

    Данные для самостоятельного изготовления ярлыков
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data".format(campaignId=56, orderId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

