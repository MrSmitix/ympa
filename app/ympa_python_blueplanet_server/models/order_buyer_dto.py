# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.order_buyer_type import OrderBuyerType  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class OrderBuyerDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, id: str=None, last_name: str=None, first_name: str=None, middle_name: str=None, type: OrderBuyerType=None):  # noqa: E501
        """OrderBuyerDTO - a model defined in Swagger

        :param id: The id of this OrderBuyerDTO.  # noqa: E501
        :type id: str
        :param last_name: The last_name of this OrderBuyerDTO.  # noqa: E501
        :type last_name: str
        :param first_name: The first_name of this OrderBuyerDTO.  # noqa: E501
        :type first_name: str
        :param middle_name: The middle_name of this OrderBuyerDTO.  # noqa: E501
        :type middle_name: str
        :param type: The type of this OrderBuyerDTO.  # noqa: E501
        :type type: OrderBuyerType
        """
        self.swagger_types = {
            'id': str,
            'last_name': str,
            'first_name': str,
            'middle_name': str,
            'type': OrderBuyerType
        }

        self.attribute_map = {
            'id': 'id',
            'last_name': 'lastName',
            'first_name': 'firstName',
            'middle_name': 'middleName',
            'type': 'type'
        }

        self._id = id
        self._last_name = last_name
        self._first_name = first_name
        self._middle_name = middle_name
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'OrderBuyerDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrderBuyerDTO of this OrderBuyerDTO.  # noqa: E501
        :rtype: OrderBuyerDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this OrderBuyerDTO.

        Идентификатор покупателя.  # noqa: E501

        :return: The id of this OrderBuyerDTO.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this OrderBuyerDTO.

        Идентификатор покупателя.  # noqa: E501

        :param id: The id of this OrderBuyerDTO.
        :type id: str
        """

        self._id = id

    @property
    def last_name(self) -> str:
        """Gets the last_name of this OrderBuyerDTO.

        Фамилия покупателя.  # noqa: E501

        :return: The last_name of this OrderBuyerDTO.
        :rtype: str
        """
        return self._last_name

    @last_name.setter
    def last_name(self, last_name: str):
        """Sets the last_name of this OrderBuyerDTO.

        Фамилия покупателя.  # noqa: E501

        :param last_name: The last_name of this OrderBuyerDTO.
        :type last_name: str
        """

        self._last_name = last_name

    @property
    def first_name(self) -> str:
        """Gets the first_name of this OrderBuyerDTO.

        Имя покупателя.  # noqa: E501

        :return: The first_name of this OrderBuyerDTO.
        :rtype: str
        """
        return self._first_name

    @first_name.setter
    def first_name(self, first_name: str):
        """Sets the first_name of this OrderBuyerDTO.

        Имя покупателя.  # noqa: E501

        :param first_name: The first_name of this OrderBuyerDTO.
        :type first_name: str
        """

        self._first_name = first_name

    @property
    def middle_name(self) -> str:
        """Gets the middle_name of this OrderBuyerDTO.

        Отчество покупателя.  # noqa: E501

        :return: The middle_name of this OrderBuyerDTO.
        :rtype: str
        """
        return self._middle_name

    @middle_name.setter
    def middle_name(self, middle_name: str):
        """Sets the middle_name of this OrderBuyerDTO.

        Отчество покупателя.  # noqa: E501

        :param middle_name: The middle_name of this OrderBuyerDTO.
        :type middle_name: str
        """

        self._middle_name = middle_name

    @property
    def type(self) -> OrderBuyerType:
        """Gets the type of this OrderBuyerDTO.


        :return: The type of this OrderBuyerDTO.
        :rtype: OrderBuyerType
        """
        return self._type

    @type.setter
    def type(self, type: OrderBuyerType):
        """Sets the type of this OrderBuyerDTO.


        :param type: The type of this OrderBuyerDTO.
        :type type: OrderBuyerType
        """

        self._type = type
