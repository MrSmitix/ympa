from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class ConfirmShipmentRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, external_shipment_id=None):  # noqa: E501
        """ConfirmShipmentRequest - a model defined in OpenAPI

        :param external_shipment_id: The external_shipment_id of this ConfirmShipmentRequest.  # noqa: E501
        :type external_shipment_id: str
        """
        self.openapi_types = {
            'external_shipment_id': str
        }

        self.attribute_map = {
            'external_shipment_id': 'externalShipmentId'
        }

        self._external_shipment_id = external_shipment_id

    @classmethod
    def from_dict(cls, dikt) -> 'ConfirmShipmentRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ConfirmShipmentRequest of this ConfirmShipmentRequest.  # noqa: E501
        :rtype: ConfirmShipmentRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def external_shipment_id(self) -> str:
        """Gets the external_shipment_id of this ConfirmShipmentRequest.

        Идентификатор отгрузки в системе поставщика.  # noqa: E501

        :return: The external_shipment_id of this ConfirmShipmentRequest.
        :rtype: str
        """
        return self._external_shipment_id

    @external_shipment_id.setter
    def external_shipment_id(self, external_shipment_id: str):
        """Sets the external_shipment_id of this ConfirmShipmentRequest.

        Идентификатор отгрузки в системе поставщика.  # noqa: E501

        :param external_shipment_id: The external_shipment_id of this ConfirmShipmentRequest.
        :type external_shipment_id: str
        """

        self._external_shipment_id = external_shipment_id
