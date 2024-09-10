#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetPricesResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetPricesResponse::GetPricesResponse()
{
	//__init();
}

GetPricesResponse::~GetPricesResponse()
{
	//__cleanup();
}

void
GetPricesResponse::__init()
{
	//status = new ApiResponseStatusType();
	//result = new OfferPriceListResponseDTO();
}

void
GetPricesResponse::__cleanup()
{
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(result != NULL) {
	//
	//delete result;
	//result = NULL;
	//}
	//
}

void
GetPricesResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("ApiResponseStatusType")) {
			jsonToValue(&status, node, "ApiResponseStatusType", "ApiResponseStatusType");
		} else {
			
			ApiResponseStatusType* obj = static_cast<ApiResponseStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resultKey = "result";
	node = json_object_get_member(pJsonObject, resultKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferPriceListResponseDTO")) {
			jsonToValue(&result, node, "OfferPriceListResponseDTO", "OfferPriceListResponseDTO");
		} else {
			
			OfferPriceListResponseDTO* obj = static_cast<OfferPriceListResponseDTO*> (&result);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetPricesResponse::GetPricesResponse(char* json)
{
	this->fromJson(json);
}

char*
GetPricesResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ApiResponseStatusType")) {
		ApiResponseStatusType obj = getStatus();
		node = converttoJson(&obj, "ApiResponseStatusType", "");
	}
	else {
		
		ApiResponseStatusType obj = static_cast<ApiResponseStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("OfferPriceListResponseDTO")) {
		OfferPriceListResponseDTO obj = getResult();
		node = converttoJson(&obj, "OfferPriceListResponseDTO", "");
	}
	else {
		
		OfferPriceListResponseDTO obj = static_cast<OfferPriceListResponseDTO> (getResult());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resultKey = "result";
	json_object_set_member(pJsonObject, resultKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ApiResponseStatusType
GetPricesResponse::getStatus()
{
	return status;
}

void
GetPricesResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

OfferPriceListResponseDTO
GetPricesResponse::getResult()
{
	return result;
}

void
GetPricesResponse::setResult(OfferPriceListResponseDTO  result)
{
	this->result = result;
}


