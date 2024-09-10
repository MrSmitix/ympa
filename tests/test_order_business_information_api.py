# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_business_buyer_info_response import GetBusinessBuyerInfoResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_business_documents_info_response import GetBusinessDocumentsInfoResponse  # noqa: F401


def test_get_order_business_buyer_info(client: TestClient):
    """Test case for get_order_business_buyer_info

    Информация о покупателе — юридическом лице
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/orders/{orderId}/business-buyer".format(campaignId=56, orderId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_order_business_documents_info(client: TestClient):
    """Test case for get_order_business_documents_info

    Информация о документах
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/orders/{orderId}/documents".format(campaignId=56, orderId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

