# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.order_state_dto import OrderStateDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class UpdateOrderStatusesRequest(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, orders: List[OrderStateDTO]=None):  # noqa: E501
        """UpdateOrderStatusesRequest - a model defined in Swagger

        :param orders: The orders of this UpdateOrderStatusesRequest.  # noqa: E501
        :type orders: List[OrderStateDTO]
        """
        self.swagger_types = {
            'orders': List[OrderStateDTO]
        }

        self.attribute_map = {
            'orders': 'orders'
        }

        self._orders = orders

    @classmethod
    def from_dict(cls, dikt) -> 'UpdateOrderStatusesRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UpdateOrderStatusesRequest of this UpdateOrderStatusesRequest.  # noqa: E501
        :rtype: UpdateOrderStatusesRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def orders(self) -> List[OrderStateDTO]:
        """Gets the orders of this UpdateOrderStatusesRequest.

        Список заказов.  # noqa: E501

        :return: The orders of this UpdateOrderStatusesRequest.
        :rtype: List[OrderStateDTO]
        """
        return self._orders

    @orders.setter
    def orders(self, orders: List[OrderStateDTO]):
        """Sets the orders of this UpdateOrderStatusesRequest.

        Список заказов.  # noqa: E501

        :param orders: The orders of this UpdateOrderStatusesRequest.
        :type orders: List[OrderStateDTO]
        """
        if orders is None:
            raise ValueError("Invalid value for `orders`, must not be `None`")  # noqa: E501
        if orders is not None and len(orders) > 30:
            raise ValueError("Invalid value for `orders`, number of items must be less than or equal to `30`")  # noqa: E501
        if orders is not None and len(orders) < 1:
            raise ValueError("Invalid value for `orders`, number of items must be greater than or equal to `1`")  # noqa: E501

        self._orders = orders