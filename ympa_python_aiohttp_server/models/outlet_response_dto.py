# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server import util


class OutletResponseDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: int=None):
        """OutletResponseDTO - a model defined in OpenAPI

        :param id: The id of this OutletResponseDTO.
        """
        self.openapi_types = {
            'id': int
        }

        self.attribute_map = {
            'id': 'id'
        }

        self._id = id

    @classmethod
    def from_dict(cls, dikt: dict) -> 'OutletResponseDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The OutletResponseDTO of this OutletResponseDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this OutletResponseDTO.

        Идентификатор точки продаж, присвоенный Маркетом.

        :return: The id of this OutletResponseDTO.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this OutletResponseDTO.

        Идентификатор точки продаж, присвоенный Маркетом.

        :param id: The id of this OutletResponseDTO.
        :type id: int
        """

        self._id = id
