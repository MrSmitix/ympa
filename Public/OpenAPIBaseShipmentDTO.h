/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI spec version: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPIDeliveryServiceDTO.h"
#include "OpenAPIPalletsCountDTO.h"
#include "OpenAPIPartnerShipmentWarehouseDTO.h"
#include "OpenAPIShipmentType.h"

namespace OpenAPI
{

/*
 * OpenAPIBaseShipmentDTO
 *
 * Информация об отгрузке.
 */
class OPENAPI_API OpenAPIBaseShipmentDTO : public Model
{
public:
    virtual ~OpenAPIBaseShipmentDTO() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Идентификатор отгрузки. */
	TOptional<int64> Id;
	/* Начало планового интервала отгрузки. */
	TOptional<FDateTime> PlanIntervalFrom;
	/* Конец планового интервала отгрузки. */
	TOptional<FDateTime> PlanIntervalTo;
	TOptional<OpenAPIShipmentType> ShipmentType;
	TOptional<OpenAPIPartnerShipmentWarehouseDTO> Warehouse;
	TOptional<OpenAPIPartnerShipmentWarehouseDTO> WarehouseTo;
	/* Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`. */
	TOptional<FString> ExternalId;
	TOptional<OpenAPIDeliveryServiceDTO> DeliveryService;
	TOptional<OpenAPIPalletsCountDTO> PalletsCount;
	/* Идентификаторы заказов в отгрузке. */
	TSet<int64> OrderIds;
	/* Количество заказов, которое Маркет запланировал к отгрузке. */
	TOptional<int32> DraftCount;
	/* Количество заказов, которое Маркет подтвердил к отгрузке. */
	TOptional<int32> PlannedCount;
	/* Количество заказов, принятых в сортировочном центре или пункте приема. */
	TOptional<int32> FactCount;
};

}
