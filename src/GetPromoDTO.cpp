#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetPromoDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetPromoDTO::GetPromoDTO()
{
	//__init();
}

GetPromoDTO::~GetPromoDTO()
{
	//__cleanup();
}

void
GetPromoDTO::__init()
{
	//id = std::string();
	//name = std::string();
	//period = new PromoPeriodDTO();
	//participating = bool(false);
	//assortmentInfo = new GetPromoAssortmentInfoDTO();
	//mechanicsInfo = new GetPromoMechanicsInfoDTO();
	//bestsellerInfo = new GetPromoBestsellerInfoDTO();
	//new std::list()std::list> channels;
	//constraints = new GetPromoConstraintsDTO();
}

void
GetPromoDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(period != NULL) {
	//
	//delete period;
	//period = NULL;
	//}
	//if(participating != NULL) {
	//
	//delete participating;
	//participating = NULL;
	//}
	//if(assortmentInfo != NULL) {
	//
	//delete assortmentInfo;
	//assortmentInfo = NULL;
	//}
	//if(mechanicsInfo != NULL) {
	//
	//delete mechanicsInfo;
	//mechanicsInfo = NULL;
	//}
	//if(bestsellerInfo != NULL) {
	//
	//delete bestsellerInfo;
	//bestsellerInfo = NULL;
	//}
	//if(channels != NULL) {
	//channels.RemoveAll(true);
	//delete channels;
	//channels = NULL;
	//}
	//if(constraints != NULL) {
	//
	//delete constraints;
	//constraints = NULL;
	//}
	//
}

