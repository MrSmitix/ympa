from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class OfferParamDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name=None, value=None):  # noqa: E501
        """OfferParamDTO - a model defined in OpenAPI

        :param name: The name of this OfferParamDTO.  # noqa: E501
        :type name: str
        :param value: The value of this OfferParamDTO.  # noqa: E501
        :type value: str
        """
        self.openapi_types = {
            'name': str,
            'value': str
        }

        self.attribute_map = {
            'name': 'name',
            'value': 'value'
        }

        self._name = name
        self._value = value

    @classmethod
    def from_dict(cls, dikt) -> 'OfferParamDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OfferParamDTO of this OfferParamDTO.  # noqa: E501
        :rtype: OfferParamDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> str:
        """Gets the name of this OfferParamDTO.

        Название.  Должно совпадать с названием характеристики на Маркете. Узнать его можно из Excel-шаблона категории или через запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).   # noqa: E501

        :return: The name of this OfferParamDTO.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this OfferParamDTO.

        Название.  Должно совпадать с названием характеристики на Маркете. Узнать его можно из Excel-шаблона категории или через запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).   # noqa: E501

        :param name: The name of this OfferParamDTO.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def value(self) -> str:
        """Gets the value of this OfferParamDTO.

        Значение.   # noqa: E501

        :return: The value of this OfferParamDTO.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value: str):
        """Sets the value of this OfferParamDTO.

        Значение.   # noqa: E501

        :param value: The value of this OfferParamDTO.
        :type value: str
        """
        if value is None:
            raise ValueError("Invalid value for `value`, must not be `None`")  # noqa: E501

        self._value = value
