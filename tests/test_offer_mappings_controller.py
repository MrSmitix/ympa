# coding: utf-8

import pytest
import json
from aiohttp import web

from ympa_python_aiohttp_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_aiohttp_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_aiohttp_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_aiohttp_server.models.api_locked_error_response import ApiLockedErrorResponse
from ympa_python_aiohttp_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_aiohttp_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_aiohttp_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_aiohttp_server.models.empty_api_response import EmptyApiResponse
from ympa_python_aiohttp_server.models.get_offer_mapping_entries_response import GetOfferMappingEntriesResponse
from ympa_python_aiohttp_server.models.get_suggested_offer_mapping_entries_request import GetSuggestedOfferMappingEntriesRequest
from ympa_python_aiohttp_server.models.get_suggested_offer_mapping_entries_response import GetSuggestedOfferMappingEntriesResponse
from ympa_python_aiohttp_server.models.offer_availability_status_type import OfferAvailabilityStatusType
from ympa_python_aiohttp_server.models.offer_mapping_kind_type import OfferMappingKindType
from ympa_python_aiohttp_server.models.offer_processing_status_type import OfferProcessingStatusType
from ympa_python_aiohttp_server.models.update_offer_mapping_entry_request import UpdateOfferMappingEntryRequest


pytestmark = pytest.mark.asyncio

async def test_get_offer_mapping_entries(client):
    """Test case for get_offer_mapping_entries

    Список товаров в каталоге
    """
    params = [('offer_id', ['offer_id_example']),
                    ('shop_sku', ['shop_sku_example']),
                    ('mapping_kind', ympa_python_aiohttp_server.OfferMappingKindType()),
                    ('status', [ympa_python_aiohttp_server.OfferProcessingStatusType()]),
                    ('availability', [ympa_python_aiohttp_server.OfferAvailabilityStatusType()]),
                    ('category_id', [56]),
                    ('vendor', ['vendor_example']),
                    ('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/offer-mapping-entries'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_suggested_offer_mapping_entries(client):
    """Test case for get_suggested_offer_mapping_entries

    Рекомендованные карточки для товаров
    """
    body = {"offers":[{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","price":2.027123023002322,"transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","price":2.027123023002322,"transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","price":2.027123023002322,"transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","price":2.027123023002322,"transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","price":2.027123023002322,"transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/offer-mapping-entries/suggestions'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_offer_mapping_entries(client):
    """Test case for update_offer_mapping_entries

    Добавление и редактирование товаров в каталоге
    """
    body = {"offerMappingEntries":[{"offer":{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},"mapping":{"modelId":7,"marketSku":4,"categoryId":1},"awaitingModerationMapping":{"modelId":7,"marketSku":4,"categoryId":1},"rejectedMapping":{"modelId":7,"marketSku":4,"categoryId":1}},{"offer":{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},"mapping":{"modelId":7,"marketSku":4,"categoryId":1},"awaitingModerationMapping":{"modelId":7,"marketSku":4,"categoryId":1},"rejectedMapping":{"modelId":7,"marketSku":4,"categoryId":1}},{"offer":{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},"mapping":{"modelId":7,"marketSku":4,"categoryId":1},"awaitingModerationMapping":{"modelId":7,"marketSku":4,"categoryId":1},"rejectedMapping":{"modelId":7,"marketSku":4,"categoryId":1}},{"offer":{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},"mapping":{"modelId":7,"marketSku":4,"categoryId":1},"awaitingModerationMapping":{"modelId":7,"marketSku":4,"categoryId":1},"rejectedMapping":{"modelId":7,"marketSku":4,"categoryId":1}},{"offer":{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},"mapping":{"modelId":7,"marketSku":4,"categoryId":1},"awaitingModerationMapping":{"modelId":7,"marketSku":4,"categoryId":1},"rejectedMapping":{"modelId":7,"marketSku":4,"categoryId":1}}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/offer-mapping-entries/updates'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

