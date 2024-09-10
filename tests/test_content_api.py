# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_locked_error_response import ApiLockedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_category_content_parameters_response import GetCategoryContentParametersResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_offer_cards_content_status_request import GetOfferCardsContentStatusRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_offer_cards_content_status_response import GetOfferCardsContentStatusResponse  # noqa: F401
from ympa_python_fastapi_server.models.update_offer_content_request import UpdateOfferContentRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_offer_content_response import UpdateOfferContentResponse  # noqa: F401


def test_get_category_content_parameters(client: TestClient):
    """Test case for get_category_content_parameters

    Списки характеристик товаров по категориям
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/category/{categoryId}/parameters".format(categoryId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_offer_cards_content_status(client: TestClient):
    """Test case for get_offer_cards_content_status

    Получение информации о заполненности карточек магазина
    """
    get_offer_cards_content_status_request = {"category_ids":[null,null,null,null,null],"offer_ids":[null,null,null,null,null],"card_statuses":["HAS_CARD_CAN_NOT_UPDATE","HAS_CARD_CAN_NOT_UPDATE"]}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/offer-cards".format(businessId=56),
    #    headers=headers,
    #    json=get_offer_cards_content_status_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_offer_content(client: TestClient):
    """Test case for update_offer_content

    Редактирование категорийных характеристик товара
    """
    update_offer_content_request = {"offers_content":[{"offer_id":"offerId","category_id":0,"parameter_values":[{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"}]},{"offer_id":"offerId","category_id":0,"parameter_values":[{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"}]},{"offer_id":"offerId","category_id":0,"parameter_values":[{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"}]},{"offer_id":"offerId","category_id":0,"parameter_values":[{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"}]},{"offer_id":"offerId","category_id":0,"parameter_values":[{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"}]}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/offer-cards/update".format(businessId=56),
    #    headers=headers,
    #    json=update_offer_content_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

