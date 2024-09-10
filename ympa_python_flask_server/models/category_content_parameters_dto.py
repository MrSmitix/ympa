from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.category_parameter_dto import CategoryParameterDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.category_parameter_dto import CategoryParameterDTO  # noqa: E501

class CategoryContentParametersDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, category_id=None, parameters=None):  # noqa: E501
        """CategoryContentParametersDTO - a model defined in OpenAPI

        :param category_id: The category_id of this CategoryContentParametersDTO.  # noqa: E501
        :type category_id: int
        :param parameters: The parameters of this CategoryContentParametersDTO.  # noqa: E501
        :type parameters: List[CategoryParameterDTO]
        """
        self.openapi_types = {
            'category_id': int,
            'parameters': List[CategoryParameterDTO]
        }

        self.attribute_map = {
            'category_id': 'categoryId',
            'parameters': 'parameters'
        }

        self._category_id = category_id
        self._parameters = parameters

    @classmethod
    def from_dict(cls, dikt) -> 'CategoryContentParametersDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CategoryContentParametersDTO of this CategoryContentParametersDTO.  # noqa: E501
        :rtype: CategoryContentParametersDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def category_id(self) -> int:
        """Gets the category_id of this CategoryContentParametersDTO.

        Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  # noqa: E501

        :return: The category_id of this CategoryContentParametersDTO.
        :rtype: int
        """
        return self._category_id

    @category_id.setter
    def category_id(self, category_id: int):
        """Sets the category_id of this CategoryContentParametersDTO.

        Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  # noqa: E501

        :param category_id: The category_id of this CategoryContentParametersDTO.
        :type category_id: int
        """
        if category_id is None:
            raise ValueError("Invalid value for `category_id`, must not be `None`")  # noqa: E501

        self._category_id = category_id

    @property
    def parameters(self) -> List[CategoryParameterDTO]:
        """Gets the parameters of this CategoryContentParametersDTO.

        Список характеристик.  # noqa: E501

        :return: The parameters of this CategoryContentParametersDTO.
        :rtype: List[CategoryParameterDTO]
        """
        return self._parameters

    @parameters.setter
    def parameters(self, parameters: List[CategoryParameterDTO]):
        """Sets the parameters of this CategoryContentParametersDTO.

        Список характеристик.  # noqa: E501

        :param parameters: The parameters of this CategoryContentParametersDTO.
        :type parameters: List[CategoryParameterDTO]
        """

        self._parameters = parameters