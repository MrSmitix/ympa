#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TurnoverDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TurnoverDTO::TurnoverDTO()
{
	//__init();
}

TurnoverDTO::~TurnoverDTO()
{
	//__cleanup();
}

void
TurnoverDTO::__init()
{
	//turnover = new TurnoverType();
	//turnoverDays = double(0);
}

void
TurnoverDTO::__cleanup()
{
	//if(turnover != NULL) {
	//
	//delete turnover;
	//turnover = NULL;
	//}
	//if(turnoverDays != NULL) {
	//
	//delete turnoverDays;
	//turnoverDays = NULL;
	//}
	//
}

void
TurnoverDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *turnoverKey = "turnover";
	node = json_object_get_member(pJsonObject, turnoverKey);
	if (node !=NULL) {
	

		if (isprimitive("TurnoverType")) {
			jsonToValue(&turnover, node, "TurnoverType", "TurnoverType");
		} else {
			
			TurnoverType* obj = static_cast<TurnoverType*> (&turnover);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *turnoverDaysKey = "turnoverDays";
	node = json_object_get_member(pJsonObject, turnoverDaysKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&turnoverDays, node, "double", "");
		} else {
			
		}
	}
}

TurnoverDTO::TurnoverDTO(char* json)
{
	this->fromJson(json);
}

char*
TurnoverDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("TurnoverType")) {
		TurnoverType obj = getTurnover();
		node = converttoJson(&obj, "TurnoverType", "");
	}
	else {
		
		TurnoverType obj = static_cast<TurnoverType> (getTurnover());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *turnoverKey = "turnover";
	json_object_set_member(pJsonObject, turnoverKey, node);
	if (isprimitive("double")) {
		double obj = getTurnoverDays();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *turnoverDaysKey = "turnoverDays";
	json_object_set_member(pJsonObject, turnoverDaysKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

TurnoverType
TurnoverDTO::getTurnover()
{
	return turnover;
}

void
TurnoverDTO::setTurnover(TurnoverType  turnover)
{
	this->turnover = turnover;
}

double
TurnoverDTO::getTurnoverDays()
{
	return turnoverDays;
}

void
TurnoverDTO::setTurnoverDays(double  turnoverDays)
{
	this->turnoverDays = turnoverDays;
}


