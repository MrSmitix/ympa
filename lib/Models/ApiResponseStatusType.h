
/*
 * ApiResponseStatusType.h
 *
 * Тип ответа.
 */

#ifndef TINY_CPP_CLIENT_ApiResponseStatusType_H_
#define TINY_CPP_CLIENT_ApiResponseStatusType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип ответа.
 *
 *  \ingroup Models
 *
 */

class ApiResponseStatusType{
public:

    /*! \brief Constructor.
	 */
    ApiResponseStatusType();
    ApiResponseStatusType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ApiResponseStatusType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ApiResponseStatusType_H_ */
