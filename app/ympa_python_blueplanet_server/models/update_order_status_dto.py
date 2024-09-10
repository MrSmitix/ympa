# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.order_status_type import OrderStatusType  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.order_substatus_type import OrderSubstatusType  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.order_update_status_type import OrderUpdateStatusType  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class UpdateOrderStatusDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, status: OrderStatusType=None, substatus: OrderSubstatusType=None, update_status: OrderUpdateStatusType=None, error_details: str=None):  # noqa: E501
        """UpdateOrderStatusDTO - a model defined in Swagger

        :param id: The id of this UpdateOrderStatusDTO.  # noqa: E501
        :type id: int
        :param status: The status of this UpdateOrderStatusDTO.  # noqa: E501
        :type status: OrderStatusType
        :param substatus: The substatus of this UpdateOrderStatusDTO.  # noqa: E501
        :type substatus: OrderSubstatusType
        :param update_status: The update_status of this UpdateOrderStatusDTO.  # noqa: E501
        :type update_status: OrderUpdateStatusType
        :param error_details: The error_details of this UpdateOrderStatusDTO.  # noqa: E501
        :type error_details: str
        """
        self.swagger_types = {
            'id': int,
            'status': OrderStatusType,
            'substatus': OrderSubstatusType,
            'update_status': OrderUpdateStatusType,
            'error_details': str
        }

        self.attribute_map = {
            'id': 'id',
            'status': 'status',
            'substatus': 'substatus',
            'update_status': 'updateStatus',
            'error_details': 'errorDetails'
        }

        self._id = id
        self._status = status
        self._substatus = substatus
        self._update_status = update_status
        self._error_details = error_details

    @classmethod
    def from_dict(cls, dikt) -> 'UpdateOrderStatusDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UpdateOrderStatusDTO of this UpdateOrderStatusDTO.  # noqa: E501
        :rtype: UpdateOrderStatusDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """Gets the id of this UpdateOrderStatusDTO.

        Идентификатор заказа.  # noqa: E501

        :return: The id of this UpdateOrderStatusDTO.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this UpdateOrderStatusDTO.

        Идентификатор заказа.  # noqa: E501

        :param id: The id of this UpdateOrderStatusDTO.
        :type id: int
        """

        self._id = id

    @property
    def status(self) -> OrderStatusType:
        """Gets the status of this UpdateOrderStatusDTO.


        :return: The status of this UpdateOrderStatusDTO.
        :rtype: OrderStatusType
        """
        return self._status

    @status.setter
    def status(self, status: OrderStatusType):
        """Sets the status of this UpdateOrderStatusDTO.


        :param status: The status of this UpdateOrderStatusDTO.
        :type status: OrderStatusType
        """

        self._status = status

    @property
    def substatus(self) -> OrderSubstatusType:
        """Gets the substatus of this UpdateOrderStatusDTO.


        :return: The substatus of this UpdateOrderStatusDTO.
        :rtype: OrderSubstatusType
        """
        return self._substatus

    @substatus.setter
    def substatus(self, substatus: OrderSubstatusType):
        """Sets the substatus of this UpdateOrderStatusDTO.


        :param substatus: The substatus of this UpdateOrderStatusDTO.
        :type substatus: OrderSubstatusType
        """

        self._substatus = substatus

    @property
    def update_status(self) -> OrderUpdateStatusType:
        """Gets the update_status of this UpdateOrderStatusDTO.


        :return: The update_status of this UpdateOrderStatusDTO.
        :rtype: OrderUpdateStatusType
        """
        return self._update_status

    @update_status.setter
    def update_status(self, update_status: OrderUpdateStatusType):
        """Sets the update_status of this UpdateOrderStatusDTO.


        :param update_status: The update_status of this UpdateOrderStatusDTO.
        :type update_status: OrderUpdateStatusType
        """

        self._update_status = update_status

    @property
    def error_details(self) -> str:
        """Gets the error_details of this UpdateOrderStatusDTO.

        Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`.   # noqa: E501

        :return: The error_details of this UpdateOrderStatusDTO.
        :rtype: str
        """
        return self._error_details

    @error_details.setter
    def error_details(self, error_details: str):
        """Sets the error_details of this UpdateOrderStatusDTO.

        Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`.   # noqa: E501

        :param error_details: The error_details of this UpdateOrderStatusDTO.
        :type error_details: str
        """

        self._error_details = error_details
