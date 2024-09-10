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
from ympa_python_aiohttp_server.models.feed_index_logs_status_type import FeedIndexLogsStatusType
from ympa_python_aiohttp_server.models.get_feed_index_logs_response import GetFeedIndexLogsResponse
from ympa_python_aiohttp_server.models.get_feed_response import GetFeedResponse
from ympa_python_aiohttp_server.models.get_feeds_response import GetFeedsResponse
from ympa_python_aiohttp_server.models.set_feed_params_request import SetFeedParamsRequest


pytestmark = pytest.mark.asyncio

async def test_get_feed(client):
    """Test case for get_feed

    Информация о прайс-листе
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/feeds/{feed_id}'.format(campaign_id=56, feed_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_feed_index_logs(client):
    """Test case for get_feed_index_logs

    Отчет по индексации прайс-листа
    """
    params = [('limit', 20),
                    ('published_time_from', '2013-10-20T19:20:30+01:00'),
                    ('published_time_to', '2013-10-20T19:20:30+01:00'),
                    ('status', ympa_python_aiohttp_server.FeedIndexLogsStatusType())]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/feeds/{feed_id}/index-logs'.format(campaign_id=56, feed_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_feeds(client):
    """Test case for get_feeds

    Список прайс-листов магазина
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/feeds'.format(campaign_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_refresh_feed(client):
    """Test case for refresh_feed

    Сообщить, что прайс-лист обновился
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/feeds/{feed_id}/refresh'.format(campaign_id=56, feed_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_set_feed_params(client):
    """Test case for set_feed_params

    Изменение параметров прайс-листа
    """
    body = {"parameters":[{"deleted":True,"values":[0,0],"name":"name"},{"deleted":True,"values":[0,0],"name":"name"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/feeds/{feed_id}/params'.format(campaign_id=56, feed_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

