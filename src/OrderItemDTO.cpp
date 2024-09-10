#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderItemDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderItemDTO::OrderItemDTO()
{
	//__init();
}

OrderItemDTO::~OrderItemDTO()
{
	//__cleanup();
}

void
OrderItemDTO::__init()
{
	//id = long(0);
	//offerId = std::string();
	//offerName = std::string();
	//price = double(0);
	//buyerPrice = double(0);
	//buyerPriceBeforeDiscount = double(0);
	//priceBeforeDiscount = double(0);
	//count = int(0);
	//vat = new OrderVatType();
	//shopSku = std::string();
	//subsidy = double(0);
	//partnerWarehouseId = std::string();
	//new std::list()std::list> promos;
	//new std::list()std::list> instances;
	//new std::list()std::list> details;
	//new std::list()std::list> subsidies;
	//new std::list()std::list> requiredInstanceTypes;
}

void
OrderItemDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//if(offerName != NULL) {
	//
	//delete offerName;
	//offerName = NULL;
	//}
	//if(price != NULL) {
	//
	//delete price;
	//price = NULL;
	//}
	//if(buyerPrice != NULL) {
	//
	//delete buyerPrice;
	//buyerPrice = NULL;
	//}
	//if(buyerPriceBeforeDiscount != NULL) {
	//
	//delete buyerPriceBeforeDiscount;
	//buyerPriceBeforeDiscount = NULL;
	//}
	//if(priceBeforeDiscount != NULL) {
	//
	//delete priceBeforeDiscount;
	//priceBeforeDiscount = NULL;
	//}
	//if(count != NULL) {
	//
	//delete count;
	//count = NULL;
	//}
	//if(vat != NULL) {
	//
	//delete vat;
	//vat = NULL;
	//}
	//if(shopSku != NULL) {
	//
	//delete shopSku;
	//shopSku = NULL;
	//}
	//if(subsidy != NULL) {
	//
	//delete subsidy;
	//subsidy = NULL;
	//}
	//if(partnerWarehouseId != NULL) {
	//
	//delete partnerWarehouseId;
	//partnerWarehouseId = NULL;
	//}
	//if(promos != NULL) {
	//promos.RemoveAll(true);
	//delete promos;
	//promos = NULL;
	//}
	//if(instances != NULL) {
	//instances.RemoveAll(true);
	//delete instances;
	//instances = NULL;
	//}
	//if(details != NULL) {
	//details.RemoveAll(true);
	//delete details;
	//details = NULL;
	//}
	//if(subsidies != NULL) {
	//subsidies.RemoveAll(true);
	//delete subsidies;
	//subsidies = NULL;
	//}
	//if(requiredInstanceTypes != NULL) {
	//requiredInstanceTypes.RemoveAll(true);
	//delete requiredInstanceTypes;
	//requiredInstanceTypes = NULL;
	//}
	//
}

