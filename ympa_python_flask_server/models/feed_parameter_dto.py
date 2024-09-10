from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class FeedParameterDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, deleted=None, name=None, values=None):  # noqa: E501
        """FeedParameterDTO - a model defined in OpenAPI

        :param deleted: The deleted of this FeedParameterDTO.  # noqa: E501
        :type deleted: bool
        :param name: The name of this FeedParameterDTO.  # noqa: E501
        :type name: str
        :param values: The values of this FeedParameterDTO.  # noqa: E501
        :type values: List[int]
        """
        self.openapi_types = {
            'deleted': bool,
            'name': str,
            'values': List[int]
        }

        self.attribute_map = {
            'deleted': 'deleted',
            'name': 'name',
            'values': 'values'
        }

        self._deleted = deleted
        self._name = name
        self._values = values

    @classmethod
    def from_dict(cls, dikt) -> 'FeedParameterDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FeedParameterDTO of this FeedParameterDTO.  # noqa: E501
        :rtype: FeedParameterDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def deleted(self) -> bool:
        """Gets the deleted of this FeedParameterDTO.

        Удалить ли значение параметра.  Возможное значение: * `true` — удалить значение параметра.  Используется вместе с параметром `name`.   # noqa: E501

        :return: The deleted of this FeedParameterDTO.
        :rtype: bool
        """
        return self._deleted

    @deleted.setter
    def deleted(self, deleted: bool):
        """Sets the deleted of this FeedParameterDTO.

        Удалить ли значение параметра.  Возможное значение: * `true` — удалить значение параметра.  Используется вместе с параметром `name`.   # noqa: E501

        :param deleted: The deleted of this FeedParameterDTO.
        :type deleted: bool
        """

        self._deleted = deleted

    @property
    def name(self) -> str:
        """Gets the name of this FeedParameterDTO.

        Название параметра.  Возможное значение: - `reparseIntervalMinutes` — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре `value`. Например, при `value=1440`, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр.   # noqa: E501

        :return: The name of this FeedParameterDTO.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this FeedParameterDTO.

        Название параметра.  Возможное значение: - `reparseIntervalMinutes` — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре `value`. Например, при `value=1440`, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр.   # noqa: E501

        :param name: The name of this FeedParameterDTO.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def values(self) -> List[int]:
        """Gets the values of this FeedParameterDTO.

        Значения параметра.  Используется вместе с параметром `name`.   # noqa: E501

        :return: The values of this FeedParameterDTO.
        :rtype: List[int]
        """
        return self._values

    @values.setter
    def values(self, values: List[int]):
        """Sets the values of this FeedParameterDTO.

        Значения параметра.  Используется вместе с параметром `name`.   # noqa: E501

        :param values: The values of this FeedParameterDTO.
        :type values: List[int]
        """

        self._values = values
