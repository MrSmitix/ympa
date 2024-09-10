from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.api_error_dto import ApiErrorDTO
from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType
from ympa_python_flask_server import util

from ympa_python_flask_server.models.api_error_dto import ApiErrorDTO  # noqa: E501
from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType  # noqa: E501

class ApiClientDataErrorResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status=None, errors=None):  # noqa: E501
        """ApiClientDataErrorResponse - a model defined in OpenAPI

        :param status: The status of this ApiClientDataErrorResponse.  # noqa: E501
        :type status: ApiResponseStatusType
        :param errors: The errors of this ApiClientDataErrorResponse.  # noqa: E501
        :type errors: List[ApiErrorDTO]
        """
        self.openapi_types = {
            'status': ApiResponseStatusType,
            'errors': List[ApiErrorDTO]
        }

        self.attribute_map = {
            'status': 'status',
            'errors': 'errors'
        }

        self._status = status
        self._errors = errors

    @classmethod
    def from_dict(cls, dikt) -> 'ApiClientDataErrorResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ApiClientDataErrorResponse of this ApiClientDataErrorResponse.  # noqa: E501
        :rtype: ApiClientDataErrorResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> ApiResponseStatusType:
        """Gets the status of this ApiClientDataErrorResponse.


        :return: The status of this ApiClientDataErrorResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status: ApiResponseStatusType):
        """Sets the status of this ApiClientDataErrorResponse.


        :param status: The status of this ApiClientDataErrorResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def errors(self) -> List[ApiErrorDTO]:
        """Gets the errors of this ApiClientDataErrorResponse.

        Список ошибок.  # noqa: E501

        :return: The errors of this ApiClientDataErrorResponse.
        :rtype: List[ApiErrorDTO]
        """
        return self._errors

    @errors.setter
    def errors(self, errors: List[ApiErrorDTO]):
        """Sets the errors of this ApiClientDataErrorResponse.

        Список ошибок.  # noqa: E501

        :param errors: The errors of this ApiClientDataErrorResponse.
        :type errors: List[ApiErrorDTO]
        """

        self._errors = errors