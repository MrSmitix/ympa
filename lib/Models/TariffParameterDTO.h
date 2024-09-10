
/*
 * TariffParameterDTO.h
 *
 * Детали расчета конкретной услуги Маркета.
 */

#ifndef TINY_CPP_CLIENT_TariffParameterDTO_H_
#define TINY_CPP_CLIENT_TariffParameterDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Детали расчета конкретной услуги Маркета.
 *
 *  \ingroup Models
 *
 */

class TariffParameterDTO{
public:

    /*! \brief Constructor.
	 */
    TariffParameterDTO();
    TariffParameterDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TariffParameterDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Название параметра.
	 */
	std::string getName();

	/*! \brief Set Название параметра.
	 */
	void setName(std::string  name);
	/*! \brief Get Значение параметра.
	 */
	std::string getValue();

	/*! \brief Set Значение параметра.
	 */
	void setValue(std::string  value);


    private:
    std::string name{};
    std::string value{};
};
}

#endif /* TINY_CPP_CLIENT_TariffParameterDTO_H_ */
