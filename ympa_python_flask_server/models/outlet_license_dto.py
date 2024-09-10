from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.license_type import LicenseType
from ympa_python_flask_server import util

from ympa_python_flask_server.models.license_type import LicenseType  # noqa: E501

class OutletLicenseDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, outlet_id=None, license_type=None, number=None, date_of_issue=None, date_of_expiry=None):  # noqa: E501
        """OutletLicenseDTO - a model defined in OpenAPI

        :param id: The id of this OutletLicenseDTO.  # noqa: E501
        :type id: int
        :param outlet_id: The outlet_id of this OutletLicenseDTO.  # noqa: E501
        :type outlet_id: int
        :param license_type: The license_type of this OutletLicenseDTO.  # noqa: E501
        :type license_type: LicenseType
        :param number: The number of this OutletLicenseDTO.  # noqa: E501
        :type number: str
        :param date_of_issue: The date_of_issue of this OutletLicenseDTO.  # noqa: E501
        :type date_of_issue: datetime
        :param date_of_expiry: The date_of_expiry of this OutletLicenseDTO.  # noqa: E501
        :type date_of_expiry: datetime
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
    def from_dict(cls, dikt) -> 'OutletLicenseDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OutletLicenseDTO of this OutletLicenseDTO.  # noqa: E501
        :rtype: OutletLicenseDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """Gets the id of this OutletLicenseDTO.

        Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`.   # noqa: E501

        :return: The id of this OutletLicenseDTO.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this OutletLicenseDTO.

        Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`.   # noqa: E501

        :param id: The id of this OutletLicenseDTO.
        :type id: int
        """

        self._id = id

    @property
    def outlet_id(self) -> int:
        """Gets the outlet_id of this OutletLicenseDTO.

        Идентификатор точки продаж, для которой действительна лицензия.  # noqa: E501

        :return: The outlet_id of this OutletLicenseDTO.
        :rtype: int
        """
        return self._outlet_id

    @outlet_id.setter
    def outlet_id(self, outlet_id: int):
        """Sets the outlet_id of this OutletLicenseDTO.

        Идентификатор точки продаж, для которой действительна лицензия.  # noqa: E501

        :param outlet_id: The outlet_id of this OutletLicenseDTO.
        :type outlet_id: int
        """

        self._outlet_id = outlet_id

    @property
    def license_type(self) -> LicenseType:
        """Gets the license_type of this OutletLicenseDTO.


        :return: The license_type of this OutletLicenseDTO.
        :rtype: LicenseType
        """
        return self._license_type

    @license_type.setter
    def license_type(self, license_type: LicenseType):
        """Sets the license_type of this OutletLicenseDTO.


        :param license_type: The license_type of this OutletLicenseDTO.
        :type license_type: LicenseType
        """

        self._license_type = license_type

    @property
    def number(self) -> str:
        """Gets the number of this OutletLicenseDTO.

        Номер лицензии.  # noqa: E501

        :return: The number of this OutletLicenseDTO.
        :rtype: str
        """
        return self._number

    @number.setter
    def number(self, number: str):
        """Sets the number of this OutletLicenseDTO.

        Номер лицензии.  # noqa: E501

        :param number: The number of this OutletLicenseDTO.
        :type number: str
        """

        self._number = number

    @property
    def date_of_issue(self) -> datetime:
        """Gets the date_of_issue of this OutletLicenseDTO.

        Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`.   # noqa: E501

        :return: The date_of_issue of this OutletLicenseDTO.
        :rtype: datetime
        """
        return self._date_of_issue

    @date_of_issue.setter
    def date_of_issue(self, date_of_issue: datetime):
        """Sets the date_of_issue of this OutletLicenseDTO.

        Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`.   # noqa: E501

        :param date_of_issue: The date_of_issue of this OutletLicenseDTO.
        :type date_of_issue: datetime
        """

        self._date_of_issue = date_of_issue

    @property
    def date_of_expiry(self) -> datetime:
        """Gets the date_of_expiry of this OutletLicenseDTO.

        Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`.   # noqa: E501

        :return: The date_of_expiry of this OutletLicenseDTO.
        :rtype: datetime
        """
        return self._date_of_expiry

    @date_of_expiry.setter
    def date_of_expiry(self, date_of_expiry: datetime):
        """Sets the date_of_expiry of this OutletLicenseDTO.

        Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`.   # noqa: E501

        :param date_of_expiry: The date_of_expiry of this OutletLicenseDTO.
        :type date_of_expiry: datetime
        """

        self._date_of_expiry = date_of_expiry
