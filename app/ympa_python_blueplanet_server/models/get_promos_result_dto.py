# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.get_promo_dto import GetPromoDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class GetPromosResultDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, promos: List[GetPromoDTO]=None):  # noqa: E501
        """GetPromosResultDTO - a model defined in Swagger

        :param promos: The promos of this GetPromosResultDTO.  # noqa: E501
        :type promos: List[GetPromoDTO]
        """
        self.swagger_types = {
            'promos': List[GetPromoDTO]
        }

        self.attribute_map = {
            'promos': 'promos'
        }

        self._promos = promos

    @classmethod
    def from_dict(cls, dikt) -> 'GetPromosResultDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetPromosResultDTO of this GetPromosResultDTO.  # noqa: E501
        :rtype: GetPromosResultDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def promos(self) -> List[GetPromoDTO]:
        """Gets the promos of this GetPromosResultDTO.

        Акции Маркета.  # noqa: E501

        :return: The promos of this GetPromosResultDTO.
        :rtype: List[GetPromoDTO]
        """
        return self._promos

    @promos.setter
    def promos(self, promos: List[GetPromoDTO]):
        """Sets the promos of this GetPromosResultDTO.

        Акции Маркета.  # noqa: E501

        :param promos: The promos of this GetPromosResultDTO.
        :type promos: List[GetPromoDTO]
        """
        if promos is None:
            raise ValueError("Invalid value for `promos`, must not be `None`")  # noqa: E501

        self._promos = promos
