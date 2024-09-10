

#include "GoodsFeedbackDTO.h"

using namespace Tiny;

GoodsFeedbackDTO::GoodsFeedbackDTO()
{
	feedbackId = long(0);
	createdAt = std::string();
	needReaction = bool(false);
	identifiers = GoodsFeedbackIdentifiersDTO();
	author = std::string();
	description = GoodsFeedbackDescriptionDTO();
	media = GoodsFeedbackMediaDTO();
	statistics = GoodsFeedbackStatisticsDTO();
}

GoodsFeedbackDTO::GoodsFeedbackDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoodsFeedbackDTO::~GoodsFeedbackDTO()
{

}

void
GoodsFeedbackDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *feedbackIdKey = "feedbackId";

    if(object.has_key(feedbackIdKey))
    {
        bourne::json value = object[feedbackIdKey];



        jsonToValue(&feedbackId, value, "long");


    }

    const char *createdAtKey = "createdAt";

    if(object.has_key(createdAtKey))
    {
        bourne::json value = object[createdAtKey];



        jsonToValue(&createdAt, value, "std::string");


    }

    const char *needReactionKey = "needReaction";

    if(object.has_key(needReactionKey))
    {
        bourne::json value = object[needReactionKey];



        jsonToValue(&needReaction, value, "bool");


    }

    const char *identifiersKey = "identifiers";

    if(object.has_key(identifiersKey))
    {
        bourne::json value = object[identifiersKey];




        GoodsFeedbackIdentifiersDTO* obj = &identifiers;
		obj->fromJson(value.dump());

    }

    const char *authorKey = "author";

    if(object.has_key(authorKey))
    {
        bourne::json value = object[authorKey];



        jsonToValue(&author, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];




        GoodsFeedbackDescriptionDTO* obj = &description;
		obj->fromJson(value.dump());

    }

    const char *mediaKey = "media";

    if(object.has_key(mediaKey))
    {
        bourne::json value = object[mediaKey];




        GoodsFeedbackMediaDTO* obj = &media;
		obj->fromJson(value.dump());

    }

    const char *statisticsKey = "statistics";

    if(object.has_key(statisticsKey))
    {
        bourne::json value = object[statisticsKey];




        GoodsFeedbackStatisticsDTO* obj = &statistics;
		obj->fromJson(value.dump());

    }


}

bourne::json
GoodsFeedbackDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["feedbackId"] = getFeedbackId();






    object["createdAt"] = getCreatedAt();






    object["needReaction"] = isNeedReaction();







	object["identifiers"] = getIdentifiers().toJson();





    object["author"] = getAuthor();







	object["description"] = getDescription().toJson();






	object["media"] = getMedia().toJson();






	object["statistics"] = getStatistics().toJson();


    return object;

}

long
GoodsFeedbackDTO::getFeedbackId()
{
	return feedbackId;
}

void
GoodsFeedbackDTO::setFeedbackId(long  feedbackId)
{
	this->feedbackId = feedbackId;
}

std::string
GoodsFeedbackDTO::getCreatedAt()
{
	return createdAt;
}

void
GoodsFeedbackDTO::setCreatedAt(std::string  createdAt)
{
	this->createdAt = createdAt;
}

bool
GoodsFeedbackDTO::isNeedReaction()
{
	return needReaction;
}

void
GoodsFeedbackDTO::setNeedReaction(bool  needReaction)
{
	this->needReaction = needReaction;
}

GoodsFeedbackIdentifiersDTO
GoodsFeedbackDTO::getIdentifiers()
{
	return identifiers;
}

void
GoodsFeedbackDTO::setIdentifiers(GoodsFeedbackIdentifiersDTO  identifiers)
{
	this->identifiers = identifiers;
}

std::string
GoodsFeedbackDTO::getAuthor()
{
	return author;
}

void
GoodsFeedbackDTO::setAuthor(std::string  author)
{
	this->author = author;
}

GoodsFeedbackDescriptionDTO
GoodsFeedbackDTO::getDescription()
{
	return description;
}

void
GoodsFeedbackDTO::setDescription(GoodsFeedbackDescriptionDTO  description)
{
	this->description = description;
}

GoodsFeedbackMediaDTO
GoodsFeedbackDTO::getMedia()
{
	return media;
}

void
GoodsFeedbackDTO::setMedia(GoodsFeedbackMediaDTO  media)
{
	this->media = media;
}

GoodsFeedbackStatisticsDTO
GoodsFeedbackDTO::getStatistics()
{
	return statistics;
}

void
GoodsFeedbackDTO::setStatistics(GoodsFeedbackStatisticsDTO  statistics)
{
	this->statistics = statistics;
}



