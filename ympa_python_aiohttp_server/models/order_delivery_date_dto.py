# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server import util


class OrderDeliveryDateDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, to_date: date=None):
        """OrderDeliveryDateDTO - a model defined in OpenAPI

        :param to_date: The to_date of this OrderDeliveryDateDTO.
        """
        self.openapi_types = {
            'to_date': date
        }

        self.attribute_map = {
            'to_date': 'toDate'
        }

        self._to_date = to_date

    @classmethod
    def from_dict(cls, dikt: dict) -> 'OrderDeliveryDateDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The OrderDeliveryDateDTO of this OrderDeliveryDateDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def to_date(self):
        """Gets the to_date of this OrderDeliveryDateDTO.

        Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. 

        :return: The to_date of this OrderDeliveryDateDTO.
        :rtype: date
        """
        return self._to_date

    @to_date.setter
    def to_date(self, to_date):
        """Sets the to_date of this OrderDeliveryDateDTO.

        Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. 

        :param to_date: The to_date of this OrderDeliveryDateDTO.
        :type to_date: date
        """
        if to_date is None:
            raise ValueError("Invalid value for `to_date`, must not be `None`")

        self._to_date = to_date
