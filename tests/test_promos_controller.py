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
from ympa_python_aiohttp_server.models.delete_promo_offers_request import DeletePromoOffersRequest
from ympa_python_aiohttp_server.models.delete_promo_offers_response import DeletePromoOffersResponse
from ympa_python_aiohttp_server.models.get_promo_offers_request import GetPromoOffersRequest
from ympa_python_aiohttp_server.models.get_promo_offers_response import GetPromoOffersResponse
from ympa_python_aiohttp_server.models.get_promos_request import GetPromosRequest
from ympa_python_aiohttp_server.models.get_promos_response import GetPromosResponse
from ympa_python_aiohttp_server.models.update_promo_offers_request import UpdatePromoOffersRequest
from ympa_python_aiohttp_server.models.update_promo_offers_response import UpdatePromoOffersResponse


pytestmark = pytest.mark.asyncio

async def test_delete_promo_offers(client):
    """Test case for delete_promo_offers

    Удаление товаров из акции
    """
    body = {"deleteAllOffers":True,"promoId":"promoId","offerIds":[null,null,null,null,null]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/promos/offers/delete'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_promo_offers(client):
    """Test case for get_promo_offers

    Получение списка товаров, которые участвуют или могут участвовать в акции
    """
    body = {"statusType":"MANUALLY_ADDED","promoId":"promoId"}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/promos/offers'.format(business_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_promos(client):
    """Test case for get_promos

    Получение списка акций
    """
    body = {"participation":"PARTICIPATING_NOW","mechanics":"DIRECT_DISCOUNT"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/promos'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_promo_offers(client):
    """Test case for update_promo_offers

    Добавление товаров в акцию или изменение их цен
    """
    body = {"offers":[{"offerId":"offerId","params":{"discountParams":{"promoPrice":1,"price":1}}},{"offerId":"offerId","params":{"discountParams":{"promoPrice":1,"price":1}}},{"offerId":"offerId","params":{"discountParams":{"promoPrice":1,"price":1}}},{"offerId":"offerId","params":{"discountParams":{"promoPrice":1,"price":1}}},{"offerId":"offerId","params":{"discountParams":{"promoPrice":1,"price":1}}}],"promoId":"promoId"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/promos/offers/update'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

