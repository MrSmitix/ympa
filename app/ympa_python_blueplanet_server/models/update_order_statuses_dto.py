# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.update_order_status_dto import UpdateOrderStatusDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class UpdateOrderStatusesDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, orders: List[UpdateOrderStatusDTO]=None):  # noqa: E501
        """UpdateOrderStatusesDTO - a model defined in Swagger

        :param orders: The orders of this UpdateOrderStatusesDTO.  # noqa: E501
        :type orders: List[UpdateOrderStatusDTO]
        """
        self.swagger_types = {
            'orders': List[UpdateOrderStatusDTO]
        }

        self.attribute_map = {
            'orders': 'orders'
        }

        self._orders = orders

    @classmethod
    def from_dict(cls, dikt) -> 'UpdateOrderStatusesDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UpdateOrderStatusesDTO of this UpdateOrderStatusesDTO.  # noqa: E501
        :rtype: UpdateOrderStatusesDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def orders(self) -> List[UpdateOrderStatusDTO]:
        """Gets the orders of this UpdateOrderStatusesDTO.

        Список с обновленными заказами.  # noqa: E501

        :return: The orders of this UpdateOrderStatusesDTO.
        :rtype: List[UpdateOrderStatusDTO]
        """
        return self._orders

    @orders.setter
    def orders(self, orders: List[UpdateOrderStatusDTO]):
        """Sets the orders of this UpdateOrderStatusesDTO.

        Список с обновленными заказами.  # noqa: E501

        :param orders: The orders of this UpdateOrderStatusesDTO.
        :type orders: List[UpdateOrderStatusDTO]
        """
        if orders is None:
            raise ValueError("Invalid value for `orders`, must not be `None`")  # noqa: E501

        self._orders = orders