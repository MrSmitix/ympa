from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.order_item_instance_modification_dto import OrderItemInstanceModificationDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.order_item_instance_modification_dto import OrderItemInstanceModificationDTO  # noqa: E501

class ProvideOrderItemIdentifiersRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, items=None):  # noqa: E501
        """ProvideOrderItemIdentifiersRequest - a model defined in OpenAPI

        :param items: The items of this ProvideOrderItemIdentifiersRequest.  # noqa: E501
        :type items: List[OrderItemInstanceModificationDTO]
        """
        self.openapi_types = {
            'items': List[OrderItemInstanceModificationDTO]
        }

        self.attribute_map = {
            'items': 'items'
        }

        self._items = items

    @classmethod
    def from_dict(cls, dikt) -> 'ProvideOrderItemIdentifiersRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ProvideOrderItemIdentifiersRequest of this ProvideOrderItemIdentifiersRequest.  # noqa: E501
        :rtype: ProvideOrderItemIdentifiersRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def items(self) -> List[OrderItemInstanceModificationDTO]:
        """Gets the items of this ProvideOrderItemIdentifiersRequest.

        Список позиций, требующих маркировки.   # noqa: E501

        :return: The items of this ProvideOrderItemIdentifiersRequest.
        :rtype: List[OrderItemInstanceModificationDTO]
        """
        return self._items

    @items.setter
    def items(self, items: List[OrderItemInstanceModificationDTO]):
        """Sets the items of this ProvideOrderItemIdentifiersRequest.

        Список позиций, требующих маркировки.   # noqa: E501

        :param items: The items of this ProvideOrderItemIdentifiersRequest.
        :type items: List[OrderItemInstanceModificationDTO]
        """
        if items is None:
            raise ValueError("Invalid value for `items`, must not be `None`")  # noqa: E501

        self._items = items