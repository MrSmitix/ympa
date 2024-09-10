import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.get_delivery_services_response import GetDeliveryServicesResponse  # noqa: E501
from ympa_python_flask_server import util


def get_delivery_services():  # noqa: E501
    """Справочник служб доставки

    Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-|  # noqa: E501


    :rtype: Union[GetDeliveryServicesResponse, Tuple[GetDeliveryServicesResponse, int], Tuple[GetDeliveryServicesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
