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

#include "OpenAPIReturnDecisionDTO.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIReturnDecisionDTO::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (ReturnItemId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("returnItemId")); WriteJsonValue(Writer, ReturnItemId.GetValue());
	}
	if (Count.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("count")); WriteJsonValue(Writer, Count.GetValue());
	}
	if (Comment.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("comment")); WriteJsonValue(Writer, Comment.GetValue());
	}
	if (ReasonType.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("reasonType")); WriteJsonValue(Writer, ReasonType.GetValue());
	}
	if (SubreasonType.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("subreasonType")); WriteJsonValue(Writer, SubreasonType.GetValue());
	}
	if (DecisionType.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("decisionType")); WriteJsonValue(Writer, DecisionType.GetValue());
	}
	if (RefundAmount.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("refundAmount")); WriteJsonValue(Writer, RefundAmount.GetValue());
	}
	if (PartnerCompensation.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("partnerCompensation")); WriteJsonValue(Writer, PartnerCompensation.GetValue());
	}
	if (Images.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("images")); WriteJsonValue(Writer, Images.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIReturnDecisionDTO::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("returnItemId"), ReturnItemId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("count"), Count);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("comment"), Comment);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("reasonType"), ReasonType);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("subreasonType"), SubreasonType);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("decisionType"), DecisionType);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("refundAmount"), RefundAmount);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("partnerCompensation"), PartnerCompensation);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("images"), Images);

	return ParseSuccess;
}

}
