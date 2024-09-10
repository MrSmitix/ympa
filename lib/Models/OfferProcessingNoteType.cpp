

#include "OfferProcessingNoteType.h"

using namespace Tiny;

OfferProcessingNoteType::OfferProcessingNoteType()
{
}

OfferProcessingNoteType::OfferProcessingNoteType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferProcessingNoteType::~OfferProcessingNoteType()
{

}

void
OfferProcessingNoteType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OfferProcessingNoteType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



