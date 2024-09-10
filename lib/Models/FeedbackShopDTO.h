
/*
 * FeedbackShopDTO.h
 *
 * Информация о магазине.
 */

#ifndef TINY_CPP_CLIENT_FeedbackShopDTO_H_
#define TINY_CPP_CLIENT_FeedbackShopDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о магазине.
 *
 *  \ingroup Models
 *
 */

class FeedbackShopDTO{
public:

    /*! \brief Constructor.
	 */
    FeedbackShopDTO();
    FeedbackShopDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedbackShopDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Название магазина.
	 */
	std::string getName();

	/*! \brief Set Название магазина.
	 */
	void setName(std::string  name);


    private:
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_FeedbackShopDTO_H_ */
