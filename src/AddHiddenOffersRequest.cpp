#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AddHiddenOffersRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AddHiddenOffersRequest::AddHiddenOffersRequest()
{
	//__init();
}

AddHiddenOffersRequest::~AddHiddenOffersRequest()
{
	//__cleanup();
}

void
AddHiddenOffersRequest::__init()
{
	//new std::list()std::list> hiddenOffers;
}

void
AddHiddenOffersRequest::__cleanup()
{
	//if(hiddenOffers != NULL) {
	//hiddenOffers.RemoveAll(true);
	//delete hiddenOffers;
	//hiddenOffers = NULL;
	//}
	//
}

void
AddHiddenOffersRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *hiddenOffersKey = "hiddenOffers";
	node = json_object_get_member(pJsonObject, hiddenOffersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<HiddenOfferDTO> new_list;
			HiddenOfferDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("HiddenOfferDTO")) {
					jsonToValue(&inst, temp_json, "HiddenOfferDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			hiddenOffers = new_list;
		}
		
	}
}

AddHiddenOffersRequest::AddHiddenOffersRequest(char* json)
{
	this->fromJson(json);
}

char*
AddHiddenOffersRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("HiddenOfferDTO")) {
		list<HiddenOfferDTO> new_list = static_cast<list <HiddenOfferDTO> > (getHiddenOffers());
		node = converttoJson(&new_list, "HiddenOfferDTO", "array");
	} else {
		node = json_node_alloc();
		list<HiddenOfferDTO> new_list = static_cast<list <HiddenOfferDTO> > (getHiddenOffers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<HiddenOfferDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			HiddenOfferDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *hiddenOffersKey = "hiddenOffers";
	json_object_set_member(pJsonObject, hiddenOffersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<HiddenOfferDTO>
AddHiddenOffersRequest::getHiddenOffers()
{
	return hiddenOffers;
}

void
AddHiddenOffersRequest::setHiddenOffers(std::list <HiddenOfferDTO> hiddenOffers)
{
	this->hiddenOffers = hiddenOffers;
}


