# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.day_of_week_type import DayOfWeekType
from ympa_python_aiohttp_server import util


class OutletWorkingScheduleItemDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, start_day: DayOfWeekType=None, end_day: DayOfWeekType=None, start_time: str=None, end_time: str=None):
        """OutletWorkingScheduleItemDTO - a model defined in OpenAPI

        :param start_day: The start_day of this OutletWorkingScheduleItemDTO.
        :param end_day: The end_day of this OutletWorkingScheduleItemDTO.
        :param start_time: The start_time of this OutletWorkingScheduleItemDTO.
        :param end_time: The end_time of this OutletWorkingScheduleItemDTO.
        """
        self.openapi_types = {
            'start_day': DayOfWeekType,
            'end_day': DayOfWeekType,
            'start_time': str,
            'end_time': str
        }

        self.attribute_map = {
            'start_day': 'startDay',
            'end_day': 'endDay',
            'start_time': 'startTime',
            'end_time': 'endTime'
        }

        self._start_day = start_day
        self._end_day = end_day
        self._start_time = start_time
        self._end_time = end_time

    @classmethod
    def from_dict(cls, dikt: dict) -> 'OutletWorkingScheduleItemDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The OutletWorkingScheduleItemDTO of this OutletWorkingScheduleItemDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def start_day(self):
        """Gets the start_day of this OutletWorkingScheduleItemDTO.


        :return: The start_day of this OutletWorkingScheduleItemDTO.
        :rtype: DayOfWeekType
        """
        return self._start_day

    @start_day.setter
    def start_day(self, start_day):
        """Sets the start_day of this OutletWorkingScheduleItemDTO.


        :param start_day: The start_day of this OutletWorkingScheduleItemDTO.
        :type start_day: DayOfWeekType
        """
        if start_day is None:
            raise ValueError("Invalid value for `start_day`, must not be `None`")

        self._start_day = start_day

    @property
    def end_day(self):
        """Gets the end_day of this OutletWorkingScheduleItemDTO.


        :return: The end_day of this OutletWorkingScheduleItemDTO.
        :rtype: DayOfWeekType
        """
        return self._end_day

    @end_day.setter
    def end_day(self, end_day):
        """Sets the end_day of this OutletWorkingScheduleItemDTO.


        :param end_day: The end_day of this OutletWorkingScheduleItemDTO.
        :type end_day: DayOfWeekType
        """
        if end_day is None:
            raise ValueError("Invalid value for `end_day`, must not be `None`")

        self._end_day = end_day

    @property
    def start_time(self):
        """Gets the start_time of this OutletWorkingScheduleItemDTO.

        Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 

        :return: The start_time of this OutletWorkingScheduleItemDTO.
        :rtype: str
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time):
        """Sets the start_time of this OutletWorkingScheduleItemDTO.

        Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 

        :param start_time: The start_time of this OutletWorkingScheduleItemDTO.
        :type start_time: str
        """
        if start_time is None:
            raise ValueError("Invalid value for `start_time`, must not be `None`")
        if start_time is not None and len(start_time) < 1:
            raise ValueError("Invalid value for `start_time`, length must be greater than or equal to `1`")

        self._start_time = start_time

    @property
    def end_time(self):
        """Gets the end_time of this OutletWorkingScheduleItemDTO.

        Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 

        :return: The end_time of this OutletWorkingScheduleItemDTO.
        :rtype: str
        """
        return self._end_time

    @end_time.setter
    def end_time(self, end_time):
        """Sets the end_time of this OutletWorkingScheduleItemDTO.

        Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 

        :param end_time: The end_time of this OutletWorkingScheduleItemDTO.
        :type end_time: str
        """
        if end_time is None:
            raise ValueError("Invalid value for `end_time`, must not be `None`")
        if end_time is not None and len(end_time) < 1:
            raise ValueError("Invalid value for `end_time`, length must be greater than or equal to `1`")

        self._end_time = end_time
