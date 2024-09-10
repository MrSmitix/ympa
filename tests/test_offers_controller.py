# coding: utf-8

import pytest
import json
from aiohttp import web

from ympa_python_aiohttp_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_aiohttp_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_aiohttp_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_aiohttp_server.models.api_locked_error_response import ApiLockedErrorResponse
from ympa_python_aiohttp_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_aiohttp_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_aiohttp_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_aiohttp_server.models.currency_type import CurrencyType
from ympa_python_aiohttp_server.models.delete_campaign_offers_request import DeleteCampaignOffersRequest
from ympa_python_aiohttp_server.models.delete_campaign_offers_response import DeleteCampaignOffersResponse
from ympa_python_aiohttp_server.models.empty_api_response import EmptyApiResponse
from ympa_python_aiohttp_server.models.get_all_offers_response import GetAllOffersResponse
from ympa_python_aiohttp_server.models.get_campaign_offers_request import GetCampaignOffersRequest
from ympa_python_aiohttp_server.models.get_campaign_offers_response import GetCampaignOffersResponse
from ympa_python_aiohttp_server.models.get_offer_recommendations_request import GetOfferRecommendationsRequest
from ympa_python_aiohttp_server.models.get_offer_recommendations_response import GetOfferRecommendationsResponse
from ympa_python_aiohttp_server.models.get_offers_response import GetOffersResponse
from ympa_python_aiohttp_server.models.update_campaign_offers_request import UpdateCampaignOffersRequest


pytestmark = pytest.mark.asyncio

async def test_delete_campaign_offers(client):
    """Test case for delete_campaign_offers

    Удаление товаров из ассортимента магазина
    """
    body = {"offerIds":[null,null,null,null,null]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/offers/delete'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_all_offers(client):
    """Test case for get_all_offers

    Все предложения магазина
    """
    params = [('feedId', 56),
                    ('chunk', 56)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/offers/all'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_campaign_offers(client):
    """Test case for get_campaign_offers

    Информация о товарах, которые размещены в заданном магазине
    """
    body = {"categoryIds":[0,0],"vendorNames":["vendorNames","vendorNames"],"statuses":["PUBLISHED","PUBLISHED"],"offerIds":[null,null,null,null,null],"tags":["tags","tags"]}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/offers'.format(campaign_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_offer_recommendations(client):
    """Test case for get_offer_recommendations

    Рекомендации Маркета, касающиеся цен
    """
    body = {"cofinancePriceFilter":"SPECIFIED","competitivenessFilter":"OPTIMAL","offerIds":[null,null]}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/offers/recommendations'.format(business_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_offers(client):
    """Test case for get_offers

    Предложения магазина
    """
    params = [('query', 'query_example'),
                    ('feedId', 56),
                    ('shopCategoryId', 'shop_category_id_example'),
                    ('currency', ympa_python_aiohttp_server.CurrencyType()),
                    ('matched', True),
                    ('page', 1),
                    ('pageSize', 56)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/offers'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_campaign_offers(client):
    """Test case for update_campaign_offers

    Изменение условий продажи товаров в магазине
    """
    body = {"offers":[{"available":True,"vat":0,"offerId":"offerId","quantum":{"minQuantity":1,"stepQuantity":60}},{"available":True,"vat":0,"offerId":"offerId","quantum":{"minQuantity":1,"stepQuantity":60}},{"available":True,"vat":0,"offerId":"offerId","quantum":{"minQuantity":1,"stepQuantity":60}},{"available":True,"vat":0,"offerId":"offerId","quantum":{"minQuantity":1,"stepQuantity":60}},{"available":True,"vat":0,"offerId":"offerId","quantum":{"minQuantity":1,"stepQuantity":60}}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/offers/update'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

