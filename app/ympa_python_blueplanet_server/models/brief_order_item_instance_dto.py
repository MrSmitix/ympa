# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from ympa_python_blueplanet_server import util


class BriefOrderItemInstanceDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, cis: str=None, uin: str=None, rnpt: str=None, gtd: str=None):  # noqa: E501
        """BriefOrderItemInstanceDTO - a model defined in Swagger

        :param cis: The cis of this BriefOrderItemInstanceDTO.  # noqa: E501
        :type cis: str
        :param uin: The uin of this BriefOrderItemInstanceDTO.  # noqa: E501
        :type uin: str
        :param rnpt: The rnpt of this BriefOrderItemInstanceDTO.  # noqa: E501
        :type rnpt: str
        :param gtd: The gtd of this BriefOrderItemInstanceDTO.  # noqa: E501
        :type gtd: str
        """
        self.swagger_types = {
            'cis': str,
            'uin': str,
            'rnpt': str,
            'gtd': str
        }

        self.attribute_map = {
            'cis': 'cis',
            'uin': 'uin',
            'rnpt': 'rnpt',
            'gtd': 'gtd'
        }

        self._cis = cis
        self._uin = uin
        self._rnpt = rnpt
        self._gtd = gtd

    @classmethod
    def from_dict(cls, dikt) -> 'BriefOrderItemInstanceDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BriefOrderItemInstanceDTO of this BriefOrderItemInstanceDTO.  # noqa: E501
        :rtype: BriefOrderItemInstanceDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def cis(self) -> str:
        """Gets the cis of this BriefOrderItemInstanceDTO.

        Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя `\\u001d`!  ✅ `01030410947874432155Qbag!\\u001d93Zjqw`  ❌ `01030410947874432155Qbag!\\\\u001d93Zjqw`  Косые черты и кавычки в других местах экранируйте по правилам JSON: `\\\\` и `\\\"`  {% endnote %}   # noqa: E501

        :return: The cis of this BriefOrderItemInstanceDTO.
        :rtype: str
        """
        return self._cis

    @cis.setter
    def cis(self, cis: str):
        """Sets the cis of this BriefOrderItemInstanceDTO.

        Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя `\\u001d`!  ✅ `01030410947874432155Qbag!\\u001d93Zjqw`  ❌ `01030410947874432155Qbag!\\\\u001d93Zjqw`  Косые черты и кавычки в других местах экранируйте по правилам JSON: `\\\\` и `\\\"`  {% endnote %}   # noqa: E501

        :param cis: The cis of this BriefOrderItemInstanceDTO.
        :type cis: str
        """

        self._cis = cis

    @property
    def uin(self) -> str:
        """Gets the uin of this BriefOrderItemInstanceDTO.

        Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр.   # noqa: E501

        :return: The uin of this BriefOrderItemInstanceDTO.
        :rtype: str
        """
        return self._uin

    @uin.setter
    def uin(self, uin: str):
        """Sets the uin of this BriefOrderItemInstanceDTO.

        Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр.   # noqa: E501

        :param uin: The uin of this BriefOrderItemInstanceDTO.
        :type uin: str
        """

        self._uin = uin

    @property
    def rnpt(self) -> str:
        """Gets the rnpt of this BriefOrderItemInstanceDTO.

        Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации.   # noqa: E501

        :return: The rnpt of this BriefOrderItemInstanceDTO.
        :rtype: str
        """
        return self._rnpt

    @rnpt.setter
    def rnpt(self, rnpt: str):
        """Sets the rnpt of this BriefOrderItemInstanceDTO.

        Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации.   # noqa: E501

        :param rnpt: The rnpt of this BriefOrderItemInstanceDTO.
        :type rnpt: str
        """

        self._rnpt = rnpt

    @property
    def gtd(self) -> str:
        """Gets the gtd of this BriefOrderItemInstanceDTO.

        Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации.   # noqa: E501

        :return: The gtd of this BriefOrderItemInstanceDTO.
        :rtype: str
        """
        return self._gtd

    @gtd.setter
    def gtd(self, gtd: str):
        """Sets the gtd of this BriefOrderItemInstanceDTO.

        Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации.   # noqa: E501

        :param gtd: The gtd of this BriefOrderItemInstanceDTO.
        :type gtd: str
        """

        self._gtd = gtd