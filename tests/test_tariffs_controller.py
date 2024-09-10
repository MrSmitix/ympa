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
from ympa_python_aiohttp_server.models.calculate_tariffs_request import CalculateTariffsRequest
from ympa_python_aiohttp_server.models.calculate_tariffs_response import CalculateTariffsResponse


pytestmark = pytest.mark.asyncio

async def test_calculate_tariffs(client):
    """Test case for calculate_tariffs

    Калькулятор стоимости услуг
    """
    body = {"offers":[{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"categoryId":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"categoryId":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"categoryId":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"categoryId":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"categoryId":0,"height":0.5637376656633328}],"parameters":{"campaignId":0,"sellingProgram":"FBY","frequency":"DAILY"}}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/tariffs/calculate',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

