#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FeedbackAuthorDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FeedbackAuthorDTO::FeedbackAuthorDTO()
{
	//__init();
}

FeedbackAuthorDTO::~FeedbackAuthorDTO()
{
	//__cleanup();
}

void
FeedbackAuthorDTO::__init()
{
	//name = std::string();
	//region = new RegionDTO();
}

void
FeedbackAuthorDTO::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(region != NULL) {
	//
	//delete region;
	//region = NULL;
	//}
	//
}

void
FeedbackAuthorDTO::fromJson(char* jsonStr)
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
}

FeedbackAuthorDTO::FeedbackAuthorDTO(char* json)
{
	this->fromJson(json);
}

char*
FeedbackAuthorDTO::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
FeedbackAuthorDTO::getName()
{
	return name;
}

void
FeedbackAuthorDTO::setName(std::string  name)
{
	this->name = name;
}

RegionDTO
FeedbackAuthorDTO::getRegion()
{
	return region;
}

void
FeedbackAuthorDTO::setRegion(RegionDTO  region)
{
	this->region = region;
}


