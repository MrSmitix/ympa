# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.feedback_factor_dto import FeedbackFactorDTO
from ympa_python_aiohttp_server import util


class FeedbackGradesDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, average: float=None, agree_count: int=None, reject_count: int=None, factors: List[FeedbackFactorDTO]=None):
        """FeedbackGradesDTO - a model defined in OpenAPI

        :param average: The average of this FeedbackGradesDTO.
        :param agree_count: The agree_count of this FeedbackGradesDTO.
        :param reject_count: The reject_count of this FeedbackGradesDTO.
        :param factors: The factors of this FeedbackGradesDTO.
        """
        self.openapi_types = {
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
    def from_dict(cls, dikt: dict) -> 'FeedbackGradesDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The FeedbackGradesDTO of this FeedbackGradesDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def average(self):
        """Gets the average of this FeedbackGradesDTO.

        Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).

        :return: The average of this FeedbackGradesDTO.
        :rtype: float
        """
        return self._average

    @average.setter
    def average(self, average):
        """Sets the average of this FeedbackGradesDTO.

        Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).

        :param average: The average of this FeedbackGradesDTO.
        :type average: float
        """

        self._average = average

    @property
    def agree_count(self):
        """Gets the agree_count of this FeedbackGradesDTO.

        Количество пользователей, считающих отзыв полезным.

        :return: The agree_count of this FeedbackGradesDTO.
        :rtype: int
        """
        return self._agree_count

    @agree_count.setter
    def agree_count(self, agree_count):
        """Sets the agree_count of this FeedbackGradesDTO.

        Количество пользователей, считающих отзыв полезным.

        :param agree_count: The agree_count of this FeedbackGradesDTO.
        :type agree_count: int
        """

        self._agree_count = agree_count

    @property
    def reject_count(self):
        """Gets the reject_count of this FeedbackGradesDTO.

        Количество пользователей, считающих отзыв бесполезным.

        :return: The reject_count of this FeedbackGradesDTO.
        :rtype: int
        """
        return self._reject_count

    @reject_count.setter
    def reject_count(self, reject_count):
        """Sets the reject_count of this FeedbackGradesDTO.

        Количество пользователей, считающих отзыв бесполезным.

        :param reject_count: The reject_count of this FeedbackGradesDTO.
        :type reject_count: int
        """

        self._reject_count = reject_count

    @property
    def factors(self):
        """Gets the factors of this FeedbackGradesDTO.

        Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 

        :return: The factors of this FeedbackGradesDTO.
        :rtype: List[FeedbackFactorDTO]
        """
        return self._factors

    @factors.setter
    def factors(self, factors):
        """Sets the factors of this FeedbackGradesDTO.

        Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 

        :param factors: The factors of this FeedbackGradesDTO.
        :type factors: List[FeedbackFactorDTO]
        """
        if factors is None:
            raise ValueError("Invalid value for `factors`, must not be `None`")

        self._factors = factors
