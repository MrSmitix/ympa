from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType
from ympa_python_flask_server.models.warehouses_dto import WarehousesDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType  # noqa: E501
from ympa_python_flask_server.models.warehouses_dto import WarehousesDTO  # noqa: E501

class GetWarehousesResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status=None, result=None):  # noqa: E501
        """GetWarehousesResponse - a model defined in OpenAPI

        :param status: The status of this GetWarehousesResponse.  # noqa: E501
        :type status: ApiResponseStatusType
        :param result: The result of this GetWarehousesResponse.  # noqa: E501
        :type result: WarehousesDTO
        """
        self.openapi_types = {
            'status': ApiResponseStatusType,
            'result': WarehousesDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt) -> 'GetWarehousesResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetWarehousesResponse of this GetWarehousesResponse.  # noqa: E501
        :rtype: GetWarehousesResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> ApiResponseStatusType:
        """Gets the status of this GetWarehousesResponse.


        :return: The status of this GetWarehousesResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status: ApiResponseStatusType):
        """Sets the status of this GetWarehousesResponse.


        :param status: The status of this GetWarehousesResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self) -> WarehousesDTO:
        """Gets the result of this GetWarehousesResponse.


        :return: The result of this GetWarehousesResponse.
        :rtype: WarehousesDTO
        """
        return self._result

    @result.setter
    def result(self, result: WarehousesDTO):
        """Sets the result of this GetWarehousesResponse.


        :param result: The result of this GetWarehousesResponse.
        :type result: WarehousesDTO
        """

        self._result = result