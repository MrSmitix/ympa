#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetOfferDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetOfferDTO::GetOfferDTO()
{
	//__init();
}

GetOfferDTO::~GetOfferDTO()
{
	//__cleanup();
}

void
GetOfferDTO::__init()
{
	//offerId = std::string();
	//name = std::string();
	//marketCategoryId = long(0);
	//category = std::string();
	//new std::list()std::list> pictures;
	//new std::list()std::list> videos;
	//new std::list()std::list> manuals;
	//vendor = std::string();
	//new std::list()std::list> barcodes;
	//description = std::string();
	//new std::list()std::list> manufacturerCountries;
	//weightDimensions = new OfferWeightDimensionsDTO();
	//vendorCode = std::string();
	//new std::list()std::list> tags;
	//shelfLife = new TimePeriodDTO();
	//lifeTime = new TimePeriodDTO();
	//guaranteePeriod = new TimePeriodDTO();
	//customsCommodityCode = std::string();
	//new std::list()std::list> certificates;
	//boxCount = int(0);
	//condition = new OfferConditionDTO();
	//type = new OfferType();
	//downloadable = bool(false);
	//adult = bool(false);
	//age = new AgeDTO();
	//new std::list()std::list> params;
	//basicPrice = new GetPriceWithDiscountDTO();
	//purchasePrice = new GetPriceDTO();
	//additionalExpenses = new GetPriceDTO();
	//cofinancePrice = new GetPriceDTO();
	//cardStatus = new OfferCardStatusType();
	//new std::list()std::list> campaigns;
	//new std::list()std::list> sellingPrograms;
	//archived = bool(false);
}

