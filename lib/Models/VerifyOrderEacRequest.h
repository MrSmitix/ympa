
/*
 * VerifyOrderEacRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_VerifyOrderEacRequest_H_
#define TINY_CPP_CLIENT_VerifyOrderEacRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class VerifyOrderEacRequest{
public:

    /*! \brief Constructor.
	 */
    VerifyOrderEacRequest();
    VerifyOrderEacRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~VerifyOrderEacRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Код для подтверждения ЭАПП.
	 */
	std::string getCode();

	/*! \brief Set Код для подтверждения ЭАПП.
	 */
	void setCode(std::string  code);


    private:
    std::string code{};
};
}

#endif /* TINY_CPP_CLIENT_VerifyOrderEacRequest_H_ */
