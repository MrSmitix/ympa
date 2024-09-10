from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class OrderTrackDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, track_code=None, delivery_service_id=None):  # noqa: E501
        """OrderTrackDTO - a model defined in OpenAPI

        :param track_code: The track_code of this OrderTrackDTO.  # noqa: E501
        :type track_code: str
        :param delivery_service_id: The delivery_service_id of this OrderTrackDTO.  # noqa: E501
        :type delivery_service_id: int
        """
        self.openapi_types = {
            'track_code': str,
            'delivery_service_id': int
        }

        self.attribute_map = {
            'track_code': 'trackCode',
            'delivery_service_id': 'deliveryServiceId'
        }

        self._track_code = track_code
        self._delivery_service_id = delivery_service_id

    @classmethod
    def from_dict(cls, dikt) -> 'OrderTrackDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrderTrackDTO of this OrderTrackDTO.  # noqa: E501
        :rtype: OrderTrackDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def track_code(self) -> str:
        """Gets the track_code of this OrderTrackDTO.

        Трек‑номер посылки.  # noqa: E501

        :return: The track_code of this OrderTrackDTO.
        :rtype: str
        """
        return self._track_code

    @track_code.setter
    def track_code(self, track_code: str):
        """Sets the track_code of this OrderTrackDTO.

        Трек‑номер посылки.  # noqa: E501

        :param track_code: The track_code of this OrderTrackDTO.
        :type track_code: str
        """

        self._track_code = track_code

    @property
    def delivery_service_id(self) -> int:
        """Gets the delivery_service_id of this OrderTrackDTO.

        Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).  # noqa: E501

        :return: The delivery_service_id of this OrderTrackDTO.
        :rtype: int
        """
        return self._delivery_service_id

    @delivery_service_id.setter
    def delivery_service_id(self, delivery_service_id: int):
        """Sets the delivery_service_id of this OrderTrackDTO.

        Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).  # noqa: E501

        :param delivery_service_id: The delivery_service_id of this OrderTrackDTO.
        :type delivery_service_id: int
        """

        self._delivery_service_id = delivery_service_id