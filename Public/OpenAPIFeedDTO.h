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
#include "OpenAPIFeedContentDTO.h"
#include "OpenAPIFeedDownloadDTO.h"
#include "OpenAPIFeedPlacementDTO.h"
#include "OpenAPIFeedPublicationDTO.h"

namespace OpenAPI
{

/*
 * OpenAPIFeedDTO
 *
 * Информация о прайс-листе.
 */
class OPENAPI_API OpenAPIFeedDTO : public Model
{
public:
    virtual ~OpenAPIFeedDTO() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Идентификатор прайс-листа. */
	TOptional<int64> Id;
	/* Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  */
	TOptional<FString> Login;
	/* Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  */
	TOptional<FString> Name;
	/* Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  */
	TOptional<FString> Password;
	/* Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета.  */
	TOptional<FDateTime> UploadDate;
	/* URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  */
	TOptional<FString> Url;
	TOptional<OpenAPIFeedContentDTO> Content;
	TOptional<OpenAPIFeedDownloadDTO> Download;
	TOptional<OpenAPIFeedPlacementDTO> Placement;
	TOptional<OpenAPIFeedPublicationDTO> Publication;
};

}