void
GetOfferDTO::__cleanup()
{
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(marketCategoryId != NULL) {
	//
	//delete marketCategoryId;
	//marketCategoryId = NULL;
	//}
	//if(category != NULL) {
	//
	//delete category;
	//category = NULL;
	//}
	//if(pictures != NULL) {
	//pictures.RemoveAll(true);
	//delete pictures;
	//pictures = NULL;
	//}
	//if(videos != NULL) {
	//videos.RemoveAll(true);
	//delete videos;
	//videos = NULL;
	//}
	//if(manuals != NULL) {
	//manuals.RemoveAll(true);
	//delete manuals;
	//manuals = NULL;
	//}
	//if(vendor != NULL) {
	//
	//delete vendor;
	//vendor = NULL;
	//}
	//if(barcodes != NULL) {
	//barcodes.RemoveAll(true);
	//delete barcodes;
	//barcodes = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(manufacturerCountries != NULL) {
	//manufacturerCountries.RemoveAll(true);
	//delete manufacturerCountries;
	//manufacturerCountries = NULL;
	//}
	//if(weightDimensions != NULL) {
	//
	//delete weightDimensions;
	//weightDimensions = NULL;
	//}
	//if(vendorCode != NULL) {
	//
	//delete vendorCode;
	//vendorCode = NULL;
	//}
	//if(tags != NULL) {
	//tags.RemoveAll(true);
	//delete tags;
	//tags = NULL;
	//}
	//if(shelfLife != NULL) {
	//
	//delete shelfLife;
	//shelfLife = NULL;
	//}
	//if(lifeTime != NULL) {
	//
	//delete lifeTime;
	//lifeTime = NULL;
	//}
	//if(guaranteePeriod != NULL) {
	//
	//delete guaranteePeriod;
	//guaranteePeriod = NULL;
	//}
	//if(customsCommodityCode != NULL) {
	//
	//delete customsCommodityCode;
	//customsCommodityCode = NULL;
	//}
	//if(certificates != NULL) {
	//certificates.RemoveAll(true);
	//delete certificates;
	//certificates = NULL;
	//}
	//if(boxCount != NULL) {
	//
	//delete boxCount;
	//boxCount = NULL;
	//}
	//if(condition != NULL) {
	//
	//delete condition;
	//condition = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(downloadable != NULL) {
	//
	//delete downloadable;
	//downloadable = NULL;
	//}
	//if(adult != NULL) {
	//
	//delete adult;
	//adult = NULL;
	//}
	//if(age != NULL) {
	//
	//delete age;
	//age = NULL;
	//}
	//if(params != NULL) {
	//params.RemoveAll(true);
	//delete params;
	//params = NULL;
	//}
	//if(basicPrice != NULL) {
	//
	//delete basicPrice;
	//basicPrice = NULL;
	//}
	//if(purchasePrice != NULL) {
	//
	//delete purchasePrice;
	//purchasePrice = NULL;
	//}
	//if(additionalExpenses != NULL) {
	//
	//delete additionalExpenses;
	//additionalExpenses = NULL;
	//}
	//if(cofinancePrice != NULL) {
	//
	//delete cofinancePrice;
	//cofinancePrice = NULL;
	//}
	//if(cardStatus != NULL) {
	//
	//delete cardStatus;
	//cardStatus = NULL;
	//}
	//if(campaigns != NULL) {
	//campaigns.RemoveAll(true);
	//delete campaigns;
	//campaigns = NULL;
	//}
	//if(sellingPrograms != NULL) {
	//sellingPrograms.RemoveAll(true);
	//delete sellingPrograms;
	//sellingPrograms = NULL;
	//}
	//if(archived != NULL) {
	//
	//delete archived;
	//archived = NULL;
	//}
	//
}

void
GetOfferDTO::fromJson(char* jsonStr)
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *marketCategoryIdKey = "marketCategoryId";
	node = json_object_get_member(pJsonObject, marketCategoryIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&marketCategoryId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *categoryKey = "category";
	node = json_object_get_member(pJsonObject, categoryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&category, node, "std::string", "");
		} else {
			
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
	const gchar *videosKey = "videos";
	node = json_object_get_member(pJsonObject, videosKey);
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
			videos = new_list;
		}
		
	}
	const gchar *manualsKey = "manuals";
	node = json_object_get_member(pJsonObject, manualsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OfferManualDTO> new_list;
			OfferManualDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferManualDTO")) {
					jsonToValue(&inst, temp_json, "OfferManualDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			manuals = new_list;
		}
		
	}
	const gchar *vendorKey = "vendor";
	node = json_object_get_member(pJsonObject, vendorKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&vendor, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *barcodesKey = "barcodes";
	node = json_object_get_member(pJsonObject, barcodesKey);
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
			barcodes = new_list;
		}
		
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *manufacturerCountriesKey = "manufacturerCountries";
	node = json_object_get_member(pJsonObject, manufacturerCountriesKey);
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
			manufacturerCountries = new_list;
		}
		
	}
	const gchar *weightDimensionsKey = "weightDimensions";
	node = json_object_get_member(pJsonObject, weightDimensionsKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferWeightDimensionsDTO")) {
			jsonToValue(&weightDimensions, node, "OfferWeightDimensionsDTO", "OfferWeightDimensionsDTO");
		} else {
			
			OfferWeightDimensionsDTO* obj = static_cast<OfferWeightDimensionsDTO*> (&weightDimensions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *vendorCodeKey = "vendorCode";
	node = json_object_get_member(pJsonObject, vendorCodeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&vendorCode, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *tagsKey = "tags";
	node = json_object_get_member(pJsonObject, tagsKey);
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
			tags = new_list;
		}
		
	}
	const gchar *shelfLifeKey = "shelfLife";
	node = json_object_get_member(pJsonObject, shelfLifeKey);
	if (node !=NULL) {
	

		if (isprimitive("TimePeriodDTO")) {
			jsonToValue(&shelfLife, node, "TimePeriodDTO", "TimePeriodDTO");
		} else {
			
			TimePeriodDTO* obj = static_cast<TimePeriodDTO*> (&shelfLife);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *lifeTimeKey = "lifeTime";
	node = json_object_get_member(pJsonObject, lifeTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("TimePeriodDTO")) {
			jsonToValue(&lifeTime, node, "TimePeriodDTO", "TimePeriodDTO");
		} else {
			
			TimePeriodDTO* obj = static_cast<TimePeriodDTO*> (&lifeTime);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *guaranteePeriodKey = "guaranteePeriod";
	node = json_object_get_member(pJsonObject, guaranteePeriodKey);
	if (node !=NULL) {
	

		if (isprimitive("TimePeriodDTO")) {
			jsonToValue(&guaranteePeriod, node, "TimePeriodDTO", "TimePeriodDTO");
		} else {
			
			TimePeriodDTO* obj = static_cast<TimePeriodDTO*> (&guaranteePeriod);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *customsCommodityCodeKey = "customsCommodityCode";
	node = json_object_get_member(pJsonObject, customsCommodityCodeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&customsCommodityCode, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *certificatesKey = "certificates";
	node = json_object_get_member(pJsonObject, certificatesKey);
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
			certificates = new_list;
		}
		
	}
	const gchar *boxCountKey = "boxCount";
	node = json_object_get_member(pJsonObject, boxCountKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&boxCount, node, "int", "");
		} else {
			
		}
	}
	const gchar *conditionKey = "condition";
	node = json_object_get_member(pJsonObject, conditionKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferConditionDTO")) {
			jsonToValue(&condition, node, "OfferConditionDTO", "OfferConditionDTO");
		} else {
			
			OfferConditionDTO* obj = static_cast<OfferConditionDTO*> (&condition);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferType")) {
			jsonToValue(&type, node, "OfferType", "OfferType");
		} else {
			
			OfferType* obj = static_cast<OfferType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *downloadableKey = "downloadable";
	node = json_object_get_member(pJsonObject, downloadableKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&downloadable, node, "bool", "");
		} else {
			
		}
	}
	const gchar *adultKey = "adult";
	node = json_object_get_member(pJsonObject, adultKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&adult, node, "bool", "");
		} else {
			
		}
	}
	const gchar *ageKey = "age";
	node = json_object_get_member(pJsonObject, ageKey);
	if (node !=NULL) {
	

		if (isprimitive("AgeDTO")) {
			jsonToValue(&age, node, "AgeDTO", "AgeDTO");
		} else {
			
			AgeDTO* obj = static_cast<AgeDTO*> (&age);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *paramsKey = "params";
	node = json_object_get_member(pJsonObject, paramsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OfferParamDTO> new_list;
			OfferParamDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferParamDTO")) {
					jsonToValue(&inst, temp_json, "OfferParamDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			params = new_list;
		}
		
	}
	const gchar *basicPriceKey = "basicPrice";
	node = json_object_get_member(pJsonObject, basicPriceKey);
	if (node !=NULL) {
	

		if (isprimitive("GetPriceWithDiscountDTO")) {
			jsonToValue(&basicPrice, node, "GetPriceWithDiscountDTO", "GetPriceWithDiscountDTO");
		} else {
			
			GetPriceWithDiscountDTO* obj = static_cast<GetPriceWithDiscountDTO*> (&basicPrice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *purchasePriceKey = "purchasePrice";
	node = json_object_get_member(pJsonObject, purchasePriceKey);
	if (node !=NULL) {
	

		if (isprimitive("GetPriceDTO")) {
			jsonToValue(&purchasePrice, node, "GetPriceDTO", "GetPriceDTO");
		} else {
			
			GetPriceDTO* obj = static_cast<GetPriceDTO*> (&purchasePrice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *additionalExpensesKey = "additionalExpenses";
	node = json_object_get_member(pJsonObject, additionalExpensesKey);
	if (node !=NULL) {
	

		if (isprimitive("GetPriceDTO")) {
			jsonToValue(&additionalExpenses, node, "GetPriceDTO", "GetPriceDTO");
		} else {
			
			GetPriceDTO* obj = static_cast<GetPriceDTO*> (&additionalExpenses);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cofinancePriceKey = "cofinancePrice";
	node = json_object_get_member(pJsonObject, cofinancePriceKey);
	if (node !=NULL) {
	

		if (isprimitive("GetPriceDTO")) {
			jsonToValue(&cofinancePrice, node, "GetPriceDTO", "GetPriceDTO");
		} else {
			
			GetPriceDTO* obj = static_cast<GetPriceDTO*> (&cofinancePrice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cardStatusKey = "cardStatus";
	node = json_object_get_member(pJsonObject, cardStatusKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferCardStatusType")) {
			jsonToValue(&cardStatus, node, "OfferCardStatusType", "OfferCardStatusType");
		} else {
			
			OfferCardStatusType* obj = static_cast<OfferCardStatusType*> (&cardStatus);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *campaignsKey = "campaigns";
	node = json_object_get_member(pJsonObject, campaignsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OfferCampaignStatusDTO> new_list;
			OfferCampaignStatusDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferCampaignStatusDTO")) {
					jsonToValue(&inst, temp_json, "OfferCampaignStatusDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			campaigns = new_list;
		}
		
	}
	const gchar *sellingProgramsKey = "sellingPrograms";
	node = json_object_get_member(pJsonObject, sellingProgramsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OfferSellingProgramDTO> new_list;
			OfferSellingProgramDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferSellingProgramDTO")) {
					jsonToValue(&inst, temp_json, "OfferSellingProgramDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			sellingPrograms = new_list;
		}
		
	}
	const gchar *archivedKey = "archived";
	node = json_object_get_member(pJsonObject, archivedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&archived, node, "bool", "");
		} else {
			
		}
	}
}

GetOfferDTO::GetOfferDTO(char* json)
{
	this->fromJson(json);
}

char*
GetOfferDTO::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("long long")) {
		long long obj = getMarketCategoryId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *marketCategoryIdKey = "marketCategoryId";
	json_object_set_member(pJsonObject, marketCategoryIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCategory();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *categoryKey = "category";
	json_object_set_member(pJsonObject, categoryKey, node);
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
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getVideos());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getVideos());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *videosKey = "videos";
	json_object_set_member(pJsonObject, videosKey, node);
	if (isprimitive("OfferManualDTO")) {
		list<OfferManualDTO> new_list = static_cast<list <OfferManualDTO> > (getManuals());
		node = converttoJson(&new_list, "OfferManualDTO", "array");
	} else {
		node = json_node_alloc();
		list<OfferManualDTO> new_list = static_cast<list <OfferManualDTO> > (getManuals());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferManualDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferManualDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *manualsKey = "manuals";
	json_object_set_member(pJsonObject, manualsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVendor();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *vendorKey = "vendor";
	json_object_set_member(pJsonObject, vendorKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getBarcodes());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getBarcodes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *barcodesKey = "barcodes";
	json_object_set_member(pJsonObject, barcodesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getManufacturerCountries());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getManufacturerCountries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *manufacturerCountriesKey = "manufacturerCountries";
	json_object_set_member(pJsonObject, manufacturerCountriesKey, node);
	if (isprimitive("OfferWeightDimensionsDTO")) {
		OfferWeightDimensionsDTO obj = getWeightDimensions();
		node = converttoJson(&obj, "OfferWeightDimensionsDTO", "");
	}
	else {
		
		OfferWeightDimensionsDTO obj = static_cast<OfferWeightDimensionsDTO> (getWeightDimensions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *weightDimensionsKey = "weightDimensions";
	json_object_set_member(pJsonObject, weightDimensionsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVendorCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *vendorCodeKey = "vendorCode";
	json_object_set_member(pJsonObject, vendorCodeKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getTags());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getTags());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *tagsKey = "tags";
	json_object_set_member(pJsonObject, tagsKey, node);
	if (isprimitive("TimePeriodDTO")) {
		TimePeriodDTO obj = getShelfLife();
		node = converttoJson(&obj, "TimePeriodDTO", "");
	}
	else {
		
		TimePeriodDTO obj = static_cast<TimePeriodDTO> (getShelfLife());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *shelfLifeKey = "shelfLife";
	json_object_set_member(pJsonObject, shelfLifeKey, node);
	if (isprimitive("TimePeriodDTO")) {
		TimePeriodDTO obj = getLifeTime();
		node = converttoJson(&obj, "TimePeriodDTO", "");
	}
	else {
		
		TimePeriodDTO obj = static_cast<TimePeriodDTO> (getLifeTime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *lifeTimeKey = "lifeTime";
	json_object_set_member(pJsonObject, lifeTimeKey, node);
	if (isprimitive("TimePeriodDTO")) {
		TimePeriodDTO obj = getGuaranteePeriod();
		node = converttoJson(&obj, "TimePeriodDTO", "");
	}
	else {
		
		TimePeriodDTO obj = static_cast<TimePeriodDTO> (getGuaranteePeriod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *guaranteePeriodKey = "guaranteePeriod";
	json_object_set_member(pJsonObject, guaranteePeriodKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomsCommodityCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *customsCommodityCodeKey = "customsCommodityCode";
	json_object_set_member(pJsonObject, customsCommodityCodeKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCertificates());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCertificates());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *certificatesKey = "certificates";
	json_object_set_member(pJsonObject, certificatesKey, node);
	if (isprimitive("int")) {
		int obj = getBoxCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *boxCountKey = "boxCount";
	json_object_set_member(pJsonObject, boxCountKey, node);
	if (isprimitive("OfferConditionDTO")) {
		OfferConditionDTO obj = getCondition();
		node = converttoJson(&obj, "OfferConditionDTO", "");
	}
	else {
		
		OfferConditionDTO obj = static_cast<OfferConditionDTO> (getCondition());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *conditionKey = "condition";
	json_object_set_member(pJsonObject, conditionKey, node);
	if (isprimitive("OfferType")) {
		OfferType obj = getType();
		node = converttoJson(&obj, "OfferType", "");
	}
	else {
		
		OfferType obj = static_cast<OfferType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("bool")) {
		bool obj = getDownloadable();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *downloadableKey = "downloadable";
	json_object_set_member(pJsonObject, downloadableKey, node);
	if (isprimitive("bool")) {
		bool obj = getAdult();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *adultKey = "adult";
	json_object_set_member(pJsonObject, adultKey, node);
	if (isprimitive("AgeDTO")) {
		AgeDTO obj = getAge();
		node = converttoJson(&obj, "AgeDTO", "");
	}
	else {
		
		AgeDTO obj = static_cast<AgeDTO> (getAge());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ageKey = "age";
	json_object_set_member(pJsonObject, ageKey, node);
	if (isprimitive("OfferParamDTO")) {
		list<OfferParamDTO> new_list = static_cast<list <OfferParamDTO> > (getParams());
		node = converttoJson(&new_list, "OfferParamDTO", "array");
	} else {
		node = json_node_alloc();
		list<OfferParamDTO> new_list = static_cast<list <OfferParamDTO> > (getParams());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferParamDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferParamDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *paramsKey = "params";
	json_object_set_member(pJsonObject, paramsKey, node);
	if (isprimitive("GetPriceWithDiscountDTO")) {
		GetPriceWithDiscountDTO obj = getBasicPrice();
		node = converttoJson(&obj, "GetPriceWithDiscountDTO", "");
	}
	else {
		
		GetPriceWithDiscountDTO obj = static_cast<GetPriceWithDiscountDTO> (getBasicPrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *basicPriceKey = "basicPrice";
	json_object_set_member(pJsonObject, basicPriceKey, node);
	if (isprimitive("GetPriceDTO")) {
		GetPriceDTO obj = getPurchasePrice();
		node = converttoJson(&obj, "GetPriceDTO", "");
	}
	else {
		
		GetPriceDTO obj = static_cast<GetPriceDTO> (getPurchasePrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *purchasePriceKey = "purchasePrice";
	json_object_set_member(pJsonObject, purchasePriceKey, node);
	if (isprimitive("GetPriceDTO")) {
		GetPriceDTO obj = getAdditionalExpenses();
		node = converttoJson(&obj, "GetPriceDTO", "");
	}
	else {
		
		GetPriceDTO obj = static_cast<GetPriceDTO> (getAdditionalExpenses());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *additionalExpensesKey = "additionalExpenses";
	json_object_set_member(pJsonObject, additionalExpensesKey, node);
	if (isprimitive("GetPriceDTO")) {
		GetPriceDTO obj = getCofinancePrice();
		node = converttoJson(&obj, "GetPriceDTO", "");
	}
	else {
		
		GetPriceDTO obj = static_cast<GetPriceDTO> (getCofinancePrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cofinancePriceKey = "cofinancePrice";
	json_object_set_member(pJsonObject, cofinancePriceKey, node);
	if (isprimitive("OfferCardStatusType")) {
		OfferCardStatusType obj = getCardStatus();
		node = converttoJson(&obj, "OfferCardStatusType", "");
	}
	else {
		
		OfferCardStatusType obj = static_cast<OfferCardStatusType> (getCardStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cardStatusKey = "cardStatus";
	json_object_set_member(pJsonObject, cardStatusKey, node);
	if (isprimitive("OfferCampaignStatusDTO")) {
		list<OfferCampaignStatusDTO> new_list = static_cast<list <OfferCampaignStatusDTO> > (getCampaigns());
		node = converttoJson(&new_list, "OfferCampaignStatusDTO", "array");
	} else {
		node = json_node_alloc();
		list<OfferCampaignStatusDTO> new_list = static_cast<list <OfferCampaignStatusDTO> > (getCampaigns());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferCampaignStatusDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferCampaignStatusDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *campaignsKey = "campaigns";
	json_object_set_member(pJsonObject, campaignsKey, node);
	if (isprimitive("OfferSellingProgramDTO")) {
		list<OfferSellingProgramDTO> new_list = static_cast<list <OfferSellingProgramDTO> > (getSellingPrograms());
		node = converttoJson(&new_list, "OfferSellingProgramDTO", "array");
	} else {
		node = json_node_alloc();
		list<OfferSellingProgramDTO> new_list = static_cast<list <OfferSellingProgramDTO> > (getSellingPrograms());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferSellingProgramDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferSellingProgramDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *sellingProgramsKey = "sellingPrograms";
	json_object_set_member(pJsonObject, sellingProgramsKey, node);
	if (isprimitive("bool")) {
		bool obj = getArchived();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *archivedKey = "archived";
	json_object_set_member(pJsonObject, archivedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
GetOfferDTO::getOfferId()
{
	return offerId;
}

void
GetOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

std::string
GetOfferDTO::getName()
{
	return name;
}

void
GetOfferDTO::setName(std::string  name)
{
	this->name = name;
}

long long
GetOfferDTO::getMarketCategoryId()
{
	return marketCategoryId;
}

void
GetOfferDTO::setMarketCategoryId(long long  marketCategoryId)
{
	this->marketCategoryId = marketCategoryId;
}

std::string
GetOfferDTO::getCategory()
{
	return category;
}

void
GetOfferDTO::setCategory(std::string  category)
{
	this->category = category;
}

std::list<std::string>
GetOfferDTO::getPictures()
{
	return pictures;
}

void
GetOfferDTO::setPictures(std::list <std::string> pictures)
{
	this->pictures = pictures;
}

std::list<std::string>
GetOfferDTO::getVideos()
{
	return videos;
}

void
GetOfferDTO::setVideos(std::list <std::string> videos)
{
	this->videos = videos;
}

std::list<OfferManualDTO>
GetOfferDTO::getManuals()
{
	return manuals;
}

void
GetOfferDTO::setManuals(std::list <OfferManualDTO> manuals)
{
	this->manuals = manuals;
}

std::string
GetOfferDTO::getVendor()
{
	return vendor;
}

void
GetOfferDTO::setVendor(std::string  vendor)
{
	this->vendor = vendor;
}

std::list<std::string>
GetOfferDTO::getBarcodes()
{
	return barcodes;
}

void
GetOfferDTO::setBarcodes(std::list <std::string> barcodes)
{
	this->barcodes = barcodes;
}

std::string
GetOfferDTO::getDescription()
{
	return description;
}

void
GetOfferDTO::setDescription(std::string  description)
{
	this->description = description;
}

std::list<std::string>
GetOfferDTO::getManufacturerCountries()
{
	return manufacturerCountries;
}

void
GetOfferDTO::setManufacturerCountries(std::list <std::string> manufacturerCountries)
{
	this->manufacturerCountries = manufacturerCountries;
}

OfferWeightDimensionsDTO
GetOfferDTO::getWeightDimensions()
{
	return weightDimensions;
}

void
GetOfferDTO::setWeightDimensions(OfferWeightDimensionsDTO  weightDimensions)
{
	this->weightDimensions = weightDimensions;
}

std::string
GetOfferDTO::getVendorCode()
{
	return vendorCode;
}

void
GetOfferDTO::setVendorCode(std::string  vendorCode)
{
	this->vendorCode = vendorCode;
}

std::list<std::string>
GetOfferDTO::getTags()
{
	return tags;
}

void
GetOfferDTO::setTags(std::list <std::string> tags)
{
	this->tags = tags;
}

TimePeriodDTO
GetOfferDTO::getShelfLife()
{
	return shelfLife;
}

void
GetOfferDTO::setShelfLife(TimePeriodDTO  shelfLife)
{
	this->shelfLife = shelfLife;
}

TimePeriodDTO
GetOfferDTO::getLifeTime()
{
	return lifeTime;
}

void
GetOfferDTO::setLifeTime(TimePeriodDTO  lifeTime)
{
	this->lifeTime = lifeTime;
}

TimePeriodDTO
GetOfferDTO::getGuaranteePeriod()
{
	return guaranteePeriod;
}

void
GetOfferDTO::setGuaranteePeriod(TimePeriodDTO  guaranteePeriod)
{
	this->guaranteePeriod = guaranteePeriod;
}

std::string
GetOfferDTO::getCustomsCommodityCode()
{
	return customsCommodityCode;
}

void
GetOfferDTO::setCustomsCommodityCode(std::string  customsCommodityCode)
{
	this->customsCommodityCode = customsCommodityCode;
}

std::list<std::string>
GetOfferDTO::getCertificates()
{
	return certificates;
}

void
GetOfferDTO::setCertificates(std::list <std::string> certificates)
{
	this->certificates = certificates;
}

int
GetOfferDTO::getBoxCount()
{
	return boxCount;
}

void
GetOfferDTO::setBoxCount(int  boxCount)
{
	this->boxCount = boxCount;
}

OfferConditionDTO
GetOfferDTO::getCondition()
{
	return condition;
}

void
GetOfferDTO::setCondition(OfferConditionDTO  condition)
{
	this->condition = condition;
}

OfferType
GetOfferDTO::getType()
{
	return type;
}

void
GetOfferDTO::setType(OfferType  type)
{
	this->type = type;
}

bool
GetOfferDTO::getDownloadable()
{
	return downloadable;
}

void
GetOfferDTO::setDownloadable(bool  downloadable)
{
	this->downloadable = downloadable;
}

bool
GetOfferDTO::getAdult()
{
	return adult;
}

void
GetOfferDTO::setAdult(bool  adult)
{
	this->adult = adult;
}

AgeDTO
GetOfferDTO::getAge()
{
	return age;
}

void
GetOfferDTO::setAge(AgeDTO  age)
{
	this->age = age;
}

std::list<OfferParamDTO>
GetOfferDTO::getParams()
{
	return params;
}

void
GetOfferDTO::setParams(std::list <OfferParamDTO> params)
{
	this->params = params;
}

GetPriceWithDiscountDTO
GetOfferDTO::getBasicPrice()
{
	return basicPrice;
}

void
GetOfferDTO::setBasicPrice(GetPriceWithDiscountDTO  basicPrice)
{
	this->basicPrice = basicPrice;
}

GetPriceDTO
GetOfferDTO::getPurchasePrice()
{
	return purchasePrice;
}

void
GetOfferDTO::setPurchasePrice(GetPriceDTO  purchasePrice)
{
	this->purchasePrice = purchasePrice;
}

GetPriceDTO
GetOfferDTO::getAdditionalExpenses()
{
	return additionalExpenses;
}

void
GetOfferDTO::setAdditionalExpenses(GetPriceDTO  additionalExpenses)
{
	this->additionalExpenses = additionalExpenses;
}

GetPriceDTO
GetOfferDTO::getCofinancePrice()
{
	return cofinancePrice;
}

void
GetOfferDTO::setCofinancePrice(GetPriceDTO  cofinancePrice)
{
	this->cofinancePrice = cofinancePrice;
}

OfferCardStatusType
GetOfferDTO::getCardStatus()
{
	return cardStatus;
}

void
GetOfferDTO::setCardStatus(OfferCardStatusType  cardStatus)
{
	this->cardStatus = cardStatus;
}

std::list<OfferCampaignStatusDTO>
GetOfferDTO::getCampaigns()
{
	return campaigns;
}

void
GetOfferDTO::setCampaigns(std::list <OfferCampaignStatusDTO> campaigns)
{
	this->campaigns = campaigns;
}

std::list<OfferSellingProgramDTO>
GetOfferDTO::getSellingPrograms()
{
	return sellingPrograms;
}

void
GetOfferDTO::setSellingPrograms(std::list <OfferSellingProgramDTO> sellingPrograms)
{
	this->sellingPrograms = sellingPrograms;
}

bool
GetOfferDTO::getArchived()
{
	return archived;
}

void
GetOfferDTO::setArchived(bool  archived)
{
	this->archived = archived;
}


