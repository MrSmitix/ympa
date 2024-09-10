
/*
 * ParameterValueOptionDTO.h
 *
 * Значение характеристики.
 */

#ifndef TINY_CPP_CLIENT_ParameterValueOptionDTO_H_
#define TINY_CPP_CLIENT_ParameterValueOptionDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Значение характеристики.
 *
 *  \ingroup Models
 *
 */

class ParameterValueOptionDTO{
public:

    /*! \brief Constructor.
	 */
    ParameterValueOptionDTO();
    ParameterValueOptionDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ParameterValueOptionDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор значения.
	 */
	long getId();

	/*! \brief Set Идентификатор значения.
	 */
	void setId(long  id);
	/*! \brief Get Значение.
	 */
	std::string getValue();

	/*! \brief Set Значение.
	 */
	void setValue(std::string  value);
	/*! \brief Get Описание значения.
	 */
	std::string getDescription();

	/*! \brief Set Описание значения.
	 */
	void setDescription(std::string  description);


    private:
    long id{};
    std::string value{};
    std::string description{};
};
}

#endif /* TINY_CPP_CLIENT_ParameterValueOptionDTO_H_ */
