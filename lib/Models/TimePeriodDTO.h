
/*
 * TimePeriodDTO.h
 *
 * Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
 */

#ifndef TINY_CPP_CLIENT_TimePeriodDTO_H_
#define TINY_CPP_CLIENT_TimePeriodDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TimeUnitType.h"

namespace Tiny {


/*! \brief Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
 *
 *  \ingroup Models
 *
 */

class TimePeriodDTO{
public:

    /*! \brief Constructor.
	 */
    TimePeriodDTO();
    TimePeriodDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TimePeriodDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Продолжительность в указанных единицах.
	 */
	int getTimePeriod();

	/*! \brief Set Продолжительность в указанных единицах.
	 */
	void setTimePeriod(int  timePeriod);
	/*! \brief Get 
	 */
	TimeUnitType getTimeUnit();

	/*! \brief Set 
	 */
	void setTimeUnit(TimeUnitType  timeUnit);
	/*! \brief Get Комментарий.
	 */
	std::string getComment();

	/*! \brief Set Комментарий.
	 */
	void setComment(std::string  comment);


    private:
    int timePeriod{};
    TimeUnitType timeUnit;
    std::string comment{};
};
}

#endif /* TINY_CPP_CLIENT_TimePeriodDTO_H_ */
