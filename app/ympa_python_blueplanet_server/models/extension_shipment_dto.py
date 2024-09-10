# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.shipment_action_type import ShipmentActionType  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.shipment_status_change_dto import ShipmentStatusChangeDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class ExtensionShipmentDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, current_status: ShipmentStatusChangeDTO=None, available_actions: list[ShipmentActionType]=None):  # noqa: E501
        """ExtensionShipmentDTO - a model defined in Swagger

        :param current_status: The current_status of this ExtensionShipmentDTO.  # noqa: E501
        :type current_status: ShipmentStatusChangeDTO
        :param available_actions: The available_actions of this ExtensionShipmentDTO.  # noqa: E501
        :type available_actions: list[ShipmentActionType]
        """
        self.swagger_types = {
            'current_status': ShipmentStatusChangeDTO,
            'available_actions': list[ShipmentActionType]
        }

        self.attribute_map = {
            'current_status': 'currentStatus',
            'available_actions': 'availableActions'
        }

        self._current_status = current_status
        self._available_actions = available_actions

    @classmethod
    def from_dict(cls, dikt) -> 'ExtensionShipmentDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ExtensionShipmentDTO of this ExtensionShipmentDTO.  # noqa: E501
        :rtype: ExtensionShipmentDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def current_status(self) -> ShipmentStatusChangeDTO:
        """Gets the current_status of this ExtensionShipmentDTO.


        :return: The current_status of this ExtensionShipmentDTO.
        :rtype: ShipmentStatusChangeDTO
        """
        return self._current_status

    @current_status.setter
    def current_status(self, current_status: ShipmentStatusChangeDTO):
        """Sets the current_status of this ExtensionShipmentDTO.


        :param current_status: The current_status of this ExtensionShipmentDTO.
        :type current_status: ShipmentStatusChangeDTO
        """

        self._current_status = current_status

    @property
    def available_actions(self) -> list[ShipmentActionType]:
        """Gets the available_actions of this ExtensionShipmentDTO.

        Доступные действия над отгрузкой.  # noqa: E501

        :return: The available_actions of this ExtensionShipmentDTO.
        :rtype: list[ShipmentActionType]
        """
        return self._available_actions

    @available_actions.setter
    def available_actions(self, available_actions: list[ShipmentActionType]):
        """Sets the available_actions of this ExtensionShipmentDTO.

        Доступные действия над отгрузкой.  # noqa: E501

        :param available_actions: The available_actions of this ExtensionShipmentDTO.
        :type available_actions: list[ShipmentActionType]
        """
        if available_actions is None:
            raise ValueError("Invalid value for `available_actions`, must not be `None`")  # noqa: E501

        self._available_actions = available_actions