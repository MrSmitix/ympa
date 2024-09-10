# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.order_cancellation_reason_type import OrderCancellationReasonType  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class AcceptOrderCancellationRequest(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, accepted: bool=None, reason: OrderCancellationReasonType=None):  # noqa: E501
        """AcceptOrderCancellationRequest - a model defined in Swagger

        :param accepted: The accepted of this AcceptOrderCancellationRequest.  # noqa: E501
        :type accepted: bool
        :param reason: The reason of this AcceptOrderCancellationRequest.  # noqa: E501
        :type reason: OrderCancellationReasonType
        """
        self.swagger_types = {
            'accepted': bool,
            'reason': OrderCancellationReasonType
        }

        self.attribute_map = {
            'accepted': 'accepted',
            'reason': 'reason'
        }

        self._accepted = accepted
        self._reason = reason

    @classmethod
    def from_dict(cls, dikt) -> 'AcceptOrderCancellationRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AcceptOrderCancellationRequest of this AcceptOrderCancellationRequest.  # noqa: E501
        :rtype: AcceptOrderCancellationRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def accepted(self) -> bool:
        """Gets the accepted of this AcceptOrderCancellationRequest.

        Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов.   # noqa: E501

        :return: The accepted of this AcceptOrderCancellationRequest.
        :rtype: bool
        """
        return self._accepted

    @accepted.setter
    def accepted(self, accepted: bool):
        """Sets the accepted of this AcceptOrderCancellationRequest.

        Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов.   # noqa: E501

        :param accepted: The accepted of this AcceptOrderCancellationRequest.
        :type accepted: bool
        """
        if accepted is None:
            raise ValueError("Invalid value for `accepted`, must not be `None`")  # noqa: E501

        self._accepted = accepted

    @property
    def reason(self) -> OrderCancellationReasonType:
        """Gets the reason of this AcceptOrderCancellationRequest.


        :return: The reason of this AcceptOrderCancellationRequest.
        :rtype: OrderCancellationReasonType
        """
        return self._reason

    @reason.setter
    def reason(self, reason: OrderCancellationReasonType):
        """Sets the reason of this AcceptOrderCancellationRequest.


        :param reason: The reason of this AcceptOrderCancellationRequest.
        :type reason: OrderCancellationReasonType
        """

        self._reason = reason
