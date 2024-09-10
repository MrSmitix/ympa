# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.api_response_status_type import ApiResponseStatusType
from ympa_python_aiohttp_server.models.orders_shipment_info_dto import OrdersShipmentInfoDTO
from ympa_python_aiohttp_server import util


class GetShipmentOrdersInfoResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status: ApiResponseStatusType=None, result: OrdersShipmentInfoDTO=None):
        """GetShipmentOrdersInfoResponse - a model defined in OpenAPI

        :param status: The status of this GetShipmentOrdersInfoResponse.
        :param result: The result of this GetShipmentOrdersInfoResponse.
        """
        self.openapi_types = {
            'status': ApiResponseStatusType,
            'result': OrdersShipmentInfoDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt: dict) -> 'GetShipmentOrdersInfoResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The GetShipmentOrdersInfoResponse of this GetShipmentOrdersInfoResponse.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self):
        """Gets the status of this GetShipmentOrdersInfoResponse.


        :return: The status of this GetShipmentOrdersInfoResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this GetShipmentOrdersInfoResponse.


        :param status: The status of this GetShipmentOrdersInfoResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self):
        """Gets the result of this GetShipmentOrdersInfoResponse.


        :return: The result of this GetShipmentOrdersInfoResponse.
        :rtype: OrdersShipmentInfoDTO
        """
        return self._result

    @result.setter
    def result(self, result):
        """Sets the result of this GetShipmentOrdersInfoResponse.


        :param result: The result of this GetShipmentOrdersInfoResponse.
        :type result: OrdersShipmentInfoDTO
        """

        self._result = result
