from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class ApiErrorDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, code=None, message=None):  # noqa: E501
        """ApiErrorDTO - a model defined in OpenAPI

        :param code: The code of this ApiErrorDTO.  # noqa: E501
        :type code: str
        :param message: The message of this ApiErrorDTO.  # noqa: E501
        :type message: str
        """
        self.openapi_types = {
            'code': str,
            'message': str
        }

        self.attribute_map = {
            'code': 'code',
            'message': 'message'
        }

        self._code = code
        self._message = message

    @classmethod
    def from_dict(cls, dikt) -> 'ApiErrorDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ApiErrorDTO of this ApiErrorDTO.  # noqa: E501
        :rtype: ApiErrorDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def code(self) -> str:
        """Gets the code of this ApiErrorDTO.

        Код ошибки.  # noqa: E501

        :return: The code of this ApiErrorDTO.
        :rtype: str
        """
        return self._code

    @code.setter
    def code(self, code: str):
        """Sets the code of this ApiErrorDTO.

        Код ошибки.  # noqa: E501

        :param code: The code of this ApiErrorDTO.
        :type code: str
        """
        if code is None:
            raise ValueError("Invalid value for `code`, must not be `None`")  # noqa: E501

        self._code = code

    @property
    def message(self) -> str:
        """Gets the message of this ApiErrorDTO.

        Описание ошибки.  # noqa: E501

        :return: The message of this ApiErrorDTO.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message: str):
        """Sets the message of this ApiErrorDTO.

        Описание ошибки.  # noqa: E501

        :param message: The message of this ApiErrorDTO.
        :type message: str
        """

        self._message = message