from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType
from ympa_python_flask_server.models.category_error_dto import CategoryErrorDTO
from ympa_python_flask_server.models.max_sale_quantum_dto import MaxSaleQuantumDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.api_response_status_type import ApiResponseStatusType  # noqa: E501
from ympa_python_flask_server.models.category_error_dto import CategoryErrorDTO  # noqa: E501
from ympa_python_flask_server.models.max_sale_quantum_dto import MaxSaleQuantumDTO  # noqa: E501

class GetCategoriesMaxSaleQuantumResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status=None, results=None, errors=None):  # noqa: E501
        """GetCategoriesMaxSaleQuantumResponse - a model defined in OpenAPI

        :param status: The status of this GetCategoriesMaxSaleQuantumResponse.  # noqa: E501
        :type status: ApiResponseStatusType
        :param results: The results of this GetCategoriesMaxSaleQuantumResponse.  # noqa: E501
        :type results: List[MaxSaleQuantumDTO]
        :param errors: The errors of this GetCategoriesMaxSaleQuantumResponse.  # noqa: E501
        :type errors: List[CategoryErrorDTO]
        """
        self.openapi_types = {
            'status': ApiResponseStatusType,
            'results': List[MaxSaleQuantumDTO],
            'errors': List[CategoryErrorDTO]
        }

        self.attribute_map = {
            'status': 'status',
            'results': 'results',
            'errors': 'errors'
        }

        self._status = status
        self._results = results
        self._errors = errors

    @classmethod
    def from_dict(cls, dikt) -> 'GetCategoriesMaxSaleQuantumResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetCategoriesMaxSaleQuantumResponse of this GetCategoriesMaxSaleQuantumResponse.  # noqa: E501
        :rtype: GetCategoriesMaxSaleQuantumResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> ApiResponseStatusType:
        """Gets the status of this GetCategoriesMaxSaleQuantumResponse.


        :return: The status of this GetCategoriesMaxSaleQuantumResponse.
        :rtype: ApiResponseStatusType
        """
        return self._status

    @status.setter
    def status(self, status: ApiResponseStatusType):
        """Sets the status of this GetCategoriesMaxSaleQuantumResponse.


        :param status: The status of this GetCategoriesMaxSaleQuantumResponse.
        :type status: ApiResponseStatusType
        """

        self._status = status

    @property
    def results(self) -> List[MaxSaleQuantumDTO]:
        """Gets the results of this GetCategoriesMaxSaleQuantumResponse.

        Категории и лимит на установку кванта и минимального количества товаров.  # noqa: E501

        :return: The results of this GetCategoriesMaxSaleQuantumResponse.
        :rtype: List[MaxSaleQuantumDTO]
        """
        return self._results

    @results.setter
    def results(self, results: List[MaxSaleQuantumDTO]):
        """Sets the results of this GetCategoriesMaxSaleQuantumResponse.

        Категории и лимит на установку кванта и минимального количества товаров.  # noqa: E501

        :param results: The results of this GetCategoriesMaxSaleQuantumResponse.
        :type results: List[MaxSaleQuantumDTO]
        """
        if results is None:
            raise ValueError("Invalid value for `results`, must not be `None`")  # noqa: E501

        self._results = results

    @property
    def errors(self) -> List[CategoryErrorDTO]:
        """Gets the errors of this GetCategoriesMaxSaleQuantumResponse.

        Ошибки, которые появились из-за переданных категорий.  # noqa: E501

        :return: The errors of this GetCategoriesMaxSaleQuantumResponse.
        :rtype: List[CategoryErrorDTO]
        """
        return self._errors

    @errors.setter
    def errors(self, errors: List[CategoryErrorDTO]):
        """Sets the errors of this GetCategoriesMaxSaleQuantumResponse.

        Ошибки, которые появились из-за переданных категорий.  # noqa: E501

        :param errors: The errors of this GetCategoriesMaxSaleQuantumResponse.
        :type errors: List[CategoryErrorDTO]
        """

        self._errors = errors
