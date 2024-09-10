#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "WarehouseOfferDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

WarehouseOfferDTO::WarehouseOfferDTO()
{
	//__init();
}

WarehouseOfferDTO::~WarehouseOfferDTO()
{
	//__cleanup();
}

void
WarehouseOfferDTO::__init()
{
	//offerId = std::string();
	//turnoverSummary = new TurnoverDTO();
	//new std::list()std::list> stocks;
	//updatedAt = null;
}

void
WarehouseOfferDTO::__cleanup()
{
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//if(turnoverSummary != NULL) {
	//
	//delete turnoverSummary;
	//turnoverSummary = NULL;
	//}
	//if(stocks != NULL) {
	//stocks.RemoveAll(true);
	//delete stocks;
	//stocks = NULL;
	//}
	//if(updatedAt != NULL) {
	//
	//delete updatedAt;
	//updatedAt = NULL;
	//}
	//
}

void
WarehouseOfferDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offerIdKey = "offerId";
	node = json_object_get_member(pJsonObject, offerIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&offerId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *turnoverSummaryKey = "turnoverSummary";
	node = json_object_get_member(pJsonObject, turnoverSummaryKey);
	if (node !=NULL) {
	

		if (isprimitive("TurnoverDTO")) {
			jsonToValue(&turnoverSummary, node, "TurnoverDTO", "TurnoverDTO");
		} else {
			
			TurnoverDTO* obj = static_cast<TurnoverDTO*> (&turnoverSummary);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *stocksKey = "stocks";
	node = json_object_get_member(pJsonObject, stocksKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<WarehouseStockDTO> new_list;
			WarehouseStockDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("WarehouseStockDTO")) {
					jsonToValue(&inst, temp_json, "WarehouseStockDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			stocks = new_list;
		}
		
	}
	const gchar *updatedAtKey = "updatedAt";
	node = json_object_get_member(pJsonObject, updatedAtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&updatedAt, node, "std::string", "");
		} else {
			
		}
	}
}

WarehouseOfferDTO::WarehouseOfferDTO(char* json)
{
	this->fromJson(json);
}

char*
WarehouseOfferDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getOfferId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *offerIdKey = "offerId";
	json_object_set_member(pJsonObject, offerIdKey, node);
	if (isprimitive("TurnoverDTO")) {
		TurnoverDTO obj = getTurnoverSummary();
		node = converttoJson(&obj, "TurnoverDTO", "");
	}
	else {
		
		TurnoverDTO obj = static_cast<TurnoverDTO> (getTurnoverSummary());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *turnoverSummaryKey = "turnoverSummary";
	json_object_set_member(pJsonObject, turnoverSummaryKey, node);
	if (isprimitive("WarehouseStockDTO")) {
		list<WarehouseStockDTO> new_list = static_cast<list <WarehouseStockDTO> > (getStocks());
		node = converttoJson(&new_list, "WarehouseStockDTO", "array");
	} else {
		node = json_node_alloc();
		list<WarehouseStockDTO> new_list = static_cast<list <WarehouseStockDTO> > (getStocks());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<WarehouseStockDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			WarehouseStockDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *stocksKey = "stocks";
	json_object_set_member(pJsonObject, stocksKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUpdatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *updatedAtKey = "updatedAt";
	json_object_set_member(pJsonObject, updatedAtKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
WarehouseOfferDTO::getOfferId()
{
	return offerId;
}

void
WarehouseOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

TurnoverDTO
WarehouseOfferDTO::getTurnoverSummary()
{
	return turnoverSummary;
}

void
WarehouseOfferDTO::setTurnoverSummary(TurnoverDTO  turnoverSummary)
{
	this->turnoverSummary = turnoverSummary;
}

std::list<WarehouseStockDTO>
WarehouseOfferDTO::getStocks()
{
	return stocks;
}

void
WarehouseOfferDTO::setStocks(std::list <WarehouseStockDTO> stocks)
{
	this->stocks = stocks;
}

std::string
WarehouseOfferDTO::getUpdatedAt()
{
	return updatedAt;
}

void
WarehouseOfferDTO::setUpdatedAt(std::string  updatedAt)
{
	this->updatedAt = updatedAt;
}


