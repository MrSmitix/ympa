# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.flipping_pager_dto import FlippingPagerDTO  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.forward_scrolling_pager_dto import ForwardScrollingPagerDTO  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.order_dto import OrderDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class GetOrdersResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, pager: FlippingPagerDTO=None, orders: List[OrderDTO]=None, paging: ForwardScrollingPagerDTO=None):  # noqa: E501
        """GetOrdersResponse - a model defined in Swagger

        :param pager: The pager of this GetOrdersResponse.  # noqa: E501
        :type pager: FlippingPagerDTO
        :param orders: The orders of this GetOrdersResponse.  # noqa: E501
        :type orders: List[OrderDTO]
        :param paging: The paging of this GetOrdersResponse.  # noqa: E501
        :type paging: ForwardScrollingPagerDTO
        """
        self.swagger_types = {
            'pager': FlippingPagerDTO,
            'orders': List[OrderDTO],
            'paging': ForwardScrollingPagerDTO
        }

        self.attribute_map = {
            'pager': 'pager',
            'orders': 'orders',
            'paging': 'paging'
        }

        self._pager = pager
        self._orders = orders
        self._paging = paging

    @classmethod
    def from_dict(cls, dikt) -> 'GetOrdersResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetOrdersResponse of this GetOrdersResponse.  # noqa: E501
        :rtype: GetOrdersResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pager(self) -> FlippingPagerDTO:
        """Gets the pager of this GetOrdersResponse.


        :return: The pager of this GetOrdersResponse.
        :rtype: FlippingPagerDTO
        """
        return self._pager

    @pager.setter
    def pager(self, pager: FlippingPagerDTO):
        """Sets the pager of this GetOrdersResponse.


        :param pager: The pager of this GetOrdersResponse.
        :type pager: FlippingPagerDTO
        """

        self._pager = pager

    @property
    def orders(self) -> List[OrderDTO]:
        """Gets the orders of this GetOrdersResponse.

        Модель заказа.   # noqa: E501

        :return: The orders of this GetOrdersResponse.
        :rtype: List[OrderDTO]
        """
        return self._orders

    @orders.setter
    def orders(self, orders: List[OrderDTO]):
        """Sets the orders of this GetOrdersResponse.

        Модель заказа.   # noqa: E501

        :param orders: The orders of this GetOrdersResponse.
        :type orders: List[OrderDTO]
        """
        if orders is None:
            raise ValueError("Invalid value for `orders`, must not be `None`")  # noqa: E501

        self._orders = orders

    @property
    def paging(self) -> ForwardScrollingPagerDTO:
        """Gets the paging of this GetOrdersResponse.


        :return: The paging of this GetOrdersResponse.
        :rtype: ForwardScrollingPagerDTO
        """
        return self._paging

    @paging.setter
    def paging(self, paging: ForwardScrollingPagerDTO):
        """Sets the paging of this GetOrdersResponse.


        :param paging: The paging of this GetOrdersResponse.
        :type paging: ForwardScrollingPagerDTO
        """

        self._paging = paging