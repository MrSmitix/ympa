#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetDeliveryServicesResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetDeliveryServicesResponse::GetDeliveryServicesResponse()
{
	//__init();
}

GetDeliveryServicesResponse::~GetDeliveryServicesResponse()
{
	//__cleanup();
}

void
GetDeliveryServicesResponse::__init()
{
	//result = new DeliveryServicesDTO();
}

void
GetDeliveryServicesResponse::__cleanup()
{
	//if(result != NULL) {
	//
	//delete result;
	//result = NULL;
	//}
	//
}

void
GetDeliveryServicesResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *resultKey = "result";
	node = json_object_get_member(pJsonObject, resultKey);
	if (node !=NULL) {
	

		if (isprimitive("DeliveryServicesDTO")) {
			jsonToValue(&result, node, "DeliveryServicesDTO", "DeliveryServicesDTO");
		} else {
			
			DeliveryServicesDTO* obj = static_cast<DeliveryServicesDTO*> (&result);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetDeliveryServicesResponse::GetDeliveryServicesResponse(char* json)
{
	this->fromJson(json);
}

char*
GetDeliveryServicesResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("DeliveryServicesDTO")) {
		DeliveryServicesDTO obj = getResult();
		node = converttoJson(&obj, "DeliveryServicesDTO", "");
	}
	else {
		
		DeliveryServicesDTO obj = static_cast<DeliveryServicesDTO> (getResult());
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

DeliveryServicesDTO
GetDeliveryServicesResponse::getResult()
{
	return result;
}

void
GetDeliveryServicesResponse::setResult(DeliveryServicesDTO  result)
{
	this->result = result;
}


