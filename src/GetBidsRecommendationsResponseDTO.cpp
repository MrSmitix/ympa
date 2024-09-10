#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetBidsRecommendationsResponseDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetBidsRecommendationsResponseDTO::GetBidsRecommendationsResponseDTO()
{
	//__init();
}

GetBidsRecommendationsResponseDTO::~GetBidsRecommendationsResponseDTO()
{
	//__cleanup();
}

void
GetBidsRecommendationsResponseDTO::__init()
{
	//new std::list()std::list> recommendations;
}

void
GetBidsRecommendationsResponseDTO::__cleanup()
{
	//if(recommendations != NULL) {
	//recommendations.RemoveAll(true);
	//delete recommendations;
	//recommendations = NULL;
	//}
	//
}

void
GetBidsRecommendationsResponseDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *recommendationsKey = "recommendations";
	node = json_object_get_member(pJsonObject, recommendationsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<SkuBidRecommendationItemDTO> new_list;
			SkuBidRecommendationItemDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("SkuBidRecommendationItemDTO")) {
					jsonToValue(&inst, temp_json, "SkuBidRecommendationItemDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			recommendations = new_list;
		}
		
	}
}

GetBidsRecommendationsResponseDTO::GetBidsRecommendationsResponseDTO(char* json)
{
	this->fromJson(json);
}

char*
GetBidsRecommendationsResponseDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("SkuBidRecommendationItemDTO")) {
		list<SkuBidRecommendationItemDTO> new_list = static_cast<list <SkuBidRecommendationItemDTO> > (getRecommendations());
		node = converttoJson(&new_list, "SkuBidRecommendationItemDTO", "array");
	} else {
		node = json_node_alloc();
		list<SkuBidRecommendationItemDTO> new_list = static_cast<list <SkuBidRecommendationItemDTO> > (getRecommendations());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<SkuBidRecommendationItemDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			SkuBidRecommendationItemDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *recommendationsKey = "recommendations";
	json_object_set_member(pJsonObject, recommendationsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<SkuBidRecommendationItemDTO>
GetBidsRecommendationsResponseDTO::getRecommendations()
{
	return recommendations;
}

void
GetBidsRecommendationsResponseDTO::setRecommendations(std::list <SkuBidRecommendationItemDTO> recommendations)
{
	this->recommendations = recommendations;
}


