# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server import util


class GetPromoPromocodeInfoDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, promocode: str=None, discount: int=None):
        """GetPromoPromocodeInfoDTO - a model defined in OpenAPI

        :param promocode: The promocode of this GetPromoPromocodeInfoDTO.
        :param discount: The discount of this GetPromoPromocodeInfoDTO.
        """
        self.openapi_types = {
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
    def from_dict(cls, dikt: dict) -> 'GetPromoPromocodeInfoDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The GetPromoPromocodeInfoDTO of this GetPromoPromocodeInfoDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def promocode(self):
        """Gets the promocode of this GetPromoPromocodeInfoDTO.

        Промокод.

        :return: The promocode of this GetPromoPromocodeInfoDTO.
        :rtype: str
        """
        return self._promocode

    @promocode.setter
    def promocode(self, promocode):
        """Sets the promocode of this GetPromoPromocodeInfoDTO.

        Промокод.

        :param promocode: The promocode of this GetPromoPromocodeInfoDTO.
        :type promocode: str
        """
        if promocode is None:
            raise ValueError("Invalid value for `promocode`, must not be `None`")

        self._promocode = promocode

    @property
    def discount(self):
        """Gets the discount of this GetPromoPromocodeInfoDTO.

        Процент скидки по промокоду.

        :return: The discount of this GetPromoPromocodeInfoDTO.
        :rtype: int
        """
        return self._discount

    @discount.setter
    def discount(self, discount):
        """Sets the discount of this GetPromoPromocodeInfoDTO.

        Процент скидки по промокоду.

        :param discount: The discount of this GetPromoPromocodeInfoDTO.
        :type discount: int
        """
        if discount is None:
            raise ValueError("Invalid value for `discount`, must not be `None`")

        self._discount = discount
