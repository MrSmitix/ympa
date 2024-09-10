# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server import util


class PromoOfferPromocodeParamsDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, max_price: int=None):
        """PromoOfferPromocodeParamsDTO - a model defined in OpenAPI

        :param max_price: The max_price of this PromoOfferPromocodeParamsDTO.
        """
        self.openapi_types = {
            'max_price': int
        }

        self.attribute_map = {
            'max_price': 'maxPrice'
        }

        self._max_price = max_price

    @classmethod
    def from_dict(cls, dikt: dict) -> 'PromoOfferPromocodeParamsDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The PromoOfferPromocodeParamsDTO of this PromoOfferPromocodeParamsDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def max_price(self):
        """Gets the max_price of this PromoOfferPromocodeParamsDTO.

        Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. 

        :return: The max_price of this PromoOfferPromocodeParamsDTO.
        :rtype: int
        """
        return self._max_price

    @max_price.setter
    def max_price(self, max_price):
        """Sets the max_price of this PromoOfferPromocodeParamsDTO.

        Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. 

        :param max_price: The max_price of this PromoOfferPromocodeParamsDTO.
        :type max_price: int
        """
        if max_price is None:
            raise ValueError("Invalid value for `max_price`, must not be `None`")

        self._max_price = max_price
