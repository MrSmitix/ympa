from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.order_status_change_dto import OrderStatusChangeDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.order_status_change_dto import OrderStatusChangeDTO  # noqa: E501

class UpdateOrderStatusRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, order=None):  # noqa: E501
        """UpdateOrderStatusRequest - a model defined in OpenAPI

        :param order: The order of this UpdateOrderStatusRequest.  # noqa: E501
        :type order: OrderStatusChangeDTO
        """
        self.openapi_types = {
            'order': OrderStatusChangeDTO
        }

        self.attribute_map = {
            'order': 'order'
        }

        self._order = order

    @classmethod
    def from_dict(cls, dikt) -> 'UpdateOrderStatusRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UpdateOrderStatusRequest of this UpdateOrderStatusRequest.  # noqa: E501
        :rtype: UpdateOrderStatusRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def order(self) -> OrderStatusChangeDTO:
        """Gets the order of this UpdateOrderStatusRequest.


        :return: The order of this UpdateOrderStatusRequest.
        :rtype: OrderStatusChangeDTO
        """
        return self._order

    @order.setter
    def order(self, order: OrderStatusChangeDTO):
        """Sets the order of this UpdateOrderStatusRequest.


        :param order: The order of this UpdateOrderStatusRequest.
        :type order: OrderStatusChangeDTO
        """
        if order is None:
            raise ValueError("Invalid value for `order`, must not be `None`")  # noqa: E501

        self._order = order