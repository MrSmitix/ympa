#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SetReturnDecisionRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SetReturnDecisionRequest::SetReturnDecisionRequest()
{
	//__init();
}

SetReturnDecisionRequest::~SetReturnDecisionRequest()
{
	//__cleanup();
}

void
SetReturnDecisionRequest::__init()
{
	//returnItemId = long(0);
	//decisionType = new ReturnRequestDecisionType();
	//comment = std::string();
}

void
SetReturnDecisionRequest::__cleanup()
{
	//if(returnItemId != NULL) {
	//
	//delete returnItemId;
	//returnItemId = NULL;
	//}
	//if(decisionType != NULL) {
	//
	//delete decisionType;
	//decisionType = NULL;
	//}
	//if(comment != NULL) {
	//
	//delete comment;
	//comment = NULL;
	//}
	//
}

void
SetReturnDecisionRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *returnItemIdKey = "returnItemId";
	node = json_object_get_member(pJsonObject, returnItemIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&returnItemId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *decisionTypeKey = "decisionType";
	node = json_object_get_member(pJsonObject, decisionTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ReturnRequestDecisionType")) {
			jsonToValue(&decisionType, node, "ReturnRequestDecisionType", "ReturnRequestDecisionType");
		} else {
			
			ReturnRequestDecisionType* obj = static_cast<ReturnRequestDecisionType*> (&decisionType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *commentKey = "comment";
	node = json_object_get_member(pJsonObject, commentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&comment, node, "std::string", "");
		} else {
			
		}
	}
}

SetReturnDecisionRequest::SetReturnDecisionRequest(char* json)
{
	this->fromJson(json);
}

char*
SetReturnDecisionRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getReturnItemId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *returnItemIdKey = "returnItemId";
	json_object_set_member(pJsonObject, returnItemIdKey, node);
	if (isprimitive("ReturnRequestDecisionType")) {
		ReturnRequestDecisionType obj = getDecisionType();
		node = converttoJson(&obj, "ReturnRequestDecisionType", "");
	}
	else {
		
		ReturnRequestDecisionType obj = static_cast<ReturnRequestDecisionType> (getDecisionType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *decisionTypeKey = "decisionType";
	json_object_set_member(pJsonObject, decisionTypeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getComment();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *commentKey = "comment";
	json_object_set_member(pJsonObject, commentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
SetReturnDecisionRequest::getReturnItemId()
{
	return returnItemId;
}

void
SetReturnDecisionRequest::setReturnItemId(long long  returnItemId)
{
	this->returnItemId = returnItemId;
}

ReturnRequestDecisionType
SetReturnDecisionRequest::getDecisionType()
{
	return decisionType;
}

void
SetReturnDecisionRequest::setDecisionType(ReturnRequestDecisionType  decisionType)
{
	this->decisionType = decisionType;
}

std::string
SetReturnDecisionRequest::getComment()
{
	return comment;
}

void
SetReturnDecisionRequest::setComment(std::string  comment)
{
	this->comment = comment;
}


