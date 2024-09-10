# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.offer_card_status_type import OfferCardStatusType
from ympa_python_aiohttp_server import util


class GetOfferCardsContentStatusRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, offer_ids: list[str]=None, card_statuses: list[OfferCardStatusType]=None, category_ids: list[int]=None):
        """GetOfferCardsContentStatusRequest - a model defined in OpenAPI

        :param offer_ids: The offer_ids of this GetOfferCardsContentStatusRequest.
        :param card_statuses: The card_statuses of this GetOfferCardsContentStatusRequest.
        :param category_ids: The category_ids of this GetOfferCardsContentStatusRequest.
        """
        self.openapi_types = {
            'offer_ids': list[str],
            'card_statuses': list[OfferCardStatusType],
            'category_ids': list[int]
        }

        self.attribute_map = {
            'offer_ids': 'offerIds',
            'card_statuses': 'cardStatuses',
            'category_ids': 'categoryIds'
        }

        self._offer_ids = offer_ids
        self._card_statuses = card_statuses
        self._category_ids = category_ids

    @classmethod
    def from_dict(cls, dikt: dict) -> 'GetOfferCardsContentStatusRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The GetOfferCardsContentStatusRequest of this GetOfferCardsContentStatusRequest.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer_ids(self):
        """Gets the offer_ids of this GetOfferCardsContentStatusRequest.

        Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 

        :return: The offer_ids of this GetOfferCardsContentStatusRequest.
        :rtype: list[str]
        """
        return self._offer_ids

    @offer_ids.setter
    def offer_ids(self, offer_ids):
        """Sets the offer_ids of this GetOfferCardsContentStatusRequest.

        Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 

        :param offer_ids: The offer_ids of this GetOfferCardsContentStatusRequest.
        :type offer_ids: list[str]
        """
        if offer_ids is not None and len(offer_ids) > 200:
            raise ValueError("Invalid value for `offer_ids`, number of items must be less than or equal to `200`")

        self._offer_ids = offer_ids

    @property
    def card_statuses(self):
        """Gets the card_statuses of this GetOfferCardsContentStatusRequest.

        Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 

        :return: The card_statuses of this GetOfferCardsContentStatusRequest.
        :rtype: list[OfferCardStatusType]
        """
        return self._card_statuses

    @card_statuses.setter
    def card_statuses(self, card_statuses):
        """Sets the card_statuses of this GetOfferCardsContentStatusRequest.

        Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 

        :param card_statuses: The card_statuses of this GetOfferCardsContentStatusRequest.
        :type card_statuses: list[OfferCardStatusType]
        """

        self._card_statuses = card_statuses

    @property
    def category_ids(self):
        """Gets the category_ids of this GetOfferCardsContentStatusRequest.

        Фильтр по категориям на Маркете.

        :return: The category_ids of this GetOfferCardsContentStatusRequest.
        :rtype: list[int]
        """
        return self._category_ids

    @category_ids.setter
    def category_ids(self, category_ids):
        """Sets the category_ids of this GetOfferCardsContentStatusRequest.

        Фильтр по категориям на Маркете.

        :param category_ids: The category_ids of this GetOfferCardsContentStatusRequest.
        :type category_ids: list[int]
        """
        if category_ids is not None and len(category_ids) > 200:
            raise ValueError("Invalid value for `category_ids`, number of items must be less than or equal to `200`")

        self._category_ids = category_ids
