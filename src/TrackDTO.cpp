#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TrackDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TrackDTO::TrackDTO()
{
	//__init();
}

TrackDTO::~TrackDTO()
{
	//__cleanup();
}

void
TrackDTO::__init()
{
	//trackCode = std::string();
}

void
TrackDTO::__cleanup()
{
	//if(trackCode != NULL) {
	//
	//delete trackCode;
	//trackCode = NULL;
	//}
	//
}

void
TrackDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *trackCodeKey = "trackCode";
	node = json_object_get_member(pJsonObject, trackCodeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&trackCode, node, "std::string", "");
		} else {
			
		}
	}
}

TrackDTO::TrackDTO(char* json)
{
	this->fromJson(json);
}

char*
TrackDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getTrackCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *trackCodeKey = "trackCode";
	json_object_set_member(pJsonObject, trackCodeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
TrackDTO::getTrackCode()
{
	return trackCode;
}

void
TrackDTO::setTrackCode(std::string  trackCode)
{
	this->trackCode = trackCode;
}


