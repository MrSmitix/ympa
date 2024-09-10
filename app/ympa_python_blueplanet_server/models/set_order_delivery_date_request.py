# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.order_delivery_date_dto import OrderDeliveryDateDTO  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.order_delivery_date_reason_type import OrderDeliveryDateReasonType  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class SetOrderDeliveryDateRequest(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, dates: OrderDeliveryDateDTO=None, reason: OrderDeliveryDateReasonType=None):  # noqa: E501
        """SetOrderDeliveryDateRequest - a model defined in Swagger

        :param dates: The dates of this SetOrderDeliveryDateRequest.  # noqa: E501
        :type dates: OrderDeliveryDateDTO
        :param reason: The reason of this SetOrderDeliveryDateRequest.  # noqa: E501
        :type reason: OrderDeliveryDateReasonType
        """
        self.swagger_types = {
            'dates': OrderDeliveryDateDTO,
            'reason': OrderDeliveryDateReasonType
        }

        self.attribute_map = {
            'dates': 'dates',
            'reason': 'reason'
        }

        self._dates = dates
        self._reason = reason

    @classmethod
    def from_dict(cls, dikt) -> 'SetOrderDeliveryDateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SetOrderDeliveryDateRequest of this SetOrderDeliveryDateRequest.  # noqa: E501
        :rtype: SetOrderDeliveryDateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def dates(self) -> OrderDeliveryDateDTO:
        """Gets the dates of this SetOrderDeliveryDateRequest.


        :return: The dates of this SetOrderDeliveryDateRequest.
        :rtype: OrderDeliveryDateDTO
        """
        return self._dates

    @dates.setter
    def dates(self, dates: OrderDeliveryDateDTO):
        """Sets the dates of this SetOrderDeliveryDateRequest.


        :param dates: The dates of this SetOrderDeliveryDateRequest.
        :type dates: OrderDeliveryDateDTO
        """
        if dates is None:
            raise ValueError("Invalid value for `dates`, must not be `None`")  # noqa: E501

        self._dates = dates

    @property
    def reason(self) -> OrderDeliveryDateReasonType:
        """Gets the reason of this SetOrderDeliveryDateRequest.


        :return: The reason of this SetOrderDeliveryDateRequest.
        :rtype: OrderDeliveryDateReasonType
        """
        return self._reason

    @reason.setter
    def reason(self, reason: OrderDeliveryDateReasonType):
        """Sets the reason of this SetOrderDeliveryDateRequest.


        :param reason: The reason of this SetOrderDeliveryDateRequest.
        :type reason: OrderDeliveryDateReasonType
        """
        if reason is None:
            raise ValueError("Invalid value for `reason`, must not be `None`")  # noqa: E501

        self._reason = reason