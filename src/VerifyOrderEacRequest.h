/*
 * VerifyOrderEacRequest.h
 *
 * 
 */

#ifndef _VerifyOrderEacRequest_H_
#define _VerifyOrderEacRequest_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class VerifyOrderEacRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	VerifyOrderEacRequest();
	VerifyOrderEacRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VerifyOrderEacRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Код для подтверждения ЭАПП.
	 */
	std::string getCode();

	/*! \brief Set Код для подтверждения ЭАПП.
	 */
	void setCode(std::string  code);

private:
	std::string code;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VerifyOrderEacRequest_H_ */
