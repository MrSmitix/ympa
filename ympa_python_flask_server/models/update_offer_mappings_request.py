from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.update_offer_mapping_dto import UpdateOfferMappingDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.update_offer_mapping_dto import UpdateOfferMappingDTO  # noqa: E501

class UpdateOfferMappingsRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, offer_mappings=None, only_partner_media_content=None):  # noqa: E501
        """UpdateOfferMappingsRequest - a model defined in OpenAPI

        :param offer_mappings: The offer_mappings of this UpdateOfferMappingsRequest.  # noqa: E501
        :type offer_mappings: List[UpdateOfferMappingDTO]
        :param only_partner_media_content: The only_partner_media_content of this UpdateOfferMappingsRequest.  # noqa: E501
        :type only_partner_media_content: bool
        """
        self.openapi_types = {
            'offer_mappings': List[UpdateOfferMappingDTO],
            'only_partner_media_content': bool
        }

        self.attribute_map = {
            'offer_mappings': 'offerMappings',
            'only_partner_media_content': 'onlyPartnerMediaContent'
        }

        self._offer_mappings = offer_mappings
        self._only_partner_media_content = only_partner_media_content

    @classmethod
    def from_dict(cls, dikt) -> 'UpdateOfferMappingsRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UpdateOfferMappingsRequest of this UpdateOfferMappingsRequest.  # noqa: E501
        :rtype: UpdateOfferMappingsRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer_mappings(self) -> List[UpdateOfferMappingDTO]:
        """Gets the offer_mappings of this UpdateOfferMappingsRequest.

        Перечень товаров, которые нужно добавить или обновить.  # noqa: E501

        :return: The offer_mappings of this UpdateOfferMappingsRequest.
        :rtype: List[UpdateOfferMappingDTO]
        """
        return self._offer_mappings

    @offer_mappings.setter
    def offer_mappings(self, offer_mappings: List[UpdateOfferMappingDTO]):
        """Sets the offer_mappings of this UpdateOfferMappingsRequest.

        Перечень товаров, которые нужно добавить или обновить.  # noqa: E501

        :param offer_mappings: The offer_mappings of this UpdateOfferMappingsRequest.
        :type offer_mappings: List[UpdateOfferMappingDTO]
        """
        if offer_mappings is None:
            raise ValueError("Invalid value for `offer_mappings`, must not be `None`")  # noqa: E501
        if offer_mappings is not None and len(offer_mappings) > 500:
            raise ValueError("Invalid value for `offer_mappings`, number of items must be less than or equal to `500`")  # noqa: E501
        if offer_mappings is not None and len(offer_mappings) < 1:
            raise ValueError("Invalid value for `offer_mappings`, number of items must be greater than or equal to `1`")  # noqa: E501

        self._offer_mappings = offer_mappings

    @property
    def only_partner_media_content(self) -> bool:
        """Gets the only_partner_media_content of this UpdateOfferMappingsRequest.

        Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`.   # noqa: E501

        :return: The only_partner_media_content of this UpdateOfferMappingsRequest.
        :rtype: bool
        """
        return self._only_partner_media_content

    @only_partner_media_content.setter
    def only_partner_media_content(self, only_partner_media_content: bool):
        """Sets the only_partner_media_content of this UpdateOfferMappingsRequest.

        Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`.   # noqa: E501

        :param only_partner_media_content: The only_partner_media_content of this UpdateOfferMappingsRequest.
        :type only_partner_media_content: bool
        """

        self._only_partner_media_content = only_partner_media_content
