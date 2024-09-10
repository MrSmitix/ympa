# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.unit_dto import UnitDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class CategoryParameterUnitDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, default_unit_id: int=None, units: List[UnitDTO]=None):  # noqa: E501
        """CategoryParameterUnitDTO - a model defined in Swagger

        :param default_unit_id: The default_unit_id of this CategoryParameterUnitDTO.  # noqa: E501
        :type default_unit_id: int
        :param units: The units of this CategoryParameterUnitDTO.  # noqa: E501
        :type units: List[UnitDTO]
        """
        self.swagger_types = {
            'default_unit_id': int,
            'units': List[UnitDTO]
        }

        self.attribute_map = {
            'default_unit_id': 'defaultUnitId',
            'units': 'units'
        }

        self._default_unit_id = default_unit_id
        self._units = units

    @classmethod
    def from_dict(cls, dikt) -> 'CategoryParameterUnitDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CategoryParameterUnitDTO of this CategoryParameterUnitDTO.  # noqa: E501
        :rtype: CategoryParameterUnitDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def default_unit_id(self) -> int:
        """Gets the default_unit_id of this CategoryParameterUnitDTO.

        Единица измерения по умолчанию.  # noqa: E501

        :return: The default_unit_id of this CategoryParameterUnitDTO.
        :rtype: int
        """
        return self._default_unit_id

    @default_unit_id.setter
    def default_unit_id(self, default_unit_id: int):
        """Sets the default_unit_id of this CategoryParameterUnitDTO.

        Единица измерения по умолчанию.  # noqa: E501

        :param default_unit_id: The default_unit_id of this CategoryParameterUnitDTO.
        :type default_unit_id: int
        """
        if default_unit_id is None:
            raise ValueError("Invalid value for `default_unit_id`, must not be `None`")  # noqa: E501

        self._default_unit_id = default_unit_id

    @property
    def units(self) -> List[UnitDTO]:
        """Gets the units of this CategoryParameterUnitDTO.

        Допустимые единицы измерения.  # noqa: E501

        :return: The units of this CategoryParameterUnitDTO.
        :rtype: List[UnitDTO]
        """
        return self._units

    @units.setter
    def units(self, units: List[UnitDTO]):
        """Sets the units of this CategoryParameterUnitDTO.

        Допустимые единицы измерения.  # noqa: E501

        :param units: The units of this CategoryParameterUnitDTO.
        :type units: List[UnitDTO]
        """
        if units is None:
            raise ValueError("Invalid value for `units`, must not be `None`")  # noqa: E501

        self._units = units