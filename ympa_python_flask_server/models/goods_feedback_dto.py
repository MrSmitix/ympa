from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.goods_feedback_description_dto import GoodsFeedbackDescriptionDTO
from ympa_python_flask_server.models.goods_feedback_identifiers_dto import GoodsFeedbackIdentifiersDTO
from ympa_python_flask_server.models.goods_feedback_media_dto import GoodsFeedbackMediaDTO
from ympa_python_flask_server.models.goods_feedback_statistics_dto import GoodsFeedbackStatisticsDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.goods_feedback_description_dto import GoodsFeedbackDescriptionDTO  # noqa: E501
from ympa_python_flask_server.models.goods_feedback_identifiers_dto import GoodsFeedbackIdentifiersDTO  # noqa: E501
from ympa_python_flask_server.models.goods_feedback_media_dto import GoodsFeedbackMediaDTO  # noqa: E501
from ympa_python_flask_server.models.goods_feedback_statistics_dto import GoodsFeedbackStatisticsDTO  # noqa: E501

class GoodsFeedbackDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, feedback_id=None, created_at=None, need_reaction=None, identifiers=None, author=None, description=None, media=None, statistics=None):  # noqa: E501
        """GoodsFeedbackDTO - a model defined in OpenAPI

        :param feedback_id: The feedback_id of this GoodsFeedbackDTO.  # noqa: E501
        :type feedback_id: int
        :param created_at: The created_at of this GoodsFeedbackDTO.  # noqa: E501
        :type created_at: datetime
        :param need_reaction: The need_reaction of this GoodsFeedbackDTO.  # noqa: E501
        :type need_reaction: bool
        :param identifiers: The identifiers of this GoodsFeedbackDTO.  # noqa: E501
        :type identifiers: GoodsFeedbackIdentifiersDTO
        :param author: The author of this GoodsFeedbackDTO.  # noqa: E501
        :type author: str
        :param description: The description of this GoodsFeedbackDTO.  # noqa: E501
        :type description: GoodsFeedbackDescriptionDTO
        :param media: The media of this GoodsFeedbackDTO.  # noqa: E501
        :type media: GoodsFeedbackMediaDTO
        :param statistics: The statistics of this GoodsFeedbackDTO.  # noqa: E501
        :type statistics: GoodsFeedbackStatisticsDTO
        """
        self.openapi_types = {
            'feedback_id': int,
            'created_at': datetime,
            'need_reaction': bool,
            'identifiers': GoodsFeedbackIdentifiersDTO,
            'author': str,
            'description': GoodsFeedbackDescriptionDTO,
            'media': GoodsFeedbackMediaDTO,
            'statistics': GoodsFeedbackStatisticsDTO
        }

        self.attribute_map = {
            'feedback_id': 'feedbackId',
            'created_at': 'createdAt',
            'need_reaction': 'needReaction',
            'identifiers': 'identifiers',
            'author': 'author',
            'description': 'description',
            'media': 'media',
            'statistics': 'statistics'
        }

        self._feedback_id = feedback_id
        self._created_at = created_at
        self._need_reaction = need_reaction
        self._identifiers = identifiers
        self._author = author
        self._description = description
        self._media = media
        self._statistics = statistics

    @classmethod
    def from_dict(cls, dikt) -> 'GoodsFeedbackDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GoodsFeedbackDTO of this GoodsFeedbackDTO.  # noqa: E501
        :rtype: GoodsFeedbackDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def feedback_id(self) -> int:
        """Gets the feedback_id of this GoodsFeedbackDTO.

        Идентификатор отзыва.   # noqa: E501

        :return: The feedback_id of this GoodsFeedbackDTO.
        :rtype: int
        """
        return self._feedback_id

    @feedback_id.setter
    def feedback_id(self, feedback_id: int):
        """Sets the feedback_id of this GoodsFeedbackDTO.

        Идентификатор отзыва.   # noqa: E501

        :param feedback_id: The feedback_id of this GoodsFeedbackDTO.
        :type feedback_id: int
        """
        if feedback_id is None:
            raise ValueError("Invalid value for `feedback_id`, must not be `None`")  # noqa: E501

        self._feedback_id = feedback_id

    @property
    def created_at(self) -> datetime:
        """Gets the created_at of this GoodsFeedbackDTO.

        Дата и время создания отзыва.  # noqa: E501

        :return: The created_at of this GoodsFeedbackDTO.
        :rtype: datetime
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: datetime):
        """Sets the created_at of this GoodsFeedbackDTO.

        Дата и время создания отзыва.  # noqa: E501

        :param created_at: The created_at of this GoodsFeedbackDTO.
        :type created_at: datetime
        """
        if created_at is None:
            raise ValueError("Invalid value for `created_at`, must not be `None`")  # noqa: E501

        self._created_at = created_at

    @property
    def need_reaction(self) -> bool:
        """Gets the need_reaction of this GoodsFeedbackDTO.

        Нужен ли ответ на отзыв.  # noqa: E501

        :return: The need_reaction of this GoodsFeedbackDTO.
        :rtype: bool
        """
        return self._need_reaction

    @need_reaction.setter
    def need_reaction(self, need_reaction: bool):
        """Sets the need_reaction of this GoodsFeedbackDTO.

        Нужен ли ответ на отзыв.  # noqa: E501

        :param need_reaction: The need_reaction of this GoodsFeedbackDTO.
        :type need_reaction: bool
        """
        if need_reaction is None:
            raise ValueError("Invalid value for `need_reaction`, must not be `None`")  # noqa: E501

        self._need_reaction = need_reaction

    @property
    def identifiers(self) -> GoodsFeedbackIdentifiersDTO:
        """Gets the identifiers of this GoodsFeedbackDTO.


        :return: The identifiers of this GoodsFeedbackDTO.
        :rtype: GoodsFeedbackIdentifiersDTO
        """
        return self._identifiers

    @identifiers.setter
    def identifiers(self, identifiers: GoodsFeedbackIdentifiersDTO):
        """Sets the identifiers of this GoodsFeedbackDTO.


        :param identifiers: The identifiers of this GoodsFeedbackDTO.
        :type identifiers: GoodsFeedbackIdentifiersDTO
        """
        if identifiers is None:
            raise ValueError("Invalid value for `identifiers`, must not be `None`")  # noqa: E501

        self._identifiers = identifiers

    @property
    def author(self) -> str:
        """Gets the author of this GoodsFeedbackDTO.

        Имя автора отзыва.  # noqa: E501

        :return: The author of this GoodsFeedbackDTO.
        :rtype: str
        """
        return self._author

    @author.setter
    def author(self, author: str):
        """Sets the author of this GoodsFeedbackDTO.

        Имя автора отзыва.  # noqa: E501

        :param author: The author of this GoodsFeedbackDTO.
        :type author: str
        """

        self._author = author

    @property
    def description(self) -> GoodsFeedbackDescriptionDTO:
        """Gets the description of this GoodsFeedbackDTO.


        :return: The description of this GoodsFeedbackDTO.
        :rtype: GoodsFeedbackDescriptionDTO
        """
        return self._description

    @description.setter
    def description(self, description: GoodsFeedbackDescriptionDTO):
        """Sets the description of this GoodsFeedbackDTO.


        :param description: The description of this GoodsFeedbackDTO.
        :type description: GoodsFeedbackDescriptionDTO
        """

        self._description = description

    @property
    def media(self) -> GoodsFeedbackMediaDTO:
        """Gets the media of this GoodsFeedbackDTO.


        :return: The media of this GoodsFeedbackDTO.
        :rtype: GoodsFeedbackMediaDTO
        """
        return self._media

    @media.setter
    def media(self, media: GoodsFeedbackMediaDTO):
        """Sets the media of this GoodsFeedbackDTO.


        :param media: The media of this GoodsFeedbackDTO.
        :type media: GoodsFeedbackMediaDTO
        """

        self._media = media

    @property
    def statistics(self) -> GoodsFeedbackStatisticsDTO:
        """Gets the statistics of this GoodsFeedbackDTO.


        :return: The statistics of this GoodsFeedbackDTO.
        :rtype: GoodsFeedbackStatisticsDTO
        """
        return self._statistics

    @statistics.setter
    def statistics(self, statistics: GoodsFeedbackStatisticsDTO):
        """Sets the statistics of this GoodsFeedbackDTO.


        :param statistics: The statistics of this GoodsFeedbackDTO.
        :type statistics: GoodsFeedbackStatisticsDTO
        """
        if statistics is None:
            raise ValueError("Invalid value for `statistics`, must not be `None`")  # noqa: E501

        self._statistics = statistics
