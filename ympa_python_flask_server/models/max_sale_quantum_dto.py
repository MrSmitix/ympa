from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class MaxSaleQuantumDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, name=None, max_sale_quantum=None):  # noqa: E501
        """MaxSaleQuantumDTO - a model defined in OpenAPI

        :param id: The id of this MaxSaleQuantumDTO.  # noqa: E501
        :type id: int
        :param name: The name of this MaxSaleQuantumDTO.  # noqa: E501
        :type name: str
        :param max_sale_quantum: The max_sale_quantum of this MaxSaleQuantumDTO.  # noqa: E501
        :type max_sale_quantum: int
        """
        self.openapi_types = {
            'id': int,
            'name': str,
            'max_sale_quantum': int
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'max_sale_quantum': 'maxSaleQuantum'
        }

        self._id = id
        self._name = name
        self._max_sale_quantum = max_sale_quantum

    @classmethod
    def from_dict(cls, dikt) -> 'MaxSaleQuantumDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MaxSaleQuantumDTO of this MaxSaleQuantumDTO.  # noqa: E501
        :rtype: MaxSaleQuantumDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """Gets the id of this MaxSaleQuantumDTO.

        Идентификатор категории.  # noqa: E501

        :return: The id of this MaxSaleQuantumDTO.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this MaxSaleQuantumDTO.

        Идентификатор категории.  # noqa: E501

        :param id: The id of this MaxSaleQuantumDTO.
        :type id: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this MaxSaleQuantumDTO.

        Название категории.  # noqa: E501

        :return: The name of this MaxSaleQuantumDTO.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this MaxSaleQuantumDTO.

        Название категории.  # noqa: E501

        :param name: The name of this MaxSaleQuantumDTO.
        :type name: str
        """

        self._name = name

    @property
    def max_sale_quantum(self) -> int:
        """Gets the max_sale_quantum of this MaxSaleQuantumDTO.

        Лимит на установку кванта и минимального количества товаров.  # noqa: E501

        :return: The max_sale_quantum of this MaxSaleQuantumDTO.
        :rtype: int
        """
        return self._max_sale_quantum

    @max_sale_quantum.setter
    def max_sale_quantum(self, max_sale_quantum: int):
        """Sets the max_sale_quantum of this MaxSaleQuantumDTO.

        Лимит на установку кванта и минимального количества товаров.  # noqa: E501

        :param max_sale_quantum: The max_sale_quantum of this MaxSaleQuantumDTO.
        :type max_sale_quantum: int
        """

        self._max_sale_quantum = max_sale_quantum
