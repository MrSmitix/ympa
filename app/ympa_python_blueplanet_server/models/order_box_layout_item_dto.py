# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.brief_order_item_instance_dto import BriefOrderItemInstanceDTO  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.order_box_layout_partial_count_dto import OrderBoxLayoutPartialCountDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class OrderBoxLayoutItemDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, full_count: int=None, partial_count: OrderBoxLayoutPartialCountDTO=None, instances: List[BriefOrderItemInstanceDTO]=None):  # noqa: E501
        """OrderBoxLayoutItemDTO - a model defined in Swagger

        :param id: The id of this OrderBoxLayoutItemDTO.  # noqa: E501
        :type id: int
        :param full_count: The full_count of this OrderBoxLayoutItemDTO.  # noqa: E501
        :type full_count: int
        :param partial_count: The partial_count of this OrderBoxLayoutItemDTO.  # noqa: E501
        :type partial_count: OrderBoxLayoutPartialCountDTO
        :param instances: The instances of this OrderBoxLayoutItemDTO.  # noqa: E501
        :type instances: List[BriefOrderItemInstanceDTO]
        """
        self.swagger_types = {
            'id': int,
            'full_count': int,
            'partial_count': OrderBoxLayoutPartialCountDTO,
            'instances': List[BriefOrderItemInstanceDTO]
        }

        self.attribute_map = {
            'id': 'id',
            'full_count': 'fullCount',
            'partial_count': 'partialCount',
            'instances': 'instances'
        }

        self._id = id
        self._full_count = full_count
        self._partial_count = partial_count
        self._instances = instances

    @classmethod
    def from_dict(cls, dikt) -> 'OrderBoxLayoutItemDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrderBoxLayoutItemDTO of this OrderBoxLayoutItemDTO.  # noqa: E501
        :rtype: OrderBoxLayoutItemDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """Gets the id of this OrderBoxLayoutItemDTO.

        Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}     # noqa: E501

        :return: The id of this OrderBoxLayoutItemDTO.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this OrderBoxLayoutItemDTO.

        Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}     # noqa: E501

        :param id: The id of this OrderBoxLayoutItemDTO.
        :type id: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def full_count(self) -> int:
        """Gets the full_count of this OrderBoxLayoutItemDTO.

        Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`.   # noqa: E501

        :return: The full_count of this OrderBoxLayoutItemDTO.
        :rtype: int
        """
        return self._full_count

    @full_count.setter
    def full_count(self, full_count: int):
        """Sets the full_count of this OrderBoxLayoutItemDTO.

        Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`.   # noqa: E501

        :param full_count: The full_count of this OrderBoxLayoutItemDTO.
        :type full_count: int
        """
        if full_count is not None and full_count < 1:  # noqa: E501
            raise ValueError("Invalid value for `full_count`, must be a value greater than or equal to `1`")  # noqa: E501

        self._full_count = full_count

    @property
    def partial_count(self) -> OrderBoxLayoutPartialCountDTO:
        """Gets the partial_count of this OrderBoxLayoutItemDTO.


        :return: The partial_count of this OrderBoxLayoutItemDTO.
        :rtype: OrderBoxLayoutPartialCountDTO
        """
        return self._partial_count

    @partial_count.setter
    def partial_count(self, partial_count: OrderBoxLayoutPartialCountDTO):
        """Sets the partial_count of this OrderBoxLayoutItemDTO.


        :param partial_count: The partial_count of this OrderBoxLayoutItemDTO.
        :type partial_count: OrderBoxLayoutPartialCountDTO
        """

        self._partial_count = partial_count

    @property
    def instances(self) -> List[BriefOrderItemInstanceDTO]:
        """Gets the instances of this OrderBoxLayoutItemDTO.

        Переданные вами коды маркировки.  # noqa: E501

        :return: The instances of this OrderBoxLayoutItemDTO.
        :rtype: List[BriefOrderItemInstanceDTO]
        """
        return self._instances

    @instances.setter
    def instances(self, instances: List[BriefOrderItemInstanceDTO]):
        """Sets the instances of this OrderBoxLayoutItemDTO.

        Переданные вами коды маркировки.  # noqa: E501

        :param instances: The instances of this OrderBoxLayoutItemDTO.
        :type instances: List[BriefOrderItemInstanceDTO]
        """

        self._instances = instances
