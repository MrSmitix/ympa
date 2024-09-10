# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.base_price_dto import BasePriceDTO
from ympa_python_aiohttp_server.models.price_quarantine_verdict_dto import PriceQuarantineVerdictDTO
import re
from ympa_python_aiohttp_server import util


class QuarantineOfferDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, offer_id: str=None, current_price: BasePriceDTO=None, last_valid_price: BasePriceDTO=None, verdicts: List[PriceQuarantineVerdictDTO]=None):
        """QuarantineOfferDTO - a model defined in OpenAPI

        :param offer_id: The offer_id of this QuarantineOfferDTO.
        :param current_price: The current_price of this QuarantineOfferDTO.
        :param last_valid_price: The last_valid_price of this QuarantineOfferDTO.
        :param verdicts: The verdicts of this QuarantineOfferDTO.
        """
        self.openapi_types = {
            'offer_id': str,
            'current_price': BasePriceDTO,
            'last_valid_price': BasePriceDTO,
            'verdicts': List[PriceQuarantineVerdictDTO]
        }

        self.attribute_map = {
            'offer_id': 'offerId',
            'current_price': 'currentPrice',
            'last_valid_price': 'lastValidPrice',
            'verdicts': 'verdicts'
        }

        self._offer_id = offer_id
        self._current_price = current_price
        self._last_valid_price = last_valid_price
        self._verdicts = verdicts

    @classmethod
    def from_dict(cls, dikt: dict) -> 'QuarantineOfferDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The QuarantineOfferDTO of this QuarantineOfferDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer_id(self):
        """Gets the offer_id of this QuarantineOfferDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 

        :return: The offer_id of this QuarantineOfferDTO.
        :rtype: str
        """
        return self._offer_id

    @offer_id.setter
    def offer_id(self, offer_id):
        """Sets the offer_id of this QuarantineOfferDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 

        :param offer_id: The offer_id of this QuarantineOfferDTO.
        :type offer_id: str
        """
        if offer_id is not None and len(offer_id) > 255:
            raise ValueError("Invalid value for `offer_id`, length must be less than or equal to `255`")
        if offer_id is not None and len(offer_id) < 1:
            raise ValueError("Invalid value for `offer_id`, length must be greater than or equal to `1`")
        if offer_id is not None and not re.search(r'^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$', offer_id):
            raise ValueError("Invalid value for `offer_id`, must be a follow pattern or equal to `/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/`")

        self._offer_id = offer_id

    @property
    def current_price(self):
        """Gets the current_price of this QuarantineOfferDTO.


        :return: The current_price of this QuarantineOfferDTO.
        :rtype: BasePriceDTO
        """
        return self._current_price

    @current_price.setter
    def current_price(self, current_price):
        """Sets the current_price of this QuarantineOfferDTO.


        :param current_price: The current_price of this QuarantineOfferDTO.
        :type current_price: BasePriceDTO
        """

        self._current_price = current_price

    @property
    def last_valid_price(self):
        """Gets the last_valid_price of this QuarantineOfferDTO.


        :return: The last_valid_price of this QuarantineOfferDTO.
        :rtype: BasePriceDTO
        """
        return self._last_valid_price

    @last_valid_price.setter
    def last_valid_price(self, last_valid_price):
        """Sets the last_valid_price of this QuarantineOfferDTO.


        :param last_valid_price: The last_valid_price of this QuarantineOfferDTO.
        :type last_valid_price: BasePriceDTO
        """

        self._last_valid_price = last_valid_price

    @property
    def verdicts(self):
        """Gets the verdicts of this QuarantineOfferDTO.

        Причины попадания товара в карантин.

        :return: The verdicts of this QuarantineOfferDTO.
        :rtype: List[PriceQuarantineVerdictDTO]
        """
        return self._verdicts

    @verdicts.setter
    def verdicts(self, verdicts):
        """Sets the verdicts of this QuarantineOfferDTO.

        Причины попадания товара в карантин.

        :param verdicts: The verdicts of this QuarantineOfferDTO.
        :type verdicts: List[PriceQuarantineVerdictDTO]
        """

        self._verdicts = verdicts
