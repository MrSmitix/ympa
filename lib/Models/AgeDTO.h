
/*
 * AgeDTO.h
 *
 * Возраст в заданных единицах измерения.
 */

#ifndef TINY_CPP_CLIENT_AgeDTO_H_
#define TINY_CPP_CLIENT_AgeDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AgeUnitType.h"

namespace Tiny {


/*! \brief Возраст в заданных единицах измерения.
 *
 *  \ingroup Models
 *
 */

class AgeDTO{
public:

    /*! \brief Constructor.
	 */
    AgeDTO();
    AgeDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AgeDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Значение. 
	 */
	long getValue();

	/*! \brief Set Значение. 
	 */
	void setValue(long  value);
	/*! \brief Get 
	 */
	AgeUnitType getAgeUnit();

	/*! \brief Set 
	 */
	void setAgeUnit(AgeUnitType  ageUnit);


    private:
    long value{};
    AgeUnitType ageUnit;
};
}

#endif /* TINY_CPP_CLIENT_AgeDTO_H_ */
