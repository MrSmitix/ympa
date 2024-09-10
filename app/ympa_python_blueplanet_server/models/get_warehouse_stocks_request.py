# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from ympa_python_blueplanet_server import util


class GetWarehouseStocksRequest(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, with_turnover: bool=False, archived: bool=None, offer_ids: list[str]=None):  # noqa: E501
        """GetWarehouseStocksRequest - a model defined in Swagger

        :param with_turnover: The with_turnover of this GetWarehouseStocksRequest.  # noqa: E501
        :type with_turnover: bool
        :param archived: The archived of this GetWarehouseStocksRequest.  # noqa: E501
        :type archived: bool
        :param offer_ids: The offer_ids of this GetWarehouseStocksRequest.  # noqa: E501
        :type offer_ids: list[str]
        """
        self.swagger_types = {
            'with_turnover': bool,
            'archived': bool,
            'offer_ids': list[str]
        }

        self.attribute_map = {
            'with_turnover': 'withTurnover',
            'archived': 'archived',
            'offer_ids': 'offerIds'
        }

        self._with_turnover = with_turnover
        self._archived = archived
        self._offer_ids = offer_ids

    @classmethod
    def from_dict(cls, dikt) -> 'GetWarehouseStocksRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetWarehouseStocksRequest of this GetWarehouseStocksRequest.  # noqa: E501
        :rtype: GetWarehouseStocksRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def with_turnover(self) -> bool:
        """Gets the with_turnover of this GetWarehouseStocksRequest.

        **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`.   # noqa: E501

        :return: The with_turnover of this GetWarehouseStocksRequest.
        :rtype: bool
        """
        return self._with_turnover

    @with_turnover.setter
    def with_turnover(self, with_turnover: bool):
        """Sets the with_turnover of this GetWarehouseStocksRequest.

        **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`.   # noqa: E501

        :param with_turnover: The with_turnover of this GetWarehouseStocksRequest.
        :type with_turnover: bool
        """

        self._with_turnover = with_turnover

    @property
    def archived(self) -> bool:
        """Gets the archived of this GetWarehouseStocksRequest.

        Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве.   # noqa: E501

        :return: The archived of this GetWarehouseStocksRequest.
        :rtype: bool
        """
        return self._archived

    @archived.setter
    def archived(self, archived: bool):
        """Sets the archived of this GetWarehouseStocksRequest.

        Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве.   # noqa: E501

        :param archived: The archived of this GetWarehouseStocksRequest.
        :type archived: bool
        """

        self._archived = archived

    @property
    def offer_ids(self) -> list[str]:
        """Gets the offer_ids of this GetWarehouseStocksRequest.

        Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {% endnote %}      # noqa: E501

        :return: The offer_ids of this GetWarehouseStocksRequest.
        :rtype: list[str]
        """
        return self._offer_ids

    @offer_ids.setter
    def offer_ids(self, offer_ids: list[str]):
        """Sets the offer_ids of this GetWarehouseStocksRequest.

        Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {% endnote %}      # noqa: E501

        :param offer_ids: The offer_ids of this GetWarehouseStocksRequest.
        :type offer_ids: list[str]
        """
        if offer_ids is not None and len(offer_ids) > 500:
            raise ValueError("Invalid value for `offer_ids`, number of items must be less than or equal to `500`")  # noqa: E501

        self._offer_ids = offer_ids
