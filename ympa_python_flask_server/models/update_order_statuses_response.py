from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType
from ympa_python_flask_server.models.update_order_statuses_dto import UpdateOrderStatusesDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType  # noqa: E501
from ympa_python_flask_server.models.update_order_statuses_dto import UpdateOrderStatusesDTO  # noqa: E501

class UpdateOrderStatusesResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status=None, result=None):  # noqa: E501
        """UpdateOrderStatusesResponse - a model defined in OpenAPI

        :param status: The status of this UpdateOrderStatusesResponse.  # noqa: E501
        :type status: ApiResponseStatusType
        :param result: The result of this UpdateOrderStatusesResponse.  # noqa: E501
        :type result: UpdateOrderStatusesDTO
        """
        self.openapi_types = {
            'status': ApiResponseStatusType,
            'result': UpdateOrderStatusesDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt) -> 'UpdateOrderStatusesResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UpdateOrderStatusesResponse of this UpdateOrderStatusesResponse.  # noqa: E501
        :rtype: UpdateOrderStatusesResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> ApiResponseStatusType:
        """Gets the status of this UpdateOrderStatusesResponse.


        :return: The status of this UpdateOrderStatusesResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status: ApiResponseStatusType):
        """Sets the status of this UpdateOrderStatusesResponse.


        :param status: The status of this UpdateOrderStatusesResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self) -> UpdateOrderStatusesDTO:
        """Gets the result of this UpdateOrderStatusesResponse.


        :return: The result of this UpdateOrderStatusesResponse.
        :rtype: UpdateOrderStatusesDTO
        """
        return self._result

    @result.setter
    def result(self, result: UpdateOrderStatusesDTO):
        """Sets the result of this UpdateOrderStatusesResponse.


        :param result: The result of this UpdateOrderStatusesResponse.
        :type result: UpdateOrderStatusesDTO
        """

        self._result = result
