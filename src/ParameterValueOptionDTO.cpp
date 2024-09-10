#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ParameterValueOptionDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ParameterValueOptionDTO::ParameterValueOptionDTO()
{
	//__init();
}

ParameterValueOptionDTO::~ParameterValueOptionDTO()
{
	//__cleanup();
}

void
ParameterValueOptionDTO::__init()
{
	//id = long(0);
	//value = std::string();
	//description = std::string();
}

void
ParameterValueOptionDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//
}

void
ParameterValueOptionDTO::fromJson(char* jsonStr)
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
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&value, node, "std::string", "");
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
}

ParameterValueOptionDTO::ParameterValueOptionDTO(char* json)
{
	this->fromJson(json);
}

char*
ParameterValueOptionDTO::toJson()
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
		std::string obj = getValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
ParameterValueOptionDTO::getId()
{
	return id;
}

void
ParameterValueOptionDTO::setId(long long  id)
{
	this->id = id;
}

std::string
ParameterValueOptionDTO::getValue()
{
	return value;
}

void
ParameterValueOptionDTO::setValue(std::string  value)
{
	this->value = value;
}

std::string
ParameterValueOptionDTO::getDescription()
{
	return description;
}

void
ParameterValueOptionDTO::setDescription(std::string  description)
{
	this->description = description;
}


