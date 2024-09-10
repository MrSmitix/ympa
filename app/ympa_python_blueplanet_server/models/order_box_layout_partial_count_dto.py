# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from ympa_python_blueplanet_server import util


class OrderBoxLayoutPartialCountDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, current: int=None, total: int=None):  # noqa: E501
        """OrderBoxLayoutPartialCountDTO - a model defined in Swagger

        :param current: The current of this OrderBoxLayoutPartialCountDTO.  # noqa: E501
        :type current: int
        :param total: The total of this OrderBoxLayoutPartialCountDTO.  # noqa: E501
        :type total: int
        """
        self.swagger_types = {
            'current': int,
            'total': int
        }

        self.attribute_map = {
            'current': 'current',
            'total': 'total'
        }

        self._current = current
        self._total = total

    @classmethod
    def from_dict(cls, dikt) -> 'OrderBoxLayoutPartialCountDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrderBoxLayoutPartialCountDTO of this OrderBoxLayoutPartialCountDTO.  # noqa: E501
        :rtype: OrderBoxLayoutPartialCountDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def current(self) -> int:
        """Gets the current of this OrderBoxLayoutPartialCountDTO.

        Номер части, начиная с 1.  # noqa: E501

        :return: The current of this OrderBoxLayoutPartialCountDTO.
        :rtype: int
        """
        return self._current

    @current.setter
    def current(self, current: int):
        """Sets the current of this OrderBoxLayoutPartialCountDTO.

        Номер части, начиная с 1.  # noqa: E501

        :param current: The current of this OrderBoxLayoutPartialCountDTO.
        :type current: int
        """
        if current is None:
            raise ValueError("Invalid value for `current`, must not be `None`")  # noqa: E501
        if current is not None and current < 1:  # noqa: E501
            raise ValueError("Invalid value for `current`, must be a value greater than or equal to `1`")  # noqa: E501

        self._current = current

    @property
    def total(self) -> int:
        """Gets the total of this OrderBoxLayoutPartialCountDTO.

        На сколько всего частей разделен товар.  # noqa: E501

        :return: The total of this OrderBoxLayoutPartialCountDTO.
        :rtype: int
        """
        return self._total

    @total.setter
    def total(self, total: int):
        """Sets the total of this OrderBoxLayoutPartialCountDTO.

        На сколько всего частей разделен товар.  # noqa: E501

        :param total: The total of this OrderBoxLayoutPartialCountDTO.
        :type total: int
        """
        if total is None:
            raise ValueError("Invalid value for `total`, must not be `None`")  # noqa: E501
        if total is not None and total < 2:  # noqa: E501
            raise ValueError("Invalid value for `total`, must be a value greater than or equal to `2`")  # noqa: E501

        self._total = total
