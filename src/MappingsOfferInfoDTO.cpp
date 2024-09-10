#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MappingsOfferInfoDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MappingsOfferInfoDTO::MappingsOfferInfoDTO()
{
	//__init();
}

MappingsOfferInfoDTO::~MappingsOfferInfoDTO()
{
	//__cleanup();
}

void
MappingsOfferInfoDTO::__init()
{
	//name = std::string();
	//shopSku = std::string();
	//category = std::string();
	//vendor = std::string();
	//vendorCode = std::string();
	//description = std::string();
	//id = std::string();
	//feedId = long(0);
	//new std::list()std::list> barcodes;
	//new std::list()std::list> urls;
	//new std::list()std::list> pictures;
	//manufacturer = std::string();
	//new std::list()std::list> manufacturerCountries;
	//minShipment = int(0);
	//transportUnitSize = int(0);
	//quantumOfSupply = int(0);
	//deliveryDurationDays = int(0);
	//boxCount = int(0);
	//new std::list()std::list> customsCommodityCodes;
	//weightDimensions = new OfferWeightDimensionsDTO();
	//new std::list()std::list> supplyScheduleDays;
	//shelfLifeDays = int(0);
	//lifeTimeDays = int(0);
	//guaranteePeriodDays = int(0);
	//processingState = new OfferProcessingStateDTO();
	//availability = new OfferAvailabilityStatusType();
	//shelfLife = new TimePeriodDTO();
	//lifeTime = new TimePeriodDTO();
	//guaranteePeriod = new TimePeriodDTO();
	//certificate = std::string();
}

void
MappingsOfferInfoDTO::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(shopSku != NULL) {
	//
	//delete shopSku;
	//shopSku = NULL;
	//}
	//if(category != NULL) {
	//
	//delete category;
	//category = NULL;
	//}
	//if(vendor != NULL) {
	//
	//delete vendor;
	//vendor = NULL;
	//}
	//if(vendorCode != NULL) {
	//
	//delete vendorCode;
	//vendorCode = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(feedId != NULL) {
	//
	//delete feedId;
	//feedId = NULL;
	//}
	//if(barcodes != NULL) {
	//barcodes.RemoveAll(true);
	//delete barcodes;
	//barcodes = NULL;
	//}
	//if(urls != NULL) {
	//urls.RemoveAll(true);
	//delete urls;
	//urls = NULL;
	//}
	//if(pictures != NULL) {
	//pictures.RemoveAll(true);
	//delete pictures;
	//pictures = NULL;
	//}
	//if(manufacturer != NULL) {
	//
	//delete manufacturer;
	//manufacturer = NULL;
	//}
	//if(manufacturerCountries != NULL) {
	//manufacturerCountries.RemoveAll(true);
	//delete manufacturerCountries;
	//manufacturerCountries = NULL;
	//}
	//if(minShipment != NULL) {
	//
	//delete minShipment;
	//minShipment = NULL;
	//}
	//if(transportUnitSize != NULL) {
	//
	//delete transportUnitSize;
	//transportUnitSize = NULL;
	//}
	//if(quantumOfSupply != NULL) {
	//
	//delete quantumOfSupply;
	//quantumOfSupply = NULL;
	//}
	//if(deliveryDurationDays != NULL) {
	//
	//delete deliveryDurationDays;
	//deliveryDurationDays = NULL;
	//}
	//if(boxCount != NULL) {
	//
	//delete boxCount;
	//boxCount = NULL;
	//}
	//if(customsCommodityCodes != NULL) {
	//customsCommodityCodes.RemoveAll(true);
	//delete customsCommodityCodes;
	//customsCommodityCodes = NULL;
	//}
	//if(weightDimensions != NULL) {
	//
	//delete weightDimensions;
	//weightDimensions = NULL;
	//}
	//if(supplyScheduleDays != NULL) {
	//supplyScheduleDays.RemoveAll(true);
	//delete supplyScheduleDays;
	//supplyScheduleDays = NULL;
	//}
	//if(shelfLifeDays != NULL) {
	//
	//delete shelfLifeDays;
	//shelfLifeDays = NULL;
	//}
	//if(lifeTimeDays != NULL) {
	//
	//delete lifeTimeDays;
	//lifeTimeDays = NULL;
	//}
	//if(guaranteePeriodDays != NULL) {
	//
	//delete guaranteePeriodDays;
	//guaranteePeriodDays = NULL;
	//}
	//if(processingState != NULL) {
	//
	//delete processingState;
	//processingState = NULL;
	//}
	//if(availability != NULL) {
	//
	//delete availability;
	//availability = NULL;
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
	//if(certificate != NULL) {
	//
	//delete certificate;
	//certificate = NULL;
	//}
	//
}

