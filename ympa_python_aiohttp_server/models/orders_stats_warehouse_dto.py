# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server import util


class OrdersStatsWarehouseDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, name: str=None):
        """OrdersStatsWarehouseDTO - a model defined in OpenAPI

        :param id: The id of this OrdersStatsWarehouseDTO.
        :param name: The name of this OrdersStatsWarehouseDTO.
        """
        self.openapi_types = {
            'id': int,
            'name': str
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name'
        }

        self._id = id
        self._name = name

    @classmethod
    def from_dict(cls, dikt: dict) -> 'OrdersStatsWarehouseDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The OrdersStatsWarehouseDTO of this OrdersStatsWarehouseDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this OrdersStatsWarehouseDTO.

        Идентификатор склада.

        :return: The id of this OrdersStatsWarehouseDTO.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this OrdersStatsWarehouseDTO.

        Идентификатор склада.

        :param id: The id of this OrdersStatsWarehouseDTO.
        :type id: int
        """

        self._id = id

    @property
    def name(self):
        """Gets the name of this OrdersStatsWarehouseDTO.

        Название склада.

        :return: The name of this OrdersStatsWarehouseDTO.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this OrdersStatsWarehouseDTO.

        Название склада.

        :param name: The name of this OrdersStatsWarehouseDTO.
        :type name: str
        """

        self._name = name
