from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class OfferWeightDimensionsDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, length=None, width=None, height=None, weight=None):  # noqa: E501
        """OfferWeightDimensionsDTO - a model defined in OpenAPI

        :param length: The length of this OfferWeightDimensionsDTO.  # noqa: E501
        :type length: float
        :param width: The width of this OfferWeightDimensionsDTO.  # noqa: E501
        :type width: float
        :param height: The height of this OfferWeightDimensionsDTO.  # noqa: E501
        :type height: float
        :param weight: The weight of this OfferWeightDimensionsDTO.  # noqa: E501
        :type weight: float
        """
        self.openapi_types = {
            'length': float,
            'width': float,
            'height': float,
            'weight': float
        }

        self.attribute_map = {
            'length': 'length',
            'width': 'width',
            'height': 'height',
            'weight': 'weight'
        }

        self._length = length
        self._width = width
        self._height = height
        self._weight = weight

    @classmethod
    def from_dict(cls, dikt) -> 'OfferWeightDimensionsDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OfferWeightDimensionsDTO of this OfferWeightDimensionsDTO.  # noqa: E501
        :rtype: OfferWeightDimensionsDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def length(self) -> float:
        """Gets the length of this OfferWeightDimensionsDTO.

        Длина упаковки в см.   # noqa: E501

        :return: The length of this OfferWeightDimensionsDTO.
        :rtype: float
        """
        return self._length

    @length.setter
    def length(self, length: float):
        """Sets the length of this OfferWeightDimensionsDTO.

        Длина упаковки в см.   # noqa: E501

        :param length: The length of this OfferWeightDimensionsDTO.
        :type length: float
        """
        if length is None:
            raise ValueError("Invalid value for `length`, must not be `None`")  # noqa: E501

        self._length = length

    @property
    def width(self) -> float:
        """Gets the width of this OfferWeightDimensionsDTO.

        Ширина упаковки в см.   # noqa: E501

        :return: The width of this OfferWeightDimensionsDTO.
        :rtype: float
        """
        return self._width

    @width.setter
    def width(self, width: float):
        """Sets the width of this OfferWeightDimensionsDTO.

        Ширина упаковки в см.   # noqa: E501

        :param width: The width of this OfferWeightDimensionsDTO.
        :type width: float
        """
        if width is None:
            raise ValueError("Invalid value for `width`, must not be `None`")  # noqa: E501

        self._width = width

    @property
    def height(self) -> float:
        """Gets the height of this OfferWeightDimensionsDTO.

        Высота упаковки в см.   # noqa: E501

        :return: The height of this OfferWeightDimensionsDTO.
        :rtype: float
        """
        return self._height

    @height.setter
    def height(self, height: float):
        """Sets the height of this OfferWeightDimensionsDTO.

        Высота упаковки в см.   # noqa: E501

        :param height: The height of this OfferWeightDimensionsDTO.
        :type height: float
        """
        if height is None:
            raise ValueError("Invalid value for `height`, must not be `None`")  # noqa: E501

        self._height = height

    @property
    def weight(self) -> float:
        """Gets the weight of this OfferWeightDimensionsDTO.

        Вес товара в кг с учетом упаковки (брутто).   # noqa: E501

        :return: The weight of this OfferWeightDimensionsDTO.
        :rtype: float
        """
        return self._weight

    @weight.setter
    def weight(self, weight: float):
        """Sets the weight of this OfferWeightDimensionsDTO.

        Вес товара в кг с учетом упаковки (брутто).   # noqa: E501

        :param weight: The weight of this OfferWeightDimensionsDTO.
        :type weight: float
        """
        if weight is None:
            raise ValueError("Invalid value for `weight`, must not be `None`")  # noqa: E501

        self._weight = weight
