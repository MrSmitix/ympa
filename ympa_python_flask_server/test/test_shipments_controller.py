import unittest

from flask import json

from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.confirm_shipment_request import ConfirmShipmentRequest  # noqa: E501
from ympa_python_flask_server.models.empty_api_response import EmptyApiResponse  # noqa: E501
from ympa_python_flask_server.models.get_shipment_orders_info_response import GetShipmentOrdersInfoResponse  # noqa: E501
from ympa_python_flask_server.models.get_shipment_response import GetShipmentResponse  # noqa: E501
from ympa_python_flask_server.models.search_shipments_request import SearchShipmentsRequest  # noqa: E501
from ympa_python_flask_server.models.search_shipments_response import SearchShipmentsResponse  # noqa: E501
from ympa_python_flask_server.models.set_shipment_pallets_count_request import SetShipmentPalletsCountRequest  # noqa: E501
from ympa_python_flask_server.models.shipment_pallet_label_page_format_type import ShipmentPalletLabelPageFormatType  # noqa: E501
from ympa_python_flask_server.models.transfer_orders_from_shipment_request import TransferOrdersFromShipmentRequest  # noqa: E501
from ympa_python_flask_server.test import BaseTestCase


class TestShipmentsController(BaseTestCase):
    """ShipmentsController integration test stubs"""

    def test_confirm_shipment(self):
        """Test case for confirm_shipment

        Подтверждение отгрузки
        """
        confirm_shipment_request = {"externalShipmentId":"externalShipmentId"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/first-mile/shipments/{shipment_id}/confirm'.format(campaign_id=56, shipment_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(confirm_shipment_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_download_shipment_act(self):
        """Test case for download_shipment_act

        Получение акта приема-передачи
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/first-mile/shipments/{shipment_id}/act'.format(campaign_id=56, shipment_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_download_shipment_discrepancy_act(self):
        """Test case for download_shipment_discrepancy_act

        Получение акта расхождений
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/first-mile/shipments/{shipment_id}/discrepancy-act'.format(campaign_id=56, shipment_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_download_shipment_inbound_act(self):
        """Test case for download_shipment_inbound_act

        Получение фактического акта приема-передачи
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/first-mile/shipments/{shipment_id}/inbound-act'.format(campaign_id=56, shipment_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_download_shipment_pallet_labels(self):
        """Test case for download_shipment_pallet_labels

        Ярлыки для доверительной приемки (FBS)
        """
        query_string = [('format', A8)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/first-mile/shipments/{shipment_id}/pallet/labels'.format(campaign_id=56, shipment_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_download_shipment_reception_transfer_act(self):
        """Test case for download_shipment_reception_transfer_act

        Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
        """
        query_string = [('warehouse_id', 123123)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/shipments/reception-transfer-act'.format(campaign_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_download_shipment_transportation_waybill(self):
        """Test case for download_shipment_transportation_waybill

        Получение транспортной накладной
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/first-mile/shipments/{shipment_id}/transportation-waybill'.format(campaign_id=56, shipment_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_shipment(self):
        """Test case for get_shipment

        Получение информации об одной отгрузке
        """
        query_string = [('cancelledOrders', True)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/first-mile/shipments/{shipment_id}'.format(campaign_id=56, shipment_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_shipment_orders_info(self):
        """Test case for get_shipment_orders_info

        Получение информации о возможности печати ярлыков (FBS)
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/first-mile/shipments/{shipment_id}/orders/info'.format(campaign_id=56, shipment_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_shipments(self):
        """Test case for search_shipments

        Получение информации о нескольких отгрузках
        """
        search_shipments_request = {"cancelledOrders":True,"dateTo":"2000-01-23","statuses":["OUTBOUND_CREATED","OUTBOUND_CREATED"],"orderIds":[0,0],"dateFrom":"2000-01-23"}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/first-mile/shipments'.format(campaign_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(search_shipments_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_shipment_pallets_count(self):
        """Test case for set_shipment_pallets_count

        Передача количества упаковок в отгрузке
        """
        set_shipment_pallets_count_request = {"placesCount":0}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/first-mile/shipments/{shipment_id}/pallets'.format(campaign_id=56, shipment_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(set_shipment_pallets_count_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_transfer_orders_from_shipment(self):
        """Test case for transfer_orders_from_shipment

        Перенос заказов в следующую отгрузку
        """
        transfer_orders_from_shipment_request = {"orderIds":[0,0,0,0,0]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/first-mile/shipments/{shipment_id}/orders/transfer'.format(campaign_id=56, shipment_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(transfer_orders_from_shipment_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
