# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.model_price_dto import ModelPriceDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class ModelDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, name: str=None, prices: ModelPriceDTO=None):  # noqa: E501
        """ModelDTO - a model defined in Swagger

        :param id: The id of this ModelDTO.  # noqa: E501
        :type id: int
        :param name: The name of this ModelDTO.  # noqa: E501
        :type name: str
        :param prices: The prices of this ModelDTO.  # noqa: E501
        :type prices: ModelPriceDTO
        """
        self.swagger_types = {
            'id': int,
            'name': str,
            'prices': ModelPriceDTO
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'prices': 'prices'
        }

        self._id = id
        self._name = name
        self._prices = prices

    @classmethod
    def from_dict(cls, dikt) -> 'ModelDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ModelDTO of this ModelDTO.  # noqa: E501
        :rtype: ModelDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """Gets the id of this ModelDTO.

        Идентификатор модели товара.  # noqa: E501

        :return: The id of this ModelDTO.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this ModelDTO.

        Идентификатор модели товара.  # noqa: E501

        :param id: The id of this ModelDTO.
        :type id: int
        """

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this ModelDTO.

        Название модели товара.  # noqa: E501

        :return: The name of this ModelDTO.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this ModelDTO.

        Название модели товара.  # noqa: E501

        :param name: The name of this ModelDTO.
        :type name: str
        """

        self._name = name

    @property
    def prices(self) -> ModelPriceDTO:
        """Gets the prices of this ModelDTO.


        :return: The prices of this ModelDTO.
        :rtype: ModelPriceDTO
        """
        return self._prices

    @prices.setter
    def prices(self, prices: ModelPriceDTO):
        """Sets the prices of this ModelDTO.


        :param prices: The prices of this ModelDTO.
        :type prices: ModelPriceDTO
        """

        self._prices = prices
