# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.ympa_python_blueplanet_server.models.accept_order_cancellation_request import AcceptOrderCancellationRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.empty_api_response import EmptyApiResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_order_response import GetOrderResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_orders_response import GetOrdersResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.order_buyer_type import OrderBuyerType  # noqa: E501
from app.ympa_python_blueplanet_server.models.order_delivery_dispatch_type import OrderDeliveryDispatchType  # noqa: E501
from app.ympa_python_blueplanet_server.models.order_status_type import OrderStatusType  # noqa: E501
from app.ympa_python_blueplanet_server.models.order_substatus_type import OrderSubstatusType  # noqa: E501
from app.ympa_python_blueplanet_server.models.provide_order_digital_codes_request import ProvideOrderDigitalCodesRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.provide_order_item_identifiers_request import ProvideOrderItemIdentifiersRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.provide_order_item_identifiers_response import ProvideOrderItemIdentifiersResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.set_order_box_layout_request import SetOrderBoxLayoutRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.set_order_box_layout_response import SetOrderBoxLayoutResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.set_order_shipment_boxes_request import SetOrderShipmentBoxesRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.set_order_shipment_boxes_response import SetOrderShipmentBoxesResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.update_order_item_request import UpdateOrderItemRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.update_order_status_request import UpdateOrderStatusRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.update_order_status_response import UpdateOrderStatusResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.update_order_statuses_request import UpdateOrderStatusesRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.update_order_statuses_response import UpdateOrderStatusesResponse  # noqa: E501
from ympa_python_blueplanet_server.test import BaseTestCase


class TestOrdersController(BaseTestCase):
    """OrdersController integration test stubs"""

    def test_accept_order_cancellation(self):
        """Test case for accept_order_cancellation

        Отмена заказа покупателем
        """
        body = {"reason":"ORDER_DELIVERED","accepted":True}
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/cancellation/accept'.format(campaign_id=56, order_id=56),
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_order(self):
        """Test case for get_order

        Информация об одном заказе
        """
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}'.format(campaign_id=56, order_id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_orders(self):
        """Test case for get_orders

        Информация о нескольких заказах
        """
        query_string = [('order_ids', [56]),
                        ('status', [ympa_python_blueplanet_server.OrderStatusType()]),
                        ('substatus', [ympa_python_blueplanet_server.OrderSubstatusType()]),
                        ('from_date', '2013-10-20'),
                        ('to_date', '2013-10-20'),
                        ('supplier_shipment_date_from', '2013-10-20'),
                        ('supplier_shipment_date_to', '2013-10-20'),
                        ('updated_at_from', '2013-10-20T19:20:30+01:00'),
                        ('updated_at_to', '2013-10-20T19:20:30+01:00'),
                        ('dispatch_type', ympa_python_blueplanet_server.OrderDeliveryDispatchType()),
                        ('fake', False),
                        ('has_cis', False),
                        ('only_waiting_for_cancellation_approve', False),
                        ('only_estimated_delivery', False),
                        ('buyer_type', ympa_python_blueplanet_server.OrderBuyerType()),
                        ('page', 1),
                        ('page_size', 56),
                        ('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        response = self.client.open(
            '/campaigns/{campaign_id}/orders'.format(campaign_id=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_provide_order_digital_codes(self):
        """Test case for provide_order_digital_codes

        Передача ключей цифровых товаров
        """
        body = {"items":[{"activate_till":"2000-01-23","code":"code","slip":"slip","id":0},{"activate_till":"2000-01-23","code":"code","slip":"slip","id":0}]}
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/deliverDigitalGoods'.format(campaign_id=56, order_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_provide_order_item_identifiers(self):
        """Test case for provide_order_item_identifiers

        Передача кодов маркировки единиц товара
        """
        body = {"items":[{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0},{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0}]}
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/identifiers'.format(campaign_id=56, order_id=56),
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_order_box_layout(self):
        """Test case for set_order_box_layout

        Подготовка заказа
        """
        body = {"boxes":[{"items":[{"partialCount":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"fullCount":1},{"partialCount":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"fullCount":1}]},{"items":[{"partialCount":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"fullCount":1},{"partialCount":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"fullCount":1}]}],"allowRemove":False}
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/boxes'.format(campaign_id=56, order_id=56),
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_order_shipment_boxes(self):
        """Test case for set_order_shipment_boxes

        Передача количества грузовых мест в заказе
        """
        body = {"boxes":[{"fulfilmentId":"fulfilmentId","id":0},{"fulfilmentId":"fulfilmentId","id":0}]}
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/delivery/shipments/{shipment_id}/boxes'.format(campaign_id=56, order_id=56, shipment_id=56),
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_order_items(self):
        """Test case for update_order_items

        Удаление товара из заказа или уменьшение числа единиц
        """
        body = {"reason":"PARTNER_REQUESTED_REMOVE","items":[{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"count":0,"id":0},{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"count":0,"id":0}]}
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/items'.format(campaign_id=56, order_id=56),
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_order_status(self):
        """Test case for update_order_status

        Изменение статуса одного заказа
        """
        body = {"order":{"delivery":{"dates":{"realDeliveryDate":"2000-01-23"}},"substatus":"RESERVATION_EXPIRED","status":"PLACING"}}
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/status'.format(campaign_id=56, order_id=56),
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_order_statuses(self):
        """Test case for update_order_statuses

        Изменение статусов нескольких заказов
        """
        body = {"orders":[{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"}]}
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/status-update'.format(campaign_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
