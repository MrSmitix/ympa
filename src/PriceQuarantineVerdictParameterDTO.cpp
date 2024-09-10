#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PriceQuarantineVerdictParameterDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PriceQuarantineVerdictParameterDTO::PriceQuarantineVerdictParameterDTO()
{
	//__init();
}

PriceQuarantineVerdictParameterDTO::~PriceQuarantineVerdictParameterDTO()
{
	//__cleanup();
}

void
PriceQuarantineVerdictParameterDTO::__init()
{
	//name = new PriceQuarantineVerdictParamNameType();
	//value = std::string();
}

void
PriceQuarantineVerdictParameterDTO::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//
}

void
PriceQuarantineVerdictParameterDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("PriceQuarantineVerdictParamNameType")) {
			jsonToValue(&name, node, "PriceQuarantineVerdictParamNameType", "PriceQuarantineVerdictParamNameType");
		} else {
			
			PriceQuarantineVerdictParamNameType* obj = static_cast<PriceQuarantineVerdictParamNameType*> (&name);
			obj->fromJson(json_to_string(node, false));
			
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

PriceQuarantineVerdictParameterDTO::PriceQuarantineVerdictParameterDTO(char* json)
{
	this->fromJson(json);
}

char*
PriceQuarantineVerdictParameterDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("PriceQuarantineVerdictParamNameType")) {
		PriceQuarantineVerdictParamNameType obj = getName();
		node = converttoJson(&obj, "PriceQuarantineVerdictParamNameType", "");
	}
	else {
		
		PriceQuarantineVerdictParamNameType obj = static_cast<PriceQuarantineVerdictParamNameType> (getName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
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

PriceQuarantineVerdictParamNameType
PriceQuarantineVerdictParameterDTO::getName()
{
	return name;
}

void
PriceQuarantineVerdictParameterDTO::setName(PriceQuarantineVerdictParamNameType  name)
{
	this->name = name;
}

std::string
PriceQuarantineVerdictParameterDTO::getValue()
{
	return value;
}

void
PriceQuarantineVerdictParameterDTO::setValue(std::string  value)
{
	this->value = value;
}


