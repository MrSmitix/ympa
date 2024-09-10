# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_locked_error_response import ApiLockedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.confirm_prices_request import ConfirmPricesRequest  # noqa: F401
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_quarantine_offers_request import GetQuarantineOffersRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_quarantine_offers_response import GetQuarantineOffersResponse  # noqa: F401


def test_confirm_business_prices(client: TestClient):
    """Test case for confirm_business_prices

    Удаление товара из карантина по цене в кабинете
    """
    confirm_prices_request = {"offer_ids":[null,null,null,null,null]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/price-quarantine/confirm".format(businessId=56),
    #    headers=headers,
    #    json=confirm_prices_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_confirm_campaign_prices(client: TestClient):
    """Test case for confirm_campaign_prices

    Удаление товара из карантина по цене в магазине
    """
    confirm_prices_request = {"offer_ids":[null,null,null,null,null]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/price-quarantine/confirm".format(campaignId=56),
    #    headers=headers,
    #    json=confirm_prices_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_business_quarantine_offers(client: TestClient):
    """Test case for get_business_quarantine_offers

    Список товаров, находящихся в карантине по цене в кабинете
    """
    get_quarantine_offers_request = {"category_ids":[0,0],"vendor_names":["vendorNames","vendorNames"],"offer_ids":[null,null,null,null,null],"card_statuses":["HAS_CARD_CAN_NOT_UPDATE","HAS_CARD_CAN_NOT_UPDATE"],"tags":["tags","tags"]}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/price-quarantine".format(businessId=56),
    #    headers=headers,
    #    json=get_quarantine_offers_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_campaign_quarantine_offers(client: TestClient):
    """Test case for get_campaign_quarantine_offers

    Список товаров, находящихся в карантине по цене в магазине
    """
    get_quarantine_offers_request = {"category_ids":[0,0],"vendor_names":["vendorNames","vendorNames"],"offer_ids":[null,null,null,null,null],"card_statuses":["HAS_CARD_CAN_NOT_UPDATE","HAS_CARD_CAN_NOT_UPDATE"],"tags":["tags","tags"]}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/price-quarantine".format(campaignId=56),
    #    headers=headers,
    #    json=get_quarantine_offers_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

