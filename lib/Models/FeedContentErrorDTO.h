
/*
 * FeedContentErrorDTO.h
 *
 * Информация об ошибке в содержимом прайс-листа. Выводится, если параметр &#x60;content status&#x3D;ERROR&#x60;. 
 */

#ifndef TINY_CPP_CLIENT_FeedContentErrorDTO_H_
#define TINY_CPP_CLIENT_FeedContentErrorDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FeedContentErrorType.h"

namespace Tiny {


/*! \brief Информация об ошибке в содержимом прайс-листа. Выводится, если параметр `content status=ERROR`. 
 *
 *  \ingroup Models
 *
 */

class FeedContentErrorDTO{
public:

    /*! \brief Constructor.
	 */
    FeedContentErrorDTO();
    FeedContentErrorDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedContentErrorDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	FeedContentErrorType getType();

	/*! \brief Set 
	 */
	void setType(FeedContentErrorType  type);


    private:
    FeedContentErrorType type;
};
}

#endif /* TINY_CPP_CLIENT_FeedContentErrorDTO_H_ */
