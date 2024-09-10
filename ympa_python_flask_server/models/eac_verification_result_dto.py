from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.eac_verification_status_type import EacVerificationStatusType
from ympa_python_flask_server import util

from ympa_python_flask_server.models.eac_verification_status_type import EacVerificationStatusType  # noqa: E501

class EacVerificationResultDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, verification_result=None, attempts_left=None):  # noqa: E501
        """EacVerificationResultDTO - a model defined in OpenAPI

        :param verification_result: The verification_result of this EacVerificationResultDTO.  # noqa: E501
        :type verification_result: EacVerificationStatusType
        :param attempts_left: The attempts_left of this EacVerificationResultDTO.  # noqa: E501
        :type attempts_left: int
        """
        self.openapi_types = {
            'verification_result': EacVerificationStatusType,
            'attempts_left': int
        }

        self.attribute_map = {
            'verification_result': 'verificationResult',
            'attempts_left': 'attemptsLeft'
        }

        self._verification_result = verification_result
        self._attempts_left = attempts_left

    @classmethod
    def from_dict(cls, dikt) -> 'EacVerificationResultDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The EacVerificationResultDTO of this EacVerificationResultDTO.  # noqa: E501
        :rtype: EacVerificationResultDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def verification_result(self) -> EacVerificationStatusType:
        """Gets the verification_result of this EacVerificationResultDTO.


        :return: The verification_result of this EacVerificationResultDTO.
        :rtype: EacVerificationStatusType
        """
        return self._verification_result

    @verification_result.setter
    def verification_result(self, verification_result: EacVerificationStatusType):
        """Sets the verification_result of this EacVerificationResultDTO.


        :param verification_result: The verification_result of this EacVerificationResultDTO.
        :type verification_result: EacVerificationStatusType
        """

        self._verification_result = verification_result

    @property
    def attempts_left(self) -> int:
        """Gets the attempts_left of this EacVerificationResultDTO.

        Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится.   # noqa: E501

        :return: The attempts_left of this EacVerificationResultDTO.
        :rtype: int
        """
        return self._attempts_left

    @attempts_left.setter
    def attempts_left(self, attempts_left: int):
        """Sets the attempts_left of this EacVerificationResultDTO.

        Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится.   # noqa: E501

        :param attempts_left: The attempts_left of this EacVerificationResultDTO.
        :type attempts_left: int
        """

        self._attempts_left = attempts_left
