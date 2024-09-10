#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GoodsStatsGoodsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GoodsStatsGoodsDTO::GoodsStatsGoodsDTO()
{
	//__init();
}

GoodsStatsGoodsDTO::~GoodsStatsGoodsDTO()
{
	//__cleanup();
}

void
GoodsStatsGoodsDTO::__init()
{
	//shopSku = std::string();
	//marketSku = long(0);
	//name = std::string();
	//price = double(0);
	//categoryId = long(0);
	//categoryName = std::string();
	//weightDimensions = new GoodsStatsWeightDimensionsDTO();
	//new std::list()std::list> warehouses;
	//new std::list()std::list> tariffs;
	//new std::list()std::list> pictures;
}

void
GoodsStatsGoodsDTO::__cleanup()
{
	//if(shopSku != NULL) {
	//
	//delete shopSku;
	//shopSku = NULL;
	//}
	//if(marketSku != NULL) {
	//
	//delete marketSku;
	//marketSku = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(price != NULL) {
	//
	//delete price;
	//price = NULL;
	//}
	//if(categoryId != NULL) {
	//
	//delete categoryId;
	//categoryId = NULL;
	//}
	//if(categoryName != NULL) {
	//
	//delete categoryName;
	//categoryName = NULL;
	//}
	//if(weightDimensions != NULL) {
	//
	//delete weightDimensions;
	//weightDimensions = NULL;
	//}
	//if(warehouses != NULL) {
	//warehouses.RemoveAll(true);
	//delete warehouses;
	//warehouses = NULL;
	//}
	//if(tariffs != NULL) {
	//tariffs.RemoveAll(true);
	//delete tariffs;
	//tariffs = NULL;
	//}
	//if(pictures != NULL) {
	//pictures.RemoveAll(true);
	//delete pictures;
	//pictures = NULL;
	//}
	//
}

