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
from ympa_python_aiohttp_server.models.get_quality_rating_details_response import GetQualityRatingDetailsResponse
from ympa_python_aiohttp_server.models.get_quality_rating_request import GetQualityRatingRequest
from ympa_python_aiohttp_server.models.get_quality_rating_response import GetQualityRatingResponse


pytestmark = pytest.mark.asyncio

async def test_get_quality_rating_details(client):
    """Test case for get_quality_rating_details

    Заказы, которые повлияли на индекс качества
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/ratings/quality/details'.format(campaign_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_quality_ratings(client):
    """Test case for get_quality_ratings

    Индекс качества магазинов
    """
    body = {"dateTo":"2000-01-23","campaignIds":[0,0,0,0,0],"dateFrom":"2000-01-23"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/ratings/quality'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

