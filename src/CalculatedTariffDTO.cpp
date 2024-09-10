#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CalculatedTariffDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CalculatedTariffDTO::CalculatedTariffDTO()
{
	//__init();
}

CalculatedTariffDTO::~CalculatedTariffDTO()
{
	//__cleanup();
}

void
CalculatedTariffDTO::__init()
{
	//type = new CalculatedTariffType();
	//amount = double(0);
	//new std::list()std::list> parameters;
}

void
CalculatedTariffDTO::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(amount != NULL) {
	//
	//delete amount;
	//amount = NULL;
	//}
	//if(parameters != NULL) {
	//parameters.RemoveAll(true);
	//delete parameters;
	//parameters = NULL;
	//}
	//
}

void
CalculatedTariffDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("CalculatedTariffType")) {
			jsonToValue(&type, node, "CalculatedTariffType", "CalculatedTariffType");
		} else {
			
			CalculatedTariffType* obj = static_cast<CalculatedTariffType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *amountKey = "amount";
	node = json_object_get_member(pJsonObject, amountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&amount, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&amount);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *parametersKey = "parameters";
	node = json_object_get_member(pJsonObject, parametersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TariffParameterDTO> new_list;
			TariffParameterDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TariffParameterDTO")) {
					jsonToValue(&inst, temp_json, "TariffParameterDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			parameters = new_list;
		}
		
	}
}

CalculatedTariffDTO::CalculatedTariffDTO(char* json)
{
	this->fromJson(json);
}

char*
CalculatedTariffDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CalculatedTariffType")) {
		CalculatedTariffType obj = getType();
		node = converttoJson(&obj, "CalculatedTariffType", "");
	}
	else {
		
		CalculatedTariffType obj = static_cast<CalculatedTariffType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("long long")) {
		long long obj = getAmount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getAmount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *amountKey = "amount";
	json_object_set_member(pJsonObject, amountKey, node);
	if (isprimitive("TariffParameterDTO")) {
		list<TariffParameterDTO> new_list = static_cast<list <TariffParameterDTO> > (getParameters());
		node = converttoJson(&new_list, "TariffParameterDTO", "array");
	} else {
		node = json_node_alloc();
		list<TariffParameterDTO> new_list = static_cast<list <TariffParameterDTO> > (getParameters());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TariffParameterDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TariffParameterDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *parametersKey = "parameters";
	json_object_set_member(pJsonObject, parametersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CalculatedTariffType
CalculatedTariffDTO::getType()
{
	return type;
}

void
CalculatedTariffDTO::setType(CalculatedTariffType  type)
{
	this->type = type;
}

long long
CalculatedTariffDTO::getAmount()
{
	return amount;
}

void
CalculatedTariffDTO::setAmount(long long  amount)
{
	this->amount = amount;
}

std::list<TariffParameterDTO>
CalculatedTariffDTO::getParameters()
{
	return parameters;
}

void
CalculatedTariffDTO::setParameters(std::list <TariffParameterDTO> parameters)
{
	this->parameters = parameters;
}


