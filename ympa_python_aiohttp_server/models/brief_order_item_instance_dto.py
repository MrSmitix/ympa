# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server import util


class BriefOrderItemInstanceDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, cis: str=None, uin: str=None, rnpt: str=None, gtd: str=None):
        """BriefOrderItemInstanceDTO - a model defined in OpenAPI

        :param cis: The cis of this BriefOrderItemInstanceDTO.
        :param uin: The uin of this BriefOrderItemInstanceDTO.
        :param rnpt: The rnpt of this BriefOrderItemInstanceDTO.
        :param gtd: The gtd of this BriefOrderItemInstanceDTO.
        """
        self.openapi_types = {
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
    def from_dict(cls, dikt: dict) -> 'BriefOrderItemInstanceDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The BriefOrderItemInstanceDTO of this BriefOrderItemInstanceDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def cis(self):
        """Gets the cis of this BriefOrderItemInstanceDTO.

        Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя `\\u001d`!  ✅ `01030410947874432155Qbag!\\u001d93Zjqw`  ❌ `01030410947874432155Qbag!\\\\u001d93Zjqw`  Косые черты и кавычки в других местах экранируйте по правилам JSON: `\\\\` и `\\\"`  {% endnote %} 

        :return: The cis of this BriefOrderItemInstanceDTO.
        :rtype: str
        """
        return self._cis

    @cis.setter
    def cis(self, cis):
        """Sets the cis of this BriefOrderItemInstanceDTO.

        Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя `\\u001d`!  ✅ `01030410947874432155Qbag!\\u001d93Zjqw`  ❌ `01030410947874432155Qbag!\\\\u001d93Zjqw`  Косые черты и кавычки в других местах экранируйте по правилам JSON: `\\\\` и `\\\"`  {% endnote %} 

        :param cis: The cis of this BriefOrderItemInstanceDTO.
        :type cis: str
        """

        self._cis = cis

    @property
    def uin(self):
        """Gets the uin of this BriefOrderItemInstanceDTO.

        Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр. 

        :return: The uin of this BriefOrderItemInstanceDTO.
        :rtype: str
        """
        return self._uin

    @uin.setter
    def uin(self, uin):
        """Sets the uin of this BriefOrderItemInstanceDTO.

        Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр. 

        :param uin: The uin of this BriefOrderItemInstanceDTO.
        :type uin: str
        """

        self._uin = uin

    @property
    def rnpt(self):
        """Gets the rnpt of this BriefOrderItemInstanceDTO.

        Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. 

        :return: The rnpt of this BriefOrderItemInstanceDTO.
        :rtype: str
        """
        return self._rnpt

    @rnpt.setter
    def rnpt(self, rnpt):
        """Sets the rnpt of this BriefOrderItemInstanceDTO.

        Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. 

        :param rnpt: The rnpt of this BriefOrderItemInstanceDTO.
        :type rnpt: str
        """

        self._rnpt = rnpt

    @property
    def gtd(self):
        """Gets the gtd of this BriefOrderItemInstanceDTO.

        Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. 

        :return: The gtd of this BriefOrderItemInstanceDTO.
        :rtype: str
        """
        return self._gtd

    @gtd.setter
    def gtd(self, gtd):
        """Sets the gtd of this BriefOrderItemInstanceDTO.

        Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. 

        :param gtd: The gtd of this BriefOrderItemInstanceDTO.
        :type gtd: str
        """

        self._gtd = gtd
