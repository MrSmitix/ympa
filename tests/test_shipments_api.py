# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.confirm_shipment_request import ConfirmShipmentRequest  # noqa: F401
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_shipment_orders_info_response import GetShipmentOrdersInfoResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_shipment_response import GetShipmentResponse  # noqa: F401
from ympa_python_fastapi_server.models.search_shipments_request import SearchShipmentsRequest  # noqa: F401
from ympa_python_fastapi_server.models.search_shipments_response import SearchShipmentsResponse  # noqa: F401
from ympa_python_fastapi_server.models.set_shipment_pallets_count_request import SetShipmentPalletsCountRequest  # noqa: F401
from ympa_python_fastapi_server.models.shipment_pallet_label_page_format_type import ShipmentPalletLabelPageFormatType  # noqa: F401
from ympa_python_fastapi_server.models.transfer_orders_from_shipment_request import TransferOrdersFromShipmentRequest  # noqa: F401


def test_confirm_shipment(client: TestClient):
    """Test case for confirm_shipment

    Подтверждение отгрузки
    """
    confirm_shipment_request = {"external_shipment_id":"externalShipmentId"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm".format(campaignId=56, shipmentId=56),
    #    headers=headers,
    #    json=confirm_shipment_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_download_shipment_act(client: TestClient):
    """Test case for download_shipment_act

    Получение акта приема-передачи
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act".format(campaignId=56, shipmentId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_download_shipment_discrepancy_act(client: TestClient):
    """Test case for download_shipment_discrepancy_act

    Получение акта расхождений
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act".format(campaignId=56, shipmentId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_download_shipment_inbound_act(client: TestClient):
    """Test case for download_shipment_inbound_act

    Получение фактического акта приема-передачи
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act".format(campaignId=56, shipmentId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_download_shipment_pallet_labels(client: TestClient):
    """Test case for download_shipment_pallet_labels

    Ярлыки для доверительной приемки (FBS)
    """
    params = [("format", A8)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels".format(campaignId=56, shipmentId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_download_shipment_reception_transfer_act(client: TestClient):
    """Test case for download_shipment_reception_transfer_act

    Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
    """
    params = [("warehouse_id", 123123)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/shipments/reception-transfer-act".format(campaignId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_download_shipment_transportation_waybill(client: TestClient):
    """Test case for download_shipment_transportation_waybill

    Получение транспортной накладной
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill".format(campaignId=56, shipmentId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_shipment(client: TestClient):
    """Test case for get_shipment

    Получение информации об одной отгрузке
    """
    params = [("cancelled_orders", True)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}".format(campaignId=56, shipmentId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_shipment_orders_info(client: TestClient):
    """Test case for get_shipment_orders_info

    Получение информации о возможности печати ярлыков (FBS)
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info".format(campaignId=56, shipmentId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_search_shipments(client: TestClient):
    """Test case for search_shipments

    Получение информации о нескольких отгрузках
    """
    search_shipments_request = {"cancelled_orders":1,"date_to":"2000-01-23","statuses":["OUTBOUND_CREATED","OUTBOUND_CREATED"],"order_ids":[0,0],"date_from":"2000-01-23"}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/first-mile/shipments".format(campaignId=56),
    #    headers=headers,
    #    json=search_shipments_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_set_shipment_pallets_count(client: TestClient):
    """Test case for set_shipment_pallets_count

    Передача количества упаковок в отгрузке
    """
    set_shipment_pallets_count_request = {"places_count":0}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets".format(campaignId=56, shipmentId=56),
    #    headers=headers,
    #    json=set_shipment_pallets_count_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_transfer_orders_from_shipment(client: TestClient):
    """Test case for transfer_orders_from_shipment

    Перенос заказов в следующую отгрузку
    """
    transfer_orders_from_shipment_request = {"order_ids":[0,0,0,0,0]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer".format(campaignId=56, shipmentId=56),
    #    headers=headers,
    #    json=transfer_orders_from_shipment_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

