#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VerifyOrderEacRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VerifyOrderEacRequest::VerifyOrderEacRequest()
{
	//__init();
}

VerifyOrderEacRequest::~VerifyOrderEacRequest()
{
	//__cleanup();
}

void
VerifyOrderEacRequest::__init()
{
	//code = std::string();
}

void
VerifyOrderEacRequest::__cleanup()
{
	//if(code != NULL) {
	//
	//delete code;
	//code = NULL;
	//}
	//
}

void
VerifyOrderEacRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *codeKey = "code";
	node = json_object_get_member(pJsonObject, codeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&code, node, "std::string", "");
		} else {
			
		}
	}
}

VerifyOrderEacRequest::VerifyOrderEacRequest(char* json)
{
	this->fromJson(json);
}

char*
VerifyOrderEacRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *codeKey = "code";
	json_object_set_member(pJsonObject, codeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
VerifyOrderEacRequest::getCode()
{
	return code;
}

void
VerifyOrderEacRequest::setCode(std::string  code)
{
	this->code = code;
}


