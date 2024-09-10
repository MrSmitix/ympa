
/*
 * PriceSuggestDTO.h
 *
 * Тип цены.
 */

#ifndef TINY_CPP_CLIENT_PriceSuggestDTO_H_
#define TINY_CPP_CLIENT_PriceSuggestDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PriceSuggestType.h"

namespace Tiny {


/*! \brief Тип цены.
 *
 *  \ingroup Models
 *
 */

class PriceSuggestDTO{
public:

    /*! \brief Constructor.
	 */
    PriceSuggestDTO();
    PriceSuggestDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PriceSuggestDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	PriceSuggestType getType();

	/*! \brief Set 
	 */
	void setType(PriceSuggestType  type);
	/*! \brief Get Цена в рублях.
	 */
	long getPrice();

	/*! \brief Set Цена в рублях.
	 */
	void setPrice(long  price);


    private:
    PriceSuggestType type;
    long price{};
};
}

#endif /* TINY_CPP_CLIENT_PriceSuggestDTO_H_ */
