#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PalletsCountDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PalletsCountDTO::PalletsCountDTO()
{
	//__init();
}

PalletsCountDTO::~PalletsCountDTO()
{
	//__cleanup();
}

void
PalletsCountDTO::__init()
{
	//planned = int(0);
	//fact = int(0);
}

void
PalletsCountDTO::__cleanup()
{
	//if(planned != NULL) {
	//
	//delete planned;
	//planned = NULL;
	//}
	//if(fact != NULL) {
	//
	//delete fact;
	//fact = NULL;
	//}
	//
}

void
PalletsCountDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *plannedKey = "planned";
	node = json_object_get_member(pJsonObject, plannedKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&planned, node, "int", "");
		} else {
			
		}
	}
	const gchar *factKey = "fact";
	node = json_object_get_member(pJsonObject, factKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&fact, node, "int", "");
		} else {
			
		}
	}
}

PalletsCountDTO::PalletsCountDTO(char* json)
{
	this->fromJson(json);
}

char*
PalletsCountDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getPlanned();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *plannedKey = "planned";
	json_object_set_member(pJsonObject, plannedKey, node);
	if (isprimitive("int")) {
		int obj = getFact();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *factKey = "fact";
	json_object_set_member(pJsonObject, factKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
PalletsCountDTO::getPlanned()
{
	return planned;
}

void
PalletsCountDTO::setPlanned(int  planned)
{
	this->planned = planned;
}

int
PalletsCountDTO::getFact()
{
	return fact;
}

void
PalletsCountDTO::setFact(int  fact)
{
	this->fact = fact;
}


