from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.sku_bid_recommendation_item_dto import SkuBidRecommendationItemDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.sku_bid_recommendation_item_dto import SkuBidRecommendationItemDTO  # noqa: E501

class GetBidsRecommendationsResponseDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, recommendations=None):  # noqa: E501
        """GetBidsRecommendationsResponseDTO - a model defined in OpenAPI

        :param recommendations: The recommendations of this GetBidsRecommendationsResponseDTO.  # noqa: E501
        :type recommendations: List[SkuBidRecommendationItemDTO]
        """
        self.openapi_types = {
            'recommendations': List[SkuBidRecommendationItemDTO]
        }

        self.attribute_map = {
            'recommendations': 'recommendations'
        }

        self._recommendations = recommendations

    @classmethod
    def from_dict(cls, dikt) -> 'GetBidsRecommendationsResponseDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetBidsRecommendationsResponseDTO of this GetBidsRecommendationsResponseDTO.  # noqa: E501
        :rtype: GetBidsRecommendationsResponseDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def recommendations(self) -> List[SkuBidRecommendationItemDTO]:
        """Gets the recommendations of this GetBidsRecommendationsResponseDTO.

        Список товаров с рекомендованными ставками.  # noqa: E501

        :return: The recommendations of this GetBidsRecommendationsResponseDTO.
        :rtype: List[SkuBidRecommendationItemDTO]
        """
        return self._recommendations

    @recommendations.setter
    def recommendations(self, recommendations: List[SkuBidRecommendationItemDTO]):
        """Sets the recommendations of this GetBidsRecommendationsResponseDTO.

        Список товаров с рекомендованными ставками.  # noqa: E501

        :param recommendations: The recommendations of this GetBidsRecommendationsResponseDTO.
        :type recommendations: List[SkuBidRecommendationItemDTO]
        """
        if recommendations is None:
            raise ValueError("Invalid value for `recommendations`, must not be `None`")  # noqa: E501

        self._recommendations = recommendations
