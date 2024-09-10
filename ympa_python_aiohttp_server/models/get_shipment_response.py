# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.api_response_status_type import ApiResponseStatusType
from ympa_python_aiohttp_server.models.shipment_dto import ShipmentDTO
from ympa_python_aiohttp_server import util


class GetShipmentResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status: ApiResponseStatusType=None, result: ShipmentDTO=None):
        """GetShipmentResponse - a model defined in OpenAPI

        :param status: The status of this GetShipmentResponse.
        :param result: The result of this GetShipmentResponse.
        """
        self.openapi_types = {
            'status': ApiResponseStatusType,
            'result': ShipmentDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt: dict) -> 'GetShipmentResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The GetShipmentResponse of this GetShipmentResponse.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self):
        """Gets the status of this GetShipmentResponse.


        :return: The status of this GetShipmentResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this GetShipmentResponse.


        :param status: The status of this GetShipmentResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self):
        """Gets the result of this GetShipmentResponse.


        :return: The result of this GetShipmentResponse.
        :rtype: ShipmentDTO
        """
        return self._result

    @result.setter
    def result(self, result):
        """Sets the result of this GetShipmentResponse.


        :param result: The result of this GetShipmentResponse.
        :type result: ShipmentDTO
        """

        self._result = result
