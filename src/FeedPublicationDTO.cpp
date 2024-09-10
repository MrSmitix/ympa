#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FeedPublicationDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FeedPublicationDTO::FeedPublicationDTO()
{
	//__init();
}

FeedPublicationDTO::~FeedPublicationDTO()
{
	//__cleanup();
}

void
FeedPublicationDTO::__init()
{
	//status = new FeedStatusType();
	//full = new FeedPublicationFullDTO();
	//priceAndStockUpdate = new FeedPublicationPriceAndStockUpdateDTO();
}

void
FeedPublicationDTO::__cleanup()
{
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(full != NULL) {
	//
	//delete full;
	//full = NULL;
	//}
	//if(priceAndStockUpdate != NULL) {
	//
	//delete priceAndStockUpdate;
	//priceAndStockUpdate = NULL;
	//}
	//
}

void
FeedPublicationDTO::fromJson(char* jsonStr)
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
	const gchar *fullKey = "full";
	node = json_object_get_member(pJsonObject, fullKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedPublicationFullDTO")) {
			jsonToValue(&full, node, "FeedPublicationFullDTO", "FeedPublicationFullDTO");
		} else {
			
			FeedPublicationFullDTO* obj = static_cast<FeedPublicationFullDTO*> (&full);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *priceAndStockUpdateKey = "priceAndStockUpdate";
	node = json_object_get_member(pJsonObject, priceAndStockUpdateKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedPublicationPriceAndStockUpdateDTO")) {
			jsonToValue(&priceAndStockUpdate, node, "FeedPublicationPriceAndStockUpdateDTO", "FeedPublicationPriceAndStockUpdateDTO");
		} else {
			
			FeedPublicationPriceAndStockUpdateDTO* obj = static_cast<FeedPublicationPriceAndStockUpdateDTO*> (&priceAndStockUpdate);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

FeedPublicationDTO::FeedPublicationDTO(char* json)
{
	this->fromJson(json);
}

char*
FeedPublicationDTO::toJson()
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
	if (isprimitive("FeedPublicationFullDTO")) {
		FeedPublicationFullDTO obj = getFull();
		node = converttoJson(&obj, "FeedPublicationFullDTO", "");
	}
	else {
		
		FeedPublicationFullDTO obj = static_cast<FeedPublicationFullDTO> (getFull());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fullKey = "full";
	json_object_set_member(pJsonObject, fullKey, node);
	if (isprimitive("FeedPublicationPriceAndStockUpdateDTO")) {
		FeedPublicationPriceAndStockUpdateDTO obj = getPriceAndStockUpdate();
		node = converttoJson(&obj, "FeedPublicationPriceAndStockUpdateDTO", "");
	}
	else {
		
		FeedPublicationPriceAndStockUpdateDTO obj = static_cast<FeedPublicationPriceAndStockUpdateDTO> (getPriceAndStockUpdate());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *priceAndStockUpdateKey = "priceAndStockUpdate";
	json_object_set_member(pJsonObject, priceAndStockUpdateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

FeedStatusType
FeedPublicationDTO::getStatus()
{
	return status;
}

void
FeedPublicationDTO::setStatus(FeedStatusType  status)
{
	this->status = status;
}

FeedPublicationFullDTO
FeedPublicationDTO::getFull()
{
	return full;
}

void
FeedPublicationDTO::setFull(FeedPublicationFullDTO  full)
{
	this->full = full;
}

FeedPublicationPriceAndStockUpdateDTO
FeedPublicationDTO::getPriceAndStockUpdate()
{
	return priceAndStockUpdate;
}

void
FeedPublicationDTO::setPriceAndStockUpdate(FeedPublicationPriceAndStockUpdateDTO  priceAndStockUpdate)
{
	this->priceAndStockUpdate = priceAndStockUpdate;
}


