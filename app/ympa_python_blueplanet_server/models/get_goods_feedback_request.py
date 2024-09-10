# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.feedback_reaction_status_type import FeedbackReactionStatusType  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class GetGoodsFeedbackRequest(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, date_time_from: datetime=None, date_time_to: datetime=None, reaction_status: FeedbackReactionStatusType=None, rating_values: list[int]=None, model_ids: list[int]=None, paid: bool=None):  # noqa: E501
        """GetGoodsFeedbackRequest - a model defined in Swagger

        :param date_time_from: The date_time_from of this GetGoodsFeedbackRequest.  # noqa: E501
        :type date_time_from: datetime
        :param date_time_to: The date_time_to of this GetGoodsFeedbackRequest.  # noqa: E501
        :type date_time_to: datetime
        :param reaction_status: The reaction_status of this GetGoodsFeedbackRequest.  # noqa: E501
        :type reaction_status: FeedbackReactionStatusType
        :param rating_values: The rating_values of this GetGoodsFeedbackRequest.  # noqa: E501
        :type rating_values: list[int]
        :param model_ids: The model_ids of this GetGoodsFeedbackRequest.  # noqa: E501
        :type model_ids: list[int]
        :param paid: The paid of this GetGoodsFeedbackRequest.  # noqa: E501
        :type paid: bool
        """
        self.swagger_types = {
            'date_time_from': datetime,
            'date_time_to': datetime,
            'reaction_status': FeedbackReactionStatusType,
            'rating_values': list[int],
            'model_ids': list[int],
            'paid': bool
        }

        self.attribute_map = {
            'date_time_from': 'dateTimeFrom',
            'date_time_to': 'dateTimeTo',
            'reaction_status': 'reactionStatus',
            'rating_values': 'ratingValues',
            'model_ids': 'modelIds',
            'paid': 'paid'
        }

        self._date_time_from = date_time_from
        self._date_time_to = date_time_to
        self._reaction_status = reaction_status
        self._rating_values = rating_values
        self._model_ids = model_ids
        self._paid = paid

    @classmethod
    def from_dict(cls, dikt) -> 'GetGoodsFeedbackRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetGoodsFeedbackRequest of this GetGoodsFeedbackRequest.  # noqa: E501
        :rtype: GetGoodsFeedbackRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def date_time_from(self) -> datetime:
        """Gets the date_time_from of this GetGoodsFeedbackRequest.

        Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты.   # noqa: E501

        :return: The date_time_from of this GetGoodsFeedbackRequest.
        :rtype: datetime
        """
        return self._date_time_from

    @date_time_from.setter
    def date_time_from(self, date_time_from: datetime):
        """Sets the date_time_from of this GetGoodsFeedbackRequest.

        Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты.   # noqa: E501

        :param date_time_from: The date_time_from of this GetGoodsFeedbackRequest.
        :type date_time_from: datetime
        """

        self._date_time_from = date_time_from

    @property
    def date_time_to(self) -> datetime:
        """Gets the date_time_to of this GetGoodsFeedbackRequest.

        Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.   # noqa: E501

        :return: The date_time_to of this GetGoodsFeedbackRequest.
        :rtype: datetime
        """
        return self._date_time_to

    @date_time_to.setter
    def date_time_to(self, date_time_to: datetime):
        """Sets the date_time_to of this GetGoodsFeedbackRequest.

        Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.   # noqa: E501

        :param date_time_to: The date_time_to of this GetGoodsFeedbackRequest.
        :type date_time_to: datetime
        """

        self._date_time_to = date_time_to

    @property
    def reaction_status(self) -> FeedbackReactionStatusType:
        """Gets the reaction_status of this GetGoodsFeedbackRequest.


        :return: The reaction_status of this GetGoodsFeedbackRequest.
        :rtype: FeedbackReactionStatusType
        """
        return self._reaction_status

    @reaction_status.setter
    def reaction_status(self, reaction_status: FeedbackReactionStatusType):
        """Sets the reaction_status of this GetGoodsFeedbackRequest.


        :param reaction_status: The reaction_status of this GetGoodsFeedbackRequest.
        :type reaction_status: FeedbackReactionStatusType
        """

        self._reaction_status = reaction_status

    @property
    def rating_values(self) -> list[int]:
        """Gets the rating_values of this GetGoodsFeedbackRequest.

        Оценка товара.  # noqa: E501

        :return: The rating_values of this GetGoodsFeedbackRequest.
        :rtype: list[int]
        """
        return self._rating_values

    @rating_values.setter
    def rating_values(self, rating_values: list[int]):
        """Sets the rating_values of this GetGoodsFeedbackRequest.

        Оценка товара.  # noqa: E501

        :param rating_values: The rating_values of this GetGoodsFeedbackRequest.
        :type rating_values: list[int]
        """
        if rating_values is not None and len(rating_values) > 5:
            raise ValueError("Invalid value for `rating_values`, number of items must be less than or equal to `5`")  # noqa: E501

        self._rating_values = rating_values

    @property
    def model_ids(self) -> list[int]:
        """Gets the model_ids of this GetGoodsFeedbackRequest.

        Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).   # noqa: E501

        :return: The model_ids of this GetGoodsFeedbackRequest.
        :rtype: list[int]
        """
        return self._model_ids

    @model_ids.setter
    def model_ids(self, model_ids: list[int]):
        """Sets the model_ids of this GetGoodsFeedbackRequest.

        Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).   # noqa: E501

        :param model_ids: The model_ids of this GetGoodsFeedbackRequest.
        :type model_ids: list[int]
        """
        if model_ids is not None and len(model_ids) > 20:
            raise ValueError("Invalid value for `model_ids`, number of items must be less than or equal to `20`")  # noqa: E501

        self._model_ids = model_ids

    @property
    def paid(self) -> bool:
        """Gets the paid of this GetGoodsFeedbackRequest.

        Фильтр отзывов за баллы Плюса.  # noqa: E501

        :return: The paid of this GetGoodsFeedbackRequest.
        :rtype: bool
        """
        return self._paid

    @paid.setter
    def paid(self, paid: bool):
        """Sets the paid of this GetGoodsFeedbackRequest.

        Фильтр отзывов за баллы Плюса.  # noqa: E501

        :param paid: The paid of this GetGoodsFeedbackRequest.
        :type paid: bool
        """

        self._paid = paid
