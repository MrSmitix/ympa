#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrdersStatsItemDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrdersStatsItemDTO::OrdersStatsItemDTO()
{
	//__init();
}

OrdersStatsItemDTO::~OrdersStatsItemDTO()
{
	//__cleanup();
}

void
OrdersStatsItemDTO::__init()
{
	//offerName = std::string();
	//marketSku = long(0);
	//shopSku = std::string();
	//count = int(0);
	//new std::list()std::list> prices;
	//warehouse = new OrdersStatsWarehouseDTO();
	//new std::list()std::list> details;
	//new std::list()std::list> cisList;
	//initialCount = int(0);
	//bidFee = int(0);
	//cofinanceThreshold = double(0);
	//cofinanceValue = double(0);
}

void
OrdersStatsItemDTO::__cleanup()
{
	//if(offerName != NULL) {
	//
	//delete offerName;
	//offerName = NULL;
	//}
	//if(marketSku != NULL) {
	//
	//delete marketSku;
	//marketSku = NULL;
	//}
	//if(shopSku != NULL) {
	//
	//delete shopSku;
	//shopSku = NULL;
	//}
	//if(count != NULL) {
	//
	//delete count;
	//count = NULL;
	//}
	//if(prices != NULL) {
	//prices.RemoveAll(true);
	//delete prices;
	//prices = NULL;
	//}
	//if(warehouse != NULL) {
	//
	//delete warehouse;
	//warehouse = NULL;
	//}
	//if(details != NULL) {
	//details.RemoveAll(true);
	//delete details;
	//details = NULL;
	//}
	//if(cisList != NULL) {
	//cisList.RemoveAll(true);
	//delete cisList;
	//cisList = NULL;
	//}
	//if(initialCount != NULL) {
	//
	//delete initialCount;
	//initialCount = NULL;
	//}
	//if(bidFee != NULL) {
	//
	//delete bidFee;
	//bidFee = NULL;
	//}
	//if(cofinanceThreshold != NULL) {
	//
	//delete cofinanceThreshold;
	//cofinanceThreshold = NULL;
	//}
	//if(cofinanceValue != NULL) {
	//
	//delete cofinanceValue;
	//cofinanceValue = NULL;
	//}
	//
}

