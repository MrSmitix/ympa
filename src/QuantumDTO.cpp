#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "QuantumDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

QuantumDTO::QuantumDTO()
{
	//__init();
}

QuantumDTO::~QuantumDTO()
{
	//__cleanup();
}

void
QuantumDTO::__init()
{
	//minQuantity = int(0);
	//stepQuantity = int(0);
}

void
QuantumDTO::__cleanup()
{
	//if(minQuantity != NULL) {
	//
	//delete minQuantity;
	//minQuantity = NULL;
	//}
	//if(stepQuantity != NULL) {
	//
	//delete stepQuantity;
	//stepQuantity = NULL;
	//}
	//
}

void
QuantumDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *minQuantityKey = "minQuantity";
	node = json_object_get_member(pJsonObject, minQuantityKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&minQuantity, node, "int", "");
		} else {
			
		}
	}
	const gchar *stepQuantityKey = "stepQuantity";
	node = json_object_get_member(pJsonObject, stepQuantityKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&stepQuantity, node, "int", "");
		} else {
			
		}
	}
}

QuantumDTO::QuantumDTO(char* json)
{
	this->fromJson(json);
}

char*
QuantumDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getMinQuantity();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *minQuantityKey = "minQuantity";
	json_object_set_member(pJsonObject, minQuantityKey, node);
	if (isprimitive("int")) {
		int obj = getStepQuantity();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *stepQuantityKey = "stepQuantity";
	json_object_set_member(pJsonObject, stepQuantityKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
QuantumDTO::getMinQuantity()
{
	return minQuantity;
}

void
QuantumDTO::setMinQuantity(int  minQuantity)
{
	this->minQuantity = minQuantity;
}

int
QuantumDTO::getStepQuantity()
{
	return stepQuantity;
}

void
QuantumDTO::setStepQuantity(int  stepQuantity)
{
	this->stepQuantity = stepQuantity;
}


