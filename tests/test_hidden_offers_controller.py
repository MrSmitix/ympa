# coding: utf-8

import pytest
import json
from aiohttp import web

from ympa_python_aiohttp_server.models.add_hidden_offers_request import AddHiddenOffersRequest
from ympa_python_aiohttp_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_aiohttp_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_aiohttp_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_aiohttp_server.models.api_locked_error_response import ApiLockedErrorResponse
from ympa_python_aiohttp_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_aiohttp_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_aiohttp_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_aiohttp_server.models.delete_hidden_offers_request import DeleteHiddenOffersRequest
from ympa_python_aiohttp_server.models.empty_api_response import EmptyApiResponse
from ympa_python_aiohttp_server.models.get_hidden_offers_response import GetHiddenOffersResponse


pytestmark = pytest.mark.asyncio

async def test_add_hidden_offers(client):
    """Test case for add_hidden_offers

    Скрытие товаров и настройки скрытия
    """
    body = {"hiddenOffers":[{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/hidden-offers'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_hidden_offers(client):
    """Test case for delete_hidden_offers

    Возобновление показа товаров
    """
    body = {"hiddenOffers":[{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/hidden-offers/delete'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_hidden_offers(client):
    """Test case for get_hidden_offers

    Информация о скрытых вами товарах
    """
    params = [('offer_id', ['offer_id_example']),
                    ('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20),
                    ('offset', 56),
                    ('page', 1),
                    ('pageSize', 56)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/hidden-offers'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

