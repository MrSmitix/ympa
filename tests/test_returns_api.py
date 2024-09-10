# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_return_response import GetReturnResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_returns_response import GetReturnsResponse  # noqa: F401
from ympa_python_fastapi_server.models.refund_status_type import RefundStatusType  # noqa: F401
from ympa_python_fastapi_server.models.return_type import ReturnType  # noqa: F401
from ympa_python_fastapi_server.models.set_return_decision_request import SetReturnDecisionRequest  # noqa: F401


def test_get_return(client: TestClient):
    """Test case for get_return

    Информация о невыкупе или возврате
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}".format(campaignId=56, orderId=56, returnId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_return_application(client: TestClient):
    """Test case for get_return_application

    Получение заявления на возврат
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application".format(campaignId=56, orderId=56, returnId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_return_photo(client: TestClient):
    """Test case for get_return_photo

    Получение фотографии возврата
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}".format(campaignId=56, orderId=56, returnId=56, itemId=56, imageHash='image_hash_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_returns(client: TestClient):
    """Test case for get_returns

    Список невыкупов и возвратов
    """
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20),     ("order_ids", [56]),     ("statuses", [ympa_python_fastapi_server.RefundStatusType()]),     ("type", ympa_python_fastapi_server.ReturnType()),     ("from_date", '2022-10-31'),     ("to_date", '2022-11-30'),     ("from_date2", '2022-10-31'),     ("to_date2", '2022-11-30')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/returns".format(campaignId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_set_return_decision(client: TestClient):
    """Test case for set_return_decision

    Принятие или изменение решения по возврату
    """
    set_return_decision_request = {"return_item_id":1,"decision_type":"REFUND_MONEY_INCLUDING_SHIPMENT","comment":"Вернуть 149 рублей за пересылку"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision".format(campaignId=56, orderId=56, returnId=56),
    #    headers=headers,
    #    json=set_return_decision_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_submit_return_decision(client: TestClient):
    """Test case for submit_return_decision

    Подтверждение решения по возврату
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit".format(campaignId=56, orderId=56, returnId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

