

#include "FeedbackDTO.h"

using namespace Tiny;

FeedbackDTO::FeedbackDTO()
{
	id = long(0);
	createdAt = std::string();
	text = std::string();
	state = FeedbackStateType();
	author = FeedbackAuthorDTO();
	pro = std::string();
	contra = std::string();
	comments = std::list<FeedbackCommentDTO>();
	shop = FeedbackShopDTO();
	resolved = bool(false);
	verified = bool(false);
	recommend = bool(false);
	grades = FeedbackGradesDTO();
	order = FeedbackOrderDTO();
}

FeedbackDTO::FeedbackDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedbackDTO::~FeedbackDTO()
{

}

void
FeedbackDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *createdAtKey = "createdAt";

    if(object.has_key(createdAtKey))
    {
        bourne::json value = object[createdAtKey];



        jsonToValue(&createdAt, value, "std::string");


    }

    const char *textKey = "text";

    if(object.has_key(textKey))
    {
        bourne::json value = object[textKey];



        jsonToValue(&text, value, "std::string");


    }

    const char *stateKey = "state";

    if(object.has_key(stateKey))
    {
        bourne::json value = object[stateKey];




        FeedbackStateType* obj = &state;
		obj->fromJson(value.dump());

    }

    const char *authorKey = "author";

    if(object.has_key(authorKey))
    {
        bourne::json value = object[authorKey];




        FeedbackAuthorDTO* obj = &author;
		obj->fromJson(value.dump());

    }

    const char *proKey = "pro";

    if(object.has_key(proKey))
    {
        bourne::json value = object[proKey];



        jsonToValue(&pro, value, "std::string");


    }

    const char *contraKey = "contra";

    if(object.has_key(contraKey))
    {
        bourne::json value = object[contraKey];



        jsonToValue(&contra, value, "std::string");


    }

    const char *commentsKey = "comments";

    if(object.has_key(commentsKey))
    {
        bourne::json value = object[commentsKey];


        std::list<FeedbackCommentDTO> comments_list;
        FeedbackCommentDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            comments_list.push_back(element);
        }
        comments = comments_list;


    }

    const char *shopKey = "shop";

    if(object.has_key(shopKey))
    {
        bourne::json value = object[shopKey];




        FeedbackShopDTO* obj = &shop;
		obj->fromJson(value.dump());

    }

    const char *resolvedKey = "resolved";

    if(object.has_key(resolvedKey))
    {
        bourne::json value = object[resolvedKey];



        jsonToValue(&resolved, value, "bool");


    }

    const char *verifiedKey = "verified";

    if(object.has_key(verifiedKey))
    {
        bourne::json value = object[verifiedKey];



        jsonToValue(&verified, value, "bool");


    }

    const char *recommendKey = "recommend";

    if(object.has_key(recommendKey))
    {
        bourne::json value = object[recommendKey];



        jsonToValue(&recommend, value, "bool");


    }

    const char *gradesKey = "grades";

    if(object.has_key(gradesKey))
    {
        bourne::json value = object[gradesKey];




        FeedbackGradesDTO* obj = &grades;
		obj->fromJson(value.dump());

    }

    const char *orderKey = "order";

    if(object.has_key(orderKey))
    {
        bourne::json value = object[orderKey];




        FeedbackOrderDTO* obj = &order;
		obj->fromJson(value.dump());

    }


}

bourne::json
FeedbackDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["createdAt"] = getCreatedAt();






    object["text"] = getText();







	object["state"] = getState().toJson();






	object["author"] = getAuthor().toJson();





    object["pro"] = getPro();






    object["contra"] = getContra();





    std::list<FeedbackCommentDTO> comments_list = getComments();
    bourne::json comments_arr = bourne::json::array();

    for(auto& var : comments_list)
    {
        FeedbackCommentDTO obj = var;
        comments_arr.append(obj.toJson());
    }
    object["comments"] = comments_arr;








	object["shop"] = getShop().toJson();





    object["resolved"] = isResolved();






    object["verified"] = isVerified();






    object["recommend"] = isRecommend();







	object["grades"] = getGrades().toJson();






	object["order"] = getOrder().toJson();


    return object;

}

long
FeedbackDTO::getId()
{
	return id;
}

void
FeedbackDTO::setId(long  id)
{
	this->id = id;
}

std::string
FeedbackDTO::getCreatedAt()
{
	return createdAt;
}

void
FeedbackDTO::setCreatedAt(std::string  createdAt)
{
	this->createdAt = createdAt;
}

std::string
FeedbackDTO::getText()
{
	return text;
}

void
FeedbackDTO::setText(std::string  text)
{
	this->text = text;
}

FeedbackStateType
FeedbackDTO::getState()
{
	return state;
}

void
FeedbackDTO::setState(FeedbackStateType  state)
{
	this->state = state;
}

FeedbackAuthorDTO
FeedbackDTO::getAuthor()
{
	return author;
}

void
FeedbackDTO::setAuthor(FeedbackAuthorDTO  author)
{
	this->author = author;
}

std::string
FeedbackDTO::getPro()
{
	return pro;
}

void
FeedbackDTO::setPro(std::string  pro)
{
	this->pro = pro;
}

std::string
FeedbackDTO::getContra()
{
	return contra;
}

void
FeedbackDTO::setContra(std::string  contra)
{
	this->contra = contra;
}

std::list<FeedbackCommentDTO>
FeedbackDTO::getComments()
{
	return comments;
}

void
FeedbackDTO::setComments(std::list <FeedbackCommentDTO> comments)
{
	this->comments = comments;
}

FeedbackShopDTO
FeedbackDTO::getShop()
{
	return shop;
}

void
FeedbackDTO::setShop(FeedbackShopDTO  shop)
{
	this->shop = shop;
}

bool
FeedbackDTO::isResolved()
{
	return resolved;
}

void
FeedbackDTO::setResolved(bool  resolved)
{
	this->resolved = resolved;
}

bool
FeedbackDTO::isVerified()
{
	return verified;
}

void
FeedbackDTO::setVerified(bool  verified)
{
	this->verified = verified;
}

bool
FeedbackDTO::isRecommend()
{
	return recommend;
}

void
FeedbackDTO::setRecommend(bool  recommend)
{
	this->recommend = recommend;
}

FeedbackGradesDTO
FeedbackDTO::getGrades()
{
	return grades;
}

void
FeedbackDTO::setGrades(FeedbackGradesDTO  grades)
{
	this->grades = grades;
}

FeedbackOrderDTO
FeedbackDTO::getOrder()
{
	return order;
}

void
FeedbackDTO::setOrder(FeedbackOrderDTO  order)
{
	this->order = order;
}



