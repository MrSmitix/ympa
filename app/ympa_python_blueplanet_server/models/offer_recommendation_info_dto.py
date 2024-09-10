# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.base_price_dto import BasePriceDTO  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.price_competitiveness_thresholds_dto import PriceCompetitivenessThresholdsDTO  # noqa: F401,E501
import re  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class OfferRecommendationInfoDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, offer_id: str=None, recommended_cofinance_price: BasePriceDTO=None, competitiveness_thresholds: PriceCompetitivenessThresholdsDTO=None):  # noqa: E501
        """OfferRecommendationInfoDTO - a model defined in Swagger

        :param offer_id: The offer_id of this OfferRecommendationInfoDTO.  # noqa: E501
        :type offer_id: str
        :param recommended_cofinance_price: The recommended_cofinance_price of this OfferRecommendationInfoDTO.  # noqa: E501
        :type recommended_cofinance_price: BasePriceDTO
        :param competitiveness_thresholds: The competitiveness_thresholds of this OfferRecommendationInfoDTO.  # noqa: E501
        :type competitiveness_thresholds: PriceCompetitivenessThresholdsDTO
        """
        self.swagger_types = {
            'offer_id': str,
            'recommended_cofinance_price': BasePriceDTO,
            'competitiveness_thresholds': PriceCompetitivenessThresholdsDTO
        }

        self.attribute_map = {
            'offer_id': 'offerId',
            'recommended_cofinance_price': 'recommendedCofinancePrice',
            'competitiveness_thresholds': 'competitivenessThresholds'
        }

        self._offer_id = offer_id
        self._recommended_cofinance_price = recommended_cofinance_price
        self._competitiveness_thresholds = competitiveness_thresholds

    @classmethod
    def from_dict(cls, dikt) -> 'OfferRecommendationInfoDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OfferRecommendationInfoDTO of this OfferRecommendationInfoDTO.  # noqa: E501
        :rtype: OfferRecommendationInfoDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer_id(self) -> str:
        """Gets the offer_id of this OfferRecommendationInfoDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :return: The offer_id of this OfferRecommendationInfoDTO.
        :rtype: str
        """
        return self._offer_id

    @offer_id.setter
    def offer_id(self, offer_id: str):
        """Sets the offer_id of this OfferRecommendationInfoDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :param offer_id: The offer_id of this OfferRecommendationInfoDTO.
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
    def recommended_cofinance_price(self) -> BasePriceDTO:
        """Gets the recommended_cofinance_price of this OfferRecommendationInfoDTO.


        :return: The recommended_cofinance_price of this OfferRecommendationInfoDTO.
        :rtype: BasePriceDTO
        """
        return self._recommended_cofinance_price

    @recommended_cofinance_price.setter
    def recommended_cofinance_price(self, recommended_cofinance_price: BasePriceDTO):
        """Sets the recommended_cofinance_price of this OfferRecommendationInfoDTO.


        :param recommended_cofinance_price: The recommended_cofinance_price of this OfferRecommendationInfoDTO.
        :type recommended_cofinance_price: BasePriceDTO
        """

        self._recommended_cofinance_price = recommended_cofinance_price

    @property
    def competitiveness_thresholds(self) -> PriceCompetitivenessThresholdsDTO:
        """Gets the competitiveness_thresholds of this OfferRecommendationInfoDTO.


        :return: The competitiveness_thresholds of this OfferRecommendationInfoDTO.
        :rtype: PriceCompetitivenessThresholdsDTO
        """
        return self._competitiveness_thresholds

    @competitiveness_thresholds.setter
    def competitiveness_thresholds(self, competitiveness_thresholds: PriceCompetitivenessThresholdsDTO):
        """Sets the competitiveness_thresholds of this OfferRecommendationInfoDTO.


        :param competitiveness_thresholds: The competitiveness_thresholds of this OfferRecommendationInfoDTO.
        :type competitiveness_thresholds: PriceCompetitivenessThresholdsDTO
        """

        self._competitiveness_thresholds = competitiveness_thresholds