void
GetPromoDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
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
	const gchar *periodKey = "period";
	node = json_object_get_member(pJsonObject, periodKey);
	if (node !=NULL) {
	

		if (isprimitive("PromoPeriodDTO")) {
			jsonToValue(&period, node, "PromoPeriodDTO", "PromoPeriodDTO");
		} else {
			
			PromoPeriodDTO* obj = static_cast<PromoPeriodDTO*> (&period);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *participatingKey = "participating";
	node = json_object_get_member(pJsonObject, participatingKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&participating, node, "bool", "");
		} else {
			
		}
	}
	const gchar *assortmentInfoKey = "assortmentInfo";
	node = json_object_get_member(pJsonObject, assortmentInfoKey);
	if (node !=NULL) {
	

		if (isprimitive("GetPromoAssortmentInfoDTO")) {
			jsonToValue(&assortmentInfo, node, "GetPromoAssortmentInfoDTO", "GetPromoAssortmentInfoDTO");
		} else {
			
			GetPromoAssortmentInfoDTO* obj = static_cast<GetPromoAssortmentInfoDTO*> (&assortmentInfo);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *mechanicsInfoKey = "mechanicsInfo";
	node = json_object_get_member(pJsonObject, mechanicsInfoKey);
	if (node !=NULL) {
	

		if (isprimitive("GetPromoMechanicsInfoDTO")) {
			jsonToValue(&mechanicsInfo, node, "GetPromoMechanicsInfoDTO", "GetPromoMechanicsInfoDTO");
		} else {
			
			GetPromoMechanicsInfoDTO* obj = static_cast<GetPromoMechanicsInfoDTO*> (&mechanicsInfo);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *bestsellerInfoKey = "bestsellerInfo";
	node = json_object_get_member(pJsonObject, bestsellerInfoKey);
	if (node !=NULL) {
	

		if (isprimitive("GetPromoBestsellerInfoDTO")) {
			jsonToValue(&bestsellerInfo, node, "GetPromoBestsellerInfoDTO", "GetPromoBestsellerInfoDTO");
		} else {
			
			GetPromoBestsellerInfoDTO* obj = static_cast<GetPromoBestsellerInfoDTO*> (&bestsellerInfo);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *channelsKey = "channels";
	node = json_object_get_member(pJsonObject, channelsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ChannelType> new_list;
			ChannelType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ChannelType")) {
					jsonToValue(&inst, temp_json, "ChannelType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			channels = new_list;
		}
		
	}
	const gchar *constraintsKey = "constraints";
	node = json_object_get_member(pJsonObject, constraintsKey);
	if (node !=NULL) {
	

		if (isprimitive("GetPromoConstraintsDTO")) {
			jsonToValue(&constraints, node, "GetPromoConstraintsDTO", "GetPromoConstraintsDTO");
		} else {
			
			GetPromoConstraintsDTO* obj = static_cast<GetPromoConstraintsDTO*> (&constraints);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetPromoDTO::GetPromoDTO(char* json)
{
	this->fromJson(json);
}

char*
GetPromoDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("PromoPeriodDTO")) {
		PromoPeriodDTO obj = getPeriod();
		node = converttoJson(&obj, "PromoPeriodDTO", "");
	}
	else {
		
		PromoPeriodDTO obj = static_cast<PromoPeriodDTO> (getPeriod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *periodKey = "period";
	json_object_set_member(pJsonObject, periodKey, node);
	if (isprimitive("bool")) {
		bool obj = getParticipating();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *participatingKey = "participating";
	json_object_set_member(pJsonObject, participatingKey, node);
	if (isprimitive("GetPromoAssortmentInfoDTO")) {
		GetPromoAssortmentInfoDTO obj = getAssortmentInfo();
		node = converttoJson(&obj, "GetPromoAssortmentInfoDTO", "");
	}
	else {
		
		GetPromoAssortmentInfoDTO obj = static_cast<GetPromoAssortmentInfoDTO> (getAssortmentInfo());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *assortmentInfoKey = "assortmentInfo";
	json_object_set_member(pJsonObject, assortmentInfoKey, node);
	if (isprimitive("GetPromoMechanicsInfoDTO")) {
		GetPromoMechanicsInfoDTO obj = getMechanicsInfo();
		node = converttoJson(&obj, "GetPromoMechanicsInfoDTO", "");
	}
	else {
		
		GetPromoMechanicsInfoDTO obj = static_cast<GetPromoMechanicsInfoDTO> (getMechanicsInfo());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mechanicsInfoKey = "mechanicsInfo";
	json_object_set_member(pJsonObject, mechanicsInfoKey, node);
	if (isprimitive("GetPromoBestsellerInfoDTO")) {
		GetPromoBestsellerInfoDTO obj = getBestsellerInfo();
		node = converttoJson(&obj, "GetPromoBestsellerInfoDTO", "");
	}
	else {
		
		GetPromoBestsellerInfoDTO obj = static_cast<GetPromoBestsellerInfoDTO> (getBestsellerInfo());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *bestsellerInfoKey = "bestsellerInfo";
	json_object_set_member(pJsonObject, bestsellerInfoKey, node);
	if (isprimitive("ChannelType")) {
		list<ChannelType> new_list = static_cast<list <ChannelType> > (getChannels());
		node = converttoJson(&new_list, "ChannelType", "array");
	} else {
		node = json_node_alloc();
		list<ChannelType> new_list = static_cast<list <ChannelType> > (getChannels());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ChannelType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ChannelType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *channelsKey = "channels";
	json_object_set_member(pJsonObject, channelsKey, node);
	if (isprimitive("GetPromoConstraintsDTO")) {
		GetPromoConstraintsDTO obj = getConstraints();
		node = converttoJson(&obj, "GetPromoConstraintsDTO", "");
	}
	else {
		
		GetPromoConstraintsDTO obj = static_cast<GetPromoConstraintsDTO> (getConstraints());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *constraintsKey = "constraints";
	json_object_set_member(pJsonObject, constraintsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
GetPromoDTO::getId()
{
	return id;
}

void
GetPromoDTO::setId(std::string  id)
{
	this->id = id;
}

std::string
GetPromoDTO::getName()
{
	return name;
}

void
GetPromoDTO::setName(std::string  name)
{
	this->name = name;
}

PromoPeriodDTO
GetPromoDTO::getPeriod()
{
	return period;
}

void
GetPromoDTO::setPeriod(PromoPeriodDTO  period)
{
	this->period = period;
}

bool
GetPromoDTO::getParticipating()
{
	return participating;
}

void
GetPromoDTO::setParticipating(bool  participating)
{
	this->participating = participating;
}

GetPromoAssortmentInfoDTO
GetPromoDTO::getAssortmentInfo()
{
	return assortmentInfo;
}

void
GetPromoDTO::setAssortmentInfo(GetPromoAssortmentInfoDTO  assortmentInfo)
{
	this->assortmentInfo = assortmentInfo;
}

GetPromoMechanicsInfoDTO
GetPromoDTO::getMechanicsInfo()
{
	return mechanicsInfo;
}

void
GetPromoDTO::setMechanicsInfo(GetPromoMechanicsInfoDTO  mechanicsInfo)
{
	this->mechanicsInfo = mechanicsInfo;
}

GetPromoBestsellerInfoDTO
GetPromoDTO::getBestsellerInfo()
{
	return bestsellerInfo;
}

void
GetPromoDTO::setBestsellerInfo(GetPromoBestsellerInfoDTO  bestsellerInfo)
{
	this->bestsellerInfo = bestsellerInfo;
}

std::list<ChannelType>
GetPromoDTO::getChannels()
{
	return channels;
}

void
GetPromoDTO::setChannels(std::list <ChannelType> channels)
{
	this->channels = channels;
}

GetPromoConstraintsDTO
GetPromoDTO::getConstraints()
{
	return constraints;
}

void
GetPromoDTO::setConstraints(GetPromoConstraintsDTO  constraints)
{
	this->constraints = constraints;
}


