# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.quality_rating_component_type import QualityRatingComponentType
from ympa_python_aiohttp_server import util


class QualityRatingComponentDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, value: float=None, component_type: QualityRatingComponentType=None):
        """QualityRatingComponentDTO - a model defined in OpenAPI

        :param value: The value of this QualityRatingComponentDTO.
        :param component_type: The component_type of this QualityRatingComponentDTO.
        """
        self.openapi_types = {
            'value': float,
            'component_type': QualityRatingComponentType
        }

        self.attribute_map = {
            'value': 'value',
            'component_type': 'componentType'
        }

        self._value = value
        self._component_type = component_type

    @classmethod
    def from_dict(cls, dikt: dict) -> 'QualityRatingComponentDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The QualityRatingComponentDTO of this QualityRatingComponentDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def value(self):
        """Gets the value of this QualityRatingComponentDTO.

        Значение составляющей в процентах.

        :return: The value of this QualityRatingComponentDTO.
        :rtype: float
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this QualityRatingComponentDTO.

        Значение составляющей в процентах.

        :param value: The value of this QualityRatingComponentDTO.
        :type value: float
        """
        if value is None:
            raise ValueError("Invalid value for `value`, must not be `None`")
        if value is not None and value > 100:
            raise ValueError("Invalid value for `value`, must be a value less than or equal to `100`")
        if value is not None and value < 0:
            raise ValueError("Invalid value for `value`, must be a value greater than or equal to `0`")

        self._value = value

    @property
    def component_type(self):
        """Gets the component_type of this QualityRatingComponentDTO.


        :return: The component_type of this QualityRatingComponentDTO.
        :rtype: QualityRatingComponentType
        """
        return self._component_type

    @component_type.setter
    def component_type(self, component_type):
        """Sets the component_type of this QualityRatingComponentDTO.


        :param component_type: The component_type of this QualityRatingComponentDTO.
        :type component_type: QualityRatingComponentType
        """
        if component_type is None:
            raise ValueError("Invalid value for `component_type`, must not be `None`")

        self._component_type = component_type
