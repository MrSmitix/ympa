# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from ympa_python_blueplanet_server import util


class GpsDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, latitude: float=None, longitude: float=None):  # noqa: E501
        """GpsDTO - a model defined in Swagger

        :param latitude: The latitude of this GpsDTO.  # noqa: E501
        :type latitude: float
        :param longitude: The longitude of this GpsDTO.  # noqa: E501
        :type longitude: float
        """
        self.swagger_types = {
            'latitude': float,
            'longitude': float
        }

        self.attribute_map = {
            'latitude': 'latitude',
            'longitude': 'longitude'
        }

        self._latitude = latitude
        self._longitude = longitude

    @classmethod
    def from_dict(cls, dikt) -> 'GpsDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GpsDTO of this GpsDTO.  # noqa: E501
        :rtype: GpsDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def latitude(self) -> float:
        """Gets the latitude of this GpsDTO.

        Широта.  # noqa: E501

        :return: The latitude of this GpsDTO.
        :rtype: float
        """
        return self._latitude

    @latitude.setter
    def latitude(self, latitude: float):
        """Sets the latitude of this GpsDTO.

        Широта.  # noqa: E501

        :param latitude: The latitude of this GpsDTO.
        :type latitude: float
        """
        if latitude is None:
            raise ValueError("Invalid value for `latitude`, must not be `None`")  # noqa: E501

        self._latitude = latitude

    @property
    def longitude(self) -> float:
        """Gets the longitude of this GpsDTO.

        Долгота.  # noqa: E501

        :return: The longitude of this GpsDTO.
        :rtype: float
        """
        return self._longitude

    @longitude.setter
    def longitude(self, longitude: float):
        """Sets the longitude of this GpsDTO.

        Долгота.  # noqa: E501

        :param longitude: The longitude of this GpsDTO.
        :type longitude: float
        """
        if longitude is None:
            raise ValueError("Invalid value for `longitude`, must not be `None`")  # noqa: E501

        self._longitude = longitude
