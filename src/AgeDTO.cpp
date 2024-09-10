#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AgeDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AgeDTO::AgeDTO()
{
	//__init();
}

AgeDTO::~AgeDTO()
{
	//__cleanup();
}

void
AgeDTO::__init()
{
	//value = double(0);
	//ageUnit = new AgeUnitType();
}

void
AgeDTO::__cleanup()
{
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//if(ageUnit != NULL) {
	//
	//delete ageUnit;
	//ageUnit = NULL;
	//}
	//
}

void
AgeDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&value, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&value);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ageUnitKey = "ageUnit";
	node = json_object_get_member(pJsonObject, ageUnitKey);
	if (node !=NULL) {
	

		if (isprimitive("AgeUnitType")) {
			jsonToValue(&ageUnit, node, "AgeUnitType", "AgeUnitType");
		} else {
			
			AgeUnitType* obj = static_cast<AgeUnitType*> (&ageUnit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AgeDTO::AgeDTO(char* json)
{
	this->fromJson(json);
}

char*
AgeDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getValue();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getValue());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	if (isprimitive("AgeUnitType")) {
		AgeUnitType obj = getAgeUnit();
		node = converttoJson(&obj, "AgeUnitType", "");
	}
	else {
		
		AgeUnitType obj = static_cast<AgeUnitType> (getAgeUnit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ageUnitKey = "ageUnit";
	json_object_set_member(pJsonObject, ageUnitKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
AgeDTO::getValue()
{
	return value;
}

void
AgeDTO::setValue(long long  value)
{
	this->value = value;
}

AgeUnitType
AgeDTO::getAgeUnit()
{
	return ageUnit;
}

void
AgeDTO::setAgeUnit(AgeUnitType  ageUnit)
{
	this->ageUnit = ageUnit;
}


