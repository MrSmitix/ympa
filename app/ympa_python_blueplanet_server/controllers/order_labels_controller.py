import connexion

from app.ympa_python_blueplanet_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_order_labels_data_response import GetOrderLabelsDataResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.page_format_type import PageFormatType  # noqa: E501
from ympa_python_blueplanet_server import util


def generate_order_label(campaign_id, order_id, shipment_id, box_id, format=None):  # noqa: E501
    """Готовый ярлык‑наклейка для коробки в заказе

    Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param order_id: Идентификатор заказа.
    :type order_id: int
    :param shipment_id: Идентификатор грузоместа.
    :type shipment_id: int
    :param box_id: Идентификатор коробки.
    :type box_id: int
    :param format: Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
    :type format: dict | bytes

    :rtype: file
    """
    if connexion.request.is_json:
        format = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_order_labels(campaign_id, order_id, format=None):  # noqa: E501
    """Готовые ярлыки‑наклейки на все коробки в одном заказе

    Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param order_id: Идентификатор заказа.
    :type order_id: int
    :param format: Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
    :type format: dict | bytes

    :rtype: file
    """
    if connexion.request.is_json:
        format = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_order_labels_data(campaign_id, order_id):  # noqa: E501
    """Данные для самостоятельного изготовления ярлыков

    Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param order_id: Идентификатор заказа.
    :type order_id: int

    :rtype: GetOrderLabelsDataResponse
    """
    return 'do some magic!'
