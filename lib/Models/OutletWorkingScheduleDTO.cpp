

#include "OutletWorkingScheduleDTO.h"

using namespace Tiny;

OutletWorkingScheduleDTO::OutletWorkingScheduleDTO()
{
	workInHoliday = bool(false);
	scheduleItems = std::list<OutletWorkingScheduleItemDTO>();
}

OutletWorkingScheduleDTO::OutletWorkingScheduleDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OutletWorkingScheduleDTO::~OutletWorkingScheduleDTO()
{

}

void
OutletWorkingScheduleDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *workInHolidayKey = "workInHoliday";

    if(object.has_key(workInHolidayKey))
    {
        bourne::json value = object[workInHolidayKey];



        jsonToValue(&workInHoliday, value, "bool");


    }

    const char *scheduleItemsKey = "scheduleItems";

    if(object.has_key(scheduleItemsKey))
    {
        bourne::json value = object[scheduleItemsKey];


        std::list<OutletWorkingScheduleItemDTO> scheduleItems_list;
        OutletWorkingScheduleItemDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            scheduleItems_list.push_back(element);
        }
        scheduleItems = scheduleItems_list;


    }


}

bourne::json
OutletWorkingScheduleDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["workInHoliday"] = isWorkInHoliday();





    std::list<OutletWorkingScheduleItemDTO> scheduleItems_list = getScheduleItems();
    bourne::json scheduleItems_arr = bourne::json::array();

    for(auto& var : scheduleItems_list)
    {
        OutletWorkingScheduleItemDTO obj = var;
        scheduleItems_arr.append(obj.toJson());
    }
    object["scheduleItems"] = scheduleItems_arr;




    return object;

}

bool
OutletWorkingScheduleDTO::isWorkInHoliday()
{
	return workInHoliday;
}

void
OutletWorkingScheduleDTO::setWorkInHoliday(bool  workInHoliday)
{
	this->workInHoliday = workInHoliday;
}

std::list<OutletWorkingScheduleItemDTO>
OutletWorkingScheduleDTO::getScheduleItems()
{
	return scheduleItems;
}

void
OutletWorkingScheduleDTO::setScheduleItems(std::list <OutletWorkingScheduleItemDTO> scheduleItems)
{
	this->scheduleItems = scheduleItems;
}



