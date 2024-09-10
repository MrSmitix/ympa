# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.offer_card_status_type import OfferCardStatusType  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class GetOfferMappingsRequest(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, offer_ids: List[str]=None, card_statuses: List[OfferCardStatusType]=None, category_ids: List[int]=None, vendor_names: List[str]=None, tags: List[str]=None, archived: bool=None):  # noqa: E501
        """GetOfferMappingsRequest - a model defined in Swagger

        :param offer_ids: The offer_ids of this GetOfferMappingsRequest.  # noqa: E501
        :type offer_ids: List[str]
        :param card_statuses: The card_statuses of this GetOfferMappingsRequest.  # noqa: E501
        :type card_statuses: List[OfferCardStatusType]
        :param category_ids: The category_ids of this GetOfferMappingsRequest.  # noqa: E501
        :type category_ids: List[int]
        :param vendor_names: The vendor_names of this GetOfferMappingsRequest.  # noqa: E501
        :type vendor_names: List[str]
        :param tags: The tags of this GetOfferMappingsRequest.  # noqa: E501
        :type tags: List[str]
        :param archived: The archived of this GetOfferMappingsRequest.  # noqa: E501
        :type archived: bool
        """
        self.swagger_types = {
            'offer_ids': List[str],
            'card_statuses': List[OfferCardStatusType],
            'category_ids': List[int],
            'vendor_names': List[str],
            'tags': List[str],
            'archived': bool
        }

        self.attribute_map = {
            'offer_ids': 'offerIds',
            'card_statuses': 'cardStatuses',
            'category_ids': 'categoryIds',
            'vendor_names': 'vendorNames',
            'tags': 'tags',
            'archived': 'archived'
        }

        self._offer_ids = offer_ids
        self._card_statuses = card_statuses
        self._category_ids = category_ids
        self._vendor_names = vendor_names
        self._tags = tags
        self._archived = archived

    @classmethod
    def from_dict(cls, dikt) -> 'GetOfferMappingsRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetOfferMappingsRequest of this GetOfferMappingsRequest.  # noqa: E501
        :rtype: GetOfferMappingsRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer_ids(self) -> List[str]:
        """Gets the offer_ids of this GetOfferMappingsRequest.

        Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}      # noqa: E501

        :return: The offer_ids of this GetOfferMappingsRequest.
        :rtype: List[str]
        """
        return self._offer_ids

    @offer_ids.setter
    def offer_ids(self, offer_ids: List[str]):
        """Sets the offer_ids of this GetOfferMappingsRequest.

        Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}      # noqa: E501

        :param offer_ids: The offer_ids of this GetOfferMappingsRequest.
        :type offer_ids: List[str]
        """
        if offer_ids is not None and len(offer_ids) > 200:
            raise ValueError("Invalid value for `offer_ids`, number of items must be less than or equal to `200`")  # noqa: E501
        if offer_ids is not None and len(offer_ids) < 1:
            raise ValueError("Invalid value for `offer_ids`, number of items must be greater than or equal to `1`")  # noqa: E501

        self._offer_ids = offer_ids

    @property
    def card_statuses(self) -> List[OfferCardStatusType]:
        """Gets the card_statuses of this GetOfferMappingsRequest.

        Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)   # noqa: E501

        :return: The card_statuses of this GetOfferMappingsRequest.
        :rtype: List[OfferCardStatusType]
        """
        return self._card_statuses

    @card_statuses.setter
    def card_statuses(self, card_statuses: List[OfferCardStatusType]):
        """Sets the card_statuses of this GetOfferMappingsRequest.

        Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)   # noqa: E501

        :param card_statuses: The card_statuses of this GetOfferMappingsRequest.
        :type card_statuses: List[OfferCardStatusType]
        """
        if card_statuses is not None and len(card_statuses) < 1:
            raise ValueError("Invalid value for `card_statuses`, number of items must be greater than or equal to `1`")  # noqa: E501

        self._card_statuses = card_statuses

    @property
    def category_ids(self) -> List[int]:
        """Gets the category_ids of this GetOfferMappingsRequest.

        Фильтр по категориям на Маркете.  # noqa: E501

        :return: The category_ids of this GetOfferMappingsRequest.
        :rtype: List[int]
        """
        return self._category_ids

    @category_ids.setter
    def category_ids(self, category_ids: List[int]):
        """Sets the category_ids of this GetOfferMappingsRequest.

        Фильтр по категориям на Маркете.  # noqa: E501

        :param category_ids: The category_ids of this GetOfferMappingsRequest.
        :type category_ids: List[int]
        """
        if category_ids is not None and len(category_ids) < 1:
            raise ValueError("Invalid value for `category_ids`, number of items must be greater than or equal to `1`")  # noqa: E501

        self._category_ids = category_ids

    @property
    def vendor_names(self) -> List[str]:
        """Gets the vendor_names of this GetOfferMappingsRequest.

        Фильтр по брендам.  # noqa: E501

        :return: The vendor_names of this GetOfferMappingsRequest.
        :rtype: List[str]
        """
        return self._vendor_names

    @vendor_names.setter
    def vendor_names(self, vendor_names: List[str]):
        """Sets the vendor_names of this GetOfferMappingsRequest.

        Фильтр по брендам.  # noqa: E501

        :param vendor_names: The vendor_names of this GetOfferMappingsRequest.
        :type vendor_names: List[str]
        """
        if vendor_names is not None and len(vendor_names) < 1:
            raise ValueError("Invalid value for `vendor_names`, number of items must be greater than or equal to `1`")  # noqa: E501

        self._vendor_names = vendor_names

    @property
    def tags(self) -> List[str]:
        """Gets the tags of this GetOfferMappingsRequest.

        Фильтр по тегам.  # noqa: E501

        :return: The tags of this GetOfferMappingsRequest.
        :rtype: List[str]
        """
        return self._tags

    @tags.setter
    def tags(self, tags: List[str]):
        """Sets the tags of this GetOfferMappingsRequest.

        Фильтр по тегам.  # noqa: E501

        :param tags: The tags of this GetOfferMappingsRequest.
        :type tags: List[str]
        """
        if tags is not None and len(tags) < 1:
            raise ValueError("Invalid value for `tags`, number of items must be greater than or equal to `1`")  # noqa: E501

        self._tags = tags

    @property
    def archived(self) -> bool:
        """Gets the archived of this GetOfferMappingsRequest.

        Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве.   # noqa: E501

        :return: The archived of this GetOfferMappingsRequest.
        :rtype: bool
        """
        return self._archived

    @archived.setter
    def archived(self, archived: bool):
        """Sets the archived of this GetOfferMappingsRequest.

        Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве.   # noqa: E501

        :param archived: The archived of this GetOfferMappingsRequest.
        :type archived: bool
        """

        self._archived = archived
