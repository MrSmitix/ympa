#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GoodsFeedbackMediaDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GoodsFeedbackMediaDTO::GoodsFeedbackMediaDTO()
{
	//__init();
}

GoodsFeedbackMediaDTO::~GoodsFeedbackMediaDTO()
{
	//__cleanup();
}

void
GoodsFeedbackMediaDTO::__init()
{
	//new std::list()std::list> photos;
	//new std::list()std::list> videos;
}

void
GoodsFeedbackMediaDTO::__cleanup()
{
	//if(photos != NULL) {
	//photos.RemoveAll(true);
	//delete photos;
	//photos = NULL;
	//}
	//if(videos != NULL) {
	//videos.RemoveAll(true);
	//delete videos;
	//videos = NULL;
	//}
	//
}

void
GoodsFeedbackMediaDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *photosKey = "photos";
	node = json_object_get_member(pJsonObject, photosKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			photos = new_list;
		}
		
	}
	const gchar *videosKey = "videos";
	node = json_object_get_member(pJsonObject, videosKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			videos = new_list;
		}
		
	}
}

GoodsFeedbackMediaDTO::GoodsFeedbackMediaDTO(char* json)
{
	this->fromJson(json);
}

char*
GoodsFeedbackMediaDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getPhotos());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getPhotos());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *photosKey = "photos";
	json_object_set_member(pJsonObject, photosKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getVideos());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getVideos());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *videosKey = "videos";
	json_object_set_member(pJsonObject, videosKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
GoodsFeedbackMediaDTO::getPhotos()
{
	return photos;
}

void
GoodsFeedbackMediaDTO::setPhotos(std::list <std::string> photos)
{
	this->photos = photos;
}

std::list<std::string>
GoodsFeedbackMediaDTO::getVideos()
{
	return videos;
}

void
GoodsFeedbackMediaDTO::setVideos(std::list <std::string> videos)
{
	this->videos = videos;
}


