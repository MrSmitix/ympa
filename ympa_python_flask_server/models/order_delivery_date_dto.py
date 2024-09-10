from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class OrderDeliveryDateDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, to_date=None):  # noqa: E501
        """OrderDeliveryDateDTO - a model defined in OpenAPI

        :param to_date: The to_date of this OrderDeliveryDateDTO.  # noqa: E501
        :type to_date: date
        """
        self.openapi_types = {
            'to_date': date
        }

        self.attribute_map = {
            'to_date': 'toDate'
        }

        self._to_date = to_date

    @classmethod
    def from_dict(cls, dikt) -> 'OrderDeliveryDateDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrderDeliveryDateDTO of this OrderDeliveryDateDTO.  # noqa: E501
        :rtype: OrderDeliveryDateDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def to_date(self) -> date:
        """Gets the to_date of this OrderDeliveryDateDTO.

        Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`.   # noqa: E501

        :return: The to_date of this OrderDeliveryDateDTO.
        :rtype: date
        """
        return self._to_date

    @to_date.setter
    def to_date(self, to_date: date):
        """Sets the to_date of this OrderDeliveryDateDTO.

        Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`.   # noqa: E501

        :param to_date: The to_date of this OrderDeliveryDateDTO.
        :type to_date: date
        """
        if to_date is None:
            raise ValueError("Invalid value for `to_date`, must not be `None`")  # noqa: E501

        self._to_date = to_date