# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.license_type import LicenseType
from ympa_python_aiohttp_server import util


class OutletLicenseDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, outlet_id: int=None, license_type: LicenseType=None, number: str=None, date_of_issue: datetime=None, date_of_expiry: datetime=None):
        """OutletLicenseDTO - a model defined in OpenAPI

        :param id: The id of this OutletLicenseDTO.
        :param outlet_id: The outlet_id of this OutletLicenseDTO.
        :param license_type: The license_type of this OutletLicenseDTO.
        :param number: The number of this OutletLicenseDTO.
        :param date_of_issue: The date_of_issue of this OutletLicenseDTO.
        :param date_of_expiry: The date_of_expiry of this OutletLicenseDTO.
        """
        self.openapi_types = {
            'id': int,
            'outlet_id': int,
            'license_type': LicenseType,
            'number': str,
            'date_of_issue': datetime,
            'date_of_expiry': datetime
        }

        self.attribute_map = {
            'id': 'id',
            'outlet_id': 'outletId',
            'license_type': 'licenseType',
            'number': 'number',
            'date_of_issue': 'dateOfIssue',
            'date_of_expiry': 'dateOfExpiry'
        }

        self._id = id
        self._outlet_id = outlet_id
        self._license_type = license_type
        self._number = number
        self._date_of_issue = date_of_issue
        self._date_of_expiry = date_of_expiry

    @classmethod
    def from_dict(cls, dikt: dict) -> 'OutletLicenseDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The OutletLicenseDTO of this OutletLicenseDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this OutletLicenseDTO.

        Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. 

        :return: The id of this OutletLicenseDTO.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this OutletLicenseDTO.

        Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. 

        :param id: The id of this OutletLicenseDTO.
        :type id: int
        """

        self._id = id

    @property
    def outlet_id(self):
        """Gets the outlet_id of this OutletLicenseDTO.

        Идентификатор точки продаж, для которой действительна лицензия.

        :return: The outlet_id of this OutletLicenseDTO.
        :rtype: int
        """
        return self._outlet_id

    @outlet_id.setter
    def outlet_id(self, outlet_id):
        """Sets the outlet_id of this OutletLicenseDTO.

        Идентификатор точки продаж, для которой действительна лицензия.

        :param outlet_id: The outlet_id of this OutletLicenseDTO.
        :type outlet_id: int
        """

        self._outlet_id = outlet_id

    @property
    def license_type(self):
        """Gets the license_type of this OutletLicenseDTO.


        :return: The license_type of this OutletLicenseDTO.
        :rtype: LicenseType
        """
        return self._license_type

    @license_type.setter
    def license_type(self, license_type):
        """Sets the license_type of this OutletLicenseDTO.


        :param license_type: The license_type of this OutletLicenseDTO.
        :type license_type: LicenseType
        """

        self._license_type = license_type

    @property
    def number(self):
        """Gets the number of this OutletLicenseDTO.

        Номер лицензии.

        :return: The number of this OutletLicenseDTO.
        :rtype: str
        """
        return self._number

    @number.setter
    def number(self, number):
        """Sets the number of this OutletLicenseDTO.

        Номер лицензии.

        :param number: The number of this OutletLicenseDTO.
        :type number: str
        """

        self._number = number

    @property
    def date_of_issue(self):
        """Gets the date_of_issue of this OutletLicenseDTO.

        Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. 

        :return: The date_of_issue of this OutletLicenseDTO.
        :rtype: datetime
        """
        return self._date_of_issue

    @date_of_issue.setter
    def date_of_issue(self, date_of_issue):
        """Sets the date_of_issue of this OutletLicenseDTO.

        Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. 

        :param date_of_issue: The date_of_issue of this OutletLicenseDTO.
        :type date_of_issue: datetime
        """

        self._date_of_issue = date_of_issue

    @property
    def date_of_expiry(self):
        """Gets the date_of_expiry of this OutletLicenseDTO.

        Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. 

        :return: The date_of_expiry of this OutletLicenseDTO.
        :rtype: datetime
        """
        return self._date_of_expiry

    @date_of_expiry.setter
    def date_of_expiry(self, date_of_expiry):
        """Sets the date_of_expiry of this OutletLicenseDTO.

        Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. 

        :param date_of_expiry: The date_of_expiry of this OutletLicenseDTO.
        :type date_of_expiry: datetime
        """

        self._date_of_expiry = date_of_expiry
