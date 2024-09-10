#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "WarehouseOffersDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

WarehouseOffersDTO::WarehouseOffersDTO()
{
	//__init();
}

WarehouseOffersDTO::~WarehouseOffersDTO()
{
	//__cleanup();
}

void
WarehouseOffersDTO::__init()
{
	//warehouseId = long(0);
	//new std::list()std::list> offers;
}

void
WarehouseOffersDTO::__cleanup()
{
	//if(warehouseId != NULL) {
	//
	//delete warehouseId;
	//warehouseId = NULL;
	//}
	//if(offers != NULL) {
	//offers.RemoveAll(true);
	//delete offers;
	//offers = NULL;
	//}
	//
}

void
WarehouseOffersDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *warehouseIdKey = "warehouseId";
	node = json_object_get_member(pJsonObject, warehouseIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&warehouseId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *offersKey = "offers";
	node = json_object_get_member(pJsonObject, offersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<WarehouseOfferDTO> new_list;
			WarehouseOfferDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("WarehouseOfferDTO")) {
					jsonToValue(&inst, temp_json, "WarehouseOfferDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			offers = new_list;
		}
		
	}
}

WarehouseOffersDTO::WarehouseOffersDTO(char* json)
{
	this->fromJson(json);
}

char*
WarehouseOffersDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getWarehouseId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *warehouseIdKey = "warehouseId";
	json_object_set_member(pJsonObject, warehouseIdKey, node);
	if (isprimitive("WarehouseOfferDTO")) {
		list<WarehouseOfferDTO> new_list = static_cast<list <WarehouseOfferDTO> > (getOffers());
		node = converttoJson(&new_list, "WarehouseOfferDTO", "array");
	} else {
		node = json_node_alloc();
		list<WarehouseOfferDTO> new_list = static_cast<list <WarehouseOfferDTO> > (getOffers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<WarehouseOfferDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			WarehouseOfferDTO obj = *it;
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

long long
WarehouseOffersDTO::getWarehouseId()
{
	return warehouseId;
}

void
WarehouseOffersDTO::setWarehouseId(long long  warehouseId)
{
	this->warehouseId = warehouseId;
}

std::list<WarehouseOfferDTO>
WarehouseOffersDTO::getOffers()
{
	return offers;
}

void
WarehouseOffersDTO::setOffers(std::list <WarehouseOfferDTO> offers)
{
	this->offers = offers;
}


