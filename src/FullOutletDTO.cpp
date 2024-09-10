#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FullOutletDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FullOutletDTO::FullOutletDTO()
{
	//__init();
}

FullOutletDTO::~FullOutletDTO()
{
	//__cleanup();
}

void
FullOutletDTO::__init()
{
	//name = std::string();
	//type = new OutletType();
	//coords = std::string();
	//isMain = bool(false);
	//shopOutletCode = std::string();
	//visibility = new OutletVisibilityType();
	//address = new OutletAddressDTO();
	//new std::list()std::list> phones;
	//workingSchedule = new OutletWorkingScheduleDTO();
	//new std::list()std::list> deliveryRules;
	//storagePeriod = long(0);
	//id = long(0);
	//status = new OutletStatusType();
	//region = new RegionDTO();
	//shopOutletId = std::string();
	//workingTime = std::string();
	//moderationReason = std::string();
}

void
FullOutletDTO::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(coords != NULL) {
	//
	//delete coords;
	//coords = NULL;
	//}
	//if(isMain != NULL) {
	//
	//delete isMain;
	//isMain = NULL;
	//}
	//if(shopOutletCode != NULL) {
	//
	//delete shopOutletCode;
	//shopOutletCode = NULL;
	//}
	//if(visibility != NULL) {
	//
	//delete visibility;
	//visibility = NULL;
	//}
	//if(address != NULL) {
	//
	//delete address;
	//address = NULL;
	//}
	//if(phones != NULL) {
	//phones.RemoveAll(true);
	//delete phones;
	//phones = NULL;
	//}
	//if(workingSchedule != NULL) {
	//
	//delete workingSchedule;
	//workingSchedule = NULL;
	//}
	//if(deliveryRules != NULL) {
	//deliveryRules.RemoveAll(true);
	//delete deliveryRules;
	//deliveryRules = NULL;
	//}
	//if(storagePeriod != NULL) {
	//
	//delete storagePeriod;
	//storagePeriod = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(region != NULL) {
	//
	//delete region;
	//region = NULL;
	//}
	//if(shopOutletId != NULL) {
	//
	//delete shopOutletId;
	//shopOutletId = NULL;
	//}
	//if(workingTime != NULL) {
	//
	//delete workingTime;
	//workingTime = NULL;
	//}
	//if(moderationReason != NULL) {
	//
	//delete moderationReason;
	//moderationReason = NULL;
	//}
	//
}

