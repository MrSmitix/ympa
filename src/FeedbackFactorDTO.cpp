#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FeedbackFactorDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FeedbackFactorDTO::FeedbackFactorDTO()
{
	//__init();
}

FeedbackFactorDTO::~FeedbackFactorDTO()
{
	//__cleanup();
}

void
FeedbackFactorDTO::__init()
{
	//id = long(0);
	//title = std::string();
	//description = std::string();
	//value = int(0);
}

void
FeedbackFactorDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//
}

void
FeedbackFactorDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *titleKey = "title";
	node = json_object_get_member(pJsonObject, titleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&title, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&value, node, "int", "");
		} else {
			
		}
	}
}

FeedbackFactorDTO::FeedbackFactorDTO(char* json)
{
	this->fromJson(json);
}

char*
FeedbackFactorDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *titleKey = "title";
	json_object_set_member(pJsonObject, titleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("int")) {
		int obj = getValue();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
FeedbackFactorDTO::getId()
{
	return id;
}

void
FeedbackFactorDTO::setId(long long  id)
{
	this->id = id;
}

std::string
FeedbackFactorDTO::getTitle()
{
	return title;
}

void
FeedbackFactorDTO::setTitle(std::string  title)
{
	this->title = title;
}

std::string
FeedbackFactorDTO::getDescription()
{
	return description;
}

void
FeedbackFactorDTO::setDescription(std::string  description)
{
	this->description = description;
}

int
FeedbackFactorDTO::getValue()
{
	return value;
}

void
FeedbackFactorDTO::setValue(int  value)
{
	this->value = value;
}


