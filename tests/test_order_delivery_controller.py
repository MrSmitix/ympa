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
from ympa_python_aiohttp_server.models.get_order_buyer_info_response import GetOrderBuyerInfoResponse
from ympa_python_aiohttp_server.models.set_order_delivery_date_request import SetOrderDeliveryDateRequest
from ympa_python_aiohttp_server.models.set_order_delivery_track_code_request import SetOrderDeliveryTrackCodeRequest
from ympa_python_aiohttp_server.models.update_order_storage_limit_request import UpdateOrderStorageLimitRequest
from ympa_python_aiohttp_server.models.verify_order_eac_request import VerifyOrderEacRequest
from ympa_python_aiohttp_server.models.verify_order_eac_response import VerifyOrderEacResponse


pytestmark = pytest.mark.asyncio

async def test_get_order_buyer_info(client):
    """Test case for get_order_buyer_info

    Информация о покупателе — физическом лице
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/orders/{order_id}/buyer'.format(campaign_id=56, order_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_set_order_delivery_date(client):
    """Test case for set_order_delivery_date

    Изменение даты доставки заказа
    """
    body = {"reason":"USER_MOVED_DELIVERY_DATES","dates":{"toDate":"2000-01-23"}}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/orders/{order_id}/delivery/date'.format(campaign_id=56, order_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_set_order_delivery_track_code(client):
    """Test case for set_order_delivery_track_code

    Передача трек‑номера посылки
    """
    body = {"trackCode":"trackCode","deliveryServiceId":0}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/orders/{order_id}/delivery/track'.format(campaign_id=56, order_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_order_storage_limit(client):
    """Test case for update_order_storage_limit

    Продление срока хранения заказа
    """
    body = {"newDate":"2000-01-23"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/orders/{order_id}/delivery/storage-limit'.format(campaign_id=56, order_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_verify_order_eac(client):
    """Test case for verify_order_eac

    Передача кода подтверждения
    """
    body = {"code":"code"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/orders/{order_id}/verifyEac'.format(campaign_id=56, order_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

