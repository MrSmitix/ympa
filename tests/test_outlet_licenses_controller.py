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
from ympa_python_aiohttp_server.models.get_outlet_licenses_response import GetOutletLicensesResponse
from ympa_python_aiohttp_server.models.update_outlet_license_request import UpdateOutletLicenseRequest


pytestmark = pytest.mark.asyncio

async def test_delete_outlet_licenses(client):
    """Test case for delete_outlet_licenses

    Удаление лицензий для точек продаж
    """
    params = [('ids', [56])]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='DELETE',
        path='/campaigns/{campaign_id}/outlets/licenses'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_outlet_licenses(client):
    """Test case for get_outlet_licenses

    Информация о лицензиях для точек продаж
    """
    params = [('outletIds', [56]),
                    ('ids', [56])]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/outlets/licenses'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_outlet_licenses(client):
    """Test case for update_outlet_licenses

    Создание и изменение лицензий для точек продаж
    """
    body = {"licenses":[{"licenseType":"ALCOHOL","number":"number","dateOfExpiry":"2000-01-23T04:56:07.000+00:00","outletId":6,"id":0,"dateOfIssue":"2000-01-23T04:56:07.000+00:00"},{"licenseType":"ALCOHOL","number":"number","dateOfExpiry":"2000-01-23T04:56:07.000+00:00","outletId":6,"id":0,"dateOfIssue":"2000-01-23T04:56:07.000+00:00"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/outlets/licenses'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

