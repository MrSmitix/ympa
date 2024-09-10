from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType
from ympa_python_flask_server.models.offer_price_by_offer_ids_list_response_dto import OfferPriceByOfferIdsListResponseDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType  # noqa: E501
from ympa_python_flask_server.models.offer_price_by_offer_ids_list_response_dto import OfferPriceByOfferIdsListResponseDTO  # noqa: E501

class GetPricesByOfferIdsResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status=None, result=None):  # noqa: E501
        """GetPricesByOfferIdsResponse - a model defined in OpenAPI

        :param status: The status of this GetPricesByOfferIdsResponse.  # noqa: E501
        :type status: ApiResponseStatusType
        :param result: The result of this GetPricesByOfferIdsResponse.  # noqa: E501
        :type result: OfferPriceByOfferIdsListResponseDTO
        """
        self.openapi_types = {
            'status': ApiResponseStatusType,
            'result': OfferPriceByOfferIdsListResponseDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt) -> 'GetPricesByOfferIdsResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetPricesByOfferIdsResponse of this GetPricesByOfferIdsResponse.  # noqa: E501
        :rtype: GetPricesByOfferIdsResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> ApiResponseStatusType:
        """Gets the status of this GetPricesByOfferIdsResponse.


        :return: The status of this GetPricesByOfferIdsResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status: ApiResponseStatusType):
        """Sets the status of this GetPricesByOfferIdsResponse.


        :param status: The status of this GetPricesByOfferIdsResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self) -> OfferPriceByOfferIdsListResponseDTO:
        """Gets the result of this GetPricesByOfferIdsResponse.


        :return: The result of this GetPricesByOfferIdsResponse.
        :rtype: OfferPriceByOfferIdsListResponseDTO
        """
        return self._result

    @result.setter
    def result(self, result: OfferPriceByOfferIdsListResponseDTO):
        """Sets the result of this GetPricesByOfferIdsResponse.


        :param result: The result of this GetPricesByOfferIdsResponse.
        :type result: OfferPriceByOfferIdsListResponseDTO
        """

        self._result = result
