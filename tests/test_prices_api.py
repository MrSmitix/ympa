# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_locked_error_response import ApiLockedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_prices_by_offer_ids_request import GetPricesByOfferIdsRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_prices_by_offer_ids_response import GetPricesByOfferIdsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_prices_response import GetPricesResponse  # noqa: F401
from ympa_python_fastapi_server.models.suggest_prices_request import SuggestPricesRequest  # noqa: F401
from ympa_python_fastapi_server.models.suggest_prices_response import SuggestPricesResponse  # noqa: F401
from ympa_python_fastapi_server.models.update_business_prices_request import UpdateBusinessPricesRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_prices_request import UpdatePricesRequest  # noqa: F401


def test_get_prices(client: TestClient):
    """Test case for get_prices

    Список цен
    """
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20),     ("archived", False)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/offer-prices".format(campaignId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_prices_by_offer_ids(client: TestClient):
    """Test case for get_prices_by_offer_ids

    Просмотр цен на указанные товары в магазине
    """
    get_prices_by_offer_ids_request = {"offer_ids":[null,null,null,null,null]}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/offer-prices".format(campaignId=56),
    #    headers=headers,
    #    json=get_prices_by_offer_ids_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_suggested_prices(client: TestClient):
    """Test case for get_suggested_prices

    Цены для продвижения товаров
    """
    suggest_prices_request = {"offers":[{"market_sku":0,"offer_id":"offerId"},{"market_sku":0,"offer_id":"offerId"},{"market_sku":0,"offer_id":"offerId"},{"market_sku":0,"offer_id":"offerId"},{"market_sku":0,"offer_id":"offerId"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/offer-prices/suggestions".format(campaignId=56),
    #    headers=headers,
    #    json=suggest_prices_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_business_prices(client: TestClient):
    """Test case for update_business_prices

    Установка цен на товары во всех магазинах
    """
    update_business_prices_request = {"offers":[{"price":{"discount_base":0.7061401241503109,"currency_id":"RUR","value":0.23021358869347652},"offer_id":"offerId"},{"price":{"discount_base":0.7061401241503109,"currency_id":"RUR","value":0.23021358869347652},"offer_id":"offerId"},{"price":{"discount_base":0.7061401241503109,"currency_id":"RUR","value":0.23021358869347652},"offer_id":"offerId"},{"price":{"discount_base":0.7061401241503109,"currency_id":"RUR","value":0.23021358869347652},"offer_id":"offerId"},{"price":{"discount_base":0.7061401241503109,"currency_id":"RUR","value":0.23021358869347652},"offer_id":"offerId"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/offer-prices/updates".format(businessId=56),
    #    headers=headers,
    #    json=update_business_prices_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_prices(client: TestClient):
    """Test case for update_prices

    Установка цен на товары в конкретном магазине
    """
    update_prices_request = {"offers":[{"price":{"vat":1,"discount_base":6.027456183070403,"currency_id":"RUR","value":0.8008281904610115},"offer_id":"offerId"},{"price":{"vat":1,"discount_base":6.027456183070403,"currency_id":"RUR","value":0.8008281904610115},"offer_id":"offerId"},{"price":{"vat":1,"discount_base":6.027456183070403,"currency_id":"RUR","value":0.8008281904610115},"offer_id":"offerId"},{"price":{"vat":1,"discount_base":6.027456183070403,"currency_id":"RUR","value":0.8008281904610115},"offer_id":"offerId"},{"price":{"vat":1,"discount_base":6.027456183070403,"currency_id":"RUR","value":0.8008281904610115},"offer_id":"offerId"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/offer-prices/updates".format(campaignId=56),
    #    headers=headers,
    #    json=update_prices_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

