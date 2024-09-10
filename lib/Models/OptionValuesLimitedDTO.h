
/*
 * OptionValuesLimitedDTO.h
 *
 * Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
 */

#ifndef TINY_CPP_CLIENT_OptionValuesLimitedDTO_H_
#define TINY_CPP_CLIENT_OptionValuesLimitedDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
 *
 *  \ingroup Models
 *
 */

class OptionValuesLimitedDTO{
public:

    /*! \brief Constructor.
	 */
    OptionValuesLimitedDTO();
    OptionValuesLimitedDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OptionValuesLimitedDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор значения ограничивающей характеристики.
	 */
	long getLimitingOptionValueId();

	/*! \brief Set Идентификатор значения ограничивающей характеристики.
	 */
	void setLimitingOptionValueId(long  limitingOptionValueId);
	/*! \brief Get Идентификаторы допустимых значений ограничиваемой характеристики. 
	 */
	std::list<long> getOptionValueIds();

	/*! \brief Set Идентификаторы допустимых значений ограничиваемой характеристики. 
	 */
	void setOptionValueIds(std::list <long> optionValueIds);


    private:
    long limitingOptionValueId{};
    std::list<long> optionValueIds;
};
}

#endif /* TINY_CPP_CLIENT_OptionValuesLimitedDTO_H_ */
