from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class ScrollingPagerDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, next_page_token=None, prev_page_token=None):  # noqa: E501
        """ScrollingPagerDTO - a model defined in OpenAPI

        :param next_page_token: The next_page_token of this ScrollingPagerDTO.  # noqa: E501
        :type next_page_token: str
        :param prev_page_token: The prev_page_token of this ScrollingPagerDTO.  # noqa: E501
        :type prev_page_token: str
        """
        self.openapi_types = {
            'next_page_token': str,
            'prev_page_token': str
        }

        self.attribute_map = {
            'next_page_token': 'nextPageToken',
            'prev_page_token': 'prevPageToken'
        }

        self._next_page_token = next_page_token
        self._prev_page_token = prev_page_token

    @classmethod
    def from_dict(cls, dikt) -> 'ScrollingPagerDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ScrollingPagerDTO of this ScrollingPagerDTO.  # noqa: E501
        :rtype: ScrollingPagerDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def next_page_token(self) -> str:
        """Gets the next_page_token of this ScrollingPagerDTO.

        Идентификатор следующей страницы результатов.  # noqa: E501

        :return: The next_page_token of this ScrollingPagerDTO.
        :rtype: str
        """
        return self._next_page_token

    @next_page_token.setter
    def next_page_token(self, next_page_token: str):
        """Sets the next_page_token of this ScrollingPagerDTO.

        Идентификатор следующей страницы результатов.  # noqa: E501

        :param next_page_token: The next_page_token of this ScrollingPagerDTO.
        :type next_page_token: str
        """

        self._next_page_token = next_page_token

    @property
    def prev_page_token(self) -> str:
        """Gets the prev_page_token of this ScrollingPagerDTO.

        Идентификатор предыдущей страницы результатов.  # noqa: E501

        :return: The prev_page_token of this ScrollingPagerDTO.
        :rtype: str
        """
        return self._prev_page_token

    @prev_page_token.setter
    def prev_page_token(self, prev_page_token: str):
        """Sets the prev_page_token of this ScrollingPagerDTO.

        Идентификатор предыдущей страницы результатов.  # noqa: E501

        :param prev_page_token: The prev_page_token of this ScrollingPagerDTO.
        :type prev_page_token: str
        """

        self._prev_page_token = prev_page_token