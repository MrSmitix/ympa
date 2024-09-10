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
#include "OpenAPITariffsApi.h"

#include "OpenAPIApiClientDataErrorResponse.h"
#include "OpenAPIApiForbiddenErrorResponse.h"
#include "OpenAPIApiLimitErrorResponse.h"
#include "OpenAPIApiNotFoundErrorResponse.h"
#include "OpenAPIApiServerErrorResponse.h"
#include "OpenAPIApiUnauthorizedErrorResponse.h"
#include "OpenAPICalculateTariffsRequest.h"
#include "OpenAPICalculateTariffsResponse.h"

namespace OpenAPI
{

/* Калькулятор стоимости услуг
 *
 * Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
*/
class OPENAPI_API OpenAPITariffsApi::CalculateTariffsRequest : public Request
{
public:
    virtual ~CalculateTariffsRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	OpenAPICalculateTariffsRequest OpenAPICalculateTariffsRequest;
};

class OPENAPI_API OpenAPITariffsApi::CalculateTariffsResponse : public Response
{
public:
    virtual ~CalculateTariffsResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPICalculateTariffsResponse Content;
};

}
