#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OutletDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OutletDTO::OutletDTO()
{
	//__init();
}

OutletDTO::~OutletDTO()
{
	//__cleanup();
}

void
OutletDTO::__init()
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
}

void
OutletDTO::__cleanup()
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
	//
}

void
OutletDTO::fromJson(char* jsonStr)
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
}

OutletDTO::OutletDTO(char* json)
{
	this->fromJson(json);
}

char*
OutletDTO::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OutletDTO::getName()
{
	return name;
}

void
OutletDTO::setName(std::string  name)
{
	this->name = name;
}

OutletType
OutletDTO::getType()
{
	return type;
}

void
OutletDTO::setType(OutletType  type)
{
	this->type = type;
}

std::string
OutletDTO::getCoords()
{
	return coords;
}

void
OutletDTO::setCoords(std::string  coords)
{
	this->coords = coords;
}

bool
OutletDTO::getIsMain()
{
	return isMain;
}

void
OutletDTO::setIsMain(bool  isMain)
{
	this->isMain = isMain;
}

std::string
OutletDTO::getShopOutletCode()
{
	return shopOutletCode;
}

void
OutletDTO::setShopOutletCode(std::string  shopOutletCode)
{
	this->shopOutletCode = shopOutletCode;
}

OutletVisibilityType
OutletDTO::getVisibility()
{
	return visibility;
}

void
OutletDTO::setVisibility(OutletVisibilityType  visibility)
{
	this->visibility = visibility;
}

OutletAddressDTO
OutletDTO::getAddress()
{
	return address;
}

void
OutletDTO::setAddress(OutletAddressDTO  address)
{
	this->address = address;
}

std::list<std::string>
OutletDTO::getPhones()
{
	return phones;
}

void
OutletDTO::setPhones(std::list <std::string> phones)
{
	this->phones = phones;
}

OutletWorkingScheduleDTO
OutletDTO::getWorkingSchedule()
{
	return workingSchedule;
}

void
OutletDTO::setWorkingSchedule(OutletWorkingScheduleDTO  workingSchedule)
{
	this->workingSchedule = workingSchedule;
}

std::list<OutletDeliveryRuleDTO>
OutletDTO::getDeliveryRules()
{
	return deliveryRules;
}

void
OutletDTO::setDeliveryRules(std::list <OutletDeliveryRuleDTO> deliveryRules)
{
	this->deliveryRules = deliveryRules;
}

long long
OutletDTO::getStoragePeriod()
{
	return storagePeriod;
}

void
OutletDTO::setStoragePeriod(long long  storagePeriod)
{
	this->storagePeriod = storagePeriod;
}