void
OrdersStatsItemDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offerNameKey = "offerName";
	node = json_object_get_member(pJsonObject, offerNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&offerName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *marketSkuKey = "marketSku";
	node = json_object_get_member(pJsonObject, marketSkuKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&marketSku, node, "long long", "");
		} else {
			
		}
	}
	const gchar *shopSkuKey = "shopSku";
	node = json_object_get_member(pJsonObject, shopSkuKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&shopSku, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *countKey = "count";
	node = json_object_get_member(pJsonObject, countKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&count, node, "int", "");
		} else {
			
		}
	}
	const gchar *pricesKey = "prices";
	node = json_object_get_member(pJsonObject, pricesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrdersStatsPriceDTO> new_list;
			OrdersStatsPriceDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrdersStatsPriceDTO")) {
					jsonToValue(&inst, temp_json, "OrdersStatsPriceDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			prices = new_list;
		}
		
	}
	const gchar *warehouseKey = "warehouse";
	node = json_object_get_member(pJsonObject, warehouseKey);
	if (node !=NULL) {
	

		if (isprimitive("OrdersStatsWarehouseDTO")) {
			jsonToValue(&warehouse, node, "OrdersStatsWarehouseDTO", "OrdersStatsWarehouseDTO");
		} else {
			
			OrdersStatsWarehouseDTO* obj = static_cast<OrdersStatsWarehouseDTO*> (&warehouse);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *detailsKey = "details";
	node = json_object_get_member(pJsonObject, detailsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrdersStatsDetailsDTO> new_list;
			OrdersStatsDetailsDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrdersStatsDetailsDTO")) {
					jsonToValue(&inst, temp_json, "OrdersStatsDetailsDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			details = new_list;
		}
		
	}
	const gchar *cisListKey = "cisList";
	node = json_object_get_member(pJsonObject, cisListKey);
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
			cisList = new_list;
		}
		
	}
	const gchar *initialCountKey = "initialCount";
	node = json_object_get_member(pJsonObject, initialCountKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&initialCount, node, "int", "");
		} else {
			
		}
	}
	const gchar *bidFeeKey = "bidFee";
	node = json_object_get_member(pJsonObject, bidFeeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&bidFee, node, "int", "");
		} else {
			
		}
	}
	const gchar *cofinanceThresholdKey = "cofinanceThreshold";
	node = json_object_get_member(pJsonObject, cofinanceThresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&cofinanceThreshold, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&cofinanceThreshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cofinanceValueKey = "cofinanceValue";
	node = json_object_get_member(pJsonObject, cofinanceValueKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&cofinanceValue, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&cofinanceValue);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrdersStatsItemDTO::OrdersStatsItemDTO(char* json)
{
	this->fromJson(json);
}

char*
OrdersStatsItemDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getOfferName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *offerNameKey = "offerName";
	json_object_set_member(pJsonObject, offerNameKey, node);
	if (isprimitive("long long")) {
		long long obj = getMarketSku();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *marketSkuKey = "marketSku";
	json_object_set_member(pJsonObject, marketSkuKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getShopSku();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *shopSkuKey = "shopSku";
	json_object_set_member(pJsonObject, shopSkuKey, node);
	if (isprimitive("int")) {
		int obj = getCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *countKey = "count";
	json_object_set_member(pJsonObject, countKey, node);
	if (isprimitive("OrdersStatsPriceDTO")) {
		list<OrdersStatsPriceDTO> new_list = static_cast<list <OrdersStatsPriceDTO> > (getPrices());
		node = converttoJson(&new_list, "OrdersStatsPriceDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrdersStatsPriceDTO> new_list = static_cast<list <OrdersStatsPriceDTO> > (getPrices());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrdersStatsPriceDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrdersStatsPriceDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *pricesKey = "prices";
	json_object_set_member(pJsonObject, pricesKey, node);
	if (isprimitive("OrdersStatsWarehouseDTO")) {
		OrdersStatsWarehouseDTO obj = getWarehouse();
		node = converttoJson(&obj, "OrdersStatsWarehouseDTO", "");
	}
	else {
		
		OrdersStatsWarehouseDTO obj = static_cast<OrdersStatsWarehouseDTO> (getWarehouse());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *warehouseKey = "warehouse";
	json_object_set_member(pJsonObject, warehouseKey, node);
	if (isprimitive("OrdersStatsDetailsDTO")) {
		list<OrdersStatsDetailsDTO> new_list = static_cast<list <OrdersStatsDetailsDTO> > (getDetails());
		node = converttoJson(&new_list, "OrdersStatsDetailsDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrdersStatsDetailsDTO> new_list = static_cast<list <OrdersStatsDetailsDTO> > (getDetails());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrdersStatsDetailsDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrdersStatsDetailsDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *detailsKey = "details";
	json_object_set_member(pJsonObject, detailsKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCisList());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCisList());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *cisListKey = "cisList";
	json_object_set_member(pJsonObject, cisListKey, node);
	if (isprimitive("int")) {
		int obj = getInitialCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *initialCountKey = "initialCount";
	json_object_set_member(pJsonObject, initialCountKey, node);
	if (isprimitive("int")) {
		int obj = getBidFee();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *bidFeeKey = "bidFee";
	json_object_set_member(pJsonObject, bidFeeKey, node);
	if (isprimitive("long long")) {
		long long obj = getCofinanceThreshold();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getCofinanceThreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cofinanceThresholdKey = "cofinanceThreshold";
	json_object_set_member(pJsonObject, cofinanceThresholdKey, node);
	if (isprimitive("long long")) {
		long long obj = getCofinanceValue();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getCofinanceValue());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cofinanceValueKey = "cofinanceValue";
	json_object_set_member(pJsonObject, cofinanceValueKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OrdersStatsItemDTO::getOfferName()
{
	return offerName;
}

void
OrdersStatsItemDTO::setOfferName(std::string  offerName)
{
	this->offerName = offerName;
}

long long
OrdersStatsItemDTO::getMarketSku()
{
	return marketSku;
}

void
OrdersStatsItemDTO::setMarketSku(long long  marketSku)
{
	this->marketSku = marketSku;
}

std::string
OrdersStatsItemDTO::getShopSku()
{
	return shopSku;
}

void
OrdersStatsItemDTO::setShopSku(std::string  shopSku)
{
	this->shopSku = shopSku;
}

int
OrdersStatsItemDTO::getCount()
{
	return count;
}

void
OrdersStatsItemDTO::setCount(int  count)
{
	this->count = count;
}

std::list<OrdersStatsPriceDTO>
OrdersStatsItemDTO::getPrices()
{
	return prices;
}

void
OrdersStatsItemDTO::setPrices(std::list <OrdersStatsPriceDTO> prices)
{
	this->prices = prices;
}

OrdersStatsWarehouseDTO
OrdersStatsItemDTO::getWarehouse()
{
	return warehouse;
}

void
OrdersStatsItemDTO::setWarehouse(OrdersStatsWarehouseDTO  warehouse)
{
	this->warehouse = warehouse;
}

std::list<OrdersStatsDetailsDTO>
OrdersStatsItemDTO::getDetails()
{
	return details;
}

void
OrdersStatsItemDTO::setDetails(std::list <OrdersStatsDetailsDTO> details)
{
	this->details = details;
}

std::list<std::string>
OrdersStatsItemDTO::getCisList()
{
	return cisList;
}

void
OrdersStatsItemDTO::setCisList(std::list <std::string> cisList)
{
	this->cisList = cisList;
}

int
OrdersStatsItemDTO::getInitialCount()
{
	return initialCount;
}

void
OrdersStatsItemDTO::setInitialCount(int  initialCount)
{
	this->initialCount = initialCount;
}

int
OrdersStatsItemDTO::getBidFee()
{
	return bidFee;
}

void
OrdersStatsItemDTO::setBidFee(int  bidFee)
{
	this->bidFee = bidFee;
}

long long
OrdersStatsItemDTO::getCofinanceThreshold()
{
	return cofinanceThreshold;
}

void
OrdersStatsItemDTO::setCofinanceThreshold(long long  cofinanceThreshold)
{
	this->cofinanceThreshold = cofinanceThreshold;
}

long long
OrdersStatsItemDTO::getCofinanceValue()
{
	return cofinanceValue;
}

void
OrdersStatsItemDTO::setCofinanceValue(long long  cofinanceValue)
{
	this->cofinanceValue = cofinanceValue;
}


