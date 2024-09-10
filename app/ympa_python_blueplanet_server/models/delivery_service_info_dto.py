# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from ympa_python_blueplanet_server import util


class DeliveryServiceInfoDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, name: str=None):  # noqa: E501
        """DeliveryServiceInfoDTO - a model defined in Swagger

        :param id: The id of this DeliveryServiceInfoDTO.  # noqa: E501
        :type id: int
        :param name: The name of this DeliveryServiceInfoDTO.  # noqa: E501
        :type name: str
        """
        self.swagger_types = {
            'id': int,
            'name': str
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name'
        }

        self._id = id
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'DeliveryServiceInfoDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DeliveryServiceInfoDTO of this DeliveryServiceInfoDTO.  # noqa: E501
        :rtype: DeliveryServiceInfoDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """Gets the id of this DeliveryServiceInfoDTO.

        Идентификатор службы доставки.  # noqa: E501

        :return: The id of this DeliveryServiceInfoDTO.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this DeliveryServiceInfoDTO.

        Идентификатор службы доставки.  # noqa: E501

        :param id: The id of this DeliveryServiceInfoDTO.
        :type id: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this DeliveryServiceInfoDTO.

        Наименование службы доставки.  # noqa: E501

        :return: The name of this DeliveryServiceInfoDTO.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this DeliveryServiceInfoDTO.

        Наименование службы доставки.  # noqa: E501

        :param name: The name of this DeliveryServiceInfoDTO.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name