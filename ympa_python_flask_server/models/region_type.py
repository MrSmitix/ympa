from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class RegionType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    OTHER = 'OTHER'
    CONTINENT = 'CONTINENT'
    REGION = 'REGION'
    COUNTRY = 'COUNTRY'
    COUNTRY_DISTRICT = 'COUNTRY_DISTRICT'
    REPUBLIC = 'REPUBLIC'
    CITY = 'CITY'
    VILLAGE = 'VILLAGE'
    CITY_DISTRICT = 'CITY_DISTRICT'
    SUBWAY_STATION = 'SUBWAY_STATION'
    REPUBLIC_AREA = 'REPUBLIC_AREA'
    def __init__(self):  # noqa: E501
        """RegionType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'RegionType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RegionType of this RegionType.  # noqa: E501
        :rtype: RegionType
        """
        return util.deserialize_model(dikt, cls)