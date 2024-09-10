#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FeedbackCommentAuthorDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FeedbackCommentAuthorDTO::FeedbackCommentAuthorDTO()
{
	//__init();
}

FeedbackCommentAuthorDTO::~FeedbackCommentAuthorDTO()
{
	//__cleanup();
}

void
FeedbackCommentAuthorDTO::__init()
{
	//type = new FeedbackCommentAuthorType();
	//name = std::string();
}

void
FeedbackCommentAuthorDTO::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
FeedbackCommentAuthorDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedbackCommentAuthorType")) {
			jsonToValue(&type, node, "FeedbackCommentAuthorType", "FeedbackCommentAuthorType");
		} else {
			
			FeedbackCommentAuthorType* obj = static_cast<FeedbackCommentAuthorType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
}

FeedbackCommentAuthorDTO::FeedbackCommentAuthorDTO(char* json)
{
	this->fromJson(json);
}

char*
FeedbackCommentAuthorDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("FeedbackCommentAuthorType")) {
		FeedbackCommentAuthorType obj = getType();
		node = converttoJson(&obj, "FeedbackCommentAuthorType", "");
	}
	else {
		
		FeedbackCommentAuthorType obj = static_cast<FeedbackCommentAuthorType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

FeedbackCommentAuthorType
FeedbackCommentAuthorDTO::getType()
{
	return type;
}

void
FeedbackCommentAuthorDTO::setType(FeedbackCommentAuthorType  type)
{
	this->type = type;
}

std::string
FeedbackCommentAuthorDTO::getName()
{
	return name;
}

void
FeedbackCommentAuthorDTO::setName(std::string  name)
{
	this->name = name;
}


