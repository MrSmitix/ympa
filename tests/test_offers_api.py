# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_locked_error_response import ApiLockedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.currency_type import CurrencyType  # noqa: F401
from ympa_python_fastapi_server.models.delete_campaign_offers_request import DeleteCampaignOffersRequest  # noqa: F401
from ympa_python_fastapi_server.models.delete_campaign_offers_response import DeleteCampaignOffersResponse  # noqa: F401
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_all_offers_response import GetAllOffersResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_campaign_offers_request import GetCampaignOffersRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_campaign_offers_response import GetCampaignOffersResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_offer_recommendations_request import GetOfferRecommendationsRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_offer_recommendations_response import GetOfferRecommendationsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_offers_response import GetOffersResponse  # noqa: F401
from ympa_python_fastapi_server.models.update_campaign_offers_request import UpdateCampaignOffersRequest  # noqa: F401


def test_delete_campaign_offers(client: TestClient):
    """Test case for delete_campaign_offers

    Удаление товаров из ассортимента магазина
    """
    delete_campaign_offers_request = {"offer_ids":[null,null,null,null,null]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/offers/delete".format(campaignId=56),
    #    headers=headers,
    #    json=delete_campaign_offers_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_all_offers(client: TestClient):
    """Test case for get_all_offers

    Все предложения магазина
    """
    params = [("feed_id", 56),     ("chunk", 56)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/offers/all".format(campaignId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_campaign_offers(client: TestClient):
    """Test case for get_campaign_offers

    Информация о товарах, которые размещены в заданном магазине
    """
    get_campaign_offers_request = {"category_ids":[0,0],"vendor_names":["vendorNames","vendorNames"],"statuses":["PUBLISHED","PUBLISHED"],"offer_ids":[null,null,null,null,null],"tags":["tags","tags"]}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/offers".format(campaignId=56),
    #    headers=headers,
    #    json=get_campaign_offers_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_offer_recommendations(client: TestClient):
    """Test case for get_offer_recommendations

    Рекомендации Маркета, касающиеся цен
    """
    get_offer_recommendations_request = {"cofinance_price_filter":"SPECIFIED","competitiveness_filter":"OPTIMAL","offer_ids":[null,null]}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/offers/recommendations".format(businessId=56),
    #    headers=headers,
    #    json=get_offer_recommendations_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_offers(client: TestClient):
    """Test case for get_offers

    Предложения магазина
    """
    params = [("query", 'query_example'),     ("feed_id", 56),     ("shop_category_id", 'shop_category_id_example'),     ("currency", ympa_python_fastapi_server.CurrencyType()),     ("matched", True),     ("page", 1),     ("page_size", 56)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/offers".format(campaignId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_campaign_offers(client: TestClient):
    """Test case for update_campaign_offers

    Изменение условий продажи товаров в магазине
    """
    update_campaign_offers_request = {"offers":[{"available":1,"vat":0,"offer_id":"offerId","quantum":{"min_quantity":1,"step_quantity":60}},{"available":1,"vat":0,"offer_id":"offerId","quantum":{"min_quantity":1,"step_quantity":60}},{"available":1,"vat":0,"offer_id":"offerId","quantum":{"min_quantity":1,"step_quantity":60}},{"available":1,"vat":0,"offer_id":"offerId","quantum":{"min_quantity":1,"step_quantity":60}},{"available":1,"vat":0,"offer_id":"offerId","quantum":{"min_quantity":1,"step_quantity":60}}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/offers/update".format(campaignId=56),
    #    headers=headers,
    #    json=update_campaign_offers_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

