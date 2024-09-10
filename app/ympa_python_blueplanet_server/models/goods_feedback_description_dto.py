# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from ympa_python_blueplanet_server import util


class GoodsFeedbackDescriptionDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, advantages: str=None, disadvantages: str=None, comment: str=None):  # noqa: E501
        """GoodsFeedbackDescriptionDTO - a model defined in Swagger

        :param advantages: The advantages of this GoodsFeedbackDescriptionDTO.  # noqa: E501
        :type advantages: str
        :param disadvantages: The disadvantages of this GoodsFeedbackDescriptionDTO.  # noqa: E501
        :type disadvantages: str
        :param comment: The comment of this GoodsFeedbackDescriptionDTO.  # noqa: E501
        :type comment: str
        """
        self.swagger_types = {
            'advantages': str,
            'disadvantages': str,
            'comment': str
        }

        self.attribute_map = {
            'advantages': 'advantages',
            'disadvantages': 'disadvantages',
            'comment': 'comment'
        }

        self._advantages = advantages
        self._disadvantages = disadvantages
        self._comment = comment

    @classmethod
    def from_dict(cls, dikt) -> 'GoodsFeedbackDescriptionDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GoodsFeedbackDescriptionDTO of this GoodsFeedbackDescriptionDTO.  # noqa: E501
        :rtype: GoodsFeedbackDescriptionDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def advantages(self) -> str:
        """Gets the advantages of this GoodsFeedbackDescriptionDTO.

        Описание плюсов товара в отзыве.  # noqa: E501

        :return: The advantages of this GoodsFeedbackDescriptionDTO.
        :rtype: str
        """
        return self._advantages

    @advantages.setter
    def advantages(self, advantages: str):
        """Sets the advantages of this GoodsFeedbackDescriptionDTO.

        Описание плюсов товара в отзыве.  # noqa: E501

        :param advantages: The advantages of this GoodsFeedbackDescriptionDTO.
        :type advantages: str
        """

        self._advantages = advantages

    @property
    def disadvantages(self) -> str:
        """Gets the disadvantages of this GoodsFeedbackDescriptionDTO.

        Описание минусов товара в отзыве.  # noqa: E501

        :return: The disadvantages of this GoodsFeedbackDescriptionDTO.
        :rtype: str
        """
        return self._disadvantages

    @disadvantages.setter
    def disadvantages(self, disadvantages: str):
        """Sets the disadvantages of this GoodsFeedbackDescriptionDTO.

        Описание минусов товара в отзыве.  # noqa: E501

        :param disadvantages: The disadvantages of this GoodsFeedbackDescriptionDTO.
        :type disadvantages: str
        """

        self._disadvantages = disadvantages

    @property
    def comment(self) -> str:
        """Gets the comment of this GoodsFeedbackDescriptionDTO.

        Комментарий в отзыве.  # noqa: E501

        :return: The comment of this GoodsFeedbackDescriptionDTO.
        :rtype: str
        """
        return self._comment

    @comment.setter
    def comment(self, comment: str):
        """Sets the comment of this GoodsFeedbackDescriptionDTO.

        Комментарий в отзыве.  # noqa: E501

        :param comment: The comment of this GoodsFeedbackDescriptionDTO.
        :type comment: str
        """

        self._comment = comment
