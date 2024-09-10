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
from ympa_python_aiohttp_server.models.change_outlet_request import ChangeOutletRequest
from ympa_python_aiohttp_server.models.create_outlet_response import CreateOutletResponse
from ympa_python_aiohttp_server.models.empty_api_response import EmptyApiResponse
from ympa_python_aiohttp_server.models.get_outlet_response import GetOutletResponse
from ympa_python_aiohttp_server.models.get_outlets_response import GetOutletsResponse


pytestmark = pytest.mark.asyncio

async def test_create_outlet(client):
    """Test case for create_outlet

    Создание точки продаж
    """
    body = {"storagePeriod":0,"address":{"number":"number","km":6,"regionId":0,"city":"city","street":"street","additional":"additional","estate":"estate","block":"block","building":"building"},"visibility":"HIDDEN","isMain":True,"shopOutletCode":"shopOutletCode","name":"name","phones":["phones","phones"],"type":"DEPOT","coords":"coords","workingSchedule":{"scheduleItems":[{"startDay":"MONDAY","startTime":"startTime","endTime":"endTime"},{"startDay":"MONDAY","startTime":"startTime","endTime":"endTime"}],"workInHoliday":True},"deliveryRules":[{"priceFreePickup":7.061401241503109,"deliveryServiceId":5,"maxDeliveryDays":5,"minDeliveryDays":1,"orderBefore":5,"unspecifiedDeliveryInterval":True},{"priceFreePickup":7.061401241503109,"deliveryServiceId":5,"maxDeliveryDays":5,"minDeliveryDays":1,"orderBefore":5,"unspecifiedDeliveryInterval":True}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/outlets'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_outlet(client):
    """Test case for delete_outlet

    Удаление точки продаж
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='DELETE',
        path='/campaigns/{campaign_id}/outlets/{outlet_id}'.format(campaign_id=56, outlet_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_outlet(client):
    """Test case for get_outlet

    Информация об одной точке продаж
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/outlets/{outlet_id}'.format(campaign_id=56, outlet_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_outlets(client):
    """Test case for get_outlets

    Информация о нескольких точках продаж
    """
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('region_id', 56),
                    ('shop_outlet_code', 'shop_outlet_code_example'),
                    ('regionId', 56)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/outlets'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_outlet(client):
    """Test case for update_outlet

    Изменение информации о точке продаж
    """
    body = {"storagePeriod":0,"address":{"number":"number","km":6,"regionId":0,"city":"city","street":"street","additional":"additional","estate":"estate","block":"block","building":"building"},"visibility":"HIDDEN","isMain":True,"shopOutletCode":"shopOutletCode","name":"name","phones":["phones","phones"],"type":"DEPOT","coords":"coords","workingSchedule":{"scheduleItems":[{"startDay":"MONDAY","startTime":"startTime","endTime":"endTime"},{"startDay":"MONDAY","startTime":"startTime","endTime":"endTime"}],"workInHoliday":True},"deliveryRules":[{"priceFreePickup":7.061401241503109,"deliveryServiceId":5,"maxDeliveryDays":5,"minDeliveryDays":1,"orderBefore":5,"unspecifiedDeliveryInterval":True},{"priceFreePickup":7.061401241503109,"deliveryServiceId":5,"maxDeliveryDays":5,"minDeliveryDays":1,"orderBefore":5,"unspecifiedDeliveryInterval":True}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/outlets/{outlet_id}'.format(campaign_id=56, outlet_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

