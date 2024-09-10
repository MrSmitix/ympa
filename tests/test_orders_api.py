# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.accept_order_cancellation_request import AcceptOrderCancellationRequest  # noqa: F401
from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_order_response import GetOrderResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_orders_response import GetOrdersResponse  # noqa: F401
from ympa_python_fastapi_server.models.order_buyer_type import OrderBuyerType  # noqa: F401
from ympa_python_fastapi_server.models.order_delivery_dispatch_type import OrderDeliveryDispatchType  # noqa: F401
from ympa_python_fastapi_server.models.order_status_type import OrderStatusType  # noqa: F401
from ympa_python_fastapi_server.models.order_substatus_type import OrderSubstatusType  # noqa: F401
from ympa_python_fastapi_server.models.provide_order_digital_codes_request import ProvideOrderDigitalCodesRequest  # noqa: F401
from ympa_python_fastapi_server.models.provide_order_item_identifiers_request import ProvideOrderItemIdentifiersRequest  # noqa: F401
from ympa_python_fastapi_server.models.provide_order_item_identifiers_response import ProvideOrderItemIdentifiersResponse  # noqa: F401
from ympa_python_fastapi_server.models.set_order_box_layout_request import SetOrderBoxLayoutRequest  # noqa: F401
from ympa_python_fastapi_server.models.set_order_box_layout_response import SetOrderBoxLayoutResponse  # noqa: F401
from ympa_python_fastapi_server.models.set_order_shipment_boxes_request import SetOrderShipmentBoxesRequest  # noqa: F401
from ympa_python_fastapi_server.models.set_order_shipment_boxes_response import SetOrderShipmentBoxesResponse  # noqa: F401
from ympa_python_fastapi_server.models.update_order_item_request import UpdateOrderItemRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_order_status_request import UpdateOrderStatusRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_order_status_response import UpdateOrderStatusResponse  # noqa: F401
from ympa_python_fastapi_server.models.update_order_statuses_request import UpdateOrderStatusesRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_order_statuses_response import UpdateOrderStatusesResponse  # noqa: F401


def test_accept_order_cancellation(client: TestClient):
    """Test case for accept_order_cancellation

    Отмена заказа покупателем
    """
    accept_order_cancellation_request = {"reason":"ORDER_DELIVERED","accepted":1}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/orders/{orderId}/cancellation/accept".format(campaignId=56, orderId=56),
    #    headers=headers,
    #    json=accept_order_cancellation_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_order(client: TestClient):
    """Test case for get_order

    Информация об одном заказе
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/orders/{orderId}".format(campaignId=56, orderId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_orders(client: TestClient):
    """Test case for get_orders

    Информация о нескольких заказах
    """
    params = [("order_ids", [56]),     ("status", [ympa_python_fastapi_server.OrderStatusType()]),     ("substatus", [ympa_python_fastapi_server.OrderSubstatusType()]),     ("from_date", '2013-10-20'),     ("to_date", '2013-10-20'),     ("supplier_shipment_date_from", '2013-10-20'),     ("supplier_shipment_date_to", '2013-10-20'),     ("updated_at_from", '2013-10-20T19:20:30+01:00'),     ("updated_at_to", '2013-10-20T19:20:30+01:00'),     ("dispatch_type", ympa_python_fastapi_server.OrderDeliveryDispatchType()),     ("fake", False),     ("has_cis", False),     ("only_waiting_for_cancellation_approve", False),     ("only_estimated_delivery", False),     ("buyer_type", ympa_python_fastapi_server.OrderBuyerType()),     ("page", 1),     ("page_size", 56),     ("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/orders".format(campaignId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_provide_order_digital_codes(client: TestClient):
    """Test case for provide_order_digital_codes

    Передача ключей цифровых товаров
    """
    provide_order_digital_codes_request = {"items":[{"activate_till":"2000-01-23","code":"code","slip":"slip","id":0},{"activate_till":"2000-01-23","code":"code","slip":"slip","id":0}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods".format(campaignId=56, orderId=56),
    #    headers=headers,
    #    json=provide_order_digital_codes_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_provide_order_item_identifiers(client: TestClient):
    """Test case for provide_order_item_identifiers

    Передача кодов маркировки единиц товара
    """
    provide_order_item_identifiers_request = {"items":[{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0},{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/orders/{orderId}/identifiers".format(campaignId=56, orderId=56),
    #    headers=headers,
    #    json=provide_order_item_identifiers_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_set_order_box_layout(client: TestClient):
    """Test case for set_order_box_layout

    Подготовка заказа
    """
    set_order_box_layout_request = {"boxes":[{"items":[{"partial_count":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"full_count":1},{"partial_count":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"full_count":1}]},{"items":[{"partial_count":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"full_count":1},{"partial_count":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"full_count":1}]}],"allow_remove":0}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/orders/{orderId}/boxes".format(campaignId=56, orderId=56),
    #    headers=headers,
    #    json=set_order_box_layout_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_set_order_shipment_boxes(client: TestClient):
    """Test case for set_order_shipment_boxes

    Передача количества грузовых мест в заказе
    """
    set_order_shipment_boxes_request = {"boxes":[{"fulfilment_id":"fulfilmentId","id":0},{"fulfilment_id":"fulfilmentId","id":0}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes".format(campaignId=56, orderId=56, shipmentId=56),
    #    headers=headers,
    #    json=set_order_shipment_boxes_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_order_items(client: TestClient):
    """Test case for update_order_items

    Удаление товара из заказа или уменьшение числа единиц
    """
    update_order_item_request = {"reason":"PARTNER_REQUESTED_REMOVE","items":[{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"count":0,"id":0},{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"count":0,"id":0}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/orders/{orderId}/items".format(campaignId=56, orderId=56),
    #    headers=headers,
    #    json=update_order_item_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_order_status(client: TestClient):
    """Test case for update_order_status

    Изменение статуса одного заказа
    """
    update_order_status_request = {"order":{"delivery":{"dates":{"real_delivery_date":"2000-01-23"}},"substatus":"RESERVATION_EXPIRED","status":"PLACING"}}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/orders/{orderId}/status".format(campaignId=56, orderId=56),
    #    headers=headers,
    #    json=update_order_status_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_order_statuses(client: TestClient):
    """Test case for update_order_statuses

    Изменение статусов нескольких заказов
    """
    update_order_statuses_request = {"orders":[{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/orders/status-update".format(campaignId=56),
    #    headers=headers,
    #    json=update_order_statuses_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

