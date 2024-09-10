#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "OutletsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


OutletsManager::OutletsManager()
{

}

OutletsManager::~OutletsManager()
{

}

static gboolean __OutletsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __OutletsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__OutletsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool createOutletProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CreateOutletResponse, Error, void* )
	= reinterpret_cast<void(*)(CreateOutletResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CreateOutletResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CreateOutletResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CreateOutletResponse", "CreateOutletResponse");
			json_node_free(pJson);

			if ("CreateOutletResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool createOutletHelper(char * accessToken,
	long long campaignId, std::shared_ptr<ChangeOutletRequest> changeOutletRequest, 
	void(* handler)(CreateOutletResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("ChangeOutletRequest")) {
		node = converttoJson(&changeOutletRequest, "ChangeOutletRequest", "");
	}
	
	char *jsonStr =  changeOutletRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/outlets");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(OutletsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createOutletProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (OutletsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createOutletProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OutletsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OutletsManager::createOutletAsync(char * accessToken,
	long long campaignId, std::shared_ptr<ChangeOutletRequest> changeOutletRequest, 
	void(* handler)(CreateOutletResponse, Error, void* )
	, void* userData)
{
	return createOutletHelper(accessToken,
	campaignId, changeOutletRequest, 
	handler, userData, true);
}

bool OutletsManager::createOutletSync(char * accessToken,
	long long campaignId, std::shared_ptr<ChangeOutletRequest> changeOutletRequest, 
	void(* handler)(CreateOutletResponse, Error, void* )
	, void* userData)
{
	return createOutletHelper(accessToken,
	campaignId, changeOutletRequest, 
	handler, userData, false);
}

static bool deleteOutletProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(EmptyApiResponse, Error, void* )
	= reinterpret_cast<void(*)(EmptyApiResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	EmptyApiResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("EmptyApiResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "EmptyApiResponse", "EmptyApiResponse");
			json_node_free(pJson);

			if ("EmptyApiResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool deleteOutletHelper(char * accessToken,
	long long campaignId, long long outletId, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns/{campaignId}/outlets/{outletId}");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_outletId("{");
	s_outletId.append("outletId");
	s_outletId.append("}");
	pos = url.find(s_outletId);
	url.erase(pos, s_outletId.length());
	url.insert(pos, stringify(&outletId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("DELETE");

	if(strcmp("PUT", "DELETE") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(OutletsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteOutletProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (OutletsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteOutletProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OutletsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OutletsManager::deleteOutletAsync(char * accessToken,
	long long campaignId, long long outletId, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return deleteOutletHelper(accessToken,
	campaignId, outletId, 
	handler, userData, true);
}

bool OutletsManager::deleteOutletSync(char * accessToken,
	long long campaignId, long long outletId, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return deleteOutletHelper(accessToken,
	campaignId, outletId, 
	handler, userData, false);
}

static bool getOutletProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetOutletResponse, Error, void* )
	= reinterpret_cast<void(*)(GetOutletResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetOutletResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetOutletResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetOutletResponse", "GetOutletResponse");
			json_node_free(pJson);

			if ("GetOutletResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getOutletHelper(char * accessToken,
	long long campaignId, long long outletId, 
	void(* handler)(GetOutletResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns/{campaignId}/outlets/{outletId}");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_outletId("{");
	s_outletId.append("outletId");
	s_outletId.append("}");
	pos = url.find(s_outletId);
	url.erase(pos, s_outletId.length());
	url.insert(pos, stringify(&outletId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(OutletsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOutletProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (OutletsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOutletProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OutletsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OutletsManager::getOutletAsync(char * accessToken,
	long long campaignId, long long outletId, 
	void(* handler)(GetOutletResponse, Error, void* )
	, void* userData)
{
	return getOutletHelper(accessToken,
	campaignId, outletId, 
	handler, userData, true);
}

bool OutletsManager::getOutletSync(char * accessToken,
	long long campaignId, long long outletId, 
	void(* handler)(GetOutletResponse, Error, void* )
	, void* userData)
{
	return getOutletHelper(accessToken,
	campaignId, outletId, 
	handler, userData, false);
}

static bool getOutletsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetOutletsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetOutletsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetOutletsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetOutletsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetOutletsResponse", "GetOutletsResponse");
			json_node_free(pJson);

			if ("GetOutletsResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getOutletsHelper(char * accessToken,
	long long campaignId, std::string pageToken, long long regionId, std::string shopOutletCode, long long regionId2, 
	void(* handler)(GetOutletsResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&pageToken, "std::string");
	queryParams.insert(pair<string, string>("page_token", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page_token");
	}


	itemAtq = stringify(&regionId, "long long");
	queryParams.insert(pair<string, string>("region_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("region_id");
	}


	itemAtq = stringify(&shopOutletCode, "std::string");
	queryParams.insert(pair<string, string>("shop_outlet_code", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("shop_outlet_code");
	}


	itemAtq = stringify(&regionId2, "long long");
	queryParams.insert(pair<string, string>("regionId", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("regionId");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns/{campaignId}/outlets");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(OutletsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOutletsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (OutletsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOutletsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OutletsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OutletsManager::getOutletsAsync(char * accessToken,
	long long campaignId, std::string pageToken, long long regionId, std::string shopOutletCode, long long regionId2, 
	void(* handler)(GetOutletsResponse, Error, void* )
	, void* userData)
{
	return getOutletsHelper(accessToken,
	campaignId, pageToken, regionId, shopOutletCode, regionId2, 
	handler, userData, true);
}

bool OutletsManager::getOutletsSync(char * accessToken,
	long long campaignId, std::string pageToken, long long regionId, std::string shopOutletCode, long long regionId2, 
	void(* handler)(GetOutletsResponse, Error, void* )
	, void* userData)
{
	return getOutletsHelper(accessToken,
	campaignId, pageToken, regionId, shopOutletCode, regionId2, 
	handler, userData, false);
}

static bool updateOutletProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(EmptyApiResponse, Error, void* )
	= reinterpret_cast<void(*)(EmptyApiResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	EmptyApiResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("EmptyApiResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "EmptyApiResponse", "EmptyApiResponse");
			json_node_free(pJson);

			if ("EmptyApiResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool updateOutletHelper(char * accessToken,
	long long campaignId, long long outletId, std::shared_ptr<ChangeOutletRequest> changeOutletRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("ChangeOutletRequest")) {
		node = converttoJson(&changeOutletRequest, "ChangeOutletRequest", "");
	}
	
	char *jsonStr =  changeOutletRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/outlets/{outletId}");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_outletId("{");
	s_outletId.append("outletId");
	s_outletId.append("}");
	pos = url.find(s_outletId);
	url.erase(pos, s_outletId.length());
	url.insert(pos, stringify(&outletId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(OutletsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateOutletProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (OutletsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateOutletProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OutletsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OutletsManager::updateOutletAsync(char * accessToken,
	long long campaignId, long long outletId, std::shared_ptr<ChangeOutletRequest> changeOutletRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updateOutletHelper(accessToken,
	campaignId, outletId, changeOutletRequest, 
	handler, userData, true);
}

bool OutletsManager::updateOutletSync(char * accessToken,
	long long campaignId, long long outletId, std::shared_ptr<ChangeOutletRequest> changeOutletRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updateOutletHelper(accessToken,
	campaignId, outletId, changeOutletRequest, 
	handler, userData, false);
}

