from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.get_promo_promocode_info_dto import GetPromoPromocodeInfoDTO
from ympa_python_flask_server.models.mechanics_type import MechanicsType
from ympa_python_flask_server import util

from ympa_python_flask_server.models.get_promo_promocode_info_dto import GetPromoPromocodeInfoDTO  # noqa: E501
from ympa_python_flask_server.models.mechanics_type import MechanicsType  # noqa: E501

class GetPromoMechanicsInfoDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, type=None, promocode_info=None):  # noqa: E501
        """GetPromoMechanicsInfoDTO - a model defined in OpenAPI

        :param type: The type of this GetPromoMechanicsInfoDTO.  # noqa: E501
        :type type: MechanicsType
        :param promocode_info: The promocode_info of this GetPromoMechanicsInfoDTO.  # noqa: E501
        :type promocode_info: GetPromoPromocodeInfoDTO
        """
        self.openapi_types = {
            'type': MechanicsType,
            'promocode_info': GetPromoPromocodeInfoDTO
        }

        self.attribute_map = {
            'type': 'type',
            'promocode_info': 'promocodeInfo'
        }

        self._type = type
        self._promocode_info = promocode_info

    @classmethod
    def from_dict(cls, dikt) -> 'GetPromoMechanicsInfoDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetPromoMechanicsInfoDTO of this GetPromoMechanicsInfoDTO.  # noqa: E501
        :rtype: GetPromoMechanicsInfoDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self) -> MechanicsType:
        """Gets the type of this GetPromoMechanicsInfoDTO.


        :return: The type of this GetPromoMechanicsInfoDTO.
        :rtype: MechanicsType
        """
        return self._type

    @type.setter
    def type(self, type: MechanicsType):
        """Sets the type of this GetPromoMechanicsInfoDTO.


        :param type: The type of this GetPromoMechanicsInfoDTO.
        :type type: MechanicsType
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type

    @property
    def promocode_info(self) -> GetPromoPromocodeInfoDTO:
        """Gets the promocode_info of this GetPromoMechanicsInfoDTO.


        :return: The promocode_info of this GetPromoMechanicsInfoDTO.
        :rtype: GetPromoPromocodeInfoDTO
        """
        return self._promocode_info

    @promocode_info.setter
    def promocode_info(self, promocode_info: GetPromoPromocodeInfoDTO):
        """Sets the promocode_info of this GetPromoMechanicsInfoDTO.


        :param promocode_info: The promocode_info of this GetPromoMechanicsInfoDTO.
        :type promocode_info: GetPromoPromocodeInfoDTO
        """

        self._promocode_info = promocode_info