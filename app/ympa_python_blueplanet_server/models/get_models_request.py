# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from ympa_python_blueplanet_server import util


class GetModelsRequest(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, models: List[int]=None):  # noqa: E501
        """GetModelsRequest - a model defined in Swagger

        :param models: The models of this GetModelsRequest.  # noqa: E501
        :type models: List[int]
        """
        self.swagger_types = {
            'models': List[int]
        }

        self.attribute_map = {
            'models': 'models'
        }

        self._models = models

    @classmethod
    def from_dict(cls, dikt) -> 'GetModelsRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetModelsRequest of this GetModelsRequest.  # noqa: E501
        :rtype: GetModelsRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def models(self) -> List[int]:
        """Gets the models of this GetModelsRequest.

        Список моделей.  # noqa: E501

        :return: The models of this GetModelsRequest.
        :rtype: List[int]
        """
        return self._models

    @models.setter
    def models(self, models: List[int]):
        """Sets the models of this GetModelsRequest.

        Список моделей.  # noqa: E501

        :param models: The models of this GetModelsRequest.
        :type models: List[int]
        """
        if models is None:
            raise ValueError("Invalid value for `models`, must not be `None`")  # noqa: E501
        if models is not None and len(models) < 1:
            raise ValueError("Invalid value for `models`, number of items must be greater than or equal to `1`")  # noqa: E501

        self._models = models