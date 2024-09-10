/*
 * CategoryErrorDTO.h
 *
 * Текст ошибки.
 */

#ifndef _CategoryErrorDTO_H_
#define _CategoryErrorDTO_H_


#include <string>
#include "CategoryErrorType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Текст ошибки.
 *
 *  \ingroup Models
 *
 */

class CategoryErrorDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	CategoryErrorDTO();
	CategoryErrorDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CategoryErrorDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор категории.
	 */
	long long getCategoryId();

	/*! \brief Set Идентификатор категории.
	 */
	void setCategoryId(long long  categoryId);
	/*! \brief Get 
	 */
	CategoryErrorType getType();

	/*! \brief Set 
	 */
	void setType(CategoryErrorType  type);

private:
	long long categoryId;
	CategoryErrorType type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CategoryErrorDTO_H_ */
