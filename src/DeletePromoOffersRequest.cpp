#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DeletePromoOffersRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DeletePromoOffersRequest::DeletePromoOffersRequest()
{
	//__init();
}

DeletePromoOffersRequest::~DeletePromoOffersRequest()
{
	//__cleanup();
}

void
DeletePromoOffersRequest::__init()
{
	//promoId = std::string();
	//deleteAllOffers = bool(false);
	//new std::list()std::list> offerIds;
}

void
DeletePromoOffersRequest::__cleanup()
{
	//if(promoId != NULL) {
	//
	//delete promoId;
	//promoId = NULL;
	//}
	//if(deleteAllOffers != NULL) {
	//
	//delete deleteAllOffers;
	//deleteAllOffers = NULL;
	//}
	//if(offerIds != NULL) {
	//offerIds.RemoveAll(true);
	//delete offerIds;
	//offerIds = NULL;
	//}
	//
}

void
DeletePromoOffersRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *promoIdKey = "promoId";
	node = json_object_get_member(pJsonObject, promoIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&promoId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *deleteAllOffersKey = "deleteAllOffers";
	node = json_object_get_member(pJsonObject, deleteAllOffersKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&deleteAllOffers, node, "bool", "");
		} else {
			
		}
	}
	const gchar *offerIdsKey = "offerIds";
	node = json_object_get_member(pJsonObject, offerIdsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			offerIds = new_list;
		}
		
	}
}

DeletePromoOffersRequest::DeletePromoOffersRequest(char* json)
{
	this->fromJson(json);
}

char*
DeletePromoOffersRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getPromoId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *promoIdKey = "promoId";
	json_object_set_member(pJsonObject, promoIdKey, node);
	if (isprimitive("bool")) {
		bool obj = getDeleteAllOffers();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *deleteAllOffersKey = "deleteAllOffers";
	json_object_set_member(pJsonObject, deleteAllOffersKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getOfferIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getOfferIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *offerIdsKey = "offerIds";
	json_object_set_member(pJsonObject, offerIdsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
DeletePromoOffersRequest::getPromoId()
{
	return promoId;
}

void
DeletePromoOffersRequest::setPromoId(std::string  promoId)
{
	this->promoId = promoId;
}

bool
DeletePromoOffersRequest::getDeleteAllOffers()
{
	return deleteAllOffers;
}

void
DeletePromoOffersRequest::setDeleteAllOffers(bool  deleteAllOffers)
{
	this->deleteAllOffers = deleteAllOffers;
}

std::list<std::string>
DeletePromoOffersRequest::getOfferIds()
{
	return offerIds;
}

void
DeletePromoOffersRequest::setOfferIds(std::list <std::string> offerIds)
{
	this->offerIds = offerIds;
}


