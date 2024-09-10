# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.order_dto import OrderDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class UpdateOrderStatusResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, order: OrderDTO=None):  # noqa: E501
        """UpdateOrderStatusResponse - a model defined in Swagger

        :param order: The order of this UpdateOrderStatusResponse.  # noqa: E501
        :type order: OrderDTO
        """
        self.swagger_types = {
            'order': OrderDTO
        }

        self.attribute_map = {
            'order': 'order'
        }

        self._order = order

    @classmethod
    def from_dict(cls, dikt) -> 'UpdateOrderStatusResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UpdateOrderStatusResponse of this UpdateOrderStatusResponse.  # noqa: E501
        :rtype: UpdateOrderStatusResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def order(self) -> OrderDTO:
        """Gets the order of this UpdateOrderStatusResponse.


        :return: The order of this UpdateOrderStatusResponse.
        :rtype: OrderDTO
        """
        return self._order

    @order.setter
    def order(self, order: OrderDTO):
        """Sets the order of this UpdateOrderStatusResponse.


        :param order: The order of this UpdateOrderStatusResponse.
        :type order: OrderDTO
        """

        self._order = order