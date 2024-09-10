

#include "OfferProcessingStateDTO.h"

using namespace Tiny;

OfferProcessingStateDTO::OfferProcessingStateDTO()
{
	status = OfferProcessingStatusType();
	notes = std::list<OfferProcessingNoteDTO>();
}

OfferProcessingStateDTO::OfferProcessingStateDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferProcessingStateDTO::~OfferProcessingStateDTO()
{

}

void
OfferProcessingStateDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        OfferProcessingStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *notesKey = "notes";

    if(object.has_key(notesKey))
    {
        bourne::json value = object[notesKey];


        std::list<OfferProcessingNoteDTO> notes_list;
        OfferProcessingNoteDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            notes_list.push_back(element);
        }
        notes = notes_list;


    }


}

bourne::json
OfferProcessingStateDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();




    std::list<OfferProcessingNoteDTO> notes_list = getNotes();
    bourne::json notes_arr = bourne::json::array();

    for(auto& var : notes_list)
    {
        OfferProcessingNoteDTO obj = var;
        notes_arr.append(obj.toJson());
    }
    object["notes"] = notes_arr;




    return object;

}

OfferProcessingStatusType
OfferProcessingStateDTO::getStatus()
{
	return status;
}

void
OfferProcessingStateDTO::setStatus(OfferProcessingStatusType  status)
{
	this->status = status;
}

std::list<OfferProcessingNoteDTO>
OfferProcessingStateDTO::getNotes()
{
	return notes;
}

void
OfferProcessingStateDTO::setNotes(std::list <OfferProcessingNoteDTO> notes)
{
	this->notes = notes;
}



