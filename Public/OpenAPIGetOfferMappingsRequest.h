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
#include "OpenAPIOfferCardStatusType.h"

namespace OpenAPI
{

/*
 * OpenAPIGetOfferMappingsRequest
 *
 * 
 */
class OPENAPI_API OpenAPIGetOfferMappingsRequest : public Model
{
public:
    virtual ~OpenAPIGetOfferMappingsRequest() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}     */
	TOptional<TArray<FString>> OfferIds;
	/* Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  */
	TOptional<TArray<OpenAPIOfferCardStatusType>> CardStatuses;
	/* Фильтр по категориям на Маркете. */
	TOptional<TArray<int32>> CategoryIds;
	/* Фильтр по брендам. */
	TOptional<TArray<FString>> VendorNames;
	/* Фильтр по тегам. */
	TOptional<TArray<FString>> Tags;
	/* Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве.  */
	TOptional<bool> Archived;
};

}
