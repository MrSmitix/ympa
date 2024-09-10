# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from ympa_python_blueplanet_server import util


class OrderStatusType(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    PLACING = 'PLACING'
    RESERVED = 'RESERVED'
    UNPAID = 'UNPAID'
    PROCESSING = 'PROCESSING'
    DELIVERY = 'DELIVERY'
    PICKUP = 'PICKUP'
    DELIVERED = 'DELIVERED'
    CANCELLED = 'CANCELLED'
    PENDING = 'PENDING'
    PARTIALLY_RETURNED = 'PARTIALLY_RETURNED'
    RETURNED = 'RETURNED'
    UNKNOWN = 'UNKNOWN'

    def __init__(self):  # noqa: E501
        """OrderStatusType - a model defined in Swagger

        """
        self.swagger_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'OrderStatusType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrderStatusType of this OrderStatusType.  # noqa: E501
        :rtype: OrderStatusType
        """
        return util.deserialize_model(dikt, cls)
