# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.order_subsidy_type import OrderSubsidyType
from ympa_python_aiohttp_server import util


class OrderSubsidyDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, type: OrderSubsidyType=None, amount: float=None):
        """OrderSubsidyDTO - a model defined in OpenAPI

        :param type: The type of this OrderSubsidyDTO.
        :param amount: The amount of this OrderSubsidyDTO.
        """
        self.openapi_types = {
            'type': OrderSubsidyType,
            'amount': float
        }

        self.attribute_map = {
            'type': 'type',
            'amount': 'amount'
        }

        self._type = type
        self._amount = amount

    @classmethod
    def from_dict(cls, dikt: dict) -> 'OrderSubsidyDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The OrderSubsidyDTO of this OrderSubsidyDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self):
        """Gets the type of this OrderSubsidyDTO.


        :return: The type of this OrderSubsidyDTO.
        :rtype: OrderSubsidyType
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this OrderSubsidyDTO.


        :param type: The type of this OrderSubsidyDTO.
        :type type: OrderSubsidyType
        """

        self._type = type

    @property
    def amount(self):
        """Gets the amount of this OrderSubsidyDTO.

        Сумма субсидии.

        :return: The amount of this OrderSubsidyDTO.
        :rtype: float
        """
        return self._amount

    @amount.setter
    def amount(self, amount):
        """Sets the amount of this OrderSubsidyDTO.

        Сумма субсидии.

        :param amount: The amount of this OrderSubsidyDTO.
        :type amount: float
        """

        self._amount = amount
