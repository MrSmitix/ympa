#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ParameterValueDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ParameterValueDTO::ParameterValueDTO()
{
	//__init();
}

ParameterValueDTO::~ParameterValueDTO()
{
	//__cleanup();
}

void
ParameterValueDTO::__init()
{
	//parameterId = long(0);
	//unitId = long(0);
	//valueId = long(0);
	//value = std::string();
}

void
ParameterValueDTO::__cleanup()
{
	//if(parameterId != NULL) {
	//
	//delete parameterId;
	//parameterId = NULL;
	//}
	//if(unitId != NULL) {
	//
	//delete unitId;
	//unitId = NULL;
	//}
	//if(valueId != NULL) {
	//
	//delete valueId;
	//valueId = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//
}

void
ParameterValueDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *parameterIdKey = "parameterId";
	node = json_object_get_member(pJsonObject, parameterIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&parameterId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *unitIdKey = "unitId";
	node = json_object_get_member(pJsonObject, unitIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&unitId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *valueIdKey = "valueId";
	node = json_object_get_member(pJsonObject, valueIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&valueId, node, "long long", "");
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
}

ParameterValueDTO::ParameterValueDTO(char* json)
{
	this->fromJson(json);
}

char*
ParameterValueDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getParameterId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *parameterIdKey = "parameterId";
	json_object_set_member(pJsonObject, parameterIdKey, node);
	if (isprimitive("long long")) {
		long long obj = getUnitId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *unitIdKey = "unitId";
	json_object_set_member(pJsonObject, unitIdKey, node);
	if (isprimitive("long long")) {
		long long obj = getValueId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *valueIdKey = "valueId";
	json_object_set_member(pJsonObject, valueIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getValue();
		node = converttoJson(&obj, "std::string", "");
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
ParameterValueDTO::getParameterId()
{
	return parameterId;
}

void
ParameterValueDTO::setParameterId(long long  parameterId)
{
	this->parameterId = parameterId;
}

long long
ParameterValueDTO::getUnitId()
{
	return unitId;
}

void
ParameterValueDTO::setUnitId(long long  unitId)
{
	this->unitId = unitId;
}

long long
ParameterValueDTO::getValueId()
{
	return valueId;
}

void
ParameterValueDTO::setValueId(long long  valueId)
{
	this->valueId = valueId;
}

std::string
ParameterValueDTO::getValue()
{
	return value;
}

void
ParameterValueDTO::setValue(std::string  value)
{
	this->value = value;
}