void
OrderItemDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *offerIdKey = "offerId";
	node = json_object_get_member(pJsonObject, offerIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&offerId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *offerNameKey = "offerName";
	node = json_object_get_member(pJsonObject, offerNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&offerName, node, "std::string", "");
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
	const gchar *buyerPriceKey = "buyerPrice";
	node = json_object_get_member(pJsonObject, buyerPriceKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&buyerPrice, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&buyerPrice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *buyerPriceBeforeDiscountKey = "buyerPriceBeforeDiscount";
	node = json_object_get_member(pJsonObject, buyerPriceBeforeDiscountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&buyerPriceBeforeDiscount, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&buyerPriceBeforeDiscount);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *priceBeforeDiscountKey = "priceBeforeDiscount";
	node = json_object_get_member(pJsonObject, priceBeforeDiscountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&priceBeforeDiscount, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&priceBeforeDiscount);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *vatKey = "vat";
	node = json_object_get_member(pJsonObject, vatKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderVatType")) {
			jsonToValue(&vat, node, "OrderVatType", "OrderVatType");
		} else {
			
			OrderVatType* obj = static_cast<OrderVatType*> (&vat);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *subsidyKey = "subsidy";
	node = json_object_get_member(pJsonObject, subsidyKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&subsidy, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&subsidy);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *partnerWarehouseIdKey = "partnerWarehouseId";
	node = json_object_get_member(pJsonObject, partnerWarehouseIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&partnerWarehouseId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *promosKey = "promos";
	node = json_object_get_member(pJsonObject, promosKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrderItemPromoDTO> new_list;
			OrderItemPromoDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrderItemPromoDTO")) {
					jsonToValue(&inst, temp_json, "OrderItemPromoDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			promos = new_list;
		}
		
	}
	const gchar *instancesKey = "instances";
	node = json_object_get_member(pJsonObject, instancesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrderItemInstanceDTO> new_list;
			OrderItemInstanceDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrderItemInstanceDTO")) {
					jsonToValue(&inst, temp_json, "OrderItemInstanceDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			instances = new_list;
		}
		
	}
	const gchar *detailsKey = "details";
	node = json_object_get_member(pJsonObject, detailsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrderItemDetailDTO> new_list;
			OrderItemDetailDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrderItemDetailDTO")) {
					jsonToValue(&inst, temp_json, "OrderItemDetailDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			details = new_list;
		}
		
	}
	const gchar *subsidiesKey = "subsidies";
	node = json_object_get_member(pJsonObject, subsidiesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrderItemSubsidyDTO> new_list;
			OrderItemSubsidyDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrderItemSubsidyDTO")) {
					jsonToValue(&inst, temp_json, "OrderItemSubsidyDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			subsidies = new_list;
		}
		
	}
	const gchar *requiredInstanceTypesKey = "requiredInstanceTypes";
	node = json_object_get_member(pJsonObject, requiredInstanceTypesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrderItemInstanceType> new_list;
			OrderItemInstanceType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrderItemInstanceType")) {
					jsonToValue(&inst, temp_json, "OrderItemInstanceType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			requiredInstanceTypes = new_list;
		}
		
	}
}

OrderItemDTO::OrderItemDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderItemDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOfferId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *offerIdKey = "offerId";
	json_object_set_member(pJsonObject, offerIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOfferName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *offerNameKey = "offerName";
	json_object_set_member(pJsonObject, offerNameKey, node);
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
		long long obj = getBuyerPrice();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getBuyerPrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *buyerPriceKey = "buyerPrice";
	json_object_set_member(pJsonObject, buyerPriceKey, node);
	if (isprimitive("long long")) {
		long long obj = getBuyerPriceBeforeDiscount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getBuyerPriceBeforeDiscount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *buyerPriceBeforeDiscountKey = "buyerPriceBeforeDiscount";
	json_object_set_member(pJsonObject, buyerPriceBeforeDiscountKey, node);
	if (isprimitive("long long")) {
		long long obj = getPriceBeforeDiscount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getPriceBeforeDiscount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *priceBeforeDiscountKey = "priceBeforeDiscount";
	json_object_set_member(pJsonObject, priceBeforeDiscountKey, node);
	if (isprimitive("int")) {
		int obj = getCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *countKey = "count";
	json_object_set_member(pJsonObject, countKey, node);
	if (isprimitive("OrderVatType")) {
		OrderVatType obj = getVat();
		node = converttoJson(&obj, "OrderVatType", "");
	}
	else {
		
		OrderVatType obj = static_cast<OrderVatType> (getVat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *vatKey = "vat";
	json_object_set_member(pJsonObject, vatKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getShopSku();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *shopSkuKey = "shopSku";
	json_object_set_member(pJsonObject, shopSkuKey, node);
	if (isprimitive("long long")) {
		long long obj = getSubsidy();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getSubsidy());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *subsidyKey = "subsidy";
	json_object_set_member(pJsonObject, subsidyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPartnerWarehouseId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *partnerWarehouseIdKey = "partnerWarehouseId";
	json_object_set_member(pJsonObject, partnerWarehouseIdKey, node);
	if (isprimitive("OrderItemPromoDTO")) {
		list<OrderItemPromoDTO> new_list = static_cast<list <OrderItemPromoDTO> > (getPromos());
		node = converttoJson(&new_list, "OrderItemPromoDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrderItemPromoDTO> new_list = static_cast<list <OrderItemPromoDTO> > (getPromos());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrderItemPromoDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrderItemPromoDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *promosKey = "promos";
	json_object_set_member(pJsonObject, promosKey, node);
	if (isprimitive("OrderItemInstanceDTO")) {
		list<OrderItemInstanceDTO> new_list = static_cast<list <OrderItemInstanceDTO> > (getInstances());
		node = converttoJson(&new_list, "OrderItemInstanceDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrderItemInstanceDTO> new_list = static_cast<list <OrderItemInstanceDTO> > (getInstances());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrderItemInstanceDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrderItemInstanceDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *instancesKey = "instances";
	json_object_set_member(pJsonObject, instancesKey, node);
	if (isprimitive("OrderItemDetailDTO")) {
		list<OrderItemDetailDTO> new_list = static_cast<list <OrderItemDetailDTO> > (getDetails());
		node = converttoJson(&new_list, "OrderItemDetailDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrderItemDetailDTO> new_list = static_cast<list <OrderItemDetailDTO> > (getDetails());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrderItemDetailDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrderItemDetailDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *detailsKey = "details";
	json_object_set_member(pJsonObject, detailsKey, node);
	if (isprimitive("OrderItemSubsidyDTO")) {
		list<OrderItemSubsidyDTO> new_list = static_cast<list <OrderItemSubsidyDTO> > (getSubsidies());
		node = converttoJson(&new_list, "OrderItemSubsidyDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrderItemSubsidyDTO> new_list = static_cast<list <OrderItemSubsidyDTO> > (getSubsidies());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrderItemSubsidyDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrderItemSubsidyDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *subsidiesKey = "subsidies";
	json_object_set_member(pJsonObject, subsidiesKey, node);
	if (isprimitive("OrderItemInstanceType")) {
		list<OrderItemInstanceType> new_list = static_cast<list <OrderItemInstanceType> > (getRequiredInstanceTypes());
		node = converttoJson(&new_list, "OrderItemInstanceType", "array");
	} else {
		node = json_node_alloc();
		list<OrderItemInstanceType> new_list = static_cast<list <OrderItemInstanceType> > (getRequiredInstanceTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrderItemInstanceType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrderItemInstanceType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *requiredInstanceTypesKey = "requiredInstanceTypes";
	json_object_set_member(pJsonObject, requiredInstanceTypesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
OrderItemDTO::getId()
{
	return id;
}

void
OrderItemDTO::setId(long long  id)
{
	this->id = id;
}

std::string
OrderItemDTO::getOfferId()
{
	return offerId;
}

void
OrderItemDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

std::string
OrderItemDTO::getOfferName()
{
	return offerName;
}

void
OrderItemDTO::setOfferName(std::string  offerName)
{
	this->offerName = offerName;
}

long long
OrderItemDTO::getPrice()
{
	return price;
}

void
OrderItemDTO::setPrice(long long  price)
{
	this->price = price;
}

long long
OrderItemDTO::getBuyerPrice()
{
	return buyerPrice;
}

void
OrderItemDTO::setBuyerPrice(long long  buyerPrice)
{
	this->buyerPrice = buyerPrice;
}

long long
OrderItemDTO::getBuyerPriceBeforeDiscount()
{
	return buyerPriceBeforeDiscount;
}

void
OrderItemDTO::setBuyerPriceBeforeDiscount(long long  buyerPriceBeforeDiscount)
{
	this->buyerPriceBeforeDiscount = buyerPriceBeforeDiscount;
}

long long
OrderItemDTO::getPriceBeforeDiscount()
{
	return priceBeforeDiscount;
}

void
OrderItemDTO::setPriceBeforeDiscount(long long  priceBeforeDiscount)
{
	this->priceBeforeDiscount = priceBeforeDiscount;
}

int
OrderItemDTO::getCount()
{
	return count;
}

void
OrderItemDTO::setCount(int  count)
{
	this->count = count;
}

OrderVatType
OrderItemDTO::getVat()
{
	return vat;
}

void
OrderItemDTO::setVat(OrderVatType  vat)
{
	this->vat = vat;
}

std::string
OrderItemDTO::getShopSku()
{
	return shopSku;
}

void
OrderItemDTO::setShopSku(std::string  shopSku)
{
	this->shopSku = shopSku;
}

long long
OrderItemDTO::getSubsidy()
{
	return subsidy;
}

void
OrderItemDTO::setSubsidy(long long  subsidy)
{
	this->subsidy = subsidy;
}

std::string
OrderItemDTO::getPartnerWarehouseId()
{
	return partnerWarehouseId;
}

void
OrderItemDTO::setPartnerWarehouseId(std::string  partnerWarehouseId)
{
	this->partnerWarehouseId = partnerWarehouseId;
}

std::list<OrderItemPromoDTO>
OrderItemDTO::getPromos()
{
	return promos;
}

void
OrderItemDTO::setPromos(std::list <OrderItemPromoDTO> promos)
{
	this->promos = promos;
}

std::list<OrderItemInstanceDTO>
OrderItemDTO::getInstances()
{
	return instances;
}

void
OrderItemDTO::setInstances(std::list <OrderItemInstanceDTO> instances)
{
	this->instances = instances;
}

std::list<OrderItemDetailDTO>
OrderItemDTO::getDetails()
{
	return details;
}

void
OrderItemDTO::setDetails(std::list <OrderItemDetailDTO> details)
{
	this->details = details;
}

std::list<OrderItemSubsidyDTO>
OrderItemDTO::getSubsidies()
{
	return subsidies;
}

void
OrderItemDTO::setSubsidies(std::list <OrderItemSubsidyDTO> subsidies)
{
	this->subsidies = subsidies;
}

std::list<OrderItemInstanceType>
OrderItemDTO::getRequiredInstanceTypes()
{
	return requiredInstanceTypes;
}

void
OrderItemDTO::setRequiredInstanceTypes(std::list <OrderItemInstanceType> requiredInstanceTypes)
{
	this->requiredInstanceTypes = requiredInstanceTypes;
}


