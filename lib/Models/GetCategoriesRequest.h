
/*
 * GetCategoriesRequest.h
 *
 * Параметры запроса категорий. 
 */

#ifndef TINY_CPP_CLIENT_GetCategoriesRequest_H_
#define TINY_CPP_CLIENT_GetCategoriesRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LanguageType.h"

namespace Tiny {


/*! \brief Параметры запроса категорий. 
 *
 *  \ingroup Models
 *
 */

class GetCategoriesRequest{
public:

    /*! \brief Constructor.
	 */
    GetCategoriesRequest();
    GetCategoriesRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetCategoriesRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	LanguageType getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(LanguageType  language);


    private:
    LanguageType language;
};
}

#endif /* TINY_CPP_CLIENT_GetCategoriesRequest_H_ */
