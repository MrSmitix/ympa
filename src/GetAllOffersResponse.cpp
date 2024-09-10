#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetAllOffersResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetAllOffersResponse::GetAllOffersResponse()
{
	//__init();
}

GetAllOffersResponse::~GetAllOffersResponse()
{
	//__cleanup();
}

void
GetAllOffersResponse::__init()
{
	//new std::list()std::list> offers;
}

void
GetAllOffersResponse::__cleanup()
{
	//if(offers != NULL) {
	//offers.RemoveAll(true);
	//delete offers;
	//offers = NULL;
	//}
	//
}

void
GetAllOffersResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offersKey = "offers";
	node = json_object_get_member(pJsonObject, offersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OfferDTO> new_list;
			OfferDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferDTO")) {
					jsonToValue(&inst, temp_json, "OfferDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			offers = new_list;
		}
		
	}
}

GetAllOffersResponse::GetAllOffersResponse(char* json)
{
	this->fromJson(json);
}

char*
GetAllOffersResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OfferDTO")) {
		list<OfferDTO> new_list = static_cast<list <OfferDTO> > (getOffers());
		node = converttoJson(&new_list, "OfferDTO", "array");
	} else {
		node = json_node_alloc();
		list<OfferDTO> new_list = static_cast<list <OfferDTO> > (getOffers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *offersKey = "offers";
	json_object_set_member(pJsonObject, offersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<OfferDTO>
GetAllOffersResponse::getOffers()
{
	return offers;
}

void
GetAllOffersResponse::setOffers(std::list <OfferDTO> offers)
{
	this->offers = offers;
}


