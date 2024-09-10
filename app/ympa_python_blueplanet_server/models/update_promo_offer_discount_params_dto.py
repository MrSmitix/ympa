# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from ympa_python_blueplanet_server import util


class UpdatePromoOfferDiscountParamsDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, price: int=None, promo_price: int=None):  # noqa: E501
        """UpdatePromoOfferDiscountParamsDTO - a model defined in Swagger

        :param price: The price of this UpdatePromoOfferDiscountParamsDTO.  # noqa: E501
        :type price: int
        :param promo_price: The promo_price of this UpdatePromoOfferDiscountParamsDTO.  # noqa: E501
        :type promo_price: int
        """
        self.swagger_types = {
            'price': int,
            'promo_price': int
        }

        self.attribute_map = {
            'price': 'price',
            'promo_price': 'promoPrice'
        }

        self._price = price
        self._promo_price = promo_price

    @classmethod
    def from_dict(cls, dikt) -> 'UpdatePromoOfferDiscountParamsDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UpdatePromoOfferDiscountParamsDTO of this UpdatePromoOfferDiscountParamsDTO.  # noqa: E501
        :rtype: UpdatePromoOfferDiscountParamsDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def price(self) -> int:
        """Gets the price of this UpdatePromoOfferDiscountParamsDTO.

        Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым.   # noqa: E501

        :return: The price of this UpdatePromoOfferDiscountParamsDTO.
        :rtype: int
        """
        return self._price

    @price.setter
    def price(self, price: int):
        """Sets the price of this UpdatePromoOfferDiscountParamsDTO.

        Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым.   # noqa: E501

        :param price: The price of this UpdatePromoOfferDiscountParamsDTO.
        :type price: int
        """
        if price is not None and price < 1:  # noqa: E501
            raise ValueError("Invalid value for `price`, must be a value greater than or equal to `1`")  # noqa: E501

        self._price = price

    @property
    def promo_price(self) -> int:
        """Gets the promo_price of this UpdatePromoOfferDiscountParamsDTO.

        Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым.   # noqa: E501

        :return: The promo_price of this UpdatePromoOfferDiscountParamsDTO.
        :rtype: int
        """
        return self._promo_price

    @promo_price.setter
    def promo_price(self, promo_price: int):
        """Sets the promo_price of this UpdatePromoOfferDiscountParamsDTO.

        Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым.   # noqa: E501

        :param promo_price: The promo_price of this UpdatePromoOfferDiscountParamsDTO.
        :type promo_price: int
        """
        if promo_price is not None and promo_price < 1:  # noqa: E501
            raise ValueError("Invalid value for `promo_price`, must be a value greater than or equal to `1`")  # noqa: E501

        self._promo_price = promo_price