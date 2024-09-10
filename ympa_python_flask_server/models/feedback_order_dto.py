from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.feedback_delivery_type import FeedbackDeliveryType
from ympa_python_flask_server import util

from ympa_python_flask_server.models.feedback_delivery_type import FeedbackDeliveryType  # noqa: E501

class FeedbackOrderDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, shop_order_id=None, delivery=None):  # noqa: E501
        """FeedbackOrderDTO - a model defined in OpenAPI

        :param shop_order_id: The shop_order_id of this FeedbackOrderDTO.  # noqa: E501
        :type shop_order_id: str
        :param delivery: The delivery of this FeedbackOrderDTO.  # noqa: E501
        :type delivery: FeedbackDeliveryType
        """
        self.openapi_types = {
            'shop_order_id': str,
            'delivery': FeedbackDeliveryType
        }

        self.attribute_map = {
            'shop_order_id': 'shopOrderId',
            'delivery': 'delivery'
        }

        self._shop_order_id = shop_order_id
        self._delivery = delivery

    @classmethod
    def from_dict(cls, dikt) -> 'FeedbackOrderDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FeedbackOrderDTO of this FeedbackOrderDTO.  # noqa: E501
        :rtype: FeedbackOrderDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def shop_order_id(self) -> str:
        """Gets the shop_order_id of this FeedbackOrderDTO.

        Номер заказа, указанный в отзыве.  # noqa: E501

        :return: The shop_order_id of this FeedbackOrderDTO.
        :rtype: str
        """
        return self._shop_order_id

    @shop_order_id.setter
    def shop_order_id(self, shop_order_id: str):
        """Sets the shop_order_id of this FeedbackOrderDTO.

        Номер заказа, указанный в отзыве.  # noqa: E501

        :param shop_order_id: The shop_order_id of this FeedbackOrderDTO.
        :type shop_order_id: str
        """

        self._shop_order_id = shop_order_id

    @property
    def delivery(self) -> FeedbackDeliveryType:
        """Gets the delivery of this FeedbackOrderDTO.


        :return: The delivery of this FeedbackOrderDTO.
        :rtype: FeedbackDeliveryType
        """
        return self._delivery

    @delivery.setter
    def delivery(self, delivery: FeedbackDeliveryType):
        """Sets the delivery of this FeedbackOrderDTO.


        :param delivery: The delivery of this FeedbackOrderDTO.
        :type delivery: FeedbackDeliveryType
        """

        self._delivery = delivery