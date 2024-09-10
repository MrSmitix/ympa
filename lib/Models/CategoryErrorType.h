
/*
 * CategoryErrorType.h
 *
 * Типы ошибок:  * &#x60;UNKNOWN_CATEGORY&#x60; — указана неизвестная категория. * &#x60;CATEGORY_IS_NOT_LEAF&#x60; — указана нелистовая категория. Укажите ту, которая не имеет дочерних категорий. 
 */

#ifndef TINY_CPP_CLIENT_CategoryErrorType_H_
#define TINY_CPP_CLIENT_CategoryErrorType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Типы ошибок:  * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_IS_NOT_LEAF` — указана нелистовая категория. Укажите ту, которая не имеет дочерних категорий. 
 *
 *  \ingroup Models
 *
 */

class CategoryErrorType{
public:

    /*! \brief Constructor.
	 */
    CategoryErrorType();
    CategoryErrorType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CategoryErrorType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CategoryErrorType_H_ */
