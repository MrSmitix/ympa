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
#include "OpenAPIOrdersStatsPaymentOrderDTO.h"
#include "OpenAPIOrdersStatsPaymentSourceType.h"
#include "OpenAPIOrdersStatsPaymentType.h"

namespace OpenAPI
{

/*
 * OpenAPIOrdersStatsPaymentDTO
 *
 * Информация о денежных переводах по заказу.
 */
class OPENAPI_API OpenAPIOrdersStatsPaymentDTO : public Model
{
public:
    virtual ~OpenAPIOrdersStatsPaymentDTO() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Идентификатор денежного перевода. */
	TOptional<FString> Id;
	/* Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`.  */
	TOptional<FDateTime> Date;
	TOptional<OpenAPIOrdersStatsPaymentType> Type;
	TOptional<OpenAPIOrdersStatsPaymentSourceType> Source;
	/* Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  */
	TOptional<double> Total;
	TOptional<OpenAPIOrdersStatsPaymentOrderDTO> PaymentOrder;
};

}
