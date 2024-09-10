# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.offer_card_status_type import OfferCardStatusType
from ympa_python_aiohttp_server import util


class GetOfferMappingsRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, offer_ids: List[str]=None, card_statuses: List[OfferCardStatusType]=None, category_ids: List[int]=None, vendor_names: List[str]=None, tags: List[str]=None, archived: bool=None):
        """GetOfferMappingsRequest - a model defined in OpenAPI

        :param offer_ids: The offer_ids of this GetOfferMappingsRequest.
        :param card_statuses: The card_statuses of this GetOfferMappingsRequest.
        :param category_ids: The category_ids of this GetOfferMappingsRequest.
        :param vendor_names: The vendor_names of this GetOfferMappingsRequest.
        :param tags: The tags of this GetOfferMappingsRequest.
        :param archived: The archived of this GetOfferMappingsRequest.
        """
        self.openapi_types = {
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
    def from_dict(cls, dikt: dict) -> 'GetOfferMappingsRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The GetOfferMappingsRequest of this GetOfferMappingsRequest.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer_ids(self):
        """Gets the offer_ids of this GetOfferMappingsRequest.

        Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    

        :return: The offer_ids of this GetOfferMappingsRequest.
        :rtype: List[str]
        """
        return self._offer_ids

    @offer_ids.setter
    def offer_ids(self, offer_ids):
        """Sets the offer_ids of this GetOfferMappingsRequest.

        Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    

        :param offer_ids: The offer_ids of this GetOfferMappingsRequest.
        :type offer_ids: List[str]
        """
        if offer_ids is not None and len(offer_ids) > 200:
            raise ValueError("Invalid value for `offer_ids`, number of items must be less than or equal to `200`")
        if offer_ids is not None and len(offer_ids) < 1:
            raise ValueError("Invalid value for `offer_ids`, number of items must be greater than or equal to `1`")

        self._offer_ids = offer_ids

    @property
    def card_statuses(self):
        """Gets the card_statuses of this GetOfferMappingsRequest.

        Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 

        :return: The card_statuses of this GetOfferMappingsRequest.
        :rtype: List[OfferCardStatusType]
        """
        return self._card_statuses

    @card_statuses.setter
    def card_statuses(self, card_statuses):
        """Sets the card_statuses of this GetOfferMappingsRequest.

        Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 

        :param card_statuses: The card_statuses of this GetOfferMappingsRequest.
        :type card_statuses: List[OfferCardStatusType]
        """
        if card_statuses is not None and len(card_statuses) < 1:
            raise ValueError("Invalid value for `card_statuses`, number of items must be greater than or equal to `1`")

        self._card_statuses = card_statuses

    @property
    def category_ids(self):
        """Gets the category_ids of this GetOfferMappingsRequest.

        Фильтр по категориям на Маркете.

        :return: The category_ids of this GetOfferMappingsRequest.
        :rtype: List[int]
        """
        return self._category_ids

    @category_ids.setter
    def category_ids(self, category_ids):
        """Sets the category_ids of this GetOfferMappingsRequest.

        Фильтр по категориям на Маркете.

        :param category_ids: The category_ids of this GetOfferMappingsRequest.
        :type category_ids: List[int]
        """
        if category_ids is not None and len(category_ids) < 1:
            raise ValueError("Invalid value for `category_ids`, number of items must be greater than or equal to `1`")

        self._category_ids = category_ids

    @property
    def vendor_names(self):
        """Gets the vendor_names of this GetOfferMappingsRequest.

        Фильтр по брендам.

        :return: The vendor_names of this GetOfferMappingsRequest.
        :rtype: List[str]
        """
        return self._vendor_names

    @vendor_names.setter
    def vendor_names(self, vendor_names):
        """Sets the vendor_names of this GetOfferMappingsRequest.

        Фильтр по брендам.

        :param vendor_names: The vendor_names of this GetOfferMappingsRequest.
        :type vendor_names: List[str]
        """
        if vendor_names is not None and len(vendor_names) < 1:
            raise ValueError("Invalid value for `vendor_names`, number of items must be greater than or equal to `1`")

        self._vendor_names = vendor_names

    @property
    def tags(self):
        """Gets the tags of this GetOfferMappingsRequest.

        Фильтр по тегам.

        :return: The tags of this GetOfferMappingsRequest.
        :rtype: List[str]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """Sets the tags of this GetOfferMappingsRequest.

        Фильтр по тегам.

        :param tags: The tags of this GetOfferMappingsRequest.
        :type tags: List[str]
        """
        if tags is not None and len(tags) < 1:
            raise ValueError("Invalid value for `tags`, number of items must be greater than or equal to `1`")

        self._tags = tags

    @property
    def archived(self):
        """Gets the archived of this GetOfferMappingsRequest.

        Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. 

        :return: The archived of this GetOfferMappingsRequest.
        :rtype: bool
        """
        return self._archived

    @archived.setter
    def archived(self, archived):
        """Sets the archived of this GetOfferMappingsRequest.

        Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. 

        :param archived: The archived of this GetOfferMappingsRequest.
        :type archived: bool
        """

        self._archived = archived
