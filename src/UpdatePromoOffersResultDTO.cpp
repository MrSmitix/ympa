#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdatePromoOffersResultDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdatePromoOffersResultDTO::UpdatePromoOffersResultDTO()
{
	//__init();
}

UpdatePromoOffersResultDTO::~UpdatePromoOffersResultDTO()
{
	//__cleanup();
}

void
UpdatePromoOffersResultDTO::__init()
{
	//new std::list()std::list> rejectedOffers;
	//new std::list()std::list> warningOffers;
}

void
UpdatePromoOffersResultDTO::__cleanup()
{
	//if(rejectedOffers != NULL) {
	//rejectedOffers.RemoveAll(true);
	//delete rejectedOffers;
	//rejectedOffers = NULL;
	//}
	//if(warningOffers != NULL) {
	//warningOffers.RemoveAll(true);
	//delete warningOffers;
	//warningOffers = NULL;
	//}
	//
}

void
UpdatePromoOffersResultDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *rejectedOffersKey = "rejectedOffers";
	node = json_object_get_member(pJsonObject, rejectedOffersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<RejectedPromoOfferUpdateDTO> new_list;
			RejectedPromoOfferUpdateDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("RejectedPromoOfferUpdateDTO")) {
					jsonToValue(&inst, temp_json, "RejectedPromoOfferUpdateDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			rejectedOffers = new_list;
		}
		
	}
	const gchar *warningOffersKey = "warningOffers";
	node = json_object_get_member(pJsonObject, warningOffersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<WarningPromoOfferUpdateDTO> new_list;
			WarningPromoOfferUpdateDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("WarningPromoOfferUpdateDTO")) {
					jsonToValue(&inst, temp_json, "WarningPromoOfferUpdateDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			warningOffers = new_list;
		}
		
	}
}

UpdatePromoOffersResultDTO::UpdatePromoOffersResultDTO(char* json)
{
	this->fromJson(json);
}

char*
UpdatePromoOffersResultDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("RejectedPromoOfferUpdateDTO")) {
		list<RejectedPromoOfferUpdateDTO> new_list = static_cast<list <RejectedPromoOfferUpdateDTO> > (getRejectedOffers());
		node = converttoJson(&new_list, "RejectedPromoOfferUpdateDTO", "array");
	} else {
		node = json_node_alloc();
		list<RejectedPromoOfferUpdateDTO> new_list = static_cast<list <RejectedPromoOfferUpdateDTO> > (getRejectedOffers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<RejectedPromoOfferUpdateDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			RejectedPromoOfferUpdateDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *rejectedOffersKey = "rejectedOffers";
	json_object_set_member(pJsonObject, rejectedOffersKey, node);
	if (isprimitive("WarningPromoOfferUpdateDTO")) {
		list<WarningPromoOfferUpdateDTO> new_list = static_cast<list <WarningPromoOfferUpdateDTO> > (getWarningOffers());
		node = converttoJson(&new_list, "WarningPromoOfferUpdateDTO", "array");
	} else {
		node = json_node_alloc();
		list<WarningPromoOfferUpdateDTO> new_list = static_cast<list <WarningPromoOfferUpdateDTO> > (getWarningOffers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<WarningPromoOfferUpdateDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			WarningPromoOfferUpdateDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *warningOffersKey = "warningOffers";
	json_object_set_member(pJsonObject, warningOffersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<RejectedPromoOfferUpdateDTO>
UpdatePromoOffersResultDTO::getRejectedOffers()
{
	return rejectedOffers;
}

void
UpdatePromoOffersResultDTO::setRejectedOffers(std::list <RejectedPromoOfferUpdateDTO> rejectedOffers)
{
	this->rejectedOffers = rejectedOffers;
}

std::list<WarningPromoOfferUpdateDTO>
UpdatePromoOffersResultDTO::getWarningOffers()
{
	return warningOffers;
}

void
UpdatePromoOffersResultDTO::setWarningOffers(std::list <WarningPromoOfferUpdateDTO> warningOffers)
{
	this->warningOffers = warningOffers;
}