void
FullOutletDTO::fromJson(char* jsonStr)
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
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("OutletType")) {
			jsonToValue(&type, node, "OutletType", "OutletType");
		} else {
			
			OutletType* obj = static_cast<OutletType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *coordsKey = "coords";
	node = json_object_get_member(pJsonObject, coordsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&coords, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *isMainKey = "isMain";
	node = json_object_get_member(pJsonObject, isMainKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&isMain, node, "bool", "");
		} else {
			
		}
	}
	const gchar *shopOutletCodeKey = "shopOutletCode";
	node = json_object_get_member(pJsonObject, shopOutletCodeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&shopOutletCode, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *visibilityKey = "visibility";
	node = json_object_get_member(pJsonObject, visibilityKey);
	if (node !=NULL) {
	

		if (isprimitive("OutletVisibilityType")) {
			jsonToValue(&visibility, node, "OutletVisibilityType", "OutletVisibilityType");
		} else {
			
			OutletVisibilityType* obj = static_cast<OutletVisibilityType*> (&visibility);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *addressKey = "address";
	node = json_object_get_member(pJsonObject, addressKey);
	if (node !=NULL) {
	

		if (isprimitive("OutletAddressDTO")) {
			jsonToValue(&address, node, "OutletAddressDTO", "OutletAddressDTO");
		} else {
			
			OutletAddressDTO* obj = static_cast<OutletAddressDTO*> (&address);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *phonesKey = "phones";
	node = json_object_get_member(pJsonObject, phonesKey);
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
			phones = new_list;
		}
		
	}
	const gchar *workingScheduleKey = "workingSchedule";
	node = json_object_get_member(pJsonObject, workingScheduleKey);
	if (node !=NULL) {
	

		if (isprimitive("OutletWorkingScheduleDTO")) {
			jsonToValue(&workingSchedule, node, "OutletWorkingScheduleDTO", "OutletWorkingScheduleDTO");
		} else {
			
			OutletWorkingScheduleDTO* obj = static_cast<OutletWorkingScheduleDTO*> (&workingSchedule);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *deliveryRulesKey = "deliveryRules";
	node = json_object_get_member(pJsonObject, deliveryRulesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OutletDeliveryRuleDTO> new_list;
			OutletDeliveryRuleDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OutletDeliveryRuleDTO")) {
					jsonToValue(&inst, temp_json, "OutletDeliveryRuleDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			deliveryRules = new_list;
		}
		
	}
	const gchar *storagePeriodKey = "storagePeriod";
	node = json_object_get_member(pJsonObject, storagePeriodKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&storagePeriod, node, "long long", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("OutletStatusType")) {
			jsonToValue(&status, node, "OutletStatusType", "OutletStatusType");
		} else {
			
			OutletStatusType* obj = static_cast<OutletStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *regionKey = "region";
	node = json_object_get_member(pJsonObject, regionKey);
	if (node !=NULL) {
	

		if (isprimitive("RegionDTO")) {
			jsonToValue(&region, node, "RegionDTO", "RegionDTO");
		} else {
			
			RegionDTO* obj = static_cast<RegionDTO*> (&region);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *shopOutletIdKey = "shopOutletId";
	node = json_object_get_member(pJsonObject, shopOutletIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&shopOutletId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *workingTimeKey = "workingTime";
	node = json_object_get_member(pJsonObject, workingTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&workingTime, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *moderationReasonKey = "moderationReason";
	node = json_object_get_member(pJsonObject, moderationReasonKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&moderationReason, node, "std::string", "");
		} else {
			
		}
	}
}

FullOutletDTO::FullOutletDTO(char* json)
{
	this->fromJson(json);
}

char*
FullOutletDTO::toJson()
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
	if (isprimitive("OutletType")) {
		OutletType obj = getType();
		node = converttoJson(&obj, "OutletType", "");
	}
	else {
		
		OutletType obj = static_cast<OutletType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCoords();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *coordsKey = "coords";
	json_object_set_member(pJsonObject, coordsKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsMain();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *isMainKey = "isMain";
	json_object_set_member(pJsonObject, isMainKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getShopOutletCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *shopOutletCodeKey = "shopOutletCode";
	json_object_set_member(pJsonObject, shopOutletCodeKey, node);
	if (isprimitive("OutletVisibilityType")) {
		OutletVisibilityType obj = getVisibility();
		node = converttoJson(&obj, "OutletVisibilityType", "");
	}
	else {
		
		OutletVisibilityType obj = static_cast<OutletVisibilityType> (getVisibility());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *visibilityKey = "visibility";
	json_object_set_member(pJsonObject, visibilityKey, node);
	if (isprimitive("OutletAddressDTO")) {
		OutletAddressDTO obj = getAddress();
		node = converttoJson(&obj, "OutletAddressDTO", "");
	}
	else {
		
		OutletAddressDTO obj = static_cast<OutletAddressDTO> (getAddress());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *addressKey = "address";
	json_object_set_member(pJsonObject, addressKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getPhones());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getPhones());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *phonesKey = "phones";
	json_object_set_member(pJsonObject, phonesKey, node);
	if (isprimitive("OutletWorkingScheduleDTO")) {
		OutletWorkingScheduleDTO obj = getWorkingSchedule();
		node = converttoJson(&obj, "OutletWorkingScheduleDTO", "");
	}
	else {
		
		OutletWorkingScheduleDTO obj = static_cast<OutletWorkingScheduleDTO> (getWorkingSchedule());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *workingScheduleKey = "workingSchedule";
	json_object_set_member(pJsonObject, workingScheduleKey, node);
	if (isprimitive("OutletDeliveryRuleDTO")) {
		list<OutletDeliveryRuleDTO> new_list = static_cast<list <OutletDeliveryRuleDTO> > (getDeliveryRules());
		node = converttoJson(&new_list, "OutletDeliveryRuleDTO", "array");
	} else {
		node = json_node_alloc();
		list<OutletDeliveryRuleDTO> new_list = static_cast<list <OutletDeliveryRuleDTO> > (getDeliveryRules());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OutletDeliveryRuleDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OutletDeliveryRuleDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *deliveryRulesKey = "deliveryRules";
	json_object_set_member(pJsonObject, deliveryRulesKey, node);
	if (isprimitive("long long")) {
		long long obj = getStoragePeriod();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *storagePeriodKey = "storagePeriod";
	json_object_set_member(pJsonObject, storagePeriodKey, node);
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("OutletStatusType")) {
		OutletStatusType obj = getStatus();
		node = converttoJson(&obj, "OutletStatusType", "");
	}
	else {
		
		OutletStatusType obj = static_cast<OutletStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("RegionDTO")) {
		RegionDTO obj = getRegion();
		node = converttoJson(&obj, "RegionDTO", "");
	}
	else {
		
		RegionDTO obj = static_cast<RegionDTO> (getRegion());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *regionKey = "region";
	json_object_set_member(pJsonObject, regionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getShopOutletId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *shopOutletIdKey = "shopOutletId";
	json_object_set_member(pJsonObject, shopOutletIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getWorkingTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *workingTimeKey = "workingTime";
	json_object_set_member(pJsonObject, workingTimeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getModerationReason();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *moderationReasonKey = "moderationReason";
	json_object_set_member(pJsonObject, moderationReasonKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
FullOutletDTO::getName()
{
	return name;
}

void
FullOutletDTO::setName(std::string  name)
{
	this->name = name;
}

OutletType
FullOutletDTO::getType()
{
	return type;
}

void
FullOutletDTO::setType(OutletType  type)
{
	this->type = type;
}

std::string
FullOutletDTO::getCoords()
{
	return coords;
}

void
FullOutletDTO::setCoords(std::string  coords)
{
	this->coords = coords;
}

bool
FullOutletDTO::getIsMain()
{
	return isMain;
}

void
FullOutletDTO::setIsMain(bool  isMain)
{
	this->isMain = isMain;
}

std::string
FullOutletDTO::getShopOutletCode()
{
	return shopOutletCode;
}

void
FullOutletDTO::setShopOutletCode(std::string  shopOutletCode)
{
	this->shopOutletCode = shopOutletCode;
}

OutletVisibilityType
FullOutletDTO::getVisibility()
{
	return visibility;
}

void
FullOutletDTO::setVisibility(OutletVisibilityType  visibility)
{
	this->visibility = visibility;
}

OutletAddressDTO
FullOutletDTO::getAddress()
{
	return address;
}

void
FullOutletDTO::setAddress(OutletAddressDTO  address)
{
	this->address = address;
}

std::list<std::string>
FullOutletDTO::getPhones()
{
	return phones;
}

void
FullOutletDTO::setPhones(std::list <std::string> phones)
{
	this->phones = phones;
}

OutletWorkingScheduleDTO
FullOutletDTO::getWorkingSchedule()
{
	return workingSchedule;
}

void
FullOutletDTO::setWorkingSchedule(OutletWorkingScheduleDTO  workingSchedule)
{
	this->workingSchedule = workingSchedule;
}

std::list<OutletDeliveryRuleDTO>
FullOutletDTO::getDeliveryRules()
{
	return deliveryRules;
}

void
FullOutletDTO::setDeliveryRules(std::list <OutletDeliveryRuleDTO> deliveryRules)
{
	this->deliveryRules = deliveryRules;
}

long long
FullOutletDTO::getStoragePeriod()
{
	return storagePeriod;
}

void
FullOutletDTO::setStoragePeriod(long long  storagePeriod)
{
	this->storagePeriod = storagePeriod;
}

long long
FullOutletDTO::getId()
{
	return id;
}

void
FullOutletDTO::setId(long long  id)
{
	this->id = id;
}

OutletStatusType
FullOutletDTO::getStatus()
{
	return status;
}

void
FullOutletDTO::setStatus(OutletStatusType  status)
{
	this->status = status;
}

RegionDTO
FullOutletDTO::getRegion()
{
	return region;
}

void
FullOutletDTO::setRegion(RegionDTO  region)
{
	this->region = region;
}

std::string
FullOutletDTO::getShopOutletId()
{
	return shopOutletId;
}

void
FullOutletDTO::setShopOutletId(std::string  shopOutletId)
{
	this->shopOutletId = shopOutletId;
}

std::string
FullOutletDTO::getWorkingTime()
{
	return workingTime;
}

void
FullOutletDTO::setWorkingTime(std::string  workingTime)
{
	this->workingTime = workingTime;
}

std::string
FullOutletDTO::getModerationReason()
{
	return moderationReason;
}

void
FullOutletDTO::setModerationReason(std::string  moderationReason)
{
	this->moderationReason = moderationReason;
}


