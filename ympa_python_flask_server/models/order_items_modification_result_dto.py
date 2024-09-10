from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.brief_order_item_dto import BriefOrderItemDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.brief_order_item_dto import BriefOrderItemDTO  # noqa: E501

class OrderItemsModificationResultDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, items=None):  # noqa: E501
        """OrderItemsModificationResultDTO - a model defined in OpenAPI

        :param items: The items of this OrderItemsModificationResultDTO.  # noqa: E501
        :type items: List[BriefOrderItemDTO]
        """
        self.openapi_types = {
            'items': List[BriefOrderItemDTO]
        }

        self.attribute_map = {
            'items': 'items'
        }

        self._items = items

    @classmethod
    def from_dict(cls, dikt) -> 'OrderItemsModificationResultDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrderItemsModificationResultDTO of this OrderItemsModificationResultDTO.  # noqa: E501
        :rtype: OrderItemsModificationResultDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def items(self) -> List[BriefOrderItemDTO]:
        """Gets the items of this OrderItemsModificationResultDTO.

        Список позиций в заказе, подлежащих маркировке.  # noqa: E501

        :return: The items of this OrderItemsModificationResultDTO.
        :rtype: List[BriefOrderItemDTO]
        """
        return self._items

    @items.setter
    def items(self, items: List[BriefOrderItemDTO]):
        """Sets the items of this OrderItemsModificationResultDTO.

        Список позиций в заказе, подлежащих маркировке.  # noqa: E501

        :param items: The items of this OrderItemsModificationResultDTO.
        :type items: List[BriefOrderItemDTO]
        """
        if items is None:
            raise ValueError("Invalid value for `items`, must not be `None`")  # noqa: E501

        self._items = items