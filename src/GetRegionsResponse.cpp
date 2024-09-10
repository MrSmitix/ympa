#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetRegionsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetRegionsResponse::GetRegionsResponse()
{
	//__init();
}

GetRegionsResponse::~GetRegionsResponse()
{
	//__cleanup();
}

void
GetRegionsResponse::__init()
{
	//new std::list()std::list> regions;
	//paging = new ForwardScrollingPagerDTO();
}

void
GetRegionsResponse::__cleanup()
{
	//if(regions != NULL) {
	//regions.RemoveAll(true);
	//delete regions;
	//regions = NULL;
	//}
	//if(paging != NULL) {
	//
	//delete paging;
	//paging = NULL;
	//}
	//
}

void
GetRegionsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *regionsKey = "regions";
	node = json_object_get_member(pJsonObject, regionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<RegionDTO> new_list;
			RegionDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("RegionDTO")) {
					jsonToValue(&inst, temp_json, "RegionDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			regions = new_list;
		}
		
	}
	const gchar *pagingKey = "paging";
	node = json_object_get_member(pJsonObject, pagingKey);
	if (node !=NULL) {
	

		if (isprimitive("ForwardScrollingPagerDTO")) {
			jsonToValue(&paging, node, "ForwardScrollingPagerDTO", "ForwardScrollingPagerDTO");
		} else {
			
			ForwardScrollingPagerDTO* obj = static_cast<ForwardScrollingPagerDTO*> (&paging);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetRegionsResponse::GetRegionsResponse(char* json)
{
	this->fromJson(json);
}

char*
GetRegionsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("RegionDTO")) {
		list<RegionDTO> new_list = static_cast<list <RegionDTO> > (getRegions());
		node = converttoJson(&new_list, "RegionDTO", "array");
	} else {
		node = json_node_alloc();
		list<RegionDTO> new_list = static_cast<list <RegionDTO> > (getRegions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<RegionDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			RegionDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *regionsKey = "regions";
	json_object_set_member(pJsonObject, regionsKey, node);
	if (isprimitive("ForwardScrollingPagerDTO")) {
		ForwardScrollingPagerDTO obj = getPaging();
		node = converttoJson(&obj, "ForwardScrollingPagerDTO", "");
	}
	else {
		
		ForwardScrollingPagerDTO obj = static_cast<ForwardScrollingPagerDTO> (getPaging());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pagingKey = "paging";
	json_object_set_member(pJsonObject, pagingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<RegionDTO>
GetRegionsResponse::getRegions()
{
	return regions;
}

void
GetRegionsResponse::setRegions(std::list <RegionDTO> regions)
{
	this->regions = regions;
}

ForwardScrollingPagerDTO
GetRegionsResponse::getPaging()
{
	return paging;
}

void
GetRegionsResponse::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}


