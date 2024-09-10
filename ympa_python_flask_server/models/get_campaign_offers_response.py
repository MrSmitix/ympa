from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType
from ympa_python_flask_server.models.get_campaign_offers_result_dto import GetCampaignOffersResultDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType  # noqa: E501
from ympa_python_flask_server.models.get_campaign_offers_result_dto import GetCampaignOffersResultDTO  # noqa: E501

class GetCampaignOffersResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status=None, result=None):  # noqa: E501
        """GetCampaignOffersResponse - a model defined in OpenAPI

        :param status: The status of this GetCampaignOffersResponse.  # noqa: E501
        :type status: ApiResponseStatusType
        :param result: The result of this GetCampaignOffersResponse.  # noqa: E501
        :type result: GetCampaignOffersResultDTO
        """
        self.openapi_types = {
            'status': ApiResponseStatusType,
            'result': GetCampaignOffersResultDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt) -> 'GetCampaignOffersResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetCampaignOffersResponse of this GetCampaignOffersResponse.  # noqa: E501
        :rtype: GetCampaignOffersResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> ApiResponseStatusType:
        """Gets the status of this GetCampaignOffersResponse.


        :return: The status of this GetCampaignOffersResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status: ApiResponseStatusType):
        """Sets the status of this GetCampaignOffersResponse.


        :param status: The status of this GetCampaignOffersResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self) -> GetCampaignOffersResultDTO:
        """Gets the result of this GetCampaignOffersResponse.


        :return: The result of this GetCampaignOffersResponse.
        :rtype: GetCampaignOffersResultDTO
        """
        return self._result

    @result.setter
    def result(self, result: GetCampaignOffersResultDTO):
        """Sets the result of this GetCampaignOffersResponse.


        :param result: The result of this GetCampaignOffersResponse.
        :type result: GetCampaignOffersResultDTO
        """

        self._result = result