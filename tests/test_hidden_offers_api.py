# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.add_hidden_offers_request import AddHiddenOffersRequest  # noqa: F401
from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_locked_error_response import ApiLockedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.delete_hidden_offers_request import DeleteHiddenOffersRequest  # noqa: F401
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_hidden_offers_response import GetHiddenOffersResponse  # noqa: F401


def test_add_hidden_offers(client: TestClient):
    """Test case for add_hidden_offers

    Скрытие товаров и настройки скрытия
    """
    add_hidden_offers_request = {"hidden_offers":[{"offer_id":"offerId"},{"offer_id":"offerId"},{"offer_id":"offerId"},{"offer_id":"offerId"},{"offer_id":"offerId"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/hidden-offers".format(campaignId=56),
    #    headers=headers,
    #    json=add_hidden_offers_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_hidden_offers(client: TestClient):
    """Test case for delete_hidden_offers

    Возобновление показа товаров
    """
    delete_hidden_offers_request = {"hidden_offers":[{"offer_id":"offerId"},{"offer_id":"offerId"},{"offer_id":"offerId"},{"offer_id":"offerId"},{"offer_id":"offerId"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/hidden-offers/delete".format(campaignId=56),
    #    headers=headers,
    #    json=delete_hidden_offers_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_hidden_offers(client: TestClient):
    """Test case for get_hidden_offers

    Информация о скрытых вами товарах
    """
    params = [("offer_id", ['offer_id_example']),     ("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20),     ("offset", 56),     ("page", 1),     ("page_size", 56)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/hidden-offers".format(campaignId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

