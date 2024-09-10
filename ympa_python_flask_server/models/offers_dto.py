from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.offer_dto import OfferDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.offer_dto import OfferDTO  # noqa: E501

class OffersDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, offers=None):  # noqa: E501
        """OffersDTO - a model defined in OpenAPI

        :param offers: The offers of this OffersDTO.  # noqa: E501
        :type offers: List[OfferDTO]
        """
        self.openapi_types = {
            'offers': List[OfferDTO]
        }

        self.attribute_map = {
            'offers': 'offers'
        }

        self._offers = offers

    @classmethod
    def from_dict(cls, dikt) -> 'OffersDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OffersDTO of this OffersDTO.  # noqa: E501
        :rtype: OffersDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offers(self) -> List[OfferDTO]:
        """Gets the offers of this OffersDTO.

        Список предложений магазина.  # noqa: E501

        :return: The offers of this OffersDTO.
        :rtype: List[OfferDTO]
        """
        return self._offers

    @offers.setter
    def offers(self, offers: List[OfferDTO]):
        """Sets the offers of this OffersDTO.

        Список предложений магазина.  # noqa: E501

        :param offers: The offers of this OffersDTO.
        :type offers: List[OfferDTO]
        """
        if offers is None:
            raise ValueError("Invalid value for `offers`, must not be `None`")  # noqa: E501

        self._offers = offers
