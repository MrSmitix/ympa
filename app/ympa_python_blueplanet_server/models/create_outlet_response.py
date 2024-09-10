# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.api_response_status_type import ApiResponseStatusType  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.outlet_response_dto import OutletResponseDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class CreateOutletResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, status: ApiResponseStatusType=None, result: OutletResponseDTO=None):  # noqa: E501
        """CreateOutletResponse - a model defined in Swagger

        :param status: The status of this CreateOutletResponse.  # noqa: E501
        :type status: ApiResponseStatusType
        :param result: The result of this CreateOutletResponse.  # noqa: E501
        :type result: OutletResponseDTO
        """
        self.swagger_types = {
            'status': ApiResponseStatusType,
            'result': OutletResponseDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt) -> 'CreateOutletResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateOutletResponse of this CreateOutletResponse.  # noqa: E501
        :rtype: CreateOutletResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> ApiResponseStatusType:
        """Gets the status of this CreateOutletResponse.


        :return: The status of this CreateOutletResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status: ApiResponseStatusType):
        """Sets the status of this CreateOutletResponse.


        :param status: The status of this CreateOutletResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self) -> OutletResponseDTO:
        """Gets the result of this CreateOutletResponse.


        :return: The result of this CreateOutletResponse.
        :rtype: OutletResponseDTO
        """
        return self._result

    @result.setter
    def result(self, result: OutletResponseDTO):
        """Sets the result of this CreateOutletResponse.


        :param result: The result of this CreateOutletResponse.
        :type result: OutletResponseDTO
        """

        self._result = result
