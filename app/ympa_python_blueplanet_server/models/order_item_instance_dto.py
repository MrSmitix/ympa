# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from ympa_python_blueplanet_server import util


class OrderItemInstanceDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, cis: str=None, cis_full: str=None, uin: str=None, rnpt: str=None, gtd: str=None):  # noqa: E501
        """OrderItemInstanceDTO - a model defined in Swagger

        :param cis: The cis of this OrderItemInstanceDTO.  # noqa: E501
        :type cis: str
        :param cis_full: The cis_full of this OrderItemInstanceDTO.  # noqa: E501
        :type cis_full: str
        :param uin: The uin of this OrderItemInstanceDTO.  # noqa: E501
        :type uin: str
        :param rnpt: The rnpt of this OrderItemInstanceDTO.  # noqa: E501
        :type rnpt: str
        :param gtd: The gtd of this OrderItemInstanceDTO.  # noqa: E501
        :type gtd: str
        """
        self.swagger_types = {
            'cis': str,
            'cis_full': str,
            'uin': str,
            'rnpt': str,
            'gtd': str
        }

        self.attribute_map = {
            'cis': 'cis',
            'cis_full': 'cisFull',
            'uin': 'uin',
            'rnpt': 'rnpt',
            'gtd': 'gtd'
        }

        self._cis = cis
        self._cis_full = cis_full
        self._uin = uin
        self._rnpt = rnpt
        self._gtd = gtd

    @classmethod
    def from_dict(cls, dikt) -> 'OrderItemInstanceDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrderItemInstanceDTO of this OrderItemInstanceDTO.  # noqa: E501
        :rtype: OrderItemInstanceDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def cis(self) -> str:
        """Gets the cis of this OrderItemInstanceDTO.

        Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.  # noqa: E501

        :return: The cis of this OrderItemInstanceDTO.
        :rtype: str
        """
        return self._cis

    @cis.setter
    def cis(self, cis: str):
        """Sets the cis of this OrderItemInstanceDTO.

        Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.  # noqa: E501

        :param cis: The cis of this OrderItemInstanceDTO.
        :type cis: str
        """

        self._cis = cis

    @property
    def cis_full(self) -> str:
        """Gets the cis_full of this OrderItemInstanceDTO.

        Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом.  # noqa: E501

        :return: The cis_full of this OrderItemInstanceDTO.
        :rtype: str
        """
        return self._cis_full

    @cis_full.setter
    def cis_full(self, cis_full: str):
        """Sets the cis_full of this OrderItemInstanceDTO.

        Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом.  # noqa: E501

        :param cis_full: The cis_full of this OrderItemInstanceDTO.
        :type cis_full: str
        """

        self._cis_full = cis_full

    @property
    def uin(self) -> str:
        """Gets the uin of this OrderItemInstanceDTO.

        УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК.   # noqa: E501

        :return: The uin of this OrderItemInstanceDTO.
        :rtype: str
        """
        return self._uin

    @uin.setter
    def uin(self, uin: str):
        """Sets the uin of this OrderItemInstanceDTO.

        УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК.   # noqa: E501

        :param uin: The uin of this OrderItemInstanceDTO.
        :type uin: str
        """

        self._uin = uin

    @property
    def rnpt(self) -> str:
        """Gets the rnpt of this OrderItemInstanceDTO.

        Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации.   # noqa: E501

        :return: The rnpt of this OrderItemInstanceDTO.
        :rtype: str
        """
        return self._rnpt

    @rnpt.setter
    def rnpt(self, rnpt: str):
        """Sets the rnpt of this OrderItemInstanceDTO.

        Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации.   # noqa: E501

        :param rnpt: The rnpt of this OrderItemInstanceDTO.
        :type rnpt: str
        """

        self._rnpt = rnpt

    @property
    def gtd(self) -> str:
        """Gets the gtd of this OrderItemInstanceDTO.

        Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации.   # noqa: E501

        :return: The gtd of this OrderItemInstanceDTO.
        :rtype: str
        """
        return self._gtd

    @gtd.setter
    def gtd(self, gtd: str):
        """Sets the gtd of this OrderItemInstanceDTO.

        Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации.   # noqa: E501

        :param gtd: The gtd of this OrderItemInstanceDTO.
        :type gtd: str
        """

        self._gtd = gtd
