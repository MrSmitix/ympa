#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BaseOfferDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BaseOfferDTO::BaseOfferDTO()
{
	//__init();
}

BaseOfferDTO::~BaseOfferDTO()
{
	//__cleanup();
}

void
BaseOfferDTO::__init()
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
}

void
BaseOfferDTO::__cleanup()
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
	//
}

void
BaseOfferDTO::fromJson(char* jsonStr)
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
}

BaseOfferDTO::BaseOfferDTO(char* json)
{
	this->fromJson(json);
}

char*
BaseOfferDTO::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
BaseOfferDTO::getOfferId()
{
	return offerId;
}

void
BaseOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

std::string
BaseOfferDTO::getName()
{
	return name;
}

void
BaseOfferDTO::setName(std::string  name)
{
	this->name = name;
}

long long
BaseOfferDTO::getMarketCategoryId()
{
	return marketCategoryId;
}

void
BaseOfferDTO::setMarketCategoryId(long long  marketCategoryId)
{
	this->marketCategoryId = marketCategoryId;
}

std::string
BaseOfferDTO::getCategory()
{
	return category;
}

void
BaseOfferDTO::setCategory(std::string  category)
{
	this->category = category;
}

std::list<std::string>
BaseOfferDTO::getPictures()
{
	return pictures;
}

void
BaseOfferDTO::setPictures(std::list <std::string> pictures)
{
	this->pictures = pictures;
}

std::list<std::string>
BaseOfferDTO::getVideos()
{
	return videos;
}

void
BaseOfferDTO::setVideos(std::list <std::string> videos)
{
	this->videos = videos;
}

std::list<OfferManualDTO>
BaseOfferDTO::getManuals()
{
	return manuals;
}

void
BaseOfferDTO::setManuals(std::list <OfferManualDTO> manuals)
{
	this->manuals = manuals;
}

std::string
BaseOfferDTO::getVendor()
{
	return vendor;
}

void
BaseOfferDTO::setVendor(std::string  vendor)
{
	this->vendor = vendor;
}

std::list<std::string>
BaseOfferDTO::getBarcodes()
{
	return barcodes;
}

void
BaseOfferDTO::setBarcodes(std::list <std::string> barcodes)
{
	this->barcodes = barcodes;
}

std::string
BaseOfferDTO::getDescription()
{
	return description;
}

void
BaseOfferDTO::setDescription(std::string  description)
{
	this->description = description;
}

std::list<std::string>
BaseOfferDTO::getManufacturerCountries()
{
	return manufacturerCountries;
}

void
BaseOfferDTO::setManufacturerCountries(std::list <std::string> manufacturerCountries)
{
	this->manufacturerCountries = manufacturerCountries;
}

OfferWeightDimensionsDTO
BaseOfferDTO::getWeightDimensions()
{
	return weightDimensions;
}

void
BaseOfferDTO::setWeightDimensions(OfferWeightDimensionsDTO  weightDimensions)
{
	this->weightDimensions = weightDimensions;
}

std::string
BaseOfferDTO::getVendorCode()
{
	return vendorCode;
}

void
BaseOfferDTO::setVendorCode(std::string  vendorCode)
{
	this->vendorCode = vendorCode;
}

std::list<std::string>
BaseOfferDTO::getTags()
{
	return tags;
}

void
BaseOfferDTO::setTags(std::list <std::string> tags)
{
	this->tags = tags;
}

TimePeriodDTO
BaseOfferDTO::getShelfLife()
{
	return shelfLife;
}

void
BaseOfferDTO::setShelfLife(TimePeriodDTO  shelfLife)
{
	this->shelfLife = shelfLife;
}

TimePeriodDTO
BaseOfferDTO::getLifeTime()
{
	return lifeTime;
}

void
BaseOfferDTO::setLifeTime(TimePeriodDTO  lifeTime)
{
	this->lifeTime = lifeTime;
}

TimePeriodDTO
BaseOfferDTO::getGuaranteePeriod()
{
	return guaranteePeriod;
}

void
BaseOfferDTO::setGuaranteePeriod(TimePeriodDTO  guaranteePeriod)
{
	this->guaranteePeriod = guaranteePeriod;
}

std::string
BaseOfferDTO::getCustomsCommodityCode()
{
	return customsCommodityCode;
}

void
BaseOfferDTO::setCustomsCommodityCode(std::string  customsCommodityCode)
{
	this->customsCommodityCode = customsCommodityCode;
}

std::list<std::string>
BaseOfferDTO::getCertificates()
{
	return certificates;
}

void
BaseOfferDTO::setCertificates(std::list <std::string> certificates)
{
	this->certificates = certificates;
}

int
BaseOfferDTO::getBoxCount()
{
	return boxCount;
}

void
BaseOfferDTO::setBoxCount(int  boxCount)
{
	this->boxCount = boxCount;
}

OfferConditionDTO
BaseOfferDTO::getCondition()
{
	return condition;
}

void
BaseOfferDTO::setCondition(OfferConditionDTO  condition)
{
	this->condition = condition;
}

OfferType
BaseOfferDTO::getType()
{
	return type;
}

void
BaseOfferDTO::setType(OfferType  type)
{
	this->type = type;
}

bool
BaseOfferDTO::getDownloadable()
{
	return downloadable;
}

void
BaseOfferDTO::setDownloadable(bool  downloadable)
{
	this->downloadable = downloadable;
}

bool
BaseOfferDTO::getAdult()
{
	return adult;
}

void
BaseOfferDTO::setAdult(bool  adult)
{
	this->adult = adult;
}

AgeDTO
BaseOfferDTO::getAge()
{
	return age;
}

void
BaseOfferDTO::setAge(AgeDTO  age)
{
	this->age = age;
}

std::list<OfferParamDTO>
BaseOfferDTO::getParams()
{
	return params;
}

void
BaseOfferDTO::setParams(std::list <OfferParamDTO> params)
{
	this->params = params;
}


