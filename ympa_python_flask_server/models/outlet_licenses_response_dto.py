from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.full_outlet_license_dto import FullOutletLicenseDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.full_outlet_license_dto import FullOutletLicenseDTO  # noqa: E501

class OutletLicensesResponseDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, licenses=None):  # noqa: E501
        """OutletLicensesResponseDTO - a model defined in OpenAPI

        :param licenses: The licenses of this OutletLicensesResponseDTO.  # noqa: E501
        :type licenses: List[FullOutletLicenseDTO]
        """
        self.openapi_types = {
            'licenses': List[FullOutletLicenseDTO]
        }

        self.attribute_map = {
            'licenses': 'licenses'
        }

        self._licenses = licenses

    @classmethod
    def from_dict(cls, dikt) -> 'OutletLicensesResponseDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OutletLicensesResponseDTO of this OutletLicensesResponseDTO.  # noqa: E501
        :rtype: OutletLicensesResponseDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def licenses(self) -> List[FullOutletLicenseDTO]:
        """Gets the licenses of this OutletLicensesResponseDTO.

        Список лицензий.  # noqa: E501

        :return: The licenses of this OutletLicensesResponseDTO.
        :rtype: List[FullOutletLicenseDTO]
        """
        return self._licenses

    @licenses.setter
    def licenses(self, licenses: List[FullOutletLicenseDTO]):
        """Sets the licenses of this OutletLicensesResponseDTO.

        Список лицензий.  # noqa: E501

        :param licenses: The licenses of this OutletLicensesResponseDTO.
        :type licenses: List[FullOutletLicenseDTO]
        """
        if licenses is None:
            raise ValueError("Invalid value for `licenses`, must not be `None`")  # noqa: E501

        self._licenses = licenses
