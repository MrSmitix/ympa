# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from ympa_python_blueplanet_server import util


class GetPromoPromocodeInfoDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, promocode: str=None, discount: int=None):  # noqa: E501
        """GetPromoPromocodeInfoDTO - a model defined in Swagger

        :param promocode: The promocode of this GetPromoPromocodeInfoDTO.  # noqa: E501
        :type promocode: str
        :param discount: The discount of this GetPromoPromocodeInfoDTO.  # noqa: E501
        :type discount: int
        """
        self.swagger_types = {
            'promocode': str,
            'discount': int
        }

        self.attribute_map = {
            'promocode': 'promocode',
            'discount': 'discount'
        }

        self._promocode = promocode
        self._discount = discount

    @classmethod
    def from_dict(cls, dikt) -> 'GetPromoPromocodeInfoDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetPromoPromocodeInfoDTO of this GetPromoPromocodeInfoDTO.  # noqa: E501
        :rtype: GetPromoPromocodeInfoDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def promocode(self) -> str:
        """Gets the promocode of this GetPromoPromocodeInfoDTO.

        Промокод.  # noqa: E501

        :return: The promocode of this GetPromoPromocodeInfoDTO.
        :rtype: str
        """
        return self._promocode

    @promocode.setter
    def promocode(self, promocode: str):
        """Sets the promocode of this GetPromoPromocodeInfoDTO.

        Промокод.  # noqa: E501

        :param promocode: The promocode of this GetPromoPromocodeInfoDTO.
        :type promocode: str
        """
        if promocode is None:
            raise ValueError("Invalid value for `promocode`, must not be `None`")  # noqa: E501

        self._promocode = promocode

    @property
    def discount(self) -> int:
        """Gets the discount of this GetPromoPromocodeInfoDTO.

        Процент скидки по промокоду.  # noqa: E501

        :return: The discount of this GetPromoPromocodeInfoDTO.
        :rtype: int
        """
        return self._discount

    @discount.setter
    def discount(self, discount: int):
        """Sets the discount of this GetPromoPromocodeInfoDTO.

        Процент скидки по промокоду.  # noqa: E501

        :param discount: The discount of this GetPromoPromocodeInfoDTO.
        :type discount: int
        """
        if discount is None:
            raise ValueError("Invalid value for `discount`, must not be `None`")  # noqa: E501

        self._discount = discount
