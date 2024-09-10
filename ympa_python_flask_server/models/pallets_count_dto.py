from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class PalletsCountDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, planned=None, fact=None):  # noqa: E501
        """PalletsCountDTO - a model defined in OpenAPI

        :param planned: The planned of this PalletsCountDTO.  # noqa: E501
        :type planned: int
        :param fact: The fact of this PalletsCountDTO.  # noqa: E501
        :type fact: int
        """
        self.openapi_types = {
            'planned': int,
            'fact': int
        }

        self.attribute_map = {
            'planned': 'planned',
            'fact': 'fact'
        }

        self._planned = planned
        self._fact = fact

    @classmethod
    def from_dict(cls, dikt) -> 'PalletsCountDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PalletsCountDTO of this PalletsCountDTO.  # noqa: E501
        :rtype: PalletsCountDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def planned(self) -> int:
        """Gets the planned of this PalletsCountDTO.

        Количество палет, которое заявил продавец.  # noqa: E501

        :return: The planned of this PalletsCountDTO.
        :rtype: int
        """
        return self._planned

    @planned.setter
    def planned(self, planned: int):
        """Sets the planned of this PalletsCountDTO.

        Количество палет, которое заявил продавец.  # noqa: E501

        :param planned: The planned of this PalletsCountDTO.
        :type planned: int
        """

        self._planned = planned

    @property
    def fact(self) -> int:
        """Gets the fact of this PalletsCountDTO.

        Количество палет, которое приняли в сортировочном центре.  # noqa: E501

        :return: The fact of this PalletsCountDTO.
        :rtype: int
        """
        return self._fact

    @fact.setter
    def fact(self, fact: int):
        """Sets the fact of this PalletsCountDTO.

        Количество палет, которое приняли в сортировочном центре.  # noqa: E501

        :param fact: The fact of this PalletsCountDTO.
        :type fact: int
        """

        self._fact = fact
