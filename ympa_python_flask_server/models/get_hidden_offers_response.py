from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType
from ympa_python_flask_server.models.get_hidden_offers_result_dto import GetHiddenOffersResultDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType  # noqa: E501
from ympa_python_flask_server.models.get_hidden_offers_result_dto import GetHiddenOffersResultDTO  # noqa: E501

class GetHiddenOffersResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status=None, result=None):  # noqa: E501
        """GetHiddenOffersResponse - a model defined in OpenAPI

        :param status: The status of this GetHiddenOffersResponse.  # noqa: E501
        :type status: ApiResponseStatusType
        :param result: The result of this GetHiddenOffersResponse.  # noqa: E501
        :type result: GetHiddenOffersResultDTO
        """
        self.openapi_types = {
            'status': ApiResponseStatusType,
            'result': GetHiddenOffersResultDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt) -> 'GetHiddenOffersResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetHiddenOffersResponse of this GetHiddenOffersResponse.  # noqa: E501
        :rtype: GetHiddenOffersResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> ApiResponseStatusType:
        """Gets the status of this GetHiddenOffersResponse.


        :return: The status of this GetHiddenOffersResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status: ApiResponseStatusType):
        """Sets the status of this GetHiddenOffersResponse.


        :param status: The status of this GetHiddenOffersResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self) -> GetHiddenOffersResultDTO:
        """Gets the result of this GetHiddenOffersResponse.


        :return: The result of this GetHiddenOffersResponse.
        :rtype: GetHiddenOffersResultDTO
        """
        return self._result

    @result.setter
    def result(self, result: GetHiddenOffersResultDTO):
        """Sets the result of this GetHiddenOffersResponse.


        :param result: The result of this GetHiddenOffersResponse.
        :type result: GetHiddenOffersResultDTO
        """

        self._result = result
