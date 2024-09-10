#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MaxSaleQuantumDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MaxSaleQuantumDTO::MaxSaleQuantumDTO()
{
	//__init();
}

MaxSaleQuantumDTO::~MaxSaleQuantumDTO()
{
	//__cleanup();
}

void
MaxSaleQuantumDTO::__init()
{
	//id = long(0);
	//name = std::string();
	//maxSaleQuantum = int(0);
}

void
MaxSaleQuantumDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(maxSaleQuantum != NULL) {
	//
	//delete maxSaleQuantum;
	//maxSaleQuantum = NULL;
	//}
	//
}

void
MaxSaleQuantumDTO::fromJson(char* jsonStr)
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *maxSaleQuantumKey = "maxSaleQuantum";
	node = json_object_get_member(pJsonObject, maxSaleQuantumKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&maxSaleQuantum, node, "int", "");
		} else {
			
		}
	}
}

MaxSaleQuantumDTO::MaxSaleQuantumDTO(char* json)
{
	this->fromJson(json);
}

char*
MaxSaleQuantumDTO::toJson()
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
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("int")) {
		int obj = getMaxSaleQuantum();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *maxSaleQuantumKey = "maxSaleQuantum";
	json_object_set_member(pJsonObject, maxSaleQuantumKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
MaxSaleQuantumDTO::getId()
{
	return id;
}

void
MaxSaleQuantumDTO::setId(long long  id)
{
	this->id = id;
}

std::string
MaxSaleQuantumDTO::getName()
{
	return name;
}

void
MaxSaleQuantumDTO::setName(std::string  name)
{
	this->name = name;
}

int
MaxSaleQuantumDTO::getMaxSaleQuantum()
{
	return maxSaleQuantum;
}

void
MaxSaleQuantumDTO::setMaxSaleQuantum(int  maxSaleQuantum)
{
	this->maxSaleQuantum = maxSaleQuantum;
}


