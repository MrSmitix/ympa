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
from ympa_python_flask_server.models.calculate_tariffs_request import CalculateTariffsRequest  # noqa: E501
from ympa_python_flask_server.models.calculate_tariffs_response import CalculateTariffsResponse  # noqa: E501
from ympa_python_flask_server import util


def calculate_tariffs(calculate_tariffs_request):  # noqa: E501
    """Калькулятор стоимости услуг

    Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-|  # noqa: E501

    :param calculate_tariffs_request: 
    :type calculate_tariffs_request: dict | bytes

    :rtype: Union[CalculateTariffsResponse, Tuple[CalculateTariffsResponse, int], Tuple[CalculateTariffsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        calculate_tariffs_request = CalculateTariffsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
