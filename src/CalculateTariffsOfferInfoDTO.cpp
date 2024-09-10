#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CalculateTariffsOfferInfoDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CalculateTariffsOfferInfoDTO::CalculateTariffsOfferInfoDTO()
{
	//__init();
}

CalculateTariffsOfferInfoDTO::~CalculateTariffsOfferInfoDTO()
{
	//__cleanup();
}

void
CalculateTariffsOfferInfoDTO::__init()
{
	//offer = new CalculateTariffsOfferDTO();
	//new std::list()std::list> tariffs;
}

void
CalculateTariffsOfferInfoDTO::__cleanup()
{
	//if(offer != NULL) {
	//
	//delete offer;
	//offer = NULL;
	//}
	//if(tariffs != NULL) {
	//tariffs.RemoveAll(true);
	//delete tariffs;
	//tariffs = NULL;
	//}
	//
}

void
CalculateTariffsOfferInfoDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offerKey = "offer";
	node = json_object_get_member(pJsonObject, offerKey);
	if (node !=NULL) {
	

		if (isprimitive("CalculateTariffsOfferDTO")) {
			jsonToValue(&offer, node, "CalculateTariffsOfferDTO", "CalculateTariffsOfferDTO");
		} else {
			
			CalculateTariffsOfferDTO* obj = static_cast<CalculateTariffsOfferDTO*> (&offer);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tariffsKey = "tariffs";
	node = json_object_get_member(pJsonObject, tariffsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CalculatedTariffDTO> new_list;
			CalculatedTariffDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CalculatedTariffDTO")) {
					jsonToValue(&inst, temp_json, "CalculatedTariffDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			tariffs = new_list;
		}
		
	}
}

CalculateTariffsOfferInfoDTO::CalculateTariffsOfferInfoDTO(char* json)
{
	this->fromJson(json);
}

char*
CalculateTariffsOfferInfoDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CalculateTariffsOfferDTO")) {
		CalculateTariffsOfferDTO obj = getOffer();
		node = converttoJson(&obj, "CalculateTariffsOfferDTO", "");
	}
	else {
		
		CalculateTariffsOfferDTO obj = static_cast<CalculateTariffsOfferDTO> (getOffer());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *offerKey = "offer";
	json_object_set_member(pJsonObject, offerKey, node);
	if (isprimitive("CalculatedTariffDTO")) {
		list<CalculatedTariffDTO> new_list = static_cast<list <CalculatedTariffDTO> > (getTariffs());
		node = converttoJson(&new_list, "CalculatedTariffDTO", "array");
	} else {
		node = json_node_alloc();
		list<CalculatedTariffDTO> new_list = static_cast<list <CalculatedTariffDTO> > (getTariffs());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CalculatedTariffDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CalculatedTariffDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *tariffsKey = "tariffs";
	json_object_set_member(pJsonObject, tariffsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CalculateTariffsOfferDTO
CalculateTariffsOfferInfoDTO::getOffer()
{
	return offer;
}

void
CalculateTariffsOfferInfoDTO::setOffer(CalculateTariffsOfferDTO  offer)
{
	this->offer = offer;
}

std::list<CalculatedTariffDTO>
CalculateTariffsOfferInfoDTO::getTariffs()
{
	return tariffs;
}

void
CalculateTariffsOfferInfoDTO::setTariffs(std::list <CalculatedTariffDTO> tariffs)
{
	this->tariffs = tariffs;
}


