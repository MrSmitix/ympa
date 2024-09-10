# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.api_response_status_type import ApiResponseStatusType  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.suggest_prices_result_dto import SuggestPricesResultDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class SuggestPricesResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, status: ApiResponseStatusType=None, result: SuggestPricesResultDTO=None):  # noqa: E501
        """SuggestPricesResponse - a model defined in Swagger

        :param status: The status of this SuggestPricesResponse.  # noqa: E501
        :type status: ApiResponseStatusType
        :param result: The result of this SuggestPricesResponse.  # noqa: E501
        :type result: SuggestPricesResultDTO
        """
        self.swagger_types = {
            'status': ApiResponseStatusType,
            'result': SuggestPricesResultDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt) -> 'SuggestPricesResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SuggestPricesResponse of this SuggestPricesResponse.  # noqa: E501
        :rtype: SuggestPricesResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> ApiResponseStatusType:
        """Gets the status of this SuggestPricesResponse.


        :return: The status of this SuggestPricesResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status: ApiResponseStatusType):
        """Sets the status of this SuggestPricesResponse.


        :param status: The status of this SuggestPricesResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self) -> SuggestPricesResultDTO:
        """Gets the result of this SuggestPricesResponse.


        :return: The result of this SuggestPricesResponse.
        :rtype: SuggestPricesResultDTO
        """
        return self._result

    @result.setter
    def result(self, result: SuggestPricesResultDTO):
        """Sets the result of this SuggestPricesResponse.


        :param result: The result of this SuggestPricesResponse.
        :type result: SuggestPricesResultDTO
        """

        self._result = result
