# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.price_dto import PriceDTO  # noqa: F401,E501
import re  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class OfferPriceDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, offer_id: str=None, price: PriceDTO=None):  # noqa: E501
        """OfferPriceDTO - a model defined in Swagger

        :param offer_id: The offer_id of this OfferPriceDTO.  # noqa: E501
        :type offer_id: str
        :param price: The price of this OfferPriceDTO.  # noqa: E501
        :type price: PriceDTO
        """
        self.swagger_types = {
            'offer_id': str,
            'price': PriceDTO
        }

        self.attribute_map = {
            'offer_id': 'offerId',
            'price': 'price'
        }

        self._offer_id = offer_id
        self._price = price

    @classmethod
    def from_dict(cls, dikt) -> 'OfferPriceDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OfferPriceDTO of this OfferPriceDTO.  # noqa: E501
        :rtype: OfferPriceDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer_id(self) -> str:
        """Gets the offer_id of this OfferPriceDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :return: The offer_id of this OfferPriceDTO.
        :rtype: str
        """
        return self._offer_id

    @offer_id.setter
    def offer_id(self, offer_id: str):
        """Sets the offer_id of this OfferPriceDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :param offer_id: The offer_id of this OfferPriceDTO.
        :type offer_id: str
        """
        if offer_id is not None and len(offer_id) > 255:
            raise ValueError("Invalid value for `offer_id`, length must be less than or equal to `255`")  # noqa: E501
        if offer_id is not None and len(offer_id) < 1:
            raise ValueError("Invalid value for `offer_id`, length must be greater than or equal to `1`")  # noqa: E501
        if offer_id is not None and not re.search(r'^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$', offer_id):  # noqa: E501
            raise ValueError("Invalid value for `offer_id`, must be a follow pattern or equal to `/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/`")  # noqa: E501

        self._offer_id = offer_id

    @property
    def price(self) -> PriceDTO:
        """Gets the price of this OfferPriceDTO.


        :return: The price of this OfferPriceDTO.
        :rtype: PriceDTO
        """
        return self._price

    @price.setter
    def price(self, price: PriceDTO):
        """Sets the price of this OfferPriceDTO.


        :param price: The price of this OfferPriceDTO.
        :type price: PriceDTO
        """

        self._price = price
