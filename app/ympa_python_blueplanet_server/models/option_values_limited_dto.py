# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from ympa_python_blueplanet_server import util


class OptionValuesLimitedDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, limiting_option_value_id: int=None, option_value_ids: List[int]=None):  # noqa: E501
        """OptionValuesLimitedDTO - a model defined in Swagger

        :param limiting_option_value_id: The limiting_option_value_id of this OptionValuesLimitedDTO.  # noqa: E501
        :type limiting_option_value_id: int
        :param option_value_ids: The option_value_ids of this OptionValuesLimitedDTO.  # noqa: E501
        :type option_value_ids: List[int]
        """
        self.swagger_types = {
            'limiting_option_value_id': int,
            'option_value_ids': List[int]
        }

        self.attribute_map = {
            'limiting_option_value_id': 'limitingOptionValueId',
            'option_value_ids': 'optionValueIds'
        }

        self._limiting_option_value_id = limiting_option_value_id
        self._option_value_ids = option_value_ids

    @classmethod
    def from_dict(cls, dikt) -> 'OptionValuesLimitedDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OptionValuesLimitedDTO of this OptionValuesLimitedDTO.  # noqa: E501
        :rtype: OptionValuesLimitedDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def limiting_option_value_id(self) -> int:
        """Gets the limiting_option_value_id of this OptionValuesLimitedDTO.

        Идентификатор значения ограничивающей характеристики.  # noqa: E501

        :return: The limiting_option_value_id of this OptionValuesLimitedDTO.
        :rtype: int
        """
        return self._limiting_option_value_id

    @limiting_option_value_id.setter
    def limiting_option_value_id(self, limiting_option_value_id: int):
        """Sets the limiting_option_value_id of this OptionValuesLimitedDTO.

        Идентификатор значения ограничивающей характеристики.  # noqa: E501

        :param limiting_option_value_id: The limiting_option_value_id of this OptionValuesLimitedDTO.
        :type limiting_option_value_id: int
        """
        if limiting_option_value_id is None:
            raise ValueError("Invalid value for `limiting_option_value_id`, must not be `None`")  # noqa: E501

        self._limiting_option_value_id = limiting_option_value_id

    @property
    def option_value_ids(self) -> List[int]:
        """Gets the option_value_ids of this OptionValuesLimitedDTO.

        Идентификаторы допустимых значений ограничиваемой характеристики.   # noqa: E501

        :return: The option_value_ids of this OptionValuesLimitedDTO.
        :rtype: List[int]
        """
        return self._option_value_ids

    @option_value_ids.setter
    def option_value_ids(self, option_value_ids: List[int]):
        """Sets the option_value_ids of this OptionValuesLimitedDTO.

        Идентификаторы допустимых значений ограничиваемой характеристики.   # noqa: E501

        :param option_value_ids: The option_value_ids of this OptionValuesLimitedDTO.
        :type option_value_ids: List[int]
        """
        if option_value_ids is None:
            raise ValueError("Invalid value for `option_value_ids`, must not be `None`")  # noqa: E501

        self._option_value_ids = option_value_ids
