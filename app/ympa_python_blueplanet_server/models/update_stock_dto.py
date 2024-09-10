# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.update_stock_item_dto import UpdateStockItemDTO  # noqa: F401,E501
import re  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class UpdateStockDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, sku: str=None, items: List[UpdateStockItemDTO]=None):  # noqa: E501
        """UpdateStockDTO - a model defined in Swagger

        :param sku: The sku of this UpdateStockDTO.  # noqa: E501
        :type sku: str
        :param items: The items of this UpdateStockDTO.  # noqa: E501
        :type items: List[UpdateStockItemDTO]
        """
        self.swagger_types = {
            'sku': str,
            'items': List[UpdateStockItemDTO]
        }

        self.attribute_map = {
            'sku': 'sku',
            'items': 'items'
        }

        self._sku = sku
        self._items = items

    @classmethod
    def from_dict(cls, dikt) -> 'UpdateStockDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UpdateStockDTO of this UpdateStockDTO.  # noqa: E501
        :rtype: UpdateStockDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def sku(self) -> str:
        """Gets the sku of this UpdateStockDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :return: The sku of this UpdateStockDTO.
        :rtype: str
        """
        return self._sku

    @sku.setter
    def sku(self, sku: str):
        """Sets the sku of this UpdateStockDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :param sku: The sku of this UpdateStockDTO.
        :type sku: str
        """
        if sku is None:
            raise ValueError("Invalid value for `sku`, must not be `None`")  # noqa: E501
        if sku is not None and len(sku) > 255:
            raise ValueError("Invalid value for `sku`, length must be less than or equal to `255`")  # noqa: E501
        if sku is not None and len(sku) < 1:
            raise ValueError("Invalid value for `sku`, length must be greater than or equal to `1`")  # noqa: E501
        if sku is not None and not re.search(r'^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$', sku):  # noqa: E501
            raise ValueError("Invalid value for `sku`, must be a follow pattern or equal to `/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/`")  # noqa: E501

        self._sku = sku

    @property
    def items(self) -> List[UpdateStockItemDTO]:
        """Gets the items of this UpdateStockDTO.

        Информация об остатках товара.   # noqa: E501

        :return: The items of this UpdateStockDTO.
        :rtype: List[UpdateStockItemDTO]
        """
        return self._items

    @items.setter
    def items(self, items: List[UpdateStockItemDTO]):
        """Sets the items of this UpdateStockDTO.

        Информация об остатках товара.   # noqa: E501

        :param items: The items of this UpdateStockDTO.
        :type items: List[UpdateStockItemDTO]
        """
        if items is None:
            raise ValueError("Invalid value for `items`, must not be `None`")  # noqa: E501
        if items is not None and len(items) > 1:
            raise ValueError("Invalid value for `items`, number of items must be less than or equal to `1`")  # noqa: E501
        if items is not None and len(items) < 1:
            raise ValueError("Invalid value for `items`, number of items must be greater than or equal to `1`")  # noqa: E501

        self._items = items