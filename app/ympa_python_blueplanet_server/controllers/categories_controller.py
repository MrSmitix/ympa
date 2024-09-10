import connexion

from app.ympa_python_blueplanet_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_categories_max_sale_quantum_request import GetCategoriesMaxSaleQuantumRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_categories_max_sale_quantum_response import GetCategoriesMaxSaleQuantumResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_categories_request import GetCategoriesRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_categories_response import GetCategoriesResponse  # noqa: E501
from ympa_python_blueplanet_server import util


def get_categories_max_sale_quantum(body):  # noqa: E501
    """Лимит на установку кванта продажи и минимального количества товаров в заказе

    Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-|  # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: GetCategoriesMaxSaleQuantumResponse
    """
    if connexion.request.is_json:
        body = GetCategoriesMaxSaleQuantumRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_categories_tree(body=None):  # noqa: E501
    """Дерево категорий

    Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-|  # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: GetCategoriesResponse
    """
    if connexion.request.is_json:
        body = GetCategoriesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
