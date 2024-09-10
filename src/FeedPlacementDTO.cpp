#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FeedPlacementDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FeedPlacementDTO::FeedPlacementDTO()
{
	//__init();
}

FeedPlacementDTO::~FeedPlacementDTO()
{
	//__cleanup();
}

void
FeedPlacementDTO::__init()
{
	//status = new FeedStatusType();
	//totalOffersCount = int(0);
}

void
FeedPlacementDTO::__cleanup()
{
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(totalOffersCount != NULL) {
	//
	//delete totalOffersCount;
	//totalOffersCount = NULL;
	//}
	//
}

void
FeedPlacementDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedStatusType")) {
			jsonToValue(&status, node, "FeedStatusType", "FeedStatusType");
		} else {
			
			FeedStatusType* obj = static_cast<FeedStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *totalOffersCountKey = "totalOffersCount";
	node = json_object_get_member(pJsonObject, totalOffersCountKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&totalOffersCount, node, "int", "");
		} else {
			
		}
	}
}

FeedPlacementDTO::FeedPlacementDTO(char* json)
{
	this->fromJson(json);
}

char*
FeedPlacementDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("FeedStatusType")) {
		FeedStatusType obj = getStatus();
		node = converttoJson(&obj, "FeedStatusType", "");
	}
	else {
		
		FeedStatusType obj = static_cast<FeedStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("int")) {
		int obj = getTotalOffersCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *totalOffersCountKey = "totalOffersCount";
	json_object_set_member(pJsonObject, totalOffersCountKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

FeedStatusType
FeedPlacementDTO::getStatus()
{
	return status;
}

void
FeedPlacementDTO::setStatus(FeedStatusType  status)
{
	this->status = status;
}

int
FeedPlacementDTO::getTotalOffersCount()
{
	return totalOffersCount;
}

void
FeedPlacementDTO::setTotalOffersCount(int  totalOffersCount)
{
	this->totalOffersCount = totalOffersCount;
}


