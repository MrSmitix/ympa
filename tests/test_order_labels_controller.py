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
from ympa_python_aiohttp_server.models.get_order_labels_data_response import GetOrderLabelsDataResponse
from ympa_python_aiohttp_server.models.page_format_type import PageFormatType


pytestmark = pytest.mark.asyncio

async def test_generate_order_label(client):
    """Test case for generate_order_label

    Готовый ярлык‑наклейка для коробки в заказе
    """
    params = [('format', ympa_python_aiohttp_server.PageFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/orders/{order_id}/delivery/shipments/{shipment_id}/boxes/{box_id}/label'.format(campaign_id=56, order_id=56, shipment_id=56, box_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_order_labels(client):
    """Test case for generate_order_labels

    Готовые ярлыки‑наклейки на все коробки в одном заказе
    """
    params = [('format', ympa_python_aiohttp_server.PageFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/orders/{order_id}/delivery/labels'.format(campaign_id=56, order_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_order_labels_data(client):
    """Test case for get_order_labels_data

    Данные для самостоятельного изготовления ярлыков
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/orders/{order_id}/delivery/labels/data'.format(campaign_id=56, order_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

