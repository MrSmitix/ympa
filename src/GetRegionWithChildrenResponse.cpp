#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetRegionWithChildrenResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetRegionWithChildrenResponse::GetRegionWithChildrenResponse()
{
	//__init();
}

GetRegionWithChildrenResponse::~GetRegionWithChildrenResponse()
{
	//__cleanup();
}

void
GetRegionWithChildrenResponse::__init()
{
	//pager = new FlippingPagerDTO();
	//regions = new RegionDTO();
}

void
GetRegionWithChildrenResponse::__cleanup()
{
	//if(pager != NULL) {
	//
	//delete pager;
	//pager = NULL;
	//}
	//if(regions != NULL) {
	//
	//delete regions;
	//regions = NULL;
	//}
	//
}

void
GetRegionWithChildrenResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pagerKey = "pager";
	node = json_object_get_member(pJsonObject, pagerKey);
	if (node !=NULL) {
	

		if (isprimitive("FlippingPagerDTO")) {
			jsonToValue(&pager, node, "FlippingPagerDTO", "FlippingPagerDTO");
		} else {
			
			FlippingPagerDTO* obj = static_cast<FlippingPagerDTO*> (&pager);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *regionsKey = "regions";
	node = json_object_get_member(pJsonObject, regionsKey);
	if (node !=NULL) {
	

		if (isprimitive("RegionDTO")) {
			jsonToValue(&regions, node, "RegionDTO", "RegionDTO");
		} else {
			
			RegionDTO* obj = static_cast<RegionDTO*> (&regions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetRegionWithChildrenResponse::GetRegionWithChildrenResponse(char* json)
{
	this->fromJson(json);
}

char*
GetRegionWithChildrenResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("FlippingPagerDTO")) {
		FlippingPagerDTO obj = getPager();
		node = converttoJson(&obj, "FlippingPagerDTO", "");
	}
	else {
		
		FlippingPagerDTO obj = static_cast<FlippingPagerDTO> (getPager());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pagerKey = "pager";
	json_object_set_member(pJsonObject, pagerKey, node);
	if (isprimitive("RegionDTO")) {
		RegionDTO obj = getRegions();
		node = converttoJson(&obj, "RegionDTO", "");
	}
	else {
		
		RegionDTO obj = static_cast<RegionDTO> (getRegions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *regionsKey = "regions";
	json_object_set_member(pJsonObject, regionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

FlippingPagerDTO
GetRegionWithChildrenResponse::getPager()
{
	return pager;
}

void
GetRegionWithChildrenResponse::setPager(FlippingPagerDTO  pager)
{
	this->pager = pager;
}

RegionDTO
GetRegionWithChildrenResponse::getRegions()
{
	return regions;
}

void
GetRegionWithChildrenResponse::setRegions(RegionDTO  regions)
{
	this->regions = regions;
}


