# coding: utf-8

import pytest
import json
from aiohttp import web

from ympa_python_aiohttp_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_aiohttp_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_aiohttp_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_aiohttp_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_aiohttp_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_aiohttp_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_aiohttp_server.models.currency_type import CurrencyType
from ympa_python_aiohttp_server.models.get_models_offers_response import GetModelsOffersResponse
from ympa_python_aiohttp_server.models.get_models_request import GetModelsRequest
from ympa_python_aiohttp_server.models.get_models_response import GetModelsResponse
from ympa_python_aiohttp_server.models.search_models_response import SearchModelsResponse
from ympa_python_aiohttp_server.models.sort_order_type import SortOrderType


pytestmark = pytest.mark.asyncio

async def test_get_model(client):
    """Test case for get_model

    Информация об одной модели
    """
    params = [('regionId', 56),
                    ('currency', ympa_python_aiohttp_server.CurrencyType())]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/models/{model_id}'.format(model_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_model_offers(client):
    """Test case for get_model_offers

    Список предложений для одной модели
    """
    params = [('regionId', 56),
                    ('currency', ympa_python_aiohttp_server.CurrencyType()),
                    ('orderByPrice', ympa_python_aiohttp_server.SortOrderType()),
                    ('count', 10),
                    ('page', 1)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/models/{model_id}/offers'.format(model_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_models(client):
    """Test case for get_models

    Информация о нескольких моделях
    """
    body = {"models":[0,0]}
    params = [('regionId', 56),
                    ('currency', ympa_python_aiohttp_server.CurrencyType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/models',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_models_offers(client):
    """Test case for get_models_offers

    Список предложений для нескольких моделей
    """
    body = {"models":[0,0]}
    params = [('regionId', 56),
                    ('currency', ympa_python_aiohttp_server.CurrencyType()),
                    ('orderByPrice', ympa_python_aiohttp_server.SortOrderType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/models/offers',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_search_models(client):
    """Test case for search_models

    Поиск модели товара
    """
    params = [('query', 'query_example'),
                    ('regionId', 56),
                    ('currency', ympa_python_aiohttp_server.CurrencyType()),
                    ('page', 1),
                    ('pageSize', 56)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/models',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

