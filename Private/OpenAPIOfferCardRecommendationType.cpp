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

#include "OpenAPIOfferCardRecommendationType.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIOfferCardRecommendationType::Values& Value)
{
	switch (Value)
	{
	case OpenAPIOfferCardRecommendationType::Values::HasVideo:
		return TEXT("HAS_VIDEO");
	case OpenAPIOfferCardRecommendationType::Values::RecognizedVendor:
		return TEXT("RECOGNIZED_VENDOR");
	case OpenAPIOfferCardRecommendationType::Values::Main:
		return TEXT("MAIN");
	case OpenAPIOfferCardRecommendationType::Values::Additional:
		return TEXT("ADDITIONAL");
	case OpenAPIOfferCardRecommendationType::Values::Distinctive:
		return TEXT("DISTINCTIVE");
	case OpenAPIOfferCardRecommendationType::Values::Filterable:
		return TEXT("FILTERABLE");
	case OpenAPIOfferCardRecommendationType::Values::PictureCount:
		return TEXT("PICTURE_COUNT");
	case OpenAPIOfferCardRecommendationType::Values::HasDescription:
		return TEXT("HAS_DESCRIPTION");
	case OpenAPIOfferCardRecommendationType::Values::HasBarcode:
		return TEXT("HAS_BARCODE");
	case OpenAPIOfferCardRecommendationType::Values::FirstPictureSize:
		return TEXT("FIRST_PICTURE_SIZE");
	case OpenAPIOfferCardRecommendationType::Values::TitleLength:
		return TEXT("TITLE_LENGTH");
	case OpenAPIOfferCardRecommendationType::Values::DescriptionLength:
		return TEXT("DESCRIPTION_LENGTH");
	case OpenAPIOfferCardRecommendationType::Values::AveragePictureSize:
		return TEXT("AVERAGE_PICTURE_SIZE");
	case OpenAPIOfferCardRecommendationType::Values::FirstVideoSize:
		return TEXT("FIRST_VIDEO_SIZE");
	case OpenAPIOfferCardRecommendationType::Values::FirstVideoLength:
		return TEXT("FIRST_VIDEO_LENGTH");
	case OpenAPIOfferCardRecommendationType::Values::AverageVideoSize:
		return TEXT("AVERAGE_VIDEO_SIZE");
	case OpenAPIOfferCardRecommendationType::Values::VideoCount:
		return TEXT("VIDEO_COUNT");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIOfferCardRecommendationType::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIOfferCardRecommendationType::EnumToString(const OpenAPIOfferCardRecommendationType::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIOfferCardRecommendationType::Values& Value)
{
	static TMap<FString, OpenAPIOfferCardRecommendationType::Values> StringToEnum = { 
		{ TEXT("HAS_VIDEO"), OpenAPIOfferCardRecommendationType::Values::HasVideo },
		{ TEXT("RECOGNIZED_VENDOR"), OpenAPIOfferCardRecommendationType::Values::RecognizedVendor },
		{ TEXT("MAIN"), OpenAPIOfferCardRecommendationType::Values::Main },
		{ TEXT("ADDITIONAL"), OpenAPIOfferCardRecommendationType::Values::Additional },
		{ TEXT("DISTINCTIVE"), OpenAPIOfferCardRecommendationType::Values::Distinctive },
		{ TEXT("FILTERABLE"), OpenAPIOfferCardRecommendationType::Values::Filterable },
		{ TEXT("PICTURE_COUNT"), OpenAPIOfferCardRecommendationType::Values::PictureCount },
		{ TEXT("HAS_DESCRIPTION"), OpenAPIOfferCardRecommendationType::Values::HasDescription },
		{ TEXT("HAS_BARCODE"), OpenAPIOfferCardRecommendationType::Values::HasBarcode },
		{ TEXT("FIRST_PICTURE_SIZE"), OpenAPIOfferCardRecommendationType::Values::FirstPictureSize },
		{ TEXT("TITLE_LENGTH"), OpenAPIOfferCardRecommendationType::Values::TitleLength },
		{ TEXT("DESCRIPTION_LENGTH"), OpenAPIOfferCardRecommendationType::Values::DescriptionLength },
		{ TEXT("AVERAGE_PICTURE_SIZE"), OpenAPIOfferCardRecommendationType::Values::AveragePictureSize },
		{ TEXT("FIRST_VIDEO_SIZE"), OpenAPIOfferCardRecommendationType::Values::FirstVideoSize },
		{ TEXT("FIRST_VIDEO_LENGTH"), OpenAPIOfferCardRecommendationType::Values::FirstVideoLength },
		{ TEXT("AVERAGE_VIDEO_SIZE"), OpenAPIOfferCardRecommendationType::Values::AverageVideoSize },
		{ TEXT("VIDEO_COUNT"), OpenAPIOfferCardRecommendationType::Values::VideoCount }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIOfferCardRecommendationType::EnumFromString(const FString& EnumAsString, OpenAPIOfferCardRecommendationType::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIOfferCardRecommendationType::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIOfferCardRecommendationType::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIOfferCardRecommendationType::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPIOfferCardRecommendationType::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}
