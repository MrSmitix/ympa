# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from ympa_python_blueplanet_server import util


class TransferOrdersFromShipmentRequest(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, order_ids: List[int]=None):  # noqa: E501
        """TransferOrdersFromShipmentRequest - a model defined in Swagger

        :param order_ids: The order_ids of this TransferOrdersFromShipmentRequest.  # noqa: E501
        :type order_ids: List[int]
        """
        self.swagger_types = {
            'order_ids': List[int]
        }

        self.attribute_map = {
            'order_ids': 'orderIds'
        }

        self._order_ids = order_ids

    @classmethod
    def from_dict(cls, dikt) -> 'TransferOrdersFromShipmentRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TransferOrdersFromShipmentRequest of this TransferOrdersFromShipmentRequest.  # noqa: E501
        :rtype: TransferOrdersFromShipmentRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def order_ids(self) -> List[int]:
        """Gets the order_ids of this TransferOrdersFromShipmentRequest.

        Список заказов, которые вы не успеваете подготовить.  # noqa: E501

        :return: The order_ids of this TransferOrdersFromShipmentRequest.
        :rtype: List[int]
        """
        return self._order_ids

    @order_ids.setter
    def order_ids(self, order_ids: List[int]):
        """Sets the order_ids of this TransferOrdersFromShipmentRequest.

        Список заказов, которые вы не успеваете подготовить.  # noqa: E501

        :param order_ids: The order_ids of this TransferOrdersFromShipmentRequest.
        :type order_ids: List[int]
        """
        if order_ids is None:
            raise ValueError("Invalid value for `order_ids`, must not be `None`")  # noqa: E501
        if order_ids is not None and len(order_ids) > 500:
            raise ValueError("Invalid value for `order_ids`, number of items must be less than or equal to `500`")  # noqa: E501
        if order_ids is not None and len(order_ids) < 1:
            raise ValueError("Invalid value for `order_ids`, number of items must be greater than or equal to `1`")  # noqa: E501

        self._order_ids = order_ids