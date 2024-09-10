# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.api_response_status_type import ApiResponseStatusType  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.order_business_documents_dto import OrderBusinessDocumentsDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class GetBusinessDocumentsInfoResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, status: ApiResponseStatusType=None, result: OrderBusinessDocumentsDTO=None):  # noqa: E501
        """GetBusinessDocumentsInfoResponse - a model defined in Swagger

        :param status: The status of this GetBusinessDocumentsInfoResponse.  # noqa: E501
        :type status: ApiResponseStatusType
        :param result: The result of this GetBusinessDocumentsInfoResponse.  # noqa: E501
        :type result: OrderBusinessDocumentsDTO
        """
        self.swagger_types = {
            'status': ApiResponseStatusType,
            'result': OrderBusinessDocumentsDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt) -> 'GetBusinessDocumentsInfoResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetBusinessDocumentsInfoResponse of this GetBusinessDocumentsInfoResponse.  # noqa: E501
        :rtype: GetBusinessDocumentsInfoResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> ApiResponseStatusType:
        """Gets the status of this GetBusinessDocumentsInfoResponse.


        :return: The status of this GetBusinessDocumentsInfoResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status: ApiResponseStatusType):
        """Sets the status of this GetBusinessDocumentsInfoResponse.


        :param status: The status of this GetBusinessDocumentsInfoResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self) -> OrderBusinessDocumentsDTO:
        """Gets the result of this GetBusinessDocumentsInfoResponse.


        :return: The result of this GetBusinessDocumentsInfoResponse.
        :rtype: OrderBusinessDocumentsDTO
        """
        return self._result

    @result.setter
    def result(self, result: OrderBusinessDocumentsDTO):
        """Sets the result of this GetBusinessDocumentsInfoResponse.


        :param result: The result of this GetBusinessDocumentsInfoResponse.
        :type result: OrderBusinessDocumentsDTO
        """

        self._result = result