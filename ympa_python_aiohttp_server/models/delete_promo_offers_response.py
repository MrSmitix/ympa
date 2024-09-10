# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.api_response_status_type import ApiResponseStatusType
from ympa_python_aiohttp_server.models.delete_promo_offers_result_dto import DeletePromoOffersResultDTO
from ympa_python_aiohttp_server import util


class DeletePromoOffersResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status: ApiResponseStatusType=None, result: DeletePromoOffersResultDTO=None):
        """DeletePromoOffersResponse - a model defined in OpenAPI

        :param status: The status of this DeletePromoOffersResponse.
        :param result: The result of this DeletePromoOffersResponse.
        """
        self.openapi_types = {
            'status': ApiResponseStatusType,
            'result': DeletePromoOffersResultDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt: dict) -> 'DeletePromoOffersResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The DeletePromoOffersResponse of this DeletePromoOffersResponse.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self):
        """Gets the status of this DeletePromoOffersResponse.


        :return: The status of this DeletePromoOffersResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this DeletePromoOffersResponse.


        :param status: The status of this DeletePromoOffersResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self):
        """Gets the result of this DeletePromoOffersResponse.


        :return: The result of this DeletePromoOffersResponse.
        :rtype: DeletePromoOffersResultDTO
        """
        return self._result

    @result.setter
    def result(self, result):
        """Sets the result of this DeletePromoOffersResponse.


        :param result: The result of this DeletePromoOffersResponse.
        :type result: DeletePromoOffersResultDTO
        """

        self._result = result