void
MappingsOfferInfoDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
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
	const gchar *categoryKey = "category";
	node = json_object_get_member(pJsonObject, categoryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&category, node, "std::string", "");
		} else {
			
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
	const gchar *vendorCodeKey = "vendorCode";
	node = json_object_get_member(pJsonObject, vendorCodeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&vendorCode, node, "std::string", "");
		} else {
			
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *feedIdKey = "feedId";
	node = json_object_get_member(pJsonObject, feedIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&feedId, node, "long long", "");
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
	const gchar *urlsKey = "urls";
	node = json_object_get_member(pJsonObject, urlsKey);
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
			urls = new_list;
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
	const gchar *manufacturerKey = "manufacturer";
	node = json_object_get_member(pJsonObject, manufacturerKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&manufacturer, node, "std::string", "");
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
	const gchar *minShipmentKey = "minShipment";
	node = json_object_get_member(pJsonObject, minShipmentKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&minShipment, node, "int", "");
		} else {
			
		}
	}
	const gchar *transportUnitSizeKey = "transportUnitSize";
	node = json_object_get_member(pJsonObject, transportUnitSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&transportUnitSize, node, "int", "");
		} else {
			
		}
	}
	const gchar *quantumOfSupplyKey = "quantumOfSupply";
	node = json_object_get_member(pJsonObject, quantumOfSupplyKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&quantumOfSupply, node, "int", "");
		} else {
			
		}
	}
	const gchar *deliveryDurationDaysKey = "deliveryDurationDays";
	node = json_object_get_member(pJsonObject, deliveryDurationDaysKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&deliveryDurationDays, node, "int", "");
		} else {
			
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
	const gchar *customsCommodityCodesKey = "customsCommodityCodes";
	node = json_object_get_member(pJsonObject, customsCommodityCodesKey);
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
			customsCommodityCodes = new_list;
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
	const gchar *supplyScheduleDaysKey = "supplyScheduleDays";
	node = json_object_get_member(pJsonObject, supplyScheduleDaysKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<DayOfWeekType> new_list;
			DayOfWeekType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("DayOfWeekType")) {
					jsonToValue(&inst, temp_json, "DayOfWeekType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			supplyScheduleDays = new_list;
		}
		
	}
	const gchar *shelfLifeDaysKey = "shelfLifeDays";
	node = json_object_get_member(pJsonObject, shelfLifeDaysKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&shelfLifeDays, node, "int", "");
		} else {
			
		}
	}
	const gchar *lifeTimeDaysKey = "lifeTimeDays";
	node = json_object_get_member(pJsonObject, lifeTimeDaysKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&lifeTimeDays, node, "int", "");
		} else {
			
		}
	}
	const gchar *guaranteePeriodDaysKey = "guaranteePeriodDays";
	node = json_object_get_member(pJsonObject, guaranteePeriodDaysKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&guaranteePeriodDays, node, "int", "");
		} else {
			
		}
	}
	const gchar *processingStateKey = "processingState";
	node = json_object_get_member(pJsonObject, processingStateKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferProcessingStateDTO")) {
			jsonToValue(&processingState, node, "OfferProcessingStateDTO", "OfferProcessingStateDTO");
		} else {
			
			OfferProcessingStateDTO* obj = static_cast<OfferProcessingStateDTO*> (&processingState);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *availabilityKey = "availability";
	node = json_object_get_member(pJsonObject, availabilityKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferAvailabilityStatusType")) {
			jsonToValue(&availability, node, "OfferAvailabilityStatusType", "OfferAvailabilityStatusType");
		} else {
			
			OfferAvailabilityStatusType* obj = static_cast<OfferAvailabilityStatusType*> (&availability);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *certificateKey = "certificate";
	node = json_object_get_member(pJsonObject, certificateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&certificate, node, "std::string", "");
		} else {
			
		}
	}
}

