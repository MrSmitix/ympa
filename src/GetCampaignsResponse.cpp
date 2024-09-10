#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetCampaignsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetCampaignsResponse::GetCampaignsResponse()
{
	//__init();
}

GetCampaignsResponse::~GetCampaignsResponse()
{
	//__cleanup();
}

void
GetCampaignsResponse::__init()
{
	//new std::list()std::list> campaigns;
	//pager = new FlippingPagerDTO();
}

void
GetCampaignsResponse::__cleanup()
{
	//if(campaigns != NULL) {
	//campaigns.RemoveAll(true);
	//delete campaigns;
	//campaigns = NULL;
	//}
	//if(pager != NULL) {
	//
	//delete pager;
	//pager = NULL;
	//}
	//
}

void
GetCampaignsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *campaignsKey = "campaigns";
	node = json_object_get_member(pJsonObject, campaignsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CampaignDTO> new_list;
			CampaignDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CampaignDTO")) {
					jsonToValue(&inst, temp_json, "CampaignDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			campaigns = new_list;
		}
		
	}
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
}

GetCampaignsResponse::GetCampaignsResponse(char* json)
{
	this->fromJson(json);
}

char*
GetCampaignsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CampaignDTO")) {
		list<CampaignDTO> new_list = static_cast<list <CampaignDTO> > (getCampaigns());
		node = converttoJson(&new_list, "CampaignDTO", "array");
	} else {
		node = json_node_alloc();
		list<CampaignDTO> new_list = static_cast<list <CampaignDTO> > (getCampaigns());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CampaignDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CampaignDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *campaignsKey = "campaigns";
	json_object_set_member(pJsonObject, campaignsKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<CampaignDTO>
GetCampaignsResponse::getCampaigns()
{
	return campaigns;
}

void
GetCampaignsResponse::setCampaigns(std::list <CampaignDTO> campaigns)
{
	this->campaigns = campaigns;
}

FlippingPagerDTO
GetCampaignsResponse::getPager()
{
	return pager;
}

void
GetCampaignsResponse::setPager(FlippingPagerDTO  pager)
{
	this->pager = pager;
}


