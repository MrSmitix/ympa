import unittest

from flask import json

from ympa_python_flask_server.models.accept_order_cancellation_request import AcceptOrderCancellationRequest  # noqa: E501
from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.empty_api_response import EmptyApiResponse  # noqa: E501
from ympa_python_flask_server.models.get_order_response import GetOrderResponse  # noqa: E501
from ympa_python_flask_server.models.get_orders_response import GetOrdersResponse  # noqa: E501
from ympa_python_flask_server.models.order_buyer_type import OrderBuyerType  # noqa: E501
from ympa_python_flask_server.models.order_delivery_dispatch_type import OrderDeliveryDispatchType  # noqa: E501
from ympa_python_flask_server.models.order_status_type import OrderStatusType  # noqa: E501
from ympa_python_flask_server.models.order_substatus_type import OrderSubstatusType  # noqa: E501
from ympa_python_flask_server.models.provide_order_digital_codes_request import ProvideOrderDigitalCodesRequest  # noqa: E501
from ympa_python_flask_server.models.provide_order_item_identifiers_request import ProvideOrderItemIdentifiersRequest  # noqa: E501
from ympa_python_flask_server.models.provide_order_item_identifiers_response import ProvideOrderItemIdentifiersResponse  # noqa: E501
from ympa_python_flask_server.models.set_order_box_layout_request import SetOrderBoxLayoutRequest  # noqa: E501
from ympa_python_flask_server.models.set_order_box_layout_response import SetOrderBoxLayoutResponse  # noqa: E501
from ympa_python_flask_server.models.set_order_shipment_boxes_request import SetOrderShipmentBoxesRequest  # noqa: E501
from ympa_python_flask_server.models.set_order_shipment_boxes_response import SetOrderShipmentBoxesResponse  # noqa: E501
from ympa_python_flask_server.models.update_order_item_request import UpdateOrderItemRequest  # noqa: E501
from ympa_python_flask_server.models.update_order_status_request import UpdateOrderStatusRequest  # noqa: E501
from ympa_python_flask_server.models.update_order_status_response import UpdateOrderStatusResponse  # noqa: E501
from ympa_python_flask_server.models.update_order_statuses_request import UpdateOrderStatusesRequest  # noqa: E501
from ympa_python_flask_server.models.update_order_statuses_response import UpdateOrderStatusesResponse  # noqa: E501
from ympa_python_flask_server.test import BaseTestCase


class TestOrdersController(BaseTestCase):
    """OrdersController integration test stubs"""

    def test_accept_order_cancellation(self):
        """Test case for accept_order_cancellation

        Отмена заказа покупателем
        """
        accept_order_cancellation_request = {"reason":"ORDER_DELIVERED","accepted":True}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/cancellation/accept'.format(campaign_id=56, order_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(accept_order_cancellation_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_order(self):
        """Test case for get_order

        Информация об одном заказе
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}'.format(campaign_id=56, order_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_orders(self):
        """Test case for get_orders

        Информация о нескольких заказах
        """
        query_string = [('orderIds', [56]),
                        ('status', [ympa_python_flask_server.OrderStatusType()]),
                        ('substatus', [ympa_python_flask_server.OrderSubstatusType()]),
                        ('fromDate', '2013-10-20'),
                        ('toDate', '2013-10-20'),
                        ('supplierShipmentDateFrom', '2013-10-20'),
                        ('supplierShipmentDateTo', '2013-10-20'),
                        ('updatedAtFrom', '2013-10-20T19:20:30+01:00'),
                        ('updatedAtTo', '2013-10-20T19:20:30+01:00'),
                        ('dispatchType', ympa_python_flask_server.OrderDeliveryDispatchType()),
                        ('fake', False),
                        ('hasCis', False),
                        ('onlyWaitingForCancellationApprove', False),
                        ('onlyEstimatedDelivery', False),
                        ('buyerType', ympa_python_flask_server.OrderBuyerType()),
                        ('page', 1),
                        ('pageSize', 56),
                        ('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders'.format(campaign_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_provide_order_digital_codes(self):
        """Test case for provide_order_digital_codes

        Передача ключей цифровых товаров
        """
        provide_order_digital_codes_request = {"items":[{"activate_till":"2000-01-23","code":"code","slip":"slip","id":0},{"activate_till":"2000-01-23","code":"code","slip":"slip","id":0}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/deliverDigitalGoods'.format(campaign_id=56, order_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(provide_order_digital_codes_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_provide_order_item_identifiers(self):
        """Test case for provide_order_item_identifiers

        Передача кодов маркировки единиц товара
        """
        provide_order_item_identifiers_request = {"items":[{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0},{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/identifiers'.format(campaign_id=56, order_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(provide_order_item_identifiers_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_order_box_layout(self):
        """Test case for set_order_box_layout

        Подготовка заказа
        """
        set_order_box_layout_request = {"boxes":[{"items":[{"partialCount":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"fullCount":1},{"partialCount":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"fullCount":1}]},{"items":[{"partialCount":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"fullCount":1},{"partialCount":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"fullCount":1}]}],"allowRemove":False}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/boxes'.format(campaign_id=56, order_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(set_order_box_layout_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_order_shipment_boxes(self):
        """Test case for set_order_shipment_boxes

        Передача количества грузовых мест в заказе
        """
        set_order_shipment_boxes_request = {"boxes":[{"fulfilmentId":"fulfilmentId","id":0},{"fulfilmentId":"fulfilmentId","id":0}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/delivery/shipments/{shipment_id}/boxes'.format(campaign_id=56, order_id=56, shipment_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(set_order_shipment_boxes_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_order_items(self):
        """Test case for update_order_items

        Удаление товара из заказа или уменьшение числа единиц
        """
        update_order_item_request = {"reason":"PARTNER_REQUESTED_REMOVE","items":[{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"count":0,"id":0},{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"count":0,"id":0}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/items'.format(campaign_id=56, order_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(update_order_item_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_order_status(self):
        """Test case for update_order_status

        Изменение статуса одного заказа
        """
        update_order_status_request = {"order":{"delivery":{"dates":{"realDeliveryDate":"2000-01-23"}},"substatus":"RESERVATION_EXPIRED","status":"PLACING"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/status'.format(campaign_id=56, order_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(update_order_status_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_order_statuses(self):
        """Test case for update_order_statuses

        Изменение статусов нескольких заказов
        """
        update_order_statuses_request = {"orders":[{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/status-update'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(update_order_statuses_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
