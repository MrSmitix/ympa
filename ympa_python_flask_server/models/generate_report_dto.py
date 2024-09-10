from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class GenerateReportDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, report_id=None, estimated_generation_time=None):  # noqa: E501
        """GenerateReportDTO - a model defined in OpenAPI

        :param report_id: The report_id of this GenerateReportDTO.  # noqa: E501
        :type report_id: str
        :param estimated_generation_time: The estimated_generation_time of this GenerateReportDTO.  # noqa: E501
        :type estimated_generation_time: int
        """
        self.openapi_types = {
            'report_id': str,
            'estimated_generation_time': int
        }

        self.attribute_map = {
            'report_id': 'reportId',
            'estimated_generation_time': 'estimatedGenerationTime'
        }

        self._report_id = report_id
        self._estimated_generation_time = estimated_generation_time

    @classmethod
    def from_dict(cls, dikt) -> 'GenerateReportDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GenerateReportDTO of this GenerateReportDTO.  # noqa: E501
        :rtype: GenerateReportDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def report_id(self) -> str:
        """Gets the report_id of this GenerateReportDTO.

        Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.  # noqa: E501

        :return: The report_id of this GenerateReportDTO.
        :rtype: str
        """
        return self._report_id

    @report_id.setter
    def report_id(self, report_id: str):
        """Sets the report_id of this GenerateReportDTO.

        Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.  # noqa: E501

        :param report_id: The report_id of this GenerateReportDTO.
        :type report_id: str
        """
        if report_id is None:
            raise ValueError("Invalid value for `report_id`, must not be `None`")  # noqa: E501

        self._report_id = report_id

    @property
    def estimated_generation_time(self) -> int:
        """Gets the estimated_generation_time of this GenerateReportDTO.

        Ожидаемая продолжительность генерации в миллисекундах.  # noqa: E501

        :return: The estimated_generation_time of this GenerateReportDTO.
        :rtype: int
        """
        return self._estimated_generation_time

    @estimated_generation_time.setter
    def estimated_generation_time(self, estimated_generation_time: int):
        """Sets the estimated_generation_time of this GenerateReportDTO.

        Ожидаемая продолжительность генерации в миллисекундах.  # noqa: E501

        :param estimated_generation_time: The estimated_generation_time of this GenerateReportDTO.
        :type estimated_generation_time: int
        """
        if estimated_generation_time is None:
            raise ValueError("Invalid value for `estimated_generation_time`, must not be `None`")  # noqa: E501

        self._estimated_generation_time = estimated_generation_time