MappingsOfferInfoDTO::MappingsOfferInfoDTO(char* json)
{
	this->fromJson(json);
}

char*
MappingsOfferInfoDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getShopSku();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *shopSkuKey = "shopSku";
	json_object_set_member(pJsonObject, shopSkuKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCategory();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *categoryKey = "category";
	json_object_set_member(pJsonObject, categoryKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVendor();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *vendorKey = "vendor";
	json_object_set_member(pJsonObject, vendorKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVendorCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *vendorCodeKey = "vendorCode";
	json_object_set_member(pJsonObject, vendorCodeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("long long")) {
		long long obj = getFeedId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *feedIdKey = "feedId";
	json_object_set_member(pJsonObject, feedIdKey, node);
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
		list<std::string> new_list = static_cast<list <std::string> > (getUrls());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getUrls());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *urlsKey = "urls";
	json_object_set_member(pJsonObject, urlsKey, node);
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
		std::string obj = getManufacturer();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *manufacturerKey = "manufacturer";
	json_object_set_member(pJsonObject, manufacturerKey, node);
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
	if (isprimitive("int")) {
		int obj = getMinShipment();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *minShipmentKey = "minShipment";
	json_object_set_member(pJsonObject, minShipmentKey, node);
	if (isprimitive("int")) {
		int obj = getTransportUnitSize();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *transportUnitSizeKey = "transportUnitSize";
	json_object_set_member(pJsonObject, transportUnitSizeKey, node);
	if (isprimitive("int")) {
		int obj = getQuantumOfSupply();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *quantumOfSupplyKey = "quantumOfSupply";
	json_object_set_member(pJsonObject, quantumOfSupplyKey, node);
	if (isprimitive("int")) {
		int obj = getDeliveryDurationDays();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *deliveryDurationDaysKey = "deliveryDurationDays";
	json_object_set_member(pJsonObject, deliveryDurationDaysKey, node);
	if (isprimitive("int")) {
		int obj = getBoxCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *boxCountKey = "boxCount";
	json_object_set_member(pJsonObject, boxCountKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCustomsCommodityCodes());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCustomsCommodityCodes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *customsCommodityCodesKey = "customsCommodityCodes";
	json_object_set_member(pJsonObject, customsCommodityCodesKey, node);
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
	if (isprimitive("DayOfWeekType")) {
		list<DayOfWeekType> new_list = static_cast<list <DayOfWeekType> > (getSupplyScheduleDays());
		node = converttoJson(&new_list, "DayOfWeekType", "array");
	} else {
		node = json_node_alloc();
		list<DayOfWeekType> new_list = static_cast<list <DayOfWeekType> > (getSupplyScheduleDays());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<DayOfWeekType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			DayOfWeekType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *supplyScheduleDaysKey = "supplyScheduleDays";
	json_object_set_member(pJsonObject, supplyScheduleDaysKey, node);
	if (isprimitive("int")) {
		int obj = getShelfLifeDays();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *shelfLifeDaysKey = "shelfLifeDays";
	json_object_set_member(pJsonObject, shelfLifeDaysKey, node);
	if (isprimitive("int")) {
		int obj = getLifeTimeDays();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *lifeTimeDaysKey = "lifeTimeDays";
	json_object_set_member(pJsonObject, lifeTimeDaysKey, node);
	if (isprimitive("int")) {
		int obj = getGuaranteePeriodDays();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *guaranteePeriodDaysKey = "guaranteePeriodDays";
	json_object_set_member(pJsonObject, guaranteePeriodDaysKey, node);
	if (isprimitive("OfferProcessingStateDTO")) {
		OfferProcessingStateDTO obj = getProcessingState();
		node = converttoJson(&obj, "OfferProcessingStateDTO", "");
	}
	else {
		
		OfferProcessingStateDTO obj = static_cast<OfferProcessingStateDTO> (getProcessingState());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *processingStateKey = "processingState";
	json_object_set_member(pJsonObject, processingStateKey, node);
	if (isprimitive("OfferAvailabilityStatusType")) {
		OfferAvailabilityStatusType obj = getAvailability();
		node = converttoJson(&obj, "OfferAvailabilityStatusType", "");
	}
	else {
		
		OfferAvailabilityStatusType obj = static_cast<OfferAvailabilityStatusType> (getAvailability());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *availabilityKey = "availability";
	json_object_set_member(pJsonObject, availabilityKey, node);
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
		std::string obj = getCertificate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *certificateKey = "certificate";
	json_object_set_member(pJsonObject, certificateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
MappingsOfferInfoDTO::getName()
{
	return name;
}

void
MappingsOfferInfoDTO::setName(std::string  name)
{
	this->name = name;
}

std::string
MappingsOfferInfoDTO::getShopSku()
{
	return shopSku;
}

void
MappingsOfferInfoDTO::setShopSku(std::string  shopSku)
{
	this->shopSku = shopSku;
}

std::string
MappingsOfferInfoDTO::getCategory()
{
	return category;
}

void
MappingsOfferInfoDTO::setCategory(std::string  category)
{
	this->category = category;
}

std::string
MappingsOfferInfoDTO::getVendor()
{
	return vendor;
}

void
MappingsOfferInfoDTO::setVendor(std::string  vendor)
{
	this->vendor = vendor;
}

std::string
MappingsOfferInfoDTO::getVendorCode()
{
	return vendorCode;
}

void
MappingsOfferInfoDTO::setVendorCode(std::string  vendorCode)
{
	this->vendorCode = vendorCode;
}

std::string
MappingsOfferInfoDTO::getDescription()
{
	return description;
}

void
MappingsOfferInfoDTO::setDescription(std::string  description)
{
	this->description = description;
}

std::string
MappingsOfferInfoDTO::getId()
{
	return id;
}

void
MappingsOfferInfoDTO::setId(std::string  id)
{
	this->id = id;
}

long long
MappingsOfferInfoDTO::getFeedId()
{
	return feedId;
}

void
MappingsOfferInfoDTO::setFeedId(long long  feedId)
{
	this->feedId = feedId;
}

std::list<std::string>
MappingsOfferInfoDTO::getBarcodes()
{
	return barcodes;
}

void
MappingsOfferInfoDTO::setBarcodes(std::list <std::string> barcodes)
{
	this->barcodes = barcodes;
}

std::list<std::string>
MappingsOfferInfoDTO::getUrls()
{
	return urls;
}

void
MappingsOfferInfoDTO::setUrls(std::list <std::string> urls)
{
	this->urls = urls;
}

std::list<std::string>
MappingsOfferInfoDTO::getPictures()
{
	return pictures;
}

void
MappingsOfferInfoDTO::setPictures(std::list <std::string> pictures)
{
	this->pictures = pictures;
}

std::string
MappingsOfferInfoDTO::getManufacturer()
{
	return manufacturer;
}

void
MappingsOfferInfoDTO::setManufacturer(std::string  manufacturer)
{
	this->manufacturer = manufacturer;
}

std::list<std::string>
MappingsOfferInfoDTO::getManufacturerCountries()
{
	return manufacturerCountries;
}

void
MappingsOfferInfoDTO::setManufacturerCountries(std::list <std::string> manufacturerCountries)
{
	this->manufacturerCountries = manufacturerCountries;
}

int
MappingsOfferInfoDTO::getMinShipment()
{
	return minShipment;
}

void
MappingsOfferInfoDTO::setMinShipment(int  minShipment)
{
	this->minShipment = minShipment;
}

int
MappingsOfferInfoDTO::getTransportUnitSize()
{
	return transportUnitSize;
}

void
MappingsOfferInfoDTO::setTransportUnitSize(int  transportUnitSize)
{
	this->transportUnitSize = transportUnitSize;
}

int
MappingsOfferInfoDTO::getQuantumOfSupply()
{
	return quantumOfSupply;
}

void
MappingsOfferInfoDTO::setQuantumOfSupply(int  quantumOfSupply)
{
	this->quantumOfSupply = quantumOfSupply;
}

int
MappingsOfferInfoDTO::getDeliveryDurationDays()
{
	return deliveryDurationDays;
}

void
MappingsOfferInfoDTO::setDeliveryDurationDays(int  deliveryDurationDays)
{
	this->deliveryDurationDays = deliveryDurationDays;
}

int
MappingsOfferInfoDTO::getBoxCount()
{
	return boxCount;
}

void
MappingsOfferInfoDTO::setBoxCount(int  boxCount)
{
	this->boxCount = boxCount;
}

std::list<std::string>
MappingsOfferInfoDTO::getCustomsCommodityCodes()
{
	return customsCommodityCodes;
}

void
MappingsOfferInfoDTO::setCustomsCommodityCodes(std::list <std::string> customsCommodityCodes)
{
	this->customsCommodityCodes = customsCommodityCodes;
}

OfferWeightDimensionsDTO
MappingsOfferInfoDTO::getWeightDimensions()
{
	return weightDimensions;
}

void
MappingsOfferInfoDTO::setWeightDimensions(OfferWeightDimensionsDTO  weightDimensions)
{
	this->weightDimensions = weightDimensions;
}

std::list<DayOfWeekType>
MappingsOfferInfoDTO::getSupplyScheduleDays()
{
	return supplyScheduleDays;
}

void
MappingsOfferInfoDTO::setSupplyScheduleDays(std::list <DayOfWeekType> supplyScheduleDays)
{
	this->supplyScheduleDays = supplyScheduleDays;
}

int
MappingsOfferInfoDTO::getShelfLifeDays()
{
	return shelfLifeDays;
}

void
MappingsOfferInfoDTO::setShelfLifeDays(int  shelfLifeDays)
{
	this->shelfLifeDays = shelfLifeDays;
}

int
MappingsOfferInfoDTO::getLifeTimeDays()
{
	return lifeTimeDays;
}

void
MappingsOfferInfoDTO::setLifeTimeDays(int  lifeTimeDays)
{
	this->lifeTimeDays = lifeTimeDays;
}

int
MappingsOfferInfoDTO::getGuaranteePeriodDays()
{
	return guaranteePeriodDays;
}

void
MappingsOfferInfoDTO::setGuaranteePeriodDays(int  guaranteePeriodDays)
{
	this->guaranteePeriodDays = guaranteePeriodDays;
}

OfferProcessingStateDTO
MappingsOfferInfoDTO::getProcessingState()
{
	return processingState;
}

void
MappingsOfferInfoDTO::setProcessingState(OfferProcessingStateDTO  processingState)
{
	this->processingState = processingState;
}

OfferAvailabilityStatusType
MappingsOfferInfoDTO::getAvailability()
{
	return availability;
}

void
MappingsOfferInfoDTO::setAvailability(OfferAvailabilityStatusType  availability)
{
	this->availability = availability;
}

TimePeriodDTO
MappingsOfferInfoDTO::getShelfLife()
{
	return shelfLife;
}

void
MappingsOfferInfoDTO::setShelfLife(TimePeriodDTO  shelfLife)
{
	this->shelfLife = shelfLife;
}

TimePeriodDTO
MappingsOfferInfoDTO::getLifeTime()
{
	return lifeTime;
}

void
MappingsOfferInfoDTO::setLifeTime(TimePeriodDTO  lifeTime)
{
	this->lifeTime = lifeTime;
}

TimePeriodDTO
MappingsOfferInfoDTO::getGuaranteePeriod()
{
	return guaranteePeriod;
}

void
MappingsOfferInfoDTO::setGuaranteePeriod(TimePeriodDTO  guaranteePeriod)
{
	this->guaranteePeriod = guaranteePeriod;
}

std::string
MappingsOfferInfoDTO::getCertificate()
{
	return certificate;
}

void
MappingsOfferInfoDTO::setCertificate(std::string  certificate)
{
	this->certificate = certificate;
}


