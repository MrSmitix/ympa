

#include "GoodsFeedbackMediaDTO.h"

using namespace Tiny;

GoodsFeedbackMediaDTO::GoodsFeedbackMediaDTO()
{
	photos = std::list<std::string>();
	videos = std::list<std::string>();
}

GoodsFeedbackMediaDTO::GoodsFeedbackMediaDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoodsFeedbackMediaDTO::~GoodsFeedbackMediaDTO()
{

}

void
GoodsFeedbackMediaDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *photosKey = "photos";

    if(object.has_key(photosKey))
    {
        bourne::json value = object[photosKey];


        std::list<std::string> photos_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            photos_list.push_back(element);
        }
        photos = photos_list;


    }

    const char *videosKey = "videos";

    if(object.has_key(videosKey))
    {
        bourne::json value = object[videosKey];


        std::list<std::string> videos_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            videos_list.push_back(element);
        }
        videos = videos_list;


    }


}

bourne::json
GoodsFeedbackMediaDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> photos_list = getPhotos();
    bourne::json photos_arr = bourne::json::array();

    for(auto& var : photos_list)
    {
        photos_arr.append(var);
    }
    object["photos"] = photos_arr;








    std::list<std::string> videos_list = getVideos();
    bourne::json videos_arr = bourne::json::array();

    for(auto& var : videos_list)
    {
        videos_arr.append(var);
    }
    object["videos"] = videos_arr;






    return object;

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



