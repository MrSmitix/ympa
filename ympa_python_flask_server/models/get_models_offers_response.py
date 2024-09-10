from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.currency_type import CurrencyType
from ympa_python_flask_server.models.enriched_model_dto import EnrichedModelDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.currency_type import CurrencyType  # noqa: E501
from ympa_python_flask_server.models.enriched_model_dto import EnrichedModelDTO  # noqa: E501

class GetModelsOffersResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, models=None, currency=None, region_id=None):  # noqa: E501
        """GetModelsOffersResponse - a model defined in OpenAPI

        :param models: The models of this GetModelsOffersResponse.  # noqa: E501
        :type models: List[EnrichedModelDTO]
        :param currency: The currency of this GetModelsOffersResponse.  # noqa: E501
        :type currency: CurrencyType
        :param region_id: The region_id of this GetModelsOffersResponse.  # noqa: E501
        :type region_id: int
        """
        self.openapi_types = {
            'models': List[EnrichedModelDTO],
            'currency': CurrencyType,
            'region_id': int
        }

        self.attribute_map = {
            'models': 'models',
            'currency': 'currency',
            'region_id': 'regionId'
        }

        self._models = models
        self._currency = currency
        self._region_id = region_id

    @classmethod
    def from_dict(cls, dikt) -> 'GetModelsOffersResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetModelsOffersResponse of this GetModelsOffersResponse.  # noqa: E501
        :rtype: GetModelsOffersResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def models(self) -> List[EnrichedModelDTO]:
        """Gets the models of this GetModelsOffersResponse.

        Список моделей товаров.  # noqa: E501

        :return: The models of this GetModelsOffersResponse.
        :rtype: List[EnrichedModelDTO]
        """
        return self._models

    @models.setter
    def models(self, models: List[EnrichedModelDTO]):
        """Sets the models of this GetModelsOffersResponse.

        Список моделей товаров.  # noqa: E501

        :param models: The models of this GetModelsOffersResponse.
        :type models: List[EnrichedModelDTO]
        """
        if models is None:
            raise ValueError("Invalid value for `models`, must not be `None`")  # noqa: E501

        self._models = models

    @property
    def currency(self) -> CurrencyType:
        """Gets the currency of this GetModelsOffersResponse.


        :return: The currency of this GetModelsOffersResponse.
        :rtype: CurrencyType
        """
        return self._currency

    @currency.setter
    def currency(self, currency: CurrencyType):
        """Sets the currency of this GetModelsOffersResponse.


        :param currency: The currency of this GetModelsOffersResponse.
        :type currency: CurrencyType
        """

        self._currency = currency

    @property
    def region_id(self) -> int:
        """Gets the region_id of this GetModelsOffersResponse.

        Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).   # noqa: E501

        :return: The region_id of this GetModelsOffersResponse.
        :rtype: int
        """
        return self._region_id

    @region_id.setter
    def region_id(self, region_id: int):
        """Sets the region_id of this GetModelsOffersResponse.

        Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).   # noqa: E501

        :param region_id: The region_id of this GetModelsOffersResponse.
        :type region_id: int
        """

        self._region_id = region_id
