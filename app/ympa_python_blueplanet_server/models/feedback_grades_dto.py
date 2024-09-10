# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.feedback_factor_dto import FeedbackFactorDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class FeedbackGradesDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, average: float=None, agree_count: int=None, reject_count: int=None, factors: List[FeedbackFactorDTO]=None):  # noqa: E501
        """FeedbackGradesDTO - a model defined in Swagger

        :param average: The average of this FeedbackGradesDTO.  # noqa: E501
        :type average: float
        :param agree_count: The agree_count of this FeedbackGradesDTO.  # noqa: E501
        :type agree_count: int
        :param reject_count: The reject_count of this FeedbackGradesDTO.  # noqa: E501
        :type reject_count: int
        :param factors: The factors of this FeedbackGradesDTO.  # noqa: E501
        :type factors: List[FeedbackFactorDTO]
        """
        self.swagger_types = {
            'average': float,
            'agree_count': int,
            'reject_count': int,
            'factors': List[FeedbackFactorDTO]
        }

        self.attribute_map = {
            'average': 'average',
            'agree_count': 'agreeCount',
            'reject_count': 'rejectCount',
            'factors': 'factors'
        }

        self._average = average
        self._agree_count = agree_count
        self._reject_count = reject_count
        self._factors = factors

    @classmethod
    def from_dict(cls, dikt) -> 'FeedbackGradesDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FeedbackGradesDTO of this FeedbackGradesDTO.  # noqa: E501
        :rtype: FeedbackGradesDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def average(self) -> float:
        """Gets the average of this FeedbackGradesDTO.

        Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).  # noqa: E501

        :return: The average of this FeedbackGradesDTO.
        :rtype: float
        """
        return self._average

    @average.setter
    def average(self, average: float):
        """Sets the average of this FeedbackGradesDTO.

        Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).  # noqa: E501

        :param average: The average of this FeedbackGradesDTO.
        :type average: float
        """

        self._average = average

    @property
    def agree_count(self) -> int:
        """Gets the agree_count of this FeedbackGradesDTO.

        Количество пользователей, считающих отзыв полезным.  # noqa: E501

        :return: The agree_count of this FeedbackGradesDTO.
        :rtype: int
        """
        return self._agree_count

    @agree_count.setter
    def agree_count(self, agree_count: int):
        """Sets the agree_count of this FeedbackGradesDTO.

        Количество пользователей, считающих отзыв полезным.  # noqa: E501

        :param agree_count: The agree_count of this FeedbackGradesDTO.
        :type agree_count: int
        """

        self._agree_count = agree_count

    @property
    def reject_count(self) -> int:
        """Gets the reject_count of this FeedbackGradesDTO.

        Количество пользователей, считающих отзыв бесполезным.  # noqa: E501

        :return: The reject_count of this FeedbackGradesDTO.
        :rtype: int
        """
        return self._reject_count

    @reject_count.setter
    def reject_count(self, reject_count: int):
        """Sets the reject_count of this FeedbackGradesDTO.

        Количество пользователей, считающих отзыв бесполезным.  # noqa: E501

        :param reject_count: The reject_count of this FeedbackGradesDTO.
        :type reject_count: int
        """

        self._reject_count = reject_count

    @property
    def factors(self) -> List[FeedbackFactorDTO]:
        """Gets the factors of this FeedbackGradesDTO.

        Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор.   # noqa: E501

        :return: The factors of this FeedbackGradesDTO.
        :rtype: List[FeedbackFactorDTO]
        """
        return self._factors

    @factors.setter
    def factors(self, factors: List[FeedbackFactorDTO]):
        """Sets the factors of this FeedbackGradesDTO.

        Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор.   # noqa: E501

        :param factors: The factors of this FeedbackGradesDTO.
        :type factors: List[FeedbackFactorDTO]
        """
        if factors is None:
            raise ValueError("Invalid value for `factors`, must not be `None`")  # noqa: E501

        self._factors = factors
