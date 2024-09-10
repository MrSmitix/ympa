
/*
 * OutletWorkingScheduleItemDTO.h
 *
 * Расписание работы точки продаж.
 */

#ifndef TINY_CPP_CLIENT_OutletWorkingScheduleItemDTO_H_
#define TINY_CPP_CLIENT_OutletWorkingScheduleItemDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "DayOfWeekType.h"

namespace Tiny {


/*! \brief Расписание работы точки продаж.
 *
 *  \ingroup Models
 *
 */

class OutletWorkingScheduleItemDTO{
public:

    /*! \brief Constructor.
	 */
    OutletWorkingScheduleItemDTO();
    OutletWorkingScheduleItemDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OutletWorkingScheduleItemDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	DayOfWeekType getStartDay();

	/*! \brief Set 
	 */
	void setStartDay(DayOfWeekType  startDay);
	/*! \brief Get 
	 */
	DayOfWeekType getEndDay();

	/*! \brief Set 
	 */
	void setEndDay(DayOfWeekType  endDay);
	/*! \brief Get Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 
	 */
	std::string getStartTime();

	/*! \brief Set Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 
	 */
	void setStartTime(std::string  startTime);
	/*! \brief Get Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 
	 */
	std::string getEndTime();

	/*! \brief Set Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 
	 */
	void setEndTime(std::string  endTime);


    private:
    DayOfWeekType startDay;
    DayOfWeekType endDay;
    std::string startTime{};
    std::string endTime{};
};
}

#endif /* TINY_CPP_CLIENT_OutletWorkingScheduleItemDTO_H_ */
