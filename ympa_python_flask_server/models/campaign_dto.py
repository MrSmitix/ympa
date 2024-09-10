from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.business_dto import BusinessDTO
from ympa_python_flask_server.models.placement_type import PlacementType
from ympa_python_flask_server import util

from ympa_python_flask_server.models.business_dto import BusinessDTO  # noqa: E501
from ympa_python_flask_server.models.placement_type import PlacementType  # noqa: E501

class CampaignDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, domain=None, id=None, client_id=None, business=None, placement_type=None):  # noqa: E501
        """CampaignDTO - a model defined in OpenAPI

        :param domain: The domain of this CampaignDTO.  # noqa: E501
        :type domain: str
        :param id: The id of this CampaignDTO.  # noqa: E501
        :type id: int
        :param client_id: The client_id of this CampaignDTO.  # noqa: E501
        :type client_id: int
        :param business: The business of this CampaignDTO.  # noqa: E501
        :type business: BusinessDTO
        :param placement_type: The placement_type of this CampaignDTO.  # noqa: E501
        :type placement_type: PlacementType
        """
        self.openapi_types = {
            'domain': str,
            'id': int,
            'client_id': int,
            'business': BusinessDTO,
            'placement_type': PlacementType
        }

        self.attribute_map = {
            'domain': 'domain',
            'id': 'id',
            'client_id': 'clientId',
            'business': 'business',
            'placement_type': 'placementType'
        }

        self._domain = domain
        self._id = id
        self._client_id = client_id
        self._business = business
        self._placement_type = placement_type

    @classmethod
    def from_dict(cls, dikt) -> 'CampaignDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CampaignDTO of this CampaignDTO.  # noqa: E501
        :rtype: CampaignDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def domain(self) -> str:
        """Gets the domain of this CampaignDTO.

        URL магазина.  # noqa: E501

        :return: The domain of this CampaignDTO.
        :rtype: str
        """
        return self._domain

    @domain.setter
    def domain(self, domain: str):
        """Sets the domain of this CampaignDTO.

        URL магазина.  # noqa: E501

        :param domain: The domain of this CampaignDTO.
        :type domain: str
        """

        self._domain = domain

    @property
    def id(self) -> int:
        """Gets the id of this CampaignDTO.

        Идентификатор кампании.  # noqa: E501

        :return: The id of this CampaignDTO.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this CampaignDTO.

        Идентификатор кампании.  # noqa: E501

        :param id: The id of this CampaignDTO.
        :type id: int
        """

        self._id = id

    @property
    def client_id(self) -> int:
        """Gets the client_id of this CampaignDTO.

        Идентификатор плательщика в Яндекс Балансе.  # noqa: E501

        :return: The client_id of this CampaignDTO.
        :rtype: int
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id: int):
        """Sets the client_id of this CampaignDTO.

        Идентификатор плательщика в Яндекс Балансе.  # noqa: E501

        :param client_id: The client_id of this CampaignDTO.
        :type client_id: int
        """

        self._client_id = client_id

    @property
    def business(self) -> BusinessDTO:
        """Gets the business of this CampaignDTO.


        :return: The business of this CampaignDTO.
        :rtype: BusinessDTO
        """
        return self._business

    @business.setter
    def business(self, business: BusinessDTO):
        """Sets the business of this CampaignDTO.


        :param business: The business of this CampaignDTO.
        :type business: BusinessDTO
        """

        self._business = business

    @property
    def placement_type(self) -> PlacementType:
        """Gets the placement_type of this CampaignDTO.


        :return: The placement_type of this CampaignDTO.
        :rtype: PlacementType
        """
        return self._placement_type

    @placement_type.setter
    def placement_type(self, placement_type: PlacementType):
        """Sets the placement_type of this CampaignDTO.


        :param placement_type: The placement_type of this CampaignDTO.
        :type placement_type: PlacementType
        """

        self._placement_type = placement_type
