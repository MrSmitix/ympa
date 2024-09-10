# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.api_response_status_type import ApiResponseStatusType
from ympa_python_aiohttp_server.models.get_offer_mappings_result_dto import GetOfferMappingsResultDTO
from ympa_python_aiohttp_server import util


class GetOfferMappingsResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status: ApiResponseStatusType=None, result: GetOfferMappingsResultDTO=None):
        """GetOfferMappingsResponse - a model defined in OpenAPI

        :param status: The status of this GetOfferMappingsResponse.
        :param result: The result of this GetOfferMappingsResponse.
        """
        self.openapi_types = {
            'status': ApiResponseStatusType,
            'result': GetOfferMappingsResultDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt: dict) -> 'GetOfferMappingsResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The GetOfferMappingsResponse of this GetOfferMappingsResponse.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self):
        """Gets the status of this GetOfferMappingsResponse.


        :return: The status of this GetOfferMappingsResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this GetOfferMappingsResponse.


        :param status: The status of this GetOfferMappingsResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self):
        """Gets the result of this GetOfferMappingsResponse.


        :return: The result of this GetOfferMappingsResponse.
        :rtype: GetOfferMappingsResultDTO
        """
        return self._result

    @result.setter
    def result(self, result):
        """Sets the result of this GetOfferMappingsResponse.


        :param result: The result of this GetOfferMappingsResponse.
        :type result: GetOfferMappingsResultDTO
        """

        self._result = result
