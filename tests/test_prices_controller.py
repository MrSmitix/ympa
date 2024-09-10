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
from ympa_python_aiohttp_server.models.empty_api_response import EmptyApiResponse
from ympa_python_aiohttp_server.models.get_prices_by_offer_ids_request import GetPricesByOfferIdsRequest
from ympa_python_aiohttp_server.models.get_prices_by_offer_ids_response import GetPricesByOfferIdsResponse
from ympa_python_aiohttp_server.models.get_prices_response import GetPricesResponse
from ympa_python_aiohttp_server.models.suggest_prices_request import SuggestPricesRequest
from ympa_python_aiohttp_server.models.suggest_prices_response import SuggestPricesResponse
from ympa_python_aiohttp_server.models.update_business_prices_request import UpdateBusinessPricesRequest
from ympa_python_aiohttp_server.models.update_prices_request import UpdatePricesRequest


pytestmark = pytest.mark.asyncio

async def test_get_prices(client):
    """Test case for get_prices

    Список цен
    """
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20),
                    ('archived', False)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/offer-prices'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_prices_by_offer_ids(client):
    """Test case for get_prices_by_offer_ids

    Просмотр цен на указанные товары в магазине
    """
    body = {"offerIds":[null,null,null,null,null]}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/offer-prices'.format(campaign_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_suggested_prices(client):
    """Test case for get_suggested_prices

    Цены для продвижения товаров
    """
    body = {"offers":[{"marketSku":0,"offerId":"offerId"},{"marketSku":0,"offerId":"offerId"},{"marketSku":0,"offerId":"offerId"},{"marketSku":0,"offerId":"offerId"},{"marketSku":0,"offerId":"offerId"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/offer-prices/suggestions'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_business_prices(client):
    """Test case for update_business_prices

    Установка цен на товары во всех магазинах
    """
    body = {"offers":[{"price":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"offerId":"offerId"},{"price":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"offerId":"offerId"},{"price":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"offerId":"offerId"},{"price":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"offerId":"offerId"},{"price":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"offerId":"offerId"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/offer-prices/updates'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_prices(client):
    """Test case for update_prices

    Установка цен на товары в конкретном магазине
    """
    body = {"offers":[{"price":{"vat":1,"discountBase":6.027456183070403,"currencyId":"RUR","value":0.8008281904610115},"offerId":"offerId"},{"price":{"vat":1,"discountBase":6.027456183070403,"currencyId":"RUR","value":0.8008281904610115},"offerId":"offerId"},{"price":{"vat":1,"discountBase":6.027456183070403,"currencyId":"RUR","value":0.8008281904610115},"offerId":"offerId"},{"price":{"vat":1,"discountBase":6.027456183070403,"currencyId":"RUR","value":0.8008281904610115},"offerId":"offerId"},{"price":{"vat":1,"discountBase":6.027456183070403,"currencyId":"RUR","value":0.8008281904610115},"offerId":"offerId"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/offer-prices/updates'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