void
GoodsStatsGoodsDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *shopSkuKey = "shopSku";
	node = json_object_get_member(pJsonObject, shopSkuKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&shopSku, node, "std::string", "");
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *priceKey = "price";
	node = json_object_get_member(pJsonObject, priceKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&price, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&price);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *categoryIdKey = "categoryId";
	node = json_object_get_member(pJsonObject, categoryIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&categoryId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *categoryNameKey = "categoryName";
	node = json_object_get_member(pJsonObject, categoryNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&categoryName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *weightDimensionsKey = "weightDimensions";
	node = json_object_get_member(pJsonObject, weightDimensionsKey);
	if (node !=NULL) {
	

		if (isprimitive("GoodsStatsWeightDimensionsDTO")) {
			jsonToValue(&weightDimensions, node, "GoodsStatsWeightDimensionsDTO", "GoodsStatsWeightDimensionsDTO");
		} else {
			
			GoodsStatsWeightDimensionsDTO* obj = static_cast<GoodsStatsWeightDimensionsDTO*> (&weightDimensions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *warehousesKey = "warehouses";
	node = json_object_get_member(pJsonObject, warehousesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<GoodsStatsWarehouseDTO> new_list;
			GoodsStatsWarehouseDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("GoodsStatsWarehouseDTO")) {
					jsonToValue(&inst, temp_json, "GoodsStatsWarehouseDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			warehouses = new_list;
		}
		
	}
	const gchar *tariffsKey = "tariffs";
	node = json_object_get_member(pJsonObject, tariffsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TariffDTO> new_list;
			TariffDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TariffDTO")) {
					jsonToValue(&inst, temp_json, "TariffDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			tariffs = new_list;
		}
		
	}
	const gchar *picturesKey = "pictures";
	node = json_object_get_member(pJsonObject, picturesKey);
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
			pictures = new_list;
		}
		
	}
}

GoodsStatsGoodsDTO::GoodsStatsGoodsDTO(char* json)
{
	this->fromJson(json);
}

char*
GoodsStatsGoodsDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getShopSku();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *shopSkuKey = "shopSku";
	json_object_set_member(pJsonObject, shopSkuKey, node);
	if (isprimitive("long long")) {
		long long obj = getMarketSku();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *marketSkuKey = "marketSku";
	json_object_set_member(pJsonObject, marketSkuKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("long long")) {
		long long obj = getPrice();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getPrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *priceKey = "price";
	json_object_set_member(pJsonObject, priceKey, node);
	if (isprimitive("long long")) {
		long long obj = getCategoryId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *categoryIdKey = "categoryId";
	json_object_set_member(pJsonObject, categoryIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCategoryName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *categoryNameKey = "categoryName";
	json_object_set_member(pJsonObject, categoryNameKey, node);
	if (isprimitive("GoodsStatsWeightDimensionsDTO")) {
		GoodsStatsWeightDimensionsDTO obj = getWeightDimensions();
		node = converttoJson(&obj, "GoodsStatsWeightDimensionsDTO", "");
	}
	else {
		
		GoodsStatsWeightDimensionsDTO obj = static_cast<GoodsStatsWeightDimensionsDTO> (getWeightDimensions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *weightDimensionsKey = "weightDimensions";
	json_object_set_member(pJsonObject, weightDimensionsKey, node);
	if (isprimitive("GoodsStatsWarehouseDTO")) {
		list<GoodsStatsWarehouseDTO> new_list = static_cast<list <GoodsStatsWarehouseDTO> > (getWarehouses());
		node = converttoJson(&new_list, "GoodsStatsWarehouseDTO", "array");
	} else {
		node = json_node_alloc();
		list<GoodsStatsWarehouseDTO> new_list = static_cast<list <GoodsStatsWarehouseDTO> > (getWarehouses());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<GoodsStatsWarehouseDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			GoodsStatsWarehouseDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *warehousesKey = "warehouses";
	json_object_set_member(pJsonObject, warehousesKey, node);
	if (isprimitive("TariffDTO")) {
		list<TariffDTO> new_list = static_cast<list <TariffDTO> > (getTariffs());
		node = converttoJson(&new_list, "TariffDTO", "array");
	} else {
		node = json_node_alloc();
		list<TariffDTO> new_list = static_cast<list <TariffDTO> > (getTariffs());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TariffDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TariffDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *tariffsKey = "tariffs";
	json_object_set_member(pJsonObject, tariffsKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getPictures());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getPictures());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *picturesKey = "pictures";
	json_object_set_member(pJsonObject, picturesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
GoodsStatsGoodsDTO::getShopSku()
{
	return shopSku;
}

void
GoodsStatsGoodsDTO::setShopSku(std::string  shopSku)
{
	this->shopSku = shopSku;
}

long long
GoodsStatsGoodsDTO::getMarketSku()
{
	return marketSku;
}

void
GoodsStatsGoodsDTO::setMarketSku(long long  marketSku)
{
	this->marketSku = marketSku;
}

std::string
GoodsStatsGoodsDTO::getName()
{
	return name;
}

void
GoodsStatsGoodsDTO::setName(std::string  name)
{
	this->name = name;
}

long long
GoodsStatsGoodsDTO::getPrice()
{
	return price;
}

void
GoodsStatsGoodsDTO::setPrice(long long  price)
{
	this->price = price;
}

long long
GoodsStatsGoodsDTO::getCategoryId()
{
	return categoryId;
}

void
GoodsStatsGoodsDTO::setCategoryId(long long  categoryId)
{
	this->categoryId = categoryId;
}

std::string
GoodsStatsGoodsDTO::getCategoryName()
{
	return categoryName;
}

void
GoodsStatsGoodsDTO::setCategoryName(std::string  categoryName)
{
	this->categoryName = categoryName;
}

GoodsStatsWeightDimensionsDTO
GoodsStatsGoodsDTO::getWeightDimensions()
{
	return weightDimensions;
}

void
GoodsStatsGoodsDTO::setWeightDimensions(GoodsStatsWeightDimensionsDTO  weightDimensions)
{
	this->weightDimensions = weightDimensions;
}

std::list<GoodsStatsWarehouseDTO>
GoodsStatsGoodsDTO::getWarehouses()
{
	return warehouses;
}

void
GoodsStatsGoodsDTO::setWarehouses(std::list <GoodsStatsWarehouseDTO> warehouses)
{
	this->warehouses = warehouses;
}

std::list<TariffDTO>
GoodsStatsGoodsDTO::getTariffs()
{
	return tariffs;
}

void
GoodsStatsGoodsDTO::setTariffs(std::list <TariffDTO> tariffs)
{
	this->tariffs = tariffs;
}

std::list<std::string>
GoodsStatsGoodsDTO::getPictures()
{
	return pictures;
}

void
GoodsStatsGoodsDTO::setPictures(std::list <std::string> pictures)
{
	this->pictures = pictures;
}


