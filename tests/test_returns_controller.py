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
from ympa_python_aiohttp_server.models.get_return_response import GetReturnResponse
from ympa_python_aiohttp_server.models.get_returns_response import GetReturnsResponse
from ympa_python_aiohttp_server.models.refund_status_type import RefundStatusType
from ympa_python_aiohttp_server.models.return_type import ReturnType
from ympa_python_aiohttp_server.models.set_return_decision_request import SetReturnDecisionRequest


pytestmark = pytest.mark.asyncio

async def test_get_return(client):
    """Test case for get_return

    Информация о невыкупе или возврате
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}'.format(campaign_id=56, order_id=56, return_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_return_application(client):
    """Test case for get_return_application

    Получение заявления на возврат
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}/application'.format(campaign_id=56, order_id=56, return_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_return_photo(client):
    """Test case for get_return_photo

    Получение фотографии возврата
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}/decision/{item_id}/image/{image_hash}'.format(campaign_id=56, order_id=56, return_id=56, item_id=56, image_hash='image_hash_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_returns(client):
    """Test case for get_returns

    Список невыкупов и возвратов
    """
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20),
                    ('orderIds', [56]),
                    ('statuses', [ympa_python_aiohttp_server.RefundStatusType()]),
                    ('type', ympa_python_aiohttp_server.ReturnType()),
                    ('fromDate', '2022-10-31'),
                    ('toDate', '2022-11-30'),
                    ('from_date2', '2022-10-31'),
                    ('to_date2', '2022-11-30')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/returns'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_set_return_decision(client):
    """Test case for set_return_decision

    Принятие или изменение решения по возврату
    """
    body = {"returnItemId":1,"decisionType":"REFUND_MONEY_INCLUDING_SHIPMENT","comment":"Вернуть 149 рублей за пересылку"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}/decision'.format(campaign_id=56, order_id=56, return_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_submit_return_decision(client):
    """Test case for submit_return_decision

    Подтверждение решения по возврату
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}/decision/submit'.format(campaign_id=56, order_id=56, return_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

