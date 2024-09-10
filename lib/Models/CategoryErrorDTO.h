
/*
 * CategoryErrorDTO.h
 *
 * Текст ошибки.
 */

#ifndef TINY_CPP_CLIENT_CategoryErrorDTO_H_
#define TINY_CPP_CLIENT_CategoryErrorDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CategoryErrorType.h"

namespace Tiny {


/*! \brief Текст ошибки.
 *
 *  \ingroup Models
 *
 */

class CategoryErrorDTO{
public:

    /*! \brief Constructor.
	 */
    CategoryErrorDTO();
    CategoryErrorDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CategoryErrorDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор категории.
	 */
	long getCategoryId();

	/*! \brief Set Идентификатор категории.
	 */
	void setCategoryId(long  categoryId);
	/*! \brief Get 
	 */
	CategoryErrorType getType();

	/*! \brief Set 
	 */
	void setType(CategoryErrorType  type);


    private:
    long categoryId{};
    CategoryErrorType type;
};
}

#endif /* TINY_CPP_CLIENT_CategoryErrorDTO_H_ */
