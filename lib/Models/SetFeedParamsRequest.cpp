

#include "SetFeedParamsRequest.h"

using namespace Tiny;

SetFeedParamsRequest::SetFeedParamsRequest()
{
	parameters = std::list<FeedParameterDTO>();
}

SetFeedParamsRequest::SetFeedParamsRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

SetFeedParamsRequest::~SetFeedParamsRequest()
{

}

void
SetFeedParamsRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *parametersKey = "parameters";

    if(object.has_key(parametersKey))
    {
        bourne::json value = object[parametersKey];


        std::list<FeedParameterDTO> parameters_list;
        FeedParameterDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            parameters_list.push_back(element);
        }
        parameters = parameters_list;


    }


}

bourne::json
SetFeedParamsRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<FeedParameterDTO> parameters_list = getParameters();
    bourne::json parameters_arr = bourne::json::array();

    for(auto& var : parameters_list)
    {
        FeedParameterDTO obj = var;
        parameters_arr.append(obj.toJson());
    }
    object["parameters"] = parameters_arr;




    return object;

}

std::list<FeedParameterDTO>
SetFeedParamsRequest::getParameters()
{
	return parameters;
}

void
SetFeedParamsRequest::setParameters(std::list <FeedParameterDTO> parameters)
{
	this->parameters = parameters;
}



