#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferSellingProgramDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferSellingProgramDTO::OfferSellingProgramDTO()
{
	//__init();
}

OfferSellingProgramDTO::~OfferSellingProgramDTO()
{
	//__cleanup();
}

void
OfferSellingProgramDTO::__init()
{
	//sellingProgram = new SellingProgramType();
	//status = new OfferSellingProgramStatusType();
}

void
OfferSellingProgramDTO::__cleanup()
{
	//if(sellingProgram != NULL) {
	//
	//delete sellingProgram;
	//sellingProgram = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
OfferSellingProgramDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *sellingProgramKey = "sellingProgram";
	node = json_object_get_member(pJsonObject, sellingProgramKey);
	if (node !=NULL) {
	

		if (isprimitive("SellingProgramType")) {
			jsonToValue(&sellingProgram, node, "SellingProgramType", "SellingProgramType");
		} else {
			
			SellingProgramType* obj = static_cast<SellingProgramType*> (&sellingProgram);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferSellingProgramStatusType")) {
			jsonToValue(&status, node, "OfferSellingProgramStatusType", "OfferSellingProgramStatusType");
		} else {
			
			OfferSellingProgramStatusType* obj = static_cast<OfferSellingProgramStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OfferSellingProgramDTO::OfferSellingProgramDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferSellingProgramDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("SellingProgramType")) {
		SellingProgramType obj = getSellingProgram();
		node = converttoJson(&obj, "SellingProgramType", "");
	}
	else {
		
		SellingProgramType obj = static_cast<SellingProgramType> (getSellingProgram());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sellingProgramKey = "sellingProgram";
	json_object_set_member(pJsonObject, sellingProgramKey, node);
	if (isprimitive("OfferSellingProgramStatusType")) {
		OfferSellingProgramStatusType obj = getStatus();
		node = converttoJson(&obj, "OfferSellingProgramStatusType", "");
	}
	else {
		
		OfferSellingProgramStatusType obj = static_cast<OfferSellingProgramStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

SellingProgramType
OfferSellingProgramDTO::getSellingProgram()
{
	return sellingProgram;
}

void
OfferSellingProgramDTO::setSellingProgram(SellingProgramType  sellingProgram)
{
	this->sellingProgram = sellingProgram;
}

OfferSellingProgramStatusType
OfferSellingProgramDTO::getStatus()
{
	return status;
}

void
OfferSellingProgramDTO::setStatus(OfferSellingProgramStatusType  status)
{
	this->status = status;
}


