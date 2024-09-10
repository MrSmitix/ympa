from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.order_status_change_delivery_dto import OrderStatusChangeDeliveryDTO
from ympa_python_flask_server.models.order_status_type import OrderStatusType
from ympa_python_flask_server.models.order_substatus_type import OrderSubstatusType
from ympa_python_flask_server import util

from ympa_python_flask_server.models.order_status_change_delivery_dto import OrderStatusChangeDeliveryDTO  # noqa: E501
from ympa_python_flask_server.models.order_status_type import OrderStatusType  # noqa: E501
from ympa_python_flask_server.models.order_substatus_type import OrderSubstatusType  # noqa: E501

class OrderStatusChangeDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status=None, substatus=None, delivery=None):  # noqa: E501
        """OrderStatusChangeDTO - a model defined in OpenAPI

        :param status: The status of this OrderStatusChangeDTO.  # noqa: E501
        :type status: OrderStatusType
        :param substatus: The substatus of this OrderStatusChangeDTO.  # noqa: E501
        :type substatus: OrderSubstatusType
        :param delivery: The delivery of this OrderStatusChangeDTO.  # noqa: E501
        :type delivery: OrderStatusChangeDeliveryDTO
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
    def from_dict(cls, dikt) -> 'OrderStatusChangeDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrderStatusChangeDTO of this OrderStatusChangeDTO.  # noqa: E501
        :rtype: OrderStatusChangeDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> OrderStatusType:
        """Gets the status of this OrderStatusChangeDTO.


        :return: The status of this OrderStatusChangeDTO.
        :rtype: OrderStatusType
        """
        return self._status

    @status.setter
    def status(self, status: OrderStatusType):
        """Sets the status of this OrderStatusChangeDTO.


        :param status: The status of this OrderStatusChangeDTO.
        :type status: OrderStatusType
        """
        if status is None:
            raise ValueError("Invalid value for `status`, must not be `None`")  # noqa: E501

        self._status = status

    @property
    def substatus(self) -> OrderSubstatusType:
        """Gets the substatus of this OrderStatusChangeDTO.


        :return: The substatus of this OrderStatusChangeDTO.
        :rtype: OrderSubstatusType
        """
        return self._substatus

    @substatus.setter
    def substatus(self, substatus: OrderSubstatusType):
        """Sets the substatus of this OrderStatusChangeDTO.


        :param substatus: The substatus of this OrderStatusChangeDTO.
        :type substatus: OrderSubstatusType
        """

        self._substatus = substatus

    @property
    def delivery(self) -> OrderStatusChangeDeliveryDTO:
        """Gets the delivery of this OrderStatusChangeDTO.


        :return: The delivery of this OrderStatusChangeDTO.
        :rtype: OrderStatusChangeDeliveryDTO
        """
        return self._delivery

    @delivery.setter
    def delivery(self, delivery: OrderStatusChangeDeliveryDTO):
        """Sets the delivery of this OrderStatusChangeDTO.


        :param delivery: The delivery of this OrderStatusChangeDTO.
        :type delivery: OrderStatusChangeDeliveryDTO
        """

        self._delivery = delivery