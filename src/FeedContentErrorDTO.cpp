#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FeedContentErrorDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FeedContentErrorDTO::FeedContentErrorDTO()
{
	//__init();
}

FeedContentErrorDTO::~FeedContentErrorDTO()
{
	//__cleanup();
}

void
FeedContentErrorDTO::__init()
{
	//type = new FeedContentErrorType();
}

void
FeedContentErrorDTO::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//
}

void
FeedContentErrorDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedContentErrorType")) {
			jsonToValue(&type, node, "FeedContentErrorType", "FeedContentErrorType");
		} else {
			
			FeedContentErrorType* obj = static_cast<FeedContentErrorType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

FeedContentErrorDTO::FeedContentErrorDTO(char* json)
{
	this->fromJson(json);
}

char*
FeedContentErrorDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("FeedContentErrorType")) {
		FeedContentErrorType obj = getType();
		node = converttoJson(&obj, "FeedContentErrorType", "");
	}
	else {
		
		FeedContentErrorType obj = static_cast<FeedContentErrorType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

FeedContentErrorType
FeedContentErrorDTO::getType()
{
	return type;
}

void
FeedContentErrorDTO::setType(FeedContentErrorType  type)
{
	this->type = type;
}


