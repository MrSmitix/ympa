# coding: utf-8

import pytest
import json
from aiohttp import web

from ympa_python_aiohttp_server.models.accept_order_cancellation_request import AcceptOrderCancellationRequest
from ympa_python_aiohttp_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_aiohttp_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_aiohttp_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_aiohttp_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_aiohttp_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_aiohttp_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_aiohttp_server.models.empty_api_response import EmptyApiResponse
from ympa_python_aiohttp_server.models.get_order_response import GetOrderResponse
from ympa_python_aiohttp_server.models.get_orders_response import GetOrdersResponse
from ympa_python_aiohttp_server.models.order_buyer_type import OrderBuyerType
from ympa_python_aiohttp_server.models.order_delivery_dispatch_type import OrderDeliveryDispatchType
from ympa_python_aiohttp_server.models.order_status_type import OrderStatusType
from ympa_python_aiohttp_server.models.order_substatus_type import OrderSubstatusType
from ympa_python_aiohttp_server.models.provide_order_digital_codes_request import ProvideOrderDigitalCodesRequest
from ympa_python_aiohttp_server.models.provide_order_item_identifiers_request import ProvideOrderItemIdentifiersRequest
from ympa_python_aiohttp_server.models.provide_order_item_identifiers_response import ProvideOrderItemIdentifiersResponse
from ympa_python_aiohttp_server.models.set_order_box_layout_request import SetOrderBoxLayoutRequest
from ympa_python_aiohttp_server.models.set_order_box_layout_response import SetOrderBoxLayoutResponse
from ympa_python_aiohttp_server.models.set_order_shipment_boxes_request import SetOrderShipmentBoxesRequest
from ympa_python_aiohttp_server.models.set_order_shipment_boxes_response import SetOrderShipmentBoxesResponse
from ympa_python_aiohttp_server.models.update_order_item_request import UpdateOrderItemRequest
from ympa_python_aiohttp_server.models.update_order_status_request import UpdateOrderStatusRequest
from ympa_python_aiohttp_server.models.update_order_status_response import UpdateOrderStatusResponse
from ympa_python_aiohttp_server.models.update_order_statuses_request import UpdateOrderStatusesRequest
from ympa_python_aiohttp_server.models.update_order_statuses_response import UpdateOrderStatusesResponse


pytestmark = pytest.mark.asyncio

async def test_accept_order_cancellation(client):
    """Test case for accept_order_cancellation

    Отмена заказа покупателем
    """
    body = {"reason":"ORDER_DELIVERED","accepted":True}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/orders/{order_id}/cancellation/accept'.format(campaign_id=56, order_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_order(client):
    """Test case for get_order

    Информация об одном заказе
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/orders/{order_id}'.format(campaign_id=56, order_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_orders(client):
    """Test case for get_orders

    Информация о нескольких заказах
    """
    params = [('orderIds', [56]),
                    ('status', [ympa_python_aiohttp_server.OrderStatusType()]),
                    ('substatus', [ympa_python_aiohttp_server.OrderSubstatusType()]),
                    ('fromDate', '2013-10-20'),
                    ('toDate', '2013-10-20'),
                    ('supplierShipmentDateFrom', '2013-10-20'),
                    ('supplierShipmentDateTo', '2013-10-20'),
                    ('updatedAtFrom', '2013-10-20T19:20:30+01:00'),
                    ('updatedAtTo', '2013-10-20T19:20:30+01:00'),
                    ('dispatchType', ympa_python_aiohttp_server.OrderDeliveryDispatchType()),
                    ('fake', False),
                    ('hasCis', False),
                    ('onlyWaitingForCancellationApprove', False),
                    ('onlyEstimatedDelivery', False),
                    ('buyerType', ympa_python_aiohttp_server.OrderBuyerType()),
                    ('page', 1),
                    ('pageSize', 56),
                    ('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/orders'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_provide_order_digital_codes(client):
    """Test case for provide_order_digital_codes

    Передача ключей цифровых товаров
    """
    body = {"items":[{"activate_till":"2000-01-23","code":"code","slip":"slip","id":0},{"activate_till":"2000-01-23","code":"code","slip":"slip","id":0}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/orders/{order_id}/deliverDigitalGoods'.format(campaign_id=56, order_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_provide_order_item_identifiers(client):
    """Test case for provide_order_item_identifiers

    Передача кодов маркировки единиц товара
    """
    body = {"items":[{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0},{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/orders/{order_id}/identifiers'.format(campaign_id=56, order_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_set_order_box_layout(client):
    """Test case for set_order_box_layout

    Подготовка заказа
    """
    body = {"boxes":[{"items":[{"partialCount":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"fullCount":1},{"partialCount":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"fullCount":1}]},{"items":[{"partialCount":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"fullCount":1},{"partialCount":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"fullCount":1}]}],"allowRemove":False}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/orders/{order_id}/boxes'.format(campaign_id=56, order_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_set_order_shipment_boxes(client):
    """Test case for set_order_shipment_boxes

    Передача количества грузовых мест в заказе
    """
    body = {"boxes":[{"fulfilmentId":"fulfilmentId","id":0},{"fulfilmentId":"fulfilmentId","id":0}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/orders/{order_id}/delivery/shipments/{shipment_id}/boxes'.format(campaign_id=56, order_id=56, shipment_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_order_items(client):
    """Test case for update_order_items

    Удаление товара из заказа или уменьшение числа единиц
    """
    body = {"reason":"PARTNER_REQUESTED_REMOVE","items":[{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"count":0,"id":0},{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"count":0,"id":0}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/orders/{order_id}/items'.format(campaign_id=56, order_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_order_status(client):
    """Test case for update_order_status

    Изменение статуса одного заказа
    """
    body = {"order":{"delivery":{"dates":{"realDeliveryDate":"2000-01-23"}},"substatus":"RESERVATION_EXPIRED","status":"PLACING"}}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/orders/{order_id}/status'.format(campaign_id=56, order_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_order_statuses(client):
    """Test case for update_order_statuses

    Изменение статусов нескольких заказов
    """
    body = {"orders":[{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/orders/status-update'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

