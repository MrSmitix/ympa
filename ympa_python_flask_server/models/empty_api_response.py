from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType
from ympa_python_flask_server import util

from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType  # noqa: E501

class EmptyApiResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status=None):  # noqa: E501
        """EmptyApiResponse - a model defined in OpenAPI

        :param status: The status of this EmptyApiResponse.  # noqa: E501
        :type status: ApiResponseStatusType
        """
        self.openapi_types = {
            'status': ApiResponseStatusType
        }

        self.attribute_map = {
            'status': 'status'
        }

        self._status = status

    @classmethod
    def from_dict(cls, dikt) -> 'EmptyApiResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The EmptyApiResponse of this EmptyApiResponse.  # noqa: E501
        :rtype: EmptyApiResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> ApiResponseStatusType:
        """Gets the status of this EmptyApiResponse.


        :return: The status of this EmptyApiResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status: ApiResponseStatusType):
        """Sets the status of this EmptyApiResponse.


        :param status: The status of this EmptyApiResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status
