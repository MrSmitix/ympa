from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class GoodsFeedbackMediaDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, photos=None, videos=None):  # noqa: E501
        """GoodsFeedbackMediaDTO - a model defined in OpenAPI

        :param photos: The photos of this GoodsFeedbackMediaDTO.  # noqa: E501
        :type photos: List[str]
        :param videos: The videos of this GoodsFeedbackMediaDTO.  # noqa: E501
        :type videos: List[str]
        """
        self.openapi_types = {
            'photos': List[str],
            'videos': List[str]
        }

        self.attribute_map = {
            'photos': 'photos',
            'videos': 'videos'
        }

        self._photos = photos
        self._videos = videos

    @classmethod
    def from_dict(cls, dikt) -> 'GoodsFeedbackMediaDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GoodsFeedbackMediaDTO of this GoodsFeedbackMediaDTO.  # noqa: E501
        :rtype: GoodsFeedbackMediaDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def photos(self) -> List[str]:
        """Gets the photos of this GoodsFeedbackMediaDTO.

        Ссылки на фото.  # noqa: E501

        :return: The photos of this GoodsFeedbackMediaDTO.
        :rtype: List[str]
        """
        return self._photos

    @photos.setter
    def photos(self, photos: List[str]):
        """Sets the photos of this GoodsFeedbackMediaDTO.

        Ссылки на фото.  # noqa: E501

        :param photos: The photos of this GoodsFeedbackMediaDTO.
        :type photos: List[str]
        """

        self._photos = photos

    @property
    def videos(self) -> List[str]:
        """Gets the videos of this GoodsFeedbackMediaDTO.

        Ссылки на видео.  # noqa: E501

        :return: The videos of this GoodsFeedbackMediaDTO.
        :rtype: List[str]
        """
        return self._videos

    @videos.setter
    def videos(self, videos: List[str]):
        """Sets the videos of this GoodsFeedbackMediaDTO.

        Ссылки на видео.  # noqa: E501

        :param videos: The videos of this GoodsFeedbackMediaDTO.
        :type videos: List[str]
        """

        self._videos = videos
