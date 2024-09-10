# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server import util


class UnitDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, name: str=None, full_name: str=None):
        """UnitDTO - a model defined in OpenAPI

        :param id: The id of this UnitDTO.
        :param name: The name of this UnitDTO.
        :param full_name: The full_name of this UnitDTO.
        """
        self.openapi_types = {
            'id': int,
            'name': str,
            'full_name': str
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'full_name': 'fullName'
        }

        self._id = id
        self._name = name
        self._full_name = full_name

    @classmethod
    def from_dict(cls, dikt: dict) -> 'UnitDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The UnitDTO of this UnitDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this UnitDTO.

        Идентификатор единицы измерения.

        :return: The id of this UnitDTO.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this UnitDTO.

        Идентификатор единицы измерения.

        :param id: The id of this UnitDTO.
        :type id: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")

        self._id = id

    @property
    def name(self):
        """Gets the name of this UnitDTO.

        Сокращенное название единицы измерения.

        :return: The name of this UnitDTO.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this UnitDTO.

        Сокращенное название единицы измерения.

        :param name: The name of this UnitDTO.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")

        self._name = name

    @property
    def full_name(self):
        """Gets the full_name of this UnitDTO.

        Полное название единицы измерения.

        :return: The full_name of this UnitDTO.
        :rtype: str
        """
        return self._full_name

    @full_name.setter
    def full_name(self, full_name):
        """Sets the full_name of this UnitDTO.

        Полное название единицы измерения.

        :param full_name: The full_name of this UnitDTO.
        :type full_name: str
        """
        if full_name is None:
            raise ValueError("Invalid value for `full_name`, must not be `None`")

        self._full_name = full_name
