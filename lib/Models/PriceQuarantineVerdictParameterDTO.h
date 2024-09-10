
/*
 * PriceQuarantineVerdictParameterDTO.h
 *
 * Параметр карантина.
 */

#ifndef TINY_CPP_CLIENT_PriceQuarantineVerdictParameterDTO_H_
#define TINY_CPP_CLIENT_PriceQuarantineVerdictParameterDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PriceQuarantineVerdictParamNameType.h"

namespace Tiny {


/*! \brief Параметр карантина.
 *
 *  \ingroup Models
 *
 */

class PriceQuarantineVerdictParameterDTO{
public:

    /*! \brief Constructor.
	 */
    PriceQuarantineVerdictParameterDTO();
    PriceQuarantineVerdictParameterDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PriceQuarantineVerdictParameterDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	PriceQuarantineVerdictParamNameType getName();

	/*! \brief Set 
	 */
	void setName(PriceQuarantineVerdictParamNameType  name);
	/*! \brief Get Значение параметра.
	 */
	std::string getValue();

	/*! \brief Set Значение параметра.
	 */
	void setValue(std::string  value);


    private:
    PriceQuarantineVerdictParamNameType name;
    std::string value{};
};
}

#endif /* TINY_CPP_CLIENT_PriceQuarantineVerdictParameterDTO_H_ */
