from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.campaign_settings_time_period_dto import CampaignSettingsTimePeriodDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.campaign_settings_time_period_dto import CampaignSettingsTimePeriodDTO  # noqa: E501

class CampaignSettingsScheduleDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, available_on_holidays=None, custom_holidays=None, custom_working_days=None, period=None, total_holidays=None, weekly_holidays=None):  # noqa: E501
        """CampaignSettingsScheduleDTO - a model defined in OpenAPI

        :param available_on_holidays: The available_on_holidays of this CampaignSettingsScheduleDTO.  # noqa: E501
        :type available_on_holidays: bool
        :param custom_holidays: The custom_holidays of this CampaignSettingsScheduleDTO.  # noqa: E501
        :type custom_holidays: List[str]
        :param custom_working_days: The custom_working_days of this CampaignSettingsScheduleDTO.  # noqa: E501
        :type custom_working_days: List[str]
        :param period: The period of this CampaignSettingsScheduleDTO.  # noqa: E501
        :type period: CampaignSettingsTimePeriodDTO
        :param total_holidays: The total_holidays of this CampaignSettingsScheduleDTO.  # noqa: E501
        :type total_holidays: List[str]
        :param weekly_holidays: The weekly_holidays of this CampaignSettingsScheduleDTO.  # noqa: E501
        :type weekly_holidays: List[int]
        """
        self.openapi_types = {
            'available_on_holidays': bool,
            'custom_holidays': List[str],
            'custom_working_days': List[str],
            'period': CampaignSettingsTimePeriodDTO,
            'total_holidays': List[str],
            'weekly_holidays': List[int]
        }

        self.attribute_map = {
            'available_on_holidays': 'availableOnHolidays',
            'custom_holidays': 'customHolidays',
            'custom_working_days': 'customWorkingDays',
            'period': 'period',
            'total_holidays': 'totalHolidays',
            'weekly_holidays': 'weeklyHolidays'
        }

        self._available_on_holidays = available_on_holidays
        self._custom_holidays = custom_holidays
        self._custom_working_days = custom_working_days
        self._period = period
        self._total_holidays = total_holidays
        self._weekly_holidays = weekly_holidays

    @classmethod
    def from_dict(cls, dikt) -> 'CampaignSettingsScheduleDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CampaignSettingsScheduleDTO of this CampaignSettingsScheduleDTO.  # noqa: E501
        :rtype: CampaignSettingsScheduleDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def available_on_holidays(self) -> bool:
        """Gets the available_on_holidays of this CampaignSettingsScheduleDTO.

        Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни.   # noqa: E501

        :return: The available_on_holidays of this CampaignSettingsScheduleDTO.
        :rtype: bool
        """
        return self._available_on_holidays

    @available_on_holidays.setter
    def available_on_holidays(self, available_on_holidays: bool):
        """Sets the available_on_holidays of this CampaignSettingsScheduleDTO.

        Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни.   # noqa: E501

        :param available_on_holidays: The available_on_holidays of this CampaignSettingsScheduleDTO.
        :type available_on_holidays: bool
        """

        self._available_on_holidays = available_on_holidays

    @property
    def custom_holidays(self) -> List[str]:
        """Gets the custom_holidays of this CampaignSettingsScheduleDTO.

        Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.  # noqa: E501

        :return: The custom_holidays of this CampaignSettingsScheduleDTO.
        :rtype: List[str]
        """
        return self._custom_holidays

    @custom_holidays.setter
    def custom_holidays(self, custom_holidays: List[str]):
        """Sets the custom_holidays of this CampaignSettingsScheduleDTO.

        Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.  # noqa: E501

        :param custom_holidays: The custom_holidays of this CampaignSettingsScheduleDTO.
        :type custom_holidays: List[str]
        """
        if custom_holidays is None:
            raise ValueError("Invalid value for `custom_holidays`, must not be `None`")  # noqa: E501

        self._custom_holidays = custom_holidays

    @property
    def custom_working_days(self) -> List[str]:
        """Gets the custom_working_days of this CampaignSettingsScheduleDTO.

        Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.  # noqa: E501

        :return: The custom_working_days of this CampaignSettingsScheduleDTO.
        :rtype: List[str]
        """
        return self._custom_working_days

    @custom_working_days.setter
    def custom_working_days(self, custom_working_days: List[str]):
        """Sets the custom_working_days of this CampaignSettingsScheduleDTO.

        Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.  # noqa: E501

        :param custom_working_days: The custom_working_days of this CampaignSettingsScheduleDTO.
        :type custom_working_days: List[str]
        """
        if custom_working_days is None:
            raise ValueError("Invalid value for `custom_working_days`, must not be `None`")  # noqa: E501

        self._custom_working_days = custom_working_days

    @property
    def period(self) -> CampaignSettingsTimePeriodDTO:
        """Gets the period of this CampaignSettingsScheduleDTO.


        :return: The period of this CampaignSettingsScheduleDTO.
        :rtype: CampaignSettingsTimePeriodDTO
        """
        return self._period

    @period.setter
    def period(self, period: CampaignSettingsTimePeriodDTO):
        """Sets the period of this CampaignSettingsScheduleDTO.


        :param period: The period of this CampaignSettingsScheduleDTO.
        :type period: CampaignSettingsTimePeriodDTO
        """

        self._period = period

    @property
    def total_holidays(self) -> List[str]:
        """Gets the total_holidays of this CampaignSettingsScheduleDTO.

        Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.  # noqa: E501

        :return: The total_holidays of this CampaignSettingsScheduleDTO.
        :rtype: List[str]
        """
        return self._total_holidays

    @total_holidays.setter
    def total_holidays(self, total_holidays: List[str]):
        """Sets the total_holidays of this CampaignSettingsScheduleDTO.

        Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.  # noqa: E501

        :param total_holidays: The total_holidays of this CampaignSettingsScheduleDTO.
        :type total_holidays: List[str]
        """
        if total_holidays is None:
            raise ValueError("Invalid value for `total_holidays`, must not be `None`")  # noqa: E501

        self._total_holidays = total_holidays

    @property
    def weekly_holidays(self) -> List[int]:
        """Gets the weekly_holidays of this CampaignSettingsScheduleDTO.

        Список выходных дней недели и государственных праздников.  # noqa: E501

        :return: The weekly_holidays of this CampaignSettingsScheduleDTO.
        :rtype: List[int]
        """
        return self._weekly_holidays

    @weekly_holidays.setter
    def weekly_holidays(self, weekly_holidays: List[int]):
        """Sets the weekly_holidays of this CampaignSettingsScheduleDTO.

        Список выходных дней недели и государственных праздников.  # noqa: E501

        :param weekly_holidays: The weekly_holidays of this CampaignSettingsScheduleDTO.
        :type weekly_holidays: List[int]
        """
        if weekly_holidays is None:
            raise ValueError("Invalid value for `weekly_holidays`, must not be `None`")  # noqa: E501

        self._weekly_holidays = weekly_holidays