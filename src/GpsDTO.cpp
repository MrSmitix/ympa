#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GpsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GpsDTO::GpsDTO()
{
	//__init();
}

GpsDTO::~GpsDTO()
{
	//__cleanup();
}

void
GpsDTO::__init()
{
	//latitude = double(0);
	//longitude = double(0);
}

void
GpsDTO::__cleanup()
{
	//if(latitude != NULL) {
	//
	//delete latitude;
	//latitude = NULL;
	//}
	//if(longitude != NULL) {
	//
	//delete longitude;
	//longitude = NULL;
	//}
	//
}

void
GpsDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *latitudeKey = "latitude";
	node = json_object_get_member(pJsonObject, latitudeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&latitude, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&latitude);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *longitudeKey = "longitude";
	node = json_object_get_member(pJsonObject, longitudeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&longitude, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&longitude);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GpsDTO::GpsDTO(char* json)
{
	this->fromJson(json);
}

char*
GpsDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getLatitude();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getLatitude());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *latitudeKey = "latitude";
	json_object_set_member(pJsonObject, latitudeKey, node);
	if (isprimitive("long long")) {
		long long obj = getLongitude();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getLongitude());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *longitudeKey = "longitude";
	json_object_set_member(pJsonObject, longitudeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GpsDTO::getLatitude()
{
	return latitude;
}

void
GpsDTO::setLatitude(long long  latitude)
{
	this->latitude = latitude;
}

long long
GpsDTO::getLongitude()
{
	return longitude;
}

void
GpsDTO::setLongitude(long long  longitude)
{
	this->longitude = longitude;
}


