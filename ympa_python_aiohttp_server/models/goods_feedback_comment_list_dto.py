# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.forward_scrolling_pager_dto import ForwardScrollingPagerDTO
from ympa_python_aiohttp_server.models.goods_feedback_comment_dto import GoodsFeedbackCommentDTO
from ympa_python_aiohttp_server import util


class GoodsFeedbackCommentListDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, comments: List[GoodsFeedbackCommentDTO]=None, paging: ForwardScrollingPagerDTO=None):
        """GoodsFeedbackCommentListDTO - a model defined in OpenAPI

        :param comments: The comments of this GoodsFeedbackCommentListDTO.
        :param paging: The paging of this GoodsFeedbackCommentListDTO.
        """
        self.openapi_types = {
            'comments': List[GoodsFeedbackCommentDTO],
            'paging': ForwardScrollingPagerDTO
        }

        self.attribute_map = {
            'comments': 'comments',
            'paging': 'paging'
        }

        self._comments = comments
        self._paging = paging

    @classmethod
    def from_dict(cls, dikt: dict) -> 'GoodsFeedbackCommentListDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The GoodsFeedbackCommentListDTO of this GoodsFeedbackCommentListDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def comments(self):
        """Gets the comments of this GoodsFeedbackCommentListDTO.

        Список комментариев.

        :return: The comments of this GoodsFeedbackCommentListDTO.
        :rtype: List[GoodsFeedbackCommentDTO]
        """
        return self._comments

    @comments.setter
    def comments(self, comments):
        """Sets the comments of this GoodsFeedbackCommentListDTO.

        Список комментариев.

        :param comments: The comments of this GoodsFeedbackCommentListDTO.
        :type comments: List[GoodsFeedbackCommentDTO]
        """
        if comments is None:
            raise ValueError("Invalid value for `comments`, must not be `None`")

        self._comments = comments

    @property
    def paging(self):
        """Gets the paging of this GoodsFeedbackCommentListDTO.


        :return: The paging of this GoodsFeedbackCommentListDTO.
        :rtype: ForwardScrollingPagerDTO
        """
        return self._paging

    @paging.setter
    def paging(self, paging):
        """Sets the paging of this GoodsFeedbackCommentListDTO.


        :param paging: The paging of this GoodsFeedbackCommentListDTO.
        :type paging: ForwardScrollingPagerDTO
        """

        self._paging = paging
