# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.api_response_status_type import ApiResponseStatusType  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.offer_mapping_suggestions_list_dto import OfferMappingSuggestionsListDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class GetSuggestedOfferMappingEntriesResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, status: ApiResponseStatusType=None, result: OfferMappingSuggestionsListDTO=None):  # noqa: E501
        """GetSuggestedOfferMappingEntriesResponse - a model defined in Swagger

        :param status: The status of this GetSuggestedOfferMappingEntriesResponse.  # noqa: E501
        :type status: ApiResponseStatusType
        :param result: The result of this GetSuggestedOfferMappingEntriesResponse.  # noqa: E501
        :type result: OfferMappingSuggestionsListDTO
        """
        self.swagger_types = {
            'status': ApiResponseStatusType,
            'result': OfferMappingSuggestionsListDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt) -> 'GetSuggestedOfferMappingEntriesResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetSuggestedOfferMappingEntriesResponse of this GetSuggestedOfferMappingEntriesResponse.  # noqa: E501
        :rtype: GetSuggestedOfferMappingEntriesResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> ApiResponseStatusType:
        """Gets the status of this GetSuggestedOfferMappingEntriesResponse.


        :return: The status of this GetSuggestedOfferMappingEntriesResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status: ApiResponseStatusType):
        """Sets the status of this GetSuggestedOfferMappingEntriesResponse.


        :param status: The status of this GetSuggestedOfferMappingEntriesResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self) -> OfferMappingSuggestionsListDTO:
        """Gets the result of this GetSuggestedOfferMappingEntriesResponse.


        :return: The result of this GetSuggestedOfferMappingEntriesResponse.
        :rtype: OfferMappingSuggestionsListDTO
        """
        return self._result

    @result.setter
    def result(self, result: OfferMappingSuggestionsListDTO):
        """Sets the result of this GetSuggestedOfferMappingEntriesResponse.


        :param result: The result of this GetSuggestedOfferMappingEntriesResponse.
        :type result: OfferMappingSuggestionsListDTO
        """

        self._result = result
