#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferCardRecommendationDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferCardRecommendationDTO::OfferCardRecommendationDTO()
{
	//__init();
}

OfferCardRecommendationDTO::~OfferCardRecommendationDTO()
{
	//__cleanup();
}

void
OfferCardRecommendationDTO::__init()
{
	//type = new OfferCardRecommendationType();
	//percent = int(0);
}

void
OfferCardRecommendationDTO::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(percent != NULL) {
	//
	//delete percent;
	//percent = NULL;
	//}
	//
}

void
OfferCardRecommendationDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferCardRecommendationType")) {
			jsonToValue(&type, node, "OfferCardRecommendationType", "OfferCardRecommendationType");
		} else {
			
			OfferCardRecommendationType* obj = static_cast<OfferCardRecommendationType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *percentKey = "percent";
	node = json_object_get_member(pJsonObject, percentKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&percent, node, "int", "");
		} else {
			
		}
	}
}

OfferCardRecommendationDTO::OfferCardRecommendationDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferCardRecommendationDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OfferCardRecommendationType")) {
		OfferCardRecommendationType obj = getType();
		node = converttoJson(&obj, "OfferCardRecommendationType", "");
	}
	else {
		
		OfferCardRecommendationType obj = static_cast<OfferCardRecommendationType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("int")) {
		int obj = getPercent();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *percentKey = "percent";
	json_object_set_member(pJsonObject, percentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

OfferCardRecommendationType
OfferCardRecommendationDTO::getType()
{
	return type;
}

void
OfferCardRecommendationDTO::setType(OfferCardRecommendationType  type)
{
	this->type = type;
}

int
OfferCardRecommendationDTO::getPercent()
{
	return percent;
}

void
OfferCardRecommendationDTO::setPercent(int  percent)
{
	this->percent = percent;
}


