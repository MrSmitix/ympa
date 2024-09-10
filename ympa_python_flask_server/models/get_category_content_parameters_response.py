from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType
from ympa_python_flask_server.models.category_content_parameters_dto import CategoryContentParametersDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType  # noqa: E501
from ympa_python_flask_server.models.category_content_parameters_dto import CategoryContentParametersDTO  # noqa: E501

class GetCategoryContentParametersResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status=None, result=None):  # noqa: E501
        """GetCategoryContentParametersResponse - a model defined in OpenAPI

        :param status: The status of this GetCategoryContentParametersResponse.  # noqa: E501
        :type status: ApiResponseStatusType
        :param result: The result of this GetCategoryContentParametersResponse.  # noqa: E501
        :type result: CategoryContentParametersDTO
        """
        self.openapi_types = {
            'status': ApiResponseStatusType,
            'result': CategoryContentParametersDTO
        }

        self.attribute_map = {
            'status': 'status',
            'result': 'result'
        }

        self._status = status
        self._result = result

    @classmethod
    def from_dict(cls, dikt) -> 'GetCategoryContentParametersResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetCategoryContentParametersResponse of this GetCategoryContentParametersResponse.  # noqa: E501
        :rtype: GetCategoryContentParametersResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> ApiResponseStatusType:
        """Gets the status of this GetCategoryContentParametersResponse.


        :return: The status of this GetCategoryContentParametersResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status: ApiResponseStatusType):
        """Sets the status of this GetCategoryContentParametersResponse.


        :param status: The status of this GetCategoryContentParametersResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def result(self) -> CategoryContentParametersDTO:
        """Gets the result of this GetCategoryContentParametersResponse.


        :return: The result of this GetCategoryContentParametersResponse.
        :rtype: CategoryContentParametersDTO
        """
        return self._result

    @result.setter
    def result(self, result: CategoryContentParametersDTO):
        """Sets the result of this GetCategoryContentParametersResponse.


        :param result: The result of this GetCategoryContentParametersResponse.
        :type result: CategoryContentParametersDTO
        """

        self._result = result