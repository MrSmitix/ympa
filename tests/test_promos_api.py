# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.delete_promo_offers_request import DeletePromoOffersRequest  # noqa: F401
from ympa_python_fastapi_server.models.delete_promo_offers_response import DeletePromoOffersResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_promo_offers_request import GetPromoOffersRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_promo_offers_response import GetPromoOffersResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_promos_request import GetPromosRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_promos_response import GetPromosResponse  # noqa: F401
from ympa_python_fastapi_server.models.update_promo_offers_request import UpdatePromoOffersRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_promo_offers_response import UpdatePromoOffersResponse  # noqa: F401


def test_delete_promo_offers(client: TestClient):
    """Test case for delete_promo_offers

    Удаление товаров из акции
    """
    delete_promo_offers_request = {"delete_all_offers":1,"promo_id":"promoId","offer_ids":[null,null,null,null,null]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/promos/offers/delete".format(businessId=56),
    #    headers=headers,
    #    json=delete_promo_offers_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_promo_offers(client: TestClient):
    """Test case for get_promo_offers

    Получение списка товаров, которые участвуют или могут участвовать в акции
    """
    get_promo_offers_request = {"status_type":"MANUALLY_ADDED","promo_id":"promoId"}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/promos/offers".format(businessId=56),
    #    headers=headers,
    #    json=get_promo_offers_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_promos(client: TestClient):
    """Test case for get_promos

    Получение списка акций
    """
    get_promos_request = {"participation":"PARTICIPATING_NOW","mechanics":"DIRECT_DISCOUNT"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/promos".format(businessId=56),
    #    headers=headers,
    #    json=get_promos_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_promo_offers(client: TestClient):
    """Test case for update_promo_offers

    Добавление товаров в акцию или изменение их цен
    """
    update_promo_offers_request = {"offers":[{"offer_id":"offerId","params":{"discount_params":{"promo_price":1,"price":1}}},{"offer_id":"offerId","params":{"discount_params":{"promo_price":1,"price":1}}},{"offer_id":"offerId","params":{"discount_params":{"promo_price":1,"price":1}}},{"offer_id":"offerId","params":{"discount_params":{"promo_price":1,"price":1}}},{"offer_id":"offerId","params":{"discount_params":{"promo_price":1,"price":1}}}],"promo_id":"promoId"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/promos/offers/update".format(businessId=56),
    #    headers=headers,
    #    json=update_promo_offers_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

