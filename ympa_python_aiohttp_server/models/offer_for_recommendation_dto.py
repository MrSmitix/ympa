# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.base_price_dto import BasePriceDTO
from ympa_python_aiohttp_server.models.get_price_dto import GetPriceDTO
from ympa_python_aiohttp_server.models.price_competitiveness_type import PriceCompetitivenessType
import re
from ympa_python_aiohttp_server import util


class OfferForRecommendationDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, offer_id: str=None, price: BasePriceDTO=None, cofinance_price: GetPriceDTO=None, competitiveness: PriceCompetitivenessType=None, shows: int=None):
        """OfferForRecommendationDTO - a model defined in OpenAPI

        :param offer_id: The offer_id of this OfferForRecommendationDTO.
        :param price: The price of this OfferForRecommendationDTO.
        :param cofinance_price: The cofinance_price of this OfferForRecommendationDTO.
        :param competitiveness: The competitiveness of this OfferForRecommendationDTO.
        :param shows: The shows of this OfferForRecommendationDTO.
        """
        self.openapi_types = {
            'offer_id': str,
            'price': BasePriceDTO,
            'cofinance_price': GetPriceDTO,
            'competitiveness': PriceCompetitivenessType,
            'shows': int
        }

        self.attribute_map = {
            'offer_id': 'offerId',
            'price': 'price',
            'cofinance_price': 'cofinancePrice',
            'competitiveness': 'competitiveness',
            'shows': 'shows'
        }

        self._offer_id = offer_id
        self._price = price
        self._cofinance_price = cofinance_price
        self._competitiveness = competitiveness
        self._shows = shows

    @classmethod
    def from_dict(cls, dikt: dict) -> 'OfferForRecommendationDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The OfferForRecommendationDTO of this OfferForRecommendationDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer_id(self):
        """Gets the offer_id of this OfferForRecommendationDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 

        :return: The offer_id of this OfferForRecommendationDTO.
        :rtype: str
        """
        return self._offer_id

    @offer_id.setter
    def offer_id(self, offer_id):
        """Sets the offer_id of this OfferForRecommendationDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 

        :param offer_id: The offer_id of this OfferForRecommendationDTO.
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
    def price(self):
        """Gets the price of this OfferForRecommendationDTO.


        :return: The price of this OfferForRecommendationDTO.
        :rtype: BasePriceDTO
        """
        return self._price

    @price.setter
    def price(self, price):
        """Sets the price of this OfferForRecommendationDTO.


        :param price: The price of this OfferForRecommendationDTO.
        :type price: BasePriceDTO
        """

        self._price = price

    @property
    def cofinance_price(self):
        """Gets the cofinance_price of this OfferForRecommendationDTO.


        :return: The cofinance_price of this OfferForRecommendationDTO.
        :rtype: GetPriceDTO
        """
        return self._cofinance_price

    @cofinance_price.setter
    def cofinance_price(self, cofinance_price):
        """Sets the cofinance_price of this OfferForRecommendationDTO.


        :param cofinance_price: The cofinance_price of this OfferForRecommendationDTO.
        :type cofinance_price: GetPriceDTO
        """

        self._cofinance_price = cofinance_price

    @property
    def competitiveness(self):
        """Gets the competitiveness of this OfferForRecommendationDTO.


        :return: The competitiveness of this OfferForRecommendationDTO.
        :rtype: PriceCompetitivenessType
        """
        return self._competitiveness

    @competitiveness.setter
    def competitiveness(self, competitiveness):
        """Sets the competitiveness of this OfferForRecommendationDTO.


        :param competitiveness: The competitiveness of this OfferForRecommendationDTO.
        :type competitiveness: PriceCompetitivenessType
        """

        self._competitiveness = competitiveness

    @property
    def shows(self):
        """Gets the shows of this OfferForRecommendationDTO.

        Количество показов карточки товара за последние 7 дней.

        :return: The shows of this OfferForRecommendationDTO.
        :rtype: int
        """
        return self._shows

    @shows.setter
    def shows(self, shows):
        """Sets the shows of this OfferForRecommendationDTO.

        Количество показов карточки товара за последние 7 дней.

        :param shows: The shows of this OfferForRecommendationDTO.
        :type shows: int
        """

        self._shows = shows
