#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CalculateTariffsRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CalculateTariffsRequest::CalculateTariffsRequest()
{
	//__init();
}

CalculateTariffsRequest::~CalculateTariffsRequest()
{
	//__cleanup();
}

void
CalculateTariffsRequest::__init()
{
	//parameters = new CalculateTariffsParametersDTO();
	//new std::list()std::list> offers;
}

void
CalculateTariffsRequest::__cleanup()
{
	//if(parameters != NULL) {
	//
	//delete parameters;
	//parameters = NULL;
	//}
	//if(offers != NULL) {
	//offers.RemoveAll(true);
	//delete offers;
	//offers = NULL;
	//}
	//
}

void
CalculateTariffsRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *parametersKey = "parameters";
	node = json_object_get_member(pJsonObject, parametersKey);
	if (node !=NULL) {
	

		if (isprimitive("CalculateTariffsParametersDTO")) {
			jsonToValue(&parameters, node, "CalculateTariffsParametersDTO", "CalculateTariffsParametersDTO");
		} else {
			
			CalculateTariffsParametersDTO* obj = static_cast<CalculateTariffsParametersDTO*> (&parameters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *offersKey = "offers";
	node = json_object_get_member(pJsonObject, offersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CalculateTariffsOfferDTO> new_list;
			CalculateTariffsOfferDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CalculateTariffsOfferDTO")) {
					jsonToValue(&inst, temp_json, "CalculateTariffsOfferDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			offers = new_list;
		}
		
	}
}

CalculateTariffsRequest::CalculateTariffsRequest(char* json)
{
	this->fromJson(json);
}

char*
CalculateTariffsRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CalculateTariffsParametersDTO")) {
		CalculateTariffsParametersDTO obj = getParameters();
		node = converttoJson(&obj, "CalculateTariffsParametersDTO", "");
	}
	else {
		
		CalculateTariffsParametersDTO obj = static_cast<CalculateTariffsParametersDTO> (getParameters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *parametersKey = "parameters";
	json_object_set_member(pJsonObject, parametersKey, node);
	if (isprimitive("CalculateTariffsOfferDTO")) {
		list<CalculateTariffsOfferDTO> new_list = static_cast<list <CalculateTariffsOfferDTO> > (getOffers());
		node = converttoJson(&new_list, "CalculateTariffsOfferDTO", "array");
	} else {
		node = json_node_alloc();
		list<CalculateTariffsOfferDTO> new_list = static_cast<list <CalculateTariffsOfferDTO> > (getOffers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CalculateTariffsOfferDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CalculateTariffsOfferDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *offersKey = "offers";
	json_object_set_member(pJsonObject, offersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CalculateTariffsParametersDTO
CalculateTariffsRequest::getParameters()
{
	return parameters;
}

void
CalculateTariffsRequest::setParameters(CalculateTariffsParametersDTO  parameters)
{
	this->parameters = parameters;
}

std::list<CalculateTariffsOfferDTO>
CalculateTariffsRequest::getOffers()
{
	return offers;
}

void
CalculateTariffsRequest::setOffers(std::list <CalculateTariffsOfferDTO> offers)
{
	this->offers = offers;
}


