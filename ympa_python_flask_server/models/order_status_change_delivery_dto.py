from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.order_status_change_delivery_dates_dto import OrderStatusChangeDeliveryDatesDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.order_status_change_delivery_dates_dto import OrderStatusChangeDeliveryDatesDTO  # noqa: E501

class OrderStatusChangeDeliveryDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, dates=None):  # noqa: E501
        """OrderStatusChangeDeliveryDTO - a model defined in OpenAPI

        :param dates: The dates of this OrderStatusChangeDeliveryDTO.  # noqa: E501
        :type dates: OrderStatusChangeDeliveryDatesDTO
        """
        self.openapi_types = {
            'dates': OrderStatusChangeDeliveryDatesDTO
        }

        self.attribute_map = {
            'dates': 'dates'
        }

        self._dates = dates

    @classmethod
    def from_dict(cls, dikt) -> 'OrderStatusChangeDeliveryDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrderStatusChangeDeliveryDTO of this OrderStatusChangeDeliveryDTO.  # noqa: E501
        :rtype: OrderStatusChangeDeliveryDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def dates(self) -> OrderStatusChangeDeliveryDatesDTO:
        """Gets the dates of this OrderStatusChangeDeliveryDTO.


        :return: The dates of this OrderStatusChangeDeliveryDTO.
        :rtype: OrderStatusChangeDeliveryDatesDTO
        """
        return self._dates

    @dates.setter
    def dates(self, dates: OrderStatusChangeDeliveryDatesDTO):
        """Sets the dates of this OrderStatusChangeDeliveryDTO.


        :param dates: The dates of this OrderStatusChangeDeliveryDTO.
        :type dates: OrderStatusChangeDeliveryDatesDTO
        """

        self._dates = dates