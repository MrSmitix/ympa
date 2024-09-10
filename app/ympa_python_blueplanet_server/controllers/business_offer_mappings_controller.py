import connexion

from app.ympa_python_blueplanet_server.models.add_offers_to_archive_request import AddOffersToArchiveRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.add_offers_to_archive_response import AddOffersToArchiveResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_locked_error_response import ApiLockedErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.delete_offers_from_archive_request import DeleteOffersFromArchiveRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.delete_offers_from_archive_response import DeleteOffersFromArchiveResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.delete_offers_request import DeleteOffersRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.delete_offers_response import DeleteOffersResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_offer_mappings_request import GetOfferMappingsRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_offer_mappings_response import GetOfferMappingsResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_suggested_offer_mappings_request import GetSuggestedOfferMappingsRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_suggested_offer_mappings_response import GetSuggestedOfferMappingsResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.update_offer_mappings_request import UpdateOfferMappingsRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.update_offer_mappings_response import UpdateOfferMappingsResponse  # noqa: E501
from ympa_python_blueplanet_server import util


def add_offers_to_archive(business_id, body):  # noqa: E501
    """Добавление товаров в архив

    Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \&quot;В архив нельзя отправить товар, который хранится на складе Маркета\&quot; %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param body: 
    :type body: dict | bytes

    :rtype: AddOffersToArchiveResponse
    """
    if connexion.request.is_json:
        body = AddOffersToArchiveRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_offers(business_id, body):  # noqa: E501
    """Удаление товаров из каталога

    Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param body: 
    :type body: dict | bytes

    :rtype: DeleteOffersResponse
    """
    if connexion.request.is_json:
        body = DeleteOffersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_offers_from_archive(business_id, body):  # noqa: E501
    """Удаление товаров из архива

    Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param body: 
    :type body: dict | bytes

    :rtype: DeleteOffersFromArchiveResponse
    """
    if connexion.request.is_json:
        body = DeleteOffersFromArchiveRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_offer_mappings(business_id, page_token=None, limit=None, body=None):  # noqa: E501
    """Информация о товарах в каталоге

    Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int
    :param body: 
    :type body: dict | bytes

    :rtype: GetOfferMappingsResponse
    """
    if connexion.request.is_json:
        body = GetOfferMappingsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_suggested_offer_mappings(business_id, body=None):  # noqa: E501
    """Просмотр карточек на Маркете, которые подходят вашим товарам

    Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида &#x60;https://market.yandex.ru/product/&lt;marketModelId&gt;?sku&#x3D;&lt;marketSku&gt;&#x60;. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать &#x60;marketSKU&#x60;, который ему подходит по вашему мнению.  {% note info \&quot;𝓠 Как определить &#x60;marketSku&#x60; товара, найденного на Маркете?\&quot; %}  𝓐 Он есть в адресе страницы товара — расположен после &#x60;sku&#x3D;&#x60;.  Например, &#x60;https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016&#x60;  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param body: 
    :type body: dict | bytes

    :rtype: GetSuggestedOfferMappingsResponse
    """
    if connexion.request.is_json:
        body = GetSuggestedOfferMappingsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_offer_mappings(business_id, body):  # noqa: E501
    """Добавление товаров в каталог и изменение информации о них

    Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле &#x60;marketSKU&#x60;.  Для **новых товаров** обязательно укажите параметры: &#x60;offerId&#x60;, &#x60;name&#x60;, &#x60;marketCategoryId&#x60; или &#x60;category&#x60;, &#x60;pictures&#x60;, &#x60;vendor&#x60;, &#x60;description&#x60;.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в &#x60;offerId&#x60; соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  Параметр &#x60;offerId&#x60; должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \&quot;Правила использования SKU\&quot; %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param body: 
    :type body: dict | bytes

    :rtype: UpdateOfferMappingsResponse
    """
    if connexion.request.is_json:
        body = UpdateOfferMappingsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
