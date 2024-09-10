#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FeedbackDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FeedbackDTO::FeedbackDTO()
{
	//__init();
}

FeedbackDTO::~FeedbackDTO()
{
	//__cleanup();
}

void
FeedbackDTO::__init()
{
	//id = long(0);
	//createdAt = null;
	//text = std::string();
	//state = new FeedbackStateType();
	//author = new FeedbackAuthorDTO();
	//pro = std::string();
	//contra = std::string();
	//new std::list()std::list> comments;
	//shop = new FeedbackShopDTO();
	//resolved = bool(false);
	//verified = bool(false);
	//recommend = bool(false);
	//grades = new FeedbackGradesDTO();
	//order = new FeedbackOrderDTO();
}

void
FeedbackDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(createdAt != NULL) {
	//
	//delete createdAt;
	//createdAt = NULL;
	//}
	//if(text != NULL) {
	//
	//delete text;
	//text = NULL;
	//}
	//if(state != NULL) {
	//
	//delete state;
	//state = NULL;
	//}
	//if(author != NULL) {
	//
	//delete author;
	//author = NULL;
	//}
	//if(pro != NULL) {
	//
	//delete pro;
	//pro = NULL;
	//}
	//if(contra != NULL) {
	//
	//delete contra;
	//contra = NULL;
	//}
	//if(comments != NULL) {
	//comments.RemoveAll(true);
	//delete comments;
	//comments = NULL;
	//}
	//if(shop != NULL) {
	//
	//delete shop;
	//shop = NULL;
	//}
	//if(resolved != NULL) {
	//
	//delete resolved;
	//resolved = NULL;
	//}
	//if(verified != NULL) {
	//
	//delete verified;
	//verified = NULL;
	//}
	//if(recommend != NULL) {
	//
	//delete recommend;
	//recommend = NULL;
	//}
	//if(grades != NULL) {
	//
	//delete grades;
	//grades = NULL;
	//}
	//if(order != NULL) {
	//
	//delete order;
	//order = NULL;
	//}
	//
}

