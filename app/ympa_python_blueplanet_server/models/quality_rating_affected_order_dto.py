# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.affected_order_quality_rating_component_type import AffectedOrderQualityRatingComponentType  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class QualityRatingAffectedOrderDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, order_id: int=None, description: str=None, component_type: AffectedOrderQualityRatingComponentType=None):  # noqa: E501
        """QualityRatingAffectedOrderDTO - a model defined in Swagger

        :param order_id: The order_id of this QualityRatingAffectedOrderDTO.  # noqa: E501
        :type order_id: int
        :param description: The description of this QualityRatingAffectedOrderDTO.  # noqa: E501
        :type description: str
        :param component_type: The component_type of this QualityRatingAffectedOrderDTO.  # noqa: E501
        :type component_type: AffectedOrderQualityRatingComponentType
        """
        self.swagger_types = {
            'order_id': int,
            'description': str,
            'component_type': AffectedOrderQualityRatingComponentType
        }

        self.attribute_map = {
            'order_id': 'orderId',
            'description': 'description',
            'component_type': 'componentType'
        }

        self._order_id = order_id
        self._description = description
        self._component_type = component_type

    @classmethod
    def from_dict(cls, dikt) -> 'QualityRatingAffectedOrderDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The QualityRatingAffectedOrderDTO of this QualityRatingAffectedOrderDTO.  # noqa: E501
        :rtype: QualityRatingAffectedOrderDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def order_id(self) -> int:
        """Gets the order_id of this QualityRatingAffectedOrderDTO.

        Идентификатор заказа.  # noqa: E501

        :return: The order_id of this QualityRatingAffectedOrderDTO.
        :rtype: int
        """
        return self._order_id

    @order_id.setter
    def order_id(self, order_id: int):
        """Sets the order_id of this QualityRatingAffectedOrderDTO.

        Идентификатор заказа.  # noqa: E501

        :param order_id: The order_id of this QualityRatingAffectedOrderDTO.
        :type order_id: int
        """
        if order_id is None:
            raise ValueError("Invalid value for `order_id`, must not be `None`")  # noqa: E501
        if order_id is not None and order_id < 0:  # noqa: E501
            raise ValueError("Invalid value for `order_id`, must be a value greater than or equal to `0`")  # noqa: E501

        self._order_id = order_id

    @property
    def description(self) -> str:
        """Gets the description of this QualityRatingAffectedOrderDTO.

        Описание проблемы.  # noqa: E501

        :return: The description of this QualityRatingAffectedOrderDTO.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this QualityRatingAffectedOrderDTO.

        Описание проблемы.  # noqa: E501

        :param description: The description of this QualityRatingAffectedOrderDTO.
        :type description: str
        """
        if description is None:
            raise ValueError("Invalid value for `description`, must not be `None`")  # noqa: E501

        self._description = description

    @property
    def component_type(self) -> AffectedOrderQualityRatingComponentType:
        """Gets the component_type of this QualityRatingAffectedOrderDTO.


        :return: The component_type of this QualityRatingAffectedOrderDTO.
        :rtype: AffectedOrderQualityRatingComponentType
        """
        return self._component_type

    @component_type.setter
    def component_type(self, component_type: AffectedOrderQualityRatingComponentType):
        """Sets the component_type of this QualityRatingAffectedOrderDTO.


        :param component_type: The component_type of this QualityRatingAffectedOrderDTO.
        :type component_type: AffectedOrderQualityRatingComponentType
        """
        if component_type is None:
            raise ValueError("Invalid value for `component_type`, must not be `None`")  # noqa: E501

        self._component_type = component_type
