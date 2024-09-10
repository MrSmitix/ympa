# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from ympa_python_blueplanet_server import util


class UpdateOrderStorageLimitRequest(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, new_date: date=None):  # noqa: E501
        """UpdateOrderStorageLimitRequest - a model defined in Swagger

        :param new_date: The new_date of this UpdateOrderStorageLimitRequest.  # noqa: E501
        :type new_date: date
        """
        self.swagger_types = {
            'new_date': date
        }

        self.attribute_map = {
            'new_date': 'newDate'
        }

        self._new_date = new_date

    @classmethod
    def from_dict(cls, dikt) -> 'UpdateOrderStorageLimitRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UpdateOrderStorageLimitRequest of this UpdateOrderStorageLimitRequest.  # noqa: E501
        :rtype: UpdateOrderStorageLimitRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def new_date(self) -> date:
        """Gets the new_date of this UpdateOrderStorageLimitRequest.

        Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`.   # noqa: E501

        :return: The new_date of this UpdateOrderStorageLimitRequest.
        :rtype: date
        """
        return self._new_date

    @new_date.setter
    def new_date(self, new_date: date):
        """Sets the new_date of this UpdateOrderStorageLimitRequest.

        Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`.   # noqa: E501

        :param new_date: The new_date of this UpdateOrderStorageLimitRequest.
        :type new_date: date
        """
        if new_date is None:
            raise ValueError("Invalid value for `new_date`, must not be `None`")  # noqa: E501

        self._new_date = new_date