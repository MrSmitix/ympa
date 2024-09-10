from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.update_promo_offer_discount_params_dto import UpdatePromoOfferDiscountParamsDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.update_promo_offer_discount_params_dto import UpdatePromoOfferDiscountParamsDTO  # noqa: E501

class UpdatePromoOfferParamsDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, discount_params=None):  # noqa: E501
        """UpdatePromoOfferParamsDTO - a model defined in OpenAPI

        :param discount_params: The discount_params of this UpdatePromoOfferParamsDTO.  # noqa: E501
        :type discount_params: UpdatePromoOfferDiscountParamsDTO
        """
        self.openapi_types = {
            'discount_params': UpdatePromoOfferDiscountParamsDTO
        }

        self.attribute_map = {
            'discount_params': 'discountParams'
        }

        self._discount_params = discount_params

    @classmethod
    def from_dict(cls, dikt) -> 'UpdatePromoOfferParamsDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UpdatePromoOfferParamsDTO of this UpdatePromoOfferParamsDTO.  # noqa: E501
        :rtype: UpdatePromoOfferParamsDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def discount_params(self) -> UpdatePromoOfferDiscountParamsDTO:
        """Gets the discount_params of this UpdatePromoOfferParamsDTO.


        :return: The discount_params of this UpdatePromoOfferParamsDTO.
        :rtype: UpdatePromoOfferDiscountParamsDTO
        """
        return self._discount_params

    @discount_params.setter
    def discount_params(self, discount_params: UpdatePromoOfferDiscountParamsDTO):
        """Sets the discount_params of this UpdatePromoOfferParamsDTO.


        :param discount_params: The discount_params of this UpdatePromoOfferParamsDTO.
        :type discount_params: UpdatePromoOfferDiscountParamsDTO
        """

        self._discount_params = discount_params