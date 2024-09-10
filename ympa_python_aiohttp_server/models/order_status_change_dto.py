# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.order_status_change_delivery_dto import OrderStatusChangeDeliveryDTO
from ympa_python_aiohttp_server.models.order_status_type import OrderStatusType
from ympa_python_aiohttp_server.models.order_substatus_type import OrderSubstatusType
from ympa_python_aiohttp_server import util


class OrderStatusChangeDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status: OrderStatusType=None, substatus: OrderSubstatusType=None, delivery: OrderStatusChangeDeliveryDTO=None):
        """OrderStatusChangeDTO - a model defined in OpenAPI

        :param status: The status of this OrderStatusChangeDTO.
        :param substatus: The substatus of this OrderStatusChangeDTO.
        :param delivery: The delivery of this OrderStatusChangeDTO.
        """
        self.openapi_types = {
            'status': OrderStatusType,
            'substatus': OrderSubstatusType,
            'delivery': OrderStatusChangeDeliveryDTO
        }

        self.attribute_map = {
            'status': 'status',
            'substatus': 'substatus',
            'delivery': 'delivery'
        }

        self._status = status
        self._substatus = substatus
        self._delivery = delivery

    @classmethod
    def from_dict(cls, dikt: dict) -> 'OrderStatusChangeDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The OrderStatusChangeDTO of this OrderStatusChangeDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self):
        """Gets the status of this OrderStatusChangeDTO.


        :return: The status of this OrderStatusChangeDTO.
        :rtype: OrderStatusType
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this OrderStatusChangeDTO.


        :param status: The status of this OrderStatusChangeDTO.
        :type status: OrderStatusType
        """
        if status is None:
            raise ValueError("Invalid value for `status`, must not be `None`")

        self._status = status

    @property
    def substatus(self):
        """Gets the substatus of this OrderStatusChangeDTO.


        :return: The substatus of this OrderStatusChangeDTO.
        :rtype: OrderSubstatusType
        """
        return self._substatus

    @substatus.setter
    def substatus(self, substatus):
        """Sets the substatus of this OrderStatusChangeDTO.


        :param substatus: The substatus of this OrderStatusChangeDTO.
        :type substatus: OrderSubstatusType
        """

        self._substatus = substatus

    @property
    def delivery(self):
        """Gets the delivery of this OrderStatusChangeDTO.


        :return: The delivery of this OrderStatusChangeDTO.
        :rtype: OrderStatusChangeDeliveryDTO
        """
        return self._delivery

    @delivery.setter
    def delivery(self, delivery):
        """Sets the delivery of this OrderStatusChangeDTO.


        :param delivery: The delivery of this OrderStatusChangeDTO.
        :type delivery: OrderStatusChangeDeliveryDTO
        """

        self._delivery = delivery
