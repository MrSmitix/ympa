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
from ympa_python_aiohttp_server.models.confirm_shipment_request import ConfirmShipmentRequest
from ympa_python_aiohttp_server.models.empty_api_response import EmptyApiResponse
from ympa_python_aiohttp_server.models.get_shipment_orders_info_response import GetShipmentOrdersInfoResponse
from ympa_python_aiohttp_server.models.get_shipment_response import GetShipmentResponse
from ympa_python_aiohttp_server.models.search_shipments_request import SearchShipmentsRequest
from ympa_python_aiohttp_server.models.search_shipments_response import SearchShipmentsResponse
from ympa_python_aiohttp_server.models.set_shipment_pallets_count_request import SetShipmentPalletsCountRequest
from ympa_python_aiohttp_server.models.shipment_pallet_label_page_format_type import ShipmentPalletLabelPageFormatType
from ympa_python_aiohttp_server.models.transfer_orders_from_shipment_request import TransferOrdersFromShipmentRequest


pytestmark = pytest.mark.asyncio

async def test_confirm_shipment(client):
    """Test case for confirm_shipment

    Подтверждение отгрузки
    """
    body = {"externalShipmentId":"externalShipmentId"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/first-mile/shipments/{shipment_id}/confirm'.format(campaign_id=56, shipment_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_download_shipment_act(client):
    """Test case for download_shipment_act

    Получение акта приема-передачи
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/first-mile/shipments/{shipment_id}/act'.format(campaign_id=56, shipment_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_download_shipment_discrepancy_act(client):
    """Test case for download_shipment_discrepancy_act

    Получение акта расхождений
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/first-mile/shipments/{shipment_id}/discrepancy-act'.format(campaign_id=56, shipment_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_download_shipment_inbound_act(client):
    """Test case for download_shipment_inbound_act

    Получение фактического акта приема-передачи
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/first-mile/shipments/{shipment_id}/inbound-act'.format(campaign_id=56, shipment_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_download_shipment_pallet_labels(client):
    """Test case for download_shipment_pallet_labels

    Ярлыки для доверительной приемки (FBS)
    """
    params = [('format', A8)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/first-mile/shipments/{shipment_id}/pallet/labels'.format(campaign_id=56, shipment_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_download_shipment_reception_transfer_act(client):
    """Test case for download_shipment_reception_transfer_act

    Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
    """
    params = [('warehouse_id', 123123)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/shipments/reception-transfer-act'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_download_shipment_transportation_waybill(client):
    """Test case for download_shipment_transportation_waybill

    Получение транспортной накладной
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/first-mile/shipments/{shipment_id}/transportation-waybill'.format(campaign_id=56, shipment_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_shipment(client):
    """Test case for get_shipment

    Получение информации об одной отгрузке
    """
    params = [('cancelledOrders', True)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/first-mile/shipments/{shipment_id}'.format(campaign_id=56, shipment_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_shipment_orders_info(client):
    """Test case for get_shipment_orders_info

    Получение информации о возможности печати ярлыков (FBS)
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/first-mile/shipments/{shipment_id}/orders/info'.format(campaign_id=56, shipment_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_search_shipments(client):
    """Test case for search_shipments

    Получение информации о нескольких отгрузках
    """
    body = {"cancelledOrders":True,"dateTo":"2000-01-23","statuses":["OUTBOUND_CREATED","OUTBOUND_CREATED"],"orderIds":[0,0],"dateFrom":"2000-01-23"}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/first-mile/shipments'.format(campaign_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_set_shipment_pallets_count(client):
    """Test case for set_shipment_pallets_count

    Передача количества упаковок в отгрузке
    """
    body = {"placesCount":0}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/first-mile/shipments/{shipment_id}/pallets'.format(campaign_id=56, shipment_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_transfer_orders_from_shipment(client):
    """Test case for transfer_orders_from_shipment

    Перенос заказов в следующую отгрузку
    """
    body = {"orderIds":[0,0,0,0,0]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/first-mile/shipments/{shipment_id}/orders/transfer'.format(campaign_id=56, shipment_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

