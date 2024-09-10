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
from ympa_python_aiohttp_server.models.empty_api_response import EmptyApiResponse
from ympa_python_aiohttp_server.models.get_warehouse_stocks_request import GetWarehouseStocksRequest
from ympa_python_aiohttp_server.models.get_warehouse_stocks_response import GetWarehouseStocksResponse
from ympa_python_aiohttp_server.models.update_stocks_request import UpdateStocksRequest


pytestmark = pytest.mark.asyncio

async def test_get_stocks(client):
    """Test case for get_stocks

    Информация об остатках и оборачиваемости
    """
    body = {"archived":True,"withTurnover":False,"offerIds":[null,null,null,null,null]}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/offers/stocks'.format(campaign_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_stocks(client):
    """Test case for update_stocks

    Передача информации об остатках
    """
    body = {"skus":[{"sku":"sku","items":[{"count":160165638,"updatedAt":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updatedAt":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updatedAt":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updatedAt":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updatedAt":"2000-01-23T04:56:07.000+00:00"}]}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/offers/stocks'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

