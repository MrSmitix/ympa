#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetPromosRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetPromosRequest::GetPromosRequest()
{
	//__init();
}

GetPromosRequest::~GetPromosRequest()
{
	//__cleanup();
}

void
GetPromosRequest::__init()
{
	//participation = new PromoParticipationType();
	//mechanics = new MechanicsType();
}

void
GetPromosRequest::__cleanup()
{
	//if(participation != NULL) {
	//
	//delete participation;
	//participation = NULL;
	//}
	//if(mechanics != NULL) {
	//
	//delete mechanics;
	//mechanics = NULL;
	//}
	//
}

void
GetPromosRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *participationKey = "participation";
	node = json_object_get_member(pJsonObject, participationKey);
	if (node !=NULL) {
	

		if (isprimitive("PromoParticipationType")) {
			jsonToValue(&participation, node, "PromoParticipationType", "PromoParticipationType");
		} else {
			
			PromoParticipationType* obj = static_cast<PromoParticipationType*> (&participation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *mechanicsKey = "mechanics";
	node = json_object_get_member(pJsonObject, mechanicsKey);
	if (node !=NULL) {
	

		if (isprimitive("MechanicsType")) {
			jsonToValue(&mechanics, node, "MechanicsType", "MechanicsType");
		} else {
			
			MechanicsType* obj = static_cast<MechanicsType*> (&mechanics);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetPromosRequest::GetPromosRequest(char* json)
{
	this->fromJson(json);
}

char*
GetPromosRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("PromoParticipationType")) {
		PromoParticipationType obj = getParticipation();
		node = converttoJson(&obj, "PromoParticipationType", "");
	}
	else {
		
		PromoParticipationType obj = static_cast<PromoParticipationType> (getParticipation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *participationKey = "participation";
	json_object_set_member(pJsonObject, participationKey, node);
	if (isprimitive("MechanicsType")) {
		MechanicsType obj = getMechanics();
		node = converttoJson(&obj, "MechanicsType", "");
	}
	else {
		
		MechanicsType obj = static_cast<MechanicsType> (getMechanics());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mechanicsKey = "mechanics";
	json_object_set_member(pJsonObject, mechanicsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

PromoParticipationType
GetPromosRequest::getParticipation()
{
	return participation;
}

void
GetPromosRequest::setParticipation(PromoParticipationType  participation)
{
	this->participation = participation;
}

MechanicsType
GetPromosRequest::getMechanics()
{
	return mechanics;
}

void
GetPromosRequest::setMechanics(MechanicsType  mechanics)
{
	this->mechanics = mechanics;
}


