from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.offer_for_recommendation_dto import OfferForRecommendationDTO
from ympa_python_flask_server.models.offer_recommendation_info_dto import OfferRecommendationInfoDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.offer_for_recommendation_dto import OfferForRecommendationDTO  # noqa: E501
from ympa_python_flask_server.models.offer_recommendation_info_dto import OfferRecommendationInfoDTO  # noqa: E501

class OfferRecommendationDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, offer=None, recommendation=None):  # noqa: E501
        """OfferRecommendationDTO - a model defined in OpenAPI

        :param offer: The offer of this OfferRecommendationDTO.  # noqa: E501
        :type offer: OfferForRecommendationDTO
        :param recommendation: The recommendation of this OfferRecommendationDTO.  # noqa: E501
        :type recommendation: OfferRecommendationInfoDTO
        """
        self.openapi_types = {
            'offer': OfferForRecommendationDTO,
            'recommendation': OfferRecommendationInfoDTO
        }

        self.attribute_map = {
            'offer': 'offer',
            'recommendation': 'recommendation'
        }

        self._offer = offer
        self._recommendation = recommendation

    @classmethod
    def from_dict(cls, dikt) -> 'OfferRecommendationDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OfferRecommendationDTO of this OfferRecommendationDTO.  # noqa: E501
        :rtype: OfferRecommendationDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer(self) -> OfferForRecommendationDTO:
        """Gets the offer of this OfferRecommendationDTO.


        :return: The offer of this OfferRecommendationDTO.
        :rtype: OfferForRecommendationDTO
        """
        return self._offer

    @offer.setter
    def offer(self, offer: OfferForRecommendationDTO):
        """Sets the offer of this OfferRecommendationDTO.


        :param offer: The offer of this OfferRecommendationDTO.
        :type offer: OfferForRecommendationDTO
        """

        self._offer = offer

    @property
    def recommendation(self) -> OfferRecommendationInfoDTO:
        """Gets the recommendation of this OfferRecommendationDTO.


        :return: The recommendation of this OfferRecommendationDTO.
        :rtype: OfferRecommendationInfoDTO
        """
        return self._recommendation

    @recommendation.setter
    def recommendation(self, recommendation: OfferRecommendationInfoDTO):
        """Sets the recommendation of this OfferRecommendationDTO.


        :param recommendation: The recommendation of this OfferRecommendationDTO.
        :type recommendation: OfferRecommendationInfoDTO
        """

        self._recommendation = recommendation