void
FeedbackDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *createdAtKey = "createdAt";
	node = json_object_get_member(pJsonObject, createdAtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&createdAt, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *textKey = "text";
	node = json_object_get_member(pJsonObject, textKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&text, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *stateKey = "state";
	node = json_object_get_member(pJsonObject, stateKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedbackStateType")) {
			jsonToValue(&state, node, "FeedbackStateType", "FeedbackStateType");
		} else {
			
			FeedbackStateType* obj = static_cast<FeedbackStateType*> (&state);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authorKey = "author";
	node = json_object_get_member(pJsonObject, authorKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedbackAuthorDTO")) {
			jsonToValue(&author, node, "FeedbackAuthorDTO", "FeedbackAuthorDTO");
		} else {
			
			FeedbackAuthorDTO* obj = static_cast<FeedbackAuthorDTO*> (&author);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *proKey = "pro";
	node = json_object_get_member(pJsonObject, proKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pro, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *contraKey = "contra";
	node = json_object_get_member(pJsonObject, contraKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&contra, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *commentsKey = "comments";
	node = json_object_get_member(pJsonObject, commentsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<FeedbackCommentDTO> new_list;
			FeedbackCommentDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("FeedbackCommentDTO")) {
					jsonToValue(&inst, temp_json, "FeedbackCommentDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			comments = new_list;
		}
		
	}
	const gchar *shopKey = "shop";
	node = json_object_get_member(pJsonObject, shopKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedbackShopDTO")) {
			jsonToValue(&shop, node, "FeedbackShopDTO", "FeedbackShopDTO");
		} else {
			
			FeedbackShopDTO* obj = static_cast<FeedbackShopDTO*> (&shop);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resolvedKey = "resolved";
	node = json_object_get_member(pJsonObject, resolvedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&resolved, node, "bool", "");
		} else {
			
		}
	}
	const gchar *verifiedKey = "verified";
	node = json_object_get_member(pJsonObject, verifiedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&verified, node, "bool", "");
		} else {
			
		}
	}
	const gchar *recommendKey = "recommend";
	node = json_object_get_member(pJsonObject, recommendKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&recommend, node, "bool", "");
		} else {
			
		}
	}
	const gchar *gradesKey = "grades";
	node = json_object_get_member(pJsonObject, gradesKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedbackGradesDTO")) {
			jsonToValue(&grades, node, "FeedbackGradesDTO", "FeedbackGradesDTO");
		} else {
			
			FeedbackGradesDTO* obj = static_cast<FeedbackGradesDTO*> (&grades);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orderKey = "order";
	node = json_object_get_member(pJsonObject, orderKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedbackOrderDTO")) {
			jsonToValue(&order, node, "FeedbackOrderDTO", "FeedbackOrderDTO");
		} else {
			
			FeedbackOrderDTO* obj = static_cast<FeedbackOrderDTO*> (&order);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

FeedbackDTO::FeedbackDTO(char* json)
{
	this->fromJson(json);
}

char*
FeedbackDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCreatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *createdAtKey = "createdAt";
	json_object_set_member(pJsonObject, createdAtKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getText();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *textKey = "text";
	json_object_set_member(pJsonObject, textKey, node);
	if (isprimitive("FeedbackStateType")) {
		FeedbackStateType obj = getState();
		node = converttoJson(&obj, "FeedbackStateType", "");
	}
	else {
		
		FeedbackStateType obj = static_cast<FeedbackStateType> (getState());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *stateKey = "state";
	json_object_set_member(pJsonObject, stateKey, node);
	if (isprimitive("FeedbackAuthorDTO")) {
		FeedbackAuthorDTO obj = getAuthor();
		node = converttoJson(&obj, "FeedbackAuthorDTO", "");
	}
	else {
		
		FeedbackAuthorDTO obj = static_cast<FeedbackAuthorDTO> (getAuthor());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authorKey = "author";
	json_object_set_member(pJsonObject, authorKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPro();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *proKey = "pro";
	json_object_set_member(pJsonObject, proKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getContra();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *contraKey = "contra";
	json_object_set_member(pJsonObject, contraKey, node);
	if (isprimitive("FeedbackCommentDTO")) {
		list<FeedbackCommentDTO> new_list = static_cast<list <FeedbackCommentDTO> > (getComments());
		node = converttoJson(&new_list, "FeedbackCommentDTO", "array");
	} else {
		node = json_node_alloc();
		list<FeedbackCommentDTO> new_list = static_cast<list <FeedbackCommentDTO> > (getComments());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<FeedbackCommentDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			FeedbackCommentDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *commentsKey = "comments";
	json_object_set_member(pJsonObject, commentsKey, node);
	if (isprimitive("FeedbackShopDTO")) {
		FeedbackShopDTO obj = getShop();
		node = converttoJson(&obj, "FeedbackShopDTO", "");
	}
	else {
		
		FeedbackShopDTO obj = static_cast<FeedbackShopDTO> (getShop());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *shopKey = "shop";
	json_object_set_member(pJsonObject, shopKey, node);
	if (isprimitive("bool")) {
		bool obj = getResolved();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *resolvedKey = "resolved";
	json_object_set_member(pJsonObject, resolvedKey, node);
	if (isprimitive("bool")) {
		bool obj = getVerified();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *verifiedKey = "verified";
	json_object_set_member(pJsonObject, verifiedKey, node);
	if (isprimitive("bool")) {
		bool obj = getRecommend();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *recommendKey = "recommend";
	json_object_set_member(pJsonObject, recommendKey, node);
	if (isprimitive("FeedbackGradesDTO")) {
		FeedbackGradesDTO obj = getGrades();
		node = converttoJson(&obj, "FeedbackGradesDTO", "");
	}
	else {
		
		FeedbackGradesDTO obj = static_cast<FeedbackGradesDTO> (getGrades());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gradesKey = "grades";
	json_object_set_member(pJsonObject, gradesKey, node);
	if (isprimitive("FeedbackOrderDTO")) {
		FeedbackOrderDTO obj = getOrder();
		node = converttoJson(&obj, "FeedbackOrderDTO", "");
	}
	else {
		
		FeedbackOrderDTO obj = static_cast<FeedbackOrderDTO> (getOrder());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orderKey = "order";
	json_object_set_member(pJsonObject, orderKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
FeedbackDTO::getId()
{
	return id;
}

void
FeedbackDTO::setId(long long  id)
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
FeedbackDTO::getResolved()
{
	return resolved;
}

void
FeedbackDTO::setResolved(bool  resolved)
{
	this->resolved = resolved;
}

bool
FeedbackDTO::getVerified()
{
	return verified;
}

void
FeedbackDTO::setVerified(bool  verified)
{
	this->verified = verified;
}

bool
FeedbackDTO::getRecommend()
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


