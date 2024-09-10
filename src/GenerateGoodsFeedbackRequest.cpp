#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GenerateGoodsFeedbackRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GenerateGoodsFeedbackRequest::GenerateGoodsFeedbackRequest()
{
	//__init();
}

GenerateGoodsFeedbackRequest::~GenerateGoodsFeedbackRequest()
{
	//__cleanup();
}

void
GenerateGoodsFeedbackRequest::__init()
{
	//businessId = long(0);
}

void
GenerateGoodsFeedbackRequest::__cleanup()
{
	//if(businessId != NULL) {
	//
	//delete businessId;
	//businessId = NULL;
	//}
	//
}

void
GenerateGoodsFeedbackRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *businessIdKey = "businessId";
	node = json_object_get_member(pJsonObject, businessIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&businessId, node, "long long", "");
		} else {
			
		}
	}
}

GenerateGoodsFeedbackRequest::GenerateGoodsFeedbackRequest(char* json)
{
	this->fromJson(json);
}

char*
GenerateGoodsFeedbackRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getBusinessId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *businessIdKey = "businessId";
	json_object_set_member(pJsonObject, businessIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GenerateGoodsFeedbackRequest::getBusinessId()
{
	return businessId;
}

void
GenerateGoodsFeedbackRequest::setBusinessId(long long  businessId)
{
	this->businessId = businessId;
}


