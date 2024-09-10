#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GoodsFeedbackCommentAuthorDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GoodsFeedbackCommentAuthorDTO::GoodsFeedbackCommentAuthorDTO()
{
	//__init();
}

GoodsFeedbackCommentAuthorDTO::~GoodsFeedbackCommentAuthorDTO()
{
	//__cleanup();
}

void
GoodsFeedbackCommentAuthorDTO::__init()
{
	//type = new GoodsFeedbackCommentAuthorType();
	//name = std::string();
}

void
GoodsFeedbackCommentAuthorDTO::__cleanup()
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
GoodsFeedbackCommentAuthorDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("GoodsFeedbackCommentAuthorType")) {
			jsonToValue(&type, node, "GoodsFeedbackCommentAuthorType", "GoodsFeedbackCommentAuthorType");
		} else {
			
			GoodsFeedbackCommentAuthorType* obj = static_cast<GoodsFeedbackCommentAuthorType*> (&type);
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

GoodsFeedbackCommentAuthorDTO::GoodsFeedbackCommentAuthorDTO(char* json)
{
	this->fromJson(json);
}

char*
GoodsFeedbackCommentAuthorDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("GoodsFeedbackCommentAuthorType")) {
		GoodsFeedbackCommentAuthorType obj = getType();
		node = converttoJson(&obj, "GoodsFeedbackCommentAuthorType", "");
	}
	else {
		
		GoodsFeedbackCommentAuthorType obj = static_cast<GoodsFeedbackCommentAuthorType> (getType());
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

GoodsFeedbackCommentAuthorType
GoodsFeedbackCommentAuthorDTO::getType()
{
	return type;
}

void
GoodsFeedbackCommentAuthorDTO::setType(GoodsFeedbackCommentAuthorType  type)
{
	this->type = type;
}

std::string
GoodsFeedbackCommentAuthorDTO::getName()
{
	return name;
}

void
GoodsFeedbackCommentAuthorDTO::setName(std::string  name)
{
	this->name = name;
}


