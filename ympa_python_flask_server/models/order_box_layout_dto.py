from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.order_box_layout_item_dto import OrderBoxLayoutItemDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.order_box_layout_item_dto import OrderBoxLayoutItemDTO  # noqa: E501

class OrderBoxLayoutDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, items=None):  # noqa: E501
        """OrderBoxLayoutDTO - a model defined in OpenAPI

        :param items: The items of this OrderBoxLayoutDTO.  # noqa: E501
        :type items: List[OrderBoxLayoutItemDTO]
        """
        self.openapi_types = {
            'items': List[OrderBoxLayoutItemDTO]
        }

        self.attribute_map = {
            'items': 'items'
        }

        self._items = items

    @classmethod
    def from_dict(cls, dikt) -> 'OrderBoxLayoutDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrderBoxLayoutDTO of this OrderBoxLayoutDTO.  # noqa: E501
        :rtype: OrderBoxLayoutDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def items(self) -> List[OrderBoxLayoutItemDTO]:
        """Gets the items of this OrderBoxLayoutDTO.

        Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.   # noqa: E501

        :return: The items of this OrderBoxLayoutDTO.
        :rtype: List[OrderBoxLayoutItemDTO]
        """
        return self._items

    @items.setter
    def items(self, items: List[OrderBoxLayoutItemDTO]):
        """Sets the items of this OrderBoxLayoutDTO.

        Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.   # noqa: E501

        :param items: The items of this OrderBoxLayoutDTO.
        :type items: List[OrderBoxLayoutItemDTO]
        """
        if items is None:
            raise ValueError("Invalid value for `items`, must not be `None`")  # noqa: E501
        if items is not None and len(items) < 1:
            raise ValueError("Invalid value for `items`, number of items must be greater than or equal to `1`")  # noqa: E501

        self._items = items