# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.brief_order_item_instance_dto import BriefOrderItemInstanceDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class OrderItemModificationDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, count: int=None, instances: List[BriefOrderItemInstanceDTO]=None):  # noqa: E501
        """OrderItemModificationDTO - a model defined in Swagger

        :param id: The id of this OrderItemModificationDTO.  # noqa: E501
        :type id: int
        :param count: The count of this OrderItemModificationDTO.  # noqa: E501
        :type count: int
        :param instances: The instances of this OrderItemModificationDTO.  # noqa: E501
        :type instances: List[BriefOrderItemInstanceDTO]
        """
        self.swagger_types = {
            'id': int,
            'count': int,
            'instances': List[BriefOrderItemInstanceDTO]
        }

        self.attribute_map = {
            'id': 'id',
            'count': 'count',
            'instances': 'instances'
        }

        self._id = id
        self._count = count
        self._instances = instances

    @classmethod
    def from_dict(cls, dikt) -> 'OrderItemModificationDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrderItemModificationDTO of this OrderItemModificationDTO.  # noqa: E501
        :rtype: OrderItemModificationDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """Gets the id of this OrderItemModificationDTO.

        Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр.   # noqa: E501

        :return: The id of this OrderItemModificationDTO.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this OrderItemModificationDTO.

        Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр.   # noqa: E501

        :param id: The id of this OrderItemModificationDTO.
        :type id: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def count(self) -> int:
        """Gets the count of this OrderItemModificationDTO.

        Новое количество товара.  # noqa: E501

        :return: The count of this OrderItemModificationDTO.
        :rtype: int
        """
        return self._count

    @count.setter
    def count(self, count: int):
        """Sets the count of this OrderItemModificationDTO.

        Новое количество товара.  # noqa: E501

        :param count: The count of this OrderItemModificationDTO.
        :type count: int
        """
        if count is None:
            raise ValueError("Invalid value for `count`, must not be `None`")  # noqa: E501
        if count is not None and count < 0:  # noqa: E501
            raise ValueError("Invalid value for `count`, must be a value greater than or equal to `0`")  # noqa: E501

        self._count = count

    @property
    def instances(self) -> List[BriefOrderItemInstanceDTO]:
        """Gets the instances of this OrderItemModificationDTO.

        Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/).   # noqa: E501

        :return: The instances of this OrderItemModificationDTO.
        :rtype: List[BriefOrderItemInstanceDTO]
        """
        return self._instances

    @instances.setter
    def instances(self, instances: List[BriefOrderItemInstanceDTO]):
        """Sets the instances of this OrderItemModificationDTO.

        Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/).   # noqa: E501

        :param instances: The instances of this OrderItemModificationDTO.
        :type instances: List[BriefOrderItemInstanceDTO]
        """

        self._instances = instances
