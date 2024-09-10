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

namespace OpenAPI
{

/*
 * OpenAPIFeedbackFactorDTO
 *
 * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор. 
 */
class OPENAPI_API OpenAPIFeedbackFactorDTO : public Model
{
public:
    virtual ~OpenAPIFeedbackFactorDTO() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Идентификатор параметра. */
	TOptional<int64> Id;
	/* Название параметра. Например, `Скорость обработки заказа`. */
	TOptional<FString> Title;
	/* Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`. */
	TOptional<FString> Description;
	/* Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка).  */
	TOptional<int32> Value;
};

}
