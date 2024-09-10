from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class PromoOfferUpdateWarningCodeType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    DEEP_DISCOUNT_OFFER = 'DEEP_DISCOUNT_OFFER'
    CATALOG_PRICE_IS_LOWER_THAN_PROMO = 'CATALOG_PRICE_IS_LOWER_THAN_PROMO'
    SHOP_PRICES_ARE_LOWER_THAN_PROMO = 'SHOP_PRICES_ARE_LOWER_THAN_PROMO'
    PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE = 'PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE'
    SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO = 'SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO'
    def __init__(self):  # noqa: E501
        """PromoOfferUpdateWarningCodeType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'PromoOfferUpdateWarningCodeType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PromoOfferUpdateWarningCodeType of this PromoOfferUpdateWarningCodeType.  # noqa: E501
        :rtype: PromoOfferUpdateWarningCodeType
        """
        return util.deserialize_model(dikt, cls)
