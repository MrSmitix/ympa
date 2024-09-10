
/*
 * ParameterValueConstraintsDTO.h
 *
 * Ограничения на значения характеристик.
 */

#ifndef TINY_CPP_CLIENT_ParameterValueConstraintsDTO_H_
#define TINY_CPP_CLIENT_ParameterValueConstraintsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Ограничения на значения характеристик.
 *
 *  \ingroup Models
 *
 */

class ParameterValueConstraintsDTO{
public:

    /*! \brief Constructor.
	 */
    ParameterValueConstraintsDTO();
    ParameterValueConstraintsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ParameterValueConstraintsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Минимальное число.
	 */
	double getMinValue();

	/*! \brief Set Минимальное число.
	 */
	void setMinValue(double  minValue);
	/*! \brief Get Максимальное число.
	 */
	double getMaxValue();

	/*! \brief Set Максимальное число.
	 */
	void setMaxValue(double  maxValue);
	/*! \brief Get Максимальная длина текста.
	 */
	int getMaxLength();

	/*! \brief Set Максимальная длина текста.
	 */
	void setMaxLength(int  maxLength);


    private:
    double minValue{};
    double maxValue{};
    int maxLength{};
};
}

#endif /* TINY_CPP_CLIENT_ParameterValueConstraintsDTO_H_ */
