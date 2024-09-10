#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PriceCompetitivenessThresholdsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PriceCompetitivenessThresholdsDTO::PriceCompetitivenessThresholdsDTO()
{
	//__init();
}

PriceCompetitivenessThresholdsDTO::~PriceCompetitivenessThresholdsDTO()
{
	//__cleanup();
}

void
PriceCompetitivenessThresholdsDTO::__init()
{
	//optimalPrice = new BasePriceDTO();
	//averagePrice = new BasePriceDTO();
}

void
PriceCompetitivenessThresholdsDTO::__cleanup()
{
	//if(optimalPrice != NULL) {
	//
	//delete optimalPrice;
	//optimalPrice = NULL;
	//}
	//if(averagePrice != NULL) {
	//
	//delete averagePrice;
	//averagePrice = NULL;
	//}
	//
}

void
PriceCompetitivenessThresholdsDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *optimalPriceKey = "optimalPrice";
	node = json_object_get_member(pJsonObject, optimalPriceKey);
	if (node !=NULL) {
	

		if (isprimitive("BasePriceDTO")) {
			jsonToValue(&optimalPrice, node, "BasePriceDTO", "BasePriceDTO");
		} else {
			
			BasePriceDTO* obj = static_cast<BasePriceDTO*> (&optimalPrice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *averagePriceKey = "averagePrice";
	node = json_object_get_member(pJsonObject, averagePriceKey);
	if (node !=NULL) {
	

		if (isprimitive("BasePriceDTO")) {
			jsonToValue(&averagePrice, node, "BasePriceDTO", "BasePriceDTO");
		} else {
			
			BasePriceDTO* obj = static_cast<BasePriceDTO*> (&averagePrice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PriceCompetitivenessThresholdsDTO::PriceCompetitivenessThresholdsDTO(char* json)
{
	this->fromJson(json);
}

char*
PriceCompetitivenessThresholdsDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("BasePriceDTO")) {
		BasePriceDTO obj = getOptimalPrice();
		node = converttoJson(&obj, "BasePriceDTO", "");
	}
	else {
		
		BasePriceDTO obj = static_cast<BasePriceDTO> (getOptimalPrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *optimalPriceKey = "optimalPrice";
	json_object_set_member(pJsonObject, optimalPriceKey, node);
	if (isprimitive("BasePriceDTO")) {
		BasePriceDTO obj = getAveragePrice();
		node = converttoJson(&obj, "BasePriceDTO", "");
	}
	else {
		
		BasePriceDTO obj = static_cast<BasePriceDTO> (getAveragePrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *averagePriceKey = "averagePrice";
	json_object_set_member(pJsonObject, averagePriceKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

BasePriceDTO
PriceCompetitivenessThresholdsDTO::getOptimalPrice()
{
	return optimalPrice;
}

void
PriceCompetitivenessThresholdsDTO::setOptimalPrice(BasePriceDTO  optimalPrice)
{
	this->optimalPrice = optimalPrice;
}

BasePriceDTO
PriceCompetitivenessThresholdsDTO::getAveragePrice()
{
	return averagePrice;
}

void
PriceCompetitivenessThresholdsDTO::setAveragePrice(BasePriceDTO  averagePrice)
{
	this->averagePrice = averagePrice;
}


