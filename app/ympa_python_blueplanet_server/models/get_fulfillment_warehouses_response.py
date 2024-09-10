# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.api_response_status_type import ApiResponseStatusType  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.fulfillment_warehouses_dto import FulfillmentWarehousesDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class GetFulfillmentWarehousesResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, status: ApiResponseStatusType=None, result: FulfillmentWarehousesDTO=None):  # noqa: E501
        """GetFulfillmentWarehousesResponse - a model defined in Swagger

        :param status: The status of this GetFulfillmentWarehousesResponse.  # noqa: E501
        :type status: ApiResponseStatusType
        :param result: The result of this GetFulfillmentWarehousesResponse.  # noqa: E501
        :type result: FulfillmentWarehousesDTO
        """
        self.swagger_types = {
            'status': ApiResponseStatusType,
            'result': FulfillmentWarehousesDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt) -> 'GetFulfillmentWarehousesResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetFulfillmentWarehousesResponse of this GetFulfillmentWarehousesResponse.  # noqa: E501
        :rtype: GetFulfillmentWarehousesResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> ApiResponseStatusType:
        """Gets the status of this GetFulfillmentWarehousesResponse.


        :return: The status of this GetFulfillmentWarehousesResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status: ApiResponseStatusType):
        """Sets the status of this GetFulfillmentWarehousesResponse.


        :param status: The status of this GetFulfillmentWarehousesResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self) -> FulfillmentWarehousesDTO:
        """Gets the result of this GetFulfillmentWarehousesResponse.


        :return: The result of this GetFulfillmentWarehousesResponse.
        :rtype: FulfillmentWarehousesDTO
        """
        return self._result

    @result.setter
    def result(self, result: FulfillmentWarehousesDTO):
        """Sets the result of this GetFulfillmentWarehousesResponse.


        :param result: The result of this GetFulfillmentWarehousesResponse.
        :type result: FulfillmentWarehousesDTO
        """

        self._result = result