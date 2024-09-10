# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.api_response_status_type import ApiResponseStatusType
from ympa_python_aiohttp_server.models.get_promos_result_dto import GetPromosResultDTO
from ympa_python_aiohttp_server import util


class GetPromosResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status: ApiResponseStatusType=None, result: GetPromosResultDTO=None):
        """GetPromosResponse - a model defined in OpenAPI

        :param status: The status of this GetPromosResponse.
        :param result: The result of this GetPromosResponse.
        """
        self.openapi_types = {
            'status': ApiResponseStatusType,
            'result': GetPromosResultDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt: dict) -> 'GetPromosResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The GetPromosResponse of this GetPromosResponse.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self):
        """Gets the status of this GetPromosResponse.


        :return: The status of this GetPromosResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this GetPromosResponse.


        :param status: The status of this GetPromosResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self):
        """Gets the result of this GetPromosResponse.


        :return: The result of this GetPromosResponse.
        :rtype: GetPromosResultDTO
        """
        return self._result

    @result.setter
    def result(self, result):
        """Sets the result of this GetPromosResponse.


        :param result: The result of this GetPromosResponse.
        :type result: GetPromosResultDTO
        """

        self._result = result
