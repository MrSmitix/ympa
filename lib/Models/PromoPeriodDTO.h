
/*
 * PromoPeriodDTO.h
 *
 * Время проведения акции.
 */

#ifndef TINY_CPP_CLIENT_PromoPeriodDTO_H_
#define TINY_CPP_CLIENT_PromoPeriodDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Время проведения акции.
 *
 *  \ingroup Models
 *
 */

class PromoPeriodDTO{
public:

    /*! \brief Constructor.
	 */
    PromoPeriodDTO();
    PromoPeriodDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PromoPeriodDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Дата и время начала акции.
	 */
	std::string getDateTimeFrom();

	/*! \brief Set Дата и время начала акции.
	 */
	void setDateTimeFrom(std::string  dateTimeFrom);
	/*! \brief Get Дата и время окончания акции.
	 */
	std::string getDateTimeTo();

	/*! \brief Set Дата и время окончания акции.
	 */
	void setDateTimeTo(std::string  dateTimeTo);


    private:
    std::string dateTimeFrom{};
    std::string dateTimeTo{};
};
}

#endif /* TINY_CPP_CLIENT_PromoPeriodDTO_H_ */
