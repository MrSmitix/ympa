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
#include "OpenAPIForwardScrollingPagerDTO.h"
#include "OpenAPIGetChatInfoDTO.h"

namespace OpenAPI
{

/*
 * OpenAPIGetChatsInfoDTO
 *
 * Список чатов.
 */
class OPENAPI_API OpenAPIGetChatsInfoDTO : public Model
{
public:
    virtual ~OpenAPIGetChatsInfoDTO() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Информация о чатах. */
	TArray<OpenAPIGetChatInfoDTO> Chats;
	TOptional<OpenAPIForwardScrollingPagerDTO> Paging;
};

}
