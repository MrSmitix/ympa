

#include "DeleteGoodsFeedbackCommentRequest.h"

using namespace Tiny;

DeleteGoodsFeedbackCommentRequest::DeleteGoodsFeedbackCommentRequest()
{
	id = long(0);
}

DeleteGoodsFeedbackCommentRequest::DeleteGoodsFeedbackCommentRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteGoodsFeedbackCommentRequest::~DeleteGoodsFeedbackCommentRequest()
{

}

void
DeleteGoodsFeedbackCommentRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }


}

bourne::json
DeleteGoodsFeedbackCommentRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();



    return object;

}

long
DeleteGoodsFeedbackCommentRequest::getId()
{
	return id;
}

void
DeleteGoodsFeedbackCommentRequest::setId(long  id)
{
	this->id = id;
}



