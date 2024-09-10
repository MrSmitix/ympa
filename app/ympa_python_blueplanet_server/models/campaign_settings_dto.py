# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.campaign_settings_local_region_dto import CampaignSettingsLocalRegionDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class CampaignSettingsDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, country_region: int=None, shop_name: str=None, show_in_context: bool=None, show_in_premium: bool=None, use_open_stat: bool=None, local_region: CampaignSettingsLocalRegionDTO=None):  # noqa: E501
        """CampaignSettingsDTO - a model defined in Swagger

        :param country_region: The country_region of this CampaignSettingsDTO.  # noqa: E501
        :type country_region: int
        :param shop_name: The shop_name of this CampaignSettingsDTO.  # noqa: E501
        :type shop_name: str
        :param show_in_context: The show_in_context of this CampaignSettingsDTO.  # noqa: E501
        :type show_in_context: bool
        :param show_in_premium: The show_in_premium of this CampaignSettingsDTO.  # noqa: E501
        :type show_in_premium: bool
        :param use_open_stat: The use_open_stat of this CampaignSettingsDTO.  # noqa: E501
        :type use_open_stat: bool
        :param local_region: The local_region of this CampaignSettingsDTO.  # noqa: E501
        :type local_region: CampaignSettingsLocalRegionDTO
        """
        self.swagger_types = {
            'country_region': int,
            'shop_name': str,
            'show_in_context': bool,
            'show_in_premium': bool,
            'use_open_stat': bool,
            'local_region': CampaignSettingsLocalRegionDTO
        }

        self.attribute_map = {
            'country_region': 'countryRegion',
            'shop_name': 'shopName',
            'show_in_context': 'showInContext',
            'show_in_premium': 'showInPremium',
            'use_open_stat': 'useOpenStat',
            'local_region': 'localRegion'
        }

        self._country_region = country_region
        self._shop_name = shop_name
        self._show_in_context = show_in_context
        self._show_in_premium = show_in_premium
        self._use_open_stat = use_open_stat
        self._local_region = local_region

    @classmethod
    def from_dict(cls, dikt) -> 'CampaignSettingsDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CampaignSettingsDTO of this CampaignSettingsDTO.  # noqa: E501
        :rtype: CampaignSettingsDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def country_region(self) -> int:
        """Gets the country_region of this CampaignSettingsDTO.

        Идентификатор региона, в котором находится магазин.  # noqa: E501

        :return: The country_region of this CampaignSettingsDTO.
        :rtype: int
        """
        return self._country_region

    @country_region.setter
    def country_region(self, country_region: int):
        """Sets the country_region of this CampaignSettingsDTO.

        Идентификатор региона, в котором находится магазин.  # noqa: E501

        :param country_region: The country_region of this CampaignSettingsDTO.
        :type country_region: int
        """

        self._country_region = country_region

    @property
    def shop_name(self) -> str:
        """Gets the shop_name of this CampaignSettingsDTO.

        Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`.   # noqa: E501

        :return: The shop_name of this CampaignSettingsDTO.
        :rtype: str
        """
        return self._shop_name

    @shop_name.setter
    def shop_name(self, shop_name: str):
        """Sets the shop_name of this CampaignSettingsDTO.

        Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`.   # noqa: E501

        :param shop_name: The shop_name of this CampaignSettingsDTO.
        :type shop_name: str
        """

        self._shop_name = shop_name

    @property
    def show_in_context(self) -> bool:
        """Gets the show_in_context of this CampaignSettingsDTO.

        Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции.   # noqa: E501

        :return: The show_in_context of this CampaignSettingsDTO.
        :rtype: bool
        """
        return self._show_in_context

    @show_in_context.setter
    def show_in_context(self, show_in_context: bool):
        """Sets the show_in_context of this CampaignSettingsDTO.

        Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции.   # noqa: E501

        :param show_in_context: The show_in_context of this CampaignSettingsDTO.
        :type show_in_context: bool
        """

        self._show_in_context = show_in_context

    @property
    def show_in_premium(self) -> bool:
        """Gets the show_in_premium of this CampaignSettingsDTO.

        Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения.   # noqa: E501

        :return: The show_in_premium of this CampaignSettingsDTO.
        :rtype: bool
        """
        return self._show_in_premium

    @show_in_premium.setter
    def show_in_premium(self, show_in_premium: bool):
        """Sets the show_in_premium of this CampaignSettingsDTO.

        Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения.   # noqa: E501

        :param show_in_premium: The show_in_premium of this CampaignSettingsDTO.
        :type show_in_premium: bool
        """

        self._show_in_premium = show_in_premium

    @property
    def use_open_stat(self) -> bool:
        """Gets the use_open_stat of this CampaignSettingsDTO.

        Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется.   # noqa: E501

        :return: The use_open_stat of this CampaignSettingsDTO.
        :rtype: bool
        """
        return self._use_open_stat

    @use_open_stat.setter
    def use_open_stat(self, use_open_stat: bool):
        """Sets the use_open_stat of this CampaignSettingsDTO.

        Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется.   # noqa: E501

        :param use_open_stat: The use_open_stat of this CampaignSettingsDTO.
        :type use_open_stat: bool
        """

        self._use_open_stat = use_open_stat

    @property
    def local_region(self) -> CampaignSettingsLocalRegionDTO:
        """Gets the local_region of this CampaignSettingsDTO.


        :return: The local_region of this CampaignSettingsDTO.
        :rtype: CampaignSettingsLocalRegionDTO
        """
        return self._local_region

    @local_region.setter
    def local_region(self, local_region: CampaignSettingsLocalRegionDTO):
        """Sets the local_region of this CampaignSettingsDTO.


        :param local_region: The local_region of this CampaignSettingsDTO.
        :type local_region: CampaignSettingsLocalRegionDTO
        """

        self._local_region = local_region
