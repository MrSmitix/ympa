# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.api_response_status_type import ApiResponseStatusType  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.get_suggested_offer_mappings_result_dto import GetSuggestedOfferMappingsResultDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class GetSuggestedOfferMappingsResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, status: ApiResponseStatusType=None, result: GetSuggestedOfferMappingsResultDTO=None):  # noqa: E501
        """GetSuggestedOfferMappingsResponse - a model defined in Swagger

        :param status: The status of this GetSuggestedOfferMappingsResponse.  # noqa: E501
        :type status: ApiResponseStatusType
        :param result: The result of this GetSuggestedOfferMappingsResponse.  # noqa: E501
        :type result: GetSuggestedOfferMappingsResultDTO
        """
        self.swagger_types = {
            'status': ApiResponseStatusType,
            'result': GetSuggestedOfferMappingsResultDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt) -> 'GetSuggestedOfferMappingsResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetSuggestedOfferMappingsResponse of this GetSuggestedOfferMappingsResponse.  # noqa: E501
        :rtype: GetSuggestedOfferMappingsResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> ApiResponseStatusType:
        """Gets the status of this GetSuggestedOfferMappingsResponse.


        :return: The status of this GetSuggestedOfferMappingsResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status: ApiResponseStatusType):
        """Sets the status of this GetSuggestedOfferMappingsResponse.


        :param status: The status of this GetSuggestedOfferMappingsResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self) -> GetSuggestedOfferMappingsResultDTO:
        """Gets the result of this GetSuggestedOfferMappingsResponse.


        :return: The result of this GetSuggestedOfferMappingsResponse.
        :rtype: GetSuggestedOfferMappingsResultDTO
        """
        return self._result

    @result.setter
    def result(self, result: GetSuggestedOfferMappingsResultDTO):
        """Sets the result of this GetSuggestedOfferMappingsResponse.


        :param result: The result of this GetSuggestedOfferMappingsResponse.
        :type result: GetSuggestedOfferMappingsResultDTO
        """

        self._result